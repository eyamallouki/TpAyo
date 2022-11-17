package com.TpAyo.TpAyo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TpAyo.TpAyo.entities.DetailFacture;
@Repository
public interface DetailFactureRepository extends JpaRepository<DetailFacture , Long > {
}
