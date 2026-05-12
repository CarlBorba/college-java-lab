import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();

        // Aluno1
        Aluno aluno1 = new Aluno("Carl", 1, 10, "Carl");
        cadastrarUsuario(usuarios, aluno1);

        // Aluno2
        Aluno aluno2 = new Aluno("Jon", 2, 9, "MyPassword");
        cadastrarUsuario(usuarios, aluno2);

        // Professor1
        Professor professor1 = new Professor("Robert", 3, "Java", "StrongPassword");
        cadastrarUsuario(usuarios, professor1);

        // Professor2
        Professor professor2 = new Professor("Phill", 4, "Python", "MyPassword");
        cadastrarUsuario(usuarios, professor2);

        // Manipulação de arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("relatorio_usuarios.txt"))) {
            for (Usuario u : usuarios) {
                String line = "NOME: " + u.getNome().toUpperCase() + " | INFO: " + u.exibirInfo();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("\nArquivo salvo com " + usuarios.size() + " usuarios.");
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static void cadastrarUsuario(List<Usuario> lista, Usuario u) {
        if (u.validarAcesso(u.getSenha())) {
            lista.add(u);
            System.out.println("Successo: " + u.getNome() + " registrado.");
        } else {
            System.out.println("Erro: " + u.getNome() + " não foi registrado(a senha precisa ter 8+ caracteres).");
        }
    }
}