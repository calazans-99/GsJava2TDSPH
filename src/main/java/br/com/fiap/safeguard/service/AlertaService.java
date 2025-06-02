package br.com.fiap.safeguard.service;

import br.com.fiap.safeguard.model.Alerta;
import br.com.fiap.safeguard.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository repository;

    public List<Alerta> listar() {
        return repository.findAll();
    }

    public Page<Alerta> listarPaginado(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    public Optional<Alerta> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Alerta salvar(Alerta obj) {
        return repository.save(obj);
    }

    public Alerta atualizar(Long id, Alerta objAtualizado) {
        Alerta alertaExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta não encontrado"));
        // Atualizar campos conforme necessário
        alertaExistente.setDescricao(objAtualizado.getDescricao());
        alertaExistente.setNivel(objAtualizado.getNivel());
        alertaExistente.setStatus(objAtualizado.getStatus());
        return repository.save(alertaExistente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
