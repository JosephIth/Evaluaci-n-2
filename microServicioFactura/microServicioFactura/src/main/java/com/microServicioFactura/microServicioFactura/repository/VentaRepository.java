package com.microServicioFactura.microServicioFactura.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microServicioFactura.microServicioFactura.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
}

