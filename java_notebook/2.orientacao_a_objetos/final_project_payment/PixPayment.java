package payment_processing;

import java.util.Objects;

public class PixPayment extends BasePayment{
    private String pixKey;

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public boolean process(Transaction transaction) {
        auditRegister(transaction);

        if (!Objects.equals(pixKey, "")){
            System.out.println("Pix transaction successfully completed for the key: " + pixKey);
            return true;
        } else {
            return false;
        }
    }
}
