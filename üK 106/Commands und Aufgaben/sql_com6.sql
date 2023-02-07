6.1
SELECT last_name, "STARTDATE", id_department FROM employee
WHERE id_department = (SELECT id_department FROM employee WHERE last_name = 'Zlotkey') AND last_name <> 'Zlotkey';


6.2 
select last_name, employee_id
from employee where salary > (select avg(salary) from employee) order by salary ASC;

6.4
select last_name, id_department, id_job
from employee
join department
on id_department = department_id
where id_location = '1700';



