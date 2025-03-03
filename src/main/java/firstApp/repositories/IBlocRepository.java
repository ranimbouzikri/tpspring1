package firstApp.repositories;

import firstApp.entity.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlocRepository extends CrudRepository<Bloc, Integer> {
}
