package br.com.futurodev.Exercicio.Repositorio;

import br.com.futurodev.Exercicio.entidades.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryBook {

    private static int indice = 1;
    private static List<Book> books = new ArrayList<>();

    private long gerarID(){
        return indice++;
    }

    public List<Book> findAll(){
        return books;
    }

    public Book save(Book book) {  //salva um novo Book
        if(book == null){
            book.setId(gerarID());
        }else {
            Book BookOld = findByID(book.getId());
            delete(book.getId());
        }
        books.add(book);
        return book;
    }
    public Book findByID(Long id){  //procura um Book pelo ID
        if (id == null)
            return null;
        for (Book book : books) {
            if (id.equals(book.getId())) {
                return book;
            }
        }
        return null;
    }
    public void delete(Long id){  //deleta um Book
        Book bookOld = findByID(id);
        books.remove(bookOld);
    }
}

