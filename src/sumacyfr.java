import java.util.Scanner;

public class sumacyfr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String a = sc.nextLine();
        Integer temp=0;
        for(int i=0 ;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                temp+=Integer.valueOf(String.valueOf(a.charAt(i)));
            }
        }
        System.out.println(temp);
    }
}
