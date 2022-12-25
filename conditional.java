import java.util.*;

public class conditional {
    public static void main(String args[]){
        int drinkingAge = 21;
        Scanner sc = new Scanner(System.in);
        int userAge = sc.nextInt();

        if(userAge > drinkingAge){
            System.out.println("You are welcome in the bar");
        }
        else if(userAge > 18 && userAge < drinkingAge){
            System.out.println("You are allowed to visit bars in the EU");
        }
        else{
            System.out.println("You are too young to enter a bar");
        }
    }
}
