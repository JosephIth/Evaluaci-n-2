package com.Perfulandia.ServicioSucursal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Perfulandia.ServicioSucursal.repository.SucursalRepository;
import com.Perfulandia.ServicioSucursal.model.Sucursal;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    public List<Sucursal> findAll(){
        return sucursalRepository.findAll();
    }

    public Sucursal findbyId(long id){
        return sucursalRepository.findById(id).get();
    }

    public Sucursal save(Sucursal sucursal){
        return sucursalRepository.save(sucursal);
    }

    public void delete(Long id){
        sucursalRepository.deleteById(id);
    }

 
}
