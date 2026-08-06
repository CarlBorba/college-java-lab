# Map

## Sobre a interface Map
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

---

## Principais Métodos:
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
    *   `remove(key, value)`: Remove o par apenas se a chave existir **e** seu valor atual for exatamente igual ao `value` informado. Este método retorna true caso a remoção seja realizada.


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

---

## Map com Expressões Lambda

*   **Iteração e Substituição com Lambdas:**
    *   `forEach(BiConsumer)`: Substitui o uso do loop `for` tradicional para iterar sobre um `Map`.
        *   *Exemplo:* `map.forEach((key, value) -> System.out.println(key + " -> " + value));`
        *   *Explicação:* Passam-se a chave e o valor, definindo logo em seguida a ação a ser realizada a cada iteração.
    *   `replaceAll(BiFunction)`: O resultado da expressão lambda substitui o valor antigo de cada chave presente no mapa.
        *   *Exemplo:* `map.replaceAll((nome, nota) -> nota + 5);`
        *   *Explicação:* Dado um `Map` contendo o par `nome:nota`, a expressão lambda adiciona 5 pontos à nota e substitui a nota original de cada par.

---

## Métodos Compute
  
* **Família de Métodos `compute`:**
    *   Modificam os valores das chaves a partir de cálculos dinâmicos.
    *   *Regra de Ouro da Remoção:* Caso a função lambda retorne `null`, a chave é **removida** do `Map`.
    *   *Retorno:* Sempre retornam o valor final associado à chave após a tentativa de execução.
    *   **`compute(key, (key, value) -> newValue)`:**
        *   *Comportamento:* Executa **sempre** (método geral), independentemente de a chave existir, não existir ou possuir valor `null`.
        *   *Lógica:* Recebe a chave e a função `(key, value) -> newValue`. Se a chave existir, atualiza o valor para `newValue`. Se não existir, cria a chave atrelando-a ao `newValue`.
    *   **`computeIfPresent(key, (key, oldValue) -> newValue)`:**
        *   *Comportamento:* Só executa se a chave fornecida **já existir** e seu valor for diferente de `null`.
        *   *Lógica:* Se a chave estiver presente (e valor `!= null`), atualiza o valor com `newValue`. Se a chave não existir ou for `null`, a lambda não executa. Como regra de retorno, entrega o resultado do cálculo; como nada foi executado, retorna `null`.
    *   **`computeIfAbsent(key, k -> newValue)`:**
        *   *Comportamento:* Só executa se a chave **não existir** ou se o valor atrelado a ela for `null`.
        *   *Lógica:* Se a chave não existir, ela é criada e seu valor recebe `newValue` (gerado por `k -> newValue`). Se a chave já existir (e valor `!= null`), a lambda é ignorada. Como o método sempre retorna o valor final associado à chave, ele devolve o valor antigo que já estava presente no mapa.

---

## Map.merge()

*   **Conceito e Finalidade:**
    *   O método `merge()` é comumente utilizado para "juntar" valores de um `Map`, como ao concatenar `Strings` ou somar valores numéricos.
    *   Simplifica o processo tradicional e verboso de verificar a chave, recuperar o valor, calcular o novo total e atualizar a entrada (`containsKey` -> `get` -> soma/concatenação -> `put`).
*   **Assinatura e Funcionamento:**
    *   `mapa.merge(key, newValue, (oldValue, newValue) -> newAddedValue);`
    *   **Cenário 1 (Chave inexistente):** Passam-se a chave e o novo valor. Se a chave não existir no mapa, ela é criada com o `newValue` informado, e a `BiFunction` **não** é executada.
    *   **Cenário 2 (Chave existente):** Caso a chave já esteja presente no mapa, a `BiFunction` **é executada**. Ela recebe o `oldValue` (valor atual no mapa) e o `newValue` (valor passado no parâmetro) para definir como deve ser feita a "junção/soma".
*   **Exemplo Prático:**
    ```java
    Map<String, Integer> estoque = new HashMap<>();
    estoque.put("Notebook", 5);
    estoque.put("Teclado", 10);

    // Executa a BiFunction pois já havia "Notebook" no estoque (soma: 5 + 3 = 8)
    estoque.merge("Notebook", 3, (oldValue, newValue) -> oldValue + newValue);

    // Como não havia a chave "Mouse", apenas cria a entrada com o novo valor (15) sem executar a BiFunction
    estoque.merge("Mouse", 15, (oldValue, newValue) -> oldValue + newValue);

    System.out.println(estoque); // {Teclado=10, Mouse=15, Notebook=8}
    ```
*   Se a `BiFunction` retornar `null`, o método `merge()` entende que o resultado do cálculo é nulo e **remove a chave** do mapa.

---

## Chaves Mutáveis vs Imutáveis
*   **Regra de Ouro:** **NUNCA** utilizar objetos mutáveis como chaves (*keys*) em um `Map`.
*   **Por que não usar?** Métodos como `get()`, `containsKey()` e `remove()` dependem diretamente dos contratos de `hashCode()` e `equals()` para calcular a posição do bucket e localizar a chave.
*   **Efeito Colateral 1 (Perda de Acesso):** Se uma propriedade de um objeto usado como chave for alterada após a inserção no mapa, seu `hashCode` mudará. Ao tentar buscar essa chave via `get(key)`, o algoritmo procurará no bucket errado, retornando `null` mesmo que o objeto ainda esteja fisicamente armazenado no mapa.
*   **Efeito Colateral 2 (Colisão/Inconsistência):** Se a alteração do objeto fizer com que seu `hashCode` e `equals` coincidam com outra chave já existente, métodos de busca podem retornar valores trocados ou causar comportamentos imprevisíveis.

---

## Boas Práticas
*   **Mapas Imutáveis (`Map.of`):** Para a criação rápida de mapas imutáveis (de até 10 entradas), utiliza-se o método de fábrica estático:
    *   `Map<K, V> mapa = Map.of(k1, v1, k2, v2...);`
    *   *Atenção:* Não aceita valores ou chaves `null` (lança `NullPointerException`) e lança `IllegalArgumentException` se houver chaves duplicadas na criação.


*   **Criação de Mapas Imutáveis Acima de 10 Entradas (`Map.ofEntries`):**
    *   O `Map.of(...)` possui sobrecargas de 1 a 10 pares. Se necessário, criar um mapa imutável com mais de 10 elementos, o Java disponibiliza o método `Map.ofEntries()`:
        ```java
        Map<String, Integer> mapaGiga = Map.ofEntries(
            Map.entry("k1", 1),
            Map.entry("k2", 2),
            // ... quantas entradas precisar
        );
        ```

*   **Evitando `NullPointerException` com Autounboxing:** Tentar extrair valores `null` do mapa para atribuição direta em tipos primitivos (ex: `int valor = mapa.get("chave")`) resulta em `NullPointerException`. Para evitar isso:
    *   Utilizar o método `getOrDefault(key, defaultValue)` para fornecer um valor padrão seguro na leitura.
    *   Utilizar `putIfAbsent()` ou `computeIfAbsent()` durante a inserção para garantir que valores nulos não sejam armazenados ou fiquem soltos no mapa.