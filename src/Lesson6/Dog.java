package Lesson6;

public class Dog extends Animal{

    protected static final double DEFAULTMAXSIZERUN = 500;
    protected static final double DEFAULTMAXSIZESAIL = 10;
    protected static final double DEFAULTMAXSIZEJUMP = 0.5;

    public Dog(String name, int age, double maxSizeRun, double maxSizeSail, double maxSizeJump) {
        super(name, age);
        this.maxSizeRun = maxSizeRun;
        this.maxSizeSail = maxSizeSail;
        this.maxSizeJump = maxSizeJump;
    }

    public Dog(String name, int age){
        this(name, age, DEFAULTMAXSIZERUN, DEFAULTMAXSIZESAIL, DEFAULTMAXSIZEJUMP);
    }

    public Dog(String name, int age, double maxSizeRun){
        this(name, age, maxSizeRun, DEFAULTMAXSIZESAIL, DEFAULTMAXSIZEJUMP);
    }

    public Dog(String name, int age, double maxSizeRun, double maxSizeSail){
        this(name, age, maxSizeRun, maxSizeSail, DEFAULTMAXSIZEJUMP);
    }

    @Override
    public boolean run(double size) {
        return maxSizeRun >= size;
    }

    @Override
    public boolean sail(double size) {
        return maxSizeSail >= size;
    }

    @Override
    public boolean jump(double size) {
        return maxSizeJump >= size;
    }
}
