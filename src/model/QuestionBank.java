package model;

/**
 * Created by asouqi on 3/25/18.
 */
public class QuestionBank {

    private String name;
    private QuestionGroup[] questionGroups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuestionGroup[] getQuestionGroups() {
        return questionGroups;
    }

    public void setQuestionGroups(QuestionGroup[] questionGroups) {
        this.questionGroups = questionGroups;
    }
}
