import java.util.*;
class Main{
  static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args){
    int n = kbd.nextInt();
    kbd.nextLine();
    String[] sentence = new String[n];
    for(int i = 0;i < n;i++){
      sentence[i] = kbd.nextLine();
    }
    for(int j = 0;j < sentence.length;j++){
      String arr[] = sentence[j].split(" ");
      for(int i = 0;i < arr.length;i++){
        if(arr[0].equals("Simon") && arr[1].equals("says")){
            for(i = 2;i < arr.length;i++)
              System.out.print(arr[i] + " ");
            System.out.println();
        }
      }
    }
  }
}