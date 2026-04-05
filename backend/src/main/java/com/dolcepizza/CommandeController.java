package com.dolcepizza;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CommandeController {

private final CommandeRepository repo;

// Injection propre (meilleure pratique)
public CommandeController(CommandeRepository repo) {
    this.repo = repo;
}

@PostMapping("/commandes")
public Commande save(@RequestBody Commande commande) {
    return repo.save(commande);
}

@GetMapping("/commandes")
public List<Commande> getAll() {
    return repo.findAll();
}
@DeleteMapping("/commandes/{id}")
public void delete(@PathVariable Long id) {
    repo.deleteById(id);
}

}
