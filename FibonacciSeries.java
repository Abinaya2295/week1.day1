package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int range = 8, firstNum = 0, secNum = 1, Sum;
       System.out.print(firstNum+" "+secNum);
       for(int i = 2;i < range; i++)
       {
    	   Sum = firstNum + secNum;
    	   firstNum = secNum;
    	   secNum = Sum;   
    	   System.out.print(" "+Sum);
       }
      
	}

}
