
package br.com.fiap.safeguard.service;

import br.com.fiap.safeguard.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public boolean autenticar(Usuario usuario) {
        return "admin".equals(usuario.getUsername()) && "admin".equals(usuario.getPassword());
    }
}
