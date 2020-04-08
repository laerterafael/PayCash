/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cargo;
import model.Funcionario;
import model.dao.CargoDAO;
import model.dao.FuncionarioDAO;

/**
 *
 * @author laert
 */
public class Funcionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroFuncionarios
     */
    String action = "Padrao";
    
    public Funcionarios() {
        initComponents();
        LoadTableFunc();
        LoadCBCargo();
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

        bg_sexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_func = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txt_func_codigo = new javax.swing.JTextField();
        txt_func_nome = new javax.swing.JTextField();
        txt_func_cpf = new javax.swing.JTextField();
        txt_func_rg = new javax.swing.JTextField();
        rb_fem = new javax.swing.JRadioButton();
        txt_func_data_nascimento = new javax.swing.JTextField();
        txt_func_telefone = new javax.swing.JTextField();
        cb_cargo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        rb_masc = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_func_salario = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastrar Funcionários");

        tbl_func.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nome", "Sexo", "CPF", "RG", "Data Nasc", "Telefone", "Salario", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_func.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_funcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_func);
        if (tbl_func.getColumnModel().getColumnCount() > 0) {
            tbl_func.getColumnModel().getColumn(0).setPreferredWidth(2);
            tbl_func.getColumnModel().getColumn(1).setPreferredWidth(7);
            tbl_func.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(75, 23));
        btnExcluir.setMinimumSize(new java.awt.Dimension(75, 23));
        btnExcluir.setPreferredSize(new java.awt.Dimension(75, 23));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados"));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("RG:");

        jLabel5.setText("Sexo:");

        jLabel7.setText("Data Nascimento:");

        jLabel8.setText("Telefone:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(75, 23));
        btnSalvar.setMinimumSize(new java.awt.Dimension(75, 23));
        btnSalvar.setPreferredSize(new java.awt.Dimension(75, 23));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txt_func_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_func_codigoActionPerformed(evt);
            }
        });

        bg_sexo.add(rb_fem);
        rb_fem.setText("Feminino");

        jLabel11.setText("Cargo:");

        bg_sexo.add(rb_masc);
        rb_masc.setText("Masculino");

        jLabel6.setText("Salário:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3)))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_func_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_func_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_func_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_func_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_func_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rb_masc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_fem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_func_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(13, 13, 13))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_func_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_func_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_func_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_func_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_func_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_masc)
                    .addComponent(rb_fem)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_func_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        setBounds(0, 0, 900, 600);
    }// </editor-fold>//GEN-END:initComponents

    
    public void LoadTableFunc(){
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_func.getModel();
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
                f.getCargo()
            });

        }
        
    }
    
    public void LoadCBCargo(){
        cb_cargo.addItem("Selecione");
        
        CargoDAO dao = new CargoDAO();
        for (Cargo c : dao.read()) {
            cb_cargo.addItem(c);
            
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
        txt_func_codigo.setEnabled(action);
        txt_func_nome.setEnabled(action);
        txt_func_cpf.setEnabled(action);
        txt_func_rg.setEnabled(action);
        txt_func_data_nascimento.setEnabled(action);
        txt_func_telefone.setEnabled(action);
        txt_func_salario.setEnabled(action);
        bg_sexo.clearSelection();
        rb_fem.setEnabled(action);
        rb_masc.setEnabled(action);
        cb_cargo.setEnabled(action);
    }
     
     
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Botoes(false, false, false, true, true);
        Campos(true);
        action = "Novo";
        
        txt_func_codigo.setText("");
        txt_func_nome.setText("");
        txt_func_cpf.setText("");
        txt_func_rg.setText("");
        txt_func_data_nascimento.setText("");
        txt_func_telefone.setText("");
        txt_func_salario.setText("");
        bg_sexo.clearSelection();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Botoes(false, false, false, true, true);
        Campos(true);
        action = "Editar";
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tbl_funcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_funcMouseClicked
        if (tbl_func.getSelectedRow() != -1) {
            String sexo = tbl_func.getValueAt(tbl_func.getSelectedRow(),3).toString();
                if (sexo.equals("Masculino")) {
                    rb_masc.setSelected(true);
                }else{
                    rb_fem.setSelected(true);
                }
            txt_func_codigo.setText(tbl_func.getValueAt(tbl_func.getSelectedRow(),1).toString());
            txt_func_nome.setText(tbl_func.getValueAt(tbl_func.getSelectedRow(),2).toString());
            txt_func_cpf.setText(tbl_func.getValueAt(tbl_func.getSelectedRow(),4).toString());
            txt_func_rg.setText(tbl_func.getValueAt(tbl_func.getSelectedRow(),5).toString());
            txt_func_data_nascimento.setText(tbl_func.getValueAt(tbl_func.getSelectedRow(),6).toString());
            txt_func_telefone.setText(tbl_func.getValueAt(tbl_func.getSelectedRow(),7).toString());
            txt_func_salario.setText(tbl_func.getValueAt(tbl_func.getSelectedRow(),8).toString());
            cb_cargo.getModel().setSelectedItem(tbl_func.getValueAt(tbl_func.getSelectedRow(),9));
        }
        
        Botoes(true, true, true, false, false);
    }//GEN-LAST:event_tbl_funcMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (tbl_func.getSelectedRow() != -1) {
            Funcionario f = new Funcionario();
            FuncionarioDAO dao = new FuncionarioDAO();
            f.setId((int)tbl_func.getValueAt(tbl_func.getSelectedRow(),0));
            
            dao.delete(f);
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir.");
        }
        txt_func_codigo.setText("");
        txt_func_nome.setText("");
        txt_func_cpf.setText("");
        txt_func_rg.setText("");
        txt_func_data_nascimento.setText("");
        txt_func_telefone.setText("");
        txt_func_salario.setText("");
        bg_sexo.clearSelection();
        
        LoadTableFunc();
        Botoes(true, false, false, false, false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txt_func_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_func_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_func_codigoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Funcionario f = new Funcionario();
        FuncionarioDAO dao = new FuncionarioDAO();

        String sexo = "";
        if (rb_fem.isSelected()) {
            sexo = rb_fem.getText();
        }else{
            sexo = rb_masc.getText();
        }

        f.setCodigo(Integer.parseInt(txt_func_codigo.getText()));
        f.setNome(txt_func_nome.getText());
        f.setSexo(sexo);
        f.setCpf(txt_func_cpf.getText());
        f.setRg(txt_func_rg.getText());
        f.setData_nascimento(txt_func_data_nascimento.getText());
        f.setTelefone(txt_func_telefone.getText());
        f.setSalario(Double.parseDouble(txt_func_salario.getText()));
        f.setCargo((Cargo)cb_cargo.getSelectedItem());

        if (action.equals("Novo")) {
            dao.create(f);
        }else if(action.equals("Editar")){
            f.setId((int)tbl_func.getValueAt(tbl_func.getSelectedRow(),0));
            dao.update(f);
        }

        txt_func_codigo.setText("");
        txt_func_nome.setText("");
        txt_func_cpf.setText("");
        txt_func_rg.setText("");
        txt_func_data_nascimento.setText("");
        txt_func_telefone.setText("");
        txt_func_salario.setText("");
        
        bg_sexo.clearSelection();
        LoadTableFunc();
        Botoes(true, false, false, false, false);
        Campos(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txt_func_codigo.setText("");
        txt_func_nome.setText("");
        txt_func_cpf.setText("");
        txt_func_rg.setText("");
        txt_func_data_nascimento.setText("");
        txt_func_telefone.setText("");
        txt_func_salario.setText("");
        bg_sexo.clearSelection();
        Botoes(true, false, false, false, false);
        Campos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Object> cb_cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_masc;
    private javax.swing.JTable tbl_func;
    private javax.swing.JTextField txt_func_codigo;
    private javax.swing.JTextField txt_func_cpf;
    private javax.swing.JTextField txt_func_data_nascimento;
    private javax.swing.JTextField txt_func_nome;
    private javax.swing.JTextField txt_func_rg;
    private javax.swing.JTextField txt_func_salario;
    private javax.swing.JTextField txt_func_telefone;
    // End of variables declaration//GEN-END:variables
}
