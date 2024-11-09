package com.org.myprj;

public class SignUpServletside 
{
	String email_dt;
	String subject;
	String priority;
	String activity_desc;
	String target_dt;
	String incident_type;
	int product_cd;
	int assign_to;
	String live_dt;
	String status;
	int ticket_id;
	int emp_cd;
	
	int New,In_Progress,Solution_Provided,Awaiting_Customer,Awaiting_BIPL,Enhancement_Required,Close,On_Hold_By_Customer,UAT_Completed,LIVE;
	
	public int getNew() {
		return New;
	}
	public void setNew(int new1) {
		New = new1;
	}
	public int getLIVE() {
		return LIVE;
	}
	public void setLIVE(int lIVE) {
		LIVE = lIVE;
	}
	public int getUAT_Completed() {
		return UAT_Completed;
	}
	public void setUAT_Completed(int uAT_Completed) {
		UAT_Completed = uAT_Completed;
	}
	public int getOn_Hold_By_Customer() {
		return On_Hold_By_Customer;
	}
	public void setOn_Hold_By_Customer(int on_Hold_By_Customer) {
		On_Hold_By_Customer = on_Hold_By_Customer;
	}
	public int getClose() {
		return Close;
	}
	public void setClose(int close) {
		Close = close;
	}
	public int getEnhancement_Required() {
		return Enhancement_Required;
	}
	public void setEnhancement_Required(int enhancement_Required) {
		Enhancement_Required = enhancement_Required;
	}
	public int getAwaiting_BIPL() {
		return Awaiting_BIPL;
	}
	public void setAwaiting_BIPL(int awaiting_BIPL) {
		Awaiting_BIPL = awaiting_BIPL;
	}
	public int getAwaiting_Customer() {
		return Awaiting_Customer;
	}
	public void setAwaiting_Customer(int awaiting_Customer) {
		Awaiting_Customer = awaiting_Customer;
	}
	public int getSolution_Provided() {
		return Solution_Provided;
	}
	public void setSolution_Provided(int solution_Provided) {
		Solution_Provided = solution_Provided;
	}
	public int getIn_Progress() {
		return In_Progress;
	}
	public void setIn_Progress(int in_Progress) {
		In_Progress = in_Progress;
	}

	public int getEmp_cd() {
		return emp_cd;
	}
	public void setEmp_cd(int emp_cd) {
		this.emp_cd = emp_cd;
	}
	
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getActivity_desc() {
		return activity_desc;
	}
	public void setActivity_desc(String activity_desc) {
		this.activity_desc = activity_desc;
	}
	
	public String getTarget_dt() {
		return target_dt;
	}
	public void setTarget_dt(String target_dt) {
		this.target_dt = target_dt.substring(0,10);
	}

	public String getIncident_type() {
		return incident_type;
	}
	public void setIncident_type(String incident_type) {
		this.incident_type = incident_type;
	}

	public int getProduct_cd() {
		return product_cd;
	}
	public void setProduct_cd(int product_cd) {
		this.product_cd = product_cd;
	}
	public int getAssign_to() {
		return assign_to;
	}
	public void setAssign_to(int assign_to) {
		this.assign_to = assign_to;
	}
	public String getLive_dt() {
		return live_dt;
	}
	public void setLive_dt(String live_dt) {
		this.live_dt = live_dt.substring(0,10);
	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getEmail_dt() {
		return email_dt;
	}
	public void setEmail_dt(String email_dt) {
		this.email_dt = email_dt.substring(0,10);
	}
	
}
