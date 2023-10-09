package com.sales.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.FileGeneration;
import com.sales.demo.model.Request;
import com.sales.demo.model.Schedule;
import com.sales.demo.model.Vendors;
import com.sales.demo.repository.ReportConfigurationRepository;

import java.util.Date;
import java.util.List;

@Service
public class ReportConfigurationService {

    @Autowired
    private ReportConfigurationRepository reportConfigurationRepository;

    public List<Vendors> getVendorsBySector(String sector) {
        return reportConfigurationRepository.findVendorsBySector(sector);
    }

    public List<Request> getAllRequests() {
        return reportConfigurationRepository.findAllRequests();
    }

    public List<Schedule> getAllSchedules() {
        return reportConfigurationRepository.findAllSchedules();
    }

    public FileGeneration generateFile(Request request) {
        return reportConfigurationRepository.generateFile(request);
    }

    public Request fetchRequest(Date date) {
        return reportConfigurationRepository.fetchRequest(date);
    }

    public Schedule fetchSchedule(Date date) {
        return reportConfigurationRepository.fetchSchedule(date);
    }

    public void sendEmailWithAttachment(FileGeneration file) {
        // Implement email sending logic
    }

    public void uploadToFTP(FileGeneration file) {
        // Implement FTP uploading logic
    }

    public void uploadToSharepoint(FileGeneration file) {
        // Implement Sharepoint uploading logic
    }

    public void generatePDFandCSV(List<Vendors> vendors) {
        // Implement PDF and CSV file generation logic
    }
}