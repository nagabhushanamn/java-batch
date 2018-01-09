package com.ex;

class BankBalanceException extends Exception {
	@Override
	public String getMessage() {
		return "Txn Failed , less balance";
	}
}

/// ----------------------------------------------------------------------
class TxrImpl {
	public void txr(String fromAccNum, String toAccNum, double amount) throws BankBalanceException {
		// load from & to accounts
		// debit & credit
		double fromAccBalance = 100.00;
		if (fromAccBalance < amount)
			throw new BankBalanceException();
		// update accounts
		// return status
	}
}
/// ----------------------------------------------------------------------

class TicketBooking {

	TxrImpl bankTxr = new TxrImpl();

	public void bookTicket() {
		try {
			bankTxr.txr("1", "2", 50.00);
			System.out.println("Ticket booked...");
		} catch (BankBalanceException e) {
			// e.printStackTrace();
			System.out.println("Booking Failed..." + e.getMessage());
		}
	}
}

public class BankApp {

	public static void main(String[] args) {

		TicketBooking ticketBooking = new TicketBooking();
		ticketBooking.bookTicket();

	}

}
