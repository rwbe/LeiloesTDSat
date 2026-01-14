package main;

import view.cadastroVIEW;

public class Main {

    public static void main(String[] args) {

        /* Abre a tela principal */
        java.awt.EventQueue.invokeLater(() -> {
            new cadastroVIEW().setVisible(true);
        });
    }
}
