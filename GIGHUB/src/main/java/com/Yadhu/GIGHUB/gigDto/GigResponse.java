package com.Yadhu.GIGHUB.gigDto;

import com.Yadhu.GIGHUB.model.User;
import com.Yadhu.GIGHUB.role.GigStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class GigResponse {

    private Long gigId;

    private String name;

    private String description;

    private Double price;

    private GigStatus status;

    private User postedBy;

    private User takenBy;

    private LocalDateTime postedAt;

    private LocalDateTime completedAt;
}
