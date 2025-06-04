
package br.com.fiap.safeguard.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class InMemoryUserDetailsService implements UserDetailsService {

    private static final String USERNAME = "admin";
    private static final String PASSWORD_HASH = new BCryptPasswordEncoder().encode("admin");

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (USERNAME.equals(username)) {
            return User.builder()
                    .username(USERNAME)
                    .password(PASSWORD_HASH)
                    .roles("ADMIN")
                    .build();
        }
        throw new UsernameNotFoundException("Usuário não encontrado");
    }
}
