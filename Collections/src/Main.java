import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        //estudoArrayLIst

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Chocolate");
        listaDeCompras.add("Arroz");
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Café");

        listaDeCompras.add(1, "leite");

        for (String item : listaDeCompras){
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na Posição 3 eu tenho: " + item);

        listaDeCompras.remove(3);

        for (String item2 : listaDeCompras){
            System.out.println(item2);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("sabão");

        System.out.println("A Lista está vazia? " + eVazia);
        System.out.println("Qual tamanho da lista? " + tamanho);
        System.out.println("A Lista contem o item sabão? " + contem);

        //listaDeCompras.clear();
        //System.out.println("A lista está vazia? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto));

    }
}