/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Marcos
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, tv=0, tp=0, ti=0, ac=0;
        float s=0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>Digite 0 (zero) para encerrar!</em></html>"));
            tv++;
            if (n % 2 == 0) {
                tp++;
            } else {
                ti++;
            } 
            if (n>100){
                ac++;
            }
            s += n;
        } while (n != 0);
        float md = s / tv;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>" + 
                "<br>Total de Valores: " + tv + 
                "<br>Total de Pares: " + tp +
                "<br>Total de Ímpares: " + ti +
                "<br>Acima de 100: " + ac +
                "<br>Média dos Valores: " + md +
                "</html>");
        
    }
    
}
