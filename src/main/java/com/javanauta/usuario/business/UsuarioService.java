package com.javanauta.usuario.business;

<<<<<<< HEAD
import com.javanauta.usuario.business.converter.UsuarioConverter;
import com.javanauta.usuario.business.dto.EnderecoDTO;
import com.javanauta.usuario.business.dto.TelefoneDTO;
import com.javanauta.usuario.business.dto.UsuarioDTO;
=======

import com.javanauta.usuario.business.DTO.EnderecoDTO;
import com.javanauta.usuario.business.DTO.TelefoneDTO;
import com.javanauta.usuario.business.DTO.UsuarioDTO;
import com.javanauta.usuario.business.converter.UsuarioConverter;
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
import com.javanauta.usuario.infrastructure.Entity.Endereco;
import com.javanauta.usuario.infrastructure.Entity.Telefone;
import com.javanauta.usuario.infrastructure.Entity.Usuario;
import com.javanauta.usuario.infrastructure.Exceptions.ConflictException;
import com.javanauta.usuario.infrastructure.Exceptions.ResourceNotFoundException;
import com.javanauta.usuario.infrastructure.Repository.EnderecoRepository;
import com.javanauta.usuario.infrastructure.Repository.TelefoneRepository;
import com.javanauta.usuario.infrastructure.Repository.UsuarioRepository;
<<<<<<< HEAD
import com.javanauta.usuario.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
=======
import com.javanauta.usuario.infrastructure.Security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
<<<<<<< HEAD
=======

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final EnderecoRepository enderecoRepository;
    private final TelefoneRepository telefoneRepository;

<<<<<<< HEAD
    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
=======
    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        emailExiste(usuarioDTO.getEmail());
        usuarioDTO.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }

<<<<<<< HEAD
    public void emailExiste(String email){
        try{
            boolean existe =  verificaEmailExistente(email);
            if(existe) {
                throw new ConflictException("Email já cadastrado" + email);
            }

        }catch (ConflictException e){
=======
    public void emailExiste(String email) {
        try {
            boolean existe = verificaEmailExistente(email);
            if (existe) {
                throw new ConflictException("Email já cadastrado" + email);
            }

        } catch (ConflictException e) {
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
            throw new ConflictException("Email já cadastrado" + e.getCause());
        }
    }

<<<<<<< HEAD
    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }
    public UsuarioDTO buscarUsuarioPorEmail(String email){
        try {
            return usuarioConverter.paraUsuarioDTO(
                    usuarioRepository.findByEmail(email)
                            .orElseThrow(()
                    -> new ResourceNotFoundException("Email não encontrado" + email)
                            )
            );
        }catch (ResourceNotFoundException e){
            throw new ResourceNotFoundException("Email não encontrado " + email);
        }
=======
    public boolean verificaEmailExistente(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public UsuarioDTO buscarUsuarioPorEmail(String email){

        try {
            return usuarioConverter.paraUsuarioDTO(
                    usuarioRepository.findByEmail(email).orElseThrow(
                    () -> new ResourceNotFoundException("Email não encontrado" + email)));
        }catch (ResourceNotFoundException e){
            throw new ResourceNotFoundException("Email não encontrado " + email);
        }

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
    }

    public void deletaUsuarioPorEmail(String email){
        usuarioRepository.deleteByEmail(email);
    }

    public UsuarioDTO atualizaDadosUsuario(String token, UsuarioDTO dto){
<<<<<<< HEAD
        //Aqui buscamos o email do usuario atraves do token (tirar a obrigatoriedade do email)
        String email = jwtUtil.extrairEmailToken(token.substring(7));

        //Criptografia de senha
        dto.setSenha(dto.getSenha() != null ? passwordEncoder.encode(dto.getSenha()) : null);


        //Busca os dados do usuario no banco de dados
        Usuario usuarioEntity = usuarioRepository.findByEmail(email).orElseThrow(()
                -> new ResourceNotFoundException("Email não localizado"));

        //Mesclou os dados que recebemos na requisicao DTO com os dados do banco de dados
        Usuario usuario = usuarioConverter.updateUsuario(dto, usuarioEntity);
        //Colocou criptografia na senha


        // Salvou os dados do usuario convertidos e depois pegou o retorno e converteu para Usuario DTO
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));

=======

        //Aqui buscamos o email do usuario atraves do token (tira a obrigatoriedade do email)
        String email = jwtUtil.extrairEmailToken(token.substring(7));

        //Criptografia na nossa senha
        dto.setSenha(dto.getSenha() != null ? passwordEncoder.encode(dto.getSenha()) : null);

        //Busca os dados do usuario no banco de dados
        Usuario usuarioEntity = usuarioRepository.findByEmail(email).orElseThrow(() ->
                new ResourceNotFoundException("Email não localizado"));

        //Mesclou os dados que recebemos na requisicao DTO com os dados do banco de dados
        Usuario usuario = usuarioConverter.updateUsuario(dto, usuarioEntity);

        //Salvou os dados do usuario convertido e depois pegou o retorno e converteu para UsuarioDTO
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
    }

    public EnderecoDTO atualizaEndereco(Long idEndereco, EnderecoDTO enderecoDTO){

        Endereco entity = enderecoRepository.findById(idEndereco).orElseThrow(() ->
<<<<<<< HEAD
                new ResourceNotFoundException("Id não encontrado " + idEndereco));

        Endereco endereco = usuarioConverter.updateEndereco(enderecoDTO, entity);

       return usuarioConverter.paraEnderecoDTO(enderecoRepository.save(endereco));
=======
                new ResourceNotFoundException("ID não encontrado " + idEndereco));

        Endereco endereco = usuarioConverter.updateEndereco(enderecoDTO, entity);

        return usuarioConverter.paraEnderecoDTO(enderecoRepository.save(endereco));
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c

    }

    public TelefoneDTO atualizaTelefone(Long idTelefone, TelefoneDTO dto){

<<<<<<< HEAD
        Telefone entity = telefoneRepository.findById(idTelefone).orElseThrow(()->
                new ResourceNotFoundException("Id não encontrado " + idTelefone));
=======
        Telefone entity = telefoneRepository.findById(idTelefone).orElseThrow(() ->
                new ResourceNotFoundException("ID não encontrado " + idTelefone));
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c

        Telefone telefone = usuarioConverter.updateTelefone(dto, entity);

        return usuarioConverter.paraTelefoneDTO(telefoneRepository.save(telefone));
    }

<<<<<<< HEAD
    public EnderecoDTO cadastraEndereco (String token, EnderecoDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow(() ->
                new ResourceNotFoundException("Email não localizado" + email));
=======
    public EnderecoDTO cadastraEndereco(String token, EnderecoDTO dto){

        String email = jwtUtil.extrairEmailToken(token.substring(7));
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow(() ->
                new ResourceNotFoundException("Email não localizado " + email));
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c

        Endereco endereco = usuarioConverter.paraEnderecoEntity(dto, usuario.getId());
        Endereco enderecoEntity = enderecoRepository.save(endereco);
        return usuarioConverter.paraEnderecoDTO(enderecoEntity);
    }

<<<<<<< HEAD
    public TelefoneDTO cadastraTelefone (String token, TelefoneDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow(() ->
                new ResourceNotFoundException("Email não localizado" + email));

        Telefone telefone = usuarioConverter.paraTelefoneEntity(dto, usuario.getId());
        return usuarioConverter.paraTelefoneDTO(
                telefoneRepository.save(telefone)
        );
    }
=======
    public TelefoneDTO cadastraTelefone(String token, TelefoneDTO dto){

        String email = jwtUtil.extrairEmailToken(token.substring(7));
        Usuario usuario = usuarioRepository.findByEmail(email).orElseThrow(() ->
                new ResourceNotFoundException("Email não localizado " + email));

        Telefone telefone = usuarioConverter.paraTelefoneEntity(dto, usuario.getId());
        return usuarioConverter.paraTelefoneDTO(telefoneRepository.save(telefone));
    }

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
}
