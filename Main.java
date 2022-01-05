import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int year;
    Scanner inp =new Scanner(System.in);

    System.out.print("Year Enter :");
    year=inp.nextInt();
    if (year%100==0){
        if (year%400==0){
            System.out.println("Leap Year.");
        }else{
            System.out.println("Not A Leap Year.");
        }
    }else if(year%4==0){
         System.out.println("Leap Year");
        }else{
        System.out.println("Not A Leap Year.");
    }

    }
}
