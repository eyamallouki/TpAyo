package com.TpAyo.TpAyo.services;

import com.TpAyo.TpAyo.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.TpAyo.TpAyo.entities.Facture;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FactureServiceImp implements ICrudService<Facture ,Long> , IFactureService{



    @Autowired
    FactureRepository factureRepository ;
    @Override
    public List<Facture> getAll() {
        return factureRepository.findAll();
    }

    @Override
    public Facture add(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture update(Facture facture  , Long idFacture) {
        if(factureRepository.findById(idFacture).isPresent()) {

            Facture facture1 = factureRepository.findById(idFacture).get();
            facture1.setMontantFacture(facture.getMontantFacture());
            facture1.setActive(facture.getActive());
            facture1.setMontantRemise(facture.getMontantRemise());
            facture1.setClient(facture.getClient());
            return factureRepository.save(facture1);
        }
        return null;
    }

    @Override
    public void delete(Long idFacture) {
        factureRepository.deleteById(idFacture);

    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
       // return factureRepository.findFactureByClient(idClient);
        return factureRepository.findAll().stream().filter(facture -> facture.getClient().getIdClient().equals(idClient)).collect(Collectors.toList());

    }
}
