/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etoile.javaapi;

import db.DBConnect;
import db.SQLInstruct;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rui
 */
public class ServiceManager {

    private String username;
    private String sha1_of_password;
    private int user_id;

    public String setAuthentication(String username, String sha1_of_password) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        this.username = username;
        this.sha1_of_password = sha1_of_password;


        DBConnect db = new DBConnect(SQLInstruct.dbAdress, SQLInstruct.dbUsername, SQLInstruct.dbPassword);
        db.loadDriver();
        String sqlStatement = SQLInstruct.login(username, sha1_of_password);
        System.out.println(sqlStatement);
        ResultSet rSet = db.queryDB(sqlStatement);
        if (rSet.next()) {
            user_id = rSet.getInt(1);
            return "success";
        }
        return "fail";

    }
}