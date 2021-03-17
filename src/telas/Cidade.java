/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;


import conexao.ConexaoBD;
import controle_dao.CidadeDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo_beans.CidadeBeans;
import modelo_beans.Tabela;

/**
 *
 * @author Railda
 */
public class Cidade extends javax.swing.JFrame {
    CidadeBeans cid = new CidadeBeans();
    CidadeDAO control = new CidadeDAO();
    ConexaoBD conex = new ConexaoBD();

   
    /**
     * Creates new form Cidade
     */
    public Cidade() {
        initComponents();
        preencherTabela("select * from cidade order by nome ");
    }

    Cidade(PrincipalTela aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomecodigocidade = new javax.swing.JLabel();
        nomecidade = new javax.swing.JLabel();
        jtnomecidade = new javax.swing.JTextField();
        jtcampocodigocidade = new javax.swing.JTextField();
        nomeufcidade = new javax.swing.JLabel();
        jtufcidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        nomepesqcidade = new javax.swing.JLabel();
        jtcampooesqusarcidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacidade = new javax.swing.JTable();
        nomeconsultarveiculo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jbpesquisacidade = new javax.swing.JButton();
        titulocadastrocidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        nomecodigocidade.setText("Código Da Cidade:");
        jPanel1.add(nomecodigocidade);
        nomecodigocidade.setBounds(40, 20, 88, 15);

        nomecidade.setText("Cidade:");
        jPanel1.add(nomecidade);
        nomecidade.setBounds(40, 70, 50, 15);

        jtnomecidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnomecidadeActionPerformed(evt);
            }
        });
        jPanel1.add(jtnomecidade);
        jtnomecidade.setBounds(90, 70, 280, 19);
        jPanel1.add(jtcampocodigocidade);
        jtcampocodigocidade.setBounds(150, 20, 70, 19);

        nomeufcidade.setText("UF:");
        jPanel1.add(nomeufcidade);
        nomeufcidade.setBounds(50, 100, 20, 15);
        jPanel1.add(jtufcidade);
        jtufcidade.setBounds(90, 100, 70, 19);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(390, 60, 90, 40);

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(480, 185, 90, 30);

        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(390, 185, 90, 30);

        nomepesqcidade.setText("Pesquisar Cidade:");
        jPanel1.add(nomepesqcidade);
        nomepesqcidade.setBounds(40, 190, 110, 15);
        jPanel1.add(jtcampooesqusarcidade);
        jtcampooesqusarcidade.setBounds(130, 190, 170, 19);

        tabelacidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelacidade);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 240, 510, 90);

        nomeconsultarveiculo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        nomeconsultarveiculo.setText("Consultar Veículo");
        jPanel1.add(nomeconsultarveiculo);
        nomeconsultarveiculo.setBounds(220, 140, 140, 16);

        jButton3.setText("Altetrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(480, 60, 90, 40);

        jbpesquisacidade.setText("Pesquisar");
        jbpesquisacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpesquisacidadeActionPerformed(evt);
            }
        });
        jPanel1.add(jbpesquisacidade);
        jbpesquisacidade.setBounds(303, 185, 90, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 590, 360));

        titulocadastrocidade.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        titulocadastrocidade.setText("Cadasto De Cidade");
        getContentPane().add(titulocadastrocidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 140, -1));

        setSize(new java.awt.Dimension(679, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtnomecidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnomecidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnomecidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cid.setUf(jtufcidade.getText());
        cid.setNomeCidade(jtnomecidade.getText());
        control.salvar(cid);

DefaultTableModel tab = (DefaultTableModel)tabelacidade.getModel();


  /*Object[] dados = {jtcampocodigocidade.getText().trim(),
       jtnomecidade.getText().trim(),
       jtufcidade.getText().trim()};
        tab.addRow(dados);*/
        


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            int resposta =0;
            resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja relmente excluir os dados ?");
            if(resposta == JOptionPane.YES_OPTION){
                cid.setIdCidade(Integer.parseInt(jtcampocodigocidade.getText()));
                control.Excluir(cid);
            }
        
        
        
           ((DefaultTableModel)tabelacidade.getModel()).removeRow(tabelacidade.getSelectedRow());

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

                jtcampocodigocidade.setText("");
                jtnomecidade.setText("");
                jtufcidade.setText("");
                jtcampooesqusarcidade.setText("");



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                cid.setIdCidade((Integer.parseInt(jtcampocodigocidade.getText())));
                cid.setUf(jtufcidade.getText());
                cid.setNomeCidade(jtnomecidade.getText());
                control.Editar(cid);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbpesquisacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpesquisacidadeActionPerformed

            cid.setPesquisa(jtcampooesqusarcidade.getText());
            CidadeBeans cidade = control.buscacidade(cid);
            jtcampocodigocidade.setText(String.valueOf(cidade.getIdCidade()));
            jtnomecidade.setText(cidade.getNomeCidade());
            jtufcidade.setText(cidade.getUf());
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jbpesquisacidadeActionPerformed

    //Metodo Preencher Tabela
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] Colunas = new String[]{"ID","UF","Nome"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{ 
                dados.add(new Object[]{conex.rs.getInt("idcidade"),conex.rs.getString("uf"),conex.rs.getString("nome")});
                
                
            }while(conex.rs.next());
        }
        
    catch(SQLException ex){
    JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela !!!"+ex);
    
}
        Tabela modelo = new Tabela(dados,Colunas);
        //para cada campo add o tamanho, e bloquear o mouse no redimicionamento  da tabela
        tabelacidade.setModel(modelo);
        
        tabelacidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelacidade.getColumnModel().getColumn(0).setResizable(false);
        tabelacidade.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelacidade.getColumnModel().getColumn(1).setResizable(false);
        tabelacidade.getColumnModel().getColumn(2).setPreferredWidth(308);
        tabelacidade.getColumnModel().getColumn(2).setResizable(false);
        tabelacidade.getTableHeader().setReorderingAllowed(false);//bloquer o redimencionamento pelo mouse
        tabelacidade.setAutoResizeMode(tabelacidade.AUTO_RESIZE_OFF);//nao ordenna a ordem da tabela
        tabelacidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Seleciona um dado por vez
        conex.desconecta();
    
    } 
    
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbpesquisacidade;
    private javax.swing.JTextField jtcampocodigocidade;
    private javax.swing.JTextField jtcampooesqusarcidade;
    private javax.swing.JTextField jtnomecidade;
    private javax.swing.JTextField jtufcidade;
    private javax.swing.JLabel nomecidade;
    private javax.swing.JLabel nomecodigocidade;
    private javax.swing.JLabel nomeconsultarveiculo;
    private javax.swing.JLabel nomepesqcidade;
    private javax.swing.JLabel nomeufcidade;
    private javax.swing.JTable tabelacidade;
    private javax.swing.JLabel titulocadastrocidade;
    // End of variables declaration//GEN-END:variables
}
