package br.com.futurodev.Exercicio.service;

import br.com.futurodev.Exercicio.Repositorio.RepositoryBook;
import br.com.futurodev.Exercicio.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBook {

    @Autowired
    private RepositoryBook repositoryBook;

    public List<Book> buscarBooks() {
        return repositoryBook.findAll();
    }

    public Book salvar(Book book) {
        return repositoryBook.save(book);
    }

    public void deletarBook(Long ID){
        repositoryBook.delete(ID);
    }


}