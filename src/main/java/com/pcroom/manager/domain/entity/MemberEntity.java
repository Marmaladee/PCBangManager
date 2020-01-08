package com.pcroom.manager.domain.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "pcroom")
public class MemberEntitry {
    @Id

}
