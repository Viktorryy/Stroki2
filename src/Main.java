public class Main {
    public static void main(String[] args) {

// Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;

        System.out.println("Задание 1");
        System.out.println("ФИО сотрудника — " + fullName);

// Задание 2

        String fullName2 = "Ivanov Ivan Ivanovich";
        String fullNameUp = fullName2.toUpperCase();
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

// Задание 3

        String fullName3 = "Иванов Семён Семёнович";
        String fullNameNew = fullName3.replace("ё", "е");
        System.out.println("Задание 3");
        System.out.println("Данные ФИО сотрудника для работы в системе — " + fullNameNew);

    }

}