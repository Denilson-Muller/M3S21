package br.com.futurodev.Exercicio.controler;

import br.com.futurodev.Exercicio.entidades.Client;
import br.com.futurodev.Exercicio.service.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ServiceClient serviceClient;

    @GetMapping
    public List<Client> getClients(){
        return serviceClient.buscarClients();
    }

    @PostMapping
    public Client postClient(@RequestBody Client client){
        return serviceClient.salvar(client);
    }

    @PutMapping
    public Client putClient(@RequestBody Client client){
        return serviceClient.salvar(client);
    }
    @DeleteMapping
    public boolean deleteClient(@RequestBody Long id){
        serviceClient.excluir(id);
        return true;
    }
    @GetMapping
    public String getCPF(@RequestBody String cpf){
        return cpf;
    }
}

