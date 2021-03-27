/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Equipo
 */
public class TerminosYCondiciones extends JFrame implements ActionListener {

    //Componentes
    ImageIcon tyc;
    JLabel lblTyc, lblImage;
    JButton btnContinuar, btnRegresar;
    JTextArea tAreaTyc;
    JCheckBox check;

    public TerminosYCondiciones() {
        crearVentana();
    }

    public void crearVentana() {
        this.setBounds(0, 0, 450, 480);
        this.setLayout(null);
        this.setTitle("Licencia");
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearComponentes();
    }

    public void crearComponentes() {
        lblTyc = new JLabel("Términos y Condiciones");
        lblTyc.setBounds(28, 20, 300, 30);
        lblTyc.setFont(new Font("Andale al Mono", 1, 20));
        lblTyc.setForeground(Color.RED);
        add(lblTyc);

        tyc = new ImageIcon("tyc.png");
        lblImage = new JLabel(tyc);
        lblImage.setBounds(292, 10, 110, 110);
        add(lblImage);

        tAreaTyc = new JTextArea("");
        tAreaTyc.setBounds(32, 80, 320, 250);
        add(tAreaTyc);

        check = new JCheckBox("Aceptar términos y condiciones");
        check.setBounds(32, 340, 320, 30);
        add(check);

        btnContinuar = new JButton("CONTINUAR");
        btnContinuar.setBounds(32, 370, 130, 30);
        btnContinuar.addActionListener(this);
        add(btnContinuar);

        btnRegresar = new JButton("REGRESAR");
        btnRegresar.setBounds(252, 370, 130, 30);
        btnRegresar.addActionListener(this);
        add(btnRegresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegresar) {
            Inicio b = new Inicio();
            b.setVisible(true);
            this.setVisible(false);
        }else if(e.getSource()==btnContinuar){
            IniciarSesion i=new IniciarSesion(); 
            i.setVisible(true);
            this.setVisible(false);
        }
    }

}
