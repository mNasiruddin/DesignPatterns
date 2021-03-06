/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.EngineloadjourneysToTrunc;

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
public class EngineloadjourneysToTruncRecord extends UpdatableRecordImpl<EngineloadjourneysToTruncRecord> implements Record7<UUID, Long, Long, Timestamp, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1001722181;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.fk_engineLoads</code>.
     */
    public void setFkEngineloads(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.fk_engineLoads</code>.
     */
    public Long getFkEngineloads() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.engineLoadID</code>.
     */
    public void setEngineloadid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.engineLoadID</code>.
     */
    public Long getEngineloadid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.queryDate</code>.
     */
    public void setQuerydate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.queryDate</code>.
     */
    public Timestamp getQuerydate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.observedID</code>.
     */
    public void setObservedid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.observedID</code>.
     */
    public Integer getObservedid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.priorID</code>.
     */
    public void setPriorid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.priorID</code>.
     */
    public Integer getPriorid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.pricingID</code>.
     */
    public void setPricingid(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadJourneys_to_trunc.pricingID</code>.
     */
    public Integer getPricingid() {
        return (Integer) get(6);
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
    public Row7<UUID, Long, Long, Timestamp, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, Long, Long, Timestamp, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC.FK_ENGINELOADS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC.ENGINELOADID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC.QUERYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC.OBSERVEDID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC.PRIORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC.PRICINGID;
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
    public Long component2() {
        return getFkEngineloads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getObservedid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPriorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getPricingid();
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
    public Long value2() {
        return getFkEngineloads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getObservedid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPriorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPricingid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord value2(Long value) {
        setFkEngineloads(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord value3(Long value) {
        setEngineloadid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord value4(Timestamp value) {
        setQuerydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord value5(Integer value) {
        setObservedid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord value6(Integer value) {
        setPriorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord value7(Integer value) {
        setPricingid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadjourneysToTruncRecord values(UUID value1, Long value2, Long value3, Timestamp value4, Integer value5, Integer value6, Integer value7) {
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
     * Create a detached EngineloadjourneysToTruncRecord
     */
    public EngineloadjourneysToTruncRecord() {
        super(EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC);
    }

    /**
     * Create a detached, initialised EngineloadjourneysToTruncRecord
     */
    public EngineloadjourneysToTruncRecord(UUID guid, Long fkEngineloads, Long engineloadid, Timestamp querydate, Integer observedid, Integer priorid, Integer pricingid) {
        super(EngineloadjourneysToTrunc.ENGINELOADJOURNEYS_TO_TRUNC);

        set(0, guid);
        set(1, fkEngineloads);
        set(2, engineloadid);
        set(3, querydate);
        set(4, observedid);
        set(5, priorid);
        set(6, pricingid);
    }
}
