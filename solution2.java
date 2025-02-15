import java.util.Scanner;
public class solution2{
    public static int counter(int num){
        int count = 0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int sum(int num){
        int rev;
        int sum = 0;
        while(num!=0){
            rev = num%10;
            sum = sum + rev;
            num/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = counter(num);
        int resultSum = sum(num);

        while (resultSum >= 10) { 
            resultSum = sum(resultSum);
        }
        
        System.out.println("The ans is  " + resultSum);

        
    }
}