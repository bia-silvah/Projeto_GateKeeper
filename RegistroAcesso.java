import javax.swing.*;

public class RegistroAcesso extends JFrame {
    public RegistroAcesso() {
        setTitle("Registro de Acesso");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        painel.add(new JLabel("CPF do Cliente:"));
        JTextField txtCpf = new JTextField(11);
        painel.add(txtCpf);

        JButton btnEntrada = new JButton("Entrada");
        JButton btnSaida = new JButton("Saída");

        painel.add(btnEntrada);
        painel.add(btnSaida);

        add(painel);
        setVisible(true);
    }
}