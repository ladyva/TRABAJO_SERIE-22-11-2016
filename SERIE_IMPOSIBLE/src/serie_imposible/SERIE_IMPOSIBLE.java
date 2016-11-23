/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_imposible;

import MODELO.MODELO_SERIE;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class SERIE_IMPOSIBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        double A,B,lim;
        lim=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un limite: "));
        A=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor para la variable A: "));
        B=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor para la variable B: "));
        MODELO_SERIE o1= new MODELO_SERIE(A, B, lim);
        o1.serie();
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: "+o1.serie());
    }
    
}
