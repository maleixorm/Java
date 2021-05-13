/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author Marcos
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //operações em java
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        // pré e pós incremento
        int num = 5;
        int val = 10 + num++;
        System.out.println(val);
        System.out.println(num);
        
        // atribuição no java
        int x = 4;
        x *= 2; // x = x * 2;
        System.out.println(x);

        float v = 8.3f;
        int ar = (int) Math.round(v);
        System.out.println(ar);
        */
        
        double ale = Math.random();
        int n = (int) (1 + ale * (500-1));
        System.out.println(n);
    }
    
}
