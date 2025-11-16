import java.util.*;
public class QuestionServices {
    Question[] q = new Question[5];
    String[] seletion= new String[5];

    public QuestionServices() {
        q[0]=new Question(1, "What", "java", "cpp", "python", "c#", "java");
        q[1]=new Question(2, "float", "2", "1", "null", "4 ","4");
        q[2]=new Question(3, "int", "2", "4", "8", "c1 ","2");
        q[3]=new Question(4, "String Type", "string", "boolean", "String", "object", "String");
        q[4]=new Question(5, "boolean Type", "true", "false", "both", "none", "both");
        
    }

    public  void palyQuiz(){
        int i=0;
       for(Question qu : q){
        System.out.println("Question No : "+qu.getId());
        System.out.println("Question : "+qu.getQuestion());
        System.out.println(qu.getOptions1());
        System.out.println(qu.getOptions2());
        System.out.println(qu.getOptions3());
        System.out.println(qu.getOptions4());
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Your Answare : ");
        seletion[i]=sc.nextLine();
        i++;
        
       }
       i=0;
       for(String s:seletion){
        System.out.println("User Answare : "+i++);
            System.out.println(s);
       }
    }

    public void printScore(){
        int score=0;
       
        for(int i=0;i<q.length;i++){
            Question qe =  q[i];
            String actualAnsware=qe.getAnsware();
            String userAnsware=seletion[i];

            if(actualAnsware.equals(userAnsware)) score++;

        }

        System.out.println("Your Score is : "+ score);
        
    }
    
    
}
