package learn.nara.minmax;

import java.util.List;

public class Result {

  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long minTrack = 0;
    long maxTrack = 0;
    for(int i =0 ;i< arr.size() ;i++){
      long loopNumTrack = 0;
      for(int j = 0; j < arr.size(); j++){
        if(i != j){
          loopNumTrack += arr.get(j);
        }
      }
      System.out.println(loopNumTrack+"-");
      if(loopNumTrack > maxTrack){
        maxTrack = loopNumTrack;
      }
      if(minTrack == 0){
        minTrack = loopNumTrack;
      }
      if(loopNumTrack < minTrack){
        minTrack = loopNumTrack;
      }
    }
    System.out.println(minTrack+" "+maxTrack);
  }

  public static void main(String[] args) {
      //miniMaxSum(List.of(1,3,5,7,9));
    miniMaxSum(List.of(256741038 ,623958417, 467905213, 714532089 ,938071625));
  }
}
