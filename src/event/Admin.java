package event;

import model.QuestionBank;
import model.User;

/**
 * Created by asouqi on 3/25/18.
 */
public class Admin {

    private User admin;
    private User[] teachers;
    private User[] students;
    private QuestionBank[] majers;
    private static final Admin instence =new Admin();

    private Admin(){}
}
