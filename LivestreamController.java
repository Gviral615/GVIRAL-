
package com.gviral.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/livestreams")
public class LivestreamController {

    static class Livestream {
        public String title;
        public String date;
        public String description;

        public Livestream(String title, String date, String description) {
            this.title = title;
            this.date = date;
            this.description = description;
        }
    }

    private final List<Livestream> scheduledStreams = new ArrayList<>();

    @PostMapping("/schedule")
    public String scheduleStream(@RequestParam String title,
                                 @RequestParam String date,
                                 @RequestParam String description) {
        scheduledStreams.add(new Livestream(title, date, description));
        return "Livestream '" + title + "' scheduled for " + date;
    }

    @GetMapping
    public List<Livestream> getScheduledStreams() {
        return scheduledStreams;
    }
}
