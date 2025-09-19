import java.util.ArrayList;

public class ExemploArrayList {
public static void main(String[] args) {
ArrayList<String> listaDeCompras = new ArrayList<>();

    listaDeCompras.add("Leite");
    listaDeCompras.add("Pão");
    listaDeCompras.add("Ovos");
    listaDeCompras.add("Maçã");

        System.out.println("Lista de Compras: " +
listaDeCompras);

        System.out.println("O segundo item é: " +
listaDeCompras.get(1));

    listaDeCompras.remove("Ovos");
    System.out.println("Lista após remover ovos: " +
listaDeCompras);
}
    }