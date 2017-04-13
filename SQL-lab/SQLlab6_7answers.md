# 6 Triggers - In this section you will create various kinds of triggers that work when certain DML statements are executed on a table

_Task - Create an after insert trigger on the employee table fired after a new record is inserted into the table_



_Task – Create an after update trigger on the album table that fires after a row is inserted in the table_


_Task – Create an after delete trigger on the customer table that fires after a row is deleted from the table_



# - 7 Joins in this section you will be working with combing various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.

## 7.1 INNER
_Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.

select a.first_name, a.last_name, b.id as invoice_id
from customers a INNER JOIN invoices b
on a.id = b.customer_id;

## 7.2 OUTER
_Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.

select a.id, a.first_name, a.last_name, b.id as invoice_id, b.total
from customers a LEFT OUTER JOIN invoices b
on a.id = b.customer_id;

## 7.3 RIGHT
_Task – Create a right join that joins album and artist specifying artist name and title.

select name, title
from artists RIGHT OUTER JOIN albums
on artists.id = albums.artist_id;

## 7.4 CROSS
_Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.


select name, title
from artists CROSS JOIN albums
group by name, title;

## 7.5 SELF
_Task – Perform a self-join on the employee table, joining on the reportsto column.

select *
from employees a, employees b
where a.reports_to = b.reports_to;
