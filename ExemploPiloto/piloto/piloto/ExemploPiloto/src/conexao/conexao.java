/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class conexao {
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url="jdbc:mysql://localhost/clientes";
    final private String usuario="root";
    final private String senha ="";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
    boolean result = true;
    try{
    Class.forName(driver);
    conexao = DriverManager.getConnection(url,usuario,senha);
    JOptionPane.showMessageDialog(null, "Conexão estabelecida", "mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    } catch (ClassNotFoundException Driver){
    JOptionPane.showMessageDialog(null, "Driver não localizado "+Driver,"Menssagem do Programa",JOptionPane.INFORMATION_MESSAGE);
    result = false;
    }
    catch (SQLException Fonte){
    JOptionPane.showMessageDialog(null, "Fonte de dados não localizada "+Fonte,"mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
    result = false;
    }
    return result;
    }

    public void desconecta(){
    try{
    conexao.close();
       JOptionPane.showMessageDialog(null, "Conexão com o banco fechada", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
    }catch(SQLException fecha)  {
    
    } 
    }
    
    public void executaSQl(String sql){
    try {
    statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    resultset = statement.executeQuery(sql);      
    }catch (SQLException excecao){
    JOptionPane.showMessageDialog(null, "Erro no caminho SQl! \n Erro: "+excecao,"Menssagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
    }
}
