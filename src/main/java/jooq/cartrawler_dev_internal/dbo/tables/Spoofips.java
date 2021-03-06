/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.SpoofipsRecord;

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
public class Spoofips extends TableImpl<SpoofipsRecord> {

    private static final long serialVersionUID = -637945651;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.spoofIPs</code>
     */
    public static final Spoofips SPOOFIPS = new Spoofips();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpoofipsRecord> getRecordType() {
        return SpoofipsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.ip</code>.
     */
    public final TableField<SpoofipsRecord, Integer> IP = createField("ip", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.spoofed_by</code>.
     */
    public final TableField<SpoofipsRecord, Integer> SPOOFED_BY = createField("spoofed_by", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.whitelisted_by</code>.
     */
    public final TableField<SpoofipsRecord, Integer> WHITELISTED_BY = createField("whitelisted_by", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.whitelisted_reason</code>.
     */
    public final TableField<SpoofipsRecord, String> WHITELISTED_REASON = createField("whitelisted_reason", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.spoofed_reason</code>.
     */
    public final TableField<SpoofipsRecord, String> SPOOFED_REASON = createField("spoofed_reason", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.createDate</code>.
     */
    public final TableField<SpoofipsRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.auto_detected_by</code>.
     */
    public final TableField<SpoofipsRecord, String> AUTO_DETECTED_BY = createField("auto_detected_by", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.spoofIPs.expDate</code>.
     */
    public final TableField<SpoofipsRecord, Timestamp> EXPDATE = createField("expDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.spoofIPs</code> table reference
     */
    public Spoofips() {
        this(DSL.name("spoofIPs"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.spoofIPs</code> table reference
     */
    public Spoofips(String alias) {
        this(DSL.name(alias), SPOOFIPS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.spoofIPs</code> table reference
     */
    public Spoofips(Name alias) {
        this(alias, SPOOFIPS);
    }

    private Spoofips(Name alias, Table<SpoofipsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Spoofips(Name alias, Table<SpoofipsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Spoofips(Table<O> child, ForeignKey<O, SpoofipsRecord> key) {
        super(child, key, SPOOFIPS);
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
        return Arrays.<Index>asList(Indexes.SPOOFIPS_PK_SPOOFIPS, Indexes.SPOOFIPS_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpoofipsRecord>> getKeys() {
        return Arrays.<UniqueKey<SpoofipsRecord>>asList(Keys.PK_SPOOFIPS, Keys.UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Spoofips as(String alias) {
        return new Spoofips(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Spoofips as(Name alias) {
        return new Spoofips(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Spoofips rename(String name) {
        return new Spoofips(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Spoofips rename(Name name) {
        return new Spoofips(name, null);
    }
}
