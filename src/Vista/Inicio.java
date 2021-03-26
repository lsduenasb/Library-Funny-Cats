/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author Equipo
 */
public class Inicio extends JFrame implements ActionListener{
    //Componentes
    JButton btnIngresar;
    JLabel lblGato, lblSaludo, lblBienvenido, lblCopy;
    ImageIcon gatoConPapada, logo;
    
    public Inicio() {
        crearVentana();
    }
    public void crearVentana() {
        this.setBounds(0, 0, 310, 480);
        this.setLayout(null);
        this.setTitle("Bienvenue");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.ORANGE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearComponentes();
    }
    
    public void crearComponentes(){
 
     //Icono de la ventana
     //setIconImage(new ImageIcon(getClass().getResource("")).getImage());
     
     
     logo=new ImageIcon("Logo.png");
     lblSaludo=new JLabel(logo);
     lblSaludo.setBounds(45, 10, 190, 110);
     add(lblSaludo);
     
     lblBienvenido=new JLabel("Bienvenue");
     lblBienvenido.setBounds(72, 80, 190, 130);
     lblBienvenido.setForeground(Color.BLACK);
     lblBienvenido.setFont(new Font("Times New Roman",0,30));
     add(lblBienvenido);
     
     gatoConPapada=new ImageIcon("GatoConPapada.jpg");
     lblGato=new JLabel(gatoConPapada);
     lblGato.setBounds(50, 50, 178, 441);
     add(lblGato);
     
     btnIngresar=new JButton("INGRESAR");
     btnIngresar.setBounds(90, 380, 100, 30);
     btnIngresar.addActionListener(this);
     btnIngresar.setBackground(Color.BLACK);
     btnIngresar.setForeground(Color.WHITE);
     add(btnIngresar);
     
     lblCopy=new JLabel("©2021 Library Funny Cats Company");
     lblCopy.setBounds(30, 410, 250, 30);
     lblCopy.setForeground(Color.BLACK);
     lblCopy.setFont(new Font("Times New Roman",0,15));
     add(lblCopy);
    }
    //Evento del boton 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnIngresar){
             TerminosYCondiciones tyc=new TerminosYCondiciones();
             tyc.setVisible(true);
             this.setVisible(false);
        }
    }

   
}
