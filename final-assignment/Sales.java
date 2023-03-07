class Sales extends Product{
    int day;
    double tax, totamt;
    Sales(String n, int c, double amt, int d){
    	super(n, c, amt);
        day = d;
        tax = 0.0;
        totamt = 0.0;
    }
    void compute(){
        double fine = 0.0;
        tax = (12.4 * amount / 100);
    	fine = (day > 30)?(2.5 * amount / 100):0.0;
        totamt = amount + tax + fine;    	
    }
    void show(){
    	String output = String.format("\nOUTPUT:\n\tProduct Name: %s\n\tProduct Code: %d\n\tTotal Sale Amount: Rs. %.2f",name,code,totamt);
    	System.out.println(output);
    }
}