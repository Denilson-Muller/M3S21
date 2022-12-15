package br.com.futurodev.Exercicio.service;

import br.com.futurodev.Exercicio.Repositorio.RepositoryAuthor;
import br.com.futurodev.Exercicio.entidades.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAuthor {

    @Autowired
    private RepositoryAuthor repositoryAuthor;

    public List<Author> buscarAuthors() {
        return repositoryAuthor.findAll();
    }

    public Author salvar(Author author) {
        return repositoryAuthor.save(author);
    }

    public void deletarAuthor(Long ID){
        repositoryAuthor.delete(ID);
    }
}
