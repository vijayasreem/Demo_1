package com.sales.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.service.ILMSService;
import com.sales.demo.service.InvestigationManagementSystemService;

@RestController
public class InvestigationManagementSystemController {

    @Autowired
    private ILMSService ilmsService;

    @Autowired
    private InvestigationManagementSystemService investigationManagementSystemService;

    @RequestMapping(value = "/allocateCases", method = RequestMethod.GET)
    public void allocateCases(@RequestParam(value = "investigatorType") String investigatorType) {
        ilmsService.allocateCases();
        investigationManagementSystemService.allocateCases(investigatorType);
    }

    @RequestMapping(value = "/generateInvoices", method = RequestMethod.GET)
    public void generateInvoices() {
        ilmsService.generateInvoices();
        investigationManagementSystemService.generateInvoices();
    }

    @RequestMapping(value = "/submitReports", method = RequestMethod.GET)
    public void submitReports(@RequestParam(value = "teamName") String teamName) {
        ilmsService.submitReports();
        investigationManagementSystemService.submitReports(teamName);
    }

    @RequestMapping(value = "/sendNotifications", method = RequestMethod.GET)
    public void sendNotifications(@RequestParam(value = "userName") String userName) {
        ilmsService.sendNotifications();
        investigationManagementSystemService.sendNotifications(userName);
    }

    @RequestMapping(value = "/waiveOffCases", method = RequestMethod.GET)
    public void waiveOffCases() {
        ilmsService.waiveOffCases();
        investigationManagementSystemService.waiveOffCases();
    }

    @RequestMapping(value = "/maintainHistory", method = RequestMethod.GET)
    public void maintainHistory() {
        ilmsService.maintainHistory();
        investigationManagementSystemService.maintainHistory();
    }

}