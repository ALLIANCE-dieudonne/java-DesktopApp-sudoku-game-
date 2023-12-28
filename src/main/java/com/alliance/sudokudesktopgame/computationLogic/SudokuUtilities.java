package com.alliance.sudokudesktopgame.computationLogic;

import com.alliance.sudokudesktopgame.problemDomain.SudokuGame;

public class SudokuUtilities {
  /**
   * Copy the values from one sudoku grid into another
   * <p>
   * Note: O(n^2) Runtime Complexity
   *
   * @param oldArray
   * @param newArray
   */
  public static void copySudokuArrayValues(int[][] oldArray, int[][] newArray) {
    for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++) {
      for (int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDARY; yIndex++) {
        newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
      }
    }
  }

  public static int[][] copyToNewArray(int[][] oldArray) {
    int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
    copySudokuArrayValues(oldArray, newArray);
    return newArray;
  }

}
