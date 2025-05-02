import javax.swing.*;

public class CadastroCliente extends JFrame {
    public CadastroCliente() {
        setTitle("Cadastro de Cliente");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        painel.add(new JLabel("Nome:"));
        JTextField txtNome = new JTextField(15);
        painel.add(txtNome);

        painel.add(new JLabel("CPF:"));
        JTextField txtCpf = new JTextField(11);
        painel.add(txtCpf);

        JButton btnCadastrar = new JButton("Cadastrar");
        painel.add(btnCadastrar);

        add(painel);
        setVisible(true);
    }
}