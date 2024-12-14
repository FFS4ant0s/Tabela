package br.com.api.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.produtos.models.ModelProduct;
import br.com.api.produtos.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    //Método para listar todos os produtos
    public Iterable<ModelProduct> listar(){
        return pr.findAll();
    }
}
