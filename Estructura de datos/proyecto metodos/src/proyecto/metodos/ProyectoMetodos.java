/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.metodos;

public class ProyectoMetodos {

    public static void main(String[] args) {

        int[] vect = {50, 20, 40, 80, 30};

        int n = vect.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            System.out.println("Gap actual: " + gap);
        }
    }
}
    
