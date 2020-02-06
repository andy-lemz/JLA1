package Lesson3;

public class PhoneTest {
    public static void main(String[] args) {
        PhoneBook MyPhoneBook = new PhoneBook();

        MyPhoneBook.add("Ivanov", "8499-133-15-97");
        MyPhoneBook.add("Petrov", "8499-144-15-97");
        MyPhoneBook.add("Ivanov", "8499-155-15-97");
        MyPhoneBook.add("Petrov", "8499-166-15-97");
        MyPhoneBook.add("Sidorov", "8499-177-15-97");

        System.out.println(MyPhoneBook.get("Petrov"));

    }
}
