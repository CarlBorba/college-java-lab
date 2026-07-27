package payment_processing;

public class CardPayment extends BasePayment{
    private String cardNumber;
    private int installments;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

    public CardPayment(String cardNumber, int installments) {
        this.cardNumber = cardNumber;
        this.installments = installments;
    }

    @Override
    public boolean process(Transaction transaction) {
        auditRegister(transaction);

        if (cardNumber.length() == 16){
            System.out.println("Card approved in " + installments + "x in the card " + cardNumber);
            return true;
        } else {
            return false;
        }
    }
}
