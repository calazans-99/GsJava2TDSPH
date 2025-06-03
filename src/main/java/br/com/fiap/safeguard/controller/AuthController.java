
package br.com.fiap.safeguard.controller;

import br.com.fiap.safeguard.dto.LoginRequestDTO;
import br.com.fiap.safeguard.dto.TokenResponseDTO;
import br.com.fiap.safeguard.model.Usuario;
import br.com.fiap.safeguard.service.JwtService;
import br.com.fiap.safeguard.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDTO request) {
        Usuario user = new Usuario(request.getUsername(), request.getPassword());
        if (usuarioService.autenticar(user)) {
            String token = jwtService.generateToken(user.getUsername());
            return ResponseEntity.ok(new TokenResponseDTO(token));
        } else {
            return ResponseEntity.status(401).body("Usuário ou senha inválidos");
        }
    }

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Acesso autorizado com JWT!");
    }
}
