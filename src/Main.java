import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Instanciando objeto Conta
        System.out.println("Entre com número da conta: ");
        double numeroDaConta = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Entre como nome do titular da conta: ");
        String titularDaConta = teclado.nextLine();
        Conta conta1 = new Conta(numeroDaConta, titularDaConta);
        conta1.extrato();

        boolean loop = true;

        while (loop == true) {
            int opcao ;
            System.out.println("\nDigite a opção desejada: ");
            System.out.println("1 - DEPOSITAR");
            System.out.println("2 - SAIR");

            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("\nDigite o valor que deseja depositar: ");
                    double valorDoDeposito = teclado.nextDouble();
                    conta1.deposita(valorDoDeposito);

                    conta1.extrato();
                    break;
                }
                case 2: {
                    System.out.println("Você saiu do sistema");
                    loop = false;
                    break;
                }
                default: {
                    System.out.println("Digite uma opção válida!");
                    break;
                }

            }


        }

    }
}
