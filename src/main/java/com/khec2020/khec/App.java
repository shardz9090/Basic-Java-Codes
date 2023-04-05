package com.khec2020.khec;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Integer p1_amount = 100;
    	Integer p2_amount = 200;
    	int total = p1_amount + p2_amount;
    	System.out.println("Total Amount "+total);
    	p2_amount = division(p2_amount, p1_amount);
    	p2_amount.toString();
    	String amt = p2_amount +"";
    	System.out.println("p2_amount type: "+p2_amount.getClass());
    	System.out.println("amt type: "+amt.getClass());
    	amt = amt +(13+45);
    	System.out.println(amt);
    	Concat();
    	System.out.println(p2_amount);
    }
    
    public static void Concat() {
    	String fname = "Khwopa";
    	String lname = "College";
    	String name = fname.concat(" ");
    	System.out.println(fname+" Engineering "+lname);
    	System.out.println(fname+" "+lname);
    	System.out.println(name.concat(lname));
    }
    
    public static int division(int p, int q) {
    	p++;
    	++p;
    	System.out.println(p);
    	int to = p/q;
    	System.out.println("Division: "+to);
    	p = 500;
    	return p;
    }
}
