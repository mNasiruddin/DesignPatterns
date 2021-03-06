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
import jooq.cartrawler_dev_internal.dbo.tables.records.CarAgentsOpeningHoursRecord;

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
public class CarAgentsOpeningHours extends TableImpl<CarAgentsOpeningHoursRecord> {

    private static final long serialVersionUID = 867262011;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours</code>
     */
    public static final CarAgentsOpeningHours CAR_AGENTS_OPENING_HOURS = new CarAgentsOpeningHours();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarAgentsOpeningHoursRecord> getRecordType() {
        return CarAgentsOpeningHoursRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.open_id</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, Integer> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.location_id</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.car_agent_id</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.day_no</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, Integer> DAY_NO = createField("day_no", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.open_from</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, BigDecimal> OPEN_FROM = createField("open_from", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.open_to</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, BigDecimal> OPEN_TO = createField("open_to", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.open_24_hr</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, Boolean> OPEN_24_HR = createField("open_24_hr", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.lunch_from</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, BigDecimal> LUNCH_FROM = createField("lunch_from", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours.lunch_to</code>.
     */
    public final TableField<CarAgentsOpeningHoursRecord, BigDecimal> LUNCH_TO = createField("lunch_to", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours</code> table reference
     */
    public CarAgentsOpeningHours() {
        this(DSL.name("Car_Agents_Opening_Hours"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours</code> table reference
     */
    public CarAgentsOpeningHours(String alias) {
        this(DSL.name(alias), CAR_AGENTS_OPENING_HOURS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Car_Agents_Opening_Hours</code> table reference
     */
    public CarAgentsOpeningHours(Name alias) {
        this(alias, CAR_AGENTS_OPENING_HOURS);
    }

    private CarAgentsOpeningHours(Name alias, Table<CarAgentsOpeningHoursRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarAgentsOpeningHours(Name alias, Table<CarAgentsOpeningHoursRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CarAgentsOpeningHours(Table<O> child, ForeignKey<O, CarAgentsOpeningHoursRecord> key) {
        super(child, key, CAR_AGENTS_OPENING_HOURS);
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
        return Arrays.<Index>asList(Indexes.CAR_AGENTS_OPENING_HOURS_PK_CAR_AGENTS_OPENING_HOURS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CarAgentsOpeningHoursRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAR_AGENTS_OPENING_HOURS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CarAgentsOpeningHoursRecord> getPrimaryKey() {
        return Keys.PK_CAR_AGENTS_OPENING_HOURS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CarAgentsOpeningHoursRecord>> getKeys() {
        return Arrays.<UniqueKey<CarAgentsOpeningHoursRecord>>asList(Keys.PK_CAR_AGENTS_OPENING_HOURS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentsOpeningHours as(String alias) {
        return new CarAgentsOpeningHours(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentsOpeningHours as(Name alias) {
        return new CarAgentsOpeningHours(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentsOpeningHours rename(String name) {
        return new CarAgentsOpeningHours(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentsOpeningHours rename(Name name) {
        return new CarAgentsOpeningHours(name, null);
    }
}
