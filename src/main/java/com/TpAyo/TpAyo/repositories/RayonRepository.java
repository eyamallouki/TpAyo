package com.TpAyo.TpAyo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TpAyo.TpAyo.entities.Rayon;
@Repository
public interface RayonRepository extends JpaRepository<Rayon ,Long > {
}
