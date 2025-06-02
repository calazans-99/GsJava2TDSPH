package br.com.fiap.safeguard.service;

import br.com.fiap.safeguard.model.Leitura;
import br.com.fiap.safeguard.repository.LeituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeituraService {

    @Autowired
    private LeituraRepository repository;

    public List<Leitura> listar() {
        return repository.findAll();
    }

    public Page<Leitura> listarPaginado(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    public Optional<Leitura> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Leitura salvar(Leitura obj) {
        return repository.save(obj);
    }

    public Leitura atualizar(Long id, Leitura objAtualizado) {
        Leitura leituraExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Leitura não encontrada"));
        leituraExistente.setDataHora(objAtualizado.getDataHora());
        leituraExistente.setValor(objAtualizado.getValor());
        return repository.save(leituraExistente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
