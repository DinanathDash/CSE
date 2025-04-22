public class Q61 {
    public static void main(String[] args){
        int x=12, y=7, z=9; // Line 5
        z= (x<y)? (x > z ? z: x) : (y < z ? z: y);
        System.out.println(z);
    }
}
