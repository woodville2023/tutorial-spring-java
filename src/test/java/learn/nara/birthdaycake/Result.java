package learn.nara.birthdaycake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

  public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int maxCnt =0;
    int maxVal =0 ;

    Collections.sort(candles);
    Collections.reverse(candles);

    maxVal = candles.get(0);
    //System.out.println("maxVal:"+maxVal);
    for(int i : candles){
      if(maxVal == i){
        maxCnt++;
        continue;
      }
      //break;
    }
    System.out.println(maxCnt);
    return maxCnt;
  }

  public static void main(String[] args) {
    birthdayCakeCandles(new ArrayList(List.of(3,2,1,3,5,5,5)));
  }

}
