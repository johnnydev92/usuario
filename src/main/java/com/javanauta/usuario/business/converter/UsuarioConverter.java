package com.javanauta.usuario.business.converter;


import com.javanauta.usuario.business.DTO.EnderecoDTO;
import com.javanauta.usuario.business.DTO.TelefoneDTO;
import com.javanauta.usuario.business.DTO.UsuarioDTO;
import com.javanauta.usuario.infrastructure.Entity.Endereco;
import com.javanauta.usuario.infrastructure.Entity.Telefone;
import com.javanauta.usuario.infrastructure.Entity.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioConverter {

    public Usuario paraUsuario(UsuarioDTO usuarioDTO){

        return Usuario.builder()
                .nome(usuarioDTO.getNome())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
                .enderecos(paraListaEnderecoDTO(usuarioDTO.getEnderecos()))
                .telefones(paraListaTelefoneDTO(usuarioDTO.getTelefones()))
                .build();
    }

    public List<Endereco> paraListaEnderecoDTO(List<EnderecoDTO> enderecoDTOS){

        return enderecoDTOS.stream().map(this::paraEndereco).toList();

    }

    public Endereco paraEndereco(EnderecoDTO enderecoDTO){

        return Endereco.builder()
                .rua(enderecoDTO.getRua())
                .numero(enderecoDTO.getNumero())
                .cidade(enderecoDTO.getCidade())
                .complemento(enderecoDTO.getComplemento())
                .cep(enderecoDTO.getCep())
                .estado(enderecoDTO.getEstado())
                .build();
    }

    public List<Telefone> paraListaTelefoneDTO(List<TelefoneDTO> telefoneDTOS){

        List<Telefone> telefones = new ArrayList<>();
        for(TelefoneDTO telefoneDTO : telefoneDTOS){
            telefones.add(paraTelefone(telefoneDTO));
        }

        return telefones;
    }

    public Telefone paraTelefone(TelefoneDTO telefoneDTO){

        return Telefone.builder()
                .numero(telefoneDTO.getNumero())
                .ddd(telefoneDTO.getDdd())
                .build();
    }

    public UsuarioDTO paraUsuarioDTO(Usuario usuarioDTO){

        return UsuarioDTO.builder()
                .nome(usuarioDTO.getNome())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
                .enderecos(paraListaEndereco(usuarioDTO.getEnderecos()))
                .telefones(paraListaTelefone(usuarioDTO.getTelefones()))
                .build();
    }

    public List<EnderecoDTO> paraListaEndereco(List<Endereco> enderecoDTOS){

        return enderecoDTOS.stream().map(this::paraEnderecoDTO).toList();

    }

    public EnderecoDTO paraEnderecoDTO(Endereco enderecoDTO){

        return EnderecoDTO.builder()
                .rua(enderecoDTO.getRua())
                .numero(enderecoDTO.getNumero())
                .cidade(enderecoDTO.getCidade())
                .complemento(enderecoDTO.getComplemento())
                .cep(enderecoDTO.getCep())
                .estado(enderecoDTO.getEstado())
                .build();
    }

    public List<TelefoneDTO> paraListaTelefone (List<Telefone> telefoneDTOS){

        List<TelefoneDTO> telefones = new ArrayList<>();
        for(Telefone telefoneDTO : telefoneDTOS){
            telefones.add(paraTelefoneDTO(telefoneDTO));
        }

        return telefones;
    }

    public TelefoneDTO paraTelefoneDTO(Telefone telefoneDTO){

        return TelefoneDTO.builder()
                .numero(telefoneDTO.getNumero())
                .ddd(telefoneDTO.getDdd())
                .build();
    }

}
