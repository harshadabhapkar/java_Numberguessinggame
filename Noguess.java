package Numberguessinggame;
import java.util.Random;
import java.util.Scanner;
public class Noguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ra=new Random();
        Scanner scanner= new Scanner(System.in);

        int randno= ra.nextInt(100) + 1;
        int tryCount=43;
        while(true){
            System.out.println("Enter guess (1-100):");
            int guesser=scanner.nextInt();
            tryCount++;
            if(guesser==randno){
                System.out.println("wow! You win..");
                System.out.println("it took you "+tryCount+"trieee");
                break;
            }
            else if(randno>guesser){
                System.out.println("sryy!!.. number is higher try again");
            }
            else{
                System.out.println("sryy!! ..number is lower try again");
            }
        }
        scanner.close();
    }
    


	}


