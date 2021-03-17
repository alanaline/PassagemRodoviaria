/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import conexao.ConexaoBD;
import controle_dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo_beans.Tabela;
import modelo_beans.UsuarioBeans;

/**
 *
 * @author Railda
 */
public class Usuario extends javax.swing.JFrame {
    UsuarioBeans usu = new UsuarioBeans();
    UsuarioDAO contus = new UsuarioDAO();
    ConexaoBD conex = new ConexaoBD();
       


    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        preencherTabela("select * from usuario order by nome ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelausuario = new javax.swing.JTable();
        jtnome = new javax.swing.JTextField();
        jtlogin = new javax.swing.JTextField();
        jtmatricula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtcargo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtpesquisa = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jtsenha = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 110, 50, 15);

        jLabel2.setText("Email:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 50, 15);

        jLabel4.setText("Matricula:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 30, 50, 15);

        jLabel5.setText("Senha:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 70, 50, 15);

        tabelausuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Login", "Senha", "Matricula", "Cargo"
            }
        ));
        jScrollPane2.setViewportView(tabelausuario);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 250, 530, 110);

        jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnomeActionPerformed(evt);
            }
        });
        jPanel1.add(jtnome);
        jtnome.setBounds(80, 110, 470, 19);
        jPanel1.add(jtlogin);
        jtlogin.setBounds(80, 70, 210, 19);
        jPanel1.add(jtmatricula);
        jtmatricula.setBounds(80, 30, 210, 19);

        jLabel7.setText("Cargo:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 30, 50, 15);

        jtcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcargoActionPerformed(evt);
            }
        });
        jPanel1.add(jtcargo);
        jtcargo.setBounds(350, 30, 200, 19);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 150, 90, 40);

        jLabel8.setText("Pesquisar:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 210, 70, 15);

        jButton2.setText("Limpar");
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 150, 90, 40);

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(230, 150, 100, 40);
        jPanel1.add(jtpesquisa);
        jtpesquisa.setBounds(110, 210, 320, 19);

        jButton4.setText("Pesqusar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(430, 200, 100, 40);
        jPanel1.add(jtsenha);
        jtsenha.setBounds(350, 70, 200, 19);

        jButton5.setText("Aiterar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(430, 150, 100, 40);

        jButton6.setText("Excluir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(330, 150, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 40, 570, 380);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setText("Cadastro Usuario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 10, 130, 20);

        setSize(new java.awt.Dimension(688, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcargoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         usu.setLoginUsuario(jtlogin.getText());
         usu.setCargoUsuario(jtcargo.getText());
         usu.setNomeUsuario(jtnome.getText());
         usu.setSenhaUsuario(jtsenha.getText());
         
         
         
         
        contus.salvarusuario(usu);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            usu.setPesquisaus(jtpesquisa.getText());
            UsuarioBeans usuario = contus.buscausuario(usu);
            jtmatricula.setText(String.valueOf(usuario.getMatriculaUsuario()));
            jtlogin.setText(usuario.getLoginUsuario());
            jtcargo.setText(usuario.getCargoUsuario());
            jtnome.setText(usuario.getNomeUsuario());
            jtsenha.setText(usuario.getSenhaUsuario());
            

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                usu.setMatriculaUsuario((Integer.parseInt(jtmatricula.getText())));
                usu.setLoginUsuario(jtlogin.getText());
                usu.setCargoUsuario(jtcargo.getText());
                usu.setNomeUsuario(jtnome.getText());
                usu.setSenhaUsuario(jtsenha.getText());
                contus.Editar(usu);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
              int resposta =0;
            resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja relmente excluir os dados ?");
            if(resposta == JOptionPane.YES_OPTION){
                usu.setMatriculaUsuario(Integer.parseInt(jtmatricula.getText()));
                contus.Excluir(usu);
            }
            
    }
            //Metodo Preencher Tabela
    public void preencherTabela(String Sql){
        
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Matricula","Login","Cargo","Nome","Senha"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{ 
                dados.add(new Object[]{conex.rs.getInt("Matricula"),conex.rs.getString("Login"),conex.rs.getString("cargo"),conex.rs.getString("Nome"),conex.rs.getString("Senha")});
                
                
            }while(conex.rs.next());
        }
        
    catch(SQLException ex){
    JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela !!!"+ex);
    
}
        Tabela modelo = new Tabela(dados,colunas);
        //para cada campo add o tamanho, e bloquear o mouse no redimicionamento  da tabela
       tabelausuario.setModel(modelo);
        tabelausuario.getColumnModel().getColumn(0).setPreferredWidth(69);
        tabelausuario.getColumnModel().getColumn(0).setResizable(false);
        tabelausuario.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelausuario.getColumnModel().getColumn(1).setResizable(false);
        tabelausuario.getColumnModel().getColumn(2).setPreferredWidth(69);
        tabelausuario.getColumnModel().getColumn(2).setResizable(false);
        tabelausuario.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabelausuario.getColumnModel().getColumn(3).setResizable(false);
        tabelausuario.getColumnModel().getColumn(4).setPreferredWidth(69);
        tabelausuario.getColumnModel().getColumn(4).setResizable(false);
        tabelausuario.getTableHeader().setReorderingAllowed(false);//bloquer o redimencionamento pelo mouse
        tabelausuario.setAutoResizeMode(tabelausuario.AUTO_RESIZE_OFF);//nao ordenna a ordem da tabela
        tabelausuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Seleciona um dado por vez
        conex.desconecta();
    
    
        
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtcargo;
    private javax.swing.JTextField jtlogin;
    private javax.swing.JTextField jtmatricula;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jtpesquisa;
    private javax.swing.JPasswordField jtsenha;
    private javax.swing.JTable tabelausuario;
    // End of variables declaration//GEN-END:variables
}