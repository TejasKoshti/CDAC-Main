package fi.TicketAPI.DTO;

import java.sql.Date;

import fi.TicketAPI.Entity.Category;
import fi.TicketAPI.Entity.Status;

public class TicketDTO {

	Integer id;
	
	String phoneNo;
	
	Category category;
	
	String issueDetail;
	
	Status status;
	
	String resolution;

	Date createdate;

	Date resolvedate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getIssueDetail() {
		return issueDetail;
	}

	public void setIssueDetail(String issueDetail) {
		this.issueDetail = issueDetail;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getResolvedate() {
		return resolvedate;
	}

	public void setResolvedate(Date resolvedate) {
		this.resolvedate = resolvedate;
	}

	public TicketDTO(Integer id, String phoneNo, Category category, String issueDetail, Status status,
			String resolution, Date createdate, Date resolvedate) {
		super();
		this.id = id;
		this.phoneNo = phoneNo;
		this.category = category;
		this.issueDetail = issueDetail;
		this.status = status;
		this.resolution = resolution;
		this.createdate = createdate;
		this.resolvedate = resolvedate;
	}

	public TicketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TicketDTO [id=" + id + ", phoneNo=" + phoneNo + ", category=" + category + ", issueDetail="
				+ issueDetail + ", status=" + status + ", resolution=" + resolution + ", createdate=" + createdate
				+ ", resolvedate=" + resolvedate + "]";
	}


	

}
