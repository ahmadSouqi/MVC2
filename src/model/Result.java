package model;

/**
 * Created by asouqi on 3/27/18.
 */
public class Result {

    private String studentName;
    private String examTitle;
    private String[] selectedQuestion;
    private String[] answer;
    private double score;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    public String[] getSelectedQuestion() {
        return selectedQuestion;
    }

    public void setSelectedQuestion(String[] selectedQuestion) {
        this.selectedQuestion = selectedQuestion;
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
