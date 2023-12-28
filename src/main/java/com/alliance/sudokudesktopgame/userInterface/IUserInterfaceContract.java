package com.alliance.sudokudesktopgame.userInterface;

import com.alliance.sudokudesktopgame.problemDomain.SudokuGame;

/*
 * Contract is really just another word for interface, which is another word for a Protocol.
 */
public interface IUserInterfaceContract {
  interface EventListener {
    void onSudokuInput(int x, int y, int input);
    void onDialogClick();
  }

  interface View {
    void setListener(IUserInterfaceContract.EventListener listener);
    //update a single square after user input
    void updateSquare(int x, int y, int input);

    //update the entire board, such as after game completion or initial execution of the program
    void updateBoard(SudokuGame game);
    void showDialog(String message);
    void showError(String message);
  }

}
