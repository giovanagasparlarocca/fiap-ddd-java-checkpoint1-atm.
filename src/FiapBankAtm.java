import java.util.Scanner; // professor pediu classe scanner obrigatoria

public class FiapBankAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.00; // O saldo inicial da conta deve ser R$ 0,00

        // Para cadastrar e autenticar

        System.out.print("Digite seu nome completo: ");
        // Remove espaços em branco
        String nomeCompleto = scanner.nextLine().trim();

        // Exibe mensagem de boas-vindas com o nome
        String primeiroNome = nomeCompleto.contains(" ") ? nomeCompleto.split(" ")[0] : nomeCompleto;
        System.out.println("Bem-vindo(a), " + primeiroNome + "!");
        String senhaCadastrada;

        // A regra pronta do documento
        String regraSenhaForte = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*()\\-+=?><]).{8,}$";

        do {
            System.out.println("\nCadastre uma senha forte (mínimo 8 caracteres, 1 número, 1 maiúscula e 1 especial):");
            senhaCadastrada = scanner.nextLine();

            // Confirma repetidamente os criterios
            if (!senhaCadastrada.matches(regraSenhaForte)) {
                System.out.println("Erro: A senha não atende aos critérios de segurança.");
            }
        } while (!senhaCadastrada.matches(regraSenhaForte));

        int tentativas = 0;
        boolean autenticado = false;

        // Limite máximo de 3 tentativas de login
        while (tentativas < 3) {
            System.out.print("\nDigite sua senha para acessar o terminal: ");
            String senhaLogin = scanner.nextLine();

            // PROIBIDO comparar Strings usando o operador == [cite: 72]
            if (senhaLogin.equals(senhaCadastrada)) {
                autenticado = true;
                break;
            } else {
                tentativas++;
                System.out.println("Senha incorreta! Tentativa " + tentativas + " de 3.");
            }
        }

        if (!autenticado) {
            // Se errar 3 vezes, imprime mensagem e encerra a aplicação
            System.out.println("\nACESSO BLOQUEADO");
            scanner.close();
            return;
        }
        //  MENU PRINCIPAL EM LOOP

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[1] Consultar Saldo");
            System.out.println("[2] Fazer Depósito");
            System.out.println("[3] Fazer Saque");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpeza de buffer
            } else {
                System.out.println("Opção inválida! Digite um número.");
                scanner.nextLine();
                continue;
            }

            // REGRAS DAS OPERAÇÕES BANCÁRIAS
            switch (opcao) {
                case 1:
                    // Exibe o saldo atual formatado com duas casas decimais
                    System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    if (scanner.hasNextDouble()) {
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();
                        // Não permitir depósitos de valores negativos
                        if (valorDeposito > 0) {
                            saldo += valorDeposito;
                            System.out.println("Depósito realizado com sucesso!");
                        } else {
                            System.out.println("Erro: O valor deve ser maior que zero.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    if (scanner.hasNextDouble()) {
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine();
                        // Não permitir saques negativos, nulos ou saldo insuficiente
                        if (valorSaque <= 0) {
                            System.out.println("Erro: Valor inválido para saque.");
                        } else if (valorSaque > saldo) {
                            System.out.println("Erro: Saldo insuficiente.");
                        } else {
                            saldo -= valorSaque;
                            System.out.println("Saque realizado com sucesso!");
                        }
                    }
                    break;

                case 4:
                    // Encerra o loop e exibe mensagem de agradecimento
                    System.out.println("O FIAP Bank agradece sua preferência!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();

    }
}