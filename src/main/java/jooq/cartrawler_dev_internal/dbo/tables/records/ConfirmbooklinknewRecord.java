/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Confirmbooklinknew;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfirmbooklinknewRecord extends UpdatableRecordImpl<ConfirmbooklinknewRecord> implements Record7<UUID, Integer, String, Integer, Integer, Timestamp, String> {

    private static final long serialVersionUID = 796084473;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.unique_id</code>.
     */
    public void setUniqueId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.unique_id</code>.
     */
    public Integer getUniqueId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.Res_id</code>.
     */
    public void setResId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.Res_id</code>.
     */
    public String getResId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.counter</code>.
     */
    public void setCounter(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.counter</code>.
     */
    public Integer getCounter() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.link_status</code>.
     */
    public void setLinkStatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.link_status</code>.
     */
    public Integer getLinkStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.end_date</code>.
     */
    public void setEndDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.end_date</code>.
     */
    public Timestamp getEndDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.type</code>.
     */
    public void setType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ConfirmBookLinkNew.type</code>.
     */
    public String getType() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, Integer, String, Integer, Integer, Timestamp, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, Integer, String, Integer, Integer, Timestamp, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Confirmbooklinknew.CONFIRMBOOKLINKNEW.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Confirmbooklinknew.CONFIRMBOOKLINKNEW.UNIQUE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Confirmbooklinknew.CONFIRMBOOKLINKNEW.RES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Confirmbooklinknew.CONFIRMBOOKLINKNEW.COUNTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Confirmbooklinknew.CONFIRMBOOKLINKNEW.LINK_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Confirmbooklinknew.CONFIRMBOOKLINKNEW.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Confirmbooklinknew.CONFIRMBOOKLINKNEW.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUniqueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getLinkStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUniqueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getLinkStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord value2(Integer value) {
        setUniqueId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord value3(String value) {
        setResId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord value4(Integer value) {
        setCounter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord value5(Integer value) {
        setLinkStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord value6(Timestamp value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord value7(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfirmbooklinknewRecord values(UUID value1, Integer value2, String value3, Integer value4, Integer value5, Timestamp value6, String value7) {
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
     * Create a detached ConfirmbooklinknewRecord
     */
    public ConfirmbooklinknewRecord() {
        super(Confirmbooklinknew.CONFIRMBOOKLINKNEW);
    }

    /**
     * Create a detached, initialised ConfirmbooklinknewRecord
     */
    public ConfirmbooklinknewRecord(UUID guid, Integer uniqueId, String resId, Integer counter, Integer linkStatus, Timestamp endDate, String type) {
        super(Confirmbooklinknew.CONFIRMBOOKLINKNEW);

        set(0, guid);
        set(1, uniqueId);
        set(2, resId);
        set(3, counter);
        set(4, linkStatus);
        set(5, endDate);
        set(6, type);
    }
}
