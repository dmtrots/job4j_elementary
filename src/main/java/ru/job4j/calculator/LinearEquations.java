package ru.job4j.calculator;

import java.util.Scanner;

public class LinearEquations {

    public static void gauss(double[][] matrix) { /*строку с наименьшим первым элементом массива ставим наверх*/
        double min = matrix[0][0];
        double[] temp;
        for (int i = 0;
             i < matrix.length;
             i++) {
            for (int j = 0;
                 j < matrix[i].length;
                 j++) {
                if (Math.abs(min) > Math.abs(matrix[i][0])) {
                    min = matrix[i][0];
                    temp = matrix[i];
                    matrix[i] = matrix[0];
                    matrix[0] = temp;
                }
            }
        }
        toOne(matrix);
        toZero(matrix);
        countVars(matrix);
    }

    public static void toOne(double[][] one) { /*делаем элементы массива где i = j равными 1*/
        int k = 0;
        for (int i = 0;
             i < one.length;
             i++) {
            double equalIdx = one[k][k];
            for (int j = 0;
                 j < one[i].length;
                 j++) {
                one[i][j] = one[i][j] / equalIdx;
            }
            k++;
        }
    }

    public static void toZero(double[][] zero) { /*приводим коэффициенты в нижнем треугольнике к 0*/
        for (int n = 0;
             n < zero[0].length - 2;
             n++) {
            for (int i = n + 1;
                 i < zero.length;
                 i++) {
                double multiplier = zero[i][n];
                for (int j = 0;
                     j < zero[0].length;
                     j++) {
                    if (zero[i - 1][i - 1] != 1) {
                        toOne(zero);
                        zero[i][j] = zero[i][j] - multiplier * zero[n][j];
                    } else {
                        zero[i][j] = zero[i][j] - multiplier * zero[n][j];
                    }
                }
            }
        }
    }

    public static void countVars(double[][] matrix) { /*рассчитываем значения переменных*/
        int lengthOfI = matrix.length;
        double[] varArray = new double[lengthOfI];
        for (int i = lengthOfI - 1;
             i >= 0;
             i--) {
            varArray[i] = matrix[i][lengthOfI];
            for (int j = i + 1;
                 j < lengthOfI;
                 j++) {
                varArray[i] = varArray[i] - matrix[i][j] * varArray[j];
            }
            varArray[i] = varArray[i] / matrix[i][i];
        }
        printVars(varArray);
    }

    public static void printVars(double[] matrix) {
        for (double number : matrix) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество переменных:");
        int equation = Integer.parseInt(scanner.nextLine());
        double[][] matrix = new double[equation][equation + 1];
        System.out.println("Введите коэффициенты при переменных и свободные коэффициенты:");
        for (int i = 0;
             i < equation;
             i++) {
            for (int j = 0;
                 j <= equation;
                 j++) {
                System.out.printf("[%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        gauss(matrix);
    }
}
