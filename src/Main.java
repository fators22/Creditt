import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        while(true) {
        System.out.println("Hello , Enter a CC num");
        long cc=input.nextLong();
        //check 16, 15 or 13
            if ( Credit.findDigits(cc)==16  ){
                //check for visa
                if(Credit.getDigit(cc, 16 )==4){
                    System.out.println("TYPE VISA");
                    break;
                }
            }


        }


    }
}