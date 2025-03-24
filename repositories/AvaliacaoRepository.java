package Lab365MiniProjetoAreasVerdesJoinville.repositories;

import Lab365MiniProjetoAreasVerdesJoinville.models.Avaliacao;

import java.util.ArrayList;
import java.util.List;

import static Lab365MiniProjetoAreasVerdesJoinville.models.EntidadeAreaVerde.avaliacao;

public class AvaliacaoRepository {

    private static List<Avaliacao> AVALIACAO = new ArrayList<>();
    private static int proximoId = 1;

    public static void addAvaliacao(Avaliacao avaliacao) {
        avaliacao.setId(proximoId++);
        AVALIACAO.add(avaliacao);
    }

    public static List<Avaliacao> listarTodos() {
        return AVALIACAO;
    }

    public static Avaliacao buscarPorId(int id) {
        for (Avaliacao avaliacao : AVALIACAO) {
            if (avaliacao.getId() == id) {
                return avaliacao;
            }
        }
        return null;
    }
    public static double calcularMediaAvaliacoes() {
        if (avaliacao.isEmpty()) {
            return 0.0;
        }
        int soma = 0;
        for (double avaliacao : avaliacao) {
            soma += avaliacao;
        }
        return (double) soma / avaliacao.size();
    }
}
