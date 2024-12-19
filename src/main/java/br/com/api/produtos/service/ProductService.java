package br.com.api.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.models.ModelProduct;
import br.com.api.produtos.models.ModelResponse;
import br.com.api.produtos.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    @Autowired
    private ModelResponse rm;

    //Método para listar todos os produtos
    public Iterable<ModelProduct> listar(){
        return pr.findAll();
    }

    // Método para cadastrar produtos
    public ResponseEntity<?> register(ModelProduct pm) {
        if(pm.getNome().equals("")){
            rm.setMensage("O nome do produto é obrigatorio!");
            return new ResponseEntity<ModelResponse>(rm, HttpStatus.BAD_REQUEST);
        }
        else if(pm.getMarca().equals("")){
            rm.setMensage("O nome da marca é obrigatorio!");
            return new ResponseEntity<ModelResponse>(rm, HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<ModelProduct>(pr.save(pm), HttpStatus.CREATED);
        }
    }
}
