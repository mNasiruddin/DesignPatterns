/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.SalesforceSearchableRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SalesforceSearchable extends TableImpl<SalesforceSearchableRecord> {

    private static final long serialVersionUID = 271614011;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable</code>
     */
    public static final SalesforceSearchable SALESFORCE_SEARCHABLE = new SalesforceSearchable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesforceSearchableRecord> getRecordType() {
        return SalesforceSearchableRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable.ref</code>.
     */
    public final TableField<SalesforceSearchableRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable.EMail</code>.
     */
    public final TableField<SalesforceSearchableRecord, String> EMAIL = createField("EMail", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable.searchable_Email</code>.
     */
    public final TableField<SalesforceSearchableRecord, String> SEARCHABLE_EMAIL = createField("searchable_Email", org.jooq.impl.SQLDataType.VARCHAR(8000), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable.searchable_supplier_ref</code>.
     */
    public final TableField<SalesforceSearchableRecord, String> SEARCHABLE_SUPPLIER_REF = createField("searchable_supplier_ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable</code> table reference
     */
    public SalesforceSearchable() {
        this(DSL.name("SalesForce_Searchable"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable</code> table reference
     */
    public SalesforceSearchable(String alias) {
        this(DSL.name(alias), SALESFORCE_SEARCHABLE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_Searchable</code> table reference
     */
    public SalesforceSearchable(Name alias) {
        this(alias, SALESFORCE_SEARCHABLE);
    }

    private SalesforceSearchable(Name alias, Table<SalesforceSearchableRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesforceSearchable(Name alias, Table<SalesforceSearchableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SalesforceSearchable(Table<O> child, ForeignKey<O, SalesforceSearchableRecord> key) {
        super(child, key, SALESFORCE_SEARCHABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SalesforceSearchableRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SALESFORCE_SEARCHABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSearchable as(String alias) {
        return new SalesforceSearchable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceSearchable as(Name alias) {
        return new SalesforceSearchable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceSearchable rename(String name) {
        return new SalesforceSearchable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceSearchable rename(Name name) {
        return new SalesforceSearchable(name, null);
    }
}