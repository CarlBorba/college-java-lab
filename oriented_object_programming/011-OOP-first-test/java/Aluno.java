public class Aluno extends Usuario {
    double media;

    // Contrutor
    public Aluno(String nome, int id, double media, String senha) {
        super(nome, id, senha);
        this.media = media;
    }

    @Override
    public String exibirInfo() {
        return "Media: " + media;
    }
}