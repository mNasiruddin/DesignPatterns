/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ChqdatesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Chqdates extends TableImpl<ChqdatesRecord> {

    private static final long serialVersionUID = 647848430;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.chqdates</code>
     */
    public static final Chqdates CHQDATES = new Chqdates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChqdatesRecord> getRecordType() {
        return ChqdatesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.guid</code>.
     */
    public final TableField<ChqdatesRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.bookings</code>.
     */
    public final TableField<ChqdatesRecord, Double> BOOKINGS = createField("bookings", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.id</code>.
     */
    public final TableField<ChqdatesRecord, Double> ID = createField("id", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.company</code>.
     */
    public final TableField<ChqdatesRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.info</code>.
     */
    public final TableField<ChqdatesRecord, String> INFO = createField("info", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.remarks</code>.
     */
    public final TableField<ChqdatesRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.F6</code>.
     */
    public final TableField<ChqdatesRecord, String> F6 = createField("F6", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.chqdates.dateToEnter</code>.
     */
    public final TableField<ChqdatesRecord, Timestamp> DATETOENTER = createField("dateToEnter", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.chqdates</code> table reference
     */
    public Chqdates() {
        this(DSL.name("chqdates"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.chqdates</code> table reference
     */
    public Chqdates(String alias) {
        this(DSL.name(alias), CHQDATES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.chqdates</code> table reference
     */
    public Chqdates(Name alias) {
        this(alias, CHQDATES);
    }

    private Chqdates(Name alias, Table<ChqdatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Chqdates(Name alias, Table<ChqdatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Chqdates(Table<O> child, ForeignKey<O, ChqdatesRecord> key) {
        super(child, key, CHQDATES);
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
        return Arrays.<Index>asList(Indexes.CHQDATES_PK_CHQDATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChqdatesRecord> getPrimaryKey() {
        return Keys.PK_CHQDATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChqdatesRecord>> getKeys() {
        return Arrays.<UniqueKey<ChqdatesRecord>>asList(Keys.PK_CHQDATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Chqdates as(String alias) {
        return new Chqdates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Chqdates as(Name alias) {
        return new Chqdates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Chqdates rename(String name) {
        return new Chqdates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Chqdates rename(Name name) {
        return new Chqdates(name, null);
    }
}
