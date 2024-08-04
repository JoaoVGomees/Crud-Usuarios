package com.crud.usuarios.model.dto;

import com.crud.usuarios.model.Usuario;

public class ToDTO {

	public class UsuarioConverter {
	    public static UsuarioDTO toDTO(Usuario usuario) {
	        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail());
	    }
	}
	
}
