package com.alliance.sudokudesktopgame.problemDomain;

import java.io.IOException;

public interface IStorage {
  void updateGameData(SudokuGame sudokuGame) throws IOException;
  SudokuGame getGameData() throws IOException;
}
