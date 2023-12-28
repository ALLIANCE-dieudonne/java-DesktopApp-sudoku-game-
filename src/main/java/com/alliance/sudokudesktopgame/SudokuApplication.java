package com.alliance.sudokudesktopgame;

import com.alliance.sudokudesktopgame.buildLogic.SudokuBuildLogic;
import com.alliance.sudokudesktopgame.userInterface.IUserInterfaceContract;
import com.alliance.sudokudesktopgame.userInterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {
  private IUserInterfaceContract.view uiImpl;
  @Override
  public void start(Stage stage) throws IOException {
    uiImpl = new UserInterfaceImpl(stage);
    try {
      SudokuBuildLogic.build(uiImpl);
    }catch (IOException e){
      e.printStackTrace();

      throw e;
    }
  }

  public static void main(String[] args) {
    launch();
  }
}
