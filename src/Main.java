import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double saldo;

        System.out.println("Qual é o seu nome?");
        String nome = leitura.nextLine();
        System.out.println("Qual é o tipo de conta? Corrente ou Poupança?");
        String tipoConta = leitura.nextLine();
        System.out.println("Qual é o valor do deposito inicial?");
        saldo = leitura.nextDouble();

        System.out.println("*********************************");
        System.out.println("Dados da sua conta:");
        System.out.println("nome: " + nome);
        System.out.println("Conta " + tipoConta);
        System.out.println("Saldo: R$"+ saldo);
        System.out.println("*********************************");


        String menu = """
                
                Operações:
                
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair 
             
                """;
        int opcao = 0;


        while (opcao != 4){

            System.out.println(menu);
            System.out.println("Escolha a operação");
            opcao = leitura.nextInt();


            switch (opcao){
                case 1:
                System.out.println("\nO seu saldo é de R$"+saldo);
                break;

                case 2:
                    System.out.println("\nQuanto voce quer transferir?");
                    int valorTransferencia = leitura.nextInt();
                        if (valorTransferencia < saldo) {
                            saldo = saldo - valorTransferencia;
                            System.out.println("\nTransferencia concluida com sucesso");
                            System.out.println("O Valor transferido foi de R$" + valorTransferencia);
                            System.out.println("\nO seu Saldo atualizado é de R$" + saldo);
                        } else {
                            System.out.println("\nDesculpe o seu Saldo é insuficiente");
                        }
                break;
                case 3:
                    System.out.println("\nQuanto voce quer receber?");
                    int valorRecebido = leitura.nextInt();
                        if (valorRecebido > 0){
                            saldo = saldo + valorRecebido;
                            System.out.println("\nValor recebido com sucesso");
                            System.out.println("\nO valor recebido foi de R$" + valorRecebido);
                            System.out.println("O seu saldo atualizado é de R$" + saldo);
                        } else {
                            System.out.println("\nValor invalido, tente novamente");
                        }
                break;

                case 4:
                    break;
                default:
                    System.out.println("\nOpção inavalida! Tente novamente");
                    break;





            }



        }










    }
}