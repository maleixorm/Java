/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Marcos
 */
public class ResolucaoDeTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width + " X " + d.height);
    }
    
}
