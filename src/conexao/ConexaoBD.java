/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Railda
 */
public class ConexaoBD {
    
    
     public Connection con;
     public Statement stm;
     public ResultSet rs;
    
     private String driver = "com.mysql.jdbc.Driver";
     private String caminho = "jdbc:mysql://localhost/venda_de_passagem";
     private String usuario = "root";
     private String senha = "alan";
     
     public void conexao(){
         
         try{ 
             System.setProperty("jdbc.Driver", driver);
             con=DriverManager.getConnection(caminho, usuario, senha);
             //JOptionPane.showMessageDialog(null, "Conectado!!!");
             
         }catch (SQLException ex){
             JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco !!!\n"+ex);

             
         }
     }
     
     public void executaSql (String sql){
         try {
             stm= con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
             rs = stm.executeQuery(sql);
                     } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro ao executa sql !!!\n"+ex);         }
     }
    
     public void desconecta(){
         try {
             con.close();
             
}   catch (SQLException ex){
             JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco !!!\n"+ex.getMessage());

}
     }
    
    }
   
    

