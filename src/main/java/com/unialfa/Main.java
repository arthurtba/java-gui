package com.unialfa;


import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var tela = new TelaCadastroPessoa();
            tela.setVisible(true);
        });
    }
}