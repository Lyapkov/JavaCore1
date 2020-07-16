package Lesson6;

public abstract class Animal {

    protected String name;
    protected int age;
    protected double maxSizeRun;
    protected double maxSizeSail;
    protected double maxSizeJump;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Animal(String name){
        this(name, 0);
    }

    public abstract boolean run(double size);
    public abstract boolean sail(double size);
    public abstract boolean jump(double size);

}
