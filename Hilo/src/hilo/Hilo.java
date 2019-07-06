/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

/**
 *
 * @author USUARIO
 */
public class Hilo {

    public static void hilolargo(){
    try{
        Thread.sleep(2000);
    }
    catch (InterruptedException e){
        System.out.println("hola");
    }
} 
   public static double div(int a, int b){
        if (b==0){
            throw new ArithmeticException("division por cero");
        }
        double c=a/b;
        return c;
    }
} 
