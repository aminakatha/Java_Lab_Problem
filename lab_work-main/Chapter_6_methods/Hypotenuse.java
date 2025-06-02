package Chapter_6;

import java.util.Scanner;


class Hypotenuse {
    public  double calHypotenuse(double a,double b){
        double p=  (Math.pow(a,2.0)+Math.pow(b,2.0));
       double answer=Math.sqrt(p);
return  answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hypotenuse ob=new Hypotenuse();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("The answer is : "+ob.calHypotenuse(a,b));
    }


}
