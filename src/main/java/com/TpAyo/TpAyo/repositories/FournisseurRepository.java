package com.TpAyo.TpAyo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TpAyo.TpAyo.entities.Fournisseur;
@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur ,Long > {
}
