package com.Yadhu.GIGHUB.model;

import com.Yadhu.GIGHUB.role.GigStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Gig {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long gigId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String description;

    @Column(nullable=false)
    private Double price;

    @Enumerated(EnumType.STRING)
    private GigStatus status;

    @ManyToOne
    private User postedBy;

    @ManyToOne
    private User takenBy;

    private LocalDateTime postedAt;
    private LocalDateTime completedAt;

}
