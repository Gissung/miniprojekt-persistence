package modullager;

public class Order {
	private Customer c;
	private orderLine ol;

	public Order(Customer c, orderLine ol) {
		this.c = c;
		this.ol = ol;
	}

	public Customer getC() {
		return c;
	}

	public orderLine getOl() {
		return ol;
	}

	public void getInvoiceNumber(int invoiceNumber) {

	}

}
