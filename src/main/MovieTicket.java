package src.main;

public class MovieTicket {
    public int CaculateTicketPrice(int age, String day, boolean VIPornot){
        int price;

        if (age >= 0 && age <= 10) {
            price = 0;
        } else if (age > 10 && age <= 22) {
            price = 60000;
        } else if (age > 22){
            price = 100000;
        }else{
            return -1;
        }

        if (day.equalsIgnoreCase("Weekend")) {
            price += 10000;
        }
        if (VIPornot) {
            price += 20000;
        }

        return price;
    }
}
