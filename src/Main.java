import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        QuestionService service = new QuestionService();
        Scanner sc = new Scanner(System.in);
        char flag;
        System.out.println("You are a Teacher or a Student");
        String role = sc.nextLine();
        if(role.toLowerCase().equals("teacher")){
            System.out.println();
            service.setQuestions();
        }
        else{
            do{
                service.setDefaultQuestions();
                service.playQuiz();
                service.displayScore();
                System.out.println("Do you want to play Quiz again");
                flag = sc.next().charAt(0);
                System.out.println();
              }while(flag=='y'||flag=='Y');
            System.out.println("Thankyou for playing the quiz");
        }
    }
}
