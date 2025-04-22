import static java.lang.Math.sin;
public class A3 {
    public static void cal_sin(float n){	
        float accuracy = (float) 0.0001, denominator, sinx, sinval;
        n = n * (float)(3.142 / 180.0);
        float x1 = n;
        sinx = n;
        sinval = (float)sin(n);	
        int i = 1;
        do{
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * n * n / denominator;
            sinx = sinx + x1;
            i = i + 1;
        } 
        while (accuracy <= sinval - sinx);
        System.out.println(sinx);
    }
	public static void main(String[] args) {
		float n = 90;
	    cal_sin(n);
	}
}
