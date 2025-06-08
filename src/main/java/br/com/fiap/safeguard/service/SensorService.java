package br.com.fiap.safeguard.service;

import br.com.fiap.safeguard.model.Sensor;
import br.com.fiap.safeguard.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    @Autowired
    private SensorRepository repository;

    public List<Sensor> listar() {
        return repository.findAll();
    }

    public Page<Sensor> listarPaginado(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    public Optional<Sensor> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Sensor salvar(Sensor obj) {
        return repository.save(obj);
    }

    public Sensor atualizar(Long id, Sensor objAtualizado) {
        Sensor sensorExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sensor não encontrado"));

        sensorExistente.setTipo(objAtualizado.getTipo());
        sensorExistente.setUnidade(objAtualizado.getUnidade());
        sensorExistente.setValorMinimo(objAtualizado.getValorMinimo());
        sensorExistente.setValorMaximo(objAtualizado.getValorMaximo());
        sensorExistente.setDescricao(objAtualizado.getDescricao());

        return repository.save(sensorExistente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
