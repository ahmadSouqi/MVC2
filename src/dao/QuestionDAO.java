package dao;

import model.Question;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asouqi on 3/29/18.
 */
public class QuestionDAO extends TemplateDAO<Question,Long> {
    
    @Override
    public List<Question> get() throws SQLException {
        connectWithResultSet("select * from onlineExam.Question;");
        List<Question> questions=new ArrayList<>();

        while (set.next()){
            Question question=new Question();
            question.setId(set.getLong(1));
            question.setDescription(set.getString(2));
            question.setImg(set.getBytes(3));
            question.setQuestionType(Question.type.valueOf(set.getString(4)));
            question.setExpectedAnswer(getExpectedAnswer(question.getId()));
            question.setCorrectAnswer(set.getString(6));
            questions.add(question);
        }
        closeConnection();
        return questions;
    }

    @Override
    public void add(Question question) throws SQLException {
        connectWithPreparedStatement("INSERT INTO onlineExam.Question VALUE(?,?,?,?)");
        preparedStatement.setLong(1,question.getId());
        preparedStatement.setString(2,question.getDescription());
        preparedStatement.setBytes(3,question.getImg());
        preparedStatement.setString(4,question.getQuestionType().toString());
        /*add expexted answer*/
        preparedStatement.execute();
        closeConnection();
    }

    @Override
    public void edit(Question object) throws SQLException {

    }

    @Override
    public void delete(Long id) throws SQLException {

    }

    private List<String> getExpectedAnswer(Long id) throws SQLException {
        connectWithResultSet(String.format("select expected_answer from onlineExam.ExpectedAnswer" +
                                           "where question_id=%d",id));
        List<String> expectedAnswer=new ArrayList<>();
        while (set.next()){
            expectedAnswer.add(set.getString(1));
        }
        closeConnection();
        return expectedAnswer;
    }
}
