package Clases;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yuxi
 */
public class Twitter implements Interface.InterfaceRedes {

    @Override
    public void conectar() {
        try {
            JOptionPane.showMessageDialog(null, "Bienvenido a Twitter!");
            Desktop.getDesktop().browse(new URI("https://twitter.com/login"));
        } catch (Exception ex) {

        }
    }

}
