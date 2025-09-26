
public class Cachorro {
    // 1. Atributo da classe
    String nome;

    // 2. CONSTRUTOR
    // O construtor tem o MESMO nome da classe (Cachorro)
    // Ele é chamado automaticamente quando criamos um novo objeto.
    public Cachorro(String nomeDoCao) {
        // Inicializa o atributo 'nome' com o valor passado
        this.nome = nomeDoCao;
        System.out.println("Um novo Cachorro foi adotado!");
        System.out.println("Nome: " + this.nome);
    }

    // 3. Método simples para mostrar o nome
    public void latir() {
        System.out.println(this.nome + " está latindo: Au Au!");
    }
}