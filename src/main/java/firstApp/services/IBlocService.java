package firstApp.services;

import firstApp.entity.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc(Bloc bloc);

    Bloc addBloc(Bloc bloc);

    Bloc retrieveBloc(long idBloc);
}
