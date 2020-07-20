package Lesson7;

public class General {

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Кот", 5);
        Cat cat2 = new Cat("Мурзик", 7);
        Cat cat3 = new Cat("Барсик", 3);
        Cat[] cats = new Cat[] {cat1, cat2, cat3};
        Plate plate1 = new Plate("Миска барска", 15);
        Plate plate2 = new Plate("Миска мурзика", 10);
        Plate[] plates = {plate1, plate2};
        plate1.addObserver(cat1);
        plate2.addObserver(cat2);

        for (Cat cat: cats) {
            cat.eat(plates);
            for (Plate plate: plates) {
                plate.info();
            }

        }
        cat1.addAppetite(5);
        cat1.eat(plates);
        plate1.info();
        plate2.info();

        Thread.sleep(3000);

    }
}
