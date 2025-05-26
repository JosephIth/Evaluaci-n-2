package com.Perfulandia.ServicioSucursal.controller;

import com.Perfulandia.ServicioSucursal.service.*;
import com.Perfulandia.ServicioSucursal.model.Sucursal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.RequestParam;*/
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


 

@RestController
@RequestMapping("/api/V1/Sucursales")
public class SucursalController {


    @Autowired
    private SucursalService sucursalService; 

    //Mostrar Lista de sucursal//
    @GetMapping
    public ResponseEntity<List<Sucursal>> listar() {
        List<Sucursal> listaSucursales  = sucursalService.findAll();
        if (listaSucursales.isEmpty()) {
            return ResponseEntity.noContent().build();
            
        }
        return ResponseEntity.ok(listaSucursales);
        
    }

    //Guardar una nueva sucursal//
    @PostMapping
    public ResponseEntity<Sucursal> guardar(@RequestBody Sucursal sucursal) {
        Sucursal nuevaSucursal = sucursalService.save(sucursal);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaSucursal);
    //    return new ResponseEntity<>(productoMuevo, HttpStatus.ACCEPTED);
    }


    //buscar sucursal por id//
    @GetMapping("/{id}")
    public ResponseEntity<Sucursal> buscar(@PathVariable Integer id) {
        try {
            Sucursal sucursal = sucursalService.findbyId(id);
            return ResponseEntity.ok(sucursal);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    //Actualizar una sucrusal//
    @PutMapping("/{id}")
    public ResponseEntity<Sucursal> actualizar(@PathVariable Integer id, @RequestBody Sucursal sucursal) {
        try {
            Sucursal sucu = sucursalService.findbyId(id);
            sucu.setId(id);
            sucu.setDireccion(sucursal.getDireccion());
            sucu.setComuna(sucursal.getComuna());
            sucu.setHorarioApertura(sucursal.getHorarioApertura());
            sucu.setHorarioCierre(sucursal.getHorarioCierre());
            sucu.setPersonal(sucursal.getPersonal());
            sucu.setTelefono(sucursal.getTelefono());

            sucursalService.save(sucu);
            return ResponseEntity.ok(sucursal);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        
    }

    //eliminar sucursal//
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        try {
            sucursalService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    

    //Buscar sucursal por comuna//
    @GetMapping("/comuna/{comuna}")
    public ResponseEntity <List<Sucursal>> buscar(@PathVariable String comuna) {
        try {
            List<Sucursal> listaSucursal = sucursalService.findbycomuna(comuna);
            return ResponseEntity.ok(listaSucursal);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}
