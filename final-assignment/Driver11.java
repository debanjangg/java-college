import java.io.*;
public class Driver11 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("INPUT:\n\tProduct Name: ");
		String name = br.readLine();
		System.out.print("\tProduct Code: ");
		int code = Integer.parseInt(br.readLine());
		System.out.print("\tAmount: ");
		double amt = Double.parseDouble(br.readLine());
		System.out.print("\tNumber of days taken to pay the sale amount: ");
		int days = Integer.parseInt(br.readLine());
		Sales ob = new Sales(name, code, amt, days);
		ob.compute();
		ob.show();
	}
}
