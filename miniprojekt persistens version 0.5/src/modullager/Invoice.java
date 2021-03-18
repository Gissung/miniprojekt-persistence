package modullager;

public class Invoice {
	private int invoiceNumber;
	private String paymentDate;
	private int totalPrice;
	private int freight;

	public Invoice(int invoiceNumber, String paymentDate, int totalPrice, int freight) {
		this.invoiceNumber = invoiceNumber;
		this.paymentDate = paymentDate;
		this.totalPrice = totalPrice;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}
}
