/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.PlancontractVirtuallocation;

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
public class PlancontractVirtuallocationRecord extends UpdatableRecordImpl<PlancontractVirtuallocationRecord> implements Record4<UUID, Integer, Integer, Integer> {

    private static final long serialVersionUID = 2145213311;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.type</code>.
     */
    public void setType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.type</code>.
     */
    public Integer getType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.fk_plancontract</code>.
     */
    public void setFkPlancontract(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.fk_plancontract</code>.
     */
    public Integer getFkPlancontract() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.fk_virtuallocation</code>.
     */
    public void setFkVirtuallocation(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.plancontract_virtuallocation.fk_virtuallocation</code>.
     */
    public Integer getFkVirtuallocation() {
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
        return PlancontractVirtuallocation.PLANCONTRACT_VIRTUALLOCATION.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PlancontractVirtuallocation.PLANCONTRACT_VIRTUALLOCATION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PlancontractVirtuallocation.PLANCONTRACT_VIRTUALLOCATION.FK_PLANCONTRACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PlancontractVirtuallocation.PLANCONTRACT_VIRTUALLOCATION.FK_VIRTUALLOCATION;
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkPlancontract();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFkVirtuallocation();
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkPlancontract();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFkVirtuallocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractVirtuallocationRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractVirtuallocationRecord value2(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractVirtuallocationRecord value3(Integer value) {
        setFkPlancontract(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractVirtuallocationRecord value4(Integer value) {
        setFkVirtuallocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractVirtuallocationRecord values(UUID value1, Integer value2, Integer value3, Integer value4) {
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
     * Create a detached PlancontractVirtuallocationRecord
     */
    public PlancontractVirtuallocationRecord() {
        super(PlancontractVirtuallocation.PLANCONTRACT_VIRTUALLOCATION);
    }

    /**
     * Create a detached, initialised PlancontractVirtuallocationRecord
     */
    public PlancontractVirtuallocationRecord(UUID guid, Integer type, Integer fkPlancontract, Integer fkVirtuallocation) {
        super(PlancontractVirtuallocation.PLANCONTRACT_VIRTUALLOCATION);

        set(0, guid);
        set(1, type);
        set(2, fkPlancontract);
        set(3, fkVirtuallocation);
    }
}
