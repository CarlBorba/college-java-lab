package payment_processing;

abstract class BasePayment implements PaymentProcessor{
    protected String authCode;

    void auditRegister(Transaction transaction) {
        System.out.println("Audit recorded for the transaction: " + transaction.getId());
    }

    public abstract boolean process(Transaction transaction);
}
