import java.util.Scanner;
public class Bai4_Scanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String userName;
        String passWord;

        System.out.println("Register \n");
        System.out.print("Enter Username: ");
        userName = sc.nextLine();
        System.out.print("Enter Password: ");
        passWord = sc.nextLine();
        System.out.print("Re-enter Password: ");
        passWord = sc.nextLine();

        String askAgain = "Are you sure to register an account with username \""+ userName + "\" and password \""+passWord+"\"? yes or no?";

        System.out.println(askAgain);

        String yesOrno = sc.nextLine();

        if(yesOrno.toLowerCase().equals("yes") )
        {
            System.out.println("Congrat, you just registered.");
        }
        else
        {
            System.out.println("you canceled to register.");
        }
    }
}
