import java.util.LinkedList;

public class ExemploLinkedList {
public static void main(String[] args) {
LinkedList<String> playlist = new LinkedList<>();

playlist.add("Bohemian Rhapsody - Queen");

playlist.add("Imagine - John Lennon");

playlist.add("Like a Rolling Stone - Bob Dylan");

System.out.println("Playlist atual: " + playlist);

playlist.addFirst("Stairway to Heaven - Led Zeppelin");

System.out.println("Playlist com nova música no início: " +
playlist);
playlist.removeLast();
System.out.println("Playlist final: " + playlist);
}
}

