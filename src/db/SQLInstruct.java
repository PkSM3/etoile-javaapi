/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

public class SQLInstruct {

    //Database Configs:
   
    public static final String dbAdress="jdbc:mysql://10.10.33.228:3306/etoile";
    public static final String dbUsername="rui";
    public static final String dbPassword="etoile";

    public static String login(String username, String parseSHA1Password) {
       return "SELECT id,username FROM student WHERE student.username='" + username 
               + "' AND student.password='" + parseSHA1Password + "'";
           
    }
    
    
}