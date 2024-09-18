package ee.ivkhkdev.manages;

import ee.ivkhkdev.Employee;
import org.junit.Before;
import org.junit.Test;


public class EmployeeManageTest {
    EmployeeManage employeeManage = new EmployeeManage();
    String[] employeeParameters = {"Иван","Иванов","Директор","3000","10","10","2000","Нарва", "Ида-Вирумаа", "43444","Виру","4","3"};
    String[] employeeParameters1 = {"Олег","Сидоров","Слесарь","1500","1","1","2004","Нарва", "Ида-Вирумаа", "43444","Виру","5","7"};
    Employee[] employeeArray = new Employee[2];

    public EmployeeManageTest() {
        this.employeeArray = createEmployees();
    }

    private Employee[] createEmployees(){
        Employee[] employeeArray = new Employee[2];
        System.out.println("-------- Создаем работника №1 с помощью метода create -----------");
        employeeArray[0] = employeeManage.create(employeeParameters);
        System.out.println("-------- Создаем работника №2 с помощью метода create ------------");
        employeeArray[1] = employeeManage.create(employeeParameters1);
        return employeeArray;
    }
    //@Test
    public void testCreate() {
        System.out.println("------------ Тест метода create -------------");
        employeeManage.create(employeeParameters);
    }
    @Test
    public void testList() {
        System.out.println("------------ Тест метода list -------------");
        employeeManage.list(employeeArray);
    }
    @Test
    public void testPrintEmployee() {
        System.out.println("------------ Тест метода printEmployee -------------");
        employeeManage.printEmployee("Иван","Иванов", employeeArray);
    }


}