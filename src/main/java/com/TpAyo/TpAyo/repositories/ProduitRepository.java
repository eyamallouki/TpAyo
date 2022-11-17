package com.TpAyo.TpAyo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TpAyo.TpAyo.entities.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
