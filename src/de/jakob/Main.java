package de.jakob;

public class Main {

    public static void main(String[] args) {
	    Polynom p1 = new Polynom(5,1,0,-4);

	    //double nullstelle = p1.findRoot(-3, -1);

	    double c[] = p1.derivative().coefficients;
        //System.out.println(nullstelle);
		for (int i = 0; i < 4 ; i++) {
			System.out.print(c[i] + " ");
		}
    }
}
