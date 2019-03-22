/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Fngetchannelparents;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class FngetchannelparentsRecord extends TableRecordImpl<FngetchannelparentsRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1127610748;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fnGetChannelParents.channel_id</code>.
     */
    public void setChannelId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fnGetChannelParents.channel_id</code>.
     */
    public Integer getChannelId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fnGetChannelParents.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fnGetChannelParents.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Fngetchannelparents.FNGETCHANNELPARENTS.CHANNEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Fngetchannelparents.FNGETCHANNELPARENTS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FngetchannelparentsRecord value1(Integer value) {
        setChannelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FngetchannelparentsRecord value2(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FngetchannelparentsRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FngetchannelparentsRecord
     */
    public FngetchannelparentsRecord() {
        super(Fngetchannelparents.FNGETCHANNELPARENTS);
    }

    /**
     * Create a detached, initialised FngetchannelparentsRecord
     */
    public FngetchannelparentsRecord(Integer channelId, Integer clientId) {
        super(Fngetchannelparents.FNGETCHANNELPARENTS);

        set(0, channelId);
        set(1, clientId);
    }
}