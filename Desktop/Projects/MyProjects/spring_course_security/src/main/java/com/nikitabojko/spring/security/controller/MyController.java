package com.nikitabojko.spring.security.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps() {
        return "view-for-all-employees";
    }


    @GetMapping("/hr_info")
    @PreAuthorize("hasRole('HR')")

    public String getInfoOnlyForHR() {
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    @PreAuthorize("hasRole('MANAGER')")

    public String gerInfoOnlyForManagers() {
        return "view-for-managers";
    }
}
