package com.alliance.sudokudesktopgame.buildLogic;

import com.alliance.sudokudesktopgame.computationLogic.GameLogic;
import com.alliance.sudokudesktopgame.problemDomain.IStorage;
import com.alliance.sudokudesktopgame.problemDomain.SudokuGame;
import com.alliance.sudokudesktopgame.userInterface.IUserInterfaceContract;
import com.alliance.sudokudesktopgame.userInterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
  public static void build(IUserInterfaceContract.view userInterface) throws IOException {
    SudokuGame initialState;
    IStorage storage = new LocalStorageImpl();

    try {
      initialState = storage.getGameData();
    } catch (IOException e) {
      initialState = GameLogic.getNewGame();
      storage.updateGameData(initialState);
    }
    IUserInterfaceContract.EventListener uiLogic
      = new ControlLogic(storage, userInterface);

    userInterface.setListener(uiLogic);
    userInterface.updateBoard(initialState);
  }

}
