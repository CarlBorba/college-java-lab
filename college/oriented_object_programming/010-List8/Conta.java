package oriented_object_programming.lista8_poo;

public class Conta {

    private double saldo;
    private double limite;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(double valor) throws ContaExcecao {

        if (valor > (saldo + limite)) {
            throw new ContaExcecao("Saldo insuficiente para saque!");
        }

        saldo -= valor;

        System.out.println("Saque realizado com sucesso!");
    }
}