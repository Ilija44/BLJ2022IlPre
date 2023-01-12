1.1
SELECT last_name, id_job , salary AS Salary FROM employee;

1.2
SELECT employee_id, last_name, (salary * 12) AS annual_salary FROM employee;

1.3 
SELECT * from department;

1.4 
SET search_path = hr;
Alter table hr.employee
rename column hire_date to "STARTDATE";
SELECT employee_id, last_name, id_job, "STARTDATE" from hr.employee order by employee_id ASC LIMIT 5;


1.6
set search_path = employees;
\dt

1.8
SELECT concat (last_name,' ', "id_job") AS "Employee and Title" from hr.employee;

1.10
\du


1.12
select format ('%s bezieht ein Gehalt von %s', first_name, salary) AS "Gehaltsliste" from hr.employee order By first_name ASC;


