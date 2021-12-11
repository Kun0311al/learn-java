public class ElseIf {
   public static void main(String[] args){
       int age = 40;
        if(age<18){
            System.out.println("you are not mature.");
        }
        else if(age>18 && age<120){
            System.out.println("You are mature.");
        }
        else{
            System.out.println("Please check your enter age.");
        }
   } 
}
