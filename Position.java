import java.util.*;
import java.io.*;
public class Position {
  private int x;
  private int y;
  Position(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return this.x;
  }
  public int getY() {
    return this.y;
  }
  public void setX(int x) {
    this.x = x;

  }
  public void setY(int y) {
    this.y = y;
  }
  public boolean equals(Position p) {
    if(p.getX() == this.getX() && p.getY() == this.getY())
      return true;

      return false;
  }
  @Override
  public String toString() {
    return "Row: " + this.y +"\nCol: " + this.x;
  }
}
