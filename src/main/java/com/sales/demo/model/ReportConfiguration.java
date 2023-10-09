package com.sales.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "report_configuration")
public class ReportConfiguration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "vendors_id")
	private List<Vendors> vendors;
	
	@OneToMany
	@JoinColumn(name = "request_id")
	private List<Request> requests;
	
	@OneToMany
	@JoinColumn(name = "schedule_id")
	private List<Schedule> schedules;
	
	@OneToOne
	@JoinColumn(name = "file_generation_id")
	private FileGeneration fileGeneration;
	
	@Column(name = "date_created")
	private Date dateCreated;
	
	public ReportConfiguration() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Vendors> getVendors() {
		return vendors;
	}
	
	public void setVendors(List<Vendors> vendors) {
		this.vendors = vendors;
	}
	
	public List<Request> getRequests() {
		return requests;
	}
	
	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	
	public List<Schedule> getSchedules() {
		return schedules;
	}
	
	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
	
	public FileGeneration getFileGeneration() {
		return fileGeneration;
	}
	
	public void setFileGeneration(FileGeneration fileGeneration) {
		this.fileGeneration = fileGeneration;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}