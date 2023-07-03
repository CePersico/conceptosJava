package com.yaba;
/**
 * Realizar las siguientes series numéricas utilizando las estructuras repetitivas:
 * for, while y do‐while.
 *  1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 *  1, 99, 2, 98, 3, 97, 4, 96, 5, 95
 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 3
 */

public class Ciclos{
    public static void main(String args[]){

        int i = 0;

        System.out.println("Serie con for: ");
        for(i = 1; i <= 10; i++){
            if(i < 10){
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        i = 1;
        System.out.println("");

        System.out.println("Serie con while: ");
        while(i <= 10){
            if(i < 10){
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i++;
        }
        i = 1;
        System.out.println("");

        System.out.println("Serie con do-while: ");
        do{
            if(i < 10){
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i++;
        }while(i <= 10);
    }
}