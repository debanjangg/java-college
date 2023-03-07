import java.io.*;
class Name_Sort {
    String final_string, S[];
    Name_Sort() {
        final_string = "";
    }
    void bubble_sort() throws IOException{
        String temp;
        for(int i = 0; i < S.length - 1; i++)
            for(int j = i + 1; j < S.length; j++)
                if (S[i].compareTo(S[j]) > 0) {
                    temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;
                }
    }
    void output(String name2) throws IOException {
        FileWriter fw = new FileWriter(name2);
        BufferedWriter bfw = new BufferedWriter(fw);
        bubble_sort();
        int c = 0;
        for(String ele: S) {
            c++;
            bfw.write(ele);
            if(c != S.length)
                bfw.newLine();
        }
        System.out.println("\nOUTPUT:\n\tStatus: Writing to "+ name2 +" is completed.");
        bfw.close();
        fw.close();
    }
    String input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("INPUT:\n\tFile to be read from (filename): ");
        String name1 = br.readLine();
        System.out.print("\tFile to be written to (filename): ");
        String name2 = br.readLine();
        FileReader fr = new FileReader(name1);        
        BufferedReader bfr = new BufferedReader(fr);        
        String str = "";
        while((str = bfr.readLine()) != null)
            final_string += str + " ";
        S = final_string.split(" ");
        fr.close();
        bfr.close();
        return name2;
    }
}