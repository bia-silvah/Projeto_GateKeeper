import javax.swing.*;

public class RelatorioAcessos extends JFrame {
    public RelatorioAcessos() {
        setTitle("Relatório de Acessos");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JTextArea relatorio = new JTextArea("Histórico de acessos será exibido aqui...");
        relatorio.setEditable(false);

        JScrollPane scroll = new JScrollPane(relatorio);
        add(scroll);

        setVisible(true);
    }
}