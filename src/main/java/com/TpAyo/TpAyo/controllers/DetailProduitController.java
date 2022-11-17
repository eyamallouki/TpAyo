package com.TpAyo.TpAyo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.TpAyo.TpAyo.entities.DetailProduit;
import com.TpAyo.TpAyo.services.DetailProduitServiceImp;

import java.util.List;
@RestController
@RequestMapping("detailProduit")

public class DetailProduitController {
    @Autowired
    DetailProduitServiceImp detailProduitService;

    @GetMapping("/all")
    List<DetailProduit> getAllDetailFactures () {
        return   detailProduitService.getAll();
    }

    @PostMapping("/add")
    DetailProduit addDetailFacture(@RequestBody DetailProduit detailProduit){
        return detailProduitService.add(detailProduit);
    }

    @PutMapping("/update/{idDetailProduit}")
    DetailProduit updateDetailProduit(@RequestBody DetailProduit detailProduit , @PathVariable Long idDetailProduit) {
        return detailProduitService.update(detailProduit,idDetailProduit) ;
    }

    @DeleteMapping("/delete/{idDetailProduit}")
    void deleteDetailProduit(@PathVariable Long idDetailProduit) {
        detailProduitService.delete(idDetailProduit);
    }
}
