package br.com.api.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.models.ModelProduct;
import br.com.api.produtos.service.ProductService;
@RestController
public class ProductController {
    @Autowired
    private ProductService ps;

    @PutMapping("/alterar")
    public ResponseEntity<?> alter(@RequestBody ModelProduct pm){
        return ps.registeralter(pm, "alterar");
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> register(@RequestBody ModelProduct pm){
        return ps.registeralter(pm, "cadastrar");
    }

    @GetMapping("/listar")
    public Iterable<ModelProduct> listar(){
        return ps.listar();
    }
    
    @GetMapping("/")
    public String rota(){
        return "API de produtos funcionando!";
    }
}
