package com.pcroom.manager.dto;

import com.pcroom.manager.domain.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private String userId;
    private String name;
    private String birthDay;
    private String email;
    private String password;
    private String address;
    private long createdDate;
    private long modifiedDate;

    @Builder
    public MemberDto(String userId, String name, String birthDay, String email, String password, String address, long createdDate, long modifiedDate) {
        this.userId = userId;
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
        this.password = password;
        this.address = address;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public MemberEntity toEntity() {
        return MemberEntity.builder().
                userId(userId).
                password(password).
                name(name).
                birthDay(birthDay).
                email(email).
                address(address).
                createdDate(createdDate).
                modifiedDate(modifiedDate).build();
    }
}
