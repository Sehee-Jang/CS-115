package week3;

public interface Payable {
	enum  PayType{
		CASH,
		CARD,
		PHONE
	}// end of enum payGrade

	public String getPayType();
	
	public void setPayType(String pt);

}
