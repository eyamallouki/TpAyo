package com.TpAyo.TpAyo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.TpAyo.TpAyo.entities.Client;
import com.TpAyo.TpAyo.services.ClientServiceImp;

import java.util.List;

@RestController
@RequestMapping("Client")
public class ClientController {
    @Autowired
    ClientServiceImp clientService;

    @GetMapping("/All")
    List<Client> getAllClients () {
        return   clientService.getAll();
    }

    @PostMapping("/add")
    Client addClient(@RequestBody Client client){
        return clientService.add(client);
    }

    @PutMapping("/update/{idClient}")
   Client updateClient(@RequestBody Client client , @PathVariable Long idClient) {
        return clientService.update(client,idClient) ;
    }

    @DeleteMapping("/delete/{idClient}")
    void deleteClient(@PathVariable Long idClient) {
       clientService.delete(idClient);
    }
}
