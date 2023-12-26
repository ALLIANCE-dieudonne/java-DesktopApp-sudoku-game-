package com.alliance.sudokudesktopgame.userInterface;

import com.alliance.sudokudesktopgame.problemDomain.Coordinates;
import com.alliance.sudokudesktopgame.problemDomain.SudokuGame;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.HashMap;

public class UserInterfaceImpl implements IUserInterfaceContract.view,
  EventHandler<KeyEvent> {

  private final Stage stage;
  private final Group root;

  private HashMap<Coordinates, SudokuTextField> textFieldHashCoordinates;
  private IUserInterfaceContract.EventListener listener;
  private static final double WINDOW_Y = 732;
  private static final double WINDOW_X = 668;
  private static final double BOARD_PADDING = 50;
  private static final double BOARD_X_AND_Y = 576;
  private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 156);
  private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);
  private static final String SUDOKU = "Sudoku";

  public UserInterfaceImpl(Stage stage) {
    this.stage = stage;
    this.root = new Group();
    this.textFieldHashCoordinates = new HashMap<>();
    initializeUserInputs();
  }

  private void initializeUserInputs() {
    drawBackground(root);
    drawTitle(root);
    drawSudokuBoard(root);
    drawTextFields(root);
    drawGridLines(root);
    stage.show();
  }

  private void drawGridLines(Group root) {
  }

  private void drawTextFields(Group root) {
    
  }

  private void drawSudokuBoard(Group root) {
    
  }

  private void drawTitle(Group root) {
    
  }

  private void drawBackground(Group root) {
    
  }


  @Override
  public void setListener(IUserInterfaceContract.EventListener listener) {

  }

  @Override
  public void updateSquare(int x, int y, int input) {

  }

  @Override
  public void updateBoard(SudokuGame game) {

  }

  @Override
  public void showDialog(String message) {

  }

  @Override
  public void showError(String message) {

  }

  @Override
  public void handle(KeyEvent keyEvent) {

  }
}
