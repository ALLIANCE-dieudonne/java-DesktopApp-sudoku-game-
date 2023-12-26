module com.alliance.sudokudesktopgame {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.alliance.sudokudesktopgame to javafx.fxml;
  exports com.alliance.sudokudesktopgame;
}
