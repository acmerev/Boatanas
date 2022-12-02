package com.mx.CrudBotana.Boatanas.dominio;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MARCA_BOTANAWS")
public class Marca {
@Id
@Column
int idmarca;
@Column
    String nombre;
@Column
    String pais;
@Column
    String slogan;

@OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
List<Botana> lista = new ArrayList<Botana>();

    public Marca() {
    }

    public Marca(int idmarca) {
        this.idmarca = idmarca;
    }

    public Marca(int idmarca, String nombre, String pais, String slogan, List<Botana> lista) {
        this.idmarca = idmarca;
        this.nombre = nombre;
        this.pais = pais;
        this.slogan = slogan;
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "idmarca=" + idmarca +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", slogan='" + slogan + '\'' +
                ", lista=" + lista +
                '}';
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public List<Botana> getLista() {
        return lista;
    }

    public void setLista(List<Botana> lista) {
        this.lista = lista;
    }
}
