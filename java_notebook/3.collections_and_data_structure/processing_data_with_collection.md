# Creating and Processing Data with the Collections Factory Methods

*   **Métodos de Fábrica Estáticos (`List.of` e `Set.of`):**
    *   `List<String> strings = List.of("one", "two");`: Cria uma lista estritamente imutável de maneira simplificada.
    *   `Set<String> strings = Set.of("one", "two");`: Cria um conjunto estritamente imutável de maneira simplificada.
    *   *Regra de Ouro:* Essas coleções **não aceitam valores `null`** (lançam `NullPointerException` na tentativa de criação) e **não permitem modificações** de tamanho ou conteúdo.
  

* **Cópias Imutáveis (`copyOf`):**
    *   `List<String> list = List.copyOf(strings);`: Cria uma cópia imutável da lista `strings`.
    *   `Set<String> set = Set.copyOf(strings);`: Cria uma cópia imutável em forma de conjunto.
    *   *Nota:* Se a coleção de origem já for uma coleção imutável do próprio Java, o `copyOf` pode retornar a mesma instância por otimização.
  

* **Empacotador de Array (`Arrays.asList`):**
    *   `List<String> wrapper = Arrays.asList("one", "two");`: Transforma um array em uma lista servindo como um "wrapper" (casca).
    *   *Comportamento de Tamanho Fixo:* Não permite adicionar (`add()`) ou remover (`remove()`) elementos (lança `UnsupportedOperationException`), porém **permite substituir/alterar** valores existentes via `set()`.
  

* **Algoritmos e Métodos Utilitários (`Collections`):**
    *   `Collections.min(collection);`: Extrai e retorna o menor valor da coleção.
    *   `Collections.max(collection);`: Extrai e retorna o maior valor da coleção.
    *   *Atenção:* Lançam `NoSuchElementException` se aplicados a uma coleção vazia.
    *   `Collections.indexOfSubList(source, target);`: Retorna o primeiro índice de onde uma sublista alvo (*target*) começa dentro da lista principal (*source*), ou `-1` se não encontrar.
    *   `Collections.lastIndexOfSubList(source, target);`: Retorna o índice da última ocorrência da sublista.
    *   `Collections.sort(list);`: Ordena os elementos da lista diretamente (no Java 8+, é preferível utilizar `list.sort()`).
    *   `Collections.shuffle(list);`: Embaralha os elementos da lista de forma aleatória.
    *   `Collections.rotate(list, distance);`: Rotaciona a lista (ex: move os últimos elementos para o começo, empurrando os demais).
    *   `Collections.reverse(list);`: Inverte a ordem atual dos elementos na própria lista.
    *   `Collections.swap(list, i, j);`: Troca as posições dos elementos situados nos índices `i` e `j`.
  

* **Visualizações Não Modificáveis e Sincronizadas:**
    *   `List<String> view = Collections.unmodifiableList(list);`: Cria uma visualização não modificável (*read-only*) para uma lista existente sem duplicar os dados na memória. Se a lista original for alterada, as alterações aparecerão nessa visualização, mas tentar alterá-la via *wrapper* lançará exceção.
    *   `List<String> syncList = Collections.synchronizedList(list);`: Cria uma versão thread-safe da lista. Exige sincronização manual (bloco `synchronized`) durante a iteração para evitar condições de corrida (*race conditions*).