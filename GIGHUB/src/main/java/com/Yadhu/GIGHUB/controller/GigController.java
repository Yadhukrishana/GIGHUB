package com.Yadhu.GIGHUB.controller;
import com.Yadhu.GIGHUB.gigDto.GigRequest;
import com.Yadhu.GIGHUB.gigDto.GigResponse;
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
    public ResponseEntity<GigResponse>postGig(@RequestBody GigRequest request, Authentication authentication) {
        String userEmail = authentication.getName(); // Extracts email from JWT token
        return   gigService.gigPost(request, userEmail);

    }
    @PostMapping("/all")
    public ResponseEntity<List<Gig>>getaAllGigs()
    {
        List<Gig> allGigs=gigService.getAllGigs();
        return ResponseEntity.ok(allGigs);
    }


}