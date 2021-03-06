/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Rebateplans;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class RebateplansRecord extends UpdatableRecordImpl<RebateplansRecord> implements Record4<UUID, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1269425713;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RebatePlans.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RebatePlans.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RebatePlans.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RebatePlans.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RebatePlans.fk_rebate</code>.
     */
    public void setFkRebate(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RebatePlans.fk_rebate</code>.
     */
    public Integer getFkRebate() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.RebatePlans.fk_plan</code>.
     */
    public void setFkPlan(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.RebatePlans.fk_plan</code>.
     */
    public Integer getFkPlan() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Rebateplans.REBATEPLANS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Rebateplans.REBATEPLANS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Rebateplans.REBATEPLANS.FK_REBATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Rebateplans.REBATEPLANS.FK_PLAN;
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkRebate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFkPlan();
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkRebate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFkPlan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebateplansRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebateplansRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebateplansRecord value3(Integer value) {
        setFkRebate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebateplansRecord value4(Integer value) {
        setFkPlan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RebateplansRecord values(UUID value1, Integer value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RebateplansRecord
     */
    public RebateplansRecord() {
        super(Rebateplans.REBATEPLANS);
    }

    /**
     * Create a detached, initialised RebateplansRecord
     */
    public RebateplansRecord(UUID guid, Integer id, Integer fkRebate, Integer fkPlan) {
        super(Rebateplans.REBATEPLANS);

        set(0, guid);
        set(1, id);
        set(2, fkRebate);
        set(3, fkPlan);
    }
}
