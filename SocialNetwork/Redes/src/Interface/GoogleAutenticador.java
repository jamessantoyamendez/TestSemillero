/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Yuxi
 */
public class GoogleAutenticador implements Autenticador{

    @Override
    public void autenticar(String usuario, String password) {
          System.out.println("autentcando en google");
    }
    
}
