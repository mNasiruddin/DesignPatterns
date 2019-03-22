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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationConditions_2022Record;

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
public class ReservationConditions_2022 extends TableImpl<ReservationConditions_2022Record> {

    private static final long serialVersionUID = 1011127387;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022</code>
     */
    public static final ReservationConditions_2022 RESERVATION_CONDITIONS_2022 = new ReservationConditions_2022();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationConditions_2022Record> getRecordType() {
        return ReservationConditions_2022Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.id</code>.
     */
    public final TableField<ReservationConditions_2022Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.fk_reservation</code>.
     */
    public final TableField<ReservationConditions_2022Record, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.order</code>.
     */
    public final TableField<ReservationConditions_2022Record, Integer> ORDER = createField("order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.summary</code>.
     */
    public final TableField<ReservationConditions_2022Record, Boolean> SUMMARY = createField("summary", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.lang</code>.
     */
    public final TableField<ReservationConditions_2022Record, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.titleHash</code>.
     */
    public final TableField<ReservationConditions_2022Record, String> TITLEHASH = createField("titleHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.textHash</code>.
     */
    public final TableField<ReservationConditions_2022Record, String> TEXTHASH = createField("textHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022.titleNameId</code>.
     */
    public final TableField<ReservationConditions_2022Record, Integer> TITLENAMEID = createField("titleNameId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022</code> table reference
     */
    public ReservationConditions_2022() {
        this(DSL.name("reservation_conditions_2022"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022</code> table reference
     */
    public ReservationConditions_2022(String alias) {
        this(DSL.name(alias), RESERVATION_CONDITIONS_2022);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions_2022</code> table reference
     */
    public ReservationConditions_2022(Name alias) {
        this(alias, RESERVATION_CONDITIONS_2022);
    }

    private ReservationConditions_2022(Name alias, Table<ReservationConditions_2022Record> aliased) {
        this(alias, aliased, null);
    }

    private ReservationConditions_2022(Name alias, Table<ReservationConditions_2022Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationConditions_2022(Table<O> child, ForeignKey<O, ReservationConditions_2022Record> key) {
        super(child, key, RESERVATION_CONDITIONS_2022);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_CONDITIONS_2022_FKRES, Indexes.RESERVATION_CONDITIONS_2022_IDX_TITLEHASH, Indexes.RESERVATION_CONDITIONS_2022_PK_RESERVATION_CONDITIONS_2022);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationConditions_2022Record, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_CONDITIONS_2022;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationConditions_2022Record> getPrimaryKey() {
        return Keys.PK_RESERVATION_CONDITIONS_2022;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationConditions_2022Record>> getKeys() {
        return Arrays.<UniqueKey<ReservationConditions_2022Record>>asList(Keys.PK_RESERVATION_CONDITIONS_2022);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2022 as(String alias) {
        return new ReservationConditions_2022(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2022 as(Name alias) {
        return new ReservationConditions_2022(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions_2022 rename(String name) {
        return new ReservationConditions_2022(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions_2022 rename(Name name) {
        return new ReservationConditions_2022(name, null);
    }
}