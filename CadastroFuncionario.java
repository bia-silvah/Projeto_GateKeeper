import javax.swing.*;

public class CadastroFuncionario extends JFrame {
    public CadastroFuncionario() {
        setTitle("Cadastro de Funcionário");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        painel.add(new JLabel("Nome:"));
        JTextField txtNome = new JTextField(15);
        painel.add(txtNome);

        painel.add(new JLabel("CPF:"));
        JTextField txtCpf = new JTextField(11);
        painel.add(txtCpf);

        painel.add(new JLabel("Chave de Acesso:"));
        JTextField txtChave = new JTextField(15);
        painel.add(txtChave);

        JButton btnSalvar = new JButton("Salvar");
        painel.add(btnSalvar);

        add(painel);
        setVisible(true);
    }
}