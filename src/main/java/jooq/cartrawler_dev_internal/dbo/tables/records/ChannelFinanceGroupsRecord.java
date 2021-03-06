/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ChannelFinanceGroups;

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
public class ChannelFinanceGroupsRecord extends UpdatableRecordImpl<ChannelFinanceGroupsRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -393973464;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.channel_finance_groups.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.channel_finance_groups.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.channel_finance_groups.finance_group_name</code>.
     */
    public void setFinanceGroupName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.channel_finance_groups.finance_group_name</code>.
     */
    public String getFinanceGroupName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.channel_finance_groups.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.channel_finance_groups.user_id</code>.
     */
    public Integer getUserId() {
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
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ChannelFinanceGroups.CHANNEL_FINANCE_GROUPS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ChannelFinanceGroups.CHANNEL_FINANCE_GROUPS.FINANCE_GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ChannelFinanceGroups.CHANNEL_FINANCE_GROUPS.USER_ID;
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
    public String component2() {
        return getFinanceGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
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
    public String value2() {
        return getFinanceGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelFinanceGroupsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelFinanceGroupsRecord value2(String value) {
        setFinanceGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelFinanceGroupsRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChannelFinanceGroupsRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChannelFinanceGroupsRecord
     */
    public ChannelFinanceGroupsRecord() {
        super(ChannelFinanceGroups.CHANNEL_FINANCE_GROUPS);
    }

    /**
     * Create a detached, initialised ChannelFinanceGroupsRecord
     */
    public ChannelFinanceGroupsRecord(Integer id, String financeGroupName, Integer userId) {
        super(ChannelFinanceGroups.CHANNEL_FINANCE_GROUPS);

        set(0, id);
        set(1, financeGroupName);
        set(2, userId);
    }
}
