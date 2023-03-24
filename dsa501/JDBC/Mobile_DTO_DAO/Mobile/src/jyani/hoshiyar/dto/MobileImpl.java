package jyani.hoshiyar.dto;

import java.time.LocalDate;

public class MobileImpl implements Mobile {
	private int id;
	private String model_no;
	private String company;
	private int price;
    private LocalDate MFGdate;
	
    public MobileImpl() {}
    
    
	public MobileImpl(String model_no, String company, int price, LocalDate MFGdate) {
		this.model_no = model_no;
		this.company = company;
		this.price = price;
		this.MFGdate = MFGdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getMFGdate() {
		return MFGdate;
	}

	public void setMFGdate(LocalDate mFGdate) {
		MFGdate = mFGdate;
	}


	@Override
	public String toString() {
		return "MobileImpl [id=" + id + ", model_no=" + model_no + ", company=" + company + ", price=" + price
				+ ", MFGdate=" + MFGdate + "]";
	}

	
}
