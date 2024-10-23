package com.javanauta.usuario.business;


import com.javanauta.usuario.business.DTO.UsuarioDTO;
import com.javanauta.usuario.business.converter.UsuarioConverter;
import com.javanauta.usuario.infrastructure.Entity.Usuario;
import com.javanauta.usuario.infrastructure.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){

        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
