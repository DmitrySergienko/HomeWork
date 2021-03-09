package Lesson5;

public class Main {
    public static void main(String[] args) {
        oldEmployee();

    }

    private static void oldEmployee() {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        empArray[1] = new Employee("Petrov Ivan", "Engineer", "ivivan@mailbox.com", "892312555", 40000, 40);
        empArray[2] = new Employee("Osipov Kiril", "Engineer", "ivivan@mailbox.com", "892555512", 30000, 50);
        empArray[3] = new Employee("Kuritzen Ivan", "Engineer", "ivivan@mailbox.com", "892355512", 30000, 35);
        empArray[4] = new Employee("Ptrov Oleg", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 34);
//фильтрую массив объектов, вывожу на печать
        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].age > 40){
                System.out.println(empArray[i].info());
            }
        }
    }

}
