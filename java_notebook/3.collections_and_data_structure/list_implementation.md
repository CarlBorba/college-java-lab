# List

*   **Sintaxe Básica e Instanciação:**
    *   Sintaxe padrão: `List<String> minhaLista = new ArrayList<>();`
    *   Pode-se escolher principalmente entre `ArrayList` e `LinkedList`. A diferença de desempenho entre elas era mais evidente em hardwares antigos. Atualmente, para a grande maioria dos casos de uso, `ArrayList` costuma ser mais rápida devido à localização de memória e cache da CPU.
  

* **Adição e Acesso Básico de Elementos:**
    *   `minhaLista.add("itemName");`: Adiciona um item ao final da lista.
    *   `minhaLista.getFirst();`: Acessa o primeiro elemento da lista.
    *   `minhaLista.getLast();`: Acessa o último elemento da lista.
    *   `minhaLista.addFirst("itemName");`: Adiciona um elemento no início da lista.
    *   `minhaLista.addLast("itemName");`: Adiciona um elemento no fim da lista.


*   **Acesso e Modificação Posicional (por Índice):**
    *   `minhaLista.get(0)`: Retorna o primeiro termo da lista (índice 0).
    *   `minhaLista.get(minhaLista.size() - 1)`: Retorna o último termo da lista.
    *   `minhaLista.add(0, "itemName");`: Insere o item na posição inicial (deslocando os demais).
    *   `minhaLista.set(0, "itemName");`: Substitui/altera o item da posição inicial.
    *   `minhaLista.indexOf("itemName");`: Retorna o índice da primeira ocorrência do item informado.
    *   `minhaLista.remove(0)`: Remove o elemento situado no índice 0.
        *   A interface `List` possui dois métodos de remoção sobrecarregados: `remove(int index)` e `remove(Object o)`.
        *   Em uma `List<Integer>`, chamar `lista.remove(2)` tentará remover o item no **índice 2**, e **não** o número 2. Para remover o valor 2, é preciso fazer `lista.remove(Integer.valueOf(2))`.
  

* **Criação de Sublistas (`subList`):**
    *   `minhaSubLista = minhaLista.subList(0, 3);`: Cria uma sublista do índice 0 até o índice 3 (exclusivo).
    *   *Comportamento importante:* A sublista é uma **visualização modificável** (*view*) da lista original. Alterações feitas na sublista refletem diretamente na lista original e vice-versa.
  

* **Limpeza da Lista:**
    *   `minhaLista.clear()`: Remove todos os itens da lista.
  

* **Ordenação de Listas (`sort` e `Comparator`):**
    *   `minhaLista.sort(Comparator.naturalOrder());`: Ordena a lista em ordem alfabética/natural.
    *   `minhaLista.sort(Comparator.<String>naturalOrder().reversed());`: Ordena em ordem alfabética/natural reversa.
  

* **Inversão de Lista (`reversed`):**
    *   `minhaListaReversa = minhaLista.reversed();`: Retorna uma **visualização editável e invertida** da lista.
    *   *Comportamento importante:* Adicionar um item na posição 0 dessa lista invertida fará com que ele seja inserido no final da lista original (e vice-versa), pois os índices estão mapeados de forma invertida.