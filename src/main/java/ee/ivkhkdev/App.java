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
                employee.getPerson().getAge(),
                employee.getSalary(),
                employee.getPerson().getAddress().getState(),
                employee.getPerson().getAddress().getCity(),
                employee.getPerson().getAddress().getStreet(),
                employee.getPerson().getAddress().getHouse(),
                employee.getPerson().getAddress().getRoom()
        );

    }
}
