/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tokenplay.ue4.model.db.tables.Tue4BmOrder;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class BmOrderRecord extends UpdatableRecordImpl<BmOrderRecord> implements
    Record7<String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1705293562;

    /**
     * Setter for <code>tue4_bm_order.bm_order_id</code>.
     */
    public void setBmOrderId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_bm_order.bm_order_id</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getBmOrderId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_bm_order.pil_id</code>.
     */
    public void setPilId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_bm_order.pil_id</code>.
     */
    @Size(max = 32)
    public String getPilId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_bm_order.corp_id</code>.
     */
    public void setCorpId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_bm_order.corp_id</code>.
     */
    @Size(max = 32)
    public String getCorpId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tue4_bm_order.bm_transaction_id</code>.
     */
    public void setBmTransactionId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_bm_order.bm_transaction_id</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getBmTransactionId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tue4_bm_order.bm_equipment_id</code>.
     */
    public void setBmEquipmentId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>tue4_bm_order.bm_equipment_id</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getBmEquipmentId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tue4_bm_order.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>tue4_bm_order.created_at</code>.
     */
    @NotNull
    public Timestamp getCreatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>tue4_bm_order.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>tue4_bm_order.updated_at</code>.
     */
    @NotNull
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4BmOrder.BM_ORDER.BM_ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4BmOrder.BM_ORDER.PIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tue4BmOrder.BM_ORDER.CORP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tue4BmOrder.BM_ORDER.BM_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tue4BmOrder.BM_ORDER.BM_EQUIPMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Tue4BmOrder.BM_ORDER.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Tue4BmOrder.BM_ORDER.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getBmOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPilId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCorpId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBmTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBmEquipmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getBmOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPilId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCorpId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBmTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBmEquipmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord value1(String value) {
        setBmOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord value2(String value) {
        setPilId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord value3(String value) {
        setCorpId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord value4(String value) {
        setBmTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord value5(String value) {
        setBmEquipmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord value6(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord value7(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmOrderRecord values(String value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BmOrderRecord
     */
    public BmOrderRecord() {
        super(Tue4BmOrder.BM_ORDER);
    }

    /**
     * Create a detached, initialised BmOrderRecord
     */
    public BmOrderRecord(String bmOrderId, String id, String corpId, String bmTransactionId, String bmEquipmentId, Timestamp createdAt,
        Timestamp updatedAt) {
        super(Tue4BmOrder.BM_ORDER);

        set(0, bmOrderId);
        set(1, id);
        set(2, corpId);
        set(3, bmTransactionId);
        set(4, bmEquipmentId);
        set(5, createdAt);
        set(6, updatedAt);
    }
}
