public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача № 1");
        System.out.println("Имя сотрудника:");
        String firstName;
        firstName = " Ivan";
        System.out.println(firstName);
        System.out.println("Отчество сострудника:");
        String middleName;
        middleName = " Ivanovich";
        System.out.println(middleName);
        System.out.println("Фамилия сострудника:");
        String lastName;
        lastName = " Ivanov";
        System.out.println(lastName);
        String fullName = (lastName + firstName + middleName);
        System.out.println("Ф.И.О.сотрудника:");
        System.out.println(fullName);

        System.out.println("Задача № 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача № 3");
        fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
    }
}


