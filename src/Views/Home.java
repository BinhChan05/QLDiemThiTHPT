package Views;

import Models.MarksSheet;
import Models.Score;
import Models.Student;
import Models.Subject;
import com.ibm.icu.text.NumberFormat;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Home extends javax.swing.JFrame {
// Hello
	Student student = new Student();
	Subject subject = new Subject();
	Score score = new Score();
	MarksSheet mark = new MarksSheet();
	private DefaultTableModel model;
	private int rowIndex;
	NumberFormat nf = NumberFormat.getInstance();

	public Home() {
		initComponents();
		setTitle("Quản Lý Điểm Tốt Nghiệp THPT");
		init();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jPanel3 = new javax.swing.JPanel();
		
		
		
		jPanel2 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jDateChooser1 = new com.toedter.calendar.JDateChooser();
		jComboBox1 = new javax.swing.JComboBox<>();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jComboBox2 = new javax.swing.JComboBox<>();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jComboBox3 = new javax.swing.JComboBox<>();
		jPanel5 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		searchField = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		Refresh = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jBang1 = new javax.swing.JTable();
		jPanel21 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jPanel8 = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jTextField9 = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jTextSubject1 = new javax.swing.JTextField();
		jTextSubject2 = new javax.swing.JTextField();
		jTextSubject6 = new javax.swing.JTextField();
		jTextSubject5 = new javax.swing.JTextField();
		jTextSubject3 = new javax.swing.JTextField();
		jTextSubject4 = new javax.swing.JTextField();
		jTextScore2 = new javax.swing.JTextField();
		jTextScore3 = new javax.swing.JTextField();
		jTextScore4 = new javax.swing.JTextField();
		jTextScore1 = new javax.swing.JTextField();
		jTextScore5 = new javax.swing.JTextField();
		jTextScore6 = new javax.swing.JTextField();
		jTextField10 = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		jPanel22 = new javax.swing.JPanel();
		jPanel23 = new javax.swing.JPanel();
		jTextField8 = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		jButton8.setBackground(new Color(0, 102, 255));
		jPanel11 = new javax.swing.JPanel();
		jPanel12 = new javax.swing.JPanel();
		jLabel22 = new javax.swing.JLabel();
		searchField2 = new javax.swing.JTextField();
		jButton12 = new javax.swing.JButton();
		Refresh1 = new javax.swing.JButton();
		jPanel13 = new javax.swing.JPanel();
		jPanel13.setBackground(new Color(0, 153, 153));
		jScrollPane3 = new javax.swing.JScrollPane();
		jBang2 = new javax.swing.JTable();
		jPanel20 = new javax.swing.JPanel();
		jButton7 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jPanel14 = new javax.swing.JPanel();
		jPanel15 = new javax.swing.JPanel();
		jComboBox7 = new javax.swing.JComboBox<>();
		jTextField19 = new javax.swing.JTextField();
		jLabel26 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jButton16 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jPanel17 = new javax.swing.JPanel();
		jPanel18 = new javax.swing.JPanel();
		jLabel33 = new javax.swing.JLabel();
		searchField3 = new javax.swing.JTextField();
		jButton18 = new javax.swing.JButton();
		Refresh2 = new javax.swing.JButton();
		jPanel19 = new javax.swing.JPanel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jBang3 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
		jTabbedPane2
				.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
		jTabbedPane2.setForeground(new java.awt.Color(51, 51, 51));
		jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

		jPanel3.setBackground(new Color(0, 51, 102));

		jPanel2.setBackground(new Color(255, 255, 255));
		jPanel2.setBorder(UIManager.getBorder("DesktopIcon.border"));

		jTextField1.setBackground(new java.awt.Color(255, 255, 255));
		jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
		jTextField1.setForeground(new java.awt.Color(0, 0, 0));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField1KeyTyped(evt);
			}
		});

		jTextField2.setBackground(new java.awt.Color(255, 255, 255));
		jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
		jTextField2.setForeground(new java.awt.Color(0, 0, 0));
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField2KeyTyped(evt);
			}
		});

		jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
		jDateChooser1.setForeground(new java.awt.Color(0, 0, 0));
		jDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

		jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
		jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jTextField3.setBackground(new java.awt.Color(255, 255, 255));
		jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
		jTextField3.setForeground(new java.awt.Color(0, 0, 0));

		jTextField4.setBackground(new java.awt.Color(255, 255, 255));
		jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
		jTextField4.setForeground(new java.awt.Color(0, 0, 0));
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});
		jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField4KeyTyped(evt);
			}
		});

		jTextField5.setBackground(new java.awt.Color(255, 255, 255));
		jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
		jTextField5.setForeground(new java.awt.Color(0, 0, 0));
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
		jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu",
				"Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước",
				"Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên",
				"Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng",
				"Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lạng Sơn",
				"Lào Cai", "Lâm Đồng", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ",
				"Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La",
				"Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "TP Hồ Chí Minh", "Thừa Thiên Huế", "Tiền Giang",
				"Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 0));
		jLabel1.setText("Mã thí sinh");

		jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(0, 0, 0));
		jLabel2.setText("Tên thí sinh");

		jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(0, 0, 0));
		jLabel3.setText("Ngày sinh");

		jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(0, 0, 0));
		jLabel4.setText("Giới tính");

		jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 0, 0));
		jLabel6.setText("Email");

		jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(0, 0, 0));
		jLabel7.setText("Số điện thoại");

		jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(0, 0, 0));
		jLabel8.setText("Quê quán");

		jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(0, 0, 0));
		jLabel9.setText("Địa chỉ");

		jTextField6.setBackground(new java.awt.Color(255, 255, 255));
		jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
		jTextField6.setForeground(new java.awt.Color(0, 0, 0));
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(0, 0, 0));
		jLabel10.setText("Trường");

		jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(0, 0, 0));
		jLabel11.setText("Ban thi");

		jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
		jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tự nhiên", "Xã hội" }));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup()
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
										.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(18)
								.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(0, 189, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(115)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jTextField2, 254, 254, 254)
										.addComponent(jTextField1, 254, 254,
												254)
										.addComponent(jDateChooser1, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
								.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jLabel8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
								.addComponent(jLabel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
										.createSequentialGroup().addGap(20)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jTextField3, 250, 250, 250)
												.addComponent(jTextField4, 250, 250, 250)
												.addComponent(jTextField5, 250, 250, 250)
												.addComponent(jTextField6, 250, 250, 250).addComponent(jComboBox2,
														GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(18).addComponent(
												jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addGap(34)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel1))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3))
				.addGap(18)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel4).addComponent(
						jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(21)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel7))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel8))
				.addGap(14)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel9))
				.addGap(10)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel10).addComponent(
						jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(44)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel11).addComponent(
						jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(359, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		jPanel5.setBackground(new Color(51, 102, 153));
		jPanel5.setBorder(UIManager.getBorder("DesktopIcon.border"));

		jPanel4.setBackground(new Color(0, 153, 153));
		jPanel4.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(153, 204, 153), null, null, new Color(0, 153, 153)));

		jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(0, 0, 0));
		jLabel5.setText("Tìm kiếm ");

		searchField.setBackground(new java.awt.Color(255, 255, 255));
		searchField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

		jButton1.setBackground(new Color(153, 204, 204));
		jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton1.setForeground(new Color(0, 0, 0));
		jButton1.setText("Tìm");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		Refresh.setBackground(new Color(153, 204, 153));
		Refresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		Refresh.setForeground(new Color(0, 0, 0));
		Refresh.setText("Tải lại danh sách");
		Refresh.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RefreshActionPerformed(evt);
			}
		});
		jButton6 = new javax.swing.JButton();

		jButton6.setBackground(new Color(255, 0, 102));
		jButton6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jButton6.setForeground(new Color(255, 255, 255));
		jButton6.setText("Đăng xuất");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(16).addComponent(jLabel5)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(searchField, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(jButton1).addGap(18)
						.addComponent(Refresh).addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
						.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
								.addComponent(searchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1).addComponent(Refresh)
								.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		jPanel4.setLayout(jPanel4Layout);

		jPanel6.setBackground(new Color(0, 153, 153));
		jPanel6.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));

		jBang1.setBackground(new java.awt.Color(255, 255, 255));
		jBang1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
		jBang1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
		jBang1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã thí sinh", "Họ và tên", "Ngày sinh", "Giới tính", "Email", "Số điện thoại", "Quê quán",
				"Địa chỉ", "Trường", "Ban thi" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jBang1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jBang1MouseClicked(evt);
			}
		});
		jScrollPane2.setViewportView(jBang1);

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6Layout.setHorizontalGroup(
			jPanel6Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel6Layout.setVerticalGroup(
			jPanel6Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel6.setLayout(jPanel6Layout);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5Layout.setHorizontalGroup(
			jPanel5Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel5Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
						.addComponent(jPanel4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel5Layout.setVerticalGroup(
			jPanel5Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, 701, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		jPanel5.setLayout(jPanel5Layout);

		jPanel21.setBackground(new Color(51, 102, 153));
		jPanel21.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 204, 255), null, null, null));

		jButton2.setBackground(new Color(153, 204, 153));
		jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton2.setForeground(new Color(0, 0, 0));
		jButton2.setText("Thêm");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new Color(153, 204, 153));
		jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton3.setForeground(new Color(0, 0, 0));
		jButton3.setText("Sửa");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new Color(153, 204, 153));
		jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton4.setForeground(new Color(0, 0, 0));
		jButton4.setText("Xóa");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBackground(new Color(153, 204, 204));
		jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton5.setForeground(new Color(0, 0, 0));
		jButton5.setText("Làm mới");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton13.setBackground(new Color(204, 204, 204));
		jButton13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton13.setForeground(new Color(0, 0, 0));
		jButton13.setText("In");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
		jPanel21Layout.setHorizontalGroup(
			jPanel21Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel21Layout.createSequentialGroup()
					.addGap(37)
					.addGroup(jPanel21Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jButton13, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(jButton5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, jPanel21Layout.createSequentialGroup()
							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
					.addGap(51))
		);
		jPanel21Layout.setVerticalGroup(
			jPanel21Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel21Layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(jPanel21Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel21Layout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(jButton3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jButton2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
						.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(43))
		);
		jPanel21.setLayout(jPanel21Layout);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel21, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jPanel21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(7)))
					.addGap(10))
		);
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane2.addTab("Danh sách sinh viên", jPanel3);

		jPanel8.setBackground(new Color(0, 51, 102));

		jPanel9.setBackground(new java.awt.Color(255, 255, 255));
		jPanel9.setBorder(UIManager.getBorder("DesktopIcon.border"));

		jTextField9.setEditable(false);
		jTextField9.setBackground(new java.awt.Color(204, 204, 204));
		jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

		jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel13.setForeground(new java.awt.Color(0, 0, 0));
		jLabel13.setText("Tên thí sinh");

		jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel14.setForeground(new java.awt.Color(0, 0, 0));
		jLabel14.setText("Môn 1");

		jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel15.setForeground(new java.awt.Color(0, 0, 0));
		jLabel15.setText("Môn 2");

		jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel16.setForeground(new java.awt.Color(0, 0, 0));
		jLabel16.setText("Môn 3");

		jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel17.setForeground(new java.awt.Color(0, 0, 0));
		jLabel17.setText("Môn 4");

		jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel19.setForeground(new java.awt.Color(0, 0, 0));
		jLabel19.setText("Môn 5");

		jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel21.setForeground(new java.awt.Color(0, 0, 0));
		jLabel21.setText("Môn 6");

		jTextSubject1.setEditable(false);
		jTextSubject1.setBackground(new java.awt.Color(204, 204, 204));
		jTextSubject1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextSubject1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextSubject1ActionPerformed(evt);
			}
		});

		jTextSubject2.setEditable(false);
		jTextSubject2.setBackground(new java.awt.Color(204, 204, 204));
		jTextSubject2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextSubject2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextSubject2ActionPerformed(evt);
			}
		});

		jTextSubject6.setEditable(false);
		jTextSubject6.setBackground(new java.awt.Color(204, 204, 204));
		jTextSubject6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextSubject6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextSubject6ActionPerformed(evt);
			}
		});

		jTextSubject5.setEditable(false);
		jTextSubject5.setBackground(new java.awt.Color(204, 204, 204));
		jTextSubject5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextSubject5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextSubject5ActionPerformed(evt);
			}
		});

		jTextSubject3.setEditable(false);
		jTextSubject3.setBackground(new java.awt.Color(204, 204, 204));
		jTextSubject3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextSubject3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextSubject3ActionPerformed(evt);
			}
		});

		jTextSubject4.setEditable(false);
		jTextSubject4.setBackground(new java.awt.Color(204, 204, 204));
		jTextSubject4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextSubject4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextSubject4ActionPerformed(evt);
			}
		});

		jTextScore2.setBackground(new java.awt.Color(255, 255, 255));
		jTextScore2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextScore2.setForeground(new java.awt.Color(204, 0, 51));
		jTextScore2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextScore2ActionPerformed(evt);
			}
		});

		jTextScore3.setBackground(new java.awt.Color(255, 255, 255));
		jTextScore3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextScore3.setForeground(new java.awt.Color(204, 0, 51));
		jTextScore3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextScore3ActionPerformed(evt);
			}
		});

		jTextScore4.setBackground(new java.awt.Color(255, 255, 255));
		jTextScore4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextScore4.setForeground(new java.awt.Color(204, 0, 51));
		jTextScore4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextScore4ActionPerformed(evt);
			}
		});

		jTextScore1.setBackground(new java.awt.Color(255, 255, 255));
		jTextScore1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextScore1.setForeground(new java.awt.Color(204, 0, 51));
		jTextScore1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextScore1ActionPerformed(evt);
			}
		});

		jTextScore5.setBackground(new java.awt.Color(255, 255, 255));
		jTextScore5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextScore5.setForeground(new java.awt.Color(204, 0, 51));
		jTextScore5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextScore5ActionPerformed(evt);
			}
		});

		jTextScore6.setBackground(new java.awt.Color(255, 255, 255));
		jTextScore6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextScore6.setForeground(new java.awt.Color(204, 0, 51));
		jTextScore6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextScore6ActionPerformed(evt);
			}
		});

		jTextField10.setEditable(false);
		jTextField10.setBackground(new java.awt.Color(204, 204, 204));
		jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

		jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel18.setForeground(new java.awt.Color(0, 0, 0));
		jLabel18.setText("Trường");

		jPanel22.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
		jPanel22.setLayout(jPanel22Layout);
		jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		jPanel23.setBackground(new java.awt.Color(255, 255, 255));
		jPanel23.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(51, 153, 153), new Color(0, 51, 102), new Color(0, 51, 102), new Color(0, 153, 204)));

		jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextField8.setForeground(new java.awt.Color(0, 0, 0));
		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField8ActionPerformed(evt);
			}
		});
		jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField8KeyTyped(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(0, 0, 0));
		jLabel12.setText("Điền mã thí sinh cần nhập điểm vào đây");

		jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
		jButton8.setForeground(new Color(255, 255, 255));
		jButton8.setText("OK");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
		jPanel23Layout.setHorizontalGroup(jPanel23Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel23Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel23Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel12)
						.addGroup(jPanel23Layout.createSequentialGroup().addComponent(jTextField8, 297, 297, 297)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jButton8)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel23Layout.setVerticalGroup(jPanel23Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel23Layout.createSequentialGroup().addContainerGap().addComponent(jLabel12)
						.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel23Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		jPanel23.setLayout(jPanel23Layout);

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel9Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel9Layout.createSequentialGroup()
								.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(jTextField10, 262, 262, 262))
						.addGroup(jPanel9Layout.createSequentialGroup().addGroup(jPanel9Layout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel9Layout.createSequentialGroup()
										.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 89,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel9Layout.createParallelGroup(Alignment.TRAILING)
														.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 89,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel16, Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE, 89,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 89,
														GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jTextSubject5, GroupLayout.PREFERRED_SIZE, 115,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextSubject6, GroupLayout.PREFERRED_SIZE, 115,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextSubject4, GroupLayout.PREFERRED_SIZE, 115,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextSubject3, GroupLayout.PREFERRED_SIZE, 115,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel9Layout.createSequentialGroup()
										.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 89,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(jTextSubject1, GroupLayout.PREFERRED_SIZE, 115,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel9Layout.createSequentialGroup()
										.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 89,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(jTextSubject2, GroupLayout.PREFERRED_SIZE, 115,
												GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(jTextScore4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore5, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE))
								.addGap(31))
						.addGroup(jPanel9Layout.createSequentialGroup().addGap(109).addComponent(jTextField9, 260, 260,
								260))
						.addGroup(jPanel9Layout.createSequentialGroup()
								.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 287, GroupLayout.PREFERRED_SIZE))
						.addComponent(jPanel23, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel22, GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE).addContainerGap()));
		jPanel9Layout
				.setVerticalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jPanel23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jPanel22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(48)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel13))
								.addGap(18)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel18))
								.addGap(18)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel14)
										.addComponent(jTextSubject1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel15)
										.addComponent(jTextSubject2, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel16)
										.addComponent(jTextSubject3, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel17)
										.addComponent(jTextSubject4, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextScore4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(21)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTextSubject5, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel19).addComponent(jTextScore5, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTextSubject6, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel21).addComponent(jTextScore6, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(38, Short.MAX_VALUE)));
		jPanel9.setLayout(jPanel9Layout);

		jPanel11.setBackground(new Color(51, 102, 153));
		jPanel11.setBorder(UIManager.getBorder("DesktopIcon.border"));

		jPanel12.setBackground(new Color(0, 153, 153));
		jPanel12.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(153, 204, 153), null, null, new Color(0, 102, 102)));

		jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jLabel22.setForeground(new java.awt.Color(0, 0, 0));
		jLabel22.setText("Tìm kiếm ");

		searchField2.setBackground(new java.awt.Color(255, 255, 255));
		searchField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

		jButton12.setBackground(new Color(153, 204, 204));
		jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton12.setForeground(new Color(0, 0, 0));
		jButton12.setText("Tìm");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		Refresh1.setBackground(new Color(153, 204, 153));
		Refresh1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		Refresh1.setForeground(new Color(0, 0, 0));
		Refresh1.setText("Tải lại danh sách");
		Refresh1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Refresh1ActionPerformed(evt);
			}
		});
		jButton11 = new javax.swing.JButton();

		jButton11.setBackground(new Color(255, 0, 102));
		jButton11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jButton11.setForeground(new Color(255, 255, 255));
		jButton11.setText("Đăng xuất");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addGap(16).addComponent(jLabel22)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(searchField2, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(jButton12).addGap(18)
						.addComponent(Refresh1).addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
						.addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel12Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel22, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
								.addComponent(searchField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton12).addComponent(Refresh1)
								.addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		jPanel12.setLayout(jPanel12Layout);

		
		jPanel13.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));

		jBang2.setBackground(new java.awt.Color(255, 255, 255));
		jBang2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
		jBang2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
		jBang2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1", "Môn 2", "Điểm 2", "Môn 3", "Điểm 3", "Môn 4",
				"Điểm 4", "Môn 5", "Điểm 5", "Môn 6", "Điểm 6" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false, false, false, true, true,
					true, true, true, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jBang2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jBang2MouseClicked(evt);
			}
		});
		jScrollPane3.setViewportView(jBang2);

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13Layout.setHorizontalGroup(
			jPanel13Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel13Layout.setVerticalGroup(
			jPanel13Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel13.setLayout(jPanel13Layout);

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel11Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap()));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel20.setBackground(new Color(51, 102, 153));
		jPanel20.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 204, 255), null, null, new Color(255, 255, 255)));

		jButton7.setBackground(new Color(153, 204, 153));
		jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton7.setForeground(new Color(0, 0, 0));
		jButton7.setText("Thêm");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new Color(153, 204, 153));
		jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton9.setForeground(new Color(0, 0, 0));
		jButton9.setText("Xóa");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new Color(204, 204, 204));
		jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton10.setForeground(new Color(0, 0, 0));
		jButton10.setText("In");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton14.setBackground(new Color(153, 204, 204));
		jButton14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton14.setForeground(new Color(0, 0, 0));
		jButton14.setText("Làm mới");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setBackground(new Color(153, 204, 153));
		jButton15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton15.setForeground(new Color(0, 0, 0));
		jButton15.setText("Sửa");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
		jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel20Layout
				.createSequentialGroup().addGap(35)
				.addGroup(jPanel20Layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(jButton10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jButton14, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, jPanel20Layout.createSequentialGroup()
								.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
				.addGap(50)));
		jPanel20Layout.setVerticalGroup(jPanel20Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel20Layout.createSequentialGroup().addContainerGap(13, Short.MAX_VALUE)
						.addGroup(jPanel20Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGap(56)));
		jPanel20.setLayout(jPanel20Layout);

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8Layout.setHorizontalGroup(
			jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, 409, Short.MAX_VALUE)
						.addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel8Layout.setVerticalGroup(
			jPanel8Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel8Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
						.addGroup(jPanel8Layout.createSequentialGroup()
							.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		jPanel8.setLayout(jPanel8Layout);

		jTabbedPane2.addTab("Điểm", jPanel8);

		jPanel14.setBackground(new Color(0, 51, 102));

		jPanel15.setBackground(new java.awt.Color(255, 255, 255));
		jPanel15.setBorder(UIManager.getBorder("DesktopIcon.border"));

		jComboBox7.setBackground(new java.awt.Color(255, 255, 255));
		jComboBox7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jComboBox7.setForeground(new java.awt.Color(0, 0, 0));
		jComboBox7.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "A00 (Toán, Lý, Hóa)", "A01 (Toán, Lý, Anh)",
						"A02 (Toán, Lý, Sinh)", "B00 (Toán, Hóa, Sinh)", "C00 (Văn, Sử, Địa)", "C03 (Toán, Văn, Sử)",
						"C04 (Toán, Văn, Địa)", "C14 (Toán, Văn, GDCD)", "C19 (Văn, Sử, GDCD)", "C20 (Văn, Địa, GDCD)",
						"D01 (Toán, Văn, Anh)", "D07 (Toán, Hóa, Anh)", "D08 (Toán, Sinh, Anh)", "D09 (Toán, Sử, Anh)",
						"D10 (Toán, Địa, Anh)", "D14 (Văn, Sử, Anh)", "D15 (Văn, Địa, Anh)", " ", " " }));

		jTextField19.setBackground(new java.awt.Color(255, 255, 255));
		jTextField19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jTextField19.setForeground(new java.awt.Color(0, 0, 0));
		jTextField19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField19ActionPerformed(evt);
			}
		});
		jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jTextField19KeyTyped(evt);
			}
		});

		jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel26.setForeground(new java.awt.Color(0, 0, 0));
		jLabel26.setText("Tổ hợp môn");

		jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
		jLabel30.setForeground(new java.awt.Color(0, 0, 0));
		jLabel30.setText("Mức điểm");

		jButton16.setBackground(new Color(0, 204, 255));
		jButton16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton16.setForeground(new Color(0, 0, 0));
		jButton16.setText("In");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton19.setBackground(new Color(102, 204, 153));
		jButton19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton19.setForeground(new Color(0, 0, 0));
		jButton19.setText("Tra cứu");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
		jPanel15Layout.setHorizontalGroup(
			jPanel15Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel15Layout.createSequentialGroup()
							.addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(jPanel15Layout.createSequentialGroup()
							.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(jButton19, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton16, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jComboBox7, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jTextField19, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		jPanel15Layout.setVerticalGroup(
			jPanel15Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup()
					.addGap(85)
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel26)
						.addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(jPanel15Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jTextField19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel30))
					.addGap(29)
					.addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(493, Short.MAX_VALUE))
		);
		jPanel15.setLayout(jPanel15Layout);

		jPanel17.setBackground(new Color(51, 102, 153));
		jPanel17.setBorder(UIManager.getBorder("DesktopIcon.border"));

		jPanel18.setBackground(new Color(0, 153, 153));
		jPanel18.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(153, 204, 153), null, null, new Color(0, 153, 102)));

		jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jLabel33.setForeground(new java.awt.Color(0, 0, 0));
		jLabel33.setText("Tìm kiếm ");

		searchField3.setBackground(new java.awt.Color(255, 255, 255));
		searchField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		searchField3.setForeground(new java.awt.Color(0, 0, 0));
		searchField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchField3ActionPerformed(evt);
			}
		});

		jButton18.setBackground(new Color(153, 204, 204));
		jButton18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		jButton18.setForeground(new Color(0, 0, 0));
		jButton18.setText("Tìm");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		Refresh2.setBackground(new Color(153, 204, 153));
		Refresh2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		Refresh2.setForeground(new Color(0, 0, 0));
		Refresh2.setText("Tải lại danh sách");
		Refresh2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Refresh2ActionPerformed(evt);
			}
		});
		jButton17 = new javax.swing.JButton();

		jButton17.setBackground(new Color(255, 0, 102));
		jButton17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
		jButton17.setForeground(new Color(255, 255, 255));
		jButton17.setText("Đăng xuất");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
		jPanel18Layout.setHorizontalGroup(
			jPanel18Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel18Layout.createSequentialGroup()
					.addGap(16)
					.addComponent(jLabel33)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(searchField3, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jButton18)
					.addGap(18)
					.addComponent(Refresh2)
					.addPreferredGap(ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
					.addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jPanel18Layout.setVerticalGroup(
			jPanel18Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel18Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel18Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel33, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addComponent(searchField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton18)
						.addComponent(Refresh2))
					.addContainerGap())
		);
		jPanel18.setLayout(jPanel18Layout);

		jPanel19.setBackground(new Color(0, 153, 153));
		jPanel19.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));

		jBang3.setBackground(new java.awt.Color(255, 255, 255));
		jBang3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
		jBang3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
		jBang3.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1", "Môn 2", "Điểm 2", "Môn 3", "Điểm 3",
				"Tổng điểm" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jBang3.setPreferredSize(new java.awt.Dimension(1500, 864));
		jScrollPane4.setViewportView(jBang3);

		javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
		jPanel19.setLayout(jPanel19Layout);
		jPanel19Layout.setHorizontalGroup(
				jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane4).addContainerGap()));
		jPanel19Layout.setVerticalGroup(
				jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel19Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane4).addContainerGap()));

		javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
		jPanel17.setLayout(jPanel17Layout);
		jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel17Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap()));
		jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel17Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
		jPanel14Layout.setHorizontalGroup(
			jPanel14Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel17, GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel14Layout.setVerticalGroup(
			jPanel14Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel14Layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(jPanel15, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(jPanel17, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		jPanel14.setLayout(jPanel14Layout);

		jTabbedPane2.addTab("Tra cứu điểm", jPanel14);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap().addComponent(jTabbedPane2).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public void init() {
		tableViewStudent();
		tableViewScore();
		tableMarkScore();
	}

	private void tableViewStudent() {
		student.getStudentValue(jBang1, "");
		model = (DefaultTableModel) jBang1.getModel();
		jBang1.setRowHeight(30);
		jBang1.setShowGrid(true);
		jBang1.setGridColor(Color.gray);
		jBang1.setBackground(Color.white);
	}

	private void tableViewScore() {
		score.getScoreValue(jBang2, "");
		model = (DefaultTableModel) jBang2.getModel();
		jBang2.setRowHeight(30);
		jBang2.setShowGrid(true);
		jBang2.setGridColor(Color.gray);
		jBang2.setBackground(Color.white);
	}

	private void tableMarkScore() {
		model = (DefaultTableModel) jBang3.getModel();
		jBang3.setRowHeight(30);
		jBang3.setShowGrid(true);
		jBang3.setGridColor(Color.gray);
		jBang3.setBackground(Color.white);
	}

	private void clearStudent() {
		jTextField1.setText(null);
		jTextField2.setText(null);
		jTextField3.setText(null);
		jTextField4.setText(null);
		jTextField5.setText(null);
		jTextField6.setText(null);
		searchField.setText(null);
		jComboBox1.setSelectedIndex(0);
		jComboBox2.setSelectedIndex(0);
		jComboBox3.setSelectedIndex(0);
		jDateChooser1.setDate(null);
		jBang1.clearSelection();
	}

	private void clearScore() {
		jTextField8.setText(null);
		jTextField9.setText(null);
		jTextField10.setText(null);
		jTextSubject1.setText(null);
		jTextSubject2.setText(null);
		jTextSubject3.setText(null);
		jTextSubject4.setText(null);
		jTextSubject5.setText(null);
		jTextSubject6.setText(null);
		searchField2.setText(null);
		jTextScore1.setText(null);
		jTextScore2.setText(null);
		jTextScore3.setText(null);
		jTextScore4.setText(null);
		jTextScore5.setText(null);
		jTextScore6.setText(null);
		jBang2.clearSelection();
	}

	public boolean isEmptyStudent() {
		if (jTextField1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nhập thiếu thông tin mã thí sinh");
			return false;
		}

		if (jTextField1.getText().length() != 8) {
			JOptionPane.showMessageDialog(this, "Mã thí sinh không hợp lệ");
			return false;
		}

		if (jTextField2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nhập thiếu thông tin tên thí sinh");
			return false;
		}

		if (jDateChooser1.getDate() == null) {
			JOptionPane.showMessageDialog(this, "Nhập thiếu ngày tháng năm sinh");
			return false;
		}

		if (jDateChooser1.getDate().compareTo(new Date()) > 0) {
			JOptionPane.showMessageDialog(this, "Thông tin ngày sinh không hợp lí");
			return false;
		}

		if (jTextField3.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nhập thiếu thông tin email");
			return false;
		}

		if (!jTextField3.getText().matches("^.+@.+\\..+$")) {
			JOptionPane.showMessageDialog(this, "Địa chỉ email không tồn tại");
			return false;
		}

		if (jTextField4.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nhập thiếu thông tin số điện thoại");
			return false;
		}

		if (jTextField4.getText().length() != 10 || jTextField4.getText().charAt(0) != '0') {
			JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ");
			return false;
		}

		if (jTextField5.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nhập thiếu thông tin địa chỉ");
			return false;
		}

		if (jTextField6.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nhập thiếu thông tin tên trường");
			return false;
		}
		return true;
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton17ActionPerformed
		int a = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất ?", "Chọn", JOptionPane.YES_NO_OPTION);
		if (a == 0) {
			new Login().setVisible(true);
			this.dispose();
		}
	}// GEN-LAST:event_jButton17ActionPerformed

	private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField19ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField19ActionPerformed

	private void jTextScore6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextScore6ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextScore6ActionPerformed

	private void jTextScore5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextScore5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextScore5ActionPerformed

	private void jTextScore1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextScore1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextScore1ActionPerformed

	private void jTextScore4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextScore4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextScore4ActionPerformed

	private void jTextScore3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextScore3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextScore3ActionPerformed

	private void jTextScore2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextScore2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextScore2ActionPerformed

	private void jTextSubject4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextSubject4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextSubject4ActionPerformed

	private void jTextSubject3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextSubject3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextSubject3ActionPerformed

	private void jTextSubject5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextSubject5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextSubject5ActionPerformed

	private void jTextSubject6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextSubject6ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextSubject6ActionPerformed

	private void jTextSubject2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextSubject2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextSubject2ActionPerformed

	private void jTextSubject1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextSubject1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextSubject1ActionPerformed

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton11ActionPerformed
		int a = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất ?", "Chọn", JOptionPane.YES_NO_OPTION);
		if (a == 0) {
			new Login().setVisible(true);
			this.dispose();
		}
	}// GEN-LAST:event_jButton11ActionPerformed

	private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField8ActionPerformed

	}// GEN-LAST:event_jTextField8ActionPerformed

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField6ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField6ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		clearStudent();
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		if (isEmptyStudent()) {
			String input = jTextField1.getText();
			int id = Integer.parseInt(input);
			if (student.isIdExist(id)) {
				student.delete(id);
				jBang1.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Ngày sinh",
						"Giới tính", "Email", "Số điện thoại", "Quê quán", "Địa chỉ", "Trường", "Ban thi" }));
				student.getStudentValue(jBang1, "");
				jBang2.setModel(new DefaultTableModel(null,
						new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1", "Môn 2", "Điểm 2", "Môn 3",
								"Điểm 3", "Môn 4", "Điểm 4", "Môn 5", "Điểm 5", "Môn 6", "Điểm 6" }));
				score.getScoreValue(jBang2, "");
				clearStudent();
			} else {
				JOptionPane.showMessageDialog(this, "Mã thí sinh không tồn tại");
			}
		}

	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		if (isEmptyStudent()) {
			String input = jTextField1.getText();
			int id = Integer.parseInt(input);
			if (student.isIdExist(id)) {
				if (!check()) {
					String name = jTextField2.getText();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String date = dateFormat.format(jDateChooser1.getDate());
					String gender = jComboBox1.getSelectedItem().toString();
					String email = jTextField3.getText();
					String phone = jTextField4.getText();
					String hometown = jComboBox2.getSelectedItem().toString();
					String address = jTextField5.getText();
					String school = jTextField6.getText();
					String test = jComboBox3.getSelectedItem().toString();
					student.update(id, name, date, gender, email, phone, hometown, address, school, test);
					subject.update(id, name, test);
					jBang1.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Ngày sinh",
							"Giới tính", "Email", "Số điện thoại", "Quê quán", "Địa chỉ", "Trường", "Ban thi" }));
					student.getStudentValue(jBang1, "");
					clearStudent();
				}

			} else {
				JOptionPane.showMessageDialog(this, "Mã thí sinh không tồn tại");
			}
		}
	}// GEN-LAST:event_jButton3ActionPerformed

	public boolean check() {
		String newEmail = jTextField3.getText();
		String newPhone = jTextField4.getText();
		String oldEmail = model.getValueAt(rowIndex, 4).toString();
		String oldPhone = model.getValueAt(rowIndex, 5).toString();
		String oldId = model.getValueAt(rowIndex, 0).toString();
		String newId = jTextField1.getText();
		if (newEmail.equals(oldEmail) && newPhone.equals(oldPhone) && newId.equals(oldId)) {
			return false;
		} else {
			if (!newId.equals(oldId)) {
				boolean x = student.isIdExist(newId);
				if (x) {
					JOptionPane.showMessageDialog(this, "Mã thí sinh này đã tồn tại");
					return x;
				} else {
					if (!newEmail.equals(oldEmail)) {
						boolean y = student.isEmailExist(newEmail);
						if (y) {
							JOptionPane.showMessageDialog(this, "Dia chi email này đã tồn tại");
							return y;
						} else {
							if (!newPhone.equals(oldPhone)) {
								boolean z = student.isPhoneExist(newPhone);
								if (z) {
									JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại");
									return z;
								}
							}
						}
					}
				}
			} else {
				if (!newEmail.equals(oldEmail)) {
					boolean y = student.isEmailExist(newEmail);
					if (y) {
						JOptionPane.showMessageDialog(this, "Dia chi email này đã tồn tại");
						return y;
					} else {
						if (!newPhone.equals(oldPhone)) {
							boolean z = student.isPhoneExist(newPhone);
							if (z) {
								JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại");
								return z;
							}
						}
					}
				} else {
					if (!newPhone.equals(oldPhone)) {
						boolean z = student.isPhoneExist(newPhone);
						if (z) {
							JOptionPane.showMessageDialog(this, "Số điện thoại này đã tồn tại");
							return z;
						}
					}
				}
			}
		}
		return false;
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		if (isEmptyStudent()) {
			if (!student.isEmailExist(jTextField3.getText())) {
				if (!student.isPhoneExist(jTextField4.getText())) {
					if (!student.isIdExist(jTextField1.getText())) {
						String input = jTextField1.getText();
						int id = Integer.parseInt(input);
						String name = jTextField2.getText();
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						String date = dateFormat.format(jDateChooser1.getDate());
						String gender = jComboBox1.getSelectedItem().toString();
						String email = jTextField3.getText();
						String phone = jTextField4.getText();
						String hometown = jComboBox2.getSelectedItem().toString();
						String address = jTextField5.getText();
						String school = jTextField6.getText();
						String test = jComboBox3.getSelectedItem().toString();
						student.insert(id, name, date, gender, email, phone, hometown, address, school, test);
						subject.insert(id, name, test);
						jBang1.setModel(new DefaultTableModel(null,
								new Object[] { "Mã thí sinh", "Họ và tên", "Ngày sinh", "Giới tính", "Email",
										"Số điện thoại", "Quê quán", "Địa chỉ", "Trường", "Ban thi" }));
						student.getStudentValue(jBang1, "");
						clearStudent();
					} else {
						JOptionPane.showMessageDialog(this, "Mã thí sinh này đã được đăng ký");
					}
				} else {
					JOptionPane.showMessageDialog(this, "Số điện thoại này đã được đăng ký");
				}
			} else {
				JOptionPane.showMessageDialog(this, "Địa chỉ email này đã được đăng ký");
			}

		}
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField5ActionPerformed

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed

		if (!jTextField9.getText().isEmpty()) {
			String name = jTextField9.getText();
			int id = Integer.parseInt(score.insertId(name));
			if (!score.isNameExist(name)) {
				if (isNumeric(jTextScore1.getText()) && isNumeric(jTextScore2.getText())
						&& isNumeric(jTextScore3.getText()) && isNumeric(jTextScore4.getText())
						&& isNumeric(jTextScore5.getText()) && isNumeric(jTextScore6.getText())) {

					String subject1 = jTextSubject1.getText();
					String subject2 = jTextSubject2.getText();
					String subject3 = jTextSubject3.getText();
					String subject4 = jTextSubject4.getText();
					String subject5 = jTextSubject5.getText();
					String subject6 = jTextSubject6.getText();
					double score1 = Double.parseDouble(jTextScore1.getText());
					double score2 = Double.parseDouble(jTextScore2.getText());
					double score3 = Double.parseDouble(jTextScore3.getText());
					double score4 = Double.parseDouble(jTextScore4.getText());
					double score5 = Double.parseDouble(jTextScore5.getText());
					double score6 = Double.parseDouble(jTextScore6.getText());
					nf.setMaximumFractionDigits(2);
					score.insert(id, name, subject1, subject2, subject3, subject4, subject5, subject6, score1, score2,
							score3, score4, score5, score6);
					jBang2.setModel(new DefaultTableModel(null,
							new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1", "Môn 2", "Điểm 2", "Môn 3",
									"Điểm 3", "Môn 4", "Điểm 4", "Môn 5", "Điểm 5", "Môn 6", "Điểm 6" }));
					score.getScoreValue(jBang2, "");
					clearScore();
				}
			} else {
				JOptionPane.showMessageDialog(this, "Bạn đã nhập điểm cho thí sinh này");
			}

		} else {
			JOptionPane.showMessageDialog(this, "Chưa có dữ liệu của thí sinh");
		}

	}// GEN-LAST:event_jButton7ActionPerformed

	private boolean isNumeric(String s) {
		try {
			double d = Double.parseDouble(s);
			if (d >= 0 && d <= 10) {
				return true;
			} else {
				JOptionPane.showMessageDialog(this, "Hãy nhập giá trị từ 0 đến 10");
				return false;
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return false;
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
		if (!jTextField9.getText().isEmpty()) {
			String name = jTextField9.getText();
			int id = Integer.parseInt(score.insertId(name));
			if (score.isNameExist(name)) {
				score.delete(id);
				jBang2.setModel(new DefaultTableModel(null,
						new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1", "Môn 2", "Điểm 2", "Môn 3",
								"Điểm 3", "Môn 4", "Điểm 4", "Môn 5", "Điểm 5", "Môn 6", "Điểm 6" }));
				score.getScoreValue(jBang2, "");
				clearScore();
			} else {
				JOptionPane.showMessageDialog(this, "Bạn chưa từng nhập điểm cho thí sinh này");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Chưa có dữ liệu của thí sinh cần xóa điểm");
		}

	}// GEN-LAST:event_jButton9ActionPerformed

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
		Font customFont = FontFactory.getFont("Arial Unicode MS", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 12);

		exportTableToPDF(jBang2, customFont);
	}// GEN-LAST:event_jButton10ActionPerformed

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBox2ActionPerformed

	private void exportTableToPDF(JTable table, Font font) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");

		int userSelection = fileChooser.showSaveDialog(null);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();

			try (FileOutputStream fos = new FileOutputStream(fileToSave + ".pdf")) {
				Document document = new Document(PageSize.A4.rotate());
				PdfWriter.getInstance(document, fos);
				document.open();

				PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
				addTableHeader(pdfTable, table, font);
				addRows(pdfTable, table, font);

				document.add(pdfTable);
				document.close();
				JOptionPane.showMessageDialog(null, "PDF file has been created successfully!");
			} catch (DocumentException | IOException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error while exporting to PDF");
			}
		}
	}

	private static void addTableHeader(PdfPTable pdfTable, JTable table, Font font) {
		for (int column = 0; column < table.getColumnCount(); column++) {
			PdfPCell cell = new PdfPCell(new Phrase(table.getColumnName(column), font));
			pdfTable.addCell(cell);
		}
	}

	private static void addRows(PdfPTable pdfTable, JTable table, Font font) {
		for (int row = 0; row < table.getRowCount(); row++) {
			for (int column = 0; column < table.getColumnCount(); column++) {
				PdfPCell cell = new PdfPCell(new Phrase(table.getValueAt(row, column).toString(), font));
				pdfTable.addCell(cell);
			}
		}
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton13ActionPerformed
		String path = "";
		JFileChooser j = new JFileChooser();
		j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int x = j.showSaveDialog(this);
		if (x == JFileChooser.APPROVE_OPTION) {
			path = j.getSelectedFile().getPath();
		}
		Document doc = new Document();
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(path + "Haha.pdf"));
			doc.open();
			PdfPTable tbl = new PdfPTable(10);
			tbl.addCell("Mã thí sinh");
			tbl.addCell("Họ và tên");
			tbl.addCell("Ngày sinh");
			tbl.addCell("Giới tính");
			tbl.addCell("Email");
			tbl.addCell("Số điện thoại");
			tbl.addCell("Quê quán");
			tbl.addCell("Địa chỉ");
			tbl.addCell("Trường");
			tbl.addCell("Ban thi");
			for (int i = 0; i < jBang1.getRowCount(); i++) {
				String s1 = jBang1.getValueAt(i, 0).toString();
				String s2 = jBang1.getValueAt(i, 1).toString();
				String s3 = jBang1.getValueAt(i, 2).toString();
				String s4 = jBang1.getValueAt(i, 3).toString();
				String s5 = jBang1.getValueAt(i, 4).toString();
				String s6 = jBang1.getValueAt(i, 5).toString();
				String s7 = jBang1.getValueAt(i, 6).toString();
				String s8 = jBang1.getValueAt(i, 7).toString();
				String s9 = jBang1.getValueAt(i, 8).toString();
				String s10 = jBang1.getValueAt(i, 9).toString();
				tbl.addCell(s1);
				tbl.addCell(s2);
				tbl.addCell(s3);
				tbl.addCell(s4);
				tbl.addCell(s5);
				tbl.addCell(s6);
				tbl.addCell(s7);
				tbl.addCell(s8);
				tbl.addCell(s9);
				tbl.addCell(s10);
			}
			doc.add(tbl);
			JOptionPane.showMessageDialog(null, "In danh sách thành công");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Có lỗi ở đâu đó");
		}
		doc.close();
	}// GEN-LAST:event_jButton13ActionPerformed

	private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField4KeyTyped
		if (!Character.isDigit(evt.getKeyChar())) {
			evt.consume();
		}
	}// GEN-LAST:event_jTextField4KeyTyped

	private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyTyped
		if (!Character.isDigit(evt.getKeyChar())) {
			evt.consume();
		}
	}// GEN-LAST:event_jTextField1KeyTyped

	private void jBang1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBang1MouseClicked
		model = (DefaultTableModel) jBang1.getModel();
		rowIndex = jBang1.getSelectedRow();
		jTextField1.setText(model.getValueAt(rowIndex, 0).toString());
		jTextField2.setText(model.getValueAt(rowIndex, 1).toString());

		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 2).toString());
			jDateChooser1.setDate(date);
		} catch (ParseException ex) {
			Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
		}
		String gender = model.getValueAt(rowIndex, 3).toString();
		if (gender.equals("Nam")) {
			jComboBox1.setSelectedIndex(0);
		} else {
			jComboBox1.setSelectedIndex(1);
		}
		jTextField3.setText(model.getValueAt(rowIndex, 4).toString());
		jTextField4.setText(model.getValueAt(rowIndex, 5).toString());

		String hometown = model.getValueAt(rowIndex, 6).toString();
		for (int i = 0; i < jComboBox2.getItemCount(); i++) {
			if (hometown.equals(jComboBox2.getItemAt(i))) {
				jComboBox2.setSelectedIndex(i);
				break;
			}
		}

		jTextField5.setText(model.getValueAt(rowIndex, 7).toString());
		jTextField6.setText(model.getValueAt(rowIndex, 8).toString());

		String test = model.getValueAt(rowIndex, 9).toString();
		if (test.equals("Tự nhiên")) {
			jComboBox3.setSelectedIndex(0);
		} else {
			jComboBox3.setSelectedIndex(1);
		}
	}// GEN-LAST:event_jBang1MouseClicked

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if (searchField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ô tìm kiếm bị trống");
		} else {
			jBang1.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Ngày sinh",
					"Giới tính", "Email", "Số điện thoại", "Quê quán", "Địa chỉ", "Trường", "Ban thi" }));
			student.getStudentValue(jBang1, searchField.getText());
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RefreshActionPerformed
		jBang1.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Ngày sinh", "Giới tính",
				"Email", "Số điện thoại", "Quê quán", "Địa chỉ", "Trường", "Ban thi" }));
		student.getStudentValue(jBang1, "");
		searchField.setText(null);
	}// GEN-LAST:event_RefreshActionPerformed

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
		if (jTextField8.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Hãy điền mã thí sinh cần nhập điểm");
		} else {
			int id = Integer.parseInt(jTextField8.getText());
			score.getDetails(id);
		}
	}// GEN-LAST:event_jButton8ActionPerformed

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton14ActionPerformed
		clearScore();
	}// GEN-LAST:event_jButton14ActionPerformed

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton12ActionPerformed
		if (searchField2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ô tìm kiếm bị trống");
		} else {
			jBang2.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1",
					"Môn 2", "Điểm 2", "Môn 3", "Điểm 3", "Môn 4", "Điểm 4", "Môn 5", "Điểm 5", "Môn 6", "Điểm 6" }));
			score.getScoreValue(jBang2, searchField2.getText());
		}
	}// GEN-LAST:event_jButton12ActionPerformed

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton15ActionPerformed
		if (!jTextField9.getText().isEmpty()) {
			String name = jTextField9.getText();
			int id = Integer.parseInt(score.insertId(name));
			if (score.isNameExist(name)) {
				if (isNumeric(jTextScore1.getText()) && isNumeric(jTextScore2.getText())
						&& isNumeric(jTextScore3.getText()) && isNumeric(jTextScore4.getText())
						&& isNumeric(jTextScore5.getText()) && isNumeric(jTextScore6.getText())) {
					double score1 = Double.parseDouble(jTextScore1.getText());
					double score2 = Double.parseDouble(jTextScore2.getText());
					double score3 = Double.parseDouble(jTextScore3.getText());
					double score4 = Double.parseDouble(jTextScore4.getText());
					double score5 = Double.parseDouble(jTextScore5.getText());
					double score6 = Double.parseDouble(jTextScore6.getText());
					nf.setMaximumFractionDigits(2);
					score.update(id, score1, score2, score3, score4, score5, score6);
					jBang2.setModel(new DefaultTableModel(null,
							new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1", "Môn 2", "Điểm 2", "Môn 3",
									"Điểm 3", "Môn 4", "Điểm 4", "Môn 5", "Điểm 5", "Môn 6", "Điểm 6" }));
					score.getScoreValue(jBang2, "");
					clearScore();
				}
			} else {
				JOptionPane.showMessageDialog(this, "Bạn chưa từng nhập điểm cho thí sinh này");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Chưa có dữ liệu của thí sinh cần sửa điểm");
		}

	}// GEN-LAST:event_jButton15ActionPerformed

	private void jBang2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBang2MouseClicked
		model = (DefaultTableModel) jBang2.getModel();
		rowIndex = jBang2.getSelectedRow();
		jTextField9.setText(model.getValueAt(rowIndex, 1).toString());
		score.getDetail2(jTextField9.getText());

		jTextSubject1.setText(model.getValueAt(rowIndex, 2).toString());
		jTextSubject2.setText(model.getValueAt(rowIndex, 4).toString());
		jTextSubject3.setText(model.getValueAt(rowIndex, 6).toString());
		jTextSubject4.setText(model.getValueAt(rowIndex, 8).toString());
		jTextSubject5.setText(model.getValueAt(rowIndex, 10).toString());
		jTextSubject6.setText(model.getValueAt(rowIndex, 12).toString());

		jTextScore1.setText(model.getValueAt(rowIndex, 3).toString());
		jTextScore2.setText(model.getValueAt(rowIndex, 5).toString());
		jTextScore3.setText(model.getValueAt(rowIndex, 7).toString());
		jTextScore4.setText(model.getValueAt(rowIndex, 9).toString());
		jTextScore5.setText(model.getValueAt(rowIndex, 11).toString());
		jTextScore6.setText(model.getValueAt(rowIndex, 13).toString());
	}// GEN-LAST:event_jBang2MouseClicked

	private void Refresh1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Refresh1ActionPerformed
		jBang2.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1",
				"Môn 2", "Điểm 2", "Môn 3", "Điểm 3", "Môn 4", "Điểm 4", "Môn 5", "Điểm 5", "Môn 6", "Điểm 6" }));
		score.getScoreValue(jBang2, "");
		searchField2.setText(null);
	}// GEN-LAST:event_Refresh1ActionPerformed

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton16ActionPerformed
		Font customFont = FontFactory.getFont("Arial Unicode MS", BaseFont.IDENTITY_H, BaseFont.EMBEDDED, 12);

		exportTableToPDF(jBang3, customFont);
	}// GEN-LAST:event_jButton16ActionPerformed

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton19ActionPerformed
		jBang3.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1",
				"Môn 2", "Điểm 2", "Môn 3", "Điểm 3", "Tổng điểm" }));
		mark.getMarksSheet(jBang3, jComboBox7.getSelectedItem().toString().substring(0, 3));
		searchField3.setText(null);

		if (!jTextField19.getText().isEmpty()) {
			double a = Double.parseDouble(jTextField19.getText());
			// Lưu trữ dữ liệu hiện tại của bảng
			DefaultTableModel currentModel = (DefaultTableModel) jBang3.getModel();

			DefaultTableModel newModel = new DefaultTableModel(new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1",
					"Điểm 1", "Môn 2", "Điểm 2", "Môn 3", "Điểm 3", "Tổng điểm" }, 0);

			for (int row = 0; row < currentModel.getRowCount(); row++) {
				double totalScore = 0;
				for (int col = 3; col < currentModel.getColumnCount(); col += 2) {
					totalScore += (double) currentModel.getValueAt(row, col);
				}

				if (totalScore >= a) {
					Object[] rowData = new Object[currentModel.getColumnCount()];
					for (int col = 0; col < currentModel.getColumnCount(); col++) {
						rowData[col] = currentModel.getValueAt(row, col);
					}
					newModel.addRow(rowData);
				}
			}

			jBang3.setModel(newModel);

		}
	}// GEN-LAST:event_jButton19ActionPerformed

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBox1ActionPerformed

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField4ActionPerformed

	private void jTextField19KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField19KeyTyped
		char ch = evt.getKeyChar();

		if (!Character.isDigit(ch) && ch != '.' || (ch == '.' && jTextField19.getText().contains("."))) {
			evt.consume();
		} else {

		}
	}// GEN-LAST:event_jTextField19KeyTyped

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField2ActionPerformed

	private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField2KeyTyped
		char ch = evt.getKeyChar();

		if (!(Character.isLetter(ch) || ch == ' ' || ch == KeyEvent.VK_BACK_SPACE)) {
			evt.consume();
		}

	}// GEN-LAST:event_jTextField2KeyTyped

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton18ActionPerformed
		if (searchField3.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ô tìm kiếm bị trống");
		} else {
			DefaultTableModel currentModel = (DefaultTableModel) jBang3.getModel();

			DefaultTableModel newModel = new DefaultTableModel(new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1",
					"Điểm 1", "Môn 2", "Điểm 2", "Môn 3", "Điểm 3", "Tổng điểm" }, 0);

			String searchText = searchField3.getText().toLowerCase(); // Convert search text to lowercase for
																		// case-insensitive comparison

			for (int row = 0; row < currentModel.getRowCount(); row++) {
				// Use String.valueOf() to handle possible null values
				String idAsString = String.valueOf(currentModel.getValueAt(row, 0));
				String hoTen = String.valueOf(currentModel.getValueAt(row, 1));

				try {
					// Try to parse the string to a numeric type (e.g., Integer or Double)
					double id = Double.parseDouble(idAsString);

					// Check if the parsed numeric id or hoTen contains the search text
					// (case-insensitive)
					if (id == Double.parseDouble(searchText) || hoTen.toLowerCase().contains(searchText)) {
						Object[] rowData = new Object[currentModel.getColumnCount()];
						for (int col = 0; col < currentModel.getColumnCount(); col++) {
							rowData[col] = currentModel.getValueAt(row, col);
						}
						newModel.addRow(rowData);
					}
				} catch (NumberFormatException e) {
					// Handle the case where parsing to a numeric type fails
				}
			}

			jBang3.setModel(newModel);

		}
	}// GEN-LAST:event_jButton18ActionPerformed

	private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextField8KeyTyped
		if (!Character.isDigit(evt.getKeyChar())) {
			evt.consume();
		}
	}// GEN-LAST:event_jTextField8KeyTyped

	private void Refresh2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Refresh2ActionPerformed
		jBang3.setModel(new DefaultTableModel(null, new Object[] { "Mã thí sinh", "Họ và tên", "Môn 1", "Điểm 1",
				"Môn 2", "Điểm 2", "Môn 3", "Điểm 3", "Tổng điểm" }));
	}// GEN-LAST:event_Refresh2ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		int a = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất ?", "Select", JOptionPane.YES_NO_OPTION);
		if (a == 0) {
			new Login().setVisible(true);
			this.dispose();
		}
	}// GEN-LAST:event_jButton6ActionPerformed

	private void searchField3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchField3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_searchField3ActionPerformed

	public Color color_1() {
		Color color_1 = Color.decode("#001C44");
		return color_1;
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Home().setVisible(true);
				
				
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Refresh;
	private javax.swing.JButton Refresh1;
	private javax.swing.JButton Refresh2;
	private javax.swing.JTable jBang1;
	private javax.swing.JTable jBang2;
	private javax.swing.JTable jBang3;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JComboBox<String> jComboBox3;
	private javax.swing.JComboBox<String> jComboBox7;
	private com.toedter.calendar.JDateChooser jDateChooser1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel15;
	private javax.swing.JPanel jPanel17;
	private javax.swing.JPanel jPanel18;
	private javax.swing.JPanel jPanel19;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel20;
	private javax.swing.JPanel jPanel21;
	private javax.swing.JPanel jPanel22;
	private javax.swing.JPanel jPanel23;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTextField jTextField1;
	public static javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField19;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField8;
	public static javax.swing.JTextField jTextField9;
	private javax.swing.JTextField jTextScore1;
	private javax.swing.JTextField jTextScore2;
	private javax.swing.JTextField jTextScore3;
	private javax.swing.JTextField jTextScore4;
	private javax.swing.JTextField jTextScore5;
	private javax.swing.JTextField jTextScore6;
	public static javax.swing.JTextField jTextSubject1;
	public static javax.swing.JTextField jTextSubject2;
	public static javax.swing.JTextField jTextSubject3;
	public static javax.swing.JTextField jTextSubject4;
	public static javax.swing.JTextField jTextSubject5;
	public static javax.swing.JTextField jTextSubject6;
	private javax.swing.JTextField searchField;
	private javax.swing.JTextField searchField2;
	private javax.swing.JTextField searchField3;
}
