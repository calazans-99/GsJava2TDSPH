package br.com.fiap.safeguard.service;

import br.com.fiap.safeguard.model.Risco;
import br.com.fiap.safeguard.repository.RiscoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RiscoService {

    @Autowired
    private RiscoRepository repository;

    public List<Risco> listar() {
        return repository.findAll();
    }

    public Page<Risco> listarPaginado(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    public Optional<Risco> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Risco salvar(Risco obj) {
        return repository.save(obj);
    }

    public Risco atualizar(Long id, Risco objAtualizado) {
        Risco riscoExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Risco não encontrado"));
        riscoExistente.setTipo(objAtualizado.getTipo());
        riscoExistente.setDescricao(objAtualizado.getDescricao());
        riscoExistente.setValor(objAtualizado.getValor());
        return repository.save(riscoExistente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
