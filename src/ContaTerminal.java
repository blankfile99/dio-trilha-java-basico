import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>DIO - Trilha Java Básico<h1/>
 * <h2>1. Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:</h2>
 * <h2>2. Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.</h2>
 *
 * <h2>3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:</h2><br/>
 *
 * <span>Programa: "Por favor, digite o número da Agência !"</span><br/>
 * <span>Usuário: 1021 (depois ENTER para o próximo campo)</span><br/>
 * <p>
 * <br/>
 * <h2>4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:</h2><br/>
 * <span>"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".</span><br/><br/>
 * <span>Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.</span>
 * <br/><br/>
 *
 * @author Renato de Castro
 * @version 1.0
 * @since 30/04/2024
 */
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero de sua Conta:");
        int numero = scanner.nextInt();

        System.out.println("Agora o número de sua Agencia:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Depósito inicial:");
        double saldo = scanner.nextDouble();

        System.out.println("Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é a de nº"+agencia+" ,conta nº"+numero+" e seu saldo "+saldo+" já está disponível!");
    }

}



