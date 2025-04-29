import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Hello World");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel nome = new JLabel("Nome: ");

        nome.setBounds(50, 50, 100, 30);

        JTextField nomeText = new JTextField();

        nomeText.setBounds(100, 50, 100, 30);

        frame.setLayout(null);
        frame.getContentPane().add(nome);
        frame.getContentPane().add(nomeText);

        frame.setVisible(true);
    }
}
