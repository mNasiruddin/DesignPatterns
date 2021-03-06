/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.BulkpricecontrolRecord;

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
import org.jooq.types.UByte;


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
public class Bulkpricecontrol extends TableImpl<BulkpricecontrolRecord> {

    private static final long serialVersionUID = -1234475728;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.BulkPriceControl</code>
     */
    public static final Bulkpricecontrol BULKPRICECONTROL = new Bulkpricecontrol();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BulkpricecontrolRecord> getRecordType() {
        return BulkpricecontrolRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.id</code>.
     */
    public final TableField<BulkpricecontrolRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.fk_website</code>.
     */
    public final TableField<BulkpricecontrolRecord, Integer> FK_WEBSITE = createField("fk_website", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.fk_supplier</code>.
     */
    public final TableField<BulkpricecontrolRecord, Integer> FK_SUPPLIER = createField("fk_supplier", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.competitorPrice</code>.
     */
    public final TableField<BulkpricecontrolRecord, BigDecimal> COMPETITORPRICE = createField("competitorPrice", org.jooq.impl.SQLDataType.NUMERIC(10, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.fk_job</code>.
     */
    public final TableField<BulkpricecontrolRecord, Integer> FK_JOB = createField("fk_job", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.price</code>.
     */
    public final TableField<BulkpricecontrolRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.NUMERIC(10, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.fk_locationBucket</code>.
     */
    public final TableField<BulkpricecontrolRecord, Integer> FK_LOCATIONBUCKET = createField("fk_locationBucket", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.fk_dateBucket</code>.
     */
    public final TableField<BulkpricecontrolRecord, Integer> FK_DATEBUCKET = createField("fk_dateBucket", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.duration</code>.
     */
    public final TableField<BulkpricecontrolRecord, UByte> DURATION = createField("duration", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.sipp</code>.
     */
    public final TableField<BulkpricecontrolRecord, String> SIPP = createField("sipp", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.BulkPriceControl.amendDate</code>.
     */
    public final TableField<BulkpricecontrolRecord, Timestamp> AMENDDATE = createField("amendDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.BulkPriceControl</code> table reference
     */
    public Bulkpricecontrol() {
        this(DSL.name("BulkPriceControl"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.BulkPriceControl</code> table reference
     */
    public Bulkpricecontrol(String alias) {
        this(DSL.name(alias), BULKPRICECONTROL);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.BulkPriceControl</code> table reference
     */
    public Bulkpricecontrol(Name alias) {
        this(alias, BULKPRICECONTROL);
    }

    private Bulkpricecontrol(Name alias, Table<BulkpricecontrolRecord> aliased) {
        this(alias, aliased, null);
    }

    private Bulkpricecontrol(Name alias, Table<BulkpricecontrolRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Bulkpricecontrol(Table<O> child, ForeignKey<O, BulkpricecontrolRecord> key) {
        super(child, key, BULKPRICECONTROL);
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
        return Arrays.<Index>asList(Indexes.BULKPRICECONTROL_PK__BULKPRIC__3213E83F016F8C14);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BulkpricecontrolRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BULKPRICECONTROL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BulkpricecontrolRecord> getPrimaryKey() {
        return Keys.PK__BULKPRIC__3213E83F016F8C14;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BulkpricecontrolRecord>> getKeys() {
        return Arrays.<UniqueKey<BulkpricecontrolRecord>>asList(Keys.PK__BULKPRIC__3213E83F016F8C14);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bulkpricecontrol as(String alias) {
        return new Bulkpricecontrol(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bulkpricecontrol as(Name alias) {
        return new Bulkpricecontrol(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Bulkpricecontrol rename(String name) {
        return new Bulkpricecontrol(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Bulkpricecontrol rename(Name name) {
        return new Bulkpricecontrol(name, null);
    }
}
