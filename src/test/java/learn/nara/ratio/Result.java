package learn.nara.ratio;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public  class Result {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void plusMinus(  List<Integer> arr) {
   
    // Write your code here
    double pos = 0;
    double neg = 0;
    double zero = 0;

    for(Integer num : arr){
      if(num == 0){
        zero++;
        continue;
      }
      if(num > 0){
        pos++;
        continue;
      }

      neg++;
    }

    DecimalFormat decimalFormat = new DecimalFormat("#.######");
    BigDecimal bd ;
    String zeroStr =String.format("%.6f", 0.000000);
    if(pos > 0){
      //bd = new BigDecimal(pos/arr.size()) ;
     // bd = bd.setScale(6);
      System.out.format("%.6f\n", pos/arr.size());
    }else{
      System.out.println(zeroStr);
    }

    if(neg > 0){
      System.out.format("%.6f\n", neg/arr.size());
    } else{
      System.out.println(zeroStr);
    }

    if(zero > 0){
      System.out.format("%.6f", zero/arr.size());
    } else{
      System.out.print(zeroStr);
    }
  }

  public static void main(String[] args) {
   // plusMinus(List.of(1,1,0,-1,-1));
    //plusMinus(List.of(-4 ,3 ,-9 ,0 ,4, 1));
    //plusMinus(List.of(1, -2, -7, 9, 1, -8, -5));
    final List ls = List.of(43,
      55, 48, 48, 45 ,91, 97, 45, 1, 39, 54 ,36 ,
      6 ,19, 35, 66, 36, 72, 93, 38 ,21, 65, 70,
      36, 63 ,39, 76 ,82 ,26, 67 ,29 ,24, 82, 62, 53 ,1 ,50 ,47, 65, 67, 19, 66, 90, 77);
    plusMinus(ls);
  }


}
