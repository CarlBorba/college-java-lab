public class Professor extends Usuario {
    String diciplina;

    // Contrutor
    public Professor(String nome, int id, String diciplina, String senha) {
        super(nome, id, senha);
        this.diciplina = diciplina;
    }

    @Override
    public String exibirInfo() {
        return "Disciplina: " + diciplina;
    }
}