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
import jooq.cartrawler_dev_internal.dbo.tables.records.CarAgentSoldoutRecord;

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
public class CarAgentSoldout extends TableImpl<CarAgentSoldoutRecord> {

    private static final long serialVersionUID = 511195021;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout</code>
     */
    public static final CarAgentSoldout CAR_AGENT_SOLDOUT = new CarAgentSoldout();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarAgentSoldoutRecord> getRecordType() {
        return CarAgentSoldoutRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout.Soldout_ID</code>.
     */
    public final TableField<CarAgentSoldoutRecord, Integer> SOLDOUT_ID = createField("Soldout_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout.Car_Agent_ID</code>.
     */
    public final TableField<CarAgentSoldoutRecord, Integer> CAR_AGENT_ID = createField("Car_Agent_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout.Group_ID</code>.
     */
    public final TableField<CarAgentSoldoutRecord, String> GROUP_ID = createField("Group_ID", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout.Country_ID</code>.
     */
    public final TableField<CarAgentSoldoutRecord, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout.Start_Date</code>.
     */
    public final TableField<CarAgentSoldoutRecord, Timestamp> START_DATE = createField("Start_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout.End_Date</code>.
     */
    public final TableField<CarAgentSoldoutRecord, Timestamp> END_DATE = createField("End_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout</code> table reference
     */
    public CarAgentSoldout() {
        this(DSL.name("Car_Agent_Soldout"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout</code> table reference
     */
    public CarAgentSoldout(String alias) {
        this(DSL.name(alias), CAR_AGENT_SOLDOUT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Car_Agent_Soldout</code> table reference
     */
    public CarAgentSoldout(Name alias) {
        this(alias, CAR_AGENT_SOLDOUT);
    }

    private CarAgentSoldout(Name alias, Table<CarAgentSoldoutRecord> aliased) {
        this(alias, aliased, null);
    }

    private CarAgentSoldout(Name alias, Table<CarAgentSoldoutRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CarAgentSoldout(Table<O> child, ForeignKey<O, CarAgentSoldoutRecord> key) {
        super(child, key, CAR_AGENT_SOLDOUT);
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
        return Arrays.<Index>asList(Indexes.CAR_AGENT_SOLDOUT_PK_CAR_AGENT_SOLDOUT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CarAgentSoldoutRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CAR_AGENT_SOLDOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CarAgentSoldoutRecord> getPrimaryKey() {
        return Keys.PK_CAR_AGENT_SOLDOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CarAgentSoldoutRecord>> getKeys() {
        return Arrays.<UniqueKey<CarAgentSoldoutRecord>>asList(Keys.PK_CAR_AGENT_SOLDOUT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentSoldout as(String alias) {
        return new CarAgentSoldout(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentSoldout as(Name alias) {
        return new CarAgentSoldout(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentSoldout rename(String name) {
        return new CarAgentSoldout(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentSoldout rename(Name name) {
        return new CarAgentSoldout(name, null);
    }
}