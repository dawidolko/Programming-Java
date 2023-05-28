package com.mycompany.deklaracjawlasna;

import java.util.Scanner;

/**
 *
 * @author dawio
 */
public class DeklaracjaWlasna {

    public static void main(String[] args) {
        String firstName, surName;
        byte[] declaration = { 74, 97, 32, 110, 105, 122, 101, 106, 32, 112, 111, 100, 112, 105, 115, 97, 110, 121, 32, 100, 101, 107, 108, 97, 114,
            117, 106, 101, 44, 32, 122, 101, 32, 97, 108, 98, 111, 32, 110, 97, 117, 99, 122, 101, 32, 115, 105, 101, 32, 74, 65, 
            86, 89, 32, 100, 111, 32, 107, 111, 110, 99, 97, 32, 115, 101, 109, 101, 115, 116, 114, 117, 32, 97, 108, 98, 111, 32, 
            110, 105, 101, 32, 110, 97, 122, 121, 119, 97, 106, 99, 105, 101, 32, 109, 110, 105, 101, 32, 115, 116, 117, 100, 101,
            110, 116, 101, 109, 32, 33, 33, 33
        };
        
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        firstName = scanIn.nextLine();
        System.out.print("Podaj swoję nazwisko: ");
        surName = scanIn.nextLine();
        scanIn.close();
        System.out.println("\n\n--------------------------------------------------------------------------------------------------");
        
        for(int i = 0; i <declaration.length; i++)
        {
            System.out.print((char)declaration[i]);
           
        }
        System.out.print("\n\n"+firstName+" "+surName);
    }
}
