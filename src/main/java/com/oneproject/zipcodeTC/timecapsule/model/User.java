package com.oneproject.zipcodeTC.timecapsule.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.Instant;


@Entity
@Data // This is a convenient shortcut annotation that bundles the features : @Getter, @Setter
@NoArgsConstructor // generate a constructor with no parameters.
@AllArgsConstructor // generate a constructor with 1 parameter for each field in the class
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Password is required")
    private String password;
    @Email
    @NotEmpty(message = "Email is required")
    private String email;
    /*
    these two variable will be used later
    private String linkedIn;
    private String github;
     */
    private Instant created; // Used to record user's create time
    private Boolean enabled; // Used to check if this user is created

}
