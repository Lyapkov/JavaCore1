package Lesson7;

import java.util.List;

public class Cat implements Observer{
    protected final String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat (Plate[] plates) {
        for (Plate plate: plates) {
            if (plate.getFood() >= appetite) {
                satiety = true;
                doEat(plate);
                break;
            }
            else {
                doEat(plate, plate.getFood());
            }
        }
    }

    public boolean doEat(Plate plate) {
        if (plate.isDecreaseFood(appetite)){
            appetite = 0;
            return true;
        }
        return false;
    }

    public boolean doEat(Plate plate, int food) {
        if (plate.isDecreaseFood(food))
            appetite -= food;
        return false;
    }

    public void addAppetite(int countAppetite){
        this.appetite = countAppetite;
    }

    @Override
    public void handleEvent(Plate plate) {
        System.out.println(name + " похоже в тарелке " + plate.getName() + " изменилось количество корма, теперь в тарелке " + plate.getFood() + " корма!");
    }

}
