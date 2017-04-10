# SQL lab 2 answers

## 2.1
1.Task – Select all records from the Employee table.

select * from employees;

2.Task – Select all records from the Employee table where last name is King.

select * from employees
where last_name = 'King';

3.Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.

select * from employees
where first_name = 'Andrew'
and reports_to is null;

## 2.2
1.Task – Select all albums in Album table and sort result set in descending order by title.

select * from albums
order by title ASC;

2.Task – Select first name from Customer and sort result set in ascending order by city

select first_name from customers
order by city ASC;

## 2.3
1.Task – Insert two new records into Genre table

insert into genres(id, name) values (26,'Country'), (27,'Bluegrass');	

2.Task – Insert two new records into Employee table

insert into employees (id, last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email) 
values (9,'Blow', 'Joe', 'IT Staff', 6,'1972-02-28 00:00:00', '2012-09-18 00:00:00', '1234 Default Ave', 'Calgary', 'AB', 'Canada', 'T5K 2N1', '+1 (403) 261-3728', '+1 (403) 262-3322', 'joe@chinookcorp.com'),
(10,'Freely', 'Ip', 'Custodian', 1, '1992-02-10 00:00:00', '2010-12-28 00:00:00', '777 Urinal LN', 'Calgary', 'AB', 'Canada', 'T2P 2T3', '+1 (403) 295-8721', '+1 (403) 262-4422', 'ip@chinookcorp.com' );

3.Task – Insert two new records into Customer table

insert into customers (id, first_name, last_name, company, address, city, state, country, postal_code, phone, email, support_rep_id)
values (60, 'Jiminy', 'Cricket', 'Disney', '123 Dreams come true BLVD', 'Orlando', 'FL', 'USA', '40302', '+1 (800) 291-3829','bigdaddycricket@disney.com',5), 
(61, 'Mike', 'Jordon', 'Bulls', '444 Miracle Mile', 'Chiacgo', 'IL', 'USA', '90210', '+1 (540) 647-8392', 'MJ23@bulls.com',5);

## 2.4
1.Task – Update Aaron Mitchell in Customer table to Robert Walter

2.Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”

## 2.5
1.Task – Select all invoices with a billing address like “T%”

## 2.6
1.Task – Select all invoices that have a total between 15 and 50

2.Task – Select all employees hired between 1st of June 2003 and 1st of March 2004

## 2.7
1.Task – Delete a record in Customer table where the name is Robert Walter 
(There may be constraints that rely on this, find out how to resolve them).
