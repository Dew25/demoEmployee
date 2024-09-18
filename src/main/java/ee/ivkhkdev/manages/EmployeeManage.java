package ee.ivkhkdev.manages;

import ee.ivkhkdev.Address;
import ee.ivkhkdev.Employee;
import ee.ivkhkdev.Person;

import java.util.Scanner;

public class EmployeeManage {

    private Scanner scanner = new Scanner(System.in);

    public void list(Employee[] employees) {
        System.out.println("Список работников");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.printf("%d. Работник%nИмя: %s,%nФамилия: %s,%nДолжность: %s,%nВозраст: %d,%nЗарплата: %s.%nПроживает по адресу: %s, %s, %s, %s - %s%n",
                        i+1,
                        employees[i].getPerson().getName(),
                        employees[i].getPerson().getSurname(),
                        employees[i].getAppointment(),
                        employees[i].getPerson().age(),
                        employees[i].getSalary(),
                        employees[i].getPerson().getAddress().getState(),
                        employees[i].getPerson().getAddress().getCity(),
                        employees[i].getPerson().getAddress().getStreet(),
                        employees[i].getPerson().getAddress().getHouse(),
                        employees[i].getPerson().getAddress().getRoom()
                );
            }
        }
    }
    public String[] initialize(){
        String[] employeeAtributes = new String[13];
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        employeeAtributes[0] = name;
        System.out.print("фамилия: ");
        String surname = scanner.nextLine();
        employeeAtributes[1] = surname;
        System.out.print("Должность: ");
        String appointment = scanner.nextLine();
        employeeAtributes[2] = appointment;
        System.out.print("Зарплата: ");
        String salary = scanner.nextLine();
        employeeAtributes[3] = salary;
        System.out.print("День рождения: ");
        String birthDay = scanner.nextLine();
        employeeAtributes[4] = birthDay;
        System.out.print("Месяц рождения: ");
        String birthMonth = scanner.nextLine();
        employeeAtributes[5] = birthMonth;
        System.out.print("Год рождения: ");
        String  birthYear = scanner.nextLine();
        employeeAtributes[6] = birthYear;
        System.out.println("Адрес работника:");
        System.out.print("Город: ");
        String city = scanner.nextLine();
        employeeAtributes[7] = city;
        System.out.print("Регион: ");
        String state = scanner.nextLine();
        employeeAtributes[8] = state;
        System.out.print("Почтовый индекс: ");
        String zip = scanner.nextLine();
        employeeAtributes[9] = zip;
        System.out.print("Улица: ");
        String street = scanner.nextLine();
        employeeAtributes[10] = street;
        System.out.print("Дом: ");
        String house = scanner.nextLine();
        employeeAtributes[11] = house;
        System.out.print("Квартира: ");
        String room = scanner.nextLine();
        employeeAtributes[12] = room;
        return employeeAtributes;
    }
    public Employee create(String[] employeeAtributes) {
        Address address = new Address();
        address.setCity(employeeAtributes[7]);
        address.setState(employeeAtributes[8]);
        address.setZip(employeeAtributes[9]);
        address.setStreet(employeeAtributes[10]);
        address.setHouse(employeeAtributes[11]);
        address.setRoom(employeeAtributes[12]);

        Person person = new Person(employeeAtributes[0],employeeAtributes[1], address,Integer.parseInt(employeeAtributes[4]),Integer.parseInt(employeeAtributes[5]),Integer.parseInt(employeeAtributes[6]));
        Employee employee = new Employee(person, employeeAtributes[2], employeeAtributes[3]);

        System.out.printf("Добавлен работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s%n",
                employee.getPerson().getName(),
                employee.getPerson().getSurname(),
                employee.getAppointment(),
                employee.getPerson().age(),
                employee.getSalary(),
                employee.getPerson().getAddress().getState(),
                employee.getPerson().getAddress().getCity(),
                employee.getPerson().getAddress().getStreet(),
                employee.getPerson().getAddress().getHouse(),
                employee.getPerson().getAddress().getRoom()
        );
        return employee;
    }

    public void printEmployee(String name, String surname, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                if(employees[i].getPerson().getName().equals(name)
                        && employees[i].getPerson().getSurname().equals(surname)){
                    System.out.printf("Работник%nИмя: %s,%nФамилия: %s,%nДолжность: %s,%nВозраст: %d,%nЗарплата: %s.%nПроживает по адресу: %s, %s, %s, %s - %s%n",
                            employees[i].getPerson().getName(),
                            employees[i].getPerson().getSurname(),
                            employees[i].getAppointment(),
                            employees[i].getPerson().age(),
                            employees[i].getSalary(),
                            employees[i].getPerson().getAddress().getState(),
                            employees[i].getPerson().getAddress().getCity(),
                            employees[i].getPerson().getAddress().getStreet(),
                            employees[i].getPerson().getAddress().getHouse(),
                            employees[i].getPerson().getAddress().getRoom()
                    );
                }
            }

        }
    }
}
