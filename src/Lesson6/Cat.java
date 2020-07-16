package Lesson6;

public class Cat extends Animal {

    protected static final double DEFAULTMAXSIZERUN = 200;
    protected static final double DEFAULTMAXSIZESAIL = 0;
    protected static final double DEFAULTMAXSIZEJUMP = 2;

    public Cat(String name, int age, double maxSizeRun, double maxSizeSail, double maxSizeJump) {
        super(name, age);
        this.maxSizeRun = maxSizeRun;
        this.maxSizeSail = maxSizeSail;
        this.maxSizeJump = maxSizeJump;
    }

    public Cat(String name, int age){
        this(name, age, DEFAULTMAXSIZERUN, DEFAULTMAXSIZESAIL, DEFAULTMAXSIZEJUMP);
    }

    public Cat(String name, int age, double maxSizeRun){
        this(name, age, maxSizeRun, DEFAULTMAXSIZESAIL, DEFAULTMAXSIZEJUMP);
    }

    public Cat(String name, int age, double maxSizeRun, double maxSizeSail){
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
        return (maxSizeJump >= size);
    }
}
