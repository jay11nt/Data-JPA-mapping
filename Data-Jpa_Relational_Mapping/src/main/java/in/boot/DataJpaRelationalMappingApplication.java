package in.boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.boot.Repo.EmployeeRepo;
import in.boot.Repo.MobileRepo;
import in.boot.entity.Address;
import in.boot.entity.Employee;
import in.boot.entity.Mobile;

@SpringBootApplication
public class DataJpaRelationalMappingApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private MobileRepo mobRepo;

	public static void main(String[] args) {
		SpringApplication.run(DataJpaRelationalMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{	
//		Employee emp=new Employee();		//1st object	(1)
//		emp.setEmpName("pavy");
//		
//		Mobile mob=new Mobile();			//2nd object
//		mob.setMobName("iphone10");
//		
//		//emp.setMobile(mob);					//employee ka mobile 1 hai
//		mob.setEmp(emp);
//			
//		empRepo.save(emp);			//parent
//		mobRepo.save(mob);			//child							//save both objects Repository (Most important is save the child entity first here)
//		
//		System.out.println("saved success");			//(1)
//		
//		
//		Employee emp1= empRepo.findById(1).get();				//(2)unidirectional by ID
//		System.out.println("Name="+emp1.getEmpName());
//		System.out.println("Mobile="+emp1.getMobile().getMobName());		//(2)unidirectional by ID
//		
//		
//		Mobile mob1 = mobRepo.findById(3).get();		//(3)	bidirectional
//		System.out.println("EmpName="+mob1.getEmp().getEmpName());
//		System.out.println("Mobile="+mob1.getMobName());	//(3) bidirectional
//		
		
		
		
		
		
		//------(one to many) && (Many to one)-----------------------------------------
		Employee emp=new Employee();
		emp.setEmpName("jayant");
		
		
		Address add1=new Address();
		add1.setAddress("Nagpur");
		add1.setType("permanant Address");
		add1.setEmp(emp);
		
		Address add2=new Address();
		add2.setAddress("Aurangabad");
		add2.setType("current Address");
		add2.setEmp(emp);
		
		List<Address> addList = Arrays.asList(add1, add2);
		emp.setAddress(addList);
		
		empRepo.save(emp);
		System.out.println("saved succesfully");
	}

}
