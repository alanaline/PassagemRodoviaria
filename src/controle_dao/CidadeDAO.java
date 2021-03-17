/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_dao;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo_beans.CidadeBeans;

/**
 *
 * @author Railda
 */
public class CidadeDAO {
    ConexaoBD conex = new ConexaoBD();
    CidadeBeans cid = new CidadeBeans();
    
    public void salvar (CidadeBeans cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cidade(uf,nome) values (?,?) ");
            pst.setString(1,cid.getUf());
            pst.setString(2,cid.getNomeCidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados"+ex);
        }
        
        
        conex.desconecta();
        
    }
    
    public CidadeBeans buscacidade(CidadeBeans cidade){
        conex.conexao();
        
        conex.executaSql("select * from cidade Where nome like'%"+cidade.getPesquisa()+"%'");
        try {
            conex.rs.first();
            cidade.setIdCidade(conex.rs.getInt("idcidade"));
           
            cidade.setNomeCidade(conex.rs.getString("nome"));
             cidade.setUf(conex.rs.getString("uf"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cidade !"+ex);
        }
        
    
        conex.desconecta();
    return cidade;
    }
    
    public void Editar(CidadeBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cidade set uf=?, nome=? where idcidade=? ");
            pst.setString(1, mod.getUf());
            pst.setString(2,mod.getNomeCidade());
            pst.setInt(3,mod.getIdCidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso !");
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro na alteraçaõ !/"+ex);        }
        
        
        
        conex.desconecta();
        
       
    }
    public void Excluir(CidadeBeans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cidade where idcidade=?");
            pst.setInt(1,mod.getIdCidade());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluido com sucesso !/"); 
        
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "Erro ao excluir dados !/"+ex);         }
        
        
        
        
        conex.desconecta();
        
        
    }


}

