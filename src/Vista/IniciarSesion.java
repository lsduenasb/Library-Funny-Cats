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
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Equipo
 */
public class IniciarSesion extends JFrame implements ActionListener {

    //Componentes
    JButton btnContinuar, btnRegistrarse, btnRegresar;
    JLabel lblUsuario, lblContrasena, lblRol, lblUser;
    JTextField tUsuario;
    ImageIcon logoUsuario;
    JComboBox<String> tipoRol;
    JPasswordField tContrasena;
    String[] items = {"Elige una opción", "Administrador", "Lector"};

    public IniciarSesion() {
        crearVentana();
    }

    public void crearVentana() {
        this.setBounds(0, 0, 350, 500);
        this.setLayout(null);
        this.setTitle("Iniciar Sesión");
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        crearComponentes();
    }

    public void crearComponentes() {
        logoUsuario = new ImageIcon("user.png");
        lblUser = new JLabel(logoUsuario);
        lblUser.setBounds(80, 20, 160, 160);
        add(lblUser);

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(20, 200, 80, 30);
        lblUsuario.setFont(new Font("Times New Roman", 1, 16));
        lblUsuario.setForeground(Color.WHITE);
        add(lblUsuario);

        tUsuario = new JTextField();
        tUsuario.setBounds(170, 200, 110, 30);
        add(tUsuario);

        lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(20, 240, 110, 30);
        lblContrasena.setFont(new Font("Times New Roman", 1, 16));
        lblContrasena.setForeground(Color.WHITE);
        add(lblContrasena);

        tContrasena = new JPasswordField();
        tContrasena.setBounds(170, 240, 110, 30);
        add(tContrasena);

        lblRol = new JLabel("Rol:");
        lblRol.setBounds(20, 280, 80, 30);
        lblRol.setFont(new Font("Times New Roman", 1, 16));
        lblRol.setForeground(Color.WHITE);
        add(lblRol);

        //combobox
        tipoRol = new JComboBox<>(items);
        tipoRol.setBounds(170, 280, 130, 30);
        add(tipoRol);

        btnContinuar = new JButton("CONTINUAR");
        btnContinuar.setBounds(40, 350, 120, 30);
        btnContinuar.addActionListener(this);
        btnContinuar.setBackground(Color.YELLOW);
        btnContinuar.setForeground(Color.BLACK);
        //  LineBorder borde=new LineBorder(Color.WHITE); //
        // btnContinuar.setBorder(borde);
        btnContinuar.addActionListener(this);
        add(btnContinuar);

        btnRegistrarse = new JButton("REGISTRARSE");
        btnRegistrarse.setBounds(180, 350, 120, 30);
        btnRegistrarse.addActionListener(this);
        btnRegistrarse.setBackground(Color.YELLOW);
        btnRegistrarse.setForeground(Color.BLACK);
        btnContinuar.addActionListener(this);
        add(btnRegistrarse);

        btnRegresar = new JButton("REGRESAR");
        btnRegresar.setBounds(120, 400, 110, 30);
        btnRegresar.addActionListener(this);
        btnRegresar.setBackground(Color.YELLOW);
        btnRegresar.setForeground(Color.BLACK);
        btnRegresar.addActionListener(this);
        add(btnRegresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnContinuar) {
            if (tipoRol.getSelectedItem().equals("Administrador")) {
                BienvenidoAdmi b = new BienvenidoAdmi();
                b.setVisible(true);
                this.setVisible(false);
            }else if(tipoRol.getSelectedItem().equals("Lector")){
                BienvenidoLector bl = new BienvenidoLector();
                bl.setVisible(true);
                this.setVisible(false);
            }

        } else if (e.getSource() == btnRegistrarse) {
            Registrarse r = new Registrarse();
            r.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == btnRegresar) {
            TerminosYCondiciones tyc = new TerminosYCondiciones();
            tyc.setVisible(true);
            this.setVisible(false);
        }
    }
}
