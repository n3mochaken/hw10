import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    /**
     * Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате. Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
     * <p>
     * Напишите четыре строки:
     * <p>
     * С именем
     * firstName
     * — для хранения имени.
     * С именем
     * middleName
     * — для хранения отчества.
     * С именем
     * lastName
     * — для хранения фамилии.
     * С именем
     * fullName
     * — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
     * Выведите в консоль фразу: «Ф. И. О. сотрудника — …».
     * <p>
     * В качестве данных для задачи используйте Ivanov Ivan Ivanovich.
     */
    public static String task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Фамилию, Имя, Отчество, через Enter");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println(" «Ф. И. О. сотрудника —  " + fullName);
        return (fullName);
    }

    /**
     * Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
     * <p>
     * Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan Ivanovich на полностью заглавные буквы.
     * <p>
     * В качестве строки с исходными данными используйте строку
     * fullName
     * .
     * <p>
     * Результат программы выведите в консоль в формате: «Данные Ф. И. О. сотрудника для заполнения отчета — …».
     */
    public static void task2() {
        String toUpper = task1().toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + toUpper);
    }

    /**
     * Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».
     * <p>
     * В качестве исходных данных используйте строку
     * fullName
     * и данные в ней — «Иванов Семён Семёнович».
     * <p>
     * Выведите результат программы в консоль в формате: «Данные Ф. И. О. сотрудника — ...».
     */
    public static void task3() {
        String replacedSymbol = task1().replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + replacedSymbol);
    }

}