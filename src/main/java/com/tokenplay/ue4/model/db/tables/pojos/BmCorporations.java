/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class BmCorporations implements Serializable {

    private static final long serialVersionUID = -343497240;

    private String bmCorpId;
    private String id;
    private String bmCorpName;
    private String bmCorpIndustry;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public BmCorporations() {
    }

    public BmCorporations(BmCorporations value) {
        this.bmCorpId = value.bmCorpId;
        this.id = value.id;
        this.bmCorpName = value.bmCorpName;
        this.bmCorpIndustry = value.bmCorpIndustry;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public BmCorporations(String bmCorpId, String id, String bmCorpName, String bmCorpIndustry, Timestamp createdAt, Timestamp updatedAt) {
        this.bmCorpId = bmCorpId;
        this.id = id;
        this.bmCorpName = bmCorpName;
        this.bmCorpIndustry = bmCorpIndustry;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @NotNull
    @Size(max = 32)
    public String getBmCorpId() {
        return this.bmCorpId;
    }

    public void setBmCorpId(String bmCorpId) {
        this.bmCorpId = bmCorpId;
    }

    @NotNull
    @Size(max = 32)
    public String getPilId() {
        return this.id;
    }

    public void setPilId(String id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 255)
    public String getBmCorpName() {
        return this.bmCorpName;
    }

    public void setBmCorpName(String bmCorpName) {
        this.bmCorpName = bmCorpName;
    }

    @NotNull
    @Size(max = 255)
    public String getBmCorpIndustry() {
        return this.bmCorpIndustry;
    }

    public void setBmCorpIndustry(String bmCorpIndustry) {
        this.bmCorpIndustry = bmCorpIndustry;
    }

    @NotNull
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @NotNull
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BmCorporations (");

        sb.append(bmCorpId);
        sb.append(", ").append(id);
        sb.append(", ").append(bmCorpName);
        sb.append(", ").append(bmCorpIndustry);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
