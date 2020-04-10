/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.dao.FuncionarioDAO;

/**
 *
 * @author laert
 */
public class RelatorioFuncionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form RelatorioPagamentos
     */
    public RelatorioFuncionarios() {
        initComponents();
        LoadTableRelatorioFuncionarios();
    }
    
    
    private void LoadTableRelatorioFuncionarios() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_pagamentos.getModel();
        modelo.setNumRows(0);
        FuncionarioDAO fdao = new FuncionarioDAO();

        for (Funcionario f: fdao.read()) {
            
            modelo.addRow(new Object[]{
                f.getId(),
                f.getCodigo(),
                f.getNome(),
                f.getSexo(),
                f.getCpf(),
                f.getRg(),
                f.getData_nascimento(),
                f.getTelefone(),
                f.getSalario(),
                f.getCargo().getNome()              
                
            });

        }
        
        total_registros.setText(String.valueOf(tbl_pagamentos.getRowCount()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pagamentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        total_registros = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Relatório de Funcionários");
        setPreferredSize(new java.awt.Dimension(700, 500));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tbl_pagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nome", "Sexo", "CPF", "RG", "Data Nascimento", "Telefone", "Salário", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_pagamentos);
        if (tbl_pagamentos.getColumnModel().getColumnCount() > 0) {
            tbl_pagamentos.getColumnModel().getColumn(0).setMinWidth(30);
            tbl_pagamentos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_pagamentos.getColumnModel().getColumn(0).setMaxWidth(30);
            tbl_pagamentos.getColumnModel().getColumn(1).setMinWidth(50);
            tbl_pagamentos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbl_pagamentos.getColumnModel().getColumn(1).setMaxWidth(50);
            tbl_pagamentos.getColumnModel().getColumn(5).setMinWidth(70);
            tbl_pagamentos.getColumnModel().getColumn(5).setPreferredWidth(70);
            tbl_pagamentos.getColumnModel().getColumn(5).setMaxWidth(100);
            tbl_pagamentos.getColumnModel().getColumn(6).setMinWidth(70);
            tbl_pagamentos.getColumnModel().getColumn(6).setPreferredWidth(70);
            tbl_pagamentos.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Total de registros:");

        total_registros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        total_registros.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_registros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImprimir)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(total_registros)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 691, 491);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        MessageFormat header = new MessageFormat("Relatório de Funcionários - PayCash");
        MessageFormat footer =  new MessageFormat("Página {0,number,integer} ");
        
        
        try {
            tbl_pagamentos.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(this, "Erro ao imprimir:" + e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pagamentos;
    private javax.swing.JLabel total_registros;
    // End of variables declaration//GEN-END:variables
}
