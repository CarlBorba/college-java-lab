# Set, SortedSet e NavigableSet

*   **Interface `Set`:**
    *   Não acrescenta novos métodos em relação à interface `Collection`; sua principal característica é **não permitir elementos duplicados**.
    *   `HashSet`: É a implementação mais comum e amplamente utilizada. Não garante nem preserva a ordem de inserção dos elementos.
    *   `LinkedHashSet`: Combinação de tabela hash com `LinkedList`. É a melhor opção caso você precise iterar sobre o `Set` mantendo a ordem de inserção dos elementos.
  

* **Interface `SortedSet`:**
    *   Interface que estende `Set` e mantém os elementos ordenados de acordo com uma comparação lógica.
    *   `TreeSet`: É a implementação de `SortedSet` amplamente utilizada.
    *   **Regras de Ordenação do `TreeSet`:** Exige que os elementos implementem a interface `Comparable` (ordem natural) ou que seja fornecido um `Comparator` no momento da criação da coleção.
    *   **Métodos adicionados por `SortedSet`:**
        *   `first()` / `last()`: Retornam o menor e o maior elemento do conjunto.
        *   `headSet(elementoTopo)`: Retorna um subconjunto com elementos menores que o `elementoTopo`.
        *   `tailSet(elementoBase)`: Retorna um subconjunto com elementos maiores ou iguais ao `elementoBase`.
        *   `subSet(elementoInicial, elementoFinal)`: Retorna um subconjunto com elementos entre o `elementoInicial` (inclusivo) e `elementoFinal` (exclusivo).
    *   *Comportamento de Subsets:* São **visualizações editáveis** (*views*) do conjunto original. Alterações feitas neles refletem diretamente no `Set` principal. Tentar adicionar um elemento fora dos limites estabelecidos na criação do subset lançará `IllegalArgumentException`.
  

* **Interface `NavigableSet`:**
    *   Estende `SortedSet` trazendo métodos avançados de busca por aproximação e navegação:
        *   `lower(element)` / `higher(element)`: `lower` retorna o maior elemento estritamente menor que o informado; `higher` retorna o menor elemento estritamente maior.
        *   `ceiling(element)` / `floor(element)`: Similar a `higher`/`lower`, porém **inclusivos**. `ceiling` retorna o menor elemento maior ou igual ao informado; `floor` retorna o maior elemento menor ou igual.
        *   `pollFirst()` / `pollLast()`: Retornam e **removem** o menor e o maior elemento do conjunto, respectivamente.
        *   `descendingIterator()`: Fornece um `Iterator` para percorrer o conjunto em ordem decrescente.
        *   `descendingSet()`: Retorna uma visualização editável do conjunto invertido (em ordem decrescente).