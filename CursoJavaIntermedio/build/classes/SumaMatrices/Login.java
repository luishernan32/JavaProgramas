/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumaMatrices;

/**
 *
 * @author luis
 */
public class Login {
    public static void main(String[] args)
    {
        int matriz_uno[][]=new int[3][3];
        int matriz_dos[][]=new int[3][3];
        int matriz_resultado[][]=new int[3][3];
        
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_uno[i][j]=(int)(Math.random()*5);                
            }
            
        }
        
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j]=(int)(Math.random()*5);
            }
            
        }
        
        //Suma y resta de las matrices
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_resultado[i][j]=matriz_uno[i][j]+matriz_dos[i][j];
            }
            
        }
        
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ "+matriz_uno[i][j]+" ]");                
            }
            if(i==1)
            {
                System.out.print("   +   ");
            }
            else
            {
                System.out.print("       ");
            }
                        
            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ "+matriz_dos[i][j]+" ]");
            }
             
            
            if(i==1)
            {
                System.out.print("   =   ");
            }
            else
            {
                System.out.print("       ");
            }
            
            for (int j = 0; j < matriz_resultado.length; j++) {
                System.out.print("[ "+matriz_resultado[i][j]+" ]");
            }
            
            System.out.println("");
            
        }
    }
    
}
