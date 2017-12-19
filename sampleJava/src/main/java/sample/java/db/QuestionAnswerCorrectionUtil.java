package sample.java.db;

import java.sql.*;

import javax.xml.transform.Result;

/**
 * Created by pkumar on 10/8/17.
 */
public class QuestionAnswerCorrectionUtil {

    public static void main(String arg[]) {
        QuestionAnswerCorrectionUtil questionAnswerCorrectionUtil = new QuestionAnswerCorrectionUtil();
        DatabaseConnectionFactory databaseConnectionFactory = new DatabaseConnectionFactory();
        Connection connection = databaseConnectionFactory.createOracleConnection();
        System.out.println("Connection created and connection object is - ");
        System.out.println(connection);

        try {
            PreparedStatement statement = connection.prepareStatement("Select * From DM_DOCUMENT Where BATCH_ID = ?");
            statement.setInt(1, 4938159);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        databaseConnectionFactory.closeOracleConnection();

    }
}
