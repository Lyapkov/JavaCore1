package Lesson5;

public class Main {

    private static final int AGE = 40;

    public static void main(String[] args){
        Person persons1 = new Person("Иван Иванов", "Тестировщик", "mail1@mail.ru", "+79000000001", 100000, 25);
        Person persons2 = new Person("Петя Иванов", "Аналитик", "mail2@mail.ru", "+79000000002", 150000, 55);
        Person persons3 = new Person("Костя Петров", "Разработчик", "mail3@mail.ru", "+79000000003", 200000, 35);
        Person persons4 = new Person("Дима Сизов", "Лид", "mail4@mail.ru", "+79000000004", 300000, 40);
        Person persons5 = new Person("Иван Петров", "Ген. дир", "mail5@mail.ru", "+79000000005", 100000000, 41);
        Person[] persons = {persons1, persons2, persons3, persons4, persons5};

        for (int i = 0; i < persons.length; i++){
            if (persons[i].getAge() > AGE)
                persons[i].showPerson();
        }
    }

}
