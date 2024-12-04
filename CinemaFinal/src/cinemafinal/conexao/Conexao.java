package cinemafinal.conexao;

import javax.swing.JOptionPane;
import java.sql.*;

public class Conexao {
    
    final private String driver = "com.mysql.jdbc.Driver"; //
    final private String url = "jdbc:mysql://localhost/cinema"; //
    final private String usuario = "root"; //
    final private String senha = ""; //
    private Connection conexao; //
    public Statement statement; //
    public ResultSet resultset; //
    
    
    public boolean conecta() {
    boolean result = true;
    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, senha, usuario);
        JOptionPane.showMessageDialog(null, "Conexao Estabelecida", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }catch (ClassNotFoundException Driver) {
        JOptionPane.showMessageDialog(null, "Driver Não Localizado"+driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        result = false;
    } catch(SQLException Fonte) {
        JOptionPane.showMessageDialog(null, "Fonte de Dados Não Localizada"+Fonte, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        result = false;
    }
    return result;
    }
    
    public void desconecta(){
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão Com o Banco Fechada", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }catch(SQLException fecha) {
        
        }   
    }
    
    public void executaSQL(String sql) {
        try {
            statement =  conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch (SQLException execao) {
            JOptionPane.showMessageDialog(null, "Erro no Comando SQL! \n Erro:"+execao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

