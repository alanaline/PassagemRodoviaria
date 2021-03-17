/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_dao;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo_beans.UsuarioBeans;
import modelo_beans.VeiculoBeans;


/**
 *
 * @author Railda
 */
public class UsuarioDAO {
     ConexaoBD conex = new ConexaoBD();
        UsuarioBeans usu = new UsuarioBeans();
        
        public void salvarusuario ( UsuarioBeans usu){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario (login,cargo,nome,senha) values (?,?,?,?) ");
            pst.setString(1,usu.getLoginUsuario());
            pst.setString(2,usu.getCargoUsuario());
            pst.setString(3,usu.getNomeUsuario());
            pst.setString(4,usu.getSenhaUsuario());
            
           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados"+ex);
        }
        
        
        conex.desconecta();
        }
        
         public UsuarioBeans buscausuario(UsuarioBeans usuario){
        conex.conexao();
        
        conex.executaSql("select * from usuario Where nome like'%"+usuario.getPesquisaus()+"%'");
        try {
            conex.rs.first();
            usuario.setMatriculaUsuario(conex.rs.getInt("matricula"));
            usuario.setLoginUsuario(conex.rs.getString("login"));
            usuario.setCargoUsuario(conex.rs.getString("cargo"));
            usuario.setNomeUsuario(conex.rs.getString("nome"));
            usuario.setSenhaUsuario(conex.rs.getString("senha"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cidade !"+ex);
        }
        conex.desconecta();
    return usuario;
         }

         public void Editar(UsuarioBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuario set login=?, cargo=?,nome=?, senha=? where matricula=? ");
            pst.setInt(1,mod.getMatriculaUsuario());
            pst.setString(2, mod.getLoginUsuario());
            pst.setString(3,mod.getCargoUsuario());
            pst.setString(4, mod.getNomeUsuario());
            pst.setString(5, mod.getSenhaUsuario());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso !");
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro na alteraçaõ !/"+ex);        }
        
        
        
        conex.desconecta();
       }
         
          public void Excluir(UsuarioBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuario where matricula=?");
            pst.setInt(1,mod.getMatriculaUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluido com sucesso !/"); 
        
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro ao excluir dados !/"+ex);         }
        
        
        
        
        conex.desconecta();
        
        
    }
         
         
         
}
