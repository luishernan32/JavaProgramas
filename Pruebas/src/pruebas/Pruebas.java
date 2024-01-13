/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author luis
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c =  Calendar.getInstance();
        
        
        Calendar calendario= new GregorianCalendar();
        
        String mes[] = {"Enero","Febrero","Marzo"}; 
    
        System.out.println("MES "+mes[Calendar.MONTH-1]+" dia "+c.get(Calendar.DAY_OF_MONTH));
        
        
        System.out.println(mes[Calendar.MONTH-1]+" dia "+c.get(Calendar.DAY_OF_MONTH));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
        
        
        
    }
    
}
