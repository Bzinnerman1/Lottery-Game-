import java.util.*;
import java.lang.*;
 class Main
 {  static final int NUM_DIGITS=5;
  public static void greetUser(){
  System.out.println("Welcome to the LotteryGame");
  System.out.println("You will pick 5 Numbers (0-9) and we will");
  System.out.println("see if you are Grand Prize Winner!);
  }
  public static int[]getLotteryNumber(){
  int lotteeryNum[]= new int[NUM_DIGITS];
  for(int i=0;i<NUM_DIGITS;i++){
  lotteryNum[i]=(int)(Math.random()*(9-0))+0;
  }
  Arrays.sort(lotteryNum);
  return lotteryNum;
  }
  public static int[]getUserPicks(){
  int userPicks[]=new int[NUM_DIGITS];
  scanner s=new Scanner(System.in);
  System.out.println();
  for(int i=0;i<NUM_DIGITS;i++){
  System.out.print("Enter Pick "+(i+1)+"(0-9):");
  num=s.nextint()
  }
  userPicks[i]=num;
  }
  Arrays.sort(userPicks);
  return userPicks;
  }
  public static int findMatches(int ltrN[],usrpN[]){
  int count=0;
  for(int i=0;i<NUM_DIGITS;i++){
  if(ltrN[i]==usrpN[i]){
  count++;
  }
 }
 return count;
 }
 public static void main(string[]args){
 Main L=new Main();
 L.greetUser();
 int lotteryN[]= L.getLotteryNumber();
 int usrPicks[]= L.getUserPicks();
 int matchNum = L.findMatches(lotteryN,usrPicks);
   System.out.println();
   System.out.print("Lottery NUmber:");
 for(int i=0;i<NUM_DIGITS;i++){
   System.out.print("Number of matching digits:"+matchNum);
   if(matchNum == 5){
   System.out.print("GRAND PRIZE WINNER!!");
   }
   else{
     System.out.print("Sorry,You didn't Win.");
     }
   }
   
 }
  