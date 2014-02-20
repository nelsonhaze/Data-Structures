/*
 * RecursionExercisesII.java
 * 
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * RecursionExercisesII
 * 
 */
package p8;

/**
 *
 * @author Nelson
 */
public class RecursionExercisesII {
    public static int[][] pathArray = new int[10][10];
    public static int[] colArray = new int[11];
    public static int[] tollArray = new int[10];
    public static int total = 0;
    public static int finalToll = 0;
    public static int minToll = 100;
    public static int numrows = 10;
    public static int numcolumns = 10;
    public static int[] move = {-1, 0, 1};
    public static int[][] toll = {
        {0, 3, 5, 6, 1, 2, 7, 1, 9, 4},
        {8, 8, 3, 6, 5, 8, 3, 9, 1, 5},
        {6, 4, 3, 8, 7, 1, 2, 4, 7, 4},
        {5, 3, 8, 4, 2, 6, 7, 9, 3, 5},
        {1, 6, 3, 2, 1, 4, 3, 3, 7, 9},
        {7, 3, 7, 4, 4, 1, 5, 9, 9, 4},
        {1, 8, 6, 6, 8, 4, 8, 3, 8, 2},
        {4, 8, 1, 9, 7, 9, 2, 3, 5, 4},
        {9, 1, 4, 7, 3, 6, 8, 6, 1, 4},
        {6, 4, 7, 4, 8, 3, 6, 7, 2, 4}
    };

    public static void produceRoute() {
        for (int i = 0; i < numcolumns; i++) {
             colArray = new int[11];
             pathArray = new int [10][10];
             total = 0;
             minToll = 100;
             total = toll[0][i];
             pathArray[0][i] = 1;
             makeMove(0,i);
             tollArray[i]= minToll;
             finalToll = Math.min(tollArray[i], minToll);
             for (int j = 1; j < numrows+1; j++){
                 System.out.println("Row "+ j + " Column "+ colArray[j]);
             } 
        }System.out.println("Minimum Toll "+finalToll);
    }
    

    public static boolean makeMove(int lastRow, int lastCol) {
        colArray[lastRow]= lastCol;
        int choiceNumber = 0;
        int numchoices = 3;
        int myRow = lastRow + 1;
        boolean atGoal = false;
        while (atGoal == false && choiceNumber < numchoices) {
            int row = myRow;
            int col = nextChoiceCol(choiceNumber, lastCol);
            if (isValid(row, col)) {
                total = total + toll[row][col];
                pathArray[row][col] = 1;
                colArray[row] = col;
                if(row == numrows - 1 && total<minToll){
                    minToll = total;
                }
                if (row == numrows - 1 && goalReached()){
                    return true;
                }else {
                    atGoal = makeMove(row, col);
                    if (atGoal == false) // had to backtrack
                    {
                        row = row - 1;
                        col = colArray[row];
                        total = total - toll[row][col];
                        pathArray[row][col] = 0;
                    }
                }
            }
            choiceNumber = choiceNumber + 1;
        }
        return atGoal;
    }

    public static int nextChoiceCol(int choiceNumber, int lastCol) {
        int nextColumn;
        nextColumn = lastCol + move[choiceNumber];
        return nextColumn;
    }

    public static int nextChoiceRow(int lastRow) {
        int nextRow;
        nextRow = lastRow + 1;
        return nextRow;
    }

    public static boolean isValid(int row, int col) {
        if (row >= 0 && row < numrows
                && col >= 0 && col < numcolumns && pathArray[row][col] == 0) {
            return true;
        } else {
            return false;
        }
    }
        public static boolean goalReached() {
         int sum = 0;
         for(int i = 0; i<10; i++) {
              sum = sum + pathArray[9][i];
         }
         if(sum == 10){   
            return true;
         } else {
             return false;
        }
        }
}

