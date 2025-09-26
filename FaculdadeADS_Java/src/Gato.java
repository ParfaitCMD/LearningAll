public class Gato {
    // 1. Atributo da classe
    String nome;

    // 2. CONSTRUTOR
    // Inicializa o objeto Gato com um nome
    public Gato(String nomedoGato) {
        this.nome = nomedoGato;
        System.out.println("Um novo gato foi adotado!!");
        System.out.println("O nome do gato é: " + nomedoGato);
    }

    // 3. Método para fazer o gato miar
    public void miau() {
        System.out.println(this.nome + " Miau Miau!!");
    }

    // 4. MÉTODO MAIN (O Teste)
    // O programa começa a ser executado a partir daqui.
    public static void main(String[] args) {
        System.out.println("--- INICIANDO O TESTE ---");

        // Criando o primeiro objeto Gato. O construtor é chamado aqui.
        Gato gatinho1 = new Gato("Félix");

        System.out.println("\n--- Adotando mais um ---");

        // Criando o segundo objeto Gato. O construtor é chamado novamente.
        Gato gatinho2 = new Gato("Luna");

        System.out.println("\n--- Hora do Miau ---");

        // Chamando o método 'miau' em cada objeto
        gatinho1.miau();
        gatinho2.miau();

        System.out.println("--- FIM DO TESTE ---");
    }
}