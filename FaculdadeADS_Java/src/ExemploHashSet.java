import java.util.HashSet;
public class ExemploHashSet {
public static void main(String[] args) {
HashSet<String> tags = new HashSet<>();

tags.add("java");
tags.add("programacao");
tags.add("backend");
tags.add("java");

System.out.println("Tags do post: " + tags);
if (tags.contains("programacao")) {
System.out.println("O post fala sobre programação.");
    }
    }
}

