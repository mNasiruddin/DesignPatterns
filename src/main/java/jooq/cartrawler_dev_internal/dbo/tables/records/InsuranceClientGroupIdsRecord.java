/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.InsuranceClientGroupIds;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class InsuranceClientGroupIdsRecord extends UpdatableRecordImpl<InsuranceClientGroupIdsRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1533713224;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_client_group_ids.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_client_group_ids.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_client_group_ids.ref</code>.
     */
    public void setRef(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_client_group_ids.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_client_group_ids.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_client_group_ids.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InsuranceClientGroupIds.INSURANCE_CLIENT_GROUP_IDS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return InsuranceClientGroupIds.INSURANCE_CLIENT_GROUP_IDS.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return InsuranceClientGroupIds.INSURANCE_CLIENT_GROUP_IDS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceClientGroupIdsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceClientGroupIdsRecord value2(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceClientGroupIdsRecord value3(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceClientGroupIdsRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InsuranceClientGroupIdsRecord
     */
    public InsuranceClientGroupIdsRecord() {
        super(InsuranceClientGroupIds.INSURANCE_CLIENT_GROUP_IDS);
    }

    /**
     * Create a detached, initialised InsuranceClientGroupIdsRecord
     */
    public InsuranceClientGroupIdsRecord(Integer id, Integer ref, Integer clientId) {
        super(InsuranceClientGroupIds.INSURANCE_CLIENT_GROUP_IDS);

        set(0, id);
        set(1, ref);
        set(2, clientId);
    }
}
