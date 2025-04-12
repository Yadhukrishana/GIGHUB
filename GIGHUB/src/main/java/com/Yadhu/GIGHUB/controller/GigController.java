package com.Yadhu.GIGHUB.controller;
import com.Yadhu.GIGHUB.model.Gig;
import com.Yadhu.GIGHUB.services.GigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/gigs")
public class GigController {
    @Autowired
    private GigService gigService;

    @PostMapping("/post")
    public ResponseEntity<?> postGig(@RequestBody Gig gig, Authentication authentication) {
        String userEmail = authentication.getName(); // Extracts email from JWT token
        ResponseEntity<?> savedGig = gigService.gigPost(gig, userEmail);
        return ResponseEntity.ok(savedGig + "Gig saved successfully");
    }
    @PostMapping("/all")
    public ResponseEntity<List<Gig>>getaAllGigs()
    {
        List<Gig> allGigs=gigService.getAllGigs();
        return ResponseEntity.ok(allGigs);
    }


}