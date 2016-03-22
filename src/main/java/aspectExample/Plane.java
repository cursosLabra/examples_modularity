package aspectExample;

import org.springframework.stereotype.Component;

@Component
public class Plane {
  
  private String name;
  private Integer rows;
  private Integer cols;
  private User[][] seats;
  private User empty;

  
  public Plane() {
    this("",3,2);
  }

  public Plane(String name, Integer rows, Integer cols) {
    this.name = name;
    this.rows = rows;
    this.cols = cols;
    seats = new User[rows][cols];
    
    empty = new User("empty");
    for (int row =0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        seats[row][col] = empty;
      }
    }
  }

  public void reserveSeat(User user, int row, int col) throws IllegalArgumentException {
    if (row >= rows || row < 0) 
      throw new IllegalArgumentException("invalid row " + row + " must be in [0," + rows + ")");
    if (col >= cols || col < 0) 
      throw new IllegalArgumentException("invalid col " + col + " must be in [0," + cols + ")");
    
    seats[row][col] = user; 
    System.out.println("Seat reservation:" + row + ", " + col);
  }

  public void reserveRow(User user, int row) throws IllegalArgumentException  {
    if (row >= rows || row < 0) 
      throw new IllegalArgumentException("invalid row " + row + " must be in [0," + rows + ")");
    for (int col = 0; col < cols; col++) {
      seats[row][col] = user;
    }
    System.out.println("Row reservation: " + row);
  }

  public void freeRows() {
    System.out.println("Plane: " + name + " is taking off");
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Plane[" + name + "]\n");
    for (int row = 0; row < rows; row++) {
      sb.append("Row(" + row + "): ");
      for (int col = 0; col < cols; col++) {
        User user = seats[row][col];
        sb.append(String.format("%8s", user));
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
