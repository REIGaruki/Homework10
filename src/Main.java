public class Main {
    public static void main(String[] args) {
        String task = "Задание 1";
        String secondName = "Иванов";
        String middleName = "Иванович";
        String firstName ="Иван";
        System.out.println(task);
        System.out.println("Ф.И.О. сотрудника - " + fullName(firstName, middleName, secondName));
        System.out.println(task.replace('1', '2'));
        firstName = "Гадя";
        middleName = "Петрович";
        secondName = "Хренова";
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " +
                fullName(firstName, middleName, secondName).toUpperCase());
        System.out.println(task.replace('1', '3'));
        firstName = "Семён";
        middleName = "Семёнович";
        secondName = "Горбунков";
        System.out.println("Данные Ф.И.О. сотрудника - " +
                fullName(firstName, middleName, secondName).replace('ё', 'е'));
    }
    public static String fullName(String firstName, String middleName, String secondName) {
        String fullName;
        fullName = secondName + " " + firstName + " " + middleName;
        return fullName;
    }
}