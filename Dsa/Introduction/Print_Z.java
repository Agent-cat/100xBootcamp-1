/*
Your task is to print the letter Z using asterisks (*) as shown below.
Input

There is no input for this problem.
Output

Print the following pattern exactly as shown:


*****
   *
  *
 *
*****

*/

public class Print_Z {
    public static void main(String[] args) {
       for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(i==0||i==4||j==5-i-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");

            }
        }
                System.out.println();
       }
    }
}


