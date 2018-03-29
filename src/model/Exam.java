package model;

import java.util.Date;

/**
 * Created by asouqi on 3/25/18.
 */
public class Exam {

    private String title;
    private String author;
    private int questionNumber;
    private Date start;
    private Date end;
    private QuestionGroup[] groups;
    private double passScore;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public QuestionGroup[] getGroups() {
        return groups;
    }

    public void setGroups(QuestionGroup[] groups) {
        this.groups = groups;
    }

    public double getPassScore() {
        return passScore;
    }

    public void setPassScore(double passScore) {
        this.passScore = passScore;
    }
}
