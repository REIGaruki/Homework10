public class Main {
    public static void main(String[] args) {
        String task = "Задание 1";
        String secondName = "Иванов";
        String middleName = "Иванович";
        String firstName ="Иван";
        String fullName = secondName + " " + firstName + " " + middleName;
        System.out.println(task);
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println(task.replace('1', '2'));
        System.out.println("Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        System.out.println(task.replace('1', '3'));
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName.replace('ё', 'е'));
    }
}