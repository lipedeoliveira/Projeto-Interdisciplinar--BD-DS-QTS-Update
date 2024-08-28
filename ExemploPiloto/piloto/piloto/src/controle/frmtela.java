/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

import conexao.conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class frmtela extends javax.swing.JFrame {
conexao con_cliente;
    public frmtela() {
        initComponents();
        con_cliente = new conexao();
        con_cliente.conecta();
        con_cliente.executaSQl("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
        jTable2.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNasc = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        bVoltarR = new javax.swing.JButton();
        BprimeiroR = new javax.swing.JButton();
        bUltimoR = new javax.swing.JButton();
        bavancarR = new javax.swing.JButton();
        novo = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cadastrar1 = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_pesquisa = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data nasc", "Telefone", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Data nasc");

        jLabel4.setText("Telefone");

        jLabel5.setText("email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        txtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascActionPerformed(evt);
            }
        });

        txtFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoneActionPerformed(evt);
            }
        });

        bVoltarR.setText("voltar");
        bVoltarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarRActionPerformed(evt);
            }
        });

        BprimeiroR.setText("primeiro");
        BprimeiroR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BprimeiroRActionPerformed(evt);
            }
        });

        bUltimoR.setText("ultimo");
        bUltimoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUltimoRActionPerformed(evt);
            }
        });

        bavancarR.setText("avançar");

        novo.setText("novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        alterar.setText("alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        cadastrar1.setText("cadastrar");
        cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar1ActionPerformed(evt);
            }
        });

        excluir.setText("excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jLabel6.setText("Pesquisa por nome do cliente:");

        txt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisaActionPerformed(evt);
            }
        });
        txt_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BprimeiroR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bVoltarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(bavancarR))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bUltimoR)
                            .addComponent(excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 93, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BprimeiroR)
                    .addComponent(bVoltarR)
                    .addComponent(bavancarR)
                    .addComponent(bUltimoR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo)
                    .addComponent(cadastrar1)
                    .addComponent(alterar)
                    .addComponent(excluir))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoneActionPerformed

    private void txtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       int linha_selecionada = jTable2.getSelectedRow();
       txtCod.setText(jTable2.getValueAt(linha_selecionada,0).toString());
       txtNome.setText(jTable2.getValueAt(linha_selecionada,1).toString());
       txtNasc.setText(jTable2.getValueAt(linha_selecionada,2).toString());
       txtFone.setText(jTable2.getValueAt(linha_selecionada,3).toString());
       txtEmail.setText(jTable2.getValueAt(linha_selecionada,4).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
         int linha_selecionada = jTable2.getSelectedRow();
       txtCod.setText(jTable2.getValueAt(linha_selecionada,0).toString());
       txtNome.setText(jTable2.getValueAt(linha_selecionada,1).toString());
       txtNasc.setText(jTable2.getValueAt(linha_selecionada,2).toString());
       txtFone.setText(jTable2.getValueAt(linha_selecionada,3).toString());
       txtEmail.setText(jTable2.getValueAt(linha_selecionada,4).toString());
    }//GEN-LAST:event_jTable2KeyPressed

    private void bUltimoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUltimoRActionPerformed
      try{
      con_cliente.resultset.last();
      mostar_dados();
      }catch(SQLException erro){
    JOptionPane.showMessageDialog(null, "Não é possivel posicionar no ultimo registro: "+erro);
      } 
    }//GEN-LAST:event_bUltimoRActionPerformed

    private void BprimeiroRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BprimeiroRActionPerformed
     try{
     con_cliente.resultset.first();
     mostar_dados();
     }catch(SQLException erro){
     JOptionPane.showMessageDialog(null, "Não foi possivel acessar o primeiro registro: "+erro);
     }
    }//GEN-LAST:event_BprimeiroRActionPerformed

    private void bVoltarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarRActionPerformed
      try{
      con_cliente.resultset.previous();
      mostar_dados();
      }catch(SQLException erro){
      JOptionPane.showMessageDialog(null, "Não foi possivel posicionar no proximo registro: "+erro);
      }
    }//GEN-LAST:event_bVoltarRActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
       txtCod.setText(" ");
       txtNome.setText(" ");
       txtNasc.setText(" ");
       txtFone.setText(" ");
       txtEmail.setText(" ");
       txtCod.requestFocus();
    }//GEN-LAST:event_novoActionPerformed

    private void cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar1ActionPerformed
       String nome= txtNome.getText();
       String data_nasc= txtNasc.getText();
       String telefone = txtFone.getText();
       String email = txtEmail.getText();
       
       try{
       String insert_sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + 
telefone + "','" + email + "','" + data_nasc + "')"; 
       con_cliente.statement.executeUpdate(insert_sql);
       JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Menssagem do Programa",JOptionPane.INFORMATION_MESSAGE);
       con_cliente.executaSQl("select * from tbclientes order by cod");
       con_cliente.resultset.first();
       preencherTabela();
       mostar_dados();
       
       }
       catch(SQLException errosql){
       JOptionPane.showMessageDialog(null, "erro na gravação :\n"+errosql,"Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_cadastrar1ActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
      String nome = txtNome.getText();
      String data_nasc = txtNasc.getText();
      String telefone = txtFone.getText();
      String email = txtEmail.getText();
      String sql="";
      String msg="";
      
      try{
          if (txtCod.getText().equals("")) {
           sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + 
telefone + "','" + email + "','" + data_nasc + "')";
           msg="Gravação de um novo registro";
          }else{
         sql = "UPDATE tbclientes set nome='" + nome + "', telefone='" + telefone + "',email='" + email + "', dt_nasc='" + data_nasc + "' where cod = " + txtCod.getText();
          msg="Alteração de registro";
          }
     con_cliente.statement.executeUpdate(sql);
     JOptionPane.showMessageDialog(null,msg+" realizada com sucesso!!","mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      
      con_cliente.executaSQl("select * from tbclientes order by cod");
      con_cliente.resultset.first();
      preencherTabela();
      mostar_dados();
      }
      catch(SQLException errosql){
      JOptionPane.showMessageDialog(null, "n erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
       String sql="";
       try{
       int resposta=JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro?","Confirmar exclusão", JOptionPane.INFORMATION_MESSAGE);
           if (resposta==0) {
               sql="delete from tbclientes where cod = "+txtCod.getText();
               int excluir = con_cliente.statement.executeUpdate(sql);
               if (excluir==1) {
                   JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                   con_cliente.executaSQl("select * from tbclientes order by cod");
               con_cliente.resultset.first();
               preencherTabela();
               posicionarRegistro();
               }
           } else{
           JOptionPane.showMessageDialog(null, "Operção cancelada pelo usuario!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
           }
       }catch(SQLException excecao){
       JOptionPane.showMessageDialog(null, "Erro na exclusão: "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_excluirActionPerformed

    private void txt_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyReleased
     try{
        String pesquisa ="select * from tbclientes where nome like '" + txt_pesquisa.getText() + "%'";
        con_cliente.executaSQl(pesquisa);
         if (con_cliente.resultset.first()) {
           preencherTabela();
         }else{
         JOptionPane.showMessageDialog(null, "\n não existe dados com este paramêtro!! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
         }
        }catch(SQLException errosql){
        JOptionPane.showMessageDialog(null, "\n os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_txt_pesquisaKeyReleased

    private void txt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesquisaActionPerformed

    public void preencherTabela(){
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(4);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(4);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(4);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(4);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(4);
        
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setNumRows(0);
        
        try{
        con_cliente.resultset.beforeFirst();
            while (con_cliente.resultset.next()) {
                modelo.addRow(new Object[]{
                con_cliente.resultset.getString("cod"), con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"),con_cliente.resultset.getString("email")
                });
            }
        }
catch(SQLException erro){
    JOptionPane.showMessageDialog(null, "\n erro ao listar dados a tabela!!: \n"+erro,"mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
}
}
    
    public void posicionarRegistro(){
        try{
       con_cliente.resultset.first();
       mostar_dados();
        }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "Não foi possivel posicionar no primeiro registro: "+erro,"Menssagem do programa",JOptionPane.INFORMATION_MESSAGE);
        }
        }
    
    public void mostar_dados(){
    try{
        txtCod.setText(con_cliente.resultset.getString("cod"));
        txtNome.setText(con_cliente.resultset.getString("nome"));
        txtNasc.setText(con_cliente.resultset.getString("dt_nasc"));
        txtFone.setText(con_cliente.resultset.getString("telefone"));
        txtEmail.setText(con_cliente.resultset.getString("email"));
    }catch(SQLException erro){
    JOptionPane.showMessageDialog(null, "Não localizou dados: "+erro, "Mensagem do Programma",JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmtela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BprimeiroR;
    private javax.swing.JButton alterar;
    private javax.swing.JButton bUltimoR;
    private javax.swing.JButton bVoltarR;
    private javax.swing.JButton bavancarR;
    private javax.swing.JButton cadastrar1;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton novo;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
