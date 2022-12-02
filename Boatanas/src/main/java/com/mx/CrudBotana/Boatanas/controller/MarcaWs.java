package com.mx.CrudBotana.Boatanas.controller;

import com.mx.CrudBotana.Boatanas.dominio.Marca;
import com.mx.CrudBotana.Boatanas.servicios.MarcaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Marca")
@CrossOrigin
public class MarcaWs {
    @Autowired
    MarcaServ marcaServ;

    @GetMapping("listar")
    public List<Marca> listar(){
        var lista = marcaServ.listar();
        return lista;
    }

    @PostMapping("buscar")
    public Marca buscar(@RequestBody Marca marca){
        marca = marcaServ.buscar(marca);
        return marca;
    }

    @PostMapping("guardar")
    public void guardar(@RequestBody Marca marca){
        marcaServ.guardar(marca);
    }
    @PostMapping("editar")
    public void editar(@RequestBody Marca marca){
        marcaServ.editar(marca);
    }
    @PostMapping("eliminar")
    public void eliminar(@RequestBody Marca marca){
        marcaServ.eliminar(marca);
    }



}
