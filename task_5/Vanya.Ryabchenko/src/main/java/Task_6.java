public class Task_6 {
    public static void main(String[] args) {
        int number = 567;
        int residue = 0;
        String binaryCode = "";
        while (number >= 2) {
            residue = number % 2;
            binaryCode = residue + binaryCode;
            number = number / 2;
        }
        System.out.println(binaryCode);
    }
}
