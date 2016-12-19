package com.constantcontact.v2.contacts;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * @author woogienoogie
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Note implements Serializable {
    @JsonProperty("created_date")
    protected Date _createdDate;

    @JsonProperty("id")
    protected String _id;

    @JsonProperty("modified_date")
    protected Date _modifiedDate;

    @JsonProperty("note")
    protected String _note;

    public Note() {
    }

    public Date getCreatedDate() {
        return _createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        _createdDate = createdDate;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        _id = id;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Note)) {
            return false;
        } else {
            Note rhs = (Note) obj;
            return new EqualsBuilder()
                    .append(_createdDate, rhs.getCreatedDate())
                    .append(_id, rhs.getId())
                    .append(_modifiedDate, rhs.getModifiedDate())
                    .append(_note, rhs.getNote())
                    .isEquals();
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(_createdDate)
                .append(_id)
                .append(_modifiedDate)
                .append(_note)
                .hashCode();
    }
}
