/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.HashMap;
import java.util.Map;
import sun.applet.Main;

/**
 *
 * @author Yuxi
 */
public class Principal {
    
    public static void main(String... arg){
           Map<String,Autenticador> autenticadores = new HashMap<String, Autenticador>();

        autenticadores.put("facebook", new FacebookAutenticador());
                autenticadores.put("google", new GoogleAutenticador());
                
            autenticadores.get("facebook").autenticar("cmata", "cmata123");

    }
    
   
}
