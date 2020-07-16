package Lesson6;

public class General {

    public static void main(String[] args){
        double sizeRun = 300;
        double sizeJump = 0.9;
        double sizeSalt = 10;

        Animal[] animals = create();
        print(animals, sizeRun, sizeSalt, sizeJump);
    }

    private static Animal[] create(){
        Animal[] animals = new Animal[4];
        Cat Barsic = new Cat("Барсик", 1);
        Cat Cot = new Cat("Кот", 10, 50, 1, 0.5);
        Dog Bob = new Dog("Бобик", 5);
        Dog Recs = new Dog("Рекс", 3, 100, 15, 1.5);
        animals[0] = Barsic;
        animals[1] = Bob;
        animals[2] = Cot;
        animals[3] = Recs;
        return animals;
    }

    private static void print(Animal[] animals, double sizeRun, double sizeSalt, double sizeJump){
        for (Animal animal: animals) {
            if (animal.run(sizeRun))
                System.out.println(animal.name + " преодолел дистанцию в " + sizeRun + " метров!");
            else
                System.out.println(animal.name + " выдохся!");
            if (animal.sail(sizeSalt))
                System.out.println(animal.name + " проплыл дистанцию в " + sizeSalt + " метров!");
            else
                System.out.println(animal.name + " утонул!");
            if (animal.jump(sizeJump))
                System.out.println(animal.name + " перепрыгнул препятствие в " + sizeJump + " метров!");
            else
                System.out.println(animal.name + " не перепрыгнул!");
        }
    }

}
