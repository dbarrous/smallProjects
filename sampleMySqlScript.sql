-- This is a sample mySql script it creates two tables, one called Students and another called Faculty
-- Once they are created it populates the database with students and faculty members



DROP TABLE IF EXISTS Students;
DROP TABLE IF EXISTS Faculty;
/*Creates Faculty Table*/
Create Table Faculty
	(f_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,f_name VARCHAR(100) NOT NULL);
/*Creates Students Table*/
Create Table Students
	(s_id INTEGER UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,s_name VARCHAR(100) NOT NULL,s_class char(2) NOT NULL,s_advfid INTEGER NOT NULL);
/*Fills Faculty*/
INSERT INTO Faculty SET f_name='Hatfield,Bo';
INSERT INTO Faculty SET f_name='Kaur,Komalpreet';
INSERT INTO Faculty SET f_name='Kasprzyk,Joseph';
/*Fills Students*/
INSERT INTO Students SET s_name='Adeyeri,Olalekan',s_class='Ju',s_advfid=2;
INSERT INTO Students SET s_name='Cid,Jose',s_class='Ju',s_advfid=3;
INSERT INTO Students SET s_name='Alhayek,Ahmad',s_class='Se',s_advfid=1;
INSERT INTO Students SET s_name='Demiri,Jani',s_class='Se',s_advfid=3;
INSERT INTO Students SET s_name='Castro,Dionis',s_class='Ju',s_advfid=1;
INSERT INTO Students SET s_name='Bondarev,Pavel',s_class='So',s_advfid=2;
-- 1.
SELECT * from Faculty
-- 2.
SELECT * from Students
-- 3.
SELECT Students.s_name, Students.s_class FROM Students WHERE s_advfid =1;
-- 4.
SELECT Students.s_name, Students.s_class, Faculty.f_name FROM Students INNER JOIN Faculty ON Students.s_advfid=Faculty.f_id ORDER BY Students.s_name;
-- 5.
SELECT Students.s_name, Faculty.f_name FROM Students INNER JOIN Faculty ON Students.s_advfid=Faculty.f_id WHERE Students.s_class= "Se" ORDER BY Students.s_name;
-- 6.
SELECT Students.s_name, Faculty.f_name FROM Students INNER JOIN Faculty ON Students.s_advfid=Faculty.f_id WHERE Students.s_advfid=1 OR Students.s_advfid=3 ORDER BY Students.s_name;
