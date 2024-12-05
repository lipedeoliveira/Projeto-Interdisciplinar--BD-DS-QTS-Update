package cinemafinal.conexao;

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {

    // Dados da conexão
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/cinema"; // URL do banco
    final private String usuario = "root"; // Usuário do banco
    final private String senha = ""; // Senha do banco
    public Connection conn; // Conexão pública
    public Statement statement;
    public ResultSet resultset;

    // Método para conectar ao banco de dados
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver); // Carrega o driver
            conn = DriverManager.getConnection(url, usuario, senha); // Estabelece a conexão
          
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver Não Localizado: " + driver, "Erro", JOptionPane.ERROR_MESSAGE);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Erro na Conexão: " + Fonte.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            result = false;
        }
        return result;
    }

    // Método para desconectar do banco de dados
    public void desconecta() {
        try {
            if (conn != null) {
                conn.close();
                JOptionPane.showMessageDialog(null, "Conexão Fechada com Sucesso", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Fechar Conexão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para executar consultas SQL
    public void executaSQL(String sql) {
        try {
            statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro no Comando SQL! \nErro: " + excecao.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
