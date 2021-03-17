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
import modelo_beans.VeiculoBeans;

/**
 *
 * @author Railda
 */
public class VeiculoDAO {
        ConexaoBD conex = new ConexaoBD();
        VeiculoBeans vei = new VeiculoBeans();
        
        public void salvarveiculo ( VeiculoBeans vei){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into veiculo(placa,motorista,modelo,data_compra,qtdpoltrona) values (?,?,?,?,?) ");
            pst.setString(1,vei.getPlacaVeiculo());
            pst.setString(2,vei.getMotoristaVeiculo());
            pst.setString(3,vei.getModeloVeiculo());
            pst.setString(4,vei.getDatacompraVeiculo());
            pst.setInt(5,vei.getQtdpoltronaVeiculo());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados"+ex);
        }
        
        
        conex.desconecta();
        }
    
}
