package ee.ivkhkdev;

public class App {

    public void run(){

        Address address = new Address();
        address.setCity("Йыхви");
        address.setState("Ида-Вирумаа");
        address.setZip("41536");
        address.setStreet("Нарвское шоссе");
        address.setHouse("80");
        address.setRoom("20");

        Person person = new Person("Ivan","Ivanov", address,10,10,2000);
        Employee employee = new Employee(person, "Директор", "3000");
        System.out.printf("Наш работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s",
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
        Address addressSepp = new Address();
        addressSepp.setCity("Силламяэ");
        addressSepp.setState("Ида-Вирумаа");
        addressSepp.setZip("40533");
        addressSepp.setStreet("Виру");
        addressSepp.setHouse("9");
        addressSepp.setRoom("24");

        Person personSepp = new Person("Олег","Сидоров", addressSepp,1,1,2001);
        Employee employeeSepp = new Employee(personSepp, "Электрослесарь", "1,500");
        System.out.printf("Наш работник%nИмя: %s,%n Фамилия %s,%n должность: %s,%n возраст: %d,%n зарплата: %s.%n Проживает по адресу: %s, %s, %s, %s - %s",
                employeeSepp.getPerson().getName(),
                employeeSepp.getPerson().getSurname(),
                employeeSepp.getAppointment(),
                employeeSepp.getPerson().age(),
                employeeSepp.getSalary(),
                employeeSepp.getPerson().getAddress().getState(),
                employeeSepp.getPerson().getAddress().getCity(),
                employeeSepp.getPerson().getAddress().getStreet(),
                employeeSepp.getPerson().getAddress().getHouse(),
                employeeSepp.getPerson().getAddress().getRoom()
        );

    }
}
