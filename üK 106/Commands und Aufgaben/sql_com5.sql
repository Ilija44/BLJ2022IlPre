Aufgabenbkat_5

5.1
select department_id, department_name, id_location, count(employee_id) as "Anzahl der Angestellten"
from department
left join employee on department.id_manager = employee.id_manager
group by department_name, department_id;


5.2
select department_name, id_job, count(id_job)  
from department
inner join employee on department_id = id_department
where department_name = 'Sales' or department_name = 'Finance'
group by department_name, id_job;

5.6
SELECT ROUND(MAX(salary)) AS "Maximum", 
       ROUND(MIN(salary)) AS "Minimum", 
       ROUND(SUM(salary)) AS "Sum", 
       ROUND(AVG(salary)) AS "Average" 
FROM employee;


5.7
SELECT ROUND(MAX(salary)) AS "Maximum", 
       ROUND(MIN(salary)) AS "Minimum", 
       ROUND(SUM(salary)) AS "Sum", 
       ROUND(AVG(salary)) AS "Average" 
FROM employee group by id_job;


5.8
select id_job, count(id_job) as "Anzahl"
from employee group by id_job;

5.9
select id_manager as("Number of Manegers") from employee;


5.11
select id_manager, min(salary) as "Lowest salary of employees"
from employee
where id_manager is not null
group by id_manager
having min(salary) > 600
order by min(salary) DESC;



5.12
SELECT department_name AS "Name", id_location AS "Location", 
       COUNT(employee_id) AS "Number of People", 
       ROUND(AVG(salary), 2) AS "Salary"
FROM department
JOIN employee ON department_id = id_department
GROUP BY department_id, department_name, id_location;
