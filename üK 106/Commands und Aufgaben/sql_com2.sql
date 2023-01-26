2.1
 Select last_name, salary from hr.employee where salary > 12000;

2.3
(SELECT last_name, salary 
FROM hr.employee
where salary < 5000)
UNION
(SELECT last_name, salary 
FROM hr.employee 
where salary > 12000);

2.5
(SELECT last_name, id_department
FROM hr.employee where id_department = 50 order by 1) 
union
(SELECT last_name, id_department
FROM hr.employee where id_department = 20 order by 1 )order by last_name ASC;

Sortierung der Namen nach den Klammern bei UNION

2.8
select last_name, "STARTDATE" FROM hr.employee where extract(YEAR from "STARTDATE") = 1994;


2.9
select last_name, id_job from employee where id_manager is NULL;

2.11
select last_name from employee where last_name ilike '__a%';

2.13
select * FROM hr.employee where extract(YEAR from "STARTDATE")>1997 and id_job ilike 'ST_Clerk';

2.15
select format('The salary of %s after a %s raise is %s', first_name, commission_pct,round( salary + salary * 0.1,0))h

2.17
select first_name from hr.employee where first_name like 'J%' or first_name like 'K%' or first_name like 'L%' or first_name like 'M%' order by first_name asc;

2.18
select first_name, 
Case 
WHEN commission_pct IS NULL Then 'Yes'
Else 'No'
end as Commission
from hr.employee;

2.19
 select region_name from region;

