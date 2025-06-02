package br.com.fiap.safeguard.service;

import br.com.fiap.safeguard.model.Estacao;
import br.com.fiap.safeguard.repository.EstacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstacaoService {

    @Autowired
    private EstacaoRepository repository;

    public List<Estacao> listar() {
        return repository.findAll();
    }

    public Page<Estacao> listarPaginado(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    public Optional<Estacao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Estacao salvar(Estacao obj) {
        return repository.save(obj);
    }

    public Estacao atualizar(Long id, Estacao objAtualizado) {
        Estacao estacaoExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estação não encontrada"));
        estacaoExistente.setNome(objAtualizado.getNome());
        estacaoExistente.setLatitude(objAtualizado.getLatitude());
        estacaoExistente.setLongitude(objAtualizado.getLongitude());
        return repository.save(estacaoExistente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
