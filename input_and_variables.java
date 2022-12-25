import java.util.*; //this is required to use the input Scanner 

public class input_and_variables {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //sc is a scanner object
        String name = sc.nextLine(); //sc.nextline will get the whole line of input
        System.out.println(name);

        /*
         * other methods of scanner class include:
         * nextInt()
         * nextFloat()
         * next() - inputs just the one word for input
         */
    
    }
}
