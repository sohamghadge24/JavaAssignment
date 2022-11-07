create database studentInfo;
use studentInfo;
show databases;
create table info(Sname varchar(20),Cname varchar(20),fees int);

INSERT INTO info values ('sai','java',10000);
INSERT INTO info values ('manoj','oracle',5000);
INSERT INTO info values ('siva','python',12000);
INSERT INTO info values ('mohan','java',10000);
INSERT INTO info values ('dona','java',10000);
INSERT INTO info values ('stella','python',12000);


select * from info;
