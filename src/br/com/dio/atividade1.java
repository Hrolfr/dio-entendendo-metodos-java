package br.com.dio;

public class atividade1 {

    public static void main(String[] args) {

        System.out.println("Contas");
        conta();
        System.out.println("Hora");
        hora();
       /* System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();*/

    }
        private static  void conta() {
            int a = 12;
            int b = 6;

            int soma = a + b;
            System.out.println(soma);

            int subtracao = a - b;
            System.out.println(subtracao);

            int multiplicacao = a * b;
            System.out.println(multiplicacao);

            float divisao = a / b;
            System.out.println(divisao);
        }


     private static void hora() {

        String hora1 = "8horas";
         System.out.println("Bom dia! " +  hora1);

        String hora2 = "12horas";
         System.out.println("Boa tarde! " + hora2);

         String hora3 = "18horas";
         System.out.println("Boa noite! " + hora3);
     }

}
