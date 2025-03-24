package Lab365MiniProjetoAreasVerdesJoinville.repositories;

import Lab365MiniProjetoAreasVerdesJoinville.models.Localizacao;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    private static List<Localizacao> Localizacoes = new ArrayList<>();

    public Localizacao salvar(Localizacao novaLocalizacao) {
        novaLocalizacao.setId(Localizacoes.size() + 1);
        Localizacoes.add(novaLocalizacao);
        return novaLocalizacao;
    }

    public Localizacao buscar(int id) {
        for (Localizacao Localizacao : Localizacoes) {
            if (id == Localizacao.getId()) {
                return Localizacao;
            }
        }
        return null;
    }

}