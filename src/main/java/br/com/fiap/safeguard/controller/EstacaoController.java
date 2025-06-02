package br.com.fiap.safeguard.controller;

import br.com.fiap.safeguard.model.Estacao;
import br.com.fiap.safeguard.service.EstacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estacoes")
public class EstacaoController {

    @Autowired
    private EstacaoService service;

    @GetMapping
    public List<Estacao> listar() {
        return service.listar();
    }

    @GetMapping("/paginado")
    public Page<Estacao> listarPaginado(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "10") int size) {
        return service.listarPaginado(page, size);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estacao> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estacao salvar(@Valid @RequestBody Estacao obj) {
        return service.salvar(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estacao> atualizar(@PathVariable Long id, @Valid @RequestBody Estacao objAtualizado) {
        try {
            return ResponseEntity.ok(service.atualizar(id, objAtualizado));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
