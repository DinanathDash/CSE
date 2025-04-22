public class Assignment_2 {
    public static void main(String[] args) {
        int r=Integer.parseInt(args[0]);
        int h=Integer.parseInt(args[1]);
        double A=(2*Math.PI*Math.pow(r,2)+(2*Math.PI*r*h));
        System.out.println("Let the r:"+r+" and h:"+h);
        System.out.println("Surface Area of the Cylinder: "+A);
    }
}