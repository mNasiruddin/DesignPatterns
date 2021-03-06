/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.PlanRecord;

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
public class Plan extends TableImpl<PlanRecord> {

    private static final long serialVersionUID = 753164416;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.plan</code>
     */
    public static final Plan PLAN = new Plan();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlanRecord> getRecordType() {
        return PlanRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan.guid</code>.
     */
    public final TableField<PlanRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan.ID</code>.
     */
    public final TableField<PlanRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan.name</code>.
     */
    public final TableField<PlanRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan.msTimeout</code>.
     */
    public final TableField<PlanRecord, Integer> MSTIMEOUT = createField("msTimeout", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan.amendedBy</code>.
     */
    public final TableField<PlanRecord, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan.flexiUp</code>.
     */
    public final TableField<PlanRecord, Boolean> FLEXIUP = createField("flexiUp", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.plan</code> table reference
     */
    public Plan() {
        this(DSL.name("plan"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plan</code> table reference
     */
    public Plan(String alias) {
        this(DSL.name(alias), PLAN);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plan</code> table reference
     */
    public Plan(Name alias) {
        this(alias, PLAN);
    }

    private Plan(Name alias, Table<PlanRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plan(Name alias, Table<PlanRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Plan(Table<O> child, ForeignKey<O, PlanRecord> key) {
        super(child, key, PLAN);
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
        return Arrays.<Index>asList(Indexes.PLAN_IX_PLAN_1, Indexes.PLAN_PK_PLAN_1, Indexes.PLAN_PK_PLAN_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PlanRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PLAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlanRecord> getPrimaryKey() {
        return Keys.PK_PLAN_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlanRecord>> getKeys() {
        return Arrays.<UniqueKey<PlanRecord>>asList(Keys.PK_PLAN_2, Keys.PK_PLAN_1, Keys.IX_PLAN_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plan as(String alias) {
        return new Plan(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plan as(Name alias) {
        return new Plan(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plan rename(String name) {
        return new Plan(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plan rename(Name name) {
        return new Plan(name, null);
    }
}
