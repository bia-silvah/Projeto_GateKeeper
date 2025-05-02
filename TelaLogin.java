import javax.swing.*;

public class TelaLogin extends JFrame {
    public TelaLogin() {
        setTitle("Login - GateKeeper");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        painel.add(new JLabel("CPF:"));
        JTextField txtCpf = new JTextField(15);
        painel.add(txtCpf);

        painel.add(new JLabel("Chave de Acesso:"));
        JPasswordField txtChave = new JPasswordField(15);
        painel.add(txtChave);

        JButton btnLogin = new JButton("Entrar");
        painel.add(btnLogin);

        btnLogin.addActionListener(e -> {
            dispose();
            new TelaMenuPrincipal();
        });

        add(painel);
        setVisible(true);
    }
}