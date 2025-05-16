import java.util.Scanner;

public class Contador {
    // Desafio Dio 2
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = teclado.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = teclado.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);



            }
            catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());


            }
        }

    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String s) {
            super(s);
        }


    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i <= contagem; i++ ){
                System.out.println(i);
            }
        }
        else{
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }



    }
}
