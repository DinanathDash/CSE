import java.util.Scanner;
class Complex {
    int real, imag;
    public void setData(int r, int i) {
        real = r;
        imag = i;
    }
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
    public Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = real + c.real;
        temp.imag = imag + c.imag;
        return temp;
    }
}
public class Q3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.print("Enter real and imaginary parts of first complex number:");
        int r1 = sc.nextInt(), i1 = sc.nextInt();
        System.out.print("Enter real and imaginary parts of second complex number:");
        int r2 = sc.nextInt(), i2 = sc.nextInt();
        c1.setData(r1, i1);
        c2.setData(r2, i2);
        sc.close();
        Complex sum = c1.add(c2);
        System.out.print("Sum of two complex numbers is: ");
        sum.display();
    }
}
