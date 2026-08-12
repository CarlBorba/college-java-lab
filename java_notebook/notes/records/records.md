# Java Records

*   **O que são Records:**
    *   Records são utilizados para criar classes imutáveis de maneira simplificada (carregadoras de dados / DTOs).
    *   Automaticamente, o Java define todos os atributos como `private final` e gera por baixo dos panos o construtor, os métodos leitores (getters), `equals()`, `hashCode()` e `toString()`.
    *   Records são **implicitamente `final`**, o que significa que não podem ser estendidos (`extends`) por outras classes e nem podem estender outra classe (pois já estendem `java.lang.Record`). No entanto, eles **podem implementar interfaces** normalmente.

*   **Exemplo de uma classe tradicional (sem usar Record):**
    ```java
    public class Transaction {
        private final String transactionId;
        private final BigDecimal value;
        private final LocalDateTime dateHour;
        private final String paymentMethod;
        private final String system;

        public Transaction(String transactionId, BigDecimal value, LocalDateTime dateHour, String paymentMethod, String system) {
            this.transactionId = transactionId;
            this.value = value;
            this.dateHour = dateHour;
            this.paymentMethod = paymentMethod;
            this.system = system;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public BigDecimal getValue() {
            return value;
        }

        public LocalDateTime getDateHour() {
            return dateHour;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public String getSystem() {
            return system;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "transactionId='" + transactionId + '\'' +
                    ", value=" + value +
                    ", dateHour=" + dateHour +
                    ", paymentMethod='" + paymentMethod + '\'' +
                    ", system='" + system + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Transaction that = (Transaction) o;
            return Objects.equals(transactionId, that.transactionId) && 
                   Objects.equals(value, that.value) && 
                   Objects.equals(dateHour, that.dateHour) && 
                   Objects.equals(paymentMethod, that.paymentMethod) && 
                   Objects.equals(system, that.system);
        }

        @Override
        public int hashCode() {
            return Objects.hash(transactionId, value, dateHour, paymentMethod, system);
        }
    }
    ```

*   **A mesma classe, utilizando Record:**
    ```java
    public record Transaction(
        String transactionId, 
        BigDecimal value, 
        LocalDateTime dateHour, 
        String paymentMethod, 
        String source
    ) {}
    ```