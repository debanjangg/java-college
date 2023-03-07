import java.io.*;
public class Driver7 {
    public static void  main(String args[]) throws IOException {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("INPUT:\n\tString: ");
        s = br.readLine();
        System.out.println("\nOUTPUT:\n\tInput String: "+s+"\n\tUpper-Case: "+s.toUpperCase()+"\n\tLower-Case: "+s.toLowerCase());
    }
}