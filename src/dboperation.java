/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rathnayaka RMBS
 */

import java.sql.ResultSet;
import java.sql.Statement; 
import javax.swing.JOptionPane;

public class dboperation {
    public static void addcustomer(Customeradd c){
        try{
            Statement s= dbconnection.getStatement();
            String query="INSERT INTO customer_bill (customer_id,customer_name,room_number,days_stay,bill) VALUES('"+c.getCustomer_id()+"','"+c.getName()+"','"+c.getRoom_no()+"','"+c.getRoom_no_refered()+"','"+c.getDats_stay()+"','"+c.getBill()+"')";
            s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Successfully added");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
