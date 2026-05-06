package oriented_object_programming.lista7_poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GradeRate {

    static class Aluno {
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double mediaFinal;
        String situacao;

        public Aluno(String nome, double nota1, double nota2, double nota3, double mediaFinal, String situacao) {
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.mediaFinal = mediaFinal;
            this.situacao = situacao;
        }
    }

    public static void main(String[] args) {
        String arquivo = "src/oriented_object_programming/lista7_poo/notas_alunos.csv";
        List<Aluno> alunos = new ArrayList<>();
        String separador = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha = br.readLine(); // Ignorar cabeçalho

            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;

                String[] colunas = linha.split(separador);

                if (colunas.length >= 6) {
                    String nome = colunas[0].trim();
                    double nota1 = parseDoubleBR(colunas[1]);
                    double nota2 = parseDoubleBR(colunas[2]);
                    double nota3 = parseDoubleBR(colunas[3]);
                    double mediaFinal = parseDoubleBR(colunas[4]);
                    String situacao = colunas[5].trim();

                    alunos.add(new Aluno(nome, nota1, nota2, nota3, mediaFinal, situacao));
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // a)
        System.out.println("a) Total de Alunos: " + alunos.size());

        // b)
        long aprovados = alunos.stream().filter(a -> a.situacao.equalsIgnoreCase("Aprovado")).count();
        System.out.println("b) Total de alunos Aprovados: " + aprovados);

        // c)
        long recuperacaoCount = alunos.stream().filter(a -> a.situacao.equalsIgnoreCase("Recuperação")).count();
        System.out.println("c) Total de alunos Em Recuperação: " + recuperacaoCount);

        // d)
        long reprovados = alunos.stream().filter(a -> a.situacao.equalsIgnoreCase("Reprovado")).count();
        System.out.println("d) Total de alunos Reprovados: " + reprovados);

        // e)
        Aluno melhorAluno = alunos.stream().max(Comparator.comparingDouble(a -> a.mediaFinal)).orElse(null);
        if (melhorAluno != null) {
            System.out.println("e) Aluno com maior média: " + melhorAluno.nome + " (Média: " + melhorAluno.mediaFinal + ")");
        }

        // f)
        List<String> nomesRecuperacao = alunos.stream().filter(a -> a.situacao.equalsIgnoreCase("Recuperação")).map(a -> a.nome).collect(Collectors.toList());
        System.out.println("f) Alunos em Recuperação: " + nomesRecuperacao);

        // g)
        List<String> dificuldadeNota1 = alunos.stream().filter(a -> a.nota1 < 3.0).map(a -> a.nome).collect(Collectors.toList());
        System.out.println("g) Alunos com Nota 1 menor que 3.0: " + dificuldadeNota1);

        // h)
        List<String> nomesOrdenados = alunos.stream().map(a -> a.nome).sorted().collect(Collectors.toList());

        System.out.println("h) Nomes dos alunos ordenados de A-Z:");
        for (String nome : nomesOrdenados) {
            System.out.println("   - " + nome);
        }
    }

    private static double parseDoubleBR(String valor) {
        try {
            return Double.parseDouble(valor.trim().replace(",", "."));
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}