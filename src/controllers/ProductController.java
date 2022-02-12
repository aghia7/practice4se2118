package controllers;

import models.Product;
import models.User;
import repositories.interfaces.IProductRepository;
import repositories.interfaces.IUserRepository;

import java.util.List;

public class ProductController {
    private final IProductRepository productRepo;

    public ProductController(IProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    //methods
    public String getByCategory(String category) {
        List<Product> products = productRepo.getByCategory(category);
        String response = "";
        for (Product product : products)
            response += product + "\n";

        return response;
    }
}
