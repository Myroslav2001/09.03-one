import javafx.scene.Scene;

import java.util.Scanner;

public class ciag {
    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("podaj ciąg ");
        String stringln =new String(scan.nextLine());
        char lastChar= stringln.charAt(stringln.length()-1);

        int howmany=0;
        for(int i=0; i<=stringln.length()-1;i++){
            if(lastChar==stringln.charAt(i)){
                howmany++;

            }
        }
        System.out.println("Powtarza się:"+ howmany);
    }
}
