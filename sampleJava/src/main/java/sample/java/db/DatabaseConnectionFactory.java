package sample.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by pkumar on 10/8/17.
 */
public class DatabaseConnectionFactory {

    private Connection oracleConnection;
    private Connection db2Connection;

    public Connection createOracleConnection() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            oracleConnection = DriverManager.getConnection("jdbc:oracle:thin:@meboralobdev101.metmom.mmih.biz:1521:test3", "testuser3", "password3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  oracleConnection;
    }

    public Connection createDb2Connection() {

        return  db2Connection;
    }

    public void closeOracleConnection() {
        if (oracleConnection != null) {
            try {
                oracleConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void closeDb2Connection() {
        if(db2Connection != null) {
            try {
                db2Connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
