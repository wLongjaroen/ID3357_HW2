
public class TestComplexMatrix {

    public static void main(String[] args) {
        
        ComplexMatrix cm1 = new ComplexMatrix();
        ComplexMatrix cm2 = new ComplexMatrix();
        
        cm1.inputMember();
        cm2.inputMember();
        
        System.out.println("Result of cm1 + cm2 :");
        System.out.println(ComplexMatrix.add(cm1, cm2));
        System.out.println("Result of cm1 - cm2 :");
        System.out.println(ComplexMatrix.substract(cm1, cm2));
        System.out.println("Result of cm1 x cm2 :");
        System.out.println(ComplexMatrix.multipilcation(cm1, cm2));
        
        
    }
    
}
