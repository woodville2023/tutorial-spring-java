package learn.nara.staircase;

public  class Result {

  /*
   * Complete the 'staircase' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void staircase(int n) {
    StringBuffer sb = new StringBuffer();
    StringBuffer sbBig = new StringBuffer();
    char space = " ".charAt(0);
    int ctr = n;
    while(ctr> 0){
      sb.append(space);
      ctr--;
    }
    ctr = n;
    while(ctr> 0){
      sb.setCharAt(--ctr,'#');
      sbBig.append(sb.toString());
      if(ctr != 0){
        sbBig.append("\n");
      }

      //ctr--;
    }
    System.out.println(sbBig);
    //System.out.println("char:"+" ".length()+"charAt");
  }


  public static void main(String[] args) {
      staircase(7);
  }
}

