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

    }
}