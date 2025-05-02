import javax.swing.*;

public class TelaMenuPrincipal extends JFrame {
    public TelaMenuPrincipal() {
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        JButton btnFuncionario = new JButton("Cadastro de Funcionários");
        JButton btnCliente = new JButton("Cadastro de Clientes");
        JButton btnAcesso = new JButton("Registro de Acesso");
        JButton btnRelatorio = new JButton("Relatórios");

        painel.add(btnFuncionario);
        painel.add(btnCliente);
        painel.add(btnAcesso);
        painel.add(btnRelatorio);

        btnFuncionario.addActionListener(e -> new CadastroFuncionario());
        btnCliente.addActionListener(e -> new CadastroCliente());
        btnAcesso.addActionListener(e -> new RegistroAcesso());
        btnRelatorio.addActionListener(e -> new RelatorioAcessos());

        add(painel);
        setVisible(true);
    }
}