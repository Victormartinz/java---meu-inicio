import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    static void main(String[] args) {

        TreeMap<String, Double> alunosNotas = new TreeMap<>();

        alunosNotas.put("Victor", 5.6);
        alunosNotas.put("Ana", 9.0);
        alunosNotas.put("Daniel", 7.5);

        for (String aluno : alunosNotas.keySet()) {
            double nota = alunosNotas.get(aluno);
            System.out.println(aluno + " : " + nota);
        }

        System.out.println("===================");

        for (Map.Entry<String, Double> nota : alunosNotas.entrySet()) {
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        System.out.println("===================");

        System.out.println("Primeiro Aluno: " + alunosNotas.firstKey());
        System.out.println("Ultimo aluno: " + alunosNotas.lastKey());

    }
}