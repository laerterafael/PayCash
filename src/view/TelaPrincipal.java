package view;

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
    
    private boolean logado = false;
    public String title = "";
    
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        title = this.getTitle();
        Logado(false);
        
    }
    
    public void Logado(boolean l){
        if(l){
            this.setTitle(title + " - Administrador");
            MenuCadastro.setEnabled(true);
            MenuPagamento.setEnabled(true);
            MenuRelatorio.setEnabled(true);
            MenuConfig.setEnabled(true);
            menuLogin.setEnabled(false);
            menuSair.setEnabled(true);
        }else{
            this.setTitle(title);
            MenuCadastro.setEnabled(false);
            MenuPagamento.setEnabled(false);
            MenuRelatorio.setEnabled(false);
            MenuConfig.setEnabled(false);            
            menuLogin.setEnabled(true);
            menuSair.setEnabled(false);
            
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

        jdpprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuFechar = new javax.swing.JMenuItem();
        MenuCadastro = new javax.swing.JMenu();
        menuUsuario = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenuItem();
        menuCargo = new javax.swing.JMenuItem();
        MenuPagamento = new javax.swing.JMenu();
        menuAgendar = new javax.swing.JMenuItem();
        menuProcessar = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        menuGeral = new javax.swing.JMenuItem();
        menuPagamentos = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenuItem();
        MenuConfig = new javax.swing.JMenu();
        menuBancoDeDados = new javax.swing.JMenuItem();
        menuConfigGeral = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PayCash - Sistema de Pagamentos");

        jdpprincipal.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jdpprincipal.setPreferredSize(new java.awt.Dimension(800, 600));

        org.jdesktop.layout.GroupLayout jdpprincipalLayout = new org.jdesktop.layout.GroupLayout(jdpprincipal);
        jdpprincipal.setLayout(jdpprincipalLayout);
        jdpprincipalLayout.setHorizontalGroup(
            jdpprincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 800, Short.MAX_VALUE)
        );
        jdpprincipalLayout.setVerticalGroup(
            jdpprincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 600, Short.MAX_VALUE)
        );

        MenuArquivo.setText("Arquivo");

        menuLogin.setText("Login");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        MenuArquivo.add(menuLogin);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        MenuArquivo.add(menuSair);

        menuFechar.setText("Fechar");
        menuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFecharActionPerformed(evt);
            }
        });
        MenuArquivo.add(menuFechar);

        jMenuBar1.add(MenuArquivo);

        MenuCadastro.setText("Cadastro");

        menuUsuario.setText("Usuário");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(menuUsuario);

        menuFuncionario.setText("Funcionário");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(menuFuncionario);

        menuCargo.setText("Cargo");
        menuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargoActionPerformed(evt);
            }
        });
        MenuCadastro.add(menuCargo);

        jMenuBar1.add(MenuCadastro);

        MenuPagamento.setText("Pagamentos");

        menuAgendar.setText("Agendar");
        menuAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendarActionPerformed(evt);
            }
        });
        MenuPagamento.add(menuAgendar);

        menuProcessar.setText("Processar");
        MenuPagamento.add(menuProcessar);

        jMenuBar1.add(MenuPagamento);

        MenuRelatorio.setText("Relatórios");

        menuGeral.setText("Geral");
        menuGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGeralActionPerformed(evt);
            }
        });
        MenuRelatorio.add(menuGeral);

        menuPagamentos.setText("Pagamentos");
        menuPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPagamentosActionPerformed(evt);
            }
        });
        MenuRelatorio.add(menuPagamentos);

        menuFuncionarios.setText("Funcionários");
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });
        MenuRelatorio.add(menuFuncionarios);

        jMenuBar1.add(MenuRelatorio);

        MenuConfig.setText("Configuração");

        menuBancoDeDados.setText("Banco de Dados");
        menuBancoDeDados.setEnabled(false);
        MenuConfig.add(menuBancoDeDados);

        menuConfigGeral.setText("Geral");
        menuConfigGeral.setEnabled(false);
        MenuConfig.add(menuConfigGeral);

        jMenuBar1.add(MenuConfig);

        MenuAjuda.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(menuSobre);

        jMenuBar1.add(MenuAjuda);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jdpprincipal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jdpprincipal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargoActionPerformed
        CadastroCargos obj = new CadastroCargos();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_menuCargoActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
        CadastroFuncionarios obj = new CadastroFuncionarios();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        CadastroUsuarios obj = new CadastroUsuarios();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuLoginActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        new TelaPrincipal().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFecharActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        TelaSobre obj = new TelaSobre();
        jdpprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGeralActionPerformed
        RelatorioGeral g = new RelatorioGeral();
        jdpprincipal.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_menuGeralActionPerformed

    private void menuAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendarActionPerformed
        CadastroPagamentos p = new CadastroPagamentos();
        jdpprincipal.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_menuAgendarActionPerformed

    private void menuPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPagamentosActionPerformed
        RelatorioPagamentos rp = new RelatorioPagamentos();
        jdpprincipal.add(rp);
        rp.setVisible(true);
    }//GEN-LAST:event_menuPagamentosActionPerformed

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        RelatorioFuncionarios rf = new RelatorioFuncionarios();
        jdpprincipal.add(rf);
        rf.setVisible(true);
    }//GEN-LAST:event_menuFuncionariosActionPerformed

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
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuConfig;
    private javax.swing.JMenu MenuPagamento;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpprincipal;
    private javax.swing.JMenuItem menuAgendar;
    private javax.swing.JMenuItem menuBancoDeDados;
    private javax.swing.JMenuItem menuCargo;
    private javax.swing.JMenuItem menuConfigGeral;
    private javax.swing.JMenuItem menuFechar;
    private javax.swing.JMenuItem menuFuncionario;
    private javax.swing.JMenuItem menuFuncionarios;
    private javax.swing.JMenuItem menuGeral;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuPagamentos;
    private javax.swing.JMenuItem menuProcessar;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuUsuario;
    // End of variables declaration//GEN-END:variables
}
