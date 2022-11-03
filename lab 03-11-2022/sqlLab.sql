create database bank;
use bank;
CREATE TABLE bankMaster(Acno int ,Cname Varchar(20) not null,City Varchar(40)  default 'hyderabad' not null,Balance int  not null ,Brachcode int,PRIMARY KEY (Acno),FOREIGN KEY (Brachcode) REFERENCES branch(Branchcode));
/* bankMaster */
INSERT INTO bankMaster VALUES (123,'Soham','mumbai',323000,1);
INSERT INTO bankMaster VALUES (234,'Vijay','pune',30400,5);
INSERT INTO bankMaster VALUES (345,'Jay','Thane',3000,2);
INSERT INTO bankMaster VALUES (543,'Priya','Solapur',30200,3);
INSERT INTO bankMaster VALUES (231,'nive','lonvala',30600,4);

create table branch(Branchcode  int , location varchar(10) ,primary key(Branchcode) );
/*branch */
INSERT INTO branch VALUES (1,'Kalyan');
INSERT INTO branch VALUES (2,'Mumbai');
INSERT INTO branch VALUES (3,'Thane'); 
INSERT INTO branch VALUES (4,'Pune');
INSERT INTO branch VALUES (5,'Lonvala');

create table BankTransaction (Acno int ,Ttype char(1) ,Tdate datetime not null, amt int not null ,FOREIGN KEY (Acno) REFERENCES branch(Branchcode));
/*BankTransaction*/
INSERT INTO BankTransaction VALUES (1,'c',date('2020-10-24 10:51:00'),1000);
INSERT INTO BankTransaction VALUES (3,'d',date('2021-01-02 11:51:00'),4000);
INSERT INTO BankTransaction VALUES (5,'c',date('2022-03-04 12:51:00'),16000);
INSERT INTO BankTransaction VALUES (4,'d',date('2010-05-14 10:51:00'),10700);
INSERT INTO BankTransaction VALUES (2,'c',date('2009-11-24 13:51:00'),10800);


/*1)List the Bank Master details which customer have at least 30000 and above?*/
Select * from bankMaster where Balance>=30000;

/* 2)List the All branchs,Bank Master details which branch have the customers.*/
select * from branch, BankMaster ;

 /*
 3)List the Bank master details which customer maximum no.of times
 ‘w’ transaction done.
 
 //Transaction type=’c’ or ‘d’
 */

 select * from BankTransaction where Ttype="c";

 /*
 4)Find the total bal based on branch code and which branch total bal
 is above 100000 those branch,customer details.
 */


 select * from Branchs where Branchcode >= 100000;
 
/*5)To display all bankmaster details for given acno using ‘procedure’
*/
CREATE PROCEDURE bankMaster as SELECT * FROM Customers  go ;
execute bankMaster;
 /*
 6)To get all transaction details based on date wise.
 */
 select * from BankTransaction where Tdate;

 /*
 7)To list the 3rd maximum balance customer details.
 */

 select * from BankMaster where Balance = 69000;

