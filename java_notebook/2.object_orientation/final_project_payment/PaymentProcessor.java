package payment_processing;

public interface PaymentProcessor {
    public boolean process(Transaction transaction);

    default void logHeader() {
        System.out.println("=== INICIANDO PROCESSAMENTO DE PAGAMENTO ===");
    }
}
