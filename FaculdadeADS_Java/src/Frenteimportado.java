import java.util.Scanner;

public class Frenteimportado {
    public static void main(String[] args) {

        // Usa try-with-resources para garantir que o Scanner seja fechado automaticamente.
        try (Scanner scanner = new Scanner(System.in)) {

            // Exibir menu de países e fretes
            System.out.println("Selecione o país de origem do produto:");
            System.out.println("1 - Estados Unidos (Frete: R$ 60,00)");
            System.out.println("2 - França (Frete: R$ 75,50)");
            System.out.println("3 - México (Frete: R$ 50,00)");
            System.out.println("4 - Argentina (Frete: R$ 27,35)");
            System.out.println("5 - China (Frete: R$ 80,00)");

            // Entrada do valor do produto
            System.out.print("\nDigite o valor do produto: R$ ");
            double valorProduto = scanner.nextDouble();

            // Entrada da escolha do país
            System.out.print("Digite o número correspondente ao país: ");
            int opcao = scanner.nextInt();
            double frete;
            String pais;

            switch (opcao) {
                case 1 -> {
                    frete = 60.00;
                    pais = "Estados Unidos";
                    }
                case 2 -> {
                    frete = 75.50;
                    pais = "França";
                    }
                case 3 -> {
                    frete = 50.00;
                    pais = "México";
                    }
                case 4 -> {
                    frete = 27.35;
                    pais = "Argentina";
                    }
                case 5 -> {
                    frete = 80.00;
                    pais = "China";
                    }
                default -> {
                    // Opção inválida: Encerra o método main (o programa).
                    System.out.println("Opção inválida! O programa será encerrado.");
                    return;
                    }
            }

            double valorTotal = valorProduto + frete;

            // Exibir resultado
            System.out.printf("\n--- Detalhes do Pedido ---");
            System.out.printf("\nPaís selecionado: %s", pais);
            System.out.printf("\nValor do produto: R$ %.2f", valorProduto);
            System.out.printf("\nValor do frete: R$ %.2f", frete);
            System.out.printf("\nValor total a pagar: R$ %.2f\n", valorTotal);

        } // O scanner é fechado automaticamente aqui.
    }
}