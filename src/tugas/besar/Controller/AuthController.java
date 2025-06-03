/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.besar.Controller;
import tugas.besar.DataAccesObject.userDAO;
import tugas.besar.Model.User;
import tugas.besar.Model.Pemilik;
import tugas.besar.Model.Pegawai;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author VirzaAbsyar
 */
public class AuthController {
    private String username;
    private String password;
    
    
    public User login(String username, String password){
        userDAO userDao = new userDAO();
        User user = userDao.checkUsername(username);

        if (user != null) {
            return user; 
        } else {
            return null; 
        }
    }
}
