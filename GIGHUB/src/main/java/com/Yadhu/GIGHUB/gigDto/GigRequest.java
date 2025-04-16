package com.Yadhu.GIGHUB.gigDto;

import com.Yadhu.GIGHUB.model.User;
import com.Yadhu.GIGHUB.role.GigStatus;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GigRequest {

    private String name;

    private String description;

    private Double price;

    private GigStatus status;

    private User postedBy;

    private LocalDateTime postedAt;


}
