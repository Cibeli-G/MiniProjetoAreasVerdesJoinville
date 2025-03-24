package Lab365MiniProjetoAreasVerdesJoinville.repositories;

import Lab365MiniProjetoAreasVerdesJoinville.models.EntidadeAreaVerde;

import java.util.ArrayList;
import java.util.List;

public class EntidadeAreaVerdeRepository {
    public static final List<EntidadeAreaVerde> AREASVERDES = new ArrayList<>();
    public static EntidadeAreaVerde buscarAreaVerde;

    public static EntidadeAreaVerde add(EntidadeAreaVerde novaAreaVerde) {
        novaAreaVerde.setId(AREASVERDES.size() + 1);
        AREASVERDES.add(novaAreaVerde);

        return novaAreaVerde;
    }

    public static List<EntidadeAreaVerde> listarAreasVerdes() {
        return AREASVERDES;
    }

    public static EntidadeAreaVerde buscarAreaVerde(int id) {
        for (EntidadeAreaVerde areaVerde : AREASVERDES) {
            if (areaVerde.getId() == id) {
                return areaVerde;
            }
        }
        return null;
    }

}