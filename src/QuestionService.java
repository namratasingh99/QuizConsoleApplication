import java.util.*;
public class QuestionService {
      Question[] ques = new Question[5];
      String choice[] = new String[5];
      String ansOption[] = {"A" ,"C","D" ,"C","B"};
      Scanner sc = new Scanner(System.in);

    public void setDefaultQuestions(){
        ques[0]= new Question(1,"Which keyword is used to inherit a class in java" , "extends","inherit","implements","super","extends");
        ques[1]= new Question(2,"Which loop is guaranteed to execute atleast once" , "for","while","do-while","switch","do-while");
        ques[2]= new Question(3,"Which keyword is used to create a object in java" , "class","static","this","new","new");
        ques[3]= new Question(4,"Which method compares the content of two strings in java" , "==","compare","equals","match","equals");
        ques[4]= new Question(5,"Which datatype stroes only true or false" , "int","boolean","float","char","boolean");
    }


   public void playQuiz() {
        for(int i=0 ; i<ques.length ; i++){

            System.out.println(ques[i].getId() + " " + ques[i].getQues());
            System.out.println();
            System.out.println("A " + ques[i].getOpt1());
            System.out.println("B " +ques[i].getOpt2());
            System.out.println("C " +ques[i].getOpt3());
            System.out.println("D " +ques[i].getOpt4());
            System.out.print("Enter your choice  ");
            choice[i] = sc.nextLine();
            System.out.println();
        }
   }

   public void displayScore(){
    int score = 0;
       for(int i=0 ; i<ques.length ; i++){
        if(choice[i].equals(ques[i].getAns())|| choice[i].toUpperCase().equals(ansOption[i])){
            ++score;
        }
       }
       System.out.println("Score of user is = "+score);
   }

   public void setQuestions(){
    System.out.println("Set the quiz for Students ");
    System.out.println();
    for(int i=0 ; i<ques.length ; i++){
        System.out.println("Enter the question");
        String question = sc.nextLine();
        ques[i].setId(i);
        ques[i].setQues(question);

        System.out.println("Enter option 1");
        String opt1=sc.nextLine();
        ques[i].setOpt1(opt1);

        System.out.println("Enter option 2");
        String opt2=sc.nextLine();
        ques[i].setOpt2(opt2);

        System.out.println("Enter option 3");
        String opt3=sc.nextLine();
        ques[i].setOpt3(opt3);

        System.out.println("Enter option 4");
        String opt4=sc.nextLine();
        ques[i].setOpt4(opt4);

        System.out.println("Enter Answer");
        String answer=sc.nextLine();
        ques[i].setAns(answer);

        System.out.println("Enter Answer option like (A,B,C,D)");
        String answerOption=sc.nextLine();
        ansOption[i]=answerOption;
    }
   }
}
