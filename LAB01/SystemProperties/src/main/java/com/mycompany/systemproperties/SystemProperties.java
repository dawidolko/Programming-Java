package com.mycompany.systemproperties;

/**
 *
 * @author dawio
 */
public class SystemProperties {

    public static void main(String[] args) {
        System.out.println("It's all properties:");
        System.getProperties().list(System.out);
        System.out.println("\nIt's USER NAME properties:");
        System.out.println(System.getProperty("user.name"));
        
        System.out.println("\nIt's JAVA LIBRARY PATH properties:");
        System.out.println(System.getProperty("java.library.path"));
    }
}
