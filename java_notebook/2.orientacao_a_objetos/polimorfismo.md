# Polimorfismo

---

*   **Conceito de Polimorfismo:**
    *   Consiste no ato de um determinado método executar diferentes ações dependendo de como for chamado, e graças à sua hierarquia.
*   **Herança e Modificador `final`:**
    *   Quando uma subclasse herda um método da superclasse, este método pode ter seu comportamento alterado na subclasse, desde que não tenha sido declarado como `final` na superclasse, sendo assim definido o polimorfismo dinâmico.
*   **Sobrecarga:**
    *   Consiste quando um mesmo método é definido na class, porém com assinaturas e parâmetros diferentes, cujo serão oque definira ao método ser chamado, qual será executado, sendo assim definido o polimorfismo estático.
* **Exemplo Prático (Animal):**
    *   Uma superclasse `Animal` possui o método `fazerBarulho()`, que pode, por exemplo, ser uma classe abstrata que não possui implementação, que é um caso comumente visto no uso de polimorfismo.
    *   Suas subclasses `Cachorro` e `Gato` definem esse comportamento de maneira diferente, executando respectivamente `print("AuAu!")` e `print("Miau!")`.
*   **Sobrescrita (Override):**
    *   Um método na subclasse que possui o mesmo nome (e mesma assinatura) que na superclasse assume o papel de polimórfico, sobrescrevendo o método original.
*   **Uso da palavra-chave `super`:**
    *   Para referenciar ou invocar membros (atributos e métodos) diretamente da superclasse, utiliza-se a palavra-chave `super`.
    *   O cenário mais comum e recomendado é invocar o comportamento herdado da superclasse via `super.metodo()` e, em seguida, complementar a execução com lógicas exclusivas da subclasse.
    *   Também é possível acessar membros que foram sobrescritos utilizando o `super`, embora esse acesso direto de fora da classe não seja o fluxo comum de polimorfismo.

---