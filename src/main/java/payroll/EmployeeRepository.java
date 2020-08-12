package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import payroll.model.Employee;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}