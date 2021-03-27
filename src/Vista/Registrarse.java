/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Equipo
 */
public class Registrarse extends JFrame implements ActionListener {

    //Componentes
    JLabel lblNombre, lblApellido, lblID, lblContrasena, lblCorreo, lblImRegistro;
    JButton btnRegistrarse, btnIniciarSesion;
    JTextField tNombre, tApellido, tID, tCorreo;
    JPasswordField tContrasena;
    ImageIcon imRegistro;

    public Registrarse() {
        crearVentana();
    }

    public void crearVentana() {
        this.setBounds(0, 0, 380, 500);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Registro");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        crearComponentes();
    }

    public void crearComponentes() {
        imRegistro = new ImageIcon("registro.png");
        lblImRegistro = new JLabel(imRegistro);
        lblImRegistro.setBounds(110, 10, 160, 160);
        add(lblImRegistro);

        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 190, 80, 30);
        lblNombre.setFont(new Font("Times New Roman", 1, 16));
        lblNombre.setForeground(Color.WHITE);
        add(lblNombre);

        tNombre = new JTextField();
        tNombre.setBounds(190, 190, 110, 30);
        add(tNombre);

        lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(50, 230, 80, 30);
        lblApellido.setFont(new Font("Times New Roman", 1, 16));
        lblApellido.setForeground(Color.WHITE);
        add(lblApellido);

        tApellido = new JTextField();
        tApellido.setBounds(190, 230, 110, 30);
        add(tApellido);

        lblID = new JLabel("Identificación:");
        lblID.setBounds(50, 270, 120, 30);
        lblID.setFont(new Font("Times New Roman", 1, 16));
        lblID.setForeground(Color.WHITE);
        add(lblID);

        tID = new JTextField();
        tID.setBounds(190, 270, 110, 30);
        add(tID);

        lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(50, 310, 120, 30);
        lblCorreo.setFont(new Font("Times New Roman", 1, 16));
        lblCorreo.setForeground(Color.WHITE);
        add(lblCorreo);

        tCorreo = new JTextField();
        tCorreo.setBounds(190, 310, 110, 30);
        add(tCorreo);

        lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(50, 350, 110, 30);
        lblContrasena.setFont(new Font("Times New Roman", 1, 16));
        lblContrasena.setForeground(Color.WHITE);
        add(lblContrasena);

        tContrasena = new JPasswordField();
        tContrasena.setBounds(190, 350, 110, 30);
        add(tContrasena);

        btnRegistrarse = new JButton("REGISTRARSE");
        btnRegistrarse.setBounds(30, 400, 120, 30);
        btnRegistrarse.addActionListener(this);
        btnRegistrarse.setBackground(Color.PINK);
        btnRegistrarse.setForeground(Color.BLACK);
        //  LineBorder borde=new LineBorder(Color.WHITE); //
        // btnContinuar.setBorder(borde);
        btnRegistrarse.addActionListener(this);
        add(btnRegistrarse);

        btnIniciarSesion = new JButton("INICIAR SESIÓN");
        btnIniciarSesion.setBounds(200, 400, 130, 30);
        btnIniciarSesion.addActionListener(this);
        btnIniciarSesion.setBackground(Color.PINK);
        btnIniciarSesion.setForeground(Color.BLACK);
        btnIniciarSesion.addActionListener(this);
        add(btnIniciarSesion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIniciarSesion) {
            IniciarSesion i=new IniciarSesion();
            i.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == btnRegistrarse) {
            JOptionPane.showMessageDialog(null, "Registro exitoso c:");
            
        }
    }

}
