# Object as a Superclass

*   **Visão Geral:**
    *   Esta seção discute sobre alguns métodos que são herdados da classe `Object` (a classe ancestral de todas as outras no Java).
*   **`toString()`:**
    *   É um método utilizado para criar uma representação do objeto em formato de texto (`String`). Ao imprimir um objeto, o método `.toString()` é chamado e exibirá a mensagem personalizada que foi sobrescrita na classe.
*   **`equals()`:**
    *   É um método utilizado para verificar se dois objetos contêm as mesmas informações (se são logicamente iguais). É possível sobrescrevê-lo para definir regras de igualdade baseadas em atributos específicos.
    *   O operador `==` compara as **referências de memória** (se ambas as variáveis apontam para o exato mesmo objeto). Já o método `equals()` compara o **conteúdo/estado** do objeto (desde que tenha sido sobrescrito).
*   **`hashCode()`:**
    *   Retorna o código hash (um valor numérico) de um objeto. Objetos que são considerados iguais pelo método `equals()` devem obrigatoriamente retornar `hashCode` iguais. Portanto, ao sobrescrever o `equals()`, o `hashCode()` também deve ser sobrescrito para manter esse contrato.
*   **`getClass()`:**
    *   Retorna um objeto da classe `Class`, permitindo acessar metadados da estrutura da classe em tempo de execução através do mecanismo de Reflection. Exemplos de métodos da classe `Class`: `getSimpleName()`, `getSuperclass()`, `getInterfaces()`, `isAnnotation()`, `isInterface()`, `getFields()`, etc. Este método é marcado como `final` e **não pode ser sobrescrito**.
*   **`clone()`:**
    *   Utilizado para clonar um objeto, ou seja, criar uma nova instância da mesma classe com os mesmos valores de atributos. Para poder utilizar este método sem lançar uma exceção (`CloneNotSupportedException`), a classe deve implementar a interface *marker* `Cloneable`.
    *   O método `clone()` e a interface `Cloneable` são considerados designs problemáticos no Java moderno. Uma alternativa amplamente recomendada no mercado e na documentação é usar **Construtores de Cópia** (ex: `public Pessoa(Pessoa outra)`) ou métodos utilitários estáticos para duplicar objetos.
---