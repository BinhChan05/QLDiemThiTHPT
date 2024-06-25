-- Tạo cơ sở dữ liệu
CREATE DATABASE IF NOT EXISTS StudentManagement;

-- Sử dụng cơ sở dữ liệu vừa tạo
USE StudentManagement;

-- Tạo bảng admin
CREATE TABLE IF NOT EXISTS admin (
    id int NOT NULL auto_increment PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(30) NOT NULL
);

-- Tạo bảng student
CREATE TABLE IF NOT EXISTS student (
    student_id INT(8) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender ENUM('Nam', 'Nữ') NOT NULL,
    email VARCHAR(75) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    hometown VARCHAR(100) NOT NULL,
    address VARCHAR(255) NOT NULL,
    school VARCHAR(100) NOT NULL,
    test ENUM('Tự nhiên', 'Xã hội') NOT NULL
);

-- Tạo bảng subject
CREATE TABLE IF NOT EXISTS subject (
    student_id INT(8) PRIMARY KEY,
    name VARCHAR(255) default NULL,
    sub1 VARCHAR(255) default NULL,
    sub2 VARCHAR(255) default NULL,
    sub3 VARCHAR(255) default NULL,
    sub4 VARCHAR(255) default NULL,
    sub5 VARCHAR(255) default NULL,
    sub6 VARCHAR(255) default NULL,
    CONSTRAINT subject_ibfk_1 FOREIGN KEY (student_id) REFERENCES student (student_id) ON DELETE CASCADE);


-- Tạo bảng score
CREATE TABLE IF NOT EXISTS score (
    student_id INT(8) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    sub1 VARCHAR(100) NOT NULL,
    score1 FLOAT NOT NULL,
    sub2 VARCHAR(100) NOT NULL,
    score2 FLOAT NOT NULL,
    sub3 VARCHAR(100) NOT NULL,
    score3 FLOAT NOT NULL,
    sub4 VARCHAR(100) NOT NULL,
    score4 FLOAT NOT NULL,
    sub5 VARCHAR(100) NOT NULL,
    score5 FLOAT NOT NULL,
    sub6 VARCHAR(100) NOT NULL,
    score6 FLOAT NOT NULL,
    CONSTRAINT subject_ibfk_2 FOREIGN KEY (student_id) REFERENCES student (student_id) ON DELETE CASCADE);

SHOW CREATE TABLE subject;

CREATE TABLE subcomb(
    cid VARCHAR(255) PRIMARY KEY,
    sub1 VARCHAR(255) NOT NULL,
    sub2 VARCHAR(255) NOT NULL,
    sub3 VARCHAR(255) NOT NULL,
    id1 INT NOT NULL,
    id2 INT NOT NULL,
    id3 INT NOT NULL
    );

SELECT * FROM score
WHERE 
  CONCAT(sub1, sub2, sub3, sub4, sub5, sub6) LIKE '%Toán%'
  and CONCAT(sub1, sub2, sub3, sub4, sub5, sub6) LIKE '%Văn%'
  and CONCAT(sub1, sub2, sub3, sub4, sub5, sub6) LIKE '%Anh%'
ORDER BY student_id DESC;

INSERT INTO subcomb (cid, sub1, id1, sub2, id2, sub3, id3)
VALUES
('A00', 'Toán', 4, 'Lý', 10, 'Hóa', 12),
('A01', 'Toán', 4, 'Lý', 10, 'Anh', 8),
('A02', 'Toán', 4, 'Lý', 10, 'Sinh', 14),
('B00', 'Toán', 4, 'Hóa', 12, 'Sinh', 14),
('C00', 'Văn', 6, 'Sử', 10, 'Địa', 12),
('C03', 'Toán', 4, 'Văn', 6, 'Sử', 10),
('C04', 'Toán', 4, 'Văn', 6, 'Địa', 12),
('C14', 'Toán', 4, 'Văn', 6, 'GDCD', 14),
('C19', 'Văn', 6, 'Sử', 10, 'GDCD', 14),
('C20', 'Văn', 6, 'Địa', 12, 'GDCD', 14),
('D01', 'Toán', 4, 'Văn', 6, 'Anh', 8),
('D07', 'Toán', 4, 'Hóa', 12, 'Anh', 8),
('D08', 'Toán', 4, 'Sinh', 14, 'Anh', 8),
('D09', 'Toán', 4, 'Sử', 10, 'Anh', 8),
('D10', 'Toán', 4, 'Địa', 12, 'Anh', 8),
('D14', 'Văn', 6, 'Sử', 10, 'Anh', 8),
('D15', 'Văn', 6, 'Địa', 12, 'Anh', 8);

INSERT INTO admin (username, password)
VALUES ('duongtn23it', 123456);


INSERT INTO student (student_id, name, date_of_birth, gender, email, phone, hometown, address, school, test)
VALUES
(12345768,'Trần Văn Sơn','2005-12-08','Nam','sontv@gmail.com', '0873475899','Đà Nẵng', 'Số 123, đường Nguyễn Văn Trỗi', 'Trường THPT Lê Đình Chiểu ', 'Tự nhiên'),
(12345769,'Nguyễn Thị Mai','2005-09-15','Nữ','mainguyen@gmail.com', '0978123456','Hà Nội', 'Số 456, đường Lê Lợi', 'Trường THPT Phan Bội Châu', 'Xã hội'),
(12345770,'Lê Minh Tuấn','2006-02-25','Nam','tuanle@gmail.com', '0934567890','Hồ Chí Minh', 'Số 789, đường Trần Hưng Đạo', 'Trường THPT Nguyễn Văn Linh', 'Tự nhiên'),
(12345771,'Phạm Thị Hoàng','2005-11-03','Nữ','hoangpham@gmail.com', '0912345678','Đà Nẵng', 'Số 101, đường Nguyễn Chí Thanh', 'Trường THPT Lý Tự Trọng', 'Xã hội'),
(12345772,'Nguyễn Minh Khoa','2005-08-18','Nam','khoanguyen@gmail.com', '0987654321','Hồ Chí Minh', 'Số 202, đường Bà Triệu', 'Trường THPT Quang Trung', 'Tự nhiên'),
(12345773,'Lê Thị Thu','2006-04-22','Nữ','thule@gmail.com', '0954321098','Hà Nội', 'Số 303, đường Nguyễn Chánh', 'Trường THPT Võ Văn Tần', 'Tự nhiên'),
(12345774,'Hoàng Văn Đức','2006-01-05','Nam','duchoang@gmail.com', '0923456789','Đà Nẵng', 'Số 404, đường Hồ Tùng Mậu', 'Trường THPT Lê Hồng Phong', 'Tự nhiên'),
(12345775,'Phan Thị An','2005-07-22','Nữ','anphan@gmail.com', '0967890123','Hồ Chí Minh', 'Số 505, đường Nguyễn Thị Minh Khai', 'Trường THPT Ngô Quyền', 'Xã hội'),
(12345776,'Trần Minh Khôi','2005-10-12','Nam','khoitran@gmail.com', '0945678901','Hà Nội', 'Số 606, đường Lê Thánh Tôn', 'Trường THPT Nguyễn Thị Minh Khai', 'Xã hội'),
(12345777,'Nguyễn Thị Hương','2005-06-30','Nữ','huongnguyen@gmail.com', '0987654321','Đà Nẵng', 'Số 707, đường Nguyễn Đình Thi', 'Trường THPT Bùi Thị Xuân', 'Tự nhiên'),
(12345778,'Lê Văn Hải','2005-03-14','Nam','haile@gmail.com', '0909090909','Hồ Chí Minh', 'Số 808, đường Nguyễn Thái Bình', 'Trường THPT Lê Quý Đôn', 'Xã hội'),
(12345779,'Trương Thị Hà','2006-09-05','Nữ','hathitrang@gmail.com', '0912345678','Hà Nội', 'Số 909, đường Lê Lai', 'Trường THPT Trần Hưng Đạo', 'Tự nhiên'),
(12345780,'Phan Văn Hoàng','2005-12-28','Nam','hoangvan@gmail.com', '0923456789','Đà Nẵng', 'Số 010, đường Nguyễn Công Trứ', 'Trường THPT Lê Ngọc Hân', 'Xã hội'),
(12345781,'Lê Thị Thu Hà','2005-11-19','Nữ','thuha@gmail.com', '0967890123','Hồ Chí Minh', 'Số 111, đường Nguyễn Thị Minh Khai', 'Trường THPT Phan Chu Trinh', 'Tự nhiên'),
(12345782,'Nguyễn Văn Tâm','2005-08-07','Nam','tamnguyen@gmail.com', '0945678901','Hà Nội', 'Số 121, đường Lê Thánh Tôn', 'Trường THPT Trưng Vương', 'Tự nhiên'),
(12345783,'Trần Thị Lan','2006-02-14','Nữ','lantran@gmail.com', '0987654321','Đà Nẵng', 'Số 131, đường Bà Triệu', 'Trường THPT Lê Hồng Phong', 'Xã hội'),
(12345784,'Lê Minh Tuấn','2005-07-01','Nam','tuanle@gmail.com', '0909090909','Hồ Chí Minh', 'Số 141, đường Nguyễn Thái Bình', 'Trường THPT Nguyễn Văn Linh', 'Xã hội'),
(12345785,'Nguyễn Thị Ngọc','2005-10-25','Nữ','ngocnguyen@gmail.com', '0912345678','Hà Nội', 'Số 151, đường Trần Hưng Đạo', 'Trường THPT Quang Trung', 'Tự nhiên'),
(12345786,'Trần Văn Thắng','2005-05-09','Nam','thangtran@gmail.com', '0954321098','Đà Nẵng', 'Số 161, đường Nguyễn Công Trứ', 'Trường THPT Lê Đình Chiểu ', 'Tự nhiên'),
(12345787,'Lê Thị Ngọc Anh','2006-01-28','Nữ','anhle@gmail.com', '0923456789','Hồ Chí Minh', 'Số 171, đường Nguyễn Văn Linh', 'Trường THPT Nguyễn Du', 'Tự nhiên'),
(12345788,'Nguyễn Văn Hùng','2005-09-10','Nam','hungnguyen@gmail.com', '0987654321','Hà Nội', 'Số 181, đường Nguyễn Huệ', 'Trường THPT Phan Bội Châu', 'Xã hội'),
(12345789,'Phạm Thị Nga','2005-06-03','Nữ','ngapham@gmail.com', '0909090909','Đà Nẵng', 'Số 191, đường Lê Lai', 'Trường THPT Lê Hồng Phong', 'Xã hội'),
(12345790,'Trần Văn Bình','2006-03-17','Nam','binhtran@gmail.com', '0912345678','Hồ Chí Minh', 'Số 202, đường Lê Thánh Tôn', 'Trường THPT Nguyễn Thị Minh Khai', 'Tự nhiên'),
(12345791,'Lê Thị Hương','2005-12-12','Nữ','huongle@gmail.com', '0923456789','Hà Nội', 'Số 212, đường Bà Triệu', 'Trường THPT Trần Hưng Đạo', 'Tự nhiên'),
(12345792,'Nguyễn Văn Tú','2005-08-29','Nam','tunguyen@gmail.com', '0987654321','Đà Nẵng', 'Số 222, đường Nguyễn Chí Thanh', 'Trường THPT Võ Văn Tần', 'Xã hội'),
(12345793,'Phạm Thị Lan Anh','2006-05-02','Nữ','lananhpham@gmail.com', '0954321098','Hồ Chí Minh', 'Số 232, đường Nguyễn Đình Thi', 'Trường THPT Bùi Thị Xuân', 'Tự nhiên'),
(12345794,'Lê Văn Long','2006-02-09','Nam','longle@gmail.com', '0909090909','Đà Nẵng', 'Số 242, đường Nguyễn Thái Bình', 'Trường THPT Lê Quý Đôn', 'Tự nhiên'),
(12345795,'Trần Thị Hải Yến','2005-09-21','Nữ','haoyen@gmail.com', '0912345678','Hà Nội', 'Số 252, đường Lê Lợi', 'Trường THPT Phan Chu Trinh', 'Xã hội'),
(12345796,'Nguyễn Văn Minh','2005-06-14','Nam','minhnguyen@gmail.com', '0923456789','Hồ Chí Minh', 'Số 262, đường Nguyễn Thị Minh Khai', 'Trường THPT Lê Ngọc Hân', 'Tự nhiên'),
(12345797,'Lê Thị Hồng','2006-03-27','Nữ','hongle@gmail.com', '0987654321','Hà Nội', 'Số 272, đường Trần Hưng Đạo', 'Trường THPT Trưng Vương', 'Tự nhiên');

INSERT INTO subject (student_id, name, sub1, sub2, sub3, sub4, sub5, sub6)
VALUES
(12345768,'Trần Văn Sơn','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345769,'Nguyễn Thị Mai','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345770,'Lê Minh Tuấn','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345771,'Phạm Thị Hoàng','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345772,'Nguyễn Minh Khoa','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345773,'Lê Thị Thu','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345774,'Hoàng Văn Đức','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345775,'Phan Thị An','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345776,'Trần Minh Khôi','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345777,'Nguyễn Thị Hương','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345778,'Lê Văn Hải','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345779,'Trương Thị Hà','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345780,'Phan Văn Hoàng','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345781,'Lê Thị Thu Hà','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345782,'Nguyễn Văn Tâm','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345783,'Trần Thị Lan','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345784,'Lê Minh Tuấn','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345785,'Nguyễn Thị Ngọc','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345786,'Trần Văn Thắng','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345787,'Lê Thị Ngọc Anh','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345788,'Nguyễn Văn Hùng','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345789,'Phạm Thị Nga','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345790,'Trần Văn Bình','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345791,'Lê Thị Hương','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345792,'Nguyễn Văn Tú','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345793,'Phạm Thị Lan Anh','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345794,'Lê Văn Long','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345795,'Trần Thị Hải Yến','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD'),
(12345796,'Nguyễn Văn Minh','Toán', 'Văn', 'Anh', 'Lý', 'Hóa', 'Sinh'),
(12345797,'Lê Thị Hồng','Toán', 'Văn', 'Anh', 'Sử', 'Địa', 'GDCD');





INSERT INTO score (student_id, name, sub1, score1, sub2, score2, sub3, score3, sub4, score4, sub5, score5, sub6, score6)
VALUES
(12345768,'Trần Văn Sơn','Toán', 5, 'Văn', 8, 'Anh', 9, 'Lý', 6, 'Hóa', 6, 'Sinh', 8),
(12345769,'Nguyễn Thị Mai','Toán', 7, 'Văn', 8, 'Anh', 9, 'Sử', 7, 'Địa', 8, 'GDCD', 9),
(12345770,'Lê Minh Tuấn','Toán', 8, 'Văn', 7, 'Anh', 8, 'Lý', 9, 'Hóa', 7, 'Sinh', 8),
(12345771,'Phạm Thị Hoàng','Toán', 6, 'Văn', 7, 'Anh', 8, 'Sử', 9, 'Địa', 6, 'GDCD', 7),
(12345772,'Nguyễn Minh Khoa','Toán', 9, 'Văn', 8, 'Anh', 7, 'Lý', 6, 'Hóa', 8, 'Sinh', 9),
(12345773,'Lê Thị Thu','Toán', 8, 'Văn', 7, 'Anh', 9, 'Sử', 8, 'Địa', 6, 'GDCD', 7),
(12345774,'Hoàng Văn Đức','Toán', 7, 'Văn', 9, 'Anh', 8, 'Lý', 7, 'Hóa', 8, 'Sinh', 9),
(12345775,'Phan Thị An','Toán', 6, 'Văn', 7, 'Anh', 9, 'Sử', 8, 'Địa', 7, 'GDCD', 8),
(12345776,'Trần Minh Khôi','Toán', 8, 'Văn', 9, 'Anh', 7, 'Lý', 8, 'Hóa', 7, 'Sinh', 9),
(12345777,'Nguyễn Thị Hương','Toán', 9, 'Văn', 7, 'Anh', 8, 'Sử', 6, 'Địa', 9, 'GDCD', 7),
(12345778,'Lê Văn Hải','Toán', 7, 'Văn', 8, 'Anh', 9, 'Lý', 6, 'Hóa', 7, 'Sinh', 8),
(12345779,'Trương Thị Hà','Toán', 8, 'Văn', 9, 'Anh', 7, 'Sử', 6, 'Địa', 8, 'GDCD', 9),
(12345780,'Phan Văn Hoàng','Toán', 9, 'Văn', 7, 'Anh', 8, 'Lý', 7, 'Hóa', 8, 'Sinh', 9),
(12345781,'Lê Thị Thu Hà','Toán', 7, 'Văn', 8, 'Anh', 9, 'Sử', 8, 'Địa', 6, 'GDCD', 7),
(12345782,'Nguyễn Văn Tâm','Toán', 8, 'Văn', 9, 'Anh', 7, 'Lý', 7, 'Hóa', 8, 'Sinh', 9),
(12345783,'Trần Thị Lan','Toán', 9, 'Văn', 7, 'Anh', 8, 'Sử', 6, 'Địa', 7, 'GDCD', 8),
(12345784,'Lê Minh Tuấn','Toán', 6, 'Văn', 8, 'Anh', 9, 'Lý', 8, 'Hóa', 7, 'Sinh', 9),
(12345785,'Nguyễn Thị Ngọc','Toán', 7, 'Văn', 9, 'Anh', 7, 'Sử', 6, 'Địa', 8, 'GDCD', 9),
(12345786,'Trần Văn Thắng','Toán', 8, 'Văn', 7, 'Anh', 8, 'Lý', 7, 'Hóa', 8, 'Sinh', 9),
(12345787,'Lê Thị Ngọc Anh','Toán', 9, 'Văn', 8, 'Anh', 9, 'Sử', 6, 'Địa', 7, 'GDCD', 8),
(12345788,'Nguyễn Văn Hùng','Toán', 6, 'Văn', 7, 'Anh', 8, 'Lý', 7, 'Hóa', 8, 'Sinh', 9),
(12345789,'Phạm Thị Nga','Toán', 8, 'Văn', 9, 'Anh', 7, 'Sử', 6, 'Địa', 8, 'GDCD', 9),
(12345790,'Trần Văn Bình','Toán', 7, 'Văn', 8, 'Anh', 9, 'Lý', 8, 'Hóa', 7, 'Sinh', 9),
(12345791,'Lê Thị Hương','Toán', 9, 'Văn', 7, 'Anh', 8, 'Sử', 6, 'Địa', 7, 'GDCD', 8),
(12345792,'Nguyễn Văn Tú','Toán', 6, 'Văn', 8, 'Anh', 9, 'Lý', 7, 'Hóa', 8, 'Sinh', 9),
(12345793,'Phạm Thị Lan Anh','Toán', 8, 'Văn', 9, 'Anh', 7, 'Sử', 6, 'Địa', 8, 'GDCD', 9),
(12345794,'Lê Văn Long','Toán', 7, 'Văn', 8, 'Anh', 9, 'Lý', 8, 'Hóa', 7, 'Sinh', 9),
(12345795,'Trần Thị Hải Yến','Toán', 9, 'Văn', 7, 'Anh', 8, 'Sử', 6, 'Địa', 7, 'GDCD', 8),
(12345796,'Nguyễn Văn Minh','Toán', 6, 'Văn', 8, 'Anh', 9, 'Lý', 7, 'Hóa', 8, 'Sinh', 9),
(12345797,'Lê Thị Hồng','Toán', 8, 'Văn', 9, 'Anh', 7, 'Sử', 6, 'Địa', 8, 'GDCD', 9);
