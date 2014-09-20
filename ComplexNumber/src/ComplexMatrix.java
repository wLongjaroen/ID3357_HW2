public class ComplexMatrix {

    private int SIZE = 2;
    private ComplexNumber[][] cMatrix = new ComplexNumber[SIZE][SIZE];

    public ComplexMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cMatrix[i][j] = new ComplexNumber();
            }
        }
    }

    public ComplexMatrix(int initSIZE) {
        SIZE = initSIZE;
        cMatrix = new ComplexNumber[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cMatrix[i][j] = new ComplexNumber();
            }
        }
    }

    public void inputMember() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.cMatrix[i][j].setRePart();
                this.cMatrix[i][j].setImPart();
            }
        }
    }

    public static ComplexMatrix add(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix result = new ComplexMatrix(a.SIZE);
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                result.cMatrix[i][j] = ComplexNumber.add(a.cMatrix[i][j], b.cMatrix[i][j]);
            }
        }
        return result;
    }

    public static ComplexMatrix substract(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix result = new ComplexMatrix(a.SIZE);
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                result.cMatrix[i][j] = ComplexNumber.substract(a.cMatrix[i][j], b.cMatrix[i][j]);
            }
        }
        return result;
    }

    public static ComplexMatrix multipilcation(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix result = new ComplexMatrix(a.SIZE);
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                result.cMatrix[i][j] = ComplexNumber.multipilcation(a.cMatrix[i][j], b.cMatrix[i][j]);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                System.out.print(this.cMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }

}
