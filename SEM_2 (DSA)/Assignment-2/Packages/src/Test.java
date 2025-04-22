package Packages.src;
public class Test extends Student {
    public int mark1;
    public int mark2;
    public void input(String name, int roll, int mark1, int mark2) {
        super.input(name, roll);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public void output() {
        super.output();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
