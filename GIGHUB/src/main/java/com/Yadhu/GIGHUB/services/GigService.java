package com.Yadhu.GIGHUB.services;

import com.Yadhu.GIGHUB.gigDto.GigMapper;
import com.Yadhu.GIGHUB.gigDto.GigRequest;
import com.Yadhu.GIGHUB.gigDto.GigResponse;
import com.Yadhu.GIGHUB.model.Gig;
import com.Yadhu.GIGHUB.model.User;
import com.Yadhu.GIGHUB.repository.GigRepository;
import com.Yadhu.GIGHUB.repository.UserRepository;
import com.Yadhu.GIGHUB.role.GigStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GigService {
   private GigRepository gigRepository;
   @Autowired
   private UserRepository userRepo;

   public ResponseEntity<GigResponse> gigPost(GigRequest request, String email)
   {
User user= userRepo.findByEmail(email);
Gig gig = GigMapper.toGig(request,user);
      gig.setPostedBy(user);
      gig.setStatus(GigStatus.POSTED);
gig.setPostedAt(LocalDateTime.now());
 gigRepository.save(gig);
 GigResponse response = GigMapper.toDto(gig);
return ResponseEntity.ok(response);
   }

   public List<Gig> getAllGigs()
   {
      return gigRepository.findAll();
   }
}
