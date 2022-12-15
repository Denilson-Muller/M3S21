package br.com.futurodev.Exercicio.service;

import br.com.futurodev.Exercicio.Repositorio.RepositoryClient;
import br.com.futurodev.Exercicio.entidades.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient {

    @Autowired
    private RepositoryClient repositoryClient;

    public Client salvar(Client client) {
        //create / update
        return repositoryClient.save(client);
    }
    public List<Client> buscarClients(){
        //read
        return repositoryClient.findAll();
    }
    public void excluir(Long id){
        //delete
        repositoryClient.delete(id);
    }

}
