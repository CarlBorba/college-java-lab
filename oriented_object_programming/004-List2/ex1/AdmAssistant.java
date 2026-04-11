package oriented_object_programming.lista2_poo.ex1;

public class AdmAssistant extends Assistant {
    String shift; // "day" ou "night"
    double nightExtra;

    public AdmAssistant(String name, double salary, int registration, String shift, double nightExtra) {
        super(name, salary, registration);
        this.shift = shift;
        this.nightExtra = nightExtra;
    }

    public void anualSalary() {
        double finalSalary = this.salary;

        if (shift.equalsIgnoreCase("night")) {
            finalSalary += nightExtra;
        }

        double annual = finalSalary * 12;
        System.out.printf("%nThe %s annual salary (Administrativo) is: %.2f", this.name, annual);
    }
}