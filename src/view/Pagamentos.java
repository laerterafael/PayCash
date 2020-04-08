/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Date;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.Pagamento;
import model.dao.FuncionarioDAO;
import model.dao.PagamentoDAO;

/**
 *
 * @author laert
 */
public class Pagamentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pagamentos
     */
    
    String action = "Padrao";
    
    public Pagamentos() {
        initComponents();
        LoadTablePagamentos();
        LoadCBFunc();
        Botoes(true, false, false, false, false);
        Campos(false);
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
        tbl_pagamentos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cb_func = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        jdate = new com.toedter.calendar.JDateChooser();
        txt_valor = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Pagamentos");

        tbl_pagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Valor", "Data", "Funcionario", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pagamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pagamentos);
        if (tbl_pagamentos.getColumnModel().getColumnCount() > 0) {
            tbl_pagamentos.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_pagamentos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_pagamentos.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_pagamentos.getColumnModel().getColumn(1).setPreferredWidth(10);
            tbl_pagamentos.getColumnModel().getColumn(2).setPreferredWidth(10);
            tbl_pagamentos.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados de Pagamento"));

        jLabel1.setText("Valor R$:");

        jLabel2.setText("Data:");

        jLabel3.setText("Funcionário:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        cb_func.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel4.setText("Status:");

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1 - Agendado", "2 - Realizado", "3 - Pendente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_func, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_valor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_func, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(60, 25));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(60, 25));
        btnEditar.setMinimumSize(new java.awt.Dimension(60, 25));
        btnEditar.setPreferredSize(new java.awt.Dimension(60, 25));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(60, 25));
        btnExcluir.setMinimumSize(new java.awt.Dimension(60, 25));
        btnExcluir.setPreferredSize(new java.awt.Dimension(60, 25));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Botoes(false, false, false, true, true);
        Campos(true);
        action = "Novo";
        java.util.Date data = new java.util.Date();
    
        jdate.setDate(data);
        txt_valor.setText("");
        cb_func.setSelectedIndex(0);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Botoes(false, false, false, true, true);
        Campos(true);
        action = "Editar";
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tbl_pagamentos.getSelectedRow() != -1) {
            Pagamento p = new Pagamento();
            PagamentoDAO dao = new PagamentoDAO();
            p.setId((int)tbl_pagamentos.getValueAt(tbl_pagamentos.getSelectedRow(),0));
            
            dao.delete(p);
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.");
        }
        jdate.setDate(null);
        txt_valor.setText("");
        cb_func.setSelectedIndex(0);
        cb_status.setSelectedIndex(0);
        
        LoadTablePagamentos();
        Botoes(true, false, false, false, false);
        Campos(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Pagamento p = new Pagamento();
        PagamentoDAO dao = new PagamentoDAO();
        
        p.setValor(Double.parseDouble(txt_valor.getText()));
        java.sql.Date dataSql = new java.sql.Date(jdate.getDate().getTime());
        p.setData(dataSql);
        p.setFuncionario((Funcionario)cb_func.getSelectedItem());
        p.setStatus(cb_status.getSelectedIndex());
        
         if (action.equals("Novo")) {
            dao.create(p);
        }else if(action.equals("Editar")){
            p.setId((int)tbl_pagamentos.getValueAt(tbl_pagamentos.getSelectedRow(),0));
            dao.update(p);
        }
        
        
        jdate.setDate(null);
        txt_valor.setText("");
        cb_func.setSelectedIndex(0);
        cb_status.setSelectedIndex(0);
        
        LoadTablePagamentos();
        Botoes(true, false, false, false, false);
        Campos(false);

        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jdate.setDate(null);
        txt_valor.setText("");
        cb_func.setSelectedIndex(0);
        cb_status.setSelectedIndex(0);
        Botoes(true, false, false, false, false);
        Campos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tbl_pagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pagamentosMouseClicked
        if (tbl_pagamentos.getSelectedRow() != -1) {
            txt_valor.setText(tbl_pagamentos.getValueAt(tbl_pagamentos.getSelectedRow(),1).toString());
            jdate.setDate(Date.valueOf(tbl_pagamentos.getValueAt(tbl_pagamentos.getSelectedRow(), 2).toString()));
            cb_func.getModel().setSelectedItem(tbl_pagamentos.getValueAt(tbl_pagamentos.getSelectedRow(),3));
            cb_status.setSelectedIndex(Integer.parseInt(tbl_pagamentos.getValueAt(tbl_pagamentos.getSelectedRow(), 4).toString()));
            
        }
        
        Botoes(true, true, true, false, false);
    }//GEN-LAST:event_tbl_pagamentosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Object> cb_func;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JTable tbl_pagamentos;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    private void LoadTablePagamentos() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_pagamentos.getModel();
        modelo.setNumRows(0);
        PagamentoDAO pdao = new PagamentoDAO();

        for (Pagamento p: pdao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getValor(),
                p.getData(),
                p.getFuncionario(),
                p.getStatus()
                
            });

        }
    }

    public void Botoes(boolean N, boolean E, boolean D, boolean S, boolean C){
        btnNovo.setEnabled(N);
        btnEditar.setEnabled(E);
        btnExcluir.setEnabled(D);
        btnSalvar.setEnabled(S);
        btnCancelar.setEnabled(C);
    }

    public void Campos(boolean action){
        jdate.setEnabled(action);
        txt_valor.setEnabled(action);
        cb_func.setEnabled(action);
        cb_status.setEnabled(action);
    }

    private void LoadCBFunc() {

        FuncionarioDAO dao = new FuncionarioDAO();
        for (Funcionario f: dao.read()){
            cb_func.addItem(f);
        }
    }
}
