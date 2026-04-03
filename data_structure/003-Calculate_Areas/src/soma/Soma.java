package soma;

public class Soma{
    int num1, num2, num3, soma;

    public Soma(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public Soma(int num1, int num2, int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public int somarDois(){
        this.soma=this.num1+this.num2;
        return this.soma;
    }

    public int somarTres(){
        this.soma=this.num1+this.num2+this.num3;
        return this.soma;
    }

    public void imprimirResultadoDois(){
        System.out.println("Resultado da soma de 2: " + somarDois());
    }

    public void imprimirResultadoTres(){
        System.out.println("Resultado da soma de 2: " + somarTres());
    }
}
