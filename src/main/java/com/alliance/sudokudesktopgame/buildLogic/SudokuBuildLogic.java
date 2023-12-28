package com.alliance.sudokudesktopgame.buildLogic;

import com.alliance.sudokudesktopgame.computationLogic.GameLogic;
import com.alliance.sudokudesktopgame.persistance.LocalStorageImpl;
import com.alliance.sudokudesktopgame.problemDomain.IStorage;
import com.alliance.sudokudesktopgame.problemDomain.SudokuGame;
import com.alliance.sudokudesktopgame.userInterface.IUserInterfaceContract;
import com.alliance.sudokudesktopgame.userInterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {

  /**
   * This class takes in the uiImpl object which is tightly-coupled to the JavaFX framework,
   * and binds that object to the various other objects necessary for the application to function.
   */
  public static void build(IUserInterfaceContract.View userInterface) throws IOException {
    SudokuGame initialState;
    IStorage storage = new LocalStorageImpl();

    try {
      //will throw if no game data is found in local storage
      initialState = storage.getGameData();
    } catch (IOException e) {
      initialState = GameLogic.getNewGame();
      //this method below will also throw an IOException
      //if we cannot update the game data. At this point
      //the application is considered unrecoverable
      storage.updateGameData(initialState);
    }
    IUserInterfaceContract.EventListener uiLogic
      = new ControlLogic(storage, userInterface);

    userInterface.setListener(uiLogic);
    userInterface.updateBoard(initialState);
  }

}
