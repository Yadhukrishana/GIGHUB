package com.Yadhu.GIGHUB.model;

import com.Yadhu.GIGHUB.role.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;


@Entity
 @NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
public class User {


    /* User.java
├── Long id
├── String name
├── String email
├── String password
├── Role role          // Enum: POSTER, DOER
├── Double latitude
├── Double longitude
├── Double trustScore
└── @OneToMany(mappedBy = "user") List<Task> tasks*/
@Id
    private Long id ;
    private String name ;
    private String email ;
    private String password;
    private Role role;
    private String place;

}
