/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CtReservationFinancialsRecord;

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
public class CtReservationFinancials extends TableImpl<CtReservationFinancialsRecord> {

    private static final long serialVersionUID = -1451812085;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CT_reservation_financials</code>
     */
    public static final CtReservationFinancials CT_RESERVATION_FINANCIALS = new CtReservationFinancials();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtReservationFinancialsRecord> getRecordType() {
        return CtReservationFinancialsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_reservation_financials.pkid</code>.
     */
    public final TableField<CtReservationFinancialsRecord, Long> PKID = createField("pkid", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_reservation_financials.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<CtReservationFinancialsRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_reservation_financials.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<CtReservationFinancialsRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_reservation_financials.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<CtReservationFinancialsRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_reservation_financials.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<CtReservationFinancialsRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_reservation_financials.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<CtReservationFinancialsRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_reservation_financials.id</code>.
     */
    public final TableField<CtReservationFinancialsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CT_reservation_financials</code> table reference
     */
    public CtReservationFinancials() {
        this(DSL.name("CT_reservation_financials"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_reservation_financials</code> table reference
     */
    public CtReservationFinancials(String alias) {
        this(DSL.name(alias), CT_RESERVATION_FINANCIALS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_reservation_financials</code> table reference
     */
    public CtReservationFinancials(Name alias) {
        this(alias, CT_RESERVATION_FINANCIALS);
    }

    private CtReservationFinancials(Name alias, Table<CtReservationFinancialsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtReservationFinancials(Name alias, Table<CtReservationFinancialsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CtReservationFinancials(Table<O> child, ForeignKey<O, CtReservationFinancialsRecord> key) {
        super(child, key, CT_RESERVATION_FINANCIALS);
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
        return Arrays.<Index>asList(Indexes.CT_RESERVATION_FINANCIALS_PK_CT_RESERVATION_FINANCIALS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CtReservationFinancialsRecord, Long> getIdentity() {
        return Keys.IDENTITY_CT_RESERVATION_FINANCIALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtReservationFinancialsRecord> getPrimaryKey() {
        return Keys.PK_CT_RESERVATION_FINANCIALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtReservationFinancialsRecord>> getKeys() {
        return Arrays.<UniqueKey<CtReservationFinancialsRecord>>asList(Keys.PK_CT_RESERVATION_FINANCIALS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtReservationFinancials as(String alias) {
        return new CtReservationFinancials(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtReservationFinancials as(Name alias) {
        return new CtReservationFinancials(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtReservationFinancials rename(String name) {
        return new CtReservationFinancials(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtReservationFinancials rename(Name name) {
        return new CtReservationFinancials(name, null);
    }
}
