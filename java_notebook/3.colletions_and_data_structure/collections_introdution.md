# Storing Data Using the Collections Framework

*   **O que é o Java Collections Framework (JCF):**
    *   É um conjunto de interfaces e suas respectivas implementações responsáveis por definir os contratos das Estruturas de Dados Puras no Java.
    *   Fornece algoritmos e estruturas de dados amplamente estudados e utilizados no mercado, já prontos e otimizados na linguagem.
*   **Escolha da Implementação:**
    *   A escolha de qual implementação utilizar depende diretamente do caso de uso do sistema: os requisitos de performance, necessidade de ordenação, tratamento de elementos duplicados, forma de acesso aos dados, entre outros.
*   **Principais Categorias de Interfaces:**
    *   **Collections:** Utilizadas para armazenar e iterar sobre conjuntos/coleções de elementos/objetos.
    *   **Maps:** Utilizados para armazenar dados no formato Chave-Valor, onde cada objeto valor é associado e identificado por uma chave única.
*   **Diferenciação Hierárquica (`Collection` vs `Map`):**
    *   `Collection` é uma interface raiz (da qual `List`, `Set` e `Queue` herdam), enquanto `Map` **não** herda da interface `Collection`. Elas são duas árvores de hierarquia totalmente separadas dentro da API.
*   **Trade-offs de Performance (Notação Big-O):**
    *   Ao escolher entre as implementações (ex: `ArrayList` vs `LinkedList` ou `HashSet` vs `TreeSet`), a decisão foca principalmente em tempo de busca ($O(1)$ vs $O(n)$) e custo de inserção/remoção.
*   **Algoritmos Utilitários Nativos:**
    *   Além das estruturas de dados, o framework também disponibiliza a classe utilitária `Collections` (no plural), que contém métodos estáticos para ordenação (`Collections.sort()`), busca binária (`Collections.binarySearch()`), inversão de listas e criação de coleções imutáveis.