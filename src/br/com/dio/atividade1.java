package br.com.dio;

public class atividade1 {

    public static void main(String[] args) {

        System.out.println("Contas");
        conta();
        System.out.println("Hora");
        hora();
        System.out.println("Empréstimo");
        grana();


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

            int divisao = a / b;
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

     private static void  grana(){

        double valorSolicitado = 30.000;
        double taxa = 4.5;
        int parcelas = 12;

        double valorTotal = valorSolicitado * taxa / parcelas;
         System.out.println(valorTotal); //não ficou igual, mas usei o que sabia, funcionou e eu amei o resultado.Estou feliz.

     }
}
