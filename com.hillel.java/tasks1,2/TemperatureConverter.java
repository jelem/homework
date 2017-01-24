package tasks;

/**
 * Created by Anna on 23.01.2017.
 */
public class TemperatureConverter {
    int temperature1;
    int temperature2;

    public String convertTemp(int temperature1,int temperature2, char convertToC, char convertToF){
        if (convertToC == 'F' || convertToC == 't'){
            this.temperature1 = (temperature1-32)*5/9;
            return String.valueOf(this.temperature1)+" temperature according to C";
        } else if(convertToF == 'C' || convertToF == 'c'){
            this.temperature2 = (temperature2*9/5+32);
            return String.valueOf(this.temperature2)+" temperature according to F";
        } else return "Неверно выбран аргумент";

    }
}
