import java.util.Scanner;

public class select {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        char ch = s.charAt(5);
        char cb = s.charAt(6);
        int count=0,count1=0;
        int a = s.length();
        for(int i=0;i<a;i++){
            if(ch == s.charAt(i)){
                count++;
            }
            if(cb == s.charAt(i)){
                count1++;
            }
        }
        System.out.println(ch +" repeated "+ count + " times");
        System.out.println(cb +" repeated "+ count1 + " times");
    }
}
