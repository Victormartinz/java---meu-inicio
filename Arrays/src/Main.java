public class Main {
    static void main(String[] args) {

        int[] numeros = {1, 2 , 3, 4, 5};
        System.out.println(numeros[0]);

        String[] frutas = new String[3];
        frutas[0] = "maça";
        frutas[1] = "uva";
        frutas[2] = "abacaxi";
        System.out.println(frutas[1]);

        for(int posicao = 0; posicao <frutas.length; posicao++){
            System.out.println(frutas[posicao]);
        }

        double[] salarios;
        salarios = new double[]{1800.90, 2700.50, 5000.69};
        System.out.println(salarios[1]);

        for (double salario : salarios){
            System.out.println(salarioY);
        }
    }
}