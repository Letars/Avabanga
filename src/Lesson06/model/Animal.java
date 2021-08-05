package Lesson06.model;

public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
}

    public void run(int run) {
        if (run <= maxRun) {
            System.out.println(name + " пробежал: " + run + " м. (max:" + maxRun + ")");
        }else {
                System.out.println(name + "так быстро не умеет");
            }
        }

        public void swim ( int swim){
        if (swim <= maxSwim){
            System.out.println(name + " проплыл: " + swim + " м. (max:" + maxSwim + ")");
        }else {
            System.out.println(name + "так быстро не умеет");
        }
    }
}
