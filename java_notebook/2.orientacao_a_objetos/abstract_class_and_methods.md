# Abstract Methods and Classes

*   **Definição de Classes Abstratas:**
    *   Classes abstratas são declaradas com a palavra-chave `abstract`. Elas podem ou não conter métodos abstratos.
    *   Não podem ser instanciadas diretamente, mas podem ser estendidas por subclasses, e podem também possuirem construtores que serão utilizados pela subclass através do `super()`.
    *   Podem conter tanto métodos abstratos (sem corpo) quanto métodos concretos (com implementação).


*   **Regras para Subclasses:**
    *   A classe que estende uma classe abstrata deve obrigatoriamente implementar todos os métodos abstratos herdados. Caso opte por não implementar algum deles, essa subclasse também deve ser declarada como `abstract`.


* **Métodos em Interfaces:**
    *   Métodos em interfaces que não possuem os modificadores `default` ou `static` são implicitamente declarados como `public` e `abstract`.


* **Comparação: Classes Abstratas vs. Interfaces:**
    *   **Interfaces:** Permitem simular herança múltipla de comportamentos, pois uma classe pode implementar várias interfaces. Seus atributos, por padrão, são sempre `public static final` (constantes).
    *   **Classes Abstratas:** Permitem declarar campos de instância comuns que **não** são obrigatoriamente `static` nem `final`, permitindo flexibilidade de estado e uso de diferentes modificadores de acesso (`protected`, `private`, etc.).


* **Quando utilizar Classes Abstratas:**
    *   Para compartilhar código entre classes intimamente relacionadas (*"é um"*).
    *   Quando as subclasses esperam compartilhar muitos métodos ou atributos em comum, ou quando for necessário alterar os modificadores de acesso dos atributos.
    *   Quando houver a necessidade de declarar atributos de instância não estáticos e não finais.


* **Quando utilizar Interfaces:**
    *   Quando classes não relacionadas/distantes precisam implementar a mesma funcionalidade (*"é capaz de"*).
    *   Quando desejar apenas definir um contrato (assinaturas de métodos), sem focar em implementação compartilhada.
    *   Quando precisar do benefício da herança múltipla de tipo.


* **O Princípio "É um" vs. "É capaz de":**
    *   Para facilitar a decisão rápida entre Interface e Classe Abstrata no dia a dia do backend:
    *   **Classe Abstrata:** Representa identidade (*O que o objeto É*). Exemplo: `Cachorro` **é um** `Animal`.
    *   **Interface:** Representa capacidade ou papel (*O que o objeto FAZ*). Exemplo: `Cachorro` **é capaz de** `Correr` (implementa `Runnable`).
    

*   **Exemplo Prático (Forma Geométrica):**
    *   Um caso clássico é uma classe pai `FormaGeometrica`. Ela define atributos e características comuns (ex: número de lados), mas o método `calcArea()` é abstrato, pois cada subclasse (`Quadrado`, `Circulo`) possui uma fórmula específica para calcular sua área.


* **Interfaces e Classes Abstratas em Conjunto:**
    *   Quando uma classe abstrata implementa uma interface, ela **não é obrigada** a implementar os métodos abstratos da interface imediatamente. Ela pode repassar essa responsabilidade para as subclasses concretas que a estenderem.


* **Membros Estáticos:**
    *   É possível acessar e utilizar membros estáticos diretamente através da classe, sem a necessidade de criar instâncias.