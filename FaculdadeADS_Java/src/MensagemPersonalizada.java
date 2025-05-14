import java.awt.*;
import javax.swing.*;

public class MensagemPersonalizada {
    public static void main(String[] args) {
        // Cria a janela (frame)
        JFrame frame = new JFrame("Aviso");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centraliza

        // Cria um painel e adiciona conteúdo
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Vai se foder o Manel", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        JButton botaoFechar = new JButton("Fechar");
        botaoFechar.addActionListener(e -> frame.dispose());
        panel.add(botaoFechar, BorderLayout.SOUTH);

        // Adiciona o painel ao frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
