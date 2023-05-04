package learn.nara.matrixrotation;

import java.util.List;

public class Result {

  public static void matrixRotation(List<List<Integer>> matrix, int r) {
    // Write your code here
    StringBuilder sb = new StringBuilder();
    for (List<Integer> row : matrix) {
      String rowStr = "";
      for (Integer col : row) {
        rowStr+= col+" ";

      }
      sb.append(rowStr.trim()+"\n");
    }
    s(sb);

  }
  //goleft col, row
  //godown col, row
  //  goright col, row
  //goup  col, row

  static void  s(Object o){
    System.out.println(o);
  }
  public static void main(String[] args) {
      matrixRotation(List.of(
          List.of(1,2,3,4,6,6,6,6,6)
         ,List.of(5,6,7,8,6,6,6,6,6)
        ,List.of(9,10,11,12,6,6,6,6,6)
        ,List.of(13,14,15,16,6,6,6,6,6)
      ),4);
  }
}
