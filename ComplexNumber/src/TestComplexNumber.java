public class TestComplexNumber {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();

        c1.setRePart();
        c1.setImPart();

        c2.setRePart();
        c2.setImPart();

        System.out.print("c1 + c2 = ");
        System.out.print(c1 + " + " + c2 + " = ");
        System.out.println(ComplexNumber.add(c1, c2));

        System.out.print("c1 - c2 = ");
        System.out.print(c1 + " - " + c2 + " = ");
        System.out.println(ComplexNumber.substract(c1, c2));

        System.out.print("c1 x c2 = ");
        System.out.print(c1 + " x " + c2 + " = ");
        System.out.println(ComplexNumber.multipilcation(c1, c2));
        
        System.out.print("Magnitude of c1 = ");
        System.out.println(c1.magnitude());
        
        System.out.print("Magnitude of c2 = ");
        System.out.println(c2.magnitude());

    }

}
