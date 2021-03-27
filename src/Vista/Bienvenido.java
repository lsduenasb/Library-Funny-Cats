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
public class Bienvenido extends JFrame implements ActionListener{
    public Bienvenido(){ //esta clase le pregunta al usuario que quiere realizar
        this.setBounds(0, 0, 400,500);
        this.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
