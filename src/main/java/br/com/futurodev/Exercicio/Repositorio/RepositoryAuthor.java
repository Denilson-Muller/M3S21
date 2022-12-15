package br.com.futurodev.Exercicio.Repositorio;

import br.com.futurodev.Exercicio.entidades.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryAuthor {

    private static int indice = 1;
    private static List<Author> authors = new ArrayList<>();


    private int gerarID(){
        return indice++;
    }

    public List<Author> findAll(){
        return authors;
    }

    public Author save(Author author) {  //salva um novo author
        if(author == null){
            author.setId(gerarID());
        }else {
            Author authorOld = findByID(author.getId());
            delete(author.getId());
        }
        authors.add(author);
        return author;
    }
    public Author findByID(Long id){  //procura um author pelo ID
        if (id == null)
            return null;
        for (Author author : authors) {
            if (id.equals(author.getId())) {
                return author;
            }
        }
        return null;
    }
    public void delete(Long id){  //deleta um author
        Author authorOld = findByID(id);
        authors.remove(authorOld);
    }
}
