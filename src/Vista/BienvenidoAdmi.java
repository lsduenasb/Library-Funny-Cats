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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Equipo
 */
public class BienvenidoAdmi extends JFrame implements ActionListener{
    //Componentes
    JLabel lblMano, lblBienvenido, lblNombre, lblDecision;
    ImageIcon mano;
    JButton btnDisp, btnRegresar, btnVer, btnActualizarDatos;
    
    public BienvenidoAdmi(){ //esta clase le pregunta al usuario que quiere realizar
        crearVentana();
    }
    
    public void crearVentana(){
        this.setBounds(0, 0, 380,500);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Bienvenido Admi");
        this.getContentPane().setBackground(Color.BLACK);
        crearComponentes();
    }
    
    public void crearComponentes(){
        lblBienvenido = new JLabel("Bienvenido ");
        lblBienvenido.setBounds(20, 20, 180, 30);
        lblBienvenido.setFont(new Font("Times New Roman", 1, 35));
        lblBienvenido.setForeground(Color.CYAN);
        add(lblBienvenido);
        
        mano=new ImageIcon("mano.png");
        lblMano = new JLabel(mano);
        lblMano.setBounds(250, 10, 90, 90);
        add(lblMano);
        
        lblNombre = new JLabel("Robertito ");
        lblNombre.setBounds(20, 50, 180, 30);
        lblNombre.setFont(new Font("Times New Roman", 1, 35));
        lblNombre.setForeground(Color.PINK);
        add(lblNombre);
        
        lblDecision = new JLabel("¿Qué quieres realizar? ");
        lblDecision.setBounds(10, 120, 370, 40);
        lblDecision.setFont(new Font("Times New Roman", 1, 35));
        lblDecision.setForeground(Color.WHITE);
        add(lblDecision);
        
        btnDisp = new JButton("AÑADIR NUEVO LIBRO");
        btnDisp.setBounds(75, 190, 220, 40);
        btnDisp.addActionListener(this);
        btnDisp.setBackground(Color.MAGENTA);
        btnDisp.setForeground(Color.BLACK);
        btnDisp.addActionListener(this);
        add(btnDisp);
        
        btnVer = new JButton("VER LIBROS DISPONIBLES");
        btnVer.setBounds(75, 230, 220, 40);
        btnVer.addActionListener(this);
        btnVer.setBackground(Color.MAGENTA);
        btnVer.setForeground(Color.BLACK);
        btnVer.addActionListener(this);
        add(btnVer);
       
        btnActualizarDatos = new JButton("ACTUALIZAR DATOS");
        btnActualizarDatos.setBounds(75, 270, 220, 40);
        btnActualizarDatos.addActionListener(this);
        btnActualizarDatos.setBackground(Color.MAGENTA);
        btnActualizarDatos.setForeground(Color.BLACK);
        btnActualizarDatos.addActionListener(this);
        add(btnActualizarDatos);        
        
        btnRegresar = new JButton("REGRESAR");
        btnRegresar.setBounds(75, 310, 220, 40);
        btnRegresar.addActionListener(this);
        btnRegresar.setBackground(Color.MAGENTA);
        btnRegresar.setForeground(Color.BLACK);
        btnRegresar.addActionListener(this);
        add(btnRegresar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
