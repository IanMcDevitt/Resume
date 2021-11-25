/**
 * Ian McDevitt
 */

public class Question{
    private String question;
    private String[] answers;
    private int correctAnswer;
    /**
     * creating constructor for question and intializing private variables
     * @param question takes in question
     * @param ans1 answer option 1
     * @param ans2 answer option 2
     * @param ans3 answer option 3
     * @param ans4 answer option 4
     * @param correctAnswer correct answer
     */

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer;


    }
    /**
     * @return a string that handles the output for the question and answers 
     */
    public String toString(){
        String ret = "";
        int iterator = 0;
        ret += question;
        for(int i = 0; i < answers.length; i++){
            iterator++;
           ret += "\n" + iterator + " " + answers[i] ;
        }
        return ret;
    }
    /**
     * takes in an user answer and checks to see if the answer is correct, return true if it is and false if it is not.
     * @param userAnswer
     * @return
     */
    public boolean isCorrect(int userAnswer){
        userAnswer = userAnswer - 1;
        String correct = getCorrectAnswer();
        int correct1 = Integer.parseInt(correct);

        if(userAnswer == correct1){
            return true;
        }
        return false;
    }
    /**
     * returns the correct answer
     * @return
     */
    public String getCorrectAnswer(){
        String ret; 
        ret = String.valueOf(correctAnswer);
        return ret;
    }

}