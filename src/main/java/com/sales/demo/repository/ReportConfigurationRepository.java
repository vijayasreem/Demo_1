package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sales.demo.model.ReportConfiguration;

public interface ReportConfigurationRepository extends JpaRepository<ReportConfiguration, Long>{
	
	//fetch vendors list from the database based on sector
	@Query("SELECT v FROM Vendors v WHERE v.sector = :sector")
	List<Vendors> findVendorsBySector(String sector);
	
	//fetch request information from the database
	@Query("SELECT r FROM Request r")
	List<Request> findAllRequests();
	
	//fetch schedule information from the database
	@Query("SELECT s FROM Schedule s")
	List<Schedule> findAllSchedules();
	
	//call the file generation method based on the request
	@Query("SELECT f FROM FileGeneration f WHERE f.request = :request")
	FileGeneration generateFile(Request request);
	
	//call the request fetch method if the schedule date and time has passed
	@Query("SELECT r FROM Request r WHERE r.schedule.date < :date")
	Request fetchRequest(Date date);
	
	//1 minute timer to call the fetch schedule information method
	@Query("SELECT s FROM Schedule s WHERE s.date < :date")
	Schedule fetchSchedule(Date date);
	
	//send an email with the generated file as an attachment
	public void sendEmailWithAttachment(FileGeneration file);
	
	//upload the generated file to an FTP server
	public void uploadToFTP(FileGeneration file);
	
	//upload the generated file to a Sharepoint server
	public void uploadToSharepoint(FileGeneration file);
	
	//generate PDF and CSV files with the vendors data using iTextSharp and StringBuilder
	public void generatePDFandCSV(List<Vendors> vendors);

}