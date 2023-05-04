package learn.nara.diagonaldiff;

import java.util.List;

public class Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    if (arr == null || arr.size() == 0) {
      return 0;
    }
    int totalArrSize = arr.size();
    //assuming the size of row array will be consistent across each iteration
    int rowSize = arr.get(0).size();

    //start counting from left starting at 0
    int leftToRightEachRowIdxCnt = 0;
    //start counting from righg starting from row size -1
    int rightToLeftEachRowIdxCnt = rowSize - 1;

    int leftCnt = 0;
    int rightCnt = 0;

    for (int i = 0; i < totalArrSize; i++) {
      
      List<Integer> eachRow = arr.get(i);
      leftCnt += eachRow.get(leftToRightEachRowIdxCnt++);
      rightCnt += eachRow.get(rightToLeftEachRowIdxCnt--);
      //totalArrSize--;
    }
    int diff = leftCnt - rightCnt;
    if (diff < 0) {
      diff = diff * -1;
    }
    return diff;

  }

  public static void main(String[] args) {
    int diff = diagonalDifference(List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9)));
    System.out.println(diff);
  }

}