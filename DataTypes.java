/**
 * Created by ника1 on 29.06.2016.
 */
import javax.sound.sampled.Line;
import java.util.Scanner;
public class DataTypes {
    public static void main (String [] args) {
        Scanner a = new Scanner (System.in);
        System.out.print ("Введите любое число ");
        double var = a.nextDouble(); //преобразование по сужению типов данных

        if(var>=-128 & var<=127){
            System.out.println ("Ваше число в формате byte " +(byte)var);
        } else {System.out.println ("Ваше число выходит за рамки допустимого диапазона для формата byte");}

        if(var>=-32768 & var<=32767){
            System.out.println ("Ваше число в формате short " +(short)var);
        } else {System.out.println ("Ваше число выходит за рамки допустимого диапазона для формата short");}

        if(var>=-2147483648 & var<=2147483647){
            System.out.println ("Ваше число в формате int " +(int)var);
        } else {System.out.println ("Ваше число выходит за рамки допустимого диапазона для формата int");}

        if(var>=-9E+18 & var<=9E+18){
            System.out.println ("Ваше число в формате long " +(long)var);
        } else {System.out.println ("Ваше число выходит за рамки допустимого диапазона для формата long");}

        if(var>=-3.4E+38 & var<=3.4E+38){
            System.out.println ("Ваше число в формате float " +(float)var);
        } else {System.out.println ("Ваше число выходит за рамки допустимого диапазона для формата float");}

        if(var>=-1.7E+308 & var<=1.7E+308){
            System.out.println ("Ваше число в формате double " +var);}

        System.out.println ("Ваше число в формате char " +(char)var);

    }
}
