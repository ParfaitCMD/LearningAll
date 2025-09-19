import java.util.PriorityQueue;

public class ExemploPriorityQueue {
public static void main(String[] args) {

    PriorityQueue<Integer> filaDeTarefas = new PriorityQueue<>();
filaDeTarefas.add(3);
filaDeTarefas.add(1);
filaDeTarefas.add(2);

System.out.println("Fila de tarefas (ordem interna): " +
filaDeTarefas);
System.out.println("Processando tarefa: " +
filaDeTarefas.poll());
System.out.println("Processando tarefa: " +
filaDeTarefas.poll());
System.out.println("Processando tarefa: " +
filaDeTarefas.poll());
    }
}
