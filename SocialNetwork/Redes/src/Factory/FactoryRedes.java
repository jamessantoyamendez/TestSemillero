package Factory;

import Clases.Facebook;
import Clases.Google;
import Clases.Twitter;
import Interface.InterfaceRedes;
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
public class FactoryRedes {

    public static InterfaceRedes getCreator(String saveItem) {

        switch (saveItem) {
            case "Facebook":
                return new Facebook();
            case "Twitter":
                return new Twitter();
            case "Google":
                return new Google();
        }
        return null;
    }

}
