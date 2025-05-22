package com.Perfulandia.ServicioSucursal.repository;

import com.Perfulandia.ServicioSucursal.model.Sucursal;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository <Sucursal, Long> {

    List<Sucursal> findByComuna(String comuna);

}
