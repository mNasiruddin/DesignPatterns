/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.VehaveragepricecountryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Vehaveragepricecountry extends TableImpl<VehaveragepricecountryRecord> {

    private static final long serialVersionUID = -1608228063;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry</code>
     */
    public static final Vehaveragepricecountry VEHAVERAGEPRICECOUNTRY = new Vehaveragepricecountry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VehaveragepricecountryRecord> getRecordType() {
        return VehaveragepricecountryRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.parent_id</code>.
     */
    public final TableField<VehaveragepricecountryRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.countryCode</code>.
     */
    public final TableField<VehaveragepricecountryRecord, String> COUNTRYCODE = createField("countryCode", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.carType</code>.
     */
    public final TableField<VehaveragepricecountryRecord, String> CARTYPE = createField("carType", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.pickUpDate</code>.
     */
    public final TableField<VehaveragepricecountryRecord, Timestamp> PICKUPDATE = createField("pickUpDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.duration</code>.
     */
    public final TableField<VehaveragepricecountryRecord, Integer> DURATION = createField("duration", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.currencyCode</code>.
     */
    public final TableField<VehaveragepricecountryRecord, String> CURRENCYCODE = createField("currencyCode", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.resultsCount</code>.
     */
    public final TableField<VehaveragepricecountryRecord, Integer> RESULTSCOUNT = createField("resultsCount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry.averagePrice</code>.
     */
    public final TableField<VehaveragepricecountryRecord, BigDecimal> AVERAGEPRICE = createField("averagePrice", org.jooq.impl.SQLDataType.NUMERIC(38, 6), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry</code> table reference
     */
    public Vehaveragepricecountry() {
        this(DSL.name("vehAveragePriceCountry"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry</code> table reference
     */
    public Vehaveragepricecountry(String alias) {
        this(DSL.name(alias), VEHAVERAGEPRICECOUNTRY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.vehAveragePriceCountry</code> table reference
     */
    public Vehaveragepricecountry(Name alias) {
        this(alias, VEHAVERAGEPRICECOUNTRY);
    }

    private Vehaveragepricecountry(Name alias, Table<VehaveragepricecountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Vehaveragepricecountry(Name alias, Table<VehaveragepricecountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Vehaveragepricecountry(Table<O> child, ForeignKey<O, VehaveragepricecountryRecord> key) {
        super(child, key, VEHAVERAGEPRICECOUNTRY);
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
    public Vehaveragepricecountry as(String alias) {
        return new Vehaveragepricecountry(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vehaveragepricecountry as(Name alias) {
        return new Vehaveragepricecountry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Vehaveragepricecountry rename(String name) {
        return new Vehaveragepricecountry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Vehaveragepricecountry rename(Name name) {
        return new Vehaveragepricecountry(name, null);
    }
}