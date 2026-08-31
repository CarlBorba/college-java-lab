# Exceptions
*   **Conceito Geral:**
    *   Uma exceção ocorre quando um evento anormal interrompe o fluxo regular de execução do programa, instancia um objeto de exceção e o propaga, podendo finalizar a aplicação caso não seja tratado.
    *   O ato de criar e propagar esse objeto de erro na execução é chamado de **"throwing an exception"** (`throw`).


*   **Pilha de Chamadas (*Call Stack*) e Propagação:**
    *   Ao ocorrer uma exceção em um método, a JVM inicia uma busca retroativa na pilha de chamadas (*call stack*) à procura de um bloco `catch` compatível.
    *   Se nenhum método na pilha tratar o erro, a exceção atinge o topo (método `main`), o programa é encerrado abruptamente e o *stack trace* é impresso.
    *   Graças a esse mecanismo de propagação, não é obrigatório tratar o erro imediatamente no local onde ele ocorre; é possível capturá-lo em um nível superior (ex: envolver a chamada do método com `try-catch`).
    *   Quando uma exceção é lançada, a execução das linhas seguintes dentro daquele mesmo bloco `try` é imediatamente interrompida.


*   **Estrutura de Tratamento (`try-catch-finally`):**
    *   **`try`:** Bloco que encapsula o código "arriscado", sujeito a lançar exceções.
    *   **`catch`:** Bloco que intercepta a exceção declarada como parâmetro (ou classes genéricas como `Exception`) e define o fluxo corretivo ou log.
        *   *Multi-catch:* Permite agrupar múltiplos tipos de exceções no mesmo bloco usando o operador pipe (`|`), por exemplo: `catch (IOException | SQLException e)`.
    *   **`finally`:** Bloco que **sempre** é executado, havendo ou não exceção, e mesmo após a presença de instruções como `return`. Comumente utilizado para liberar recursos (ex: fechar conexões de banco de dados, streams de arquivos).


*  **Hierarquia de Exceções (`Throwable`):**
    *   `Throwable` é a superclasse raiz de todos os erros e exceções no Java.
    *   Divide-se em dois grandes ramos:
        *   **`Error`:** Problemas graves do ambiente/JVM dos quais o programa geralmente não consegue se recuperar (ex: `OutOfMemoryError`, `StackOverflowError`). Não devem ser capturados via `catch`.
        *   **`Exception`:** Condições anormais que a aplicação pode prever e tratar.


*  **Checked vs. Unchecked Exceptions:**
    *   **Unchecked (`RuntimeException`):** Erros de lógica de programação (ex: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `IllegalArgumentException`). O compilador **não obriga** o tratamento com `try-catch` nem a declaração na assinatura com `throws`.
    *   **Checked (`Exception` direta):** Erros recuperáveis e externos ao código (ex: `IOException`, `SQLException`). O compilador **obriga** o desenvolvedor a tratar (`try-catch`) ou a propagar explicitamente na assinatura do método (`throws MinhaException`).


*  **Try-with-resources (Evolução do `finally`):**
    *   A partir do Java 7, o uso manual de `finally` para fechar conexões/arquivos foi amplamente substituído pela estrutura `try-with-resources`. Qualquer objeto que implemente a interface `AutoCloseable` é fechado automaticamente ao fim do bloco:
        ```java
        try (BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"))) {
            return reader.readLine();
        } // reader.close() é chamado automaticamente aqui, sem necessidade de finally
        ```


## Checked vs Unchecked Exceptions
*   **Checked Exceptions (Exceções Verificadas):**
    *   São aquelas identificadas pelo compilador Java antes mesmo da execução (em tempo de compilação), obrigando o desenvolvedor a lidar com elas.
    *   **Tratamento:** Devem ser tratadas diretamente com um bloco `try-catch` ou propagadas adicionando a cláusula `throws NomeDaException` na assinatura do método. Declarar `throws` indica que o método atual não resolverá o erro ali, repassando a responsabilidade do tratamento para quem chamá-lo na pilha de chamadas (*call stack*).


*   **Unchecked Exceptions (Exceções Não Verificadas):**
    *   São aquelas não verificadas em tempo de compilação; o código compila e executa normalmente, mas a exceção pode ser disparada durante o *runtime* (tempo de execução).
    *   **Tratamento:** Podem ser tratadas opcionalmente com `try-catch` ou propagadas com `throws`, embora o compilador não exija nenhuma dessas ações de forma explícita.


*   **Como o Java diferencia tecnicamente Checked de Unchecked:**
    *   Toda classe que herda direta ou indiretamente de `RuntimeException` (que, por sua vez, herda de `Exception`) é classificada como **Unchecked Exception**.
    *   Toda classe que herda diretamente de `Exception` (mas **não** é subclasse de `RuntimeException`) é classificada como **Checked Exception**.