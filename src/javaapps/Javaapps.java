/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

/**
 *
 * @author Sead
 */
public class Javaapps {

    /**
     * Swap two variables
     */
    public static void main(String[] args) {
        
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("a: " + a + "\n" + "b:" + b);
        temp = a;
        a=b;
        b=temp;
        System.out.println("a: " + a + "\n" + "b:" + b);

    }

}
