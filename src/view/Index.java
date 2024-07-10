
package view;

import controller.ProdControlador;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class Index extends javax.swing.JFrame {
    ProdControlador Control = new ProdControlador();
    
    public Index() {
        initComponents();
        
        ListagemTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        ScrollTabela = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        TextPesquisa = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        Inserir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Deletar = new javax.swing.JButton();
        TextQuant = new javax.swing.JTextField();
        Texto4 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        TextPreco = new javax.swing.JTextField();
        Texto2 = new javax.swing.JLabel();
        TextMarca = new javax.swing.JTextField();
        Texto1 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Recortar = new javax.swing.JMenuItem();
        Copiar = new javax.swing.JMenuItem();
        Colar = new javax.swing.JMenuItem();
        Excluir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Produtos");
        setResizable(false);

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setForeground(new java.awt.Color(204, 204, 204));

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca", "Valor", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaProdutos.getTableHeader().setReorderingAllowed(false);
        TabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutosMouseClicked(evt);
            }
        });
        ScrollTabela.setViewportView(TabelaProdutos);

        TextPesquisa.setToolTipText("Pesquise o produto pelo nome ou marca dele");
        TextPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPesquisaActionPerformed(evt);
            }
        });

        Pesquisar.setText("🔍");
        Pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarMouseClicked(evt);
            }
        });

        Inserir.setText("Inserir");
        Inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InserirMouseClicked(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });

        Deletar.setText("Deletar");
        Deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletarMouseClicked(evt);
            }
        });

        Texto4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Texto4.setText("Quantidade do produto");

        Texto3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Texto3.setText("Preço do produto");

        Texto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Texto2.setText("Marca do produto");

        Texto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Texto1.setText("Nome do produto");

        TextID.setEditable(false);
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addComponent(Inserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Deletar))
                    .addComponent(TextQuant)
                    .addComponent(Texto4)
                    .addComponent(Texto3)
                    .addComponent(TextPreco)
                    .addComponent(Texto2)
                    .addComponent(TextMarca)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto1)
                            .addComponent(TextNome))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addComponent(TextPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Texto1)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ScrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        File.setText("Arquivo");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        File.add(Sair);

        Menu.add(File);

        Edit.setText("Editar");

        Recortar.setText("Recortar");
        Recortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecortarActionPerformed(evt);
            }
        });
        Edit.add(Recortar);

        Copiar.setText("Copiar");
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        Edit.add(Copiar);

        Colar.setText("Colar");
        Colar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColarActionPerformed(evt);
            }
        });
        Edit.add(Colar);

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        Edit.add(Excluir);

        Menu.add(Edit);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    // Fechar programa
    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void RecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecortarActionPerformed

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CopiarActionPerformed

    private void ColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirActionPerformed

    private void InserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserirMouseClicked
        Produto PD = new Produto();
        
        PD.setNome(this.TextNome.getText());
        PD.setMarca(this.TextMarca.getText());
        PD.setValor(Double.parseDouble(this.TextPreco.getText()));
        PD.setEstoque(Integer.parseInt(this.TextQuant.getText()));
        
        Control.InserirProduto(PD);
        ListagemTabela();
    }//GEN-LAST:event_InserirMouseClicked

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        Produto PD = new Produto();
        
        PD.setID(Integer.parseInt(this.TextID.getText()));
        PD.setNome(this.TextNome.getText());
        PD.setMarca(this.TextMarca.getText());
        PD.setValor(Double.parseDouble(this.TextPreco.getText()));
        PD.setEstoque(Integer.parseInt(this.TextQuant.getText()));
        
        Control.AtualizarProduto(PD);
        ListagemTabela();
    }//GEN-LAST:event_EditarMouseClicked

    private void DeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletarMouseClicked
        Control.ExcluirProduto(Integer.parseInt(this.TextID.getText()));
        ListagemTabela();
    }//GEN-LAST:event_DeletarMouseClicked

    private void TextPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPesquisaActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.TabelaProdutos.getModel();
        model.setNumRows(0);
        
        for(Produto PD : Control.PesquisarProdutos(this.TextPesquisa.getText())) {
            model.addRow(new Object[]{
                PD.getNome(),
                PD.getMarca(),
                PD.getValor(),
                PD.getEstoque()
            });
        }
    }//GEN-LAST:event_TextPesquisaActionPerformed

    private void PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarMouseClicked
        DefaultTableModel model = (DefaultTableModel) this.TabelaProdutos.getModel();
        model.setNumRows(0);
        
        for(Produto PD : Control.PesquisarProdutos(this.TextPesquisa.getText())) {
            model.addRow(new Object[]{
                PD.getNome(),
                PD.getMarca(),
                PD.getValor(),
                PD.getEstoque()
            });
        }
    }//GEN-LAST:event_PesquisarMouseClicked

    private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
        this.TextID.setText(""+ (int) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 0));
        this.TextNome.setText((String) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 1));
        this.TextMarca.setText((String) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 2));
        this.TextPreco.setText(""+ (double) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 3));
        this.TextQuant.setText(""+ (int) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 4));
        
    }//GEN-LAST:event_TabelaProdutosMouseClicked

    private void ListagemTabela() {
        DefaultTableModel model = (DefaultTableModel) this.TabelaProdutos.getModel();
        model.setNumRows(0);
        
        for(Produto PD : Control.ListarProdutos()) {
            model.addRow(new Object[]{
                PD.getID(),
                PD.getNome(),
                PD.getMarca(),
                PD.getValor(),
                PD.getEstoque()
            });
        }
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Colar;
    private javax.swing.JMenuItem Copiar;
    private javax.swing.JButton Deletar;
    private javax.swing.JMenu Edit;
    private javax.swing.JButton Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JMenu File;
    private javax.swing.JPanel Fundo;
    private javax.swing.JButton Inserir;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JMenuItem Recortar;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JScrollPane ScrollTabela;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMarca;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JTextField TextPreco;
    private javax.swing.JTextField TextQuant;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Texto4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
