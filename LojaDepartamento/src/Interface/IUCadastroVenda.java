/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interface;

import Controlador.ControladorProduto;
import Controlador.ControladorUsuario;
import Controlador.ControladorVendas;
import Interface.Utils.Utils;
import Modelo.CartaoCredito;
import Modelo.Cliente;
import Modelo.Dinheiro;
import Modelo.Fornecedor;
import Modelo.ItemVenda;
import Modelo.Pix;
import Modelo.Produto;
import Modelo.Venda;
import Modelo.Vendedor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class IUCadastroVenda extends javax.swing.JDialog {
    
    private  ArrayList<ItemVenda> itensVenda = new ArrayList();
    private float valorTotal = 0;

    /**
     * Creates new form IUCadastrovenda
     */
    public IUCadastroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        textCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textVendedor = new javax.swing.JTextField();
        textDataVenda = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textDesconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textPagamento = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textBandeira = new javax.swing.JTextField();
        textNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textValor = new javax.swing.JLabel();
        BtnSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        textCodigoItem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textQtd = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar venda"));

        jLabel1.setText("C??digo venda:");

        jLabel2.setText("C??digo cliente:");

        jLabel3.setText("C??digo vendedor:");

        textDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel4.setText("Data da venda:");

        jLabel7.setText("Valor com desconto:");

        jLabel8.setText("Forma de pagamento:");

        textPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Dinheiro", "Cart??o" }));

        jLabel11.setText("Dados cart??o:");

        textNome.setText("Nome");

        textBandeira.setText("Bandeira");

        textNumero.setText("Numero");

        jLabel6.setText("Valor total:");

        textValor.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textDataVenda)
                                    .addComponent(textCliente)
                                    .addComponent(textCodigo)
                                    .addComponent(textVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(textValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textDesconto))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(textPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(114, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(textNome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(textBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(114, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(textValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        BtnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnSalvar.setText("Cadastrar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Item"));

        textCodigoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoItemActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo item:");

        jLabel10.setText("Quantidade:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textCodigoItem)
                    .addComponent(textQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(textQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdicionar)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSalvar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        // TODO add your handling code here:
        String codigoVenda = this.textCodigo.getText();
        String codigoCliente = this.textCliente.getText(); 
        String codigoVendedor = this.textVendedor.getText();
        
        
       
        ControladorUsuario controlCliente = new ControladorUsuario();
        ControladorVendas control = new ControladorVendas();        
        ControladorUsuario controlVendedor = new ControladorUsuario();
              
        String data = this.textDataVenda.getText();
        Calendar dataVenda = Calendar.getInstance();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            dataVenda.setTime(sdf.parse(data));
            System.out.println("ANO: " + dataVenda.get(Calendar.YEAR));
            System.out.println("MES: " + dataVenda.get(Calendar.MONTH));
            System.out.println("DIA: " + dataVenda.get(Calendar.DAY_OF_MONTH));

        } catch (ParseException e) {
            e.printStackTrace();
        }
             
        String ValorDesconto =this.textDesconto.getText();
        
        String formaPagamento = String.valueOf(this.textPagamento.getSelectedItem());
        
        
        //Tratamento de erros
        
        String[] values = {codigoVenda, codigoVendedor, codigoCliente,data, ValorDesconto};
        
        if(Utils.hasNull(values)){
            JOptionPane.showMessageDialog(this, "Todos os campos precisam ser preenchidos!",
                    "Aten????o", JOptionPane.WARNING_MESSAGE);
       
        } else if (!Utils.isInt(codigoVenda) && !Utils.isInt(codigoVendedor) && !Utils.isInt(codigoCliente)){
            JOptionPane.showMessageDialog(this, "C??digo da venda , do vendedor e do cliente precisa ser um valor num??rico!",
                    "Aten????o", JOptionPane.WARNING_MESSAGE);
            textCodigo.setText("");
        } else if(!Utils.isFloat(ValorDesconto)){
           JOptionPane.showMessageDialog(this, "O valor do desconto precisa ser um valor num??rico!",
                    "Aten????o", JOptionPane.WARNING_MESSAGE);
            textValor.setText("");
        } 
        else {
            if(controlCliente.buscaCliente(Integer.parseInt(codigoCliente)) == null){
                JOptionPane.showMessageDialog(this, "N??o foi encontrado o cliente!", "Aten????o", JOptionPane.WARNING_MESSAGE);
            }else if(controlVendedor.buscaVendedor(Integer.parseInt(codigoVendedor)) == null){
                JOptionPane.showMessageDialog(this, "N??o foi encontrado o vendedor!", "Aten????o", JOptionPane.WARNING_MESSAGE);
            }else{
                if(control.buscaVenda(Integer.parseInt(codigoVenda))== null){
                    Vendedor vendedor = controlCliente.buscaVendedor(Integer.parseInt(codigoVendedor));
                    Cliente cliente = controlCliente.buscaCliente(Integer.parseInt(codigoCliente));

                    if( formaPagamento == "Pix"){

                        Pix pix = new Pix();

                        
                        control.addVenda(Integer.parseInt(codigoVenda), cliente, vendedor, dataVenda, valorTotal, Float.parseFloat(ValorDesconto),pix);
                        Venda venda = control.buscaVenda(Integer.parseInt(codigoVenda));
                        for(ItemVenda item : itensVenda){
                            venda.addItemVenda(item.getCodigoProduto(), item.getValor(),item.getQuantidade());
                        }
                    }
                    else if(formaPagamento == "Dinheiro"){
                        Dinheiro dinheiro = new Dinheiro();

                       
                        control.addVenda(Integer.parseInt(codigoVenda), cliente, vendedor, dataVenda, valorTotal, Float.parseFloat(ValorDesconto),dinheiro);
                        Venda venda = control.buscaVenda(Integer.parseInt(codigoVenda));
                        for(ItemVenda item : itensVenda){
                            venda.addItemVenda(item.getCodigoProduto(), item.getValor(),item.getQuantidade());
                        }  
                    }
                    else if(formaPagamento == "Cart??o"){

                        String nome = textNome.getName();
                        String bandeira = textBandeira.getName();
                        String numero = textNumero.getName();

                        CartaoCredito cartao = new CartaoCredito(nome,bandeira,numero);

                       
                        control.addVenda(Integer.parseInt(codigoVenda), cliente, vendedor, dataVenda, valorTotal, Float.parseFloat(ValorDesconto),cartao);
                        Venda venda = control.buscaVenda(Integer.parseInt(codigoVenda));
                        for(ItemVenda item : itensVenda){
                            venda.addItemVenda(item.getCodigoProduto(), item.getValor(),item.getQuantidade());
                        }  
                    }

                    JOptionPane.showMessageDialog(this, "Venda cadastrado com sucesso!",
                        "Sucesso", JOptionPane.WARNING_MESSAGE);

                    textCodigo.setText("");
                    textValor.setText("");
                    textVendedor.setText("");
                    textCliente.setText("");
                    textDesconto.setText("");
                    textNome.setText("");
                    textBandeira.setText("");
                    textNumero.setText("");
                }else{
                    JOptionPane.showMessageDialog(this, "C??digo da venda j?? est?? sendo utilizado!",
                        "Aten????o", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void textCodigoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoItemActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(this.textCodigoItem.getText().trim());
        int quantidade = Integer.parseInt(this.textQtd.getText().trim());
        
        System.out.println(codigo);

        ControladorProduto controlProduto = new ControladorProduto();
        Produto produto = controlProduto.buscaProduto(codigo);
        ItemVenda item = new ItemVenda(codigo,produto.calcularValor(),quantidade);
        
        valorTotal = valorTotal + item.calcularValor();
        
        
        
        this.textValor.setText( Float.toString(valorTotal));
  
        itensVenda.add(item);

    }//GEN-LAST:event_btnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroVenda dialog = new IUCadastroVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton btnAdicionar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textBandeira;
    private javax.swing.JTextField textCliente;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCodigoItem;
    private javax.swing.JFormattedTextField textDataVenda;
    private javax.swing.JTextField textDesconto;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNumero;
    private javax.swing.JComboBox<String> textPagamento;
    private javax.swing.JTextField textQtd;
    private javax.swing.JLabel textValor;
    private javax.swing.JTextField textVendedor;
    // End of variables declaration//GEN-END:variables
}
