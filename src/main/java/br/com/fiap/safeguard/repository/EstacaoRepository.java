package br.com.fiap.safeguard.repository;

import br.com.fiap.safeguard.model.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacaoRepository extends JpaRepository<Estacao, Long> {
}
