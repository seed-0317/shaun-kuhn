# SQL lab 2 answers

## 2.1

_1.Task – Select all records from the Employee table._

select * from employees;

_2.Task – Select all records from the Employee table where last name is King._

select * from employees
where last_name = 'King';

_3.Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL._

select * from employees
where first_name = 'Andrew'
and reports_to is null;

## 2.2
_1.Task – Select all albums in Album table and sort result set in descending order by title._

select * from albums
order by title ASC;

_2.Task – Select first name from Customer and sort result set in ascending order by city_

select first_name from customers
order by city ASC;

## 2.3
_1.Task – Insert two new records into Genre table_

insert into genres(id, name) values (26,'Country'), (27,'Bluegrass');	

_2.Task – Insert two new records into Employee table_

insert into employees (id, last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email) 
values (9,'Blow', 'Joe', 'IT Staff', 6,'1972-02-28 00:00:00', '2012-09-18 00:00:00', '1234 Default Ave', 'Calgary', 'AB', 'Canada', 'T5K 2N1', '+1 (403) 261-3728', '+1 (403) 262-3322', 'joe@chinookcorp.com'),
(10,'Freely', 'Ip', 'Custodian', 1, '1992-02-10 00:00:00', '2010-12-28 00:00:00', '777 Urinal LN', 'Calgary', 'AB', 'Canada', 'T2P 2T3', '+1 (403) 295-8721', '+1 (403) 262-4422', 'ip@chinookcorp.com' );

_3.Task – Insert two new records into Customer table_

insert into customers (id, first_name, last_name, company, address, city, state, country, postal_code, phone, email, support_rep_id)
values (60, 'Jiminy', 'Cricket', 'Disney', '123 Dreams come true BLVD', 'Orlando', 'FL', 'USA', '40302', '+1 (800) 291-3829','bigdaddycricket@disney.com',5), 
(61, 'Mike', 'Jordon', 'Bulls', '444 Miracle Mile', 'Chiacgo', 'IL', 'USA', '90210', '+1 (540) 647-8392', 'MJ23@bulls.com',5);

## 2.4
_Task – Update Aaron Mitchell in Customer table to Robert Walter_

update customers set first_name = 'Robert', last_name = 'Walter'
where first_name = 'Aaron' and last_name = 'Mitchell';

_Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”_

update artists set name = 'CCR'
where name = 'Creedence Clearwater Revival';

## 2.5
_Task – Select all invoices with a billing address like “T%”_

select * from invoices
where invoices.billing_address like 'T%';

## 2.6
_Task – Select all invoices that have a total between 15 and 50_

select * from invoices
where total >= 15 and total <= 50;

_Task – Select all employees hired between 1st of June 2003 and 1st of March 2004_

select * from employees
where cast(hire_date as date) between '2003-06-01' and '2004-03-01';

## 2.7
_Task – Delete a record in Customer table where the name is Robert Walter 
(There may be constraints that rely on this, find out how to resolve them)_

delete from invoice_lines
where id = 50;

alter table invoice_lines
    drop constraint fk_invoice_line_invoice_id;
    
delete from invoices
where customer_id = 32;

alter table invoices
    drop CONSTRAINT fk_invoice_customer_id;

delete from customers
where first_name = 'Robert' and last_name = 'Walter';

alter table invoice_lines add constraint fk_invoice_line_invoice_id
    FOREIGN KEY (invoice_id) references invoices;
   
alter table invoices
    add CONSTRAINT fk_invoice_customer_id FOREIGN KEY (customer_id) REFERENCES customers;
