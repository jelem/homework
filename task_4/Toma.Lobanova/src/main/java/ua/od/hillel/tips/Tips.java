package ua.od.hillel.tips;

public class Tips{
	public static void main(String... args){
		if (args.length == 0){
			System.out.println("Please, input the amount of your order and the quality for the service");
			return;
		}
		double amount = Double.parseDouble(args[0]);
		String service = args[1];
		System.out.println("You should leave " + calculateTip(amount, service) + " US for the service");
	}
	
		public static int calculateTip(double amount, String rating) {
        int percent;
        switch (rating) {
            case "terrible":
                percent = 0;
                break;
            case "poor":
                percent = 5;
                break;
            case "good":
                percent = 10;
                break;
            case "great":
                percent = 15;
                break;
            case "excellent":
                percent = 20;
                break;
            default: {
                System.out.println("There is no such service rating");
                return 0;
            }
        }
        return (int)Math.ceil(amount * percent / 100);
    }
}