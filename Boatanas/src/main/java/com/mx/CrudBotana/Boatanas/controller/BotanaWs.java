package com.mx.CrudBotana.Boatanas.controller;


import com.mx.CrudBotana.Boatanas.dominio.Botana;
import com.mx.CrudBotana.Boatanas.servicios.BotanaServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Botana")
@CrossOrigin
public class BotanaWs {
    @Autowired
    BotanaServ botanaServ;

    @GetMapping("listar")
    public List<Botana> listar(){
        var lista = botanaServ.listar();
        return lista;
    }

    @PostMapping("buscar")
    public Botana buscar(@RequestBody Botana botana){
        botana = botanaServ.buscar(botana);
        return botana;
    }

    //http://localhost:9200/api/Celular/guardar
    @PostMapping("guardar")
    public void guardar(@RequestBody Botana botana) {
        botanaServ.guardar(botana);
    }

    //http://localhost:9200/api/Celular/editar
    @PostMapping("editar")
    public void editar(@RequestBody Botana botana) {
        botanaServ.editar(botana);
    }

    //http://localhost:9200/api/Celular/eliminar
    @PostMapping("eliminar")
    public void eliminar(@RequestBody Botana botana) {
         botanaServ.eliminar(botana);
    }


}
