package br.com.futurodev.Exercicio.controler;

import br.com.futurodev.Exercicio.model.Author;
import br.com.futurodev.Exercicio.service.ServiceAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/author")
public class ControllerAuthor {

        @Autowired
        private ServiceAuthor serviceAuthor;

        @GetMapping
        public List<Author> getAuthors(){
            return serviceAuthor.buscarAuthors();
        }
        @PostMapping
        public Author postAuthors(@RequestBody Author Author){
            return serviceAuthor.salvar(Author);
        }
        @PutMapping
        public Author putAuthors(@RequestBody Author Author){
            return serviceAuthor.salvar(Author);
        }
        @DeleteMapping
        public boolean deleteAuthor(@RequestBody Author Author){
            serviceAuthor.deletarAuthor(Author.getId());
            return true;
        }
    }


