package oriented_object_programming.lista8_poo;

public class Main {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.deposita(100);
        minhaConta.setLimite(100);

        try {

            minhaConta.saca(1000);

        } catch (ContaExcecao e) {

            System.out.println("Erro: " + e.getMessage());

        }

        System.out.println("Programa finalizado.");
    }
}