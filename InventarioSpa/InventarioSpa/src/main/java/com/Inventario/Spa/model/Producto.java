package com.Inventario.Spa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table( name= "producto")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto; 

    @Column(nullable=false)
    private String nombre;

    @Column(nullable = false)
    private String Descripción; 

    @Column(nullable = false)
    private double Precio;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private String categoria;

}
