package Lab365MiniProjetoAreasVerdesJoinville.main;

import Lab365MiniProjetoAreasVerdesJoinville.models.EntidadeAreaVerde;
import Lab365MiniProjetoAreasVerdesJoinville.repositories.AvaliacaoRepository;
import Lab365MiniProjetoAreasVerdesJoinville.repositories.EntidadeAreaVerdeRepository;
import Lab365MiniProjetoAreasVerdesJoinville.repositories.LocalizacaoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();
        LocalizacaoRepository localizacaoRepository = new LocalizacaoRepository();
        EntidadeAreaVerdeRepository entidadeAreaVerdeRepository = new EntidadeAreaVerdeRepository();

        System.out.println("Bem vindo ao Áreas Verdes Joinville!");
        Scanner entrada = new Scanner(System.in);

        int operacao;

        do {
            System.out.println("Digite a opção que deseja acessar:");
            System.out.println("1 - Listar áreas verdes");
            System.out.println("2 - Avaliar área verde");
            System.out.println("3 - Ver detalhe de uma área verde");
            System.out.println("4 - Cadastrar uma nova área verde");
            System.out.println("0 - Sair");

            operacao = Integer.parseInt(entrada.nextLine());

            switch (operacao) {
                case 1 -> operacaoListarAreasVerdes(entrada, entidadeAreaVerdeRepository, avaliacaoRepository);
                case 2 -> operacaoAvaliar(entrada, avaliacaoRepository);
                case 3 -> operacaoVerDetalhe(entrada, entidadeAreaVerdeRepository);
                case 4 -> operacaoCadastrar(entrada, entidadeAreaVerdeRepository);
                case 0 -> System.out.println("Voltar ao menu anterior");
                default -> System.out.println("Selecione uma opção válida.");
            }
        } while (operacao != 0);
    }

    private static void operacaoListarAreasVerdes(Scanner details, EntidadeAreaVerdeRepository entidadeAreaVerde, AvaliacaoRepository avaliacaoRepository) {

        ArrayList<EntidadeAreaVerde> areasCadastradas = new ArrayList<>();

        EntidadeAreaVerde area02 = new EntidadeAreaVerde();
        area02.setId("0");
        area02.setNome("Praça das Flores");
        area02.setLocalizacao("234, 567");
        area02.setTipoVegetacao("flores, arbustos");
        area02.setHorariosFuncionamento("24h");
        area02.setAtividadesDisponiveis("caminhada");
        area02.setAvaliacoes("0");

        areasCadastradas.add(area02);
        System.out.println(EntidadeAreaVerde.details());
    }

    private static void operacaoCadastrar(Scanner entrada, EntidadeAreaVerdeRepository entidadeAreaVerdeRepository) {
        EntidadeAreaVerde areasCadastradas = new EntidadeAreaVerde();
        System.out.println("Digite um Id:");
        String id = entrada.nextLine();
        System.out.println("Nome da área:");
        String nome = entrada.nextLine();
        System.out.println("Localização em latitude e longitude:");
        String localizacao = entrada.nextLine();
        System.out.println("Tipo de vegetação:");
        String tipoVegetacao = entrada.nextLine();
        System.out.println("Horário de funcionamento:");
        String horariosFuncionamento = entrada.nextLine();
        System.out.println("Atividades disponiveis:");
        String atividadesDisponiveis = entrada.nextLine();
        System.out.println("Avaliação:");
        String avaliacoes = entrada.nextLine();

        EntidadeAreaVerde novaArea = new EntidadeAreaVerde(id, nome, localizacao, tipoVegetacao, horariosFuncionamento, atividadesDisponiveis, avaliacoes);
        areasCadastradas.add(novaArea);
        novaArea.setNome(String.valueOf(novaArea));

        areasCadastradas.add(novaArea);
        System.out.println("Nova área cadastrada com sucesso");

    }
    private static void operacaoVerDetalhe(Scanner entrada, EntidadeAreaVerdeRepository entidadeAreaVerdeRepository) {
        System.out.println("Digite o id da área verde para consulta:");
        int dadosListagem = Integer.parseInt(entrada.nextLine());
        EntidadeAreaVerde entidadeAreasVerdes = EntidadeAreaVerdeRepository.buscarAreaVerde(dadosListagem);
        if (entidadeAreasVerdes != null) {
            System.out.printf(
                    "Dados da área verde:", entidadeAreasVerdes.areasCadastradas);
        } else {
            System.out.println("Área inexistente");
        }
    }

    private static void operacaoAvaliar(Scanner entrada, AvaliacaoRepository avaliacaoRepository) {

        int operacao;

        do {
            System.out.println("Selecione a opção a qual deseja avaliar:");
            System.out.println("1 - Quantidade de árvores");
            System.out.println("2 - Qualidade do ar");
            System.out.println("3 - Ausência de poluição sonora");
            System.out.println("4 - Coleta de resíduos");
            System.out.println("5 - Facilidade de chegar utilizando o transporte público");
            System.out.println("6 - Atividades disponíveis");
            System.out.println("0 - Voltar ao menu anterior");

            operacao = Integer.parseInt(entrada.nextLine());

            switch (operacao) {
                case 1, 2, 3, 4, 5, 6 -> {
                    System.out.println("Dê uma nota de 1 a 5:");
                    operacao = Integer.parseInt(entrada.nextLine());
                }
                case 0 -> System.out.println("Voltar ao menu anterior");
                default -> System.out.println("Selecione uma opção válida.");
            }
        } while (operacao != 0);
    }

    public static void verDetalhe(EntidadeAreaVerdeRepository LocalizacaoRepository, EntidadeAreaVerde entidadeAreaVerde) {
        Scanner entrada = new Scanner(System.in);
        List<EntidadeAreaVerde> areasVerdes = EntidadeAreaVerdeRepository.listarAreasVerdes();
        for (EntidadeAreaVerde areaVerde : areasVerdes) {
            System.out.println(areaVerde.areasCadastradas());

        EntidadeAreaVerde.calcularMediaAvaliacoes();
    }


}
}
