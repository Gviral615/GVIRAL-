
package com.gviral.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping("/reports")
    public List<String> getReports() {
        return Arrays.asList("Report 1: Inappropriate post", "Report 2: Spam content");
    }

    @PostMapping("/ban")
    public String banUser(@RequestParam String userId) {
        return "User " + userId + " has been banned.";
    }
}
