/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospareimpar;

import java.util.Scanner;

/**
 *
 * @author Sandro Fiabane
 */
public class Numerospareimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Diga o primeiro número:");
        a = teclado.nextInt();
        System.out.println("Diga o segundo número:");
        b = teclado.nextInt();
        if(a==b){
          c = a + b; 
          System.out.println("Como seus números são iguais, esta é a sua"
                  + " soma: "+c);
        }else{
            c = a * b;
            System.out.println("Como seus números são diferetes, esta é"
                    + " essa sua multiplicação: "+c);
        }
    }
    
}
