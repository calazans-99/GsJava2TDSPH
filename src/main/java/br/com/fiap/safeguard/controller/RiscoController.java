package br.com.fiap.safeguard.controller;

import br.com.fiap.safeguard.model.Risco;
import br.com.fiap.safeguard.service.RiscoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risco")
public class RiscoController {

    @Autowired
    private RiscoService service;

    @GetMapping
    public List<Risco> listar() {
        return service.listar();
    }

    @GetMapping("/paginado")
    public Page<Risco> listarPaginado(@RequestParam(defaultValue = "0") int page,
                                      @RequestParam(defaultValue = "10") int size) {
        return service.listarPaginado(page, size);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Risco> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Risco salvar(@Valid @RequestBody Risco obj) {
        return service.salvar(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Risco> atualizar(@PathVariable Long id, @Valid @RequestBody Risco objAtualizado) {
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
