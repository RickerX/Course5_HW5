import DAO.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CityDAO cityDAO = new CityDAOImpl();
        City city1 = new City(1,"Tula");
        cityDAO.create(city1);
        City city2 = new City(2, "Minsk");
        cityDAO.create(city2);
        System.out.println(cityDAO.readById(1));
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee1 = new Employee(1,"Roman", "Ivanov", "male", 30,city1);
        employeeDAO.create(employee1);
        System.out.println(employeeDAO.readById(1));
        List<Employee> list = employeeDAO.readAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
        Employee employee2 = new Employee(2,"Alise", "Bait", "female", 40,city2);
        employeeDAO.create(employee2);
        employeeDAO.updateEmployee(employee1);
        employeeDAO.delete(employee2);
        cityDAO.updateCity(city1);
        cityDAO.delete(city2);
    }
}

