public class Tips{

public static double calculate (String level, double price){
	double result;

	switch (level) {
		case "terrible":
	result = 0;
		break;

		case "poor":
	result = ( price / 100 ) * 5;
		break;

		case "good":
	result = ( price / 100 ) * 10;
		break;

		case "great":
	result = ( price / 100 ) * 15;
		break;

		case "exellent":
	result = ( price / 100 ) * 20;
		break;

	default:
	result = 0;
}
return result;
}}
