package com.eazybytes.loans.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseEntity {

    @Column(updatable = false)
    private String createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private String updatedAt;

    @Column(insertable = false)
    private String updatedBy;
}
