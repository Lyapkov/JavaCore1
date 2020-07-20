package Lesson7;

public interface Observed {
    public void addObserver(Observer observer);
    public void remoteObserver(Observer observer);
    public void notifyObservers();
}
