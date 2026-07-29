# Iterating over the Elements of a Collection

*   **Formas de Iteração:**
    *   **For-each loop:** É a maneira mais fácil e direta de iterar sobre uma `Collection`. Extremamente eficaz quando o objetivo é apenas ler os elementos.
    *   **Iterator:** Objeto obtido a partir de qualquer classe que implemente a interface `Iterable` (superinterface de `Collection`).
*   **Processo de Iteração com `Iterator` (Duas Etapas):**
    *   `hasNext()`: Verifica se ainda existe um próximo elemento na coleção (retorna booleano).
    *   `next()`: Avança o cursor para o próximo elemento e o retorna.
    *   *Atenção:* Chamar `next()` quando não há mais elementos disponíveis lança a exceção `NoSuchElementException`.
*   **Sintaxe Segura de Iteração com Loop `for` e `Iterator`:**
    ```java
    Collection<String> strings = List.of("one", "two", "three", "four");

    for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
        String element = iterator.next();
        if (element.length() == 3) {
            IO.println(element);
        }
    }
    ```
    *   `Iterator<String> iterator = strings.iterator();`: Cria o iterador e posiciona o cursor antes do primeiro elemento (executado uma única vez no início).
    *   `iterator.hasNext();`: Condição de parada verificada a cada volta.
    *   `;`: A parte de incremento no `for` fica vazia, pois o avanço do cursor ocorre manualmente dentro do bloco com o `iterator.next()`.
    *   *Vantagem do `Iterator`:* Permite utilizar o método `iterator.remove()` de forma segura para remover elementos durante a iteração (o que causaria `ConcurrentModificationException` no for-each comum).
 

* **Customização de Iteração Criando Iteráveis Próprios:**
    *   Para tornar uma classe customizada iterável, implementa-se a interface `Iterable<T>`.
    *   É obrigatório sobrescrever o método `iterator()`, que retorna a instância do `Iterator` responsável pelo "cursor".
    *   Na implementação interna do `Iterator`, definem-se os métodos `hasNext()` (condição de parada) e `next()` (lógica de avanço).
    *   `next()` deve obrigatoriamente lançar `NoSuchElementException` quando `hasNext()` for `false`.

---

## 🛠️ Exemplo de Implementação: Classe `Range` Customizada

Exemplo prático da criação de uma estrutura customizada `Range` que implementa `Iterable<Integer>`, permitindo iterar sobre uma sequência numérica (ex: de 1 a 5) em um loop *for-each*:

```java
import java.util.Iterator;
import java.util.NoSuchElementException;

// Implementa Iterable para permitir o uso em loops for-each
public class Range implements Iterable<Integer> {
    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        // Retorna uma implementação anônima de Iterator
        return new Iterator<Integer>() {
            private int current = start;

            @Override
            public boolean hasNext() {
                // O loop continua enquanto o valor atual não ultrapassar o valor final
                return current <= end;
            }

            @Override
            public Integer next() {
                // Validação de segurança: lança exceção se tentar avançar além do limite
                if (!hasNext()) {
                    throw new NoSuchElementException("Não há mais elementos no Range.");
                }
                // Retorna o valor atual e incrementa o cursor para o próximo passo
                return current++;
            }
        };
    }

    public static void main(String[] args) {
        // Uso prático da classe Range customizada no for-each
        Range intervalo = new Range(1, 5);

        for (int numero : intervalo) {
            System.out.println(numero); // Imprime 1, 2, 3, 4, 5
        }
    }
}
```