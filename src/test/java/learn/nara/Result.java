package learn.nara;

import java.math.BigDecimal;

class Result {

  /*
   * Complete the 'extraLongFactorials' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void extraLongFactorials(int n) {
    // Write your code here
    if(n < 1){
      System.out.println(n);
    }
    int ctr = 1;
    BigDecimal bd = new BigDecimal(ctr);
    for(;;){
      if(ctr > n){
        break;
      }
      bd = bd.multiply(BigDecimal.valueOf(ctr));
      ctr++;
    }
    System.out.println(bd.toString());
  }

}