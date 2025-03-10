package firstApp.repositories;

import firstApp.entity.Chambre;
import firstApp.entity.TypeChambre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre, Integer> {
    @Query("SELECT c FROM Chambre c WHERE c.bloc.foyer.universite.nomUniversite = :nomUniversite AND c.typeC = :type AND c.reservations IS EMPTY")
    List<Chambre> findChambresNonReservees(String nomUniversite, TypeChambre type);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeC = :typeC")
    List<Chambre> findChambresByBlocAndTypeJPQL(long idBloc, TypeChambre typeC);

    List<Chambre> findByBlocIdBlocAndTypeC(long idBloc, TypeChambre type);
}
