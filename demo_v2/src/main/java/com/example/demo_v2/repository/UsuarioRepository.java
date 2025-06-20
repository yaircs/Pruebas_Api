package com.example.demo_v2.repository;

import com.example.demo_v2.model.User_model;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UsuarioRepository extends CrudRepository<User_model, Long> {

    public abstract ArrayList<User_model> findByPrioridad(Integer prioridad);
}
