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


    }
}