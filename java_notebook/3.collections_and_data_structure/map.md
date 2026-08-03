# Map

*   **Conceito Geral de Map:**
    *   Estruturas de dados que armazenam dados no formato **Chave-Valor** (*Key-Value*). Cada objeto possui uma chave (geralmente simples, como `String` ou `Integer`) associada a um valor (que pode ser tão complexo quanto necessário).
    *   *Analogia:* No ecossistema Python, os `Maps` correspondem aos **dicionários** (`dict`).


*   **Relação com o Java Collections Framework:**
    *   No Java, a interface `Map` **não herda** da interface `Collection`. Enquanto `Collection` lida com elementos individuais, `Map` lida com pares associativos (*Key-Value*). Apesar disso, compartilham diversos conceitos e comportamentos em comum.

  
* **Anatomia da Estrutura de um Map:**
    *   **Chave (*Key*):** Identificador único para localizar o dado. O conjunto de chaves forma um `Set`, pois **chaves não podem ser duplicadas**.
    *   **Valor (*Value*):** Dado real associado à chave. Pode conter elementos repetidos, portanto o conjunto de valores é representado como uma `Collection`.
    *   **Entrada (*Entry*):** Cada par indivisível de `Chave-Valor` é chamado de `Entry`. O conjunto de entradas forma um `Set` (`Set<Map.Entry<K, V>>`), visto que cada par é único.


*   **Hierarquia de Interfaces e Implementações:**
    *   `Map`: Interface base que define o contrato e os comportamentos padrão de chave-valor.
    *   `HashMap`: Implementação mais básica e amplamente utilizada. Baseada em tabela hash, **não garante nem preserva a ordem** dos elementos.
    *   `LinkedHashMap`: Implementação de `HashMap` que mantém uma lista duplamente encadeada, **preservando a ordem de inserção** dos elementos e permitindo iteração ordenada.
    *   `IdentityHashMap`: Implementação especial que compara chaves via referência de memória (`==`) em vez de `equals()` e `hashCode()`. Deve ser utilizada com extrema cautela.
    *   `SortedMap`: Interface que garante a ordenação das chaves com base em uma ordem natural ou `Comparator`.
    *   `NavigableMap`: Extensão de `SortedMap` que adiciona métodos de busca por aproximação e navegação entre chaves.
    *   `TreeMap`: Classe concreta (baseada em **Árvore Rubro-Negra**) que implementa as interfaces `SortedMap` e `NavigableMap`.


*   **Principais Métodos da Interface `Map`:**
    *   **Inserção e Substituição:**
        *   `put(key, value)`: Adiciona o par. Se a chave for nova, insere e retorna `null`. Se a chave já existir, atualiza o valor e retorna o **valor antigo**.
        *   `putIfAbsent(key, value)`: Adiciona o par apenas se a chave ainda não existir ou se o valor atual associado a ela for `null`.
        *   `replace(key, value)`: Substitui o valor apenas se a chave já existir. Retorna o valor antigo ou `null` caso a chave não esteja presente.
        *   `replace(key, oldValue, newValue)`: Substitui o valor da chave apenas se o valor atual for estritamente igual a `oldValue`. Retorna `true` se a troca for realizada.
    *   **Recuperação:**
        *   `get(key)`: Retorna o valor associado à chave ou `null` se não existir.
        *   `getOrDefault(key, defaultValue)`: Retorna o valor associado à chave ou o `defaultValue` caso a chave não esteja presente.
    *   **Remoção:**
        *   `remove(key)`: Remove a chave e seu valor associado, retornando o valor removido (ou `null` se a chave não existir).
        *   `remove(key, value)`: Remove o par apenas se a chave existir **e** seu valor atual for exatamente igual ao `value` informado.
    *   **Verificação e Status:**
        *   `containsKey(key)`: Retorna `true` se a chave estiver presente no mapa.
        *   `containsValue(value)`: Retorna `true` se o valor estiver associado a pelo menos uma chave.
        *   `isEmpty()`: Retorna `true` se o mapa não contiver entradas.
        *   `size()`: Retorna a quantidade total de pares (*entries*) no mapa.
        *   `clear()`: Remove todas as entradas do mapa.
    *   **Visualizações do Mapa (*Collection Views*):**
        *   `keySet()`: Retorna um `Set` com todas as chaves. Remover um item deste conjunto remove o par correspondente no mapa (não é possível adicionar chaves diretamente por este `Set`).
        *   `values()`: Retorna uma `Collection` com todos os valores. Remover um elemento desta coleção remove a primeira ocorrência correspondente no mapa.
        *   `entrySet()`: Retorna um `Set` contendo todos os pares `Map.Entry<K, V>`.