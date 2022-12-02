package com.mx.CrudBotana.Boatanas.servicios;

import com.mx.CrudBotana.Boatanas.dao.BotanaDao;
import com.mx.CrudBotana.Boatanas.dominio.Botana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BotanaServImp implements BotanaServ {
    @Autowired
    BotanaDao botanaDao;

    @Override
    public void guardar(Botana bota) {
        botanaDao.save(bota);
    }

    @Override
    public void editar(Botana bota) {
        botanaDao.save(bota);
    }

    @Override
    public void eliminar(Botana bot) {
         botanaDao.delete(bot);
    }

    @Override
    public Botana buscar(Botana bot) {
        return botanaDao.findById(bot.getId_botana()).orElse(null);
    }

    @Override
    public List<Botana> listar() {
        return (List<Botana>) botanaDao.findAll();
    }
}
