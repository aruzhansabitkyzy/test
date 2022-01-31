public class Map throw InvalidMapException{
  private Scanner scanner;
  private int size;
  private String[][] matrix;
  private Position startingPoint;
  Map(Scanner sc) {
    this.scanner = sc;
    int i=0;
     int j=0;

    try{
    File file = new File("C:\\Users\\Happy-PC\\Desktop\\project2\\game2.txt");
    scanner = new Scanner(file);
    while(scanner.hasNext()) {
      size = scanner.nextInt();
      String a = scanner.next();
      if(size > i && size > j) {
      matrix[i++][j++] = a;
          if(a.equals("P") {
            startingPoint = new Position(i, j);
          }
    }
    else {
      String direction += scanner.next();
    }
    size--;
    }

  }
  catch(FileNotFoundException e) {
    scanner = new Scanner(System.in);
    size = input.nextInt();
    for(int i=0;i<size;i++) {
      for(int j=0;j<size;j++) {
        matrix[i][j] = scanner.next();
      }
    }
  }




  }
  public int getSize() {
    return this.size;
  }
  public char getValueAt(int row, int col) {

  return (char)matrix[row][col];
}
  public void print() {
  int countRow = 0;
  int countCol = 0;
for(int i=0;i<size;i++) {
  for(int j=0;j<size;j++) {
    System.out.println(matrix[i][j] + " ");
    countRow++;
  }
  if(countRow != size) {
      throw new InvalidMapException("Not enough map elements");
  }
  countRow = 0;
  countCol++;
  }
    if(countCol != size) {
      throw new InvalidMapException("Not enough map elements");

    }

  }
}
