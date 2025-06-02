package br.com.fiap.safeguard.repository;

import br.com.fiap.safeguard.model.Risco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiscoRepository extends JpaRepository<Risco, Long> {
}
