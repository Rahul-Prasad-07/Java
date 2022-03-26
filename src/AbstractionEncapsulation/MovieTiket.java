package AbstractionEncapsulation;

public class MovieTiket {
        public static void main(String[] args) {
            MovieTicket ticket = new MovieTicket(10);
            int totalPrice = ticket.calculateCost(100);
            System.out.println(totalPrice);
        }
    }

    class MovieTicket {
        public int singleTicketCost;

        public MovieTicket(int singleTicketCost) {
            this.singleTicketCost = singleTicketCost;
        }

        public int calculateCost(int quantity) {
            return quantity * singleTicketCost;
        }
}
