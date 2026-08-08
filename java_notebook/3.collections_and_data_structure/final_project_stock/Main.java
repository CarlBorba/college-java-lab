import repository.CatalogRepository;
import service.Menu;

public class Main {
    public static void main(String[] args) {
        CatalogRepository catalog = new CatalogRepository();

        Menu.mainMenu();
    }
}
