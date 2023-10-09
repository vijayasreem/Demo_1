package com.sales.demo.controller;

import com.sales.demo.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {

    private final VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("/vendors/{sector}")
    public List<Vendor> getVendorsBySector(@PathVariable String sector) {
        return vendorService.getVendorsBySector(sector);
    }

    @GetMapping("/vendors/{sector}/pdf")
    public void generatePdfFileBySector(@PathVariable String sector) {
        vendorService.generatePdfFileBySector(sector);
    }

    @GetMapping("/vendors/{sector}/csv")
    public void generateCsvFileBySector(@PathVariable String sector) {
        vendorService.generateCsvFileBySector(sector);
    }

    @GetMapping("/email/{recipient}/{attachmentFilePath}")
    public void sendEmailWithAttachment(@PathVariable String recipient, @PathVariable String attachmentFilePath) {
        vendorService.sendEmailWithAttachment(recipient, attachmentFilePath);
    }

    @GetMapping("/ftp/{filePath}/{ftpServerUrl}/{username}/{password}")
    public void uploadFileToFtpServer(@PathVariable String filePath, @PathVariable String ftpServerUrl, @PathVariable String username, @PathVariable String password) {
        vendorService.uploadFileToFtpServer(filePath, ftpServerUrl, username, password);
    }

    @GetMapping("/sharepoint/{filePath}/{sharepointServerUrl}/{username}/{password}")
    public void uploadFileToSharepointServer(@PathVariable String filePath, @PathVariable String sharepointServerUrl, @PathVariable String username, @PathVariable String password) {
        vendorService.uploadFileToSharepointServer(filePath, sharepointServerUrl, username, password);
    }

    // Implement additional endpoints for request and schedule information

}