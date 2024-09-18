package ee.ivkhkdev;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private Employee[] employees = new Employee[100];

    public void run(){
        boolean repeat = true;
        System.out.println("Отдел кадров");
        System.out.println("----------------------");
        do {
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить работника");
            System.out.println("2. Список всех работников");
            System.out.println("3. Работкник по имени и фамилии");
            System.out.println("4. Редактировать запись");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана 1 задача");
                    createEmpoyee();
                    break;
                case 2:
                    System.out.println("Выбрана 2 задача");
                    listEmployees();
                    break;
                case 3:
                    System.out.println("Выбрана 3 задача");
                    break;
                case 4:
                    System.out.println("Выбрана 4 задача");
                    break;
                default:
                    System.out.println("Выбрана несуществующая задача");
                    break;
            }
        }while (repeat);
        System.out.println("До свидания! :)");
    }

    private void listEmployees() {
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

    private void createEmpoyee() {
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("фамилия: ");
        String surname = scanner.nextLine();
        System.out.print("Должность: ");
        String appointment = scanner.nextLine();
        System.out.print("Зарплата: ");
        String salary = scanner.nextLine();
        System.out.print("День рождения: ");
        int birthDay = scanner.nextInt(); scanner.nextLine();
        System.out.print("Месяц рождения: ");
        int birthMonth = scanner.nextInt(); scanner.nextLine();
        System.out.print("Год рождения: ");
        int birthYear = scanner.nextInt(); scanner.nextLine();
        System.out.println("Адрес работника:");
        System.out.print("Город: ");
        String city = scanner.nextLine();
        System.out.print("Регион: ");
        String state = scanner.nextLine();
        System.out.print("Почтовый индекс: ");
        String zip = scanner.nextLine();
        System.out.print("Улица: ");
        String street = scanner.nextLine();
        System.out.print("Дом: ");
        String house = scanner.nextLine();
        System.out.print("Квартира: ");
        String room = scanner.nextLine();

        Address address = new Address();
        address.setCity(city);
        address.setState(state);
        address.setZip(zip);
        address.setStreet(street);
        address.setHouse(house);
        address.setRoom(room);

        Person person = new Person(name,surname, address,birthDay,birthMonth,birthYear);
        Employee employee = new Employee(person, appointment, salary);
        for (int i = 0; i < employees.length; i++) {
            if(employees.length == 0){
                employees[i] = employee;
                break;
            }
            if (employees[i] != null){continue;}
            employees[i] = employee;
            break;
        }
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

    }
}
