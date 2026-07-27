# Interfaces

*   **Conceito de Contrato:**
    *   Uma interface basicamente serve como um contrato do que determinadas classes devem fazer.
    *   Em sua forma clássica/padrão, não há implementação de métodos em si, apenas a declaração do cabeçalho (assinatura) indicando o tipo de retorno, o nome e os parâmetros recebidos, sem um corpo `{}`.
*   **Regra de Implementação:**
    *   As classes concretas que implementam a interface devem obrigatoriamente implementar todos os métodos abstratos declarados nela.
    *   *Exceção:* Classes abstratas que implementam uma interface podem optar por não implementar os métodos imediatamente, repassando essa responsabilidade para as subclasses concretas que a estenderem.
*   **O que uma Interface pode conter:**
    *   Constantes (implicitamente `public`, `static` e `final`).
    *   Assinaturas de métodos abstratos.
    *   Métodos `default` (métodos de instância com corpo/implementação padrão).
    *   Métodos estáticos (`static`), podendo ser `public` ou `private` (nunca `protected`).
    *   Métodos privados de instância (`private`), utilizados para reutilização de código entre métodos `default` dentro da própria interface.
    *   Tipos aninhados (*nested types*, como classes ou enums internos).
*   **Modificadores Implícitos (Anotação de Sintaxe):**
    *   Em uma interface, todos os métodos sem corpo são **implicitamente `public` e `abstract`**. Da mesma forma, qualquer variável declarada é **implicitamente `public static final`**. Não é necessário escrever essas palavras-chave explicitamente no código, embora seja permitido.
*   **Interface funcional (`@FunctionalInterface`):**
    *   Se uma interface possui **apenas um único método abstrato** (SAM - *Single Abstract Method*), ela é considerada uma **Interface Funcional**. Elas são a base do Java moderno para trabalhar com Expressões Lambda e a API de Streams (muito utilizadas no desenvolvimento backend). A anotação `@FunctionalInterface` avisa o compilador sobre essa restrição.
*   **Interfaces como APIs:**
    *   No contexto de APIs (*Application Programming Interface*), o conceito de interface permite que empresas/bibliotecas exponham apenas o "contrato" de uso do sistema. Os clientes utilizam os métodos expostos sem precisar saber como o código foi implementado internamente, garantindo desacoplamento e encapsulamento.
*   **Marcadores (*Marker Interfaces*):**
    *   Existem interfaces no Java que não possuem nenhum método ou constante (ex: `Serializable`, `Cloneable`). Elas servem apenas como um "rótulo" ou "marcador" para informar à JVM que a classe que a implementa possui uma característica especial.
*   **Herança Múltipla em Interfaces:**
    *   Diferente de classes, uma interface pode estender quantas outras interfaces desejar simultaneamente (herança múltipla de interfaces).

---