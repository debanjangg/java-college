import java.io.*;
public class String_Reversal {
    String str;
    String_Reversal() {
        str = "";
    }
    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("INPUT:\n\tString: ");
        str = br.readLine();
    }
    String s_reverse(String name) { //character-wise reversal
        String rev = "";
        for(char ch: name.toCharArray()) 
            rev = ch + rev;
        return rev;
    }
    String s_reverse(int n) {
        String rev = "";
        if(n == 0) { //word-wise reversal
            for(String ch: str.split(" ")) 
                rev = ch + " " + rev;
            return rev;
        }
        else { //character-wise reversal of every word 
            for(String ch: str.split(" ")) 
                rev += s_reverse(ch) + " ";
            return rev;
        }
    }
    void display() {
        System.out.println("\nOUTPUT:\n\tInput String: "+str+"\n\tReverse - 1: "+s_reverse(str)+"\n\tReverse - 2: "+s_reverse(0)+"\n\tReverse - 3: "+s_reverse(1));
    }
}