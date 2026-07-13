# Hierarquia e Herança

---

*   **Herança:**
    *   Uma classe filha (ou subclasse) herda membros (atributos e métodos) da classe pai (ou superclasse).
    *   Uma classe filha, independente do *package* em que está, herda todos os membros `public` e `protected` da classe pai. Se estiver no mesmo *package*, herda também os membros com modificador de acesso padrão ( *package-private* ).
    *   Membros específicos da classe pai podem ser acessados ou invocados a partir da palavra-chave `super`.
    *   Todas as classes derivam da classe mais geral do Java, a `Object`. Existe uma cadeia de herança em que uma classe herda de outra, que herda de outra, sucessivamente.
*   **Casting na Hierarquia:**
    *   **Upcasting:** Consiste em tratar um objeto de uma classe filha como se fosse de sua classe pai. Isso permite usar apenas os métodos genéricos da superclasse. Esse processo é natural e implícito, já que "toda classe filha também é uma classe pai".
    *   **Downcasting:** É o método forçado em que você instrui o compilador a confiar que um objeto referenciado pela classe pai é, na verdade, do tipo da classe filha desejada. Isso libera o uso de membros específicos da subclasse. Contudo, se o objeto real não for daquele tipo em tempo de execução, ocorrerá uma `ClassCastException`. Antes de realizar DownCastings, é recomendado que utilize o operador `instanceof` para verificar se de fato ele pertence aquela classe, evitando assim a `ClassCastException`.
*   **Polimorfismo e Sobrescrita:**
    *   É possível sobrescrever (*override*) métodos apenas definindo-os na classe filha com a mesma assinatura (nome e parâmetros) e alterando a sua implementação/ação.
*   **Herança Múltipla vs. Interfaces:**
    *   Como a herança permite definir tanto o comportamento (métodos com implementação) quanto o estado (valores/atributos), o Java **não permite herança múltipla de classes**. Se permitisse, o compilador entraria em conflito sobre qual membro herdar (problema do diamante).
    *   Isso não acontece com **Interfaces**, pois elas definem apenas os cabeçalhos (assinaturas dos métodos) e não as ações em si (comportamento), evitando ambiguidades.

---