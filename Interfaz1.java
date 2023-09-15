package com.mycompany.playlist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz1 extends javax.swing.JFrame {
    private JButton playSongsButton;
    private JButton createPlaylistButton;
    private JButton salirDelProgramaButton;

    public Interfaz1() {
        // Configura la ventana principal
        setTitle("Reproductor de música");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea tres botones
        playSongsButton = new JButton("Reproducir canciones");
        createPlaylistButton = new JButton("Crear lista de reproducción");
        salirDelProgramaButton = new JButton("Salir del programa");

        // Añadir los botones a un panel
        JPanel panel = new JPanel();
        panel.add(playSongsButton);
        panel.add(createPlaylistButton);
        panel.add(salirDelProgramaButton);

        // Añadir el panel a la ventana
        getContentPane().add(panel);

        // Añadir action listeners a los botones
        playSongsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para reproducir canciones (se debe implementar)
            }
        });

        createPlaylistButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para crear una lista de reproducción (se debe implementar)
            }
        });

        salirDelProgramaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código para salir del programa
                System.exit(0);
            }
        });

        initComponents();
    }

    /**
     * Método principal que crea una instancia de la interfaz y la hace visible.
     */
    public static void main(String[] args) {
        Interfaz1 interfaz = new Interfaz1();
        interfaz.setVisible(true);
    }
}
