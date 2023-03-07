import java.util.*;
public class Driver8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullname = sc.nextLine();
        sc.close();
        System.out.println("\nInput: " + fullname);
        String nameArr[] = fullname.split(" ");
        System.out.print("Output: ");
        for(int x = 0; x < nameArr.length - 1; x++)
            System.out.print(nameArr[x].charAt(0)+". ");
        System.out.println(nameArr[nameArr.length - 1]);
    }
}
