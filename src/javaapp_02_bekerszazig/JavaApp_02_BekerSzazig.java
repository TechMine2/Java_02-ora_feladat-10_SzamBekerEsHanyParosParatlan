package javaapp_02_bekerszazig;

import java.util.Scanner;

public class JavaApp_02_BekerSzazig {

    public static void main(String[] args) {
        int i=0;
        int paros=0, paratlan=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Adjon meg egy számot");
            i += sc.nextInt();
            if (i%2==0) {
                paros++;
            }else{
                paratlan++;
            }
        } while (i<=100);
        
        String s;
        s = String.format("A bekért számok közül %d páros és %d páratlan.", paros, paratlan);
        System.out.println(s);
        
    }
    
}
