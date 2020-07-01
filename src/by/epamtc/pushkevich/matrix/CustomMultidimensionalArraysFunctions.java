package by.epamtc.pushkevich.matrix;

public class CustomMultidimensionalArraysFunctions {
    public static void main(String[] args) {

    }


    private static int[][] getMatrixByExample1(int evenSize) {
        int matrix[][] = new int[evenSize][evenSize];

        for (int i = 0; i < evenSize; i++) {
            for (int j = 0; j < evenSize; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                }
                else {
                    matrix[i][j] = evenSize - j;
                }
            }
        }
        return matrix;
    }

    private static int[][] getMatrixByExample2(int evenSize) {
        int[][] matrix = new int[evenSize][evenSize];
        int firstNumber = 1;
        int secondNumber = 2;

        for (int i = 0; i < evenSize; i++) {
            for (int j = 0; j < evenSize; j++) {
                if (i == j) {
                    matrix[i][j] = firstNumber * secondNumber;
                    firstNumber++;
                    secondNumber++;
                }
            }
        }

        return matrix;
    }

    private static int[][] getMatrixByExample3(int evenSize) {
        int[][] matrix = new int[evenSize][evenSize];

        for (int i = 0; i < evenSize / 2; i++) {
            for (int j = i; j < evenSize - i; j++) {
                matrix[i][j] = 1;
                matrix[evenSize - i - 1][evenSize - j - 1] = 1;
            }
        }

        return matrix;
    }

    private static long[][] getMatrixFromArray(int[] array) {
        int size = array.length;
        long[][] matrix = new long[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (long) Math.pow(array[j], i + 1);
            }
        }

        return matrix;
    }

    private static long[][] getMatrixMultiply(int[][] firstMatrix, int[][] secondMatrix) {
        long[][] resultMatrix = new long[firstMatrix.length][secondMatrix[0].length];

        for (int i = 0; i < resultMatrix[0].length; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                for (int k = 0; k < firstMatrix[0].length; k++) {
                    resultMatrix[i][j] = resultMatrix[i][j] + firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static int[][] getMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int row = size - 1;
        int col = size / 2;
        magicSquare[row][col] = 1;

        for (int i = 2; i <= size * size; i++) {
            if (magicSquare[(row + 1) % size][(col + 1) % size] == 0) {
                row = (row + 1) % size;
                col = (col + 1) % size;
            }
            else {
                row = (row - 1 + size) % size;
            }

            magicSquare[row][col] = i;
        }

        return magicSquare;
    }
}
