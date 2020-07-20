package Lesson7;

import java.util.ArrayList;
import java.util.List;

public class Plate implements Observed{
    private String name;
    private int food;
    List<Observer> subscribers = new ArrayList<>();

    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public Plate() {
        this(null, 0);
    }

    public void addFood(int food) {
        this.food += food;
        notifyObservers();
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate " + name + " {food=" + food +
                '}';
    }

    public int getFood() {
        return food;
    }

    public boolean isDecreaseFood(int foodCount) {
        if (this.food >= foodCount){
            this.food -= foodCount;
            notifyObservers();
            return true;
        }
        return false;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void remoteObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this);
        }
    }
}
