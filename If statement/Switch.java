import java.util.*;
public class Switch {
    public static void main(String[] args){
        int a = 30;
        int b = 44;
        Scanner sc = new Scanner(System.in);
        System.out.println("Make your choice between '+,-,*,/,%'");
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a+b);
            break;
            case '*':
            System.out.println(a+b);
            break;
            case '/':
            System.out.println(a+b);
            break;
            case '%':
            System.out.println(a+b);
            break;
            default :
            System.out.println("please enter valid choice..");
            sc.close();
        }
    }
}
