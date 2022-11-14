package de.jakob;

public class Polynom implements Funktion {

    double coefficients[];

    public Polynom(double a, double b, double c, double d) {
        coefficients = new double[4];
        coefficients[0] = a;
        coefficients[1] = b;
        coefficients[2] = c;
        coefficients[3] = d;
    }

    @Override
    public double f(double x) {

        double sum = 0.0;
        // Alternative:
        //sum = coefficients[0]*Math.pow(x,3) + coefficients[1]*Math.pow(x, 2) + ...
        for(int i = 0; i<4; i++){
            sum += coefficients[i] * Math.pow(x, 3-i);
        }
        return sum;
    }

    public Polynom add(Polynom other){
        double[] n = new double[4];

        for(int i = 0; i < 4; i++) n[i] = other.coefficients[i] + this.coefficients[i];

        return new Polynom(n[0],n[1],n[2],n[3]);
    }

    public Polynom derivative(){
        double[] n = new double[4];
        n[0] = 0;
        for(int i = 1; i< 4; i++){
            n[i] = this.coefficients[i-1]*(4-i);
        }
        return new Polynom(n[0],n[1],n[2],n[3]);

    }

    public double findRoot(double a, double b){
        // Prüfen, ob eine Nullstelle im Intervall
        if(this.f(a) * this.f(b) >= 0.0) throw new Error("Keine Nullstelle");

        double root = 0.0;

        for(int i = 0; i < 100; i++) {
            root = (a+b)/2; //Mittelpunkt des Intervalls als nächste Annäherung
            if(this.f(a) * this.f(root) == 0.0){ // Haben wir die Nullstelle getroffen
                return root;
            } else if(this.f(a) * this.f(root) < 0.0){ // Liegt die Nullstelle im linken Intervall?
                b = root;
            } else if(this.f(root)*this.f(b) < 0.0){ // Liegt die Nullstelle im rechten Intervall
                a = root;
            }
        }
        System.out.println("Nullstelle ist: " + root + " mit Fehler: " + Math.abs(Math.sqrt(2)-root));
        return root;

    }

}
