package com.pcroom.manager.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "members")
@Builder
public class MemberEntity {
    @Id
    private String userId;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String birthDay;

    @Column(length = 100, nullable = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 100, nullable = true)
    private String address;

    @Column(nullable = false)
    private long createdDate;

    @Column(nullable = false)
    private long modifiedDate;

    public MemberEntity(){

    }
    @Builder
    public MemberEntity(String userId, String name, String birthDay, String email, String password, String address, long createdDate, long modifiedDate) {
        this.userId = userId;
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
        this.password = password;
        this.address = address;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
