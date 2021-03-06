/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.OnlineratesheeterrorLogRecord;

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
public class OnlineratesheeterrorLog extends TableImpl<OnlineratesheeterrorLogRecord> {

    private static final long serialVersionUID = 1735417756;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OnlineRateSheetError_Log</code>
     */
    public static final OnlineratesheeterrorLog ONLINERATESHEETERROR_LOG = new OnlineratesheeterrorLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OnlineratesheeterrorLogRecord> getRecordType() {
        return OnlineratesheeterrorLogRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetError_Log.id</code>.
     */
    public final TableField<OnlineratesheeterrorLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetError_Log.filename</code>.
     */
    public final TableField<OnlineratesheeterrorLogRecord, String> FILENAME = createField("filename", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OnlineRateSheetError_Log.timestamp</code>.
     */
    public final TableField<OnlineratesheeterrorLogRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OnlineRateSheetError_Log</code> table reference
     */
    public OnlineratesheeterrorLog() {
        this(DSL.name("OnlineRateSheetError_Log"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheetError_Log</code> table reference
     */
    public OnlineratesheeterrorLog(String alias) {
        this(DSL.name(alias), ONLINERATESHEETERROR_LOG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OnlineRateSheetError_Log</code> table reference
     */
    public OnlineratesheeterrorLog(Name alias) {
        this(alias, ONLINERATESHEETERROR_LOG);
    }

    private OnlineratesheeterrorLog(Name alias, Table<OnlineratesheeterrorLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private OnlineratesheeterrorLog(Name alias, Table<OnlineratesheeterrorLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OnlineratesheeterrorLog(Table<O> child, ForeignKey<O, OnlineratesheeterrorLogRecord> key) {
        super(child, key, ONLINERATESHEETERROR_LOG);
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
    public Identity<OnlineratesheeterrorLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ONLINERATESHEETERROR_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheeterrorLog as(String alias) {
        return new OnlineratesheeterrorLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlineratesheeterrorLog as(Name alias) {
        return new OnlineratesheeterrorLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OnlineratesheeterrorLog rename(String name) {
        return new OnlineratesheeterrorLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OnlineratesheeterrorLog rename(Name name) {
        return new OnlineratesheeterrorLog(name, null);
    }
}
