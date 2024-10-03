import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Question{
    private String problem;
    private String answer;

    public Question(String problem,String answer){
        this.problem = problem;
        this.answer = answer;


    }
    public String getproblem(){
        return problem;
    }

    public String getanswer(){
        return answer;
    }



}

class Vocab {

    List<Question> problems ;
    Vocab(){
        problems = new ArrayList<>();

        loardproblems();

    }
    void loardproblems(){

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";







        problems.add(new Question("1. " +
                "Number of primitive data types in Java are?\n" +
                "\n" +"(a) 1"+
                "\n" +"(b) 2"+
                "\n" +"(c) 8"+
                "\n" +"(d) 9"+
                "","c"));




        problems.add(new Question("2." +
                "What is the size of float and double in java?\n" +
                "\n" +"(a) 32 and 64"+
                "\n" +"(b) 32 and 32"+
                "\n" +"(c) 64 and 64"+
                "\n" +"(d) 64 and 64"+
                "", "a"));




        problems.add(new Question("Q3. public class Solution{\n" +
                "       public static void main(String[] args){\n" +
                "                     short x = 10;\n" +
                "                     x =  x * 5;\n" +
                "                     System.out.print(x);\n" +
                "       }\n" +
                "}\n" +"(a) 50"+
                "\n" +"(b) 10"+
                "\n" +"(c) compile error"+
                "\n" +"(d) Exception"+
                "","c"));




        problems.add(new Question("Q4.When is the object created with new keyword?\n" +
                "\n" +"(a) At run time"+
                "\n" +"(b) At compile time"+
                "\n" +"(c) Depends on the code"+
                "\n" +"(d) None"+
                "","a"));

        problems.add(new Question("Q5.  String str = “abcde”;\n" +
                "System.out.println(str.substring(1, 3));" +
                "\n" +"(a) abc"+
                "\n" +"(b) bc"+
                "\n" +"(c) bcd"+
                "\n" +"(d) cd"+
                "","b"));

        problems.add(new Question("Q6. Identify the return type of a method that does not return any value.\n"+
                "\n" +"(a) int"+
                "\n" +"(b) void"+
                "\n" +"(c) double"+
                "\n" +"(d) None"+
                "","b"));



        problems.add(new Question("Q7. Identify the modifier which cannot be used for constructor."+
                "\n"+"(a) public"+
                "\n"+"(b) protected"+
                "\n"+"(c) private"+
                "\n"+"(d) static"+
                "",""));


        problems.add(new Question("Q8.What is the variables declared in a class for the use of all methods of the class called?\n" +
                "\n" +"(a) Object"+
                "\n" +"(b) Instance"+
                "\n" +"(c) Reference variable"+
                "\n" +"(d) None"+
                "\n ","b"));
        problems.add(new Question("Q9. Select the valid statement to declare and initialize an array.\n"+
                "\n" +"(a) int[]A = {}"+
                "\n" +"(b) int[]A = {1,2,3}"+
                "\n" +"(c) int[]A = (1,2,3)"+
                "\n" +"(d) int[][]A = {1,2,3}"+
                "","b"));
        problems.add(new Question("Q10. What is the extension of java code files?\n" +
                "(a) .js\n" +
                "(b) .txt\n" +
                "(c) .class\n" +
                "(d) .java ","d"));



//
//        problems.add(new Question("Q11. ",""));
//        problems.add(new Question("Q12. ",""));
//        problems.add(new Question("Q13 ",""));

































































    }
//    public Question countpro() {
//        int count = 0;
//        Random rand = new Random();
//
//
////        return problems.get(ran(d)nextInt(4));
//
//
//        return problems.get(count++);
//
//
//    }







}

class Quizes extends Vocab
{

    int score ;
    public Quizes(){
        score = 0;

    }
    public void start(){

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";




        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < problems.size(); i++){

            Question problem = problems.get(i);

            System.out.println("=>" + problem.getproblem());
            System.out.print(GREEN+"Which option is correct : "+RESET);
            String ans = sc.nextLine();


            if (ans.equalsIgnoreCase( problem.getanswer())){
//                System.out.println("Correct!");
                score++;

            }
//            else{
//                System.out.println("Incorrect! the correct is :"+RED+ans+RESET);
//
//            }





        }
        System.out.println("Your score : "+ score+"/"+ problems.size());
    }

}


public class dkf {








    public static void main(String[] args) {

        System.out.println("Welcomes to the Quiz attempted Student :");
        Vocab v = new Vocab();

        Quizes Q = new Quizes();
        Q.start();


    }
}

