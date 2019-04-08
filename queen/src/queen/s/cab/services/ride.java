/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queen.s.cab.services;


import java.sql.*;
/**
 *
 * @author Siddharth
 */
public class ride {
    String source;
    String destin;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    ride(String s, String d){
        source = s;
        destin = d;     
    }
    
    public int getFare(String source, String destin) throws SQLException{
        int cost = 0;
        int code = getCode(source, destin);
        String query = "SELECT FARE FROM FARE WHERE CODE = ?";
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/se_proj","root","");
        pst = con.prepareStatement(query);
        pst.setInt(1, code);
        rs = pst.executeQuery();
        while(rs.next()){
            cost = rs.getInt("FARE");
        }
        return cost;
    }
    
    public int getCode(String s, String d){
        int code = 0 ;
        int i;
        for(i=0; i<2; i++){
            String temp;
            if(i==0){
                temp = s;
            }
            else{
                temp = d;
            }
            switch (temp){
                case "manipal":
                    code = code + 11;
                    break;
                case "mangalore":
                    code = code + 22;
                    break;
                case "delhi":
                    code = code + 33;
                    break;
                default:
                    code = code + 00;
            }
            if(code/1000 == 0)
                code = code * 100;
        }
        return code;
    }
}
