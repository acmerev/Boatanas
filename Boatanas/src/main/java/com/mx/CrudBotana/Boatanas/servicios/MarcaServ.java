package com.mx.CrudBotana.Boatanas.servicios;

import com.mx.CrudBotana.Boatanas.dominio.Marca;

import java.util.List;

public interface MarcaServ {

    public void guardar(Marca marca);
    public void editar(Marca marca);
    public void eliminar(Marca marca);
    public Marca buscar(Marca marca);
    public List<Marca> listar();

}
