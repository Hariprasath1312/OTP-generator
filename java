import java.util.Random;
import java.util.Scanner;

public class otpgenerator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Plz......Enter a size of the OTP \' Is eithe in 4 digit or in 6 Digit\'");
        int otp_len=sc.nextInt();
        otpgenerator gen = new otpgenerator();
        gen.generator(otp_len);
        sc.close();
    }
    public static void generator(int otp_len){
        Random r=new Random();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<otp_len;i++){
            int n=r.nextInt(10);
            b.append(n);
        }
        System.out.println("Generator OPT is : "+b);
    }
}
