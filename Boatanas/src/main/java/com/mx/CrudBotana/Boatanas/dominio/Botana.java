package com.mx.CrudBotana.Boatanas.dominio;

import jakarta.persistence.*;
import org.hibernate.sql.results.graph.Fetch;

@Entity
@Table(name = "BOTANASWS")
public class Botana {

    @Id
    @Column
    int id_botana;
    @Column
    String nombre;
    @Column
    double precio;
    @Column
    double contenido_neto;
    @Column
    String sabor;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MARCA_ID")
    Marca marca;

    public Botana() {
    }

    public Botana(int id_botana) {
        this.id_botana = id_botana;
    }

    public Botana(int id_botana, String nombre, double precio, double contenido_neto, String sabor, Marca marca) {
        this.id_botana = id_botana;
        this.nombre = nombre;
        this.precio = precio;
        this.contenido_neto = contenido_neto;
        this.sabor = sabor;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Botana{" +
                "id_botana=" + id_botana +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", contenido_neto=" + contenido_neto +
                ", sabor='" + sabor + '\'' +
                ", marca=" + marca +
                '}';
    }

    public int getId_botana() {
        return id_botana;
    }

    public void setId_botana(int id_botana) {
        this.id_botana = id_botana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getContenido_neto() {
        return contenido_neto;
    }

    public void setContenido_neto(double contenido_neto) {
        this.contenido_neto = contenido_neto;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
