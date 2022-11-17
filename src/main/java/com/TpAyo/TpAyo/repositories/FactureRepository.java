package com.TpAyo.TpAyo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TpAyo.TpAyo.entities.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture ,Long> {


   // List<Facture> findFactureByClient(Long idClient);
}
