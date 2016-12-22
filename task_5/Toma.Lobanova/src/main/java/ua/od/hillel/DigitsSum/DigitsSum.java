package ua.od.hillel.DigitsSum;

public class DigitsSum {
    public static void main(String... args){
        long number=34567867890234L;
        while(number/10L!=0){
            number=(number+"").chars().map(item ->item-'0').sum();
        }
        System.out.println(number);
    }
}
