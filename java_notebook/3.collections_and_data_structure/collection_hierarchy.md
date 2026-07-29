# Getting to Know the Collection Hierarchy
*   **A Interface Root `Iterable`:**
    *   A interface `Iterable` em si não faz parte do Java Collections Framework propriamente dito, mas atua como a interface pai (superinterface) de `Collection`.
    *   Qualquer classe/objeto que implemente `Iterable` (como as coleções derivadas de `Collection`) ganha a capacidade de ser iterado, permitindo o uso simplificado de estruturas de repetição como o *for-each loop* (`for (T item : collection)`).
*   **Vantagens da Interface `List`:**
    *   Implementar `List` em vez de apenas `Collection` traz comportamentos e regras específicas que definem uma sequência ordenada.
    *   **Preservação da Ordem:** `List` garante a ordem de inserção dos elementos, mantendo sempre a mesma sequência de iteração.
    *   **Acesso Posicional (Indexado):** Possui índices em sua implementação, permitindo operações como buscar um elemento em um índice específico, inserir/substituir em posições exatas e extrair sublistas dentro de um intervalo de índices (*range*).
*   **A Família `Set` (Conjuntos):**
    *   **`Set`:** Estrutura de dados genérica que não permite a presença de elementos duplicados.
    *   **`SortedSet`:** Interface que estende `Set` e mantém seus elementos organizados em ordem crescente (ou ordem natural). Para realizar essa ordenação, os elementos precisam implementar a interface `Comparable` (fornecendo o método de comparação). Adiciona métodos para obter o menor/maior elemento, subconjuntos por faixa, etc.
    *   **`NavigableSet`:** Estende `SortedSet` adicionando métodos avançados de navegação, como navegar pela coleção em ordem decrescente ou buscar o elemento mais próximo maior/menor que um valor informado (métodos como `floor()`, `ceiling()`, `lower()`, `higher()`).