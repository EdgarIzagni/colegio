package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {
    private static Operations instance;
    
    private Operations(){
        
    }

    public static Operations getInstancia() {
        if(instance == null) {
            instance = new Operations();
        }
        
        return instance;
    }
    
    public Connection init() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", "root", "");
    }
    
    
    public ResultSet getData(String statement) {
        ResultSet rs = null; 
        try {
            Connection con  = init();
            Statement st = con.createStatement();
            rs = st.executeQuery(statement);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return rs;    
    }
    
    
    public void executeQuery(String statement){
        try(Connection con  = init()) {
            PreparedStatement ps = con.prepareStatement(statement);
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
