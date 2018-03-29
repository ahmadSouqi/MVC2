package dao;

import model.User;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by asouqi on 3/15/18.
 */
public class UserDAO extends TemplateDAO<User,String>{

    @Override
    public Set<User> get() throws SQLException {
        connectWithResultSet("select * from Servlet.Users;");
        Set<User> users=new HashSet<>();

        while (set.next()){
            users.add(new User(set.getString(1),set.getString(2),
                    set.getString(3)));
        }
        closeConnection();
        return users;
    }

    @Override
    public void add(User user) throws SQLException {
        connectWithPreparedStatement("INSERT INTO users VALUE(?,?,?)");
        preparedStatement.setString(1, user.getUserName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getRoll());
        preparedStatement.execute();
        closeConnection();
    }

    @Override
    public void edit(User user)throws SQLException {
        connectWithPreparedStatement("update users set UserName=?, Password=?," +
                "roll=?, where UserName=?;");
        preparedStatement.setString(1, user.getUserName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getRoll());
        preparedStatement.execute();
        closeConnection();
    }

    @Override
    public void delete(String id) throws SQLException {
        connectWithPreparedStatement("DELETE FROM Servlet.student WHERE student_id=?");
        preparedStatement.setString(1,id);
        preparedStatement.execute();
        closeConnection();
    }
}
