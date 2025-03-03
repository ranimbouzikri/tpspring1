package firstApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import firstApp.entity.Etudiant;



@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {
}
