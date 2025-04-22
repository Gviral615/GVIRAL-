package com.gviral;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/music")
public class MusicController {
    @GetMapping
    public List<String> getAllMusic() {
        return Arrays.asList("Track 1", "Track 2");
    }

    @PostMapping("/upload")
    public String uploadMusic(@RequestParam String title) {
        // Simulate storing metadata
        return "Music '" + title + "' uploaded successfully";
    }
}
