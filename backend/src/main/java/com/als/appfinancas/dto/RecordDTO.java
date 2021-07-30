package com.als.appfinancas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.als.appfinancas.model.entities.RecordModel;
import com.als.appfinancas.model.enums.RecordStatus;
import com.als.appfinancas.model.enums.RecordType;

public class RecordDTO implements Serializable {
    private static final long SerialVersionUID = 1L;

    private Long id;
    private String description;
    private LocalDate date;
    private Float value;
    private RecordType recordType;
    private RecordStatus recordStatus;

    public RecordDTO() {
    }

    public RecordDTO(Long id, String description, LocalDate date, Float value, Integer recordType,
            Integer recordStatus) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.value = value;
        this.recordType = RecordType.toEnum(recordType);
        this.recordStatus = RecordStatus.toEnum(recordStatus);
    }

    public RecordDTO(RecordModel obj) {
        this.id = obj.getId();
        this.description = obj.getDescription();
        this.date = obj.getDate();
        this.value = obj.getValue();
        this.recordType = obj.getRecordType();
        this.recordStatus = obj.getRecordStatus();
    }

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
        return recordType;
    }

    public void setRecordType(RecordType recordType) {
        this.recordType = recordType;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecordDTO other = (RecordDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RecordDTO [date=" + date + ", description=" + description + ", id=" + id + ", recordStatus="
                + recordStatus + ", recordType=" + recordType + ", value=" + value + "]";
    }
}
