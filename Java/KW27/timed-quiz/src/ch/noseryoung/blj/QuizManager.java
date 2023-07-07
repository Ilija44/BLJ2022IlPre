package ch.noseryoung.blj;

import java.sql.Time;

public class QuizManager {

    private Console console;
    private Quiz quiz;
    private boolean questionAnswered = false;

    public QuizManager(Console console) {
        this.console = console;

        this.quiz = new Quiz();
        quiz.createQuestion("Was ist mein Name", new String[]{"Ilija", "Elias", "Noah"}, 1 );
        quiz.createQuestion("Was ist mein Alter?", new String[]{"39", "20", "16"}, 3 );
        quiz.createQuestion("Bei welcher Firma arbeite ich?", new String[]{"Google", "Noser Young", "Accenture"}, 1 );
    }

    public void handleTextInput(String textInput, Boolean isQuizRunning) {
        console.appendLine("└> " + textInput);
    }

    public void playQuiz() {
        Question currentQuestion = quiz.getQuestions().get(quiz.getCurrentQuestionCount());
        console.appendLine(currentQuestion.question);
        console.appendLine("[1] " + currentQuestion.answers[0]);
        console.appendLine("[2] " + currentQuestion.answers[1]);
        console.appendLine("[3] " + currentQuestion.answers[2]);
    }
    public void startTimer(Timer timer){
        if (!(quiz.getCurrentQuestionCount() == 2)){
            timer.start();
        }

    }
    public void finished(){
        console.appendLine(" Du hast " +quiz.getCorrectAnswers()+ " von 3 beantwortet");
        quiz.setCurrentQuestionCount(0);
    }
    public boolean increaseQuestionCount(){
        if (quiz.getCurrentQuestionCount() == 2){
            finished();
            return true;
        }else {
            int newQuestionCont = quiz.getCurrentQuestionCount() + 1;
            quiz.setCurrentQuestionCount(newQuestionCont);
            return false;
        }
    }

    public void checkAnswer(String userInput) {
        Question currentQuestion = quiz.getQuestions().get(quiz.getCurrentQuestionCount());
        String correctAnswer = String.valueOf(currentQuestion.correctAnswer);
        if (userInput.equals(correctAnswer)){
            quiz.setCorrectAnswers(quiz.getCorrectAnswers() + 1);
        }
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public boolean isQuestionAnswered() {
        return questionAnswered;
    }

    public void setQuestionAnswered(boolean questionAnswered) {
        this.questionAnswered = questionAnswered;
    }
}
