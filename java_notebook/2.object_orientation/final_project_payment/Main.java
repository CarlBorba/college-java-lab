package payment_processing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Transaction t1 = new Transaction("TX-099", 200, "2026-07-24");

        PixPayment pixPayment = new PixPayment("chave-pix-aleatoria");

        CardPayment cardPayment = new CardPayment("0192373512367891", 2);

        List<PaymentProcessor> processors = new ArrayList<>();
        processors.add(pixPayment);
        processors.add(cardPayment);

        for (PaymentProcessor p : processors){
            p.logHeader();

            boolean success = p.process(t1);

            System.out.println("Process status: " + (success ? "SUCCESS" : "FAIL"));
            System.out.println();
        }
    }
}
