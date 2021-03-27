/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Equipo
 */
public class BienvenidoLector extends JFrame implements ActionListener{
    public BienvenidoLector(){
        crearVentana();
    }
    
     public void crearVentana(){
        this.setBounds(0, 0, 380,500);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Bienvenido Lector");
        crearComponentes();
    }
    
    public void crearComponentes(){
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
