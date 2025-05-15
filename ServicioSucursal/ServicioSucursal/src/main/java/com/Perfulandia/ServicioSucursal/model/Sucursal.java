package com.Perfulandia.ServicioSucursal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Sucursal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Integer id;

    @Column(nullable = false)
    private String  direccion;

    @Column(nullable = false)
    private String  comuna;

    @Column(nullable = false)
    private String  horarioApertura;

    @Column(nullable = false)
    private String  horarioCierre;
    
    @Column(nullable = false)
    private Integer personal; 

    @Column(nullable = false)
    private String telefono;


}
