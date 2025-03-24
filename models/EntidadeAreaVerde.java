package Lab365MiniProjetoAreasVerdesJoinville.models;

import java.util.ArrayList;
import java.util.List;

public class EntidadeAreaVerde {
    private static int id;
    private static String nome;
    private static String localizacao;
    private static String tipoVegetacao;
    private static String horarioFuncionamento;
    private static String atividadesDisponiveis;
    public static List<Integer> avaliacao;
    public Object areasCadastradas;

    public EntidadeAreaVerde() {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoVegetacao = tipoVegetacao;
        this.horarioFuncionamento = horarioFuncionamento;
        this.atividadesDisponiveis = atividadesDisponiveis;
        this.avaliacao = new ArrayList<>();
        this.areasCadastradas = areasCadastradas();
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome;
    }

    public static String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) { this.localizacao = localizacao;
    }

    public static String getTipoVegetacao() {
        return tipoVegetacao;
    }

    public void setTipoVegetacao(String tipoVegetacao) {
        this.tipoVegetacao = tipoVegetacao;
    }

    public static String getHorariosFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorariosFuncionamento(String horariosFuncionamento) {
        this.horarioFuncionamento = horariosFuncionamento;
    }

    public static String getAtividadesDisponiveis() {
        return atividadesDisponiveis;
    }

    public void setAtividadesDisponiveis(String atividadesDisponiveis) {
        this.atividadesDisponiveis = atividadesDisponiveis;
    }

    public static List<Integer> getAvaliacoes() {
        return avaliacao;
    }

    public void setAvaliacoes(List<Integer> avaliacoes) {
        this.avaliacao = avaliacoes;
    }

    public void adicionarAvaliacao(int avaliacao) {
        this.avaliacao.add(avaliacao);
    }

    public static double calcularMediaAvaliacoes() {
        if (avaliacao.isEmpty()) {
            return 0.0;
        }
        int soma = 0;
        for (int avaliacao : avaliacao) {
            soma += avaliacao;
        }
        return (double) soma / avaliacao.size();
    }

    public static String areasCadastradas() {
        return "ID: " + id + ", Nome: " + nome + ", Localização: " + localizacao;
    }

    public static String details(){
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Localização: " + localizacao + "\n" +
                "Tipo de vegetação: " + tipoVegetacao + "\n" +
                "Horários de funcionamento: " + horarioFuncionamento + "\n" +
                "Atividades disponíveis: " + atividadesDisponiveis + "\n" +
                "Média das avaliações: " + calcularMediaAvaliacoes();
    }

    public static String entidadeAreasVerdes(){
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Localização: " + localizacao + "\n" +
                "Tipo de vegetação: " + tipoVegetacao + "\n" +
                "Horários de funcionamento: " + horarioFuncionamento + "\n" +
                "Atividades disponíveis: " + atividadesDisponiveis + "\n" +
                "Média das avaliações: " + calcularMediaAvaliacoes();
    }
    public static void setId(String A1) {
    }

    public EntidadeAreaVerde(String id, String nome, String localizacao, String tipoVegetacao, String horariosFuncionamento, String atividadesDisponiveis, String avaliacoes) {
    }

    public static void add(EntidadeAreaVerde area01) {
    }

    public void setAvaliacoes(String number) {
    }

    public void calcularMediaAvaliacoes(String number) {
    }

}
