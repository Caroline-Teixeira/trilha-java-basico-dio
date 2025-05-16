import java.util.Scanner;

public class Main {

    // Desafio dio 1
    public static void main(String[] args) {
        //Variaveis
        double saldo = 1000; //saldo inicial
        boolean bancoOnline = true;

        String mensagemInicial = """
                 ***************************
                 Dados iniciais do cliente:
                                    
                 Nome: Caroline Teixeira
                 Tipo: conta corrente
                 Saldo inicial: R$ %.2f
                 ***************************
                """.formatted(saldo);
        System.out.println(mensagemInicial);


//Laço de repetição
        while (bancoOnline) {

            String mensagem = """                
                    Operações
                    1 - Consultar saldos
                    2 - Depositar valor
                    3 - Transferir valor
                    4 - Sair
                    """;

            System.out.println(mensagem);
            try (Scanner teclado = new Scanner(System.in)) {
                try {
                    int opcao = teclado.nextInt();
                    switch (opcao){
                        case 1:
                            System.out.println("Você escolheu a opção - Consultar saldos");
                            System.out.printf("Seu saldo é de R$: %.2f",saldo);
                            System.out.println(" ");
                            System.out.println("--------------------------------------------");
                            break;
                        case 2:
                            System.out.println("Você escolheu a opção - depositar valor\n" +
                                            "Digite o valor a ser depositado em reais.");
                            double depositar = teclado.nextDouble();
                            saldo += depositar; //adiciona valor ao saldo
                            System.out.println("Valor adicionado com sucesso");
                            System.out.printf("Seu saldo é de R$: %.2f",saldo);
                            System.out.println(" ");
                            System.out.println("--------------------------------------------");
                            break;
                        case 3:
                            System.out.println("Você escolheu a opção - transferir valor\n"+
                                                "Digite o valor a ser transferido em reais.");
                            double transferir = teclado.nextDouble();
                                if (saldo == 0) {
                                    System.out.println("Operação inválida. Por favor, deposite dinheiro na conta!");
                                }
                                else if (saldo < transferir) {
                                    System.out.println("Operação inválida. Por favor, deposite dinheiro na conta!");
                                }
                                else{
                                    saldo -= transferir; //transfere o dinheiro
                                    System.out.println("Valor transferido com sucesso");
                                    System.out.printf("Seu saldo é de R$: %.2f",saldo);
                                    System.out.println(" ");
                                    System.out.println("--------------------------------------------");}
                            break;
                        case 4:
                            bancoOnline = false;
                            System.out.println("Encerrando o programa");
                            break;
                        default:
                            //se o usúario digitar outros números
                            System.out.println("Operação Inválida. Digite um valor númerico entre 1 a 4.");
                            continue;
                    }
                }

                catch(Exception e){
                    //se o usuário digitar Strings
                    System.out.println("Operação Inválida. Digite um valor númerico entre 1 a 4.");
                }
            }


        }
    }
}