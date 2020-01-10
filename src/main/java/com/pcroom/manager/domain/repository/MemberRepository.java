package com.pcroom.manager.domain.repository;

import com.pcroom.manager.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    Optional<MemberEntity> findByUserId(String userId);
    Optional<MemberEntity> findByNameAndBirthDay(String name, String birthday);
}
