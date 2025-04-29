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

        JButton enviar = new JButton("Enviar");

        enviar.setBounds(50, 100, 100, 30);
        enviar.addActionListener(event -> {
            String digitado = nomeText.getText();
            JOptionPane.showMessageDialog(frame, "Nome: " + digitado);
        });

        frame.setLayout(null);
        frame.getContentPane().add(nome);
        frame.getContentPane().add(nomeText);
        frame.getContentPane().add(enviar);

        frame.setVisible(true);
    }
}
