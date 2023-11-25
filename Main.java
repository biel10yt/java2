import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        int contador = 0;

        while (true) {
            contador++;
            System.out.println("Olá! Seja bem-vindo à Clínica Genérica! Selecione se você é uma pessoa prioritária: ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int prioridade = scanner.nextInt();

            switch (prioridade) {
                case 1:
                    atendimento(scanner, cadastroPessoas, contador, new PessoaPrioritaria());
                    break;
                case 2:
                    atendimento(scanner, cadastroPessoas, contador, new PessoaComum());
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private static void atendimento(Scanner scanner, CadastroPessoas cadastroPessoas, int contador, Pessoa pessoa) {
        tipoAtendimento(scanner, cadastroPessoas, contador, pessoa);
        cadastroPessoas.listar();
    }

    private static void tipoAtendimento(Scanner scanner, CadastroPessoas cadastroPessoas, int contador, Pessoa pessoa) {
        System.out.println("Olá! Seja bem-vindo à Clínica Genérica! Selecione o tipo de atendimento que deseja: ");
        System.out.println("1. Consulta");
        System.out.println("2. Exame");
        System.out.println("3. Retorno");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                atendimentoConsulta(scanner, cadastroPessoas, contador, pessoa, Type.consulta);
                System.out.println(Type.consulta);
                break;
            case 2:
                atendimentoExame(scanner, cadastroPessoas, contador, pessoa, Type.exame);
                System.out.println(Type.exame);
                break;
            case 3:
                System.out.println("Você selecionou retorno ao médico. ");
                cadastrarPessoa(cadastroPessoas, pessoa, scanner, contador);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void atendimentoConsulta(Scanner scanner, CadastroPessoas cadastroPessoas, int contador, Pessoa pessoa, String consulta) {
        System.out.println("Você selecionou consulta.");
        System.out.println("1 - Clínico(a) geral");
        System.out.println("2 - Oftalmologista");
        System.out.println("3 - Dentista");
        int opcaoPrimaria = scanner.nextInt();

        if (opcaoPrimaria >= 1 && opcaoPrimaria <= 3) {
            cadastrarPessoa(cadastroPessoas, pessoa, scanner, contador);
        } else {
            System.out.println("Opção inválida");
        }
    }

    private static void atendimentoExame(Scanner scanner, CadastroPessoas cadastroPessoas, int contador, Pessoa pessoa, String exame) {
        System.out.println("Você selecionou exame.");
        System.out.println("1 - Próstata");
        System.out.println("2 - Fezes");
        System.out.println("3 - Urina");
        int opcaoSecundaria = scanner.nextInt();

        if (opcaoSecundaria >= 1 && opcaoSecundaria <= 3) {
            cadastrarPessoa(cadastroPessoas, pessoa, scanner, contador);
        } else {
            System.out.println("Opção inválida");
        }
    }

    private static void cadastrarPessoa(CadastroPessoas cadastroPessoas, Pessoa pessoa, Scanner scanner, int id) {

        pessoa.setId(id);
        System.out.println("\nInforme o seu nome: ");
        pessoa.setNome(scanner.next());
        System.out.println("Informe a sua idade: ");
        pessoa.setIdade(scanner.nextInt());
        System.out.println("Informe seu CPF: ");
        pessoa.setCpf(scanner.nextInt());
        System.out.println("Informe seu número de telefone (com DDD): ");
        pessoa.setTelefone(scanner.next());
        scanner.nextLine();
        cadastroPessoas.cadastrarPessoa(pessoa);
    }
}