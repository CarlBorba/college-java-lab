package oriented_object_programming.lista2_poo.ex1;

public class TecAssistant extends Assistant{
    double salary_bonus; // 5%

    public TecAssistant(String name, double salary, int registration, double salary_bonus) {
        super(name, salary, registration);
        this.salary_bonus = salary_bonus;
        this.salary = this.salary * (1 + (this.salary_bonus/100));
    }

    public void anualSalary(){
        System.out.printf("%nThe %s annual salary with salary bonus is: %.2f", this.name, this.salary * 12);
    }
}
