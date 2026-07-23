# Implementando Interfaces, Métodos Default e Estáticos

*   **Sintaxe Básica:**
    *   Para implementar uma interface em uma classe, utiliza-se a palavra-chave `implements` na assinatura da classe.
*   **Parâmetros do Tipo da Interface e Downcasting:**
    *   Ao criar um método na interface que precisa receber um objeto da própria classe que a implementará, define-se o parâmetro com o tipo da **própria interface**, pois não se sabe qual classe específica o implementará.
    *   Na implementação do método dentro da classe concreta, realiza-se um *downcasting* do objeto recebido para a classe específica, permitindo acessar seus métodos próprios.
    *   *Forma Moderna:* Esta é a abordagem clássica; no Java moderno, utiliza-se **Generics** para evitar a necessidade desses *casts* manuais.
*   **Evolução de Interfaces e Compatibilidade:**
    *   Ao adicionar novos métodos abstratos a uma interface existente, todas as classes antigas que a implementavam param de compilar por violarem o novo contrato.
    *   *Solução 1:* Criar uma nova interface que estende a antiga adicionando os novos métodos. Assim, quem não precisa da nova funcionalidade mantém a interface antiga sem quebrar seu código.
    *   *Solução 2:* Definir os novos métodos como `default` ou `static`. Como eles possuem implementação, não são de implementação obrigatória, mantendo as classes antigas funcionando sem alterações (retrocompatibilidade).
*   **Métodos Default:**
    *   São definidos com a palavra-chave `default` no início da assinatura do método dentro da interface.
    *   Permitem adicionar novas funcionalidades a uma interface sem forçar a modificação de todas as classes que já a implementavam.
    *   Lógica de implementação genérica: Como o método `default` é herdado automaticamente por qualquer classe antiga, sua implementação na interface deve ser genérica e baseada apenas em outros métodos declarados na própria interface.
    *   Opções ao implementar uma interface com métodos `default`:
        1. **Herdar diretamente:** Não redeclarar nem redefinir; o método é herdado com a implementação padrão.
        2. **Redeclarar o método (torná-lo abstrato):** Remove a palavra `default` e não fornece corpo, o que obriga as subclasses a implementarem o método.
        3. **Redefinir (Sobrescrever):** Fornecer uma nova implementação específica na classe.
    *  **Múltipla Herança e Conflitos de Métodos Default:**
       *   Se uma classe implementar duas interfaces independentes que possuem métodos `default` com a exata mesma assinatura, o compilador exigirá que você sobrescreva o método na classe filha para resolver o conflito (pode-se usar `InterfaceA.super.metodo()` se desejar reaproveitar uma das lógicas).
*   **Métodos Estáticos em Interfaces:**
    *   Definidos com a palavra-chave `static`.
    *   Assim como em classes, podem ser chamados diretamente pela interface, sem necessidade de instanciar um objeto.
    *   São comumente usados como métodos utilitários/auxiliares relacionados às operações da própria interface.
    *   Não são herdados pelas classes que implementam a interface (são invocados diretamente via `NomeDaInterface.metodo()`) e não precisam/podem ser sobrescritos como membros de instância.