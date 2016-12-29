package task_6;
public class Binary {
    public static void main(String[] args) {
        int number = 256;
        String binary = "";
        while(number != 0){
            binary = (number % 2) + binary;
            number = number / 2;
        }
        System.out.println(binary);
    }
}
