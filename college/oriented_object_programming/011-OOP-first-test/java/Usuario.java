public abstract class Usuario implements Autenticavel {
    String nome;
    int id;
    String senha;

    // Contrutor
    public Usuario(String nome, int id, String senha) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    // Getters & Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    @Override
    public boolean validarAcesso(String senha) {
        return senha != null && senha.length() >= 8;
    }

    // Metodo para retornar dados pra salvar no arquivo
    public abstract String exibirInfo();
}