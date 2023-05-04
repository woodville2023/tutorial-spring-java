package learn.nara.timeconversion;

public class Result {
  public static String timeConversion(String s) {
    // Write your code here
    s = s.toUpperCase();
    if(s.endsWith("PM")){
      s = s.replace("PM","");
      String hour = s.substring(0,2);
      int hourNum = Integer.parseInt(hour);
      if(hourNum < 12){
        hourNum +=12;
        //hour = String.valueOf(hour);
        s = hourNum+s.substring(2);
      }
    }

    if(s.endsWith("AM")){
      s = s.replace("AM","");
      String hour = s.substring(0,2);
      int hourNum = Integer.parseInt(hour);
      if(hourNum == 12){
        hourNum = 00;
        //hour = String.valueOf(hour);
        s = "00"+s.substring(2);
      }
    }
    //System.out.println(s);
    return s;
  }


  public static void main(String[] args) {
      timeConversion("01:05:45AM") ;
  }
}
