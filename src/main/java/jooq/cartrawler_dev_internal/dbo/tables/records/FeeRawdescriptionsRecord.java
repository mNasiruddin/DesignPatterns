/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.FeeRawdescriptions;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class FeeRawdescriptionsRecord extends TableRecordImpl<FeeRawdescriptionsRecord> implements Record3<Integer, String, Short> {

    private static final long serialVersionUID = -531304523;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fee_rawdescriptions.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fee_rawdescriptions.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fee_rawdescriptions.description</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fee_rawdescriptions.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.fee_rawdescriptions.encoding</code>.
     */
    public void setEncoding(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.fee_rawdescriptions.encoding</code>.
     */
    public Short getEncoding() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FeeRawdescriptions.FEE_RAWDESCRIPTIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FeeRawdescriptions.FEE_RAWDESCRIPTIONS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return FeeRawdescriptions.FEE_RAWDESCRIPTIONS.ENCODING;
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getEncoding();
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRawdescriptionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRawdescriptionsRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRawdescriptionsRecord value3(Short value) {
        setEncoding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRawdescriptionsRecord values(Integer value1, String value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FeeRawdescriptionsRecord
     */
    public FeeRawdescriptionsRecord() {
        super(FeeRawdescriptions.FEE_RAWDESCRIPTIONS);
    }

    /**
     * Create a detached, initialised FeeRawdescriptionsRecord
     */
    public FeeRawdescriptionsRecord(Integer id, String description, Short encoding) {
        super(FeeRawdescriptions.FEE_RAWDESCRIPTIONS);

        set(0, id);
        set(1, description);
        set(2, encoding);
    }
}
