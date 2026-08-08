## 2. Especificação de Requisito: Módulo de Estoque e Pedidos (Estilo Mercado)

**Ticket:** `#BACK-1042`  
**Título:** Implementação do Núcleo de Gerenciamento de Estoque e Processamento de Pedidos  
**Prioridade:** Alta  
**Contexto:** Precisamos de um serviço interno em memória para processar os pedidos dos clientes, controlar a disponibilidade do catálogo e manter métricas de vendas, garantindo alta performance de leitura e integridade concorrente no controle de saldo de produtos.

---

## 🎯 Histórias de Usuário & Requisitos Funcionais

### **RF-01: Gestão de Catálogo de Produtos**
* O sistema deve permitir o cadastro e a consulta rápida de produtos através de seu identificador único (`String id`).
* O sistema deve manter uma listagem sem duplicatas de todas as categorias cadastradas.
* O sistema deve ser capaz de retornar o produto de maior valor do catálogo.

### **RF-02: Controle de Saldo de Estoque**
* O sistema deve associar o ID de cada produto à sua quantidade disponível em estoque.
* Ao receber uma nova remessa ou ajustar o estoque, o saldo deve ser incrementado.
* Ao processar um pedido, o sistema deve verificar a disponibilidade e debitar a quantidade vendida. Caso o estoque seja zerado, a chave do produto deve ser tratada adequadamente.

### **RF-03: Processamento e Histórico de Pedidos**
* Um pedido é composto por um identificador, uma lista de itens (produto + quantidade), a data/hora de criação e o status.
* O sistema deve registrar os pedidos efetuados mantendo a ordem cronológica de criação.
* O sistema deve disponibilizar um relatório dos últimos pedidos processados e permitir a ordenação do histórico conforme a necessidade do cliente.

---

## 📐 Requisitos Técnicos (Critérios de Aceite)

1. **Modelagem & Integridade de Dados:**
    * Garantir que as entidades de domínio sobrescrevam `equals()` e `hashCode()` usando identificadores únicos para evitar comportamentos inesperados ao usar coleções baseadas em hash.
    * Proteger as listas expostas por objetos do domínio contra modificações externas indevidas.


2. **Uso Eficiente das Estruturas do Java:**
    * **Busca O(1):** A consulta do catálogo e o saldo de estoque devem utilizar mapeamentos por chave-valor.
    * **Invariabilidade de Chaves:** Não utilizar objetos mutáveis que alterem seu estado após a inserção em estruturas de busca por identificador.
    * **Operações Atômicas de Atualização:** As baixas e incrementos de estoque devem priorizar métodos funcionais/lambdas da API de coleções para evitar chamadas redundantes de verificação manual de presença.
    * **Sem Duplicatas:** O controle de categorias deve ser estritamente garantido pela estrutura escolhida, sem depender de loops manuais para validação.


3. **Demonstrador / Runner (CLI):**
    * Criar uma classe executável que simule o fluxo completo:
        1. Carga inicial de catálogo e estoque.
        2. Simulação bem-sucedida de criação de pedido com baixa de estoque.
        3. Simulação de falha por estoque insuficiente.
        4. Exibição dos relatórios de catálogo, ranking de preços e estoque atualizado.
# 


# 
# 


# 
# 


# 

    ecommerce-stock-management/
    ├── src/
    │   └── main/
    │       └── java/
    │           └── com/
    │               └── ecommerce/
    │                   │
    │                   ├── model/                       # Classes de Domínio (Entidades/Dados)
    │                   │   ├── Produto.java             # ID, nome, preço, categoria (com equals/hashCode)
    │                   │   ├── ItemPedido.java          # Produto + quantidade
    │                   │   ├── Pedido.java              # ID, Lista de ItemPedido, dataCriacao, status
    │                   │   └── StatusPedido.java        # Enum (PENDENTE, PROCESSADO, CANCELADO)
    │                   │
    │                   ├── repository/                  # Armazenamento em Memória (Estruturas de Dados)
    │                   │   ├── CatalogoRepository.java  # Gerencia Map<String, Produto> e Set<String> (categorias)
    │                   │   ├── EstoqueRepository.java   # Gerencia Map<String, Integer> (controle de saldo)
    │                   │   └── PedidoRepository.java    # Gerencia List<Pedido> e NavigableSet<Produto> (rankings)
    │                   │
    │                   ├── service/                     # Regras de Negócio e Operações
    │                   │   ├── CatalogoService.java     # Cadastro e consultas de produtos/categorias
    │                   │   ├── EstoqueService.java      # Baixas/entradas usando compute/merge
    │                   │   └── PedidoService.java       # Processamento de pedidos, histórico e relatórios
    │                   │
    │                   └── Main.java                    # Ponto de entrada (CLI/Menu interativo para testes)
    │
    └── README.md                                        # Documentação e explicações do projeto
