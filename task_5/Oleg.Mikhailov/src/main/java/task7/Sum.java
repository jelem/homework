package task7;


public class Sum {
    public static void main(String[] args) {

        String myNumber = "555555";
        int sum = 0;
        int sum2 = 0;
        if (myNumber.length()>1) {
            int[] num = new int[myNumber.length()];
            char[] myCharArray = myNumber.toCharArray();
            for (int i = 0; i < myNumber.length(); i++) {
                num[i] = Character.getNumericValue(myCharArray[i]);
            }

            for (int i = 0; i < myNumber.length(); i++) {
                sum = sum + num[i];
            }
                if(sum>9){

                    String str = Integer.toString(sum); //cумму преобразовал в строку и повторяю повторно

                    int[] tmp = new int[str.length()];
                    char[] mySum = str.toCharArray();
                    for (int i = 0; i < mySum.length; i++) {
                        tmp[i] = Character.getNumericValue(mySum[i]);
                    }
                    for (int i = 0; i < mySum.length; i++) {
                         sum2 = sum2 + tmp[i];
                    }
                    System.out.println(sum2);
                }else{
                    System.out.println(sum);
                }

        }else{
                System.out.println(myNumber);
            }





        }
    }

