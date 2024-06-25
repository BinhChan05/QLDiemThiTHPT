package Models;

import DBConnection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Student {
    Connection con = dbConnection.getConnection();
    PreparedStatement ps;
    
    public void insert(int id, String sname, String date, String gender, String email,
    String phone, String hometown, String address, String school, String test) {
        
        String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?)";       
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, sname);
            ps.setString(3, date);
            ps.setString(4, gender);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setString(7, hometown);
            ps.setString(8, address);
            ps.setString(9, school);
            ps.setString(10, test);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Thí sinh mới đã được thêm vào thành công");
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }      
    }
    
    public void update(int id, String sname, String date, String gender, String email,
    String phone, String hometown, String address, String school, String test) {
        
        String sql = "update student set name = ?, date_of_birth = ?, gender = ?,"
        + "email = ?, phone = ?, hometown = ?, address = ?, school = ?, test = ? where student_id = ?";       
        try {
            ps = con.prepareStatement(sql);            
            ps.setString(1, sname);
            ps.setString(2, date);
            ps.setString(3, gender);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.setString(6, hometown);
            ps.setString(7, address);
            ps.setString(8, school);
            ps.setString(9, test);
            ps.setInt(10, id);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được cập nhật thành công");
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }      
    }
    
    public void delete(int id) {
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Điểm của thí sinh này cũng sẽ bị xóa khỏi danh sách", 
        "Student Delete", JOptionPane.OK_CANCEL_OPTION, 0);
        if(YesOrNo == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("delete from student where student_id = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Dữ liệu đã được xóa thành công");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean isEmailExist(String email) {
        try {
            ps = con.prepareStatement("select * from student where email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean isIdExist(String sid) {
        try {
            ps = con.prepareStatement("select * from student where student_id = ?");
            ps.setString(1, sid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean isPhoneExist(String phone) {
        try {
            ps = con.prepareStatement("select * from student where phone = ?");
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean isIdExist(int id) {
        try {
            ps = con.prepareStatement("select * from student where student_id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
       
    public void getStudentValue(JTable table, String searchValue) {
        String sql = "select * from student where concat(student_id,name,email,phone) like ? order by student_id desc";        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[10];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

