import java.util.LinkedHashSet;
public class ExemploLinkedHashSet {
public static void main(String[] args) {
LinkedHashSet<String> ordemDeChegada = new LinkedHashSet<>();

ordemDeChegada.add("Ana");
ordemDeChegada.add("Carlos");
ordemDeChegada.add("Bia");
ordemDeChegada.add("Ana");

System.out.println("Ordem final dos participantes: " +
ordemDeChegada);
        }
    }
