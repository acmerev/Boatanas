package com.mx.CrudBotana.Boatanas.servicios;

import com.mx.CrudBotana.Boatanas.dominio.Botana;

import java.util.List;

public interface BotanaServ {

    public void guardar(Botana bota);
    public void editar(Botana bota);
    public void eliminar(Botana bot);
    public Botana buscar(Botana bot);
    public List<Botana> listar();

}
