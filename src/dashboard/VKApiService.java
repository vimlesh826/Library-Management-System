/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vimleshkumar
 */
public class VKApiService {
    public static ResultSet login(String username, String password){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library_management","root","0000");
            PreparedStatement log=con.prepareStatement("select username from users where username = ? && password = ?;");
            log.setString(1, username);
            log.setString(2, password);
            ResultSet rs = log.executeQuery();
            return rs;
//            if(rs.next()){
//                new dashboard.home(user).setVisible(true);
//                dispose();
//            }
//            else
//                JOptionPane.showMessageDialog(this, "Login Failed","Alert",JOptionPane.ERROR_MESSAGE);
        
            }
        catch(ClassNotFoundException | SQLException e)
        { 
            System.out.println(e);
        }
        return null;
    }
}
