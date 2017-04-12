# Lab 3 answers

## 3.1 System Defined Functions

_Task – Create a function that returns the current time.

CREATE FUNCTION right_now () returns TIME WITH TIME ZONE as
$$ Select current_time$$
language sql;

select right_now();

_Task – create a function that returns the length of a mediatype from the mediatype table

CREATE FUNCTION mylength() returns INTEGER as
  $$ select length(name) from media_types;$$
  language sql;

  select myLength();

## 3.2 System Defined Aggregate Functions

_Task – Create a function that returns the average total of all invoices

CREATE FUNCTION inavg() returns NUMERIC as
$$ select avg(total) from invoices$$
language sql;

select inavg();

_Task – Create a function that returns the most expensive track

CREATE FUNCTION inmax() returns NUMERIC as
$$ select max(total) from invoices$$
language sql;

select inmax();

## 3.3 User Defined Scalar Functions

_Task – Create a function that returns the average price of invoiceline items in the invoiceline table_

CREATE FUNCTION inlavg() returns NUMERIC as
$$ select avg(unit_price) from invoice_lines $$
language sql;

select inlavg();

## 3.4 User Defined Table Valued Functions

_Task – Create a function that returns all employees who are born after 1968.

CREATE FUNCTION oldfolk() RETURNS TABLE(firstname character varying,lastname character varying)
as $$
  select first_name, last_name from employees
where cast(birth_date as date) > '1967-12-31';
$$
language sql;

select * from oldfolk();


