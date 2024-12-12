package ticketbooking;

public class TicketBooking extends UserType {
	int ticketprice = 700;

	protected TicketBooking(int user) {
		super(user);
	}


	private void buyTicket(String name, int discount) {
		if (discount == 10)
			System.out.println("student=======" + "700");
		else
			System.out.println("student=======" + "800");

	}

	public static void main(String[] args) {
		TicketBooking booking = new TicketBooking(1);
		booking.buyTicket("gopal", booking.flag);
	}

}
