package service;

import model.Product;
import repository.CatalogRepository;

public class CatalogService {
    public static void registerProduct(Product product) {

        // Preciso fazer aqui uma injeção de dependência via métodu construtor para passar a instancia do catalogo em CatalogRepository para poder operar nele aqui
    }
}
