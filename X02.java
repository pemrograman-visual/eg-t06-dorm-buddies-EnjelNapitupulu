//12S24056-ENJEL AYUTI NAPITUPULU//
//12S24033- DOY SIMANJUNTAK//

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] name = new String[4];

        function1(name);
        function2(name);
    }
    
    public static void function1(String[] name) {
        int a;

        for (a = 0; a <= 3; a++) {
            name[a] = "";
        }
    }
    
    public static void function2(String[] name) {
        int i, b;

        for (i = 0; i <= 3; i++) {
            name[i] = input.nextLine();
            if (name[i].equals("---")) {
                name[i] = "";
                b = i;
                i = 4;
            } else {
                b = i;
            }
        }
        function3(name);
    }
    
    public static void function3(String[] name) {
        int c;

        for (c = 0; c <= 3; c++) {
            System.out.println(name[c]);
        }
    }
}
