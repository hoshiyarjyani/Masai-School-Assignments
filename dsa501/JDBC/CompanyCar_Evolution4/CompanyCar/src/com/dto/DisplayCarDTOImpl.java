package com.dto;

public class DisplayCarDTOImpl implements DisplayCarDTO {

	String car_id;
	String model_name;
	int price;
	int total_seats;
	String company_name;
	int turnover_in_crores;

	public DisplayCarDTOImpl(String car_id, String model_name, int price, int total_seats, String company_name,
			int turnover_in_crores) {
		super();
		this.car_id = car_id;
		this.model_name = model_name;
		this.price = price;
		this.total_seats = total_seats;
		this.company_name = company_name;
		this.turnover_in_crores = turnover_in_crores;
	}
	@Override
	public String getCar_id() {
		return car_id;
	}
	@Override
	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}
	@Override
	public String getModel_name() {
		return model_name;
	}
	@Override
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int getTotal_seats() {
		return total_seats;
	}
	@Override
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	@Override
	public String getCompany_name() {
		return company_name;
	}
	@Override
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	@Override
	public int getTurnover_in_crores() {
		return turnover_in_crores;
	}
	@Override
	public void setTurnover_in_crores(int turnover_in_crores) {
		this.turnover_in_crores = turnover_in_crores;
	}

	@Override
	public String toString() {
		return "Car Id: " + car_id + "  Model Name: " + model_name + " Price: " + price + ", Total Seats: "
				+ total_seats + " Company Name: " + company_name + " Company Turnover: " + turnover_in_crores;
	}

}
