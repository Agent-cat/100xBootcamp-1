/*
Your task is to print a right-angled triangle pattern using asterisks (*).
Input

There is no input for this problem.
Output

Print the following pattern exactly as shown:


*****
****
***
**
*

*/
 public class Triangle_Pattern {
    public static void main(String[] args) {
       for(int i=5;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
            System.out.println();
       }
    }
}

