import java.util.*;
public class Driver6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        int freqVow = 0, freqCon = 0, freqDig = 0, freqSpC = 0;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        sc.close();
        
        System.out.println("\nEntered String: "+str);
        str = str.toLowerCase();
        for(int x = 0; x < str.length(); x++){
            char v = str.charAt(x);
            if ( v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
                freqVow++;
            else if ( v >= 'a' && v <= 'z' )
                freqCon++;
            else if ( v >= '0' && v <= '9' )
                freqDig++;
            else
                freqSpC++;
        }
        System.out.println("Frequency of Vowels: "+freqVow);
        System.out.println("Frequency of Consonants: "+freqCon);
        System.out.println("Frequency of Digits: "+freqDig);
        System.out.println("Frequency of Special Characters: "+freqSpC);
    }
}
