package firstApp.repositories;

import firstApp.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface IReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("SELECT r FROM Reservation r WHERE r.anneeUniversitaire = :anneeUniversitaire AND r.chambre.bloc.foyer.universite.nomUniversite = :nomUniversite")
    List<Reservation> findReservationsByAnneeUniversitaireAndNomUniversite(Date anneeUniversitaire, String nomUniversite);
}
