/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Scrapedsuppliers;

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
public class ScrapedsuppliersRecord extends TableRecordImpl<ScrapedsuppliersRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1095434542;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ScrapedSuppliers.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ScrapedSuppliers.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ScrapedSuppliers.supplier</code>.
     */
    public void setSupplier(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ScrapedSuppliers.supplier</code>.
     */
    public String getSupplier() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Scrapedsuppliers.SCRAPEDSUPPLIERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Scrapedsuppliers.SCRAPEDSUPPLIERS.SUPPLIER;
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
        return getSupplier();
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
        return getSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapedsuppliersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapedsuppliersRecord value2(String value) {
        setSupplier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapedsuppliersRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScrapedsuppliersRecord
     */
    public ScrapedsuppliersRecord() {
        super(Scrapedsuppliers.SCRAPEDSUPPLIERS);
    }

    /**
     * Create a detached, initialised ScrapedsuppliersRecord
     */
    public ScrapedsuppliersRecord(Integer id, String supplier) {
        super(Scrapedsuppliers.SCRAPEDSUPPLIERS);

        set(0, id);
        set(1, supplier);
    }
}