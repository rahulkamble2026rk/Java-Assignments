create database employee; 
use employee; 
 
create table employee_info
(empid int,fname varchar(20),lname varchar(20),age int,bdate date,weight int,salary int,hometown varchar(20),designation varchar(20),gender varchar(1),experience int,
primary key(empid)); 
 
INSERT INTO employee_info (empid, fname, lname, age, bdate, weight, salary, hometown, designation, gender, experience) VALUES
(1, 'Rahul', 'Kamble', 24, '2000-01-15', 75, 45000, 'Pune', 'Developer', 'm', 5),
(2, 'Amit', 'Sharma', 25, '1999-02-20', 80, 48000, 'Mumbai', 'Manager', 'm', 7),
(3, 'Vijay', 'Patil', 23, '2001-03-25', 70, 35000, 'Bangalore', 'Process Lead', 'm', 4),
(4, 'Kunal', 'Deshmukh', 22, '2002-04-10', 68, 30000, 'Chennai', 'Team Lead', 'm', 3),
(5, 'Suresh', 'Reddy', 21, '2003-05-30', 72, 40000, 'Delhi', 'Delivery Manager', 'm', 2),
(6, 'Sneha', 'Patil', 23, '2001-04-12', 58, 35000, 'Pune', 'Developer', 'f', 3),
(7, 'Arjun', 'Joshi', 19, '2005-07-20', 78, 29000, 'Mumbai', 'Manager', 'm', 1),
(8, 'Sanjay', 'Gupta', 18, '2006-08-25', 74, 35000, 'Bangalore', 'Process Lead', 'm', 2),
(9, 'Ankit', 'Verma', 24, '2000-09-30', 81, 45000, 'Chennai', 'Team Lead', 'm', 6),
(10, 'Aakash', 'Kumar', 23, '2001-10-15', 79, 38000, 'Delhi', 'Delivery Manager', 'm', 5),
(11, 'Priya', 'Sharma', 22, '2002-05-16', 62, 38000, 'Mumbai', 'Manager', 'f', 4),
(12, 'Ajay', 'Chavan', 21, '2003-12-25', 77, 31000, 'Mumbai', 'Manager', 'm', 4),
(13, 'Anita', 'Nair', 21, '2003-06-18', 54, 30000, 'Bangalore', 'Process Lead', 'f', 2),
(14, 'Prashant', 'Gokhale', 19, '2005-02-15', 73, 28000, 'Chennai', 'Team Lead', 'm', 2),
(15, 'Harsh', 'Mehta', 18, '2006-03-20', 69, 34000, 'Delhi', 'Delivery Manager', 'm', 1),
(16, 'Abhishek', 'Kulkarni', 17, '2007-04-25', 80, 33000, 'Pune', 'Developer', 'm', 1),
(17, 'Megha', 'Rao', 24, '2000-07-22', 60, 40000, 'Chennai', 'Team Lead', 'f', 5),
(18, 'Aman', 'Pawar', 24, '2000-06-15', 71, 41000, 'Bangalore', 'Process Lead', 'm', 6),
(19, 'Deepak', 'Rathod', 23, '2001-07-20', 77, 39000, 'Chennai', 'Team Lead', 'm', 5),
(20, 'Yash', 'More', 22, '2002-08-25', 79, 37000, 'Delhi', 'Delivery Manager', 'm', 4),
(21, 'Siddharth', 'Gaikwad', 21, '2003-09-30', 76, 36000, 'Pune', 'Developer', 'm', 3),
(22, 'Kavita', 'Singh', 25, '1999-08-25', 65, 45000, 'Delhi', 'Delivery Manager', 'f', 7),
(23, 'Jayesh', 'Chogle', 19, '2005-11-20', 72, 33000, 'Bangalore', 'Process Lead', 'm', 1),
(24, 'Pooja', 'Deshmukh', 24, '2000-12-28', 63, 37000, 'Chennai', 'Team Lead', 'f', 6),
(25, 'Nikhil', 'Mahajan', 17, '2007-01-30', 68, 28000, 'Delhi', 'Delivery Manager', 'm', 0); 

select  * from employee_info;
 


 