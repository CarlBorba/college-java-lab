package oriented_object_programming.lista5_poo;

public class Main {
    public static void main(String[] args) {
        // 1-6
        ExerciseRunner runner = new ExerciseRunner();
        runner.exercise1();
        runner.exercise2();
        runner.exercise3();
        runner.exercise4();
        runner.exercise5();

        // 7
        Lista listaObj = new Lista();
        listaObj.criaLista(5);
        listaObj.imprimeLista();
        listaObj.somatorio();
        listaObj.media();
        listaObj.substituiImparPorZero();
        listaObj.imprimeLista();
    }
}
