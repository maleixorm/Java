/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Marcos
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(loc.getDisplayLanguage());
    }
    
}
