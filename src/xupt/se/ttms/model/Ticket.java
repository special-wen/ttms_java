﻿package xupt.se.ttms.model;

public class Ticket {
	
	private int ticket_id=0;
	private int seat_id;
	private int sched_id;
	private int ticket_price;
	private int ticket_status;
	private String ticket_locket_time;
	
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public int getSched_id() {
		return sched_id;
	}
	public void setSched_id(int sched_id) {
		this.sched_id = sched_id;
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public String getTicket_date() {
		return ticket_locket_time;
	}
	public void setTicket_date(String ticket_date) {
		this.ticket_locket_time = ticket_date;
	}
	public int getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(int ticket_times) {
		this.ticket_status = ticket_times;
	}
	public int getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(int ticket_sold) {
		this.ticket_price = ticket_sold;
	}
	
}
