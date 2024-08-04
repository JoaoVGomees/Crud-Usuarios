package com.crud.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
