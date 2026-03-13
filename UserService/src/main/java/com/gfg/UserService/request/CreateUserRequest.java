package com.gfg.UserService.request;

import com.gfg.UserService.customAnnotation.AgeLimit;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import com.gfg.UserService.customAnnotation.AgeLimit;
import com.gfg.UserService.model.User;
import org.gfg.Utils.UserIdentifier;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    private String name;
    private String email;
    @NotBlank
    private String phoneNo;
    private String address;
    private String password;
    @AgeLimit(minimumAge = 16, message = "your age should be lesser than 16")
    private String dob;
    private UserIdentifier userIdentifier;

    private String userIdentifierValue;

    public User toUser() {
        return User.builder().
                name(this.name).
                email(this.email).
                phoneNo(this.phoneNo).
                address(this.address).
                password(this.password).
                userIdentifier(this.userIdentifier).
                userIdentifierValue(this.userIdentifierValue).
                build();
    }
}