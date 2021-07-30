package com.als.appfinancas.model.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.als.appfinancas.model.enums.RecordStatus;
import com.als.appfinancas.model.enums.RecordType;

@Entity
@Table(name = "tb_records")
public class RecordModel implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private Float value;

    @Column(nullable = false)
    private Integer recordType;

    @Column(nullable = false)
    private Integer recordStatus;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public RecordType getRecordType() {
        return RecordType.toEnum(recordType);
    }

    public void setRecordType(RecordType recordType) {
        this.recordType = recordType.getId();
    }

    public RecordStatus getRecordStatus() {
        return RecordStatus.toEnum(recordStatus);
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus.getId();
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

}
