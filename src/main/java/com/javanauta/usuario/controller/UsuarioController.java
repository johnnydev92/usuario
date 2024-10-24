package com.javanauta.usuario.controller;


<<<<<<< HEAD
import com.javanauta.usuario.business.UsuarioService;
import com.javanauta.usuario.business.dto.EnderecoDTO;
import com.javanauta.usuario.business.dto.TelefoneDTO;
import com.javanauta.usuario.business.dto.UsuarioDTO;
import com.javanauta.usuario.infrastructure.security.JwtUtil;
=======
import com.javanauta.usuario.business.DTO.EnderecoDTO;
import com.javanauta.usuario.business.DTO.TelefoneDTO;
import com.javanauta.usuario.business.DTO.UsuarioDTO;
import com.javanauta.usuario.business.UsuarioService;
import com.javanauta.usuario.infrastructure.Entity.Usuario;
import com.javanauta.usuario.infrastructure.Security.JwtUtil;
>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @PostMapping
<<<<<<< HEAD
    public ResponseEntity <UsuarioDTO> salvaUsuario(@RequestBody UsuarioDTO usuarioDTO){

        return ResponseEntity.ok(usuarioService.salvaUsuario(usuarioDTO));

    }

=======
    public ResponseEntity<UsuarioDTO> salvaUsuario(@RequestBody UsuarioDTO usuarioDTO){

        return ResponseEntity.ok(usuarioService.salvaUsuario(usuarioDTO));
    }


>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
    @PostMapping("/login")
    public String login (@RequestBody UsuarioDTO usuarioDTO){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(usuarioDTO.getEmail(), usuarioDTO.getSenha())
        );
        return "Bearer " + jwtUtil.generateToken(authentication.getName());
    }

    @GetMapping
    public ResponseEntity<UsuarioDTO> buscaUsuarioPorEmail(@RequestParam("email") String email){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<Void> deletaUsuarioPorEmail(@PathVariable String email){
        usuarioService.deletaUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<UsuarioDTO> atualizaDadoUsuario(@RequestBody UsuarioDTO dto,
                                                          @RequestHeader("Authorization") String token){
        return ResponseEntity.ok(usuarioService.atualizaDadosUsuario(token, dto));
    }

    @PutMapping("/endereco")
<<<<<<< HEAD
    public ResponseEntity<EnderecoDTO> atulizaEndereco(@RequestBody EnderecoDTO dto,
                                                       @RequestParam("id") Long id){
=======
    public ResponseEntity<EnderecoDTO> atualizaEndereco(@RequestBody EnderecoDTO dto,
                                                        @RequestParam("id") Long id){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return ResponseEntity.ok(usuarioService.atualizaEndereco(id, dto));
    }

    @PutMapping("/telefone")
<<<<<<< HEAD
    public ResponseEntity<TelefoneDTO> atulizaTelefone(@RequestBody TelefoneDTO dto,
                                                       @RequestParam("id") Long id){
=======
    public ResponseEntity<TelefoneDTO> atualizaTelefome(@RequestBody TelefoneDTO dto,
                                                        @RequestParam("id") Long id){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return ResponseEntity.ok(usuarioService.atualizaTelefone(id, dto));
    }

    @PostMapping("/endereco")
    public ResponseEntity<EnderecoDTO> cadastraEndereco(@RequestBody EnderecoDTO dto,
<<<<<<< HEAD
                                                       @RequestHeader("Authorization") String token){
=======
                                                        @RequestHeader("Authorization") String token){

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return ResponseEntity.ok(usuarioService.cadastraEndereco(token, dto));
    }

    @PostMapping("/telefone")
    public ResponseEntity<TelefoneDTO> cadastraTelefone(@RequestBody TelefoneDTO dto,
                                                        @RequestHeader("Authorization") String token){
<<<<<<< HEAD
=======

>>>>>>> b7c80b8b15f0dccab7336d390d658835084ca09c
        return ResponseEntity.ok(usuarioService.cadastraTelefone(token, dto));
    }
}
