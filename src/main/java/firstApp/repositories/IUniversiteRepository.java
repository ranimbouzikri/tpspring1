package firstApp.repositories;

import firstApp.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUniversiteRepository extends JpaRepository<Universite, Integer> {
}
