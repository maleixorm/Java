/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Marcos
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Marcos";
        String nome2 = "Marcos";
        String nome3 = new String("Marcos");
        String res, res2;
        res = (nome1==nome3)?"Igual":"Diferente";
        res2 = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res2);
    }
    
}
