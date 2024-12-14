package br.com.api.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.models.ModelProduct;
import br.com.api.produtos.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService ps;

    @GetMapping("/listar")
    public Iterable<ModelProduct> listar(){
        return ps.listar();
    }
    
    @GetMapping("/")
    public String rota(){
        return "API de produtos funcionando!";
    }
}
