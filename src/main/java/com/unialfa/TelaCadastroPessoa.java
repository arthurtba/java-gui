package com.unialfa;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroPessoa extends JFrame {

    private JTextField campoNome;
    private JButton botao;

       public TelaCadastroPessoa(){
         setTitle("Cadastro de Pessoa");
         setSize(500, 150);
         setDefaultCloseOperation(EXIT_ON_CLOSE);

         JPanel painel = new JPanel(new GridBagLayout());
         GridBagConstraints constrains = new GridBagConstraints();
         constrains.insets= new Insets(5,5,5,5);

         JLabel LabelNome = new JLabel("Nome:");
         constrains.gridx = 0;
         constrains.gridy = 0;
         painel.add(LabelNome,constrains);

         campoNome = new JTextField(20);
         constrains.gridx = 1;
         constrains.gridy = 0;
         painel.add(campoNome, constrains);
         botao = new JButton("Salvar:");
         botao.addActionListener(e-> executarAcaoBotao());
         constrains.gridx = 2;
         constrains.gridy = 0;
         constrains.gridwidth = 2;
         painel.add(botao,constrains);

         add(painel);
         setLocationRelativeTo(null);
     }

     private void executarAcaoBotao(){
           JOptionPane.showMessageDialog(this, campoNome.getText() + " Salvo com Sucesso!");

    }
}
