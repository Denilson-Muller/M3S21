package br.com.futurodev.Exercicio.controler;


import br.com.futurodev.Exercicio.entidades.Book;
import br.com.futurodev.Exercicio.service.ServiceBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")

public class BookController {

    @Autowired
    private ServiceBook serviceBook;

    @GetMapping
    public List<Book> getAuthors(){
        return serviceBook.buscarBooks();
    }
    @PostMapping
    public Book postBook(@RequestBody Book book){
        return serviceBook.salvar(book);
    }
    @PutMapping
    public Book putBook(@RequestBody Book book){
        return serviceBook.salvar(book);
    }
    @DeleteMapping
    public boolean deleteBook(@RequestBody Book book){
        serviceBook.deletarBook(book.getId());
        return true;
    }
}