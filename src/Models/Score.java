package Models;

import Views.Home;
import DBConnection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score {

    Connection con = dbConnection.getConnection();
    PreparedStatement ps, ps2;

    public boolean getDetails(int sid) {
        try {
            String sql = "select * from subject where student_id = ?";
            String sql2 = "select * from student where student_id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, sid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Home.jTextField9.setText(String.valueOf(rs.getString(2)));
                Home.jTextSubject1.setText(String.valueOf(rs.getString(3)));
                Home.jTextSubject2.setText(String.valueOf(rs.getString(4)));
                Home.jTextSubject3.setText(String.valueOf(rs.getString(5)));
                Home.jTextSubject4.setText(String.valueOf(rs.getString(6)));
                Home.jTextSubject5.setText(String.valueOf(rs.getString(7)));
                Home.jTextSubject6.setText(String.valueOf(rs.getString(8)));

                ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, sid);
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    Home.jTextField10.setText(String.valueOf(rs2.getString(9)));
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mã thí sinh này không tồn tại");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean getDetail2(String name) {
        try {
            String sql2 = "select * from student where name = ?";

            ps2 = con.prepareStatement(sql2);
            ps2.setString(1, name);
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                Home.jTextField10.setText(String.valueOf(rs2.getString(9)));
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Mã thí sinh này không tồn tại");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void getScoreValue(JTable table, String searchValue) {
        String sql = "select * from score where concat(student_id,name) like ? order by student_id desc";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[14];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getDouble(4);
                row[4] = rs.getString(5);
                row[5] = rs.getDouble(6);
                row[6] = rs.getString(7);
                row[7] = rs.getDouble(8);
                row[8] = rs.getString(9);
                row[9] = rs.getDouble(10);
                row[10] = rs.getString(11);
                row[11] = rs.getDouble(12);
                row[12] = rs.getString(13);
                row[13] = rs.getDouble(14);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String insertId(String name) {
        String a = "";
        try {
            ps = con.prepareStatement("select * from student where name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a = String.valueOf(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public void update(int id, double score1, double score2, double score3, double score4,
    double score5, double score6) {        
        String sql = "update score set score1 = ?, score2 = ?, score3 = ?,"
        + "score4 = ?, score5 = ?, score6 = ? where student_id = ?";       
        try {
            ps = con.prepareStatement(sql);            
            ps.setDouble(1, score1);
            ps.setDouble(2, score2);
            ps.setDouble(3, score3);
            ps.setDouble(4, score4);
            ps.setDouble(5, score5);
            ps.setDouble(6, score6);
            ps.setInt(7, id);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Dữ liệu đã được cập nhật thành công");
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }      
    }
    
    public void delete(int id) {
        int YesOrNo = JOptionPane.showConfirmDialog(null, "Điểm của thí sinh này sẽ bị xóa khỏi danh sách", 
        "Student Delete", JOptionPane.OK_CANCEL_OPTION, 0);
        if(YesOrNo == JOptionPane.OK_OPTION) {
            try {
                ps = con.prepareStatement("delete from score where student_id = ?");
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Dữ liệu đã được xóa thành công");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean isNameExist(String name) {
        try {
            ps = con.prepareStatement("select * from score where name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void insert(int id, String sname, String sub1, String sub2, String sub3,
    String sub4, String sub5, String sub6, double score1, double score2,
    double score3, double score4, double score5, double score6) {

        String sql = "insert into score values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, sname);
            ps.setString(3, sub1);
            ps.setDouble(4, score1);
            ps.setString(5, sub2);
            ps.setDouble(6, score2);
            ps.setString(7, sub3);
            ps.setDouble(8, score3);
            ps.setString(9, sub4);
            ps.setDouble(10, score4);
            ps.setString(11, sub5);
            ps.setDouble(12, score5);
            ps.setString(13, sub6);
            ps.setDouble(14, score6);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Điểm của thí sinh này đã được thêm vào thành công");
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
