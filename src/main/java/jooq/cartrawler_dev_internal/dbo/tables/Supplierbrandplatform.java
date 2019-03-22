/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.SupplierbrandplatformRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Supplierbrandplatform extends TableImpl<SupplierbrandplatformRecord> {

    private static final long serialVersionUID = -386213087;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform</code>
     */
    public static final Supplierbrandplatform SUPPLIERBRANDPLATFORM = new Supplierbrandplatform();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SupplierbrandplatformRecord> getRecordType() {
        return SupplierbrandplatformRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.id</code>.
     */
    public final TableField<SupplierbrandplatformRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.fk_caragent</code>.
     */
    public final TableField<SupplierbrandplatformRecord, Integer> FK_CARAGENT = createField("fk_caragent", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.fk_brandplatform</code>.
     */
    public final TableField<SupplierbrandplatformRecord, Integer> FK_BRANDPLATFORM = createField("fk_brandplatform", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.booking_email</code>.
     */
    public final TableField<SupplierbrandplatformRecord, String> BOOKING_EMAIL = createField("booking_email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.contact_phone</code>.
     */
    public final TableField<SupplierbrandplatformRecord, String> CONTACT_PHONE = createField("contact_phone", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.status</code>.
     */
    public final TableField<SupplierbrandplatformRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.cxl_fee</code>.
     */
    public final TableField<SupplierbrandplatformRecord, BigDecimal> CXL_FEE = createField("cxl_fee", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform.cxl_currency</code>.
     */
    public final TableField<SupplierbrandplatformRecord, String> CXL_CURRENCY = createField("cxl_currency", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform</code> table reference
     */
    public Supplierbrandplatform() {
        this(DSL.name("SupplierBrandPlatform"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform</code> table reference
     */
    public Supplierbrandplatform(String alias) {
        this(DSL.name(alias), SUPPLIERBRANDPLATFORM);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SupplierBrandPlatform</code> table reference
     */
    public Supplierbrandplatform(Name alias) {
        this(alias, SUPPLIERBRANDPLATFORM);
    }

    private Supplierbrandplatform(Name alias, Table<SupplierbrandplatformRecord> aliased) {
        this(alias, aliased, null);
    }

    private Supplierbrandplatform(Name alias, Table<SupplierbrandplatformRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Supplierbrandplatform(Table<O> child, ForeignKey<O, SupplierbrandplatformRecord> key) {
        super(child, key, SUPPLIERBRANDPLATFORM);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SUPPLIERBRANDPLATFORM_PK__SUPPLIER__3213E83F6672486C);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SupplierbrandplatformRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUPPLIERBRANDPLATFORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SupplierbrandplatformRecord> getPrimaryKey() {
        return Keys.PK__SUPPLIER__3213E83F6672486C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SupplierbrandplatformRecord>> getKeys() {
        return Arrays.<UniqueKey<SupplierbrandplatformRecord>>asList(Keys.PK__SUPPLIER__3213E83F6672486C);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Supplierbrandplatform as(String alias) {
        return new Supplierbrandplatform(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Supplierbrandplatform as(Name alias) {
        return new Supplierbrandplatform(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Supplierbrandplatform rename(String name) {
        return new Supplierbrandplatform(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Supplierbrandplatform rename(Name name) {
        return new Supplierbrandplatform(name, null);
    }
}