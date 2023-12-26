package com.alliance.sudokudesktopgame;

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
      SudokuBuildingLogic.build(uiImpl);
    }catch (IOException e){
      e.printStackTrace();

      throw e;
    }
  }

  public static void main(String[] args) {
    launch();
  }
}
