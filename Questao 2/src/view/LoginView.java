/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import static java.lang.System.in;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Tales Mariano
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        jLblInfo.setVisible(false);

  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogRegras = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jUserField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPassField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLblInfo = new javax.swing.JLabel();
        jProgressSeg = new javax.swing.JProgressBar();
        jBtnCadastrar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLblSeg = new javax.swing.JLabel();

        jLabel5.setText("* Mínimo 6 caracteres");

        jLabel6.setText("* Mínimo 1 número");

        jLabel7.setText("* Mínimo 1 letra maiuscula");

        jLabel8.setText("* Mínimo 1 caractere especial (!@#$%^&*()-+)");

        jLabel9.setText("* Mínimo 1 letra minuscula");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Regras da senha");

        javax.swing.GroupLayout jDialogRegrasLayout = new javax.swing.GroupLayout(jDialogRegras.getContentPane());
        jDialogRegras.getContentPane().setLayout(jDialogRegrasLayout);
        jDialogRegrasLayout.setHorizontalGroup(
            jDialogRegrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogRegrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogRegrasLayout.setVerticalGroup(
            jDialogRegrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogRegrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
        );

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jUserField.setNextFocusableComponent(jPassField);

        jLabel1.setText("Nome");

        jLabel2.setText("Senha");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastre - se");

        jLabel11.setText("* Mínimo 6 caracteres");

        jLabel12.setText("* Mínimo 1 número");

        jLabel13.setText("* Mínimo 1 letra maiuscula");

        jLabel14.setText("* Mínimo 1 caractere especial (!@#$%^&*()-+)");

        jLabel15.setText("* Mínimo 1 letra minuscula");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Regras da senha");

        jLblInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLblInfo.setForeground(new java.awt.Color(255, 0, 51));
        jLblInfo.setText("erro: ");

        jProgressSeg.setName(""); // NOI18N

        jBtnCadastrar.setText("Validar Cadastro");
        jBtnCadastrar.setActionCommand("");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jLabel18.setText("Nível de Segurança: ");

        jLblSeg.setText("0%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jProgressSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblSeg)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jUserField)
                        .addComponent(jPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jBtnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblSeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblInfo)
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(481, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        String name = jUserField.getText();
        String pass = new String(jPassField.getPassword());
        
        Color colorSucess = new Color(20, 99, 13);
        int seguranca = 0;
        
        JProgressBar prSeguranca = jProgressSeg;
        String validaLen = "";
        String validaUp = "";
        String validaLow = "";
        String validaNum = "";
        String validaEsp = "";
        
        if (name != null && !name.equals("")) {
            if (pass != null && !pass.equals("")){
                if (pass.length() >= 6 ) {
                    validaLen = "OK";
                }
                jLblInfo.setVisible(false);
                for (int i = 0; i < pass.length(); i++ ) {
                    String charAtual = pass.substring(i, i + 1);
                    if (charAtual.matches("[0-9]*")){
                        validaNum = "OK";
                    } else if (charAtual.equals("!") ||charAtual.equals("@") ||
                            charAtual.equals("#") || charAtual.equals("$") ||
                            charAtual.equals("%") || charAtual.equals("^") ||
                            charAtual.equals("&") || charAtual.equals("*") ||
                            charAtual.equals("(") || charAtual.equals(")") ||
                            charAtual.equals("-") || charAtual.equals("+")){
                        validaEsp = "OK";
                    } else if (charAtual.equals(charAtual.toLowerCase())) {
                        validaLow = "OK";
                    } else if (charAtual.equals(charAtual.toUpperCase())) {
                        validaUp = "OK";
                    } else {
                        jLblInfo.setText("Erro: \"" + charAtual + "\" é um caracter inválido !");
                        jLblInfo.setVisible(true);
                    }
                }
                if (validaLen.equals("OK")) {
                    seguranca = attProgress(seguranca, 20);
                    if (validaUp.equals("OK")) {
                        seguranca = attProgress(seguranca, 20);
                        prSeguranca.setValue(seguranca);
                        if (validaLow.equals("OK")) {
                            seguranca = attProgress(seguranca, 20);
                            prSeguranca.setValue(seguranca);
                            if (validaNum.equals("OK")) {
                                seguranca = attProgress(seguranca, 20);
                                prSeguranca.setValue(seguranca);
                                if (validaEsp.equals("OK")) {
                                    seguranca = attProgress(seguranca, 20);
                                    prSeguranca.setValue(seguranca);
                                    jLblInfo.setText("Parabéns, usuário cadastrado com sucesso !");
                                    jLblInfo.setForeground(colorSucess);
                                    jLblInfo.setVisible(true);
                                } else {
                                    attErro("pass deve possuir pelo menos um caracter especial");
                                    seguranca = attProgress(seguranca, -20);
                                }
                            } else {
                                attErro("pass deve possuir pelo menos um caracter númerico");
                                seguranca = attProgress(seguranca, -20);
                            }
                        } else {
                            attErro("pass deve possuir pelo menos uma letra minuscula");
                            seguranca = attProgress(seguranca, -20);
                        }
                } else {
                    attErro("pass deve possuir pelo menos uma letra maisucula");
                    seguranca = attProgress(seguranca, -20);
                }
            } else {
                attErro("a pass precisa de mais " + (6 - pass.length()) + " caracteres");
                seguranca = attProgress(seguranca, 0);
            }
        } else {
            attErro("preencha o campo pass antes de continuar");
        }
    } else {
            attErro("preencha o campo name antes de continuar");
        }
        
        
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    public void attErro (String erro) {
        jLblInfo.setText("Erro: " + erro);
        jLblInfo.setForeground(Color.red);
        jLblInfo.setVisible(true);
    }
    
    public int attProgress (int seguranca, int ac) {
        int soma = (seguranca + ac);
        if (soma >= 75) {
            jLblSeg.setText(soma + "%");
            jProgressSeg.setValue(soma);
            jProgressSeg.setForeground(new Color(20,99,13));
        } else {
            jLblSeg.setText(soma + "%");
            jProgressSeg.setValue(soma);
            jProgressSeg.setForeground(Color.RED);
        }
        return soma;
    }
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JDialog jDialogRegras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblInfo;
    private javax.swing.JLabel jLblSeg;
    private javax.swing.JPasswordField jPassField;
    private javax.swing.JProgressBar jProgressSeg;
    private javax.swing.JTextField jUserField;
    // End of variables declaration//GEN-END:variables
}

