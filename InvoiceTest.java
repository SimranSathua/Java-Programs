//14
class Invoice{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Invoice(String pnum, String pdesc, int qty, double pr)
	{
		if(pnum!= null)
			partNumber=pnum;
		else
			partNumber="0";
		if(pdesc != null)
			partDescription= pdesc;
		else
			partDescription= "0";
		if(pr >0.0)
			price=pr;
		else
			price=0;
		
	}
	public String getpartNum() {
		return partNumber;
		}
	
	public String getpartDesc() {
		return partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setpartNum(String pNum) {
		
	}
	public void setpartDesc(String pDesc) {
		
	}
	public void setQuantity(int qty) {
		
	}
	public void setPrice	(double prc) {
		
	}
	public double getInvoiceAmount() {
		return(double)quantity*price;
	}
}
public class InvoiceTest {

	public static void main(String[] args) {
Invoice i1= new Invoice("11", "blue pen",200, 199);
Invoice i2= new Invoice("22", "pen box",200, 169);

		System.out.printf("Invoice 1: %s\t%s\t%d\t$%.2f\n",
				i1.getpartNum(),i1.getpartDesc(),i1.getQuantity(),i1.getPrice());
		System.out.printf("Invoice 2: %s\t%s\t%d\t$%.2f\n",
				i2.getpartNum(),i2.getpartDesc(),i2.getQuantity(),i2.getPrice());
		
	}

}
