//package net.javaguides.ems;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import net.javaguides.ems.entity.Employee;
//import net.javaguides.ems.repository.EmployeeRepository;
//import net.javaguides.ems.service.EmployeeServiceImplementation;
//
//@SpringBootTest(classes = { ServiceClass.class })
//public class ServiceClass {
//
//	@Mock
//	EmployeeRepository er;
//
//	@InjectMocks
//	EmployeeServiceImplementation esr;
//
//	@Test
//	@Order(1)
//	public void deleteById() {
//
//		ArrayList<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee(1l, "mani", "baswa", "mani@gmail.com"));
//		
//		when(er.findAll()).thenReturn(list);
//		assertEquals(id, esr.getAllEmployees());
//
//
//
//	}
//
//}
