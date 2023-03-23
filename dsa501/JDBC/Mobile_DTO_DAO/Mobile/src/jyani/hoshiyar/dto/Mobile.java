package jyani.hoshiyar.dto;

import java.time.LocalDate;

public interface Mobile {
	public int getId();

	public void setId(int id);

	public String getModel_no();

	public void setModel_no(String model_no);

	public String getCompany();

	public void setCompany(String company);

	public int getPrice();

	public void setPrice(int price);

	public LocalDate getMFGdate();

	public void setMFGdate(LocalDate mFGdate);
	
}
