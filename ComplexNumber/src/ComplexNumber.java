
import java.util.Scanner;

public class ComplexNumber {
    // Field
    private int rePart; // Real part
    private int imPart;// Immagination part
    
    
    // Constructor  
    public ComplexNumber() {
        this.rePart = 0;
        this.imPart = 0;
    }

    public ComplexNumber(int rePart, int imPart) {
        this.rePart = rePart;
        this.imPart = imPart;
    }

    // Method
    public void setRePart() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter real part: ");
        this.rePart = sn.nextInt();   
    }

    public void setImPart() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter immagintion part: ");
        this.imPart = sn.nextInt();
    }

    
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        int re = a.rePart + b.rePart;
        int im = a.imPart + b.imPart;
        ComplexNumber c = new ComplexNumber(re, im);
        return c;
    }

    public static ComplexNumber substract(ComplexNumber a, ComplexNumber b) {
        int re = a.rePart - b.rePart;
        int im = a.imPart - b.imPart;
        ComplexNumber c = new ComplexNumber(re, im);
        return c;
    }

    public static ComplexNumber multipilcation(ComplexNumber a, ComplexNumber b) {
        int re = (a.rePart*b.rePart) - (a.imPart*b.imPart);
        int im = (a.rePart*b.imPart) + (a.imPart*b.rePart);
        ComplexNumber c = new ComplexNumber(re,im);
        return c;
    }

    public static boolean compare(ComplexNumber a, ComplexNumber b) {
        return a.rePart == b.rePart && a.imPart == b.imPart;
    }

    public double magnitude() {
        return Math.sqrt( Math.pow(rePart, 2) + Math.pow(imPart, 2));
    }

    @Override
    public String toString(){
        return this.rePart+"+"+this.imPart+"j";
    }
}
