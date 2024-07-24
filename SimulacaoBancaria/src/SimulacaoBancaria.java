import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
           System.out.println("\nMenu: ");
           System.out.println("1. Depositar ");
           System.out.println("2. Sacar ");
           System.out.println("3. Consultar saldo ");
           System.out.println("0. Encerrar ");
           System.out.println("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();

            switch (opcao) {
               
                          
                case 1:
                System.out.println("Informe o valor a depositar: ");
                
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Depósito realizado com sucesso! ");
                System.out.println("Saldo atual: " + saldo);
                System.out.println("Programa encerrado! ");

                break;

                case 2:
                System.out.println("Informe o valor a sacar: ");
                
                double valorSaque = scanner.nextDouble();
                if( valorSaque <= saldo){
                    saldo -= valorSaque;
                  
                    System.out.println("Saque realizado com sucesso! ");
                    System.out.println("Saldo atual: " + saldo);  
                    System.out.println("Programa encerrado! ");

                } else {

                    System.out.println("Saldo insuficiente! ");
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println("Programa encerrado! ");

                    }
               
                break;

                case 3:
                System.out.println("Saldo atual: " + saldo);

                break;

                case 0:
                System.out.println("Programa encerrado! ");

                scanner.close();
                return;

            default:
                 System.out.println("Opção inválida. Escolha outra opção! ");

                 break;
            }

            
        }

    }
}
