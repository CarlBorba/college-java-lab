# Storing Elements in a Collection

*   **Manipulação de Elementos Individuais (`add`, `remove`, `contains`):**
    *   `add(element)`: Adiciona um elemento à `Collection`. Retorna um booleano (`true` se obteve êxito, `false` em caso de falha). Caso a falha resulte em exceção, pode lançar:
        *   `UnsupportedOperationException`: Se a implementação não for modificável (imutável).
        *   `NullPointerException`: Caso a coleção não aceite valores `null`.
        *   `ClassCastException`: Se o objeto inserido for do tipo incorreto/incompatível.
        *   `IllegalArgumentException`: Se o objeto for rejeitado por suas propriedades intrínsecas.
    *   `remove(element)`: Remove determinado elemento da `Collection`. Também retorna um booleano dependendo do êxito da ação.
    *   `contains(element)`: Verifica se determinado elemento está presente na `Collection`.
*   **Operações em Lote com Subcoleções:**
    *   `containsAll()`: Verifica se a coleção contém todos os elementos de uma subcoleção. Pode lançar `ClassCastException` (se o tipo do elemento for incompatível) ou `NullPointerException` (se a subcoleção for `null` ou contiver elementos `null` não permitidos).
    *   `addAll()`: Adiciona todos os elementos de uma subcoleção à coleção. Retorna `true` se pelo menos um elemento for adicionado com sucesso.
    *   `removeAll()`: Remove da coleção todos os elementos que estão presentes na subcoleção especificada.
    *   `retainAll()`: Mantém na coleção apenas os elementos que formam a interseção entre ela e a subcoleção especificada (remove tudo o que não estiver na subcoleção).
*   **Inspeção e Limpeza da Estrutura:**
    *   `size()`: Retorna um `int` representando o número total de elementos contidos na `Collection`.
    *   `isEmpty()`: Retorna `true` se a `Collection` estiver vazia (sem elementos).
    *   `clear()`: Remove e deleta todos os elementos de uma coleção de uma só vez.
*   **Conversão para Array (`toArray`):**
    *   `toArray()`: Retorna um array genérico de objetos (`Object[]`) contendo todos os elementos.
    *   `toArray(T[] a)`: Retorna um array tipado (`T[]`) utilizando um array modelo como parâmetro (ex: `new T[0]`).
    *   `toArray(IntFunction<T[]> generator)`: Retorna um array do tipo correto utilizando uma referência de construtor (forma moderna baseada em sintaxe de geradores/lambdas, ex: `String[]::new`).
*   **Remoção Condicional Avançada:**
    *   `removeIf(Predicate)`: Remove itens de uma `Collection` com base em uma condição lógica expressa por meio de **Predicados** (*Predicates*).
    *   **Exemplo Prático de `removeIf` com Predicados:**
        *   Exemplo de como o `removeIf` funciona na prática com expressões lambda:
            ```java
            List<String> nomes = new ArrayList<>(List.of("Ana", "Carlos", "Amanda"));
            // Remove todos os nomes que começam com a letra 'A'
            nomes.removeIf(nome -> nome.startsWith("A")); 
            ```