package firstApp.services;

import firstApp.entity.Reservation;
import firstApp.repositories.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationService implements IReservationService {
    @Autowired
    IReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {

        return List.of();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(Integer.valueOf(idReservation)).get();
    }
}
