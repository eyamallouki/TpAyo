package com.TpAyo.TpAyo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TpAyo.TpAyo.entities.DetailProduit;
@Repository
public interface DetailProduitRepository extends JpaRepository<DetailProduit, Long> {
}
