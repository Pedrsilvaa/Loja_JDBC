
package view;

import javax.swing.JOptionPane;
import controller.ProdControlador;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class Index extends javax.swing.JFrame {
    ProdControlador Control = new ProdControlador();
    JOptionPane JP = new JOptionPane();
    
    public Index() {
        initComponents(); // Inicia os componentes do JFrame
        ListagemTabela(); // Lista os dados no banco de dados na JTable
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
        Texto4 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        TextMarca = new javax.swing.JTextField();
        Texto1 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        Texto5 = new javax.swing.JLabel();
        TextEstoque = new javax.swing.JTextField();
        TextValor = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        FundoMovimentacao = new javax.swing.JPanel();
        Texto6 = new javax.swing.JLabel();
        TextQuantidade = new javax.swing.JTextField();
        Texto7 = new javax.swing.JLabel();
        Entrada = new javax.swing.JButton();
        Saida = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Produtos");
        setResizable(false);

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setForeground(new java.awt.Color(204, 204, 204));

        TabelaProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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

        TextPesquisa.setBackground(new java.awt.Color(255, 255, 255));
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
        Inserir.setPreferredSize(new java.awt.Dimension(78, 50));
        Inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InserirMouseClicked(evt);
            }
        });

        Editar.setText("Editar");
        Editar.setPreferredSize(new java.awt.Dimension(78, 50));
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });

        Deletar.setText("Deletar");
        Deletar.setPreferredSize(new java.awt.Dimension(78, 50));
        Deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletarMouseClicked(evt);
            }
        });

        Texto4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Texto4.setText("Estoque");

        Texto3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Texto3.setText("Valor");

        Texto2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Texto2.setText("Marca");

        TextMarca.setBackground(new java.awt.Color(255, 255, 255));

        Texto1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Texto1.setText("Nome");

        TextNome.setBackground(new java.awt.Color(255, 255, 255));

        TextID.setEditable(false);
        TextID.setBackground(new java.awt.Color(235, 235, 235));
        TextID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TextID.setForeground(new java.awt.Color(0, 0, 0));
        TextID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextID.setToolTipText("Exibe o ID do produto selecionado na tabela (ID é auto implementado)");
        TextID.setFocusable(false);

        Texto5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Texto5.setText("ID");

        TextEstoque.setBackground(new java.awt.Color(255, 255, 255));

        TextValor.setBackground(new java.awt.Color(255, 255, 255));

        Cancelar.setText("Cancelar");
        Cancelar.setPreferredSize(new java.awt.Dimension(78, 50));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });

        FundoMovimentacao.setBackground(new java.awt.Color(255, 255, 255));
        FundoMovimentacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        FundoMovimentacao.setToolTipText("Informar quantidade de entrada ou saída e clique no botão correspondente");

        Texto6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Texto6.setText("Movimentação");
        Texto6.setEnabled(false);

        TextQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        TextQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TextQuantidade.setText("0");
        TextQuantidade.setEnabled(false);

        Texto7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Texto7.setText("Quantidade");
        Texto7.setEnabled(false);

        Entrada.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Entrada.setText("Entrada");
        Entrada.setEnabled(false);
        Entrada.setPreferredSize(new java.awt.Dimension(72, 30));
        Entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaMouseClicked(evt);
            }
        });

        Saida.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Saida.setText("Saída");
        Saida.setEnabled(false);
        Saida.setPreferredSize(new java.awt.Dimension(72, 30));
        Saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FundoMovimentacaoLayout = new javax.swing.GroupLayout(FundoMovimentacao);
        FundoMovimentacao.setLayout(FundoMovimentacaoLayout);
        FundoMovimentacaoLayout.setHorizontalGroup(
            FundoMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoMovimentacaoLayout.createSequentialGroup()
                .addGroup(FundoMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoMovimentacaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(FundoMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FundoMovimentacaoLayout.createSequentialGroup()
                                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FundoMovimentacaoLayout.createSequentialGroup()
                                .addComponent(Texto7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FundoMovimentacaoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Texto6)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        FundoMovimentacaoLayout.setVerticalGroup(
            FundoMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoMovimentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FundoMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FundoMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Saida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FundoMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextMarca)
                            .addGroup(FundoLayout.createSequentialGroup()
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Texto1)
                                    .addComponent(TextNome)))
                            .addGroup(FundoLayout.createSequentialGroup()
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Texto2)
                                    .addGroup(FundoLayout.createSequentialGroup()
                                        .addComponent(Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Texto3)
                                    .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TextValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(TextEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Texto4, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addComponent(TextPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Texto1)
                            .addComponent(Texto5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextID, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(TextNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FundoLayout.createSequentialGroup()
                                .addComponent(Texto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Texto4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FundoMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ScrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
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
 
    // Este método fecha o programa
    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    /*
        Este método pega os dados da array valores, inserem
        o dado de cada index da array no objeto PD e em seguida
        manda o objeto para o método InserirProduto
    */
    private void InserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserirMouseClicked
        Produto PD = new Produto(); // Objeto instânciado
        boolean valoresExistem; // Variável booleano para condições
        String[] valores = PegarValores(); // Array que receberá os dados
        
        if(this.TextID.getText().isEmpty()) {
            valoresExistem = VerificarValores(valores);
            
            if(valoresExistem == true) {
                try {
                    PD.setNome(valores[1]);
                    PD.setMarca(valores[2]);
                    PD.setValor(Float.parseFloat(valores[3]));
                    PD.setEstoque(Short.parseShort(valores[4]));
                    Control.InserirProduto(PD);
                    LimparTextField();
                    ListagemTabela();
                }
                catch(NumberFormatException e) {
                    System.out.print(e);
                }
            }
            else {
                JP.showMessageDialog(null, "Não foi possível inserir produto.\nAlguns valores não foram inseridos.", "Gestor de Produtos", JP.ERROR_MESSAGE);
            }
        }
        else {
            JP.showMessageDialog(null, "Não é possível inserir produto já existente.\nSuas possíveis ações são:\n\nEDITAR e DELETAR", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InserirMouseClicked

    /*
        Este método pega os dados da array valores, inserem
        o dado de cada index da array no objeto PD e em seguida
        manda o objeto para o método AtualizarProduto
    */
    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        Produto PD = new Produto(); // Objeto instânciado
        boolean valoresExistem; // Variável booleano para condições
        String[] valores = PegarValores(); // Array que receberá os dados
        
        if(!"".equals(this.TextID.getText())) {
            valoresExistem = VerificarValores(valores);
            
            if(valoresExistem == true) {
                byte opcao = (byte) JP.showConfirmDialog(null, "Deseja mesmo deletar o produto?\nSaiba que sua ação é irreversível.", "Gestor de Produtos", JP.YES_NO_OPTION, JP.QUESTION_MESSAGE);
            
                if(opcao == 0) {
                    try {
                        PD.setID(Short.parseShort(valores[0]));
                        PD.setNome(valores[1]);
                        PD.setMarca(valores[2]);
                        PD.setValor(Float.parseFloat(valores[3]));
                        PD.setEstoque(Short.parseShort(valores[4]));
                        Control.AtualizarProduto(PD);
                        LimparTextField();
                        ListagemTabela();
                        DesabilitarMovi();
                    }
                    catch(NumberFormatException e) {
                        System.out.print(e);
                    }
                }
            }
            else {
                JP.showMessageDialog(null, "Não foi possível inserir produto.\nAlguns valores não foram inseridos.", "Gestor de Produtos", JP.ERROR_MESSAGE);
            }
        }
        else {
            JP.showMessageDialog(null, "Não é possível atualizar produto não existente.\nSua possível ação é:\n\nINSERIR", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EditarMouseClicked

    /*
        Este método pega o ID exibido no JTextField TextID
        e manda o valor ao método ExcluirProduto
    */
    private void DeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletarMouseClicked
        if(!"".equals(this.TextID.getText())) {
            byte opcao = (byte) JP.showConfirmDialog(null, "Deseja mesmo deletar o produto?\nSaiba que sua ação é irreversível.", "Gestor de Produtos", JP.YES_NO_OPTION, JP.QUESTION_MESSAGE);
            
            if(opcao == 0) {
                Control.ExcluirProduto(Short.parseShort(this.TextID.getText()));
                LimparTextField();
                ListagemTabela();
                DesabilitarMovi();
            }     
        }
        else {
            JP.showMessageDialog(null, "Não é possível deletar produto não existente.\nSua possível ação é:\n\nINSERIR", "Gestor de Produtos", JP.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeletarMouseClicked

    // Este método chama ListagemPesquisa (Caso o JTextField for ativado)
    private void TextPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPesquisaActionPerformed
        ListagemPesquisa();
    }//GEN-LAST:event_TextPesquisaActionPerformed

    // Este método chama ListagemPesquisa (Caso o JButton for pressionado)
    private void PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarMouseClicked
        ListagemPesquisa();
    }//GEN-LAST:event_PesquisarMouseClicked

    /*
        Este método coleta os valores que estão na linha que
        o usuário clicou e os inserem nos seus respectivos
        JTextFields, e habilita a interação com o JPanel
        FundoMovimentacao
    */
    private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
        // Inserindo os valores nos JTextFields
        this.TextID.setText(""+ (short) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 0));
        this.TextNome.setText((String) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 1));
        this.TextMarca.setText((String) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 2));
        this.TextValor.setText(""+ (float) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 3));
        this.TextEstoque.setText(""+ (short) this.TabelaProdutos.getValueAt(this.TabelaProdutos.getSelectedRow(), 4));
        // Habilitando os componentes do FundoMovimentacao
        this.Texto6.setEnabled(true);
        this.Texto7.setEnabled(true);
        this.TextQuantidade.setEnabled(true);
        this.Entrada.setEnabled(true);
        this.Saida.setEnabled(true);
    }//GEN-LAST:event_TabelaProdutosMouseClicked

    // Este método cancela a ação que o usuário estava fazendo
    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        if(!"".equals(this.TextID.getText()) &&
           !"".equals(this.TextNome.getText()) &&
           !"".equals(this.TextMarca.getText()) &&
           !"".equals(this.TextValor.getText()) &&
           !"".equals(this.TextEstoque.getText())) {
            byte opcao = (byte) JP.showConfirmDialog(null, "Deseja mesmo cancelar a ação?", "Gestor de Produtos", JP.YES_NO_OPTION, JP.QUESTION_MESSAGE);
            
            if(opcao == 0) {
                LimparTextField();
                DesabilitarMovi();
            }
        }
    }//GEN-LAST:event_CancelarMouseClicked

    /*
        Este método pega o valor digitado no JTextField
        TextQuantidade e o adiciona com o valor do
        TextEstoque
    */
    private void EntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaMouseClicked
        try {
            short estoque = Short.parseShort(this.TextEstoque.getText());
            short quantidade = Short.parseShort(this.TextQuantidade.getText().replaceAll("[^0-9]", ""));
            this.TextEstoque.setText(""+ (estoque + quantidade));
            this.TextQuantidade.setText("0");
        }
        catch(NumberFormatException e) {
            JP.showMessageDialog(null, "Não é possível fazer essa operação.\nO valor digitado não é um número.", "Gestor de Produtos", JP.ERROR_MESSAGE);
            this.TextQuantidade.setText("0");
        }
    }//GEN-LAST:event_EntradaMouseClicked

    /*
        Este método pega o valor digitado no JTextField
        TextQuantidade e subtrai o valor do TextEstoque
        com o valor coletado do TextQuantidade
    */
    private void SaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaidaMouseClicked
        try {
            short estoque = Short.parseShort(this.TextEstoque.getText());
            short quantidade = Short.parseShort(this.TextQuantidade.getText().replaceAll("[^0-9]", ""));
        
            if(estoque < quantidade) {
                JP.showMessageDialog(null, "Não é possível fazer essa operação.\nO número digitado é maior que o estoque.", "Gestor de Produtos", JP.ERROR_MESSAGE);
            }
            else {
                this.TextEstoque.setText(""+ (estoque - quantidade));
            }
        
            this.TextQuantidade.setText("0");
        }
        catch(NumberFormatException e) {
            JP.showMessageDialog(null, "Não é possível fazer essa operação.\nO valor digitado não é um número.", "Gestor de Produtos", JP.ERROR_MESSAGE);
            this.TextQuantidade.setText("0");
        }
    }//GEN-LAST:event_SaidaMouseClicked

    /*
        Este método lista todos os dados do banco de dados
        na JTable TabelaProdutos
    */
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
    
    /*
        Este método lista todos os dados do banco de dados
        na JTable TabelaProdutos que foram especificados
        pelo usuário
    */
    private void ListagemPesquisa() {
        DefaultTableModel model = (DefaultTableModel) this.TabelaProdutos.getModel();
        model.setNumRows(0);
        
        for(Produto PD : Control.PesquisarProdutos(this.TextPesquisa.getText())) {
            model.addRow(new Object[]{
                PD.getID(),
                PD.getNome(),
                PD.getMarca(),
                PD.getValor(),
                PD.getEstoque()
            });
        }
    }
    
    /*
        Este método coleta os dados inseridos nos JTextFields
        e os devolvem numa array string
    */ 
    private String[] PegarValores() {
        String[] valores = {
            this.TextID.getText(),
            this.TextNome.getText(),
            this.TextMarca.getText(),
            this.TextValor.getText().replaceAll("[^0-9,.]", "").replaceAll(",", "."),
            this.TextEstoque.getText().replaceAll("[^0-9]", "")
        };
        return valores;
    }
    
    // Este método limpa os campos de textos
    private void LimparTextField() {
        this.TextID.setText("");
        this.TextMarca.setText("");
        this.TextNome.setText("");
        this.TextValor.setText("");
        this.TextEstoque.setText("");
    }
    
    /*
        Este método verifica se todos os dados foram digitados,
        retornando true se realmente foram ou retornando false
        caso contrário
    */
    private boolean VerificarValores(String[] valores) {
        byte i;
        
        for(i = 1; i < 5; i++) {
            if(valores[i].isEmpty()) {
                break;
            }
        }
        
        if(i == 5) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /*
        Este método desabilita a interação com os
        componentes do JPanel FundoMovimentacao
    */
    private void DesabilitarMovi() {
        this.Texto6.setEnabled(false);
        this.Texto7.setEnabled(false);
        this.TextQuantidade.setEnabled(false);
        this.Entrada.setEnabled(false);
        this.Saida.setEnabled(false);
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
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Deletar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Entrada;
    private javax.swing.JMenu File;
    private javax.swing.JPanel Fundo;
    private javax.swing.JPanel FundoMovimentacao;
    private javax.swing.JButton Inserir;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton Saida;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JScrollPane ScrollTabela;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JTextField TextEstoque;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextMarca;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JTextField TextQuantidade;
    private javax.swing.JTextField TextValor;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Texto4;
    private javax.swing.JLabel Texto5;
    private javax.swing.JLabel Texto6;
    private javax.swing.JLabel Texto7;
    // End of variables declaration//GEN-END:variables
}
