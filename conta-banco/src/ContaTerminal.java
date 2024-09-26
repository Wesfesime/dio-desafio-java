
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário
        System.out.println("Escolha o idioma / Choose the language / Elija el idioma:");
        System.out.println("1 - Português");
        System.out.println("2 - English");
        System.out.println("3 - Español");
        int escolha = scanner.nextInt();
        scanner.nextLine();
// Variáveis para armazenar os dados
        String agencia, nomeCliente;
        int numero;
        double saldo;

//Obter pela scanner os valores digitados no terminal de acordo com o idioma escolhido
        switch (escolha){
            case 1:
            // Português

        System.out.println("Por favor, digite o seu número da Agência:");
             agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da sua conta:");
             numero = scanner.nextInt();
                scanner.nextLine();

            System.out.println("Por favor, digite seu nome, Cliente");
             nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo:");
                 saldo = scanner.nextDouble();

        

        //Exibir a mensagem conta criada em Português
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",

                   nomeCliente, agencia, numero, saldo);

            System.out.println(mensagem);
                        break;
                    case 2:
                    //English

        System.out.println("Please enter the Agency number:");
                    agencia = scanner.nextLine();

        System.out.println("Please enter the Account number:");
                    numero = scanner.nextInt();
                    scanner.nextLine(); //Consumir a nova linha

        System.out.println("Please enter the client's name:");
                    nomeCliente = scanner.nextLine();

        System.out.println("Please enter the balance:");
                    saldo = scanner.nextDouble();

        String mensagemEn = String.format("Hello %s, thank you for creating an account at our bank. Your agency is %s, account number is %d, and your balance of %.2f is now abailabre for withdrawal.",

        nomeCliente, agencia, numero, saldo);

        System.out.println(mensagemEn);
                            break;
                        case 3:
                        // Spañol

        System.out.println("Por favor, ingrese el número de la Agencia");
                    agencia = scanner.nextLine();

        System.out.println("Por favor, ingrese el número de la Cuenta:");
                    numero = scanner.nextInt();
                            scanner.nextLine(); // consumir a nova linha

        System.out.println("Por favor, ingrese el nombre del Cliente:");
                    nomeCliente = scanner.nextLine();

        System.out.println("Por favor, igrese el saldo:");
                    saldo = scanner.nextDouble();

                                // Mensagem em espanhol

            String mensagemES = String.format("Hola %s, gracias por crear una cuenta en nuestro banco. Su agencia es %s, el número de cuenta es %d, y su saldo de  %.2f ya está disponible para retiro.",
                    nomeCliente, agencia, numero, saldo);

        System.out.println(mensagemES);
                                break;
                            default:
        System.out.println("Opção inválida. Por favor, reinicie o programa e escolha um idioma válido");
                                break;
        }


            scanner.close();
    }
}
