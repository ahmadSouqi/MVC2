package dao;

import model.QuestionBank;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asouqi on 3/29/18.
 */
public class QuestionBankDAO extends TemplateDAO<QuestionBank,String>{

    @Override
    public List<QuestionBank> get() throws SQLException {
        connectWithResultSet("select * from onlineExam.QuestionBank;");
        List<QuestionBank> questionBanks=new ArrayList<>();

        while (set.next()){
            QuestionBank questionBank=new QuestionBank();
            questionBank.setName(set.getString(1));
            questionBanks.add(questionBank);
        }
        closeConnection();
        return questionBanks;
    }

    @Override
    public void add(QuestionBank questionBank) throws SQLException {
        connectWithPreparedStatement("INSERT INTO onlineExam.QuestionBank VALUE(?)");
        preparedStatement.setString(1, questionBank.getName());
        preparedStatement.execute();
        closeConnection();
    }

    @Override
    public void edit(QuestionBank questionBank)throws SQLException {
        connectWithPreparedStatement("update onlineExam.QuestionBank set name=? where name=?");
        preparedStatement.setString(1,questionBank.getName());
        preparedStatement.setString(2,questionBank.getName());
        preparedStatement.execute();
        closeConnection();
    }

    @Override
    public void delete(String id) throws SQLException {
        connectWithPreparedStatement("DELETE FROM onlineExam.QuestionBank WHERE name=?");
        preparedStatement.setString(1,id);
        preparedStatement.execute();
        closeConnection();
    }
}
