
package firstApp.controller;

import firstApp.entity.Foyer;
import firstApp.services.FoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/foyers")
public class FoyerController {

    @Autowired
    private FoyerService foyerService;

    // Récupérer tous les foyers
    @GetMapping
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    // Récupérer un foyer par ID
    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable int id) {
        return foyerService.retrieveFoyer(id);
    }

    // Ajouter un foyer
    @PostMapping
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    // Modifier un foyer
    @PutMapping
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    // Supprimer un foyer
    @DeleteMapping("/{id}")
    public void deleteFoyer(@PathVariable int id) {
        foyerService.removeFoyer(id);
    }
}
