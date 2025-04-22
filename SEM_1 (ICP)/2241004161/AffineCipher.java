import java. util.Scanner;

public class AffineCipher {
    static int a,b;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            System.out.print("Enter the key to be used for encryption (a, b): ");
            a = sc. nextInt();
            b = sc.nextInt();
            String encryptedtext = encrypting( ) ;
            System.out.println("encrypted text is: " + encryptedtext);
            System.out.print("and decrypted text will be: ");
            String dec = decrypting(encryptedtext) ;
            System. out. print (dec) ;
            sc.close();        
    }

    static String encrypting(){
        String plainText ="";
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter the text to be encrypted: ");
        plainText=sc.nextLine();
        sc.close();
        String encryptedtext ="";
        
        for(int i=0; i<plainText.length(); i++) {
            char t=plainText.charAt(i);
            int charNum = (char)t-90;
            int c=(a * charNum + b)%26;
            char newc=(char)(c+90);
            encryptedtext+=newc;
        }
        return encryptedtext;
    }

    static String decrypting(String encrypt){
        String plainText ="";
        for(int i=0; i<encrypt.length(); i++){
            char c=encrypt.charAt(i);
            int charNum = (char)c-90;
            int decrypted =((modlnverse(a, 26))*(charNum-b))%26;
            char newT = (char)(decrypted+90);
            plainText += newT;
        }
        return plainText;
    }
    static int modlnverse(int a, int m){
        a=a%m;
        for(int x=1; x<=m; x++)
            if((a*x)%m==1)
                return x;
        return 1;
    }
}


// DINANATH DASH
// SEC - 2241026
// REGD NO. - 2241004161