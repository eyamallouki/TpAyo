package com.TpAyo.TpAyo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.TpAyo.TpAyo.entities.Produit;
import com.TpAyo.TpAyo.services.ProduitServiceImp;

import java.util.List;

@RestController
@RequestMapping("produit")
public class ProduitController {
    @Autowired
    ProduitServiceImp produitService;

    @GetMapping("/All")
    List<Produit> getAllProduits () {
        return   produitService.getAll();
    }

    @PostMapping("/add")
    Produit addProduit(@RequestBody Produit porduit){
        return produitService.add(porduit);
    }

    @PutMapping("/update/{idProduit}")
    Produit updateProduit(@RequestBody Produit porduit , @PathVariable Long idProduit) {
        return produitService.update(porduit,idProduit) ;
    }

    @DeleteMapping("/delete/{idProduit}")
    void deleteProduit(@PathVariable Long idProduit) {
        produitService.delete(idProduit);
    }


}
