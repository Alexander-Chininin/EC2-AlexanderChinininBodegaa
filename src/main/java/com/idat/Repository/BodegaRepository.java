package com.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.modelo.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer> {

}
