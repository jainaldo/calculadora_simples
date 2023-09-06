/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author jainaldo
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pForm = new javax.swing.JPanel();
        pCampos = new javax.swing.JPanel();
        lValor1 = new javax.swing.JLabel();
        lValor2 = new javax.swing.JLabel();
        lResultado = new javax.swing.JLabel();
        textVal1 = new javax.swing.JTextField();
        textVal2 = new javax.swing.JTextField();
        textResultado = new javax.swing.JTextField();
        pBotoes = new javax.swing.JPanel();
        botaoSomar = new javax.swing.JButton();
        botaoProximValor1 = new javax.swing.JButton();
        botaoSubtrair = new javax.swing.JButton();
        botaoDividir = new javax.swing.JButton();
        botaoMultiplicar = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botaoClear = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setName("janela"); // NOI18N

        pForm.setBackground(new java.awt.Color(0, 102, 153));

        pCampos.setBackground(new java.awt.Color(255, 204, 51));
        pCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        lValor1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lValor1.setForeground(new java.awt.Color(0, 0, 0));
        lValor1.setText("Valor1");

        lValor2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lValor2.setForeground(new java.awt.Color(0, 0, 0));
        lValor2.setText("Valor2");

        lResultado.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lResultado.setForeground(new java.awt.Color(0, 0, 0));
        lResultado.setText("Resultado");

        textVal1.setBackground(new java.awt.Color(255, 255, 255));
        textVal1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        textVal1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textVal1FocusGained(evt);
            }
        });

        textVal2.setBackground(new java.awt.Color(255, 255, 255));
        textVal2.setColumns(10);
        textVal2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        textVal2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textVal2FocusGained(evt);
            }
        });

        textResultado.setEditable(false);
        textResultado.setBackground(new java.awt.Color(255, 255, 255));
        textResultado.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        textResultado.setEnabled(false);

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(lValor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textVal1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(lResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(lValor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textVal2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor1)
                    .addComponent(textVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor2)
                    .addComponent(textVal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResultado))
                .addGap(30, 30, 30))
        );

        botaoSomar.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoSomar.setText("+");
        botaoSomar.setActionCommand("Próximo Valor");
        botaoSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomarActionPerformed(evt);
            }
        });

        botaoProximValor1.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoProximValor1.setText("Próximo Valor");
        botaoProximValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximValor1ActionPerformed(evt);
            }
        });

        botaoSubtrair.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoSubtrair.setText("-");
        botaoSubtrair.setActionCommand("Próximo Valor");
        botaoSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtrairActionPerformed(evt);
            }
        });

        botaoDividir.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoDividir.setText("/");
        botaoDividir.setActionCommand("Próximo Valor");
        botaoDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDividirActionPerformed(evt);
            }
        });

        botaoMultiplicar.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoMultiplicar.setText("*");
        botaoMultiplicar.setActionCommand("Próximo Valor");
        botaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicarActionPerformed(evt);
            }
        });

        botaoIgual.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoIgual.setText("=");
        botaoIgual.setActionCommand("Próximo Valor");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao3.setText("3");
        botao3.setActionCommand("Próximo Valor");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao2.setText("2");
        botao2.setActionCommand("Próximo Valor");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao1.setText("1");
        botao1.setActionCommand("Próximo Valor");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao4.setText("4");
        botao4.setActionCommand("Próximo Valor");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao5.setText("5");
        botao5.setActionCommand("Próximo Valor");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao6.setText("6");
        botao6.setActionCommand("Próximo Valor");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao7.setText("7");
        botao7.setActionCommand("Próximo Valor");
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao8.setText("8");
        botao8.setActionCommand("Próximo Valor");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao9.setText("9");
        botao9.setActionCommand("Próximo Valor");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botaoClear.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoClear.setText("Clear");
        botaoClear.setActionCommand("Próximo Valor");
        botaoClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClearActionPerformed(evt);
            }
        });

        botao0.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botao0.setText("0");
        botao0.setActionCommand("Próximo Valor");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botaoExit.setFont(new java.awt.Font("Liberation Sans", 0, 26)); // NOI18N
        botaoExit.setText("Exit");
        botaoExit.setActionCommand("Próximo Valor");
        botaoExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotoesLayout = new javax.swing.GroupLayout(pBotoes);
        pBotoes.setLayout(pBotoesLayout);
        pBotoesLayout.setHorizontalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pBotoesLayout.createSequentialGroup()
                        .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoClear)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pBotoesLayout.createSequentialGroup()
                                .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pBotoesLayout.createSequentialGroup()
                                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProximValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pBotoesLayout.createSequentialGroup()
                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(114, Short.MAX_VALUE))
                        .addGroup(pBotoesLayout.createSequentialGroup()
                            .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))))
        );
        pBotoesLayout.setVerticalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSomar)
                    .addComponent(botaoProximValor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao1)
                    .addComponent(botao2)
                    .addComponent(botao3)
                    .addComponent(botaoSubtrair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDividir)
                    .addComponent(botao6)
                    .addComponent(botao5)
                    .addComponent(botao4))
                .addGap(4, 4, 4)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoMultiplicar)
                    .addComponent(botao9)
                    .addComponent(botao8)
                    .addComponent(botao7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoClear)
                    .addComponent(botao0)
                    .addComponent(botaoExit)
                    .addComponent(botaoIgual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pFormLayout = new javax.swing.GroupLayout(pForm);
        pForm.setLayout(pFormLayout);
        pFormLayout.setHorizontalGroup(
            pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(pCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pFormLayout.setVerticalGroup(
            pFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomarActionPerformed
        setOperacao("+");
    }//GEN-LAST:event_botaoSomarActionPerformed

    private void botaoProximValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximValor1ActionPerformed
        liberarProximoValor();
    }//GEN-LAST:event_botaoProximValor1ActionPerformed

    private void botaoSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtrairActionPerformed
        setOperacao("-");
    }//GEN-LAST:event_botaoSubtrairActionPerformed

    private void botaoDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDividirActionPerformed
        setOperacao("/");
    }//GEN-LAST:event_botaoDividirActionPerformed

    private void botaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicarActionPerformed
        setOperacao("*");
    }//GEN-LAST:event_botaoMultiplicarActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        calcular();
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        setValor("3");
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        setValor("2");
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        setValor("1");
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        setValor("4");
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        setValor("5");
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        setValor("6");
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        setValor("7");
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        setValor("8");
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        setValor("9");
    }//GEN-LAST:event_botao9ActionPerformed

    private void botaoClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClearActionPerformed
        limpar();
    }//GEN-LAST:event_botaoClearActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
       setValor("0");
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExitActionPerformed
        sair();
    }//GEN-LAST:event_botaoExitActionPerformed

    private void textVal1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textVal1FocusGained
        liberarValor2 = false;
    }//GEN-LAST:event_textVal1FocusGained

    private void textVal2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textVal2FocusGained
        liberarValor2 = true;
    }//GEN-LAST:event_textVal2FocusGained

    public void limpar() {
        textVal1.setText("");
        textVal2.setText("");
        textResultado.setText("");
        liberarValor2 = false;
        setOperacao("");
        textVal1.requestFocus();
    }
    
    public void sair() {
        dispose();
    }
    
    public void setValor(String valor) {
        if (!liberarValor2) {
            textVal1.setText(textVal1.getText().concat(valor));
        } else {
            textVal2.setText(textVal2.getText().concat(valor));
        }
    }
    
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    public void liberarProximoValor(){
        textVal2.requestFocus();
    }
        
    public boolean isPreenchido() {
        if (textVal1.getText().isBlank()) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Deve informar o Valor1", 
                    "Valor não informado", 
                    JOptionPane.WARNING_MESSAGE);
            textVal1.requestFocus();
            return false;
        } else if (textVal2.getText().isBlank()){
            JOptionPane.showMessageDialog(
                    null, 
                    "Deve informar o Valor2", 
                    "Valor não informado", 
                    JOptionPane.WARNING_MESSAGE);
            textVal2.requestFocus();
            return false;
        } else if (operacao.isBlank()){
            JOptionPane.showMessageDialog(
                    null, 
                    "Deve informar o Operação", 
                    "Operação não informada", 
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void calcular() {
        
        if (isPreenchido()) {
            int valor1;
            int valor2;
            
            try {
                valor1 = Integer.parseInt(textVal1.getText());
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                                null, 
                                "Informe apenas número no Valor1", 
                                "Valor inválido", 
                                JOptionPane.ERROR_MESSAGE);
                textVal1.setText("");
                textVal1.requestFocus();
                
                return;
            }
            
            try {
                valor2 = Integer.parseInt(textVal2.getText());
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                                null, 
                                "Informe apenas número no Valor2", 
                                "Valor inválido", 
                                JOptionPane.ERROR_MESSAGE);
                textVal2.setText("");
                textVal2.requestFocus();
                
                return;
            }
            
                 
            liberarValor2 = false;
            textVal1.requestFocus();
            
            switch (operacao) {
                case "+":
                    try {
                        textResultado.setText(Integer.toString(calc.somar(valor1, valor2)));
                        setOperacao("");
                    } catch (NegaException e) {
                        JOptionPane.showMessageDialog(
                                null, 
                                e.getMessage(), 
                                "Resultado negativo", 
                                JOptionPane.ERROR_MESSAGE);
                        limpar();
                    }
                    break;
                case "-":
                    try {
                        textResultado.setText(Integer.toString(calc.subtrair(valor1, valor2)));
                        setOperacao("");
                    } catch (NegaException e) {
                        JOptionPane.showMessageDialog(
                                null, 
                                e.getMessage(), 
                                "Resultado negativo", 
                                JOptionPane.ERROR_MESSAGE);
                        limpar();
                    }
                    break;
                case "/":
                    try {
                        textResultado.setText(Float.toString(calc.dividir(valor1, valor2)));
                        setOperacao("");
                    } catch (NegaException e) {
                        JOptionPane.showMessageDialog(
                                null, 
                                e.getMessage(), 
                                "Resultado negativo", 
                                JOptionPane.ERROR_MESSAGE);
                        limpar();
                    } catch (ArithmeticException e) {
                        JOptionPane.showMessageDialog(
                                null, 
                                "Não existe divisão por zero.", 
                                "Operação invalida", 
                                JOptionPane.ERROR_MESSAGE);
                        liberarValor2 = true;
                        textVal2.setText("");
                        textVal2.requestFocus();
                    }
                    break;
                case "*":
                    try {
                        textResultado.setText(Integer.toString(calc.mutiplicar(valor1, valor2)));
                        setOperacao("");
                    } catch (NegaException e) {
                        JOptionPane.showMessageDialog(
                                null, 
                                "O resultado é negativo", 
                                "Resultado negativo", 
                                JOptionPane.ERROR_MESSAGE);
                        limpar();
                    }
                    break;
                default:
                    break;
                    
            }
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    private boolean liberarValor2 = false;
    private String operacao = "";
    private Calcular calc = Calcular.getCalcular();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoClear;
    private javax.swing.JButton botaoDividir;
    private javax.swing.JButton botaoExit;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMultiplicar;
    private javax.swing.JButton botaoProximValor1;
    private javax.swing.JButton botaoSomar;
    private javax.swing.JButton botaoSubtrair;
    private javax.swing.JLabel lResultado;
    private javax.swing.JLabel lValor1;
    private javax.swing.JLabel lValor2;
    private javax.swing.JPanel pBotoes;
    private javax.swing.JPanel pCampos;
    private javax.swing.JPanel pForm;
    private javax.swing.JTextField textResultado;
    private javax.swing.JTextField textVal1;
    private javax.swing.JTextField textVal2;
    // End of variables declaration//GEN-END:variables
}