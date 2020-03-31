package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Cargo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laert
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    
    String action = "Padrao";
    ArrayList<Cargo> ListaCargo = new ArrayList();
    
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultControlCargo();
        DefaultControlFunc();
    }
    
    public void LoadTableCargo(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object []{"Codigo", "Name","Salário"},0);
        
        for (int i = 0; i < ListaCargo.size(); i++) {
            Object linha[] = new Object[]{ListaCargo.get(i).getCodigo(),ListaCargo.get(i).getNome(),ListaCargo.get(i).getSalario()};
            modelo.addRow(linha);
        }
        tbl_cargo.setModel(modelo);
        tbl_cargo.getColumnModel().getColumn(0).setResizable(false);
        tbl_cargo.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbl_cargo.getColumnModel().getColumn(1).setResizable(false);
        tbl_cargo.getColumnModel().getColumn(2).setResizable(false);
        
        LoadCBCargo();
    }
    
    public void LoadCBCargo(){
        cb_cargo.removeAllItems();
        
        for (int i = 0; i<ListaCargo.size(); i++) {
            cb_cargo.addItem(ListaCargo.get(i).getNome());
        }
    }
    
    public void DefaultControlFunc(){
        switch(action){
            case "Padrao" :
                btn_func_salvar.setEnabled(false);
                btn_func_novo.setEnabled(true);
                btn_func_cancelar.setEnabled(false);
                txt_func_codigo.setEnabled(false);
                txt_func_nome.setEnabled(false);
                txt_func_cpf.setEnabled(false);
                txt_func_rg.setEnabled(false);
                txt_func_data_nascimento.setEnabled(false);
                txt_func_telefone.setEnabled(false);
                rb_fem.setEnabled(false);
                rb_masc.setEnabled(false);
                break;
            
            case "Novo":
                btn_func_salvar.setEnabled(true);
                btn_func_cancelar.setEnabled(true);
                btn_func_editar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                btn_func_desativar.setEnabled(false);
                btn_func_novo.setEnabled(false);
                txt_func_codigo.setEnabled(true);
                txt_func_nome.setEnabled(true);
                txt_func_cpf.setEnabled(true);
                txt_func_rg.setEnabled(true);
                txt_func_data_nascimento.setEnabled(true);
                txt_func_telefone.setEnabled(true);
                rb_fem.setEnabled(true);
                rb_masc.setEnabled(true);
                break;
            
            case "Salvar":
                btn_func_salvar.setEnabled(false);
                btn_func_cancelar.setEnabled(false);
                btn_func_editar.setEnabled(true);
                btn_func_excluir.setEnabled(true);
                btn_func_desativar.setEnabled(true);
                txt_func_codigo.setEnabled(false);
                txt_func_nome.setEnabled(false);
                txt_func_cpf.setEnabled(false);
                txt_func_rg.setEnabled(false);
                txt_func_data_nascimento.setEnabled(false);
                txt_func_telefone.setEnabled(false);
                rb_fem.setEnabled(false);
                rb_masc.setEnabled(false);
                break;
                    
        }
    }

    public void DefaultControlCargo(){
        switch(action){
            case "Padrao" :
                btn_cargo_salvar.setEnabled(false);
                btn_cargo_cancelar.setEnabled(false);
                btn_cargo_editar.setEnabled(false);
                btn_cargo_excluir.setEnabled(false);
                btn_cargo_novo.setEnabled(true);
                btn_cargo_desativar.setEnabled(false);
                txt_cargo_codigo.setEnabled(false);
                txt_cargo_nome.setEnabled(false);
                txt_cargo_salario.setEnabled(false);
                break;
            
            case "Novo":
                btn_cargo_salvar.setEnabled(true);
                btn_cargo_cancelar.setEnabled(true);
                btn_cargo_editar.setEnabled(false);
                btn_cargo_excluir.setEnabled(false);
                btn_cargo_desativar.setEnabled(false);
                btn_cargo_novo.setEnabled(false);
                txt_cargo_codigo.setEnabled(true);
                txt_cargo_nome.setEnabled(true);
                txt_cargo_salario.setEnabled(true);
                break;
            
            case "Salvar":
                btn_cargo_salvar.setEnabled(false);
                btn_cargo_cancelar.setEnabled(false);
                btn_cargo_editar.setEnabled(false);
                btn_cargo_excluir.setEnabled(false);
                btn_cargo_desativar.setEnabled(false);
                btn_cargo_novo.setEnabled(true);
                txt_cargo_codigo.setEnabled(false);
                txt_cargo_nome.setEnabled(false);
                txt_cargo_salario.setEnabled(false);
                break;
            
            case "Editar":
                btn_cargo_salvar.setEnabled(true);
                btn_cargo_cancelar.setEnabled(true);
                btn_cargo_editar.setEnabled(false);
                btn_cargo_excluir.setEnabled(false);
                btn_cargo_desativar.setEnabled(false);
                btn_cargo_novo.setEnabled(false);
                txt_cargo_codigo.setEnabled(true);
                txt_cargo_nome.setEnabled(true);
                txt_cargo_salario.setEnabled(true);
                break;
            
            case "Selecao":
                btn_cargo_salvar.setEnabled(false);
                btn_cargo_cancelar.setEnabled(false);
                btn_cargo_editar.setEnabled(true);
                btn_cargo_excluir.setEnabled(true);
                btn_cargo_desativar.setEnabled(true);
                btn_cargo_novo.setEnabled(true);
                txt_cargo_codigo.setEnabled(false);
                txt_cargo_nome.setEnabled(false);
                txt_cargo_salario.setEnabled(false);
                break;
             
                    
        }
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
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_func = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_func_cancelar = new javax.swing.JButton();
        btn_func_salvar = new javax.swing.JButton();
        txt_func_codigo = new javax.swing.JTextField();
        txt_func_nome = new javax.swing.JTextField();
        txt_func_cpf = new javax.swing.JTextField();
        txt_func_rg = new javax.swing.JTextField();
        rb_masc = new javax.swing.JRadioButton();
        rb_fem = new javax.swing.JRadioButton();
        txt_func_data_nascimento = new javax.swing.JTextField();
        txt_func_telefone = new javax.swing.JTextField();
        cb_cargo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btn_func_novo = new javax.swing.JButton();
        btn_func_editar = new javax.swing.JButton();
        btn_func_desativar = new javax.swing.JButton();
        btn_func_excluir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_cargo = new javax.swing.JTable();
        btn_cargo_novo = new javax.swing.JButton();
        btn_cargo_editar = new javax.swing.JButton();
        btn_cargo_desativar = new javax.swing.JButton();
        btn_cargo_excluir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_cargo_salvar = new javax.swing.JButton();
        btn_cargo_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_cargo_codigo = new javax.swing.JTextField();
        txt_cargo_nome = new javax.swing.JTextField();
        txt_cargo_salario = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Visão Geral"));
        jPanel5.setToolTipText("Visão Geral");
        jPanel5.setName("Visão Geral"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Geral", jPanel2);

        tbl_func.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CPF", "Função"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_func);
        if (tbl_func.getColumnModel().getColumnCount() > 0) {
            tbl_func.getColumnModel().getColumn(0).setResizable(false);
            tbl_func.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_func.getColumnModel().getColumn(1).setResizable(false);
            tbl_func.getColumnModel().getColumn(2).setResizable(false);
            tbl_func.getColumnModel().getColumn(2).setPreferredWidth(20);
            tbl_func.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados"));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("RG:");

        jLabel5.setText("Sexo:");

        jLabel7.setText("Data Nascimento:");

        jLabel8.setText("Telefone:");

        btn_func_cancelar.setText("Cancelar");
        btn_func_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_cancelarActionPerformed(evt);
            }
        });

        btn_func_salvar.setText("Salvar");
        btn_func_salvar.setMaximumSize(new java.awt.Dimension(75, 23));
        btn_func_salvar.setMinimumSize(new java.awt.Dimension(75, 23));
        btn_func_salvar.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_func_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_salvarActionPerformed(evt);
            }
        });

        txt_func_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_func_codigoActionPerformed(evt);
            }
        });

        bg_sexo.add(rb_masc);
        rb_masc.setText("Masculino");
        rb_masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_mascActionPerformed(evt);
            }
        });

        bg_sexo.add(rb_fem);
        rb_fem.setText("Feminino");

        jLabel11.setText("Cargo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_func_nome)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txt_func_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_func_rg, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txt_func_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_func_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_func_cancelar)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_func_data_nascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txt_func_telefone))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rb_masc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_fem)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_func_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_func_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_func_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_func_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_func_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_masc)
                    .addComponent(rb_fem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_cancelar)
                    .addComponent(btn_func_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_func_novo.setText("Novo");
        btn_func_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_novoActionPerformed(evt);
            }
        });

        btn_func_editar.setText("Editar");
        btn_func_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_editarActionPerformed(evt);
            }
        });

        btn_func_desativar.setText("Desativar");
        btn_func_desativar.setPreferredSize(new java.awt.Dimension(75, 23));

        btn_func_excluir.setText("Excluir");
        btn_func_excluir.setMaximumSize(new java.awt.Dimension(75, 23));
        btn_func_excluir.setMinimumSize(new java.awt.Dimension(75, 23));
        btn_func_excluir.setPreferredSize(new java.awt.Dimension(75, 23));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_func_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_func_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_func_desativar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_func_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_novo)
                    .addComponent(btn_func_editar)
                    .addComponent(btn_func_desativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_func_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Funcionários", jPanel3);

        tbl_cargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Salário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cargoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_cargo);
        if (tbl_cargo.getColumnModel().getColumnCount() > 0) {
            tbl_cargo.getColumnModel().getColumn(0).setResizable(false);
            tbl_cargo.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbl_cargo.getColumnModel().getColumn(1).setResizable(false);
            tbl_cargo.getColumnModel().getColumn(2).setResizable(false);
        }

        btn_cargo_novo.setText("Novo");
        btn_cargo_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargo_novoActionPerformed(evt);
            }
        });

        btn_cargo_editar.setText("Editar");
        btn_cargo_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargo_editarActionPerformed(evt);
            }
        });

        btn_cargo_desativar.setText("Desativar");
        btn_cargo_desativar.setPreferredSize(new java.awt.Dimension(75, 23));

        btn_cargo_excluir.setText("Excluir");
        btn_cargo_excluir.setMaximumSize(new java.awt.Dimension(75, 23));
        btn_cargo_excluir.setMinimumSize(new java.awt.Dimension(75, 23));
        btn_cargo_excluir.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_cargo_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargo_excluirActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados"));

        btn_cargo_salvar.setText("Salvar");
        btn_cargo_salvar.setMaximumSize(new java.awt.Dimension(75, 23));
        btn_cargo_salvar.setMinimumSize(new java.awt.Dimension(75, 23));
        btn_cargo_salvar.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_cargo_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargo_salvarActionPerformed(evt);
            }
        });

        btn_cargo_cancelar.setText("Cancelar");
        btn_cargo_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargo_cancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Código:");

        jLabel9.setText("Nome:");

        jLabel10.setText("Salário:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cargo_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cargo_cancelar)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cargo_nome)
                    .addComponent(txt_cargo_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txt_cargo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cargo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_cargo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_cargo_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cargo_cancelar)
                    .addComponent(btn_cargo_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cargo_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cargo_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cargo_desativar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cargo_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cargo_novo)
                    .addComponent(btn_cargo_editar)
                    .addComponent(btn_cargo_desativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cargo_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Cargos", jPanel1);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Salvar");
        jMenu1.add(jMenuItem1);

        jMenuItem10.setText("Sair");
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");

        jMenuItem7.setText("Usuário");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Funcionário");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Função");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenuItem5.setText("Geral");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Pagamentos");
        jMenu3.add(jMenuItem6);

        jMenuItem3.setText("Funcionários");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Funções");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configuração");

        jMenuItem11.setText("Banco de Dados");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Geral");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ajuda");

        jMenuItem2.setText("Sobre");
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargo_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargo_cancelarActionPerformed
        txt_cargo_codigo.setText("");
        txt_cargo_nome.setText("");
        txt_cargo_salario.setText("");
        action = "Padrao";
        DefaultControlCargo();
        
    }//GEN-LAST:event_btn_cargo_cancelarActionPerformed

    private void btn_cargo_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargo_salvarActionPerformed
        int cod = Integer.parseInt(txt_cargo_codigo.getText());
        String nome = txt_cargo_nome.getText();
        double salario = Double.parseDouble(txt_cargo_salario.getText());
        
        if (action.equals("Novo")) {
            Cargo cargo = new Cargo(cod,nome,salario);
            ListaCargo.add(cargo);
        }else if(action.equals("Editar")){
            int index = tbl_cargo.getSelectedRow();
            ListaCargo.get(index).setCodigo(cod);
            ListaCargo.get(index).setNome(nome);
            ListaCargo.get(index).setSalario(salario);
                   
        }
        
        LoadTableCargo();
        
        txt_cargo_codigo.setText("");
        txt_cargo_nome.setText("");
        txt_cargo_salario.setText("");
        action = "Salvar";
        DefaultControlCargo();
    }//GEN-LAST:event_btn_cargo_salvarActionPerformed

    private void btn_cargo_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargo_editarActionPerformed
        action = "Editar";
        DefaultControlCargo();
        
    }//GEN-LAST:event_btn_cargo_editarActionPerformed

    private void btn_cargo_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargo_novoActionPerformed
        txt_cargo_codigo.setText("");
        txt_cargo_nome.setText("");
        txt_cargo_salario.setText("");
        action = "Novo";
        DefaultControlCargo();
        
    }//GEN-LAST:event_btn_cargo_novoActionPerformed

    private void btn_func_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_editarActionPerformed
        action = "Editar";
        DefaultControlFunc();
    }//GEN-LAST:event_btn_func_editarActionPerformed

    private void btn_func_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_novoActionPerformed
        txt_func_codigo.setText("");
        txt_func_nome.setText("");
        txt_func_cpf.setText("");
        txt_func_rg.setText("");
        txt_func_data_nascimento.setText("");
        txt_func_telefone.setText("");
        bg_sexo.clearSelection();

        action = "Novo";
        DefaultControlFunc();
    }//GEN-LAST:event_btn_func_novoActionPerformed

    private void rb_mascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_mascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_mascActionPerformed

    private void txt_func_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_func_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_func_codigoActionPerformed

    private void btn_func_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_salvarActionPerformed
        txt_func_codigo.setText("");
        txt_func_nome.setText("");
        txt_func_cpf.setText("");
        txt_func_rg.setText("");
        txt_func_data_nascimento.setText("");
        txt_func_telefone.setText("");
        bg_sexo.clearSelection();

        action = "Salvar";
        DefaultControlFunc();
    }//GEN-LAST:event_btn_func_salvarActionPerformed

    private void btn_func_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_cancelarActionPerformed
        txt_func_codigo.setText("");
        txt_func_nome.setText("");
        txt_func_cpf.setText("");
        txt_func_rg.setText("");
        txt_func_data_nascimento.setText("");
        txt_func_telefone.setText("");
        bg_sexo.clearSelection();

        action = "Padrao";
        DefaultControlFunc();
    }//GEN-LAST:event_btn_func_cancelarActionPerformed

    private void tbl_cargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cargoMouseClicked
        int index = tbl_cargo.getSelectedRow();
        if (index>=0 & index<ListaCargo.size()){
            Cargo c = ListaCargo.get(index);
            txt_cargo_codigo.setText(String.valueOf(c.getCodigo()));
            txt_cargo_nome.setText(c.getNome());
            txt_cargo_salario.setText(String.valueOf(c.getSalario()));
        }
        
        action = "Selecao";
        
        
        DefaultControlCargo();
    }//GEN-LAST:event_tbl_cargoMouseClicked

    private void btn_cargo_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargo_excluirActionPerformed
        int index = tbl_cargo.getSelectedRow();
        if (index>=0 & index<ListaCargo.size()){
            ListaCargo.remove(index);
        }
        LoadTableCargo();
        action = "Padrao";
        DefaultControlCargo();
    }//GEN-LAST:event_btn_cargo_excluirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.JButton btn_cargo_cancelar;
    private javax.swing.JButton btn_cargo_desativar;
    private javax.swing.JButton btn_cargo_editar;
    private javax.swing.JButton btn_cargo_excluir;
    private javax.swing.JButton btn_cargo_novo;
    private javax.swing.JButton btn_cargo_salvar;
    private javax.swing.JButton btn_func_cancelar;
    private javax.swing.JButton btn_func_desativar;
    private javax.swing.JButton btn_func_editar;
    private javax.swing.JButton btn_func_excluir;
    private javax.swing.JButton btn_func_novo;
    private javax.swing.JButton btn_func_salvar;
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_masc;
    private javax.swing.JTable tbl_cargo;
    private javax.swing.JTable tbl_func;
    private javax.swing.JTextField txt_cargo_codigo;
    private javax.swing.JTextField txt_cargo_nome;
    private javax.swing.JTextField txt_cargo_salario;
    private javax.swing.JTextField txt_func_codigo;
    private javax.swing.JTextField txt_func_cpf;
    private javax.swing.JTextField txt_func_data_nascimento;
    private javax.swing.JTextField txt_func_nome;
    private javax.swing.JTextField txt_func_rg;
    private javax.swing.JTextField txt_func_telefone;
    // End of variables declaration//GEN-END:variables
}
