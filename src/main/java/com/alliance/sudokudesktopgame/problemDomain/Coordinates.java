package com.alliance.sudokudesktopgame.problemDomain;

import java.util.Objects;

public class Coordinates {
  private final int x;
  private final int y;

  public Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  //helps us to store the coordinates in a hash map
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    else if (o == null || getClass() != o.getClass()) return false;
    Coordinates that = (Coordinates) o;
    return x == that.x && y == that.y;
  }

  //generating unique identifiers from these x and y values
  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
