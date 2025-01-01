package in.boot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.boot.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
