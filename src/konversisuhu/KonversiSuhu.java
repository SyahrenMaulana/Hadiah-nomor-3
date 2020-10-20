/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int celcius;
        double kelvin, fahrenheit, reamur;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Suhu dalam Satuan Celcius: ");
        celcius = input.nextInt();
        
        kelvin = celcius + 273;
        fahrenheit = celcius * 9/5 + 100;
        reamur = 0.8 * celcius + 100;
        
        System.out.println("Menghitung Konversi Suhu");
        System.out.println("Suhu Celcius : "+celcius);
        System.out.println("Celcius ke Kelvin     : "+kelvin);
        System.out.println("Celcius ke Fahrenheit : "+fahrenheit);
        System.out.println("Celcius ke Reamur     : "+reamur);
        

}

 

}

 
    }
    
}
