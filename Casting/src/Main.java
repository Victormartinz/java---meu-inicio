public class Main {
    public static void main(String[] args) {

        int numeroUm= 10;
        double numeroD = numeroUm;
        System.out.println(numeroUm);
        System.out.println(numeroD);

        double numeroD2 = 20.5;
        int numeroDois = (int) numeroD2;
        System.out.println(numeroDois);
        System.out.println(numeroD2);

        Integer numeroInteger = 30;
        String numeroString = numeroInteger.toString();
        System.out.println(numeroInteger + " " + numeroString);

        String numeroStringDois = "40";
        Integer numeroIntegerDois = Integer.parseInt(numeroStringDois);
        System.out.println( numeroStringDois + " " + numeroIntegerDois);









    }
}