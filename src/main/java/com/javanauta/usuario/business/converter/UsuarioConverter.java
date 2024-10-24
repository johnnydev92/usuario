package com.javanauta.usuario.business.converter;

<<<<<<< HEAD
import com.javanauta.usuario.business.dto.EnderecoDTO;
import com.javanauta.usuario.business.dto.TelefoneDTO;
import com.javanauta.usuario.business.dto.UsuarioDTO;
=======

import com.javanauta.usuario.business.DTO.EnderecoDTO;
import com.javanauta.usuario.business.DTO.TelefoneDTO;
import com.javanauta.usuario.business.DTO.UsuarioDTO;
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
import com.javanauta.usuario.infrastructure.Entity.Endereco;
import com.javanauta.usuario.infrastructure.Entity.Telefone;
import com.javanauta.usuario.infrastructure.Entity.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioConverter {

<<<<<<< HEAD
    public Usuario paraUsuario (UsuarioDTO usuarioDTO){
=======
    public Usuario paraUsuario(UsuarioDTO usuarioDTO){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return Usuario.builder()
                .nome(usuarioDTO.getNome())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
<<<<<<< HEAD
                .enderecos(paraListaEndereco(usuarioDTO.getEnderecos()))
=======
                .enderecos(paraListaEnderecos(usuarioDTO.getEnderecos()))
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
                .telefones(paraListaTelefones(usuarioDTO.getTelefones()))
                .build();
    }

<<<<<<< HEAD
    public List<Endereco> paraListaEndereco(List<EnderecoDTO> enderecoDTOS){
            List<Endereco> enderecos = new ArrayList<>();
            for(EnderecoDTO enderecoDTO : enderecoDTOS){
                enderecos.add(paraEndereco(enderecoDTO));
            }
            return enderecos;
    }

    public Endereco paraEndereco(EnderecoDTO enderecoDTO){
=======
    public List<Endereco> paraListaEnderecos(List<EnderecoDTO> enderecoDTOS){

        return enderecoDTOS.stream().map(this::paraEndereco).toList();

    }

    public Endereco paraEndereco(EnderecoDTO enderecoDTO){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return Endereco.builder()
                .rua(enderecoDTO.getRua())
                .numero(enderecoDTO.getNumero())
                .cidade(enderecoDTO.getCidade())
                .complemento(enderecoDTO.getComplemento())
                .cep(enderecoDTO.getCep())
                .estado(enderecoDTO.getEstado())
                .build();
    }

    public List<Telefone> paraListaTelefones(List<TelefoneDTO> telefoneDTOS){
<<<<<<< HEAD
            return telefoneDTOS.stream().map(this::paraTelefoneDTO).toList();
    }

    public Telefone paraTelefoneDTO(TelefoneDTO telefoneDTO){
=======

        List<Telefone> telefones = new ArrayList<>();
        for(TelefoneDTO telefoneDTO : telefoneDTOS){
            telefones.add(paraTelefone(telefoneDTO));
        }

        return telefones;
    }

    public Telefone paraTelefone(TelefoneDTO telefoneDTO){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return Telefone.builder()
                .numero(telefoneDTO.getNumero())
                .ddd(telefoneDTO.getDdd())
                .build();
    }

<<<<<<< HEAD
    public UsuarioDTO paraUsuarioDTO (Usuario usuarioDTO){
=======
    public UsuarioDTO paraUsuarioDTO(Usuario usuarioDTO){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return UsuarioDTO.builder()
                .nome(usuarioDTO.getNome())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
<<<<<<< HEAD
                .enderecos(paraListaEnderecoDTO(usuarioDTO.getEnderecos()))
=======
                .enderecos(paraListaEnderecosDTO(usuarioDTO.getEnderecos()))
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
                .telefones(paraListaTelefonesDTO(usuarioDTO.getTelefones()))
                .build();
    }

<<<<<<< HEAD
    public List<EnderecoDTO> paraListaEnderecoDTO(List<Endereco> enderecoDTOS){
        List<EnderecoDTO> enderecos = new ArrayList<>();
        for(Endereco enderecoDTO : enderecoDTOS){
            enderecos.add(paraEnderecoDTO(enderecoDTO));
        }
        return enderecos;
    }

    public EnderecoDTO paraEnderecoDTO(Endereco endereco){
=======
    public List<EnderecoDTO> paraListaEnderecosDTO(List<Endereco> enderecoDTOS){

        return enderecoDTOS.stream().map(this::paraEnderecoDTO).toList();

    }

    public EnderecoDTO paraEnderecoDTO(Endereco endereco){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return EnderecoDTO.builder()
                .id(endereco.getId())
                .rua(endereco.getRua())
                .numero(endereco.getNumero())
                .cidade(endereco.getCidade())
                .complemento(endereco.getComplemento())
                .cep(endereco.getCep())
                .estado(endereco.getEstado())
                .build();
    }

<<<<<<< HEAD
    public List<TelefoneDTO> paraListaTelefonesDTO(List<Telefone> telefoneDTOS){
        return telefoneDTOS.stream().map(this::paraTelefoneDTO).toList();
    }

    public TelefoneDTO paraTelefoneDTO(Telefone telefone){
=======
    public List<TelefoneDTO> paraListaTelefonesDTO (List<Telefone> telefoneDTOS){

        List<TelefoneDTO> telefones = new ArrayList<>();
        for(Telefone telefoneDTO : telefoneDTOS){
            telefones.add(paraTelefoneDTO(telefoneDTO));
        }

        return telefones;
    }

    public TelefoneDTO paraTelefoneDTO(Telefone telefone){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return TelefoneDTO.builder()
                .id(telefone.getId())
                .numero(telefone.getNumero())
                .ddd(telefone.getDdd())
                .build();
    }

<<<<<<< HEAD
    public Usuario updateUsuario(UsuarioDTO usuarioDTO, Usuario entity) {
=======
    public Usuario updateUsuario(UsuarioDTO usuarioDTO, Usuario entity){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return Usuario.builder()
                .nome(usuarioDTO.getNome() != null ? usuarioDTO.getNome() : entity.getNome())
                .id(entity.getId())
                .senha(usuarioDTO.getSenha() != null ? usuarioDTO.getSenha() : entity.getSenha())
                .email(usuarioDTO.getEmail() != null ? usuarioDTO.getEmail() : entity.getEmail())
                .enderecos(entity.getEnderecos())
                .telefones(entity.getTelefones())
                .build();
    }

    public Endereco updateEndereco(EnderecoDTO dto, Endereco entity){
<<<<<<< HEAD
=======

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return Endereco.builder()
                .id(entity.getId())
                .rua(dto.getRua() != null ? dto.getRua() : entity.getRua())
                .numero(dto.getNumero() != null ? dto.getNumero() : entity.getNumero())
                .cidade(dto.getCidade() != null ? dto.getCidade() : entity.getCidade())
                .cep(dto.getCep() != null ? dto.getCep() : entity.getCep())
                .complemento(dto.getComplemento() != null ? dto.getComplemento() : entity.getComplemento())
                .estado(dto.getEstado() != null ? dto.getEstado() : entity.getEstado())
                .build();
    }

    public Telefone updateTelefone(TelefoneDTO dto, Telefone entity){
<<<<<<< HEAD
        return Telefone.builder()
                .id(entity.getId())
                .ddd(dto.getDdd() != null ? dto.getDdd() : entity.getDdd())
                .numero(dto.getNumero() != null ? dto.getNumero() : entity.getDdd())
=======

        return Telefone.builder()
                .id(entity.getId())
                .ddd(dto.getDdd() != null ? dto.getDdd() : entity.getDdd())
                .numero(dto.getNumero() != null ? dto.getNumero() : entity.getNumero())
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
                .build();
    }

    public Endereco paraEnderecoEntity(EnderecoDTO dto, Long idUsuario){
<<<<<<< HEAD
=======

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return Endereco.builder()
                .rua(dto.getRua())
                .cidade(dto.getCidade())
                .cep(dto.getCep())
                .complemento(dto.getComplemento())
                .estado(dto.getEstado())
<<<<<<< HEAD
=======
                .numero(dto.getNumero())
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
                .usuario_id(idUsuario)
                .build();
    }

    public Telefone paraTelefoneEntity(TelefoneDTO dto, Long idUsuario){
<<<<<<< HEAD
=======

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return Telefone.builder()
                .numero(dto.getNumero())
                .ddd(dto.getDdd())
                .usuario_id(idUsuario)
                .build();
    }
<<<<<<< HEAD
=======

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
}
