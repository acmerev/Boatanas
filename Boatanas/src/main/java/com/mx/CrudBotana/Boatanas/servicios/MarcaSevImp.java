package com.mx.CrudBotana.Boatanas.servicios;

import com.mx.CrudBotana.Boatanas.dao.MarcaDao;
import com.mx.CrudBotana.Boatanas.dominio.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaSevImp implements MarcaServ{
    @Autowired
    MarcaDao marcaDao;

    @Override
    public void guardar(Marca marca) {
        marcaDao.save(marca);
    }

    @Override
    public void editar(Marca marca) {
        marcaDao.save(marca);
    }

    @Override
    public void eliminar(Marca marca) {
        marcaDao.delete(marca);
    }

    @Override
    public Marca buscar(Marca marca) {
        return marcaDao.findById(marca.getIdmarca()).orElse(null);
    }

    @Override
    public List<Marca> listar() {
        return (List<Marca>) marcaDao.findAll();
    }
}
