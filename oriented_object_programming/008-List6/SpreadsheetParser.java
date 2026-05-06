package oriented_object_programming.lista6_poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpreadsheetParser {
    public static void main(String[] args) {
        String fileLocation = "src/oriented_object_programming/lista6_poo/access-code-password-recovery-code.csv";
        String line;
        String delimiter = ";";

        List<String> londonUsers = new ArrayList<>();
        String rachelAccessCode = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {

            System.out.println("--- a) Todas as linhas da tabela ---");

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                System.out.println(line);

                String[] columns = line.split(delimiter);

                if (columns.length >= 7) {
                    String accessCode = columns[1].trim();
                    String firstName = columns[3].trim();
                    String lastName = columns[4].trim();
                    String location = columns[6].trim();

                    if ("London".equalsIgnoreCase(location)) {
                        londonUsers.add(firstName + " " + lastName);
                    }

                    if ("Rachel".equalsIgnoreCase(firstName)) {
                        rachelAccessCode = accessCode;
                    }
                }
            }

            System.out.println("\n--- b) Usuarios em Londres ---");
            for (String user : londonUsers) {
                System.out.println(user);
            }

            System.out.println("\n--- c) Código de acesso Rachel ---");
            System.out.println(rachelAccessCode != null ? rachelAccessCode : "Not found");

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}