/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Scanner;

/**
 *
 * @author Siva
 */

    /**
     * @param args the command line arguments
     */
   

class Student9
{  
 
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("A is Greater: "+a);
        }
        else if(b>c)
        {
            System.out.println("B is greater: "+b);
        }
        else
        {
            System.out.println("C is Greater: "+c);
        }
    }
} 
    
    
