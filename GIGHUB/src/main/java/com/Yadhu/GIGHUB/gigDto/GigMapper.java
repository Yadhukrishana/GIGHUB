package com.Yadhu.GIGHUB.gigDto;

import com.Yadhu.GIGHUB.model.Gig;
import com.Yadhu.GIGHUB.model.User;
import org.springframework.stereotype.Component;

@Component
public class GigMapper {


    public static Gig toGig(GigRequest request, User user)
    {
        Gig gig = new Gig();
        gig.setName(request.getName());
        gig.setDescription(request.getDescription());
        gig.setPrice(request.getPrice());
        return gig;
    }


    public static GigResponse toDto(Gig gig) {
        GigResponse dto = new GigResponse();
        dto.setGigId(gig.getGigId());
        dto.setName(gig.getName());
        dto.setDescription(gig.getDescription());
        dto.setPrice(gig.getPrice());
        dto.setPostedBy(gig.getPostedBy().getName());
        dto.setPostedAt(gig.getPostedAt());
        return dto;
    }

}
