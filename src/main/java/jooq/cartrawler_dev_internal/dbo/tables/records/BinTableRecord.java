/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.BinTable;

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
public class BinTableRecord extends UpdatableRecordImpl<BinTableRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1380979888;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bin_table.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bin_table.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bin_table.first_six</code>.
     */
    public void setFirstSix(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bin_table.first_six</code>.
     */
    public Integer getFirstSix() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bin_table.issue_country</code>.
     */
    public void setIssueCountry(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bin_table.issue_country</code>.
     */
    public String getIssueCountry() {
        return (String) get(2);
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
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BinTable.BIN_TABLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return BinTable.BIN_TABLE.FIRST_SIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BinTable.BIN_TABLE.ISSUE_COUNTRY;
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
        return getFirstSix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getIssueCountry();
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
        return getFirstSix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIssueCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinTableRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinTableRecord value2(Integer value) {
        setFirstSix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinTableRecord value3(String value) {
        setIssueCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinTableRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BinTableRecord
     */
    public BinTableRecord() {
        super(BinTable.BIN_TABLE);
    }

    /**
     * Create a detached, initialised BinTableRecord
     */
    public BinTableRecord(Integer id, Integer firstSix, String issueCountry) {
        super(BinTable.BIN_TABLE);

        set(0, id);
        set(1, firstSix);
        set(2, issueCountry);
    }
}
