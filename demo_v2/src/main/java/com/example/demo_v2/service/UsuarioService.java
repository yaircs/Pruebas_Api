package com.example.demo_v2.service;

import com.example.demo_v2.model.User_model;
import com.example.demo_v2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<User_model> obtenerUsuarios(){
        return (ArrayList<User_model>) usuarioRepository.findAll();
    }

    public User_model guardarUsuario(User_model usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<User_model> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }


    public ArrayList<User_model>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


}
