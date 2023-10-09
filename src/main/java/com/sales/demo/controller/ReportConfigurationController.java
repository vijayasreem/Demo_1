Spring Boot Controller Class

package com.sales.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.model.FileGeneration;
import com.sales.demo.model.Request;
import com.sales.demo.model.Schedule;
import com.sales.demo.model.Vendors;
import com.sales.demo.service.ReportConfigurationService;

@RestController
@RequestMapping("/configure")
public class ReportConfigurationController {
    
    @Autowired
    private ReportConfigurationService reportConfigurationService;

    @GetMapping("/fetchVendors")
    public List<Vendors> getVendorsBySector(@RequestParam String sector) {
        return reportConfigurationService.getVendorsBySector(sector);
    }

    @GetMapping("/fetchRequests")
    public List<Request> getAllRequests() {
        return reportConfigurationService.getAllRequests();
    }

    @GetMapping("/fetchSchedules")
    public List<Schedule> getAllSchedules() {
        return reportConfigurationService.getAllSchedules();
    }

    @GetMapping("/generateFile")
    public FileGeneration generateFile(@RequestParam Request request) {
        return reportConfigurationService.generateFile(request);
    }

    @GetMapping("/fetchRequest")
    public Request fetchRequest(@RequestParam Date date) {
        return reportConfigurationService.fetchRequest(date);
    }

    @GetMapping("/fetchSchedule")
    public Schedule fetchSchedule(@RequestParam Date date) {
        return reportConfigurationService.fetchSchedule(date);
    }

    @GetMapping("/sendEmail")
    public void sendEmailWithAttachment(@RequestParam FileGeneration file) {
        reportConfigurationService.sendEmailWithAttachment(file);
    }

    @GetMapping("/uploadFTP")
    public void uploadToFTP(@RequestParam FileGeneration file) {
        reportConfigurationService.uploadToFTP(file);
    }

    @GetMapping("/uploadSharepoint")
    public void uploadToSharepoint(@RequestParam FileGeneration file) {
        reportConfigurationService.uploadToSharepoint(file);
    }

    @GetMapping("/generatePDFandCSV")
    public void generatePDFandCSV(@RequestParam List<Vendors> vendors) {
        reportConfigurationService.generatePDFandCSV(vendors);
    }

}