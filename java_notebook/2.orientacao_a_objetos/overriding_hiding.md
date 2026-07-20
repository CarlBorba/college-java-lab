# Overriding vs. Hiding Methods

---

*   **Diferença por Modificador (`static`):**
    *   Um método pode ser sobrescrito (*overridden*) ou escondido (*hidden*) dependendo se ele é definido como `static` ou não na hierarquia de classes.
    *   Métodos `static` pertencem à classe e podem ser chamados sem a necessidade de instanciar um objeto. Já os métodos não estáticos (de instância) só podem ser utilizados a partir de uma referência de objeto.
*   **Comportamento com Métodos Estáticos (*Method Hiding*):**
    *   Se uma subclasse define um método estático com a mesma assinatura de um método estático da superclasse, o método da superclasse é **escondido** (*hidden*), e não sobrescrito.
    *   O método estático que será executado depende estritamente do **tipo da referência** (da classe declarada) usada para fazer a chamada, e não do objeto real em memória.
*   **Comportamento com Métodos de Instância (*Method Overriding*):**
    *   Ao instanciar um objeto da subclasse `Gato` (que estende `Animal`) e chamar o método de instância `fazerBarulho()`, você acessa o método da subclasse.

---

### 📊 Tabela Comparativa Prática

| Tipo de Método | Mecanismo | O que define qual método roda? |
| :--- | :--- | :--- |
| **Não estático** (Instância) | **Overriding** (Sobrescrita) | O tipo do **Objeto real** em memória (Tempo de execução). |
| **Estático** (`static`) | **Hiding** (Ocultação) | O tipo da **Referência da variável** (Tempo de compilação). |

### 🔍 Exemplo Prático

```java
class Animal {
    public static void classeInfo() { System.out.println("Animal Estático"); }
    public void fazerBarulho() { System.out.println("Barulho de Animal"); }
}

class Gato extends Animal {
    public static void classeInfo() { System.out.println("Gato Estático"); }
    @Override
    public void fazerBarulho() { System.out.println("Miau"); }
}
```

Ao executar o teste de polimorfismo:

```java
Animal meuPet = new Gato(); // Referência é Animal, mas o Objeto é Gato

// 1. Método de Instância (Overriding): Roda o do OBJETO REAL (Gato)
meuPet.fazerBarulho(); // Saída: "Miau"

// 2. Método Estático (Hiding): Roda o da REFERÊNCIA DECLARADA (Animal)
meuPet.classeInfo();   // Saída: "Animal Estático"
```

> 💡 **Dica de Ouro:** Métodos estáticos não sofrem polimorfismo porque eles pertencem à classe, e não ao objeto. Por isso, para evitar confusões de *Hiding*, sempre chame métodos estáticos usando o nome da classe diretamente (ex: `Animal.classeInfo()` ou `Gato.classeInfo()`), em vez de usar variáveis de referência.

---

## Regras de Resolução em Interface Methods

*   **Prioridade entre Classes e Interfaces (*"Class wins over Interface"*):**
    *   Quando uma classe estende uma superclasse e também implementa interfaces, e ambas possuem métodos com a mesma assinatura (sendo os da interface do tipo `default`), a prioridade total será dos **métodos de instância** da superclasse estendida.
*   **A Regra da Subinterface Mais Específica:**
    *   Métodos que já foram sobrescritos anteriormente por subinterfaces na árvore de herança farão com que o método original (da interface ancestral) seja ignorado. Isso costuma acontecer em estruturas onde as interfaces possuem um ancestral em comum (herança em diamante). O Java sempre escolherá a versão implementada mais específica/recente na hierarquia.
*   **Conflitos de Empate Absoluto e Resolução Manual:**
    *   Se uma classe implementa duas interfaces totalmente independentes que possuem um método com a mesma assinatura, ocorre um conflito. Para utilizá-lo e compilar o código, o programador deve obrigatoriamente **sobrescrever** o método na classe filha.
    *   Dentro dessa sobrescrita, se desejar reaproveitar o comportamento de uma das interfaces específicas, deve-se usar a sintaxe da palavra-chave `super` precedida pelo nome da interface desejada.
*   **Métodos Abstratos vs. Defaults**
    *   Métodos de instância da classe também ganham de métodos **abstratos** de interfaces. Se uma interface declara apenas o cabeçalho (`void andar();`) e a superclasse já tem esse método implementado, a classe filha não é obrigada a implementar nada, pois a implementação da superclasse "satisfaz" o contrato da interface.