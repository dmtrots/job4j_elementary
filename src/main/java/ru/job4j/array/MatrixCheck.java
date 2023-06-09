package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("По горизонтали: " + monoHorizontal(new char[][] {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {'X', 'X', ' ', 'X'}},
                0));
        System.out.println("По вертикали: " + monoVertical(new char[][] {
                        {'X', ' ', ' '},
                        {'X', 'X', 'X'},
                        {'X', 'X', ' ', 'X'}},
                0));
        }
}