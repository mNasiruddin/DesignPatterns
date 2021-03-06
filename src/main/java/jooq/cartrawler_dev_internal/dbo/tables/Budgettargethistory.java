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
import jooq.cartrawler_dev_internal.dbo.tables.records.BudgettargethistoryRecord;

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
public class Budgettargethistory extends TableImpl<BudgettargethistoryRecord> {

    private static final long serialVersionUID = 1872888331;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.budgetTargetHistory</code>
     */
    public static final Budgettargethistory BUDGETTARGETHISTORY = new Budgettargethistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BudgettargethistoryRecord> getRecordType() {
        return BudgettargethistoryRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.budgetTargetHistory.id</code>.
     */
    public final TableField<BudgettargethistoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.budgetTargetHistory.fk_budgetTarget</code>.
     */
    public final TableField<BudgettargethistoryRecord, Integer> FK_BUDGETTARGET = createField("fk_budgetTarget", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.budgetTargetHistory.v1</code>.
     */
    public final TableField<BudgettargethistoryRecord, Integer> V1 = createField("v1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.budgetTargetHistory.v2</code>.
     */
    public final TableField<BudgettargethistoryRecord, Integer> V2 = createField("v2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.budgetTargetHistory.calcDate</code>.
     */
    public final TableField<BudgettargethistoryRecord, Timestamp> CALCDATE = createField("calcDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.budgetTargetHistory</code> table reference
     */
    public Budgettargethistory() {
        this(DSL.name("budgetTargetHistory"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.budgetTargetHistory</code> table reference
     */
    public Budgettargethistory(String alias) {
        this(DSL.name(alias), BUDGETTARGETHISTORY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.budgetTargetHistory</code> table reference
     */
    public Budgettargethistory(Name alias) {
        this(alias, BUDGETTARGETHISTORY);
    }

    private Budgettargethistory(Name alias, Table<BudgettargethistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Budgettargethistory(Name alias, Table<BudgettargethistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Budgettargethistory(Table<O> child, ForeignKey<O, BudgettargethistoryRecord> key) {
        super(child, key, BUDGETTARGETHISTORY);
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
        return Arrays.<Index>asList(Indexes.BUDGETTARGETHISTORY_PK_BUDGETTARGETHISTORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BudgettargethistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUDGETTARGETHISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BudgettargethistoryRecord> getPrimaryKey() {
        return Keys.PK_BUDGETTARGETHISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BudgettargethistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<BudgettargethistoryRecord>>asList(Keys.PK_BUDGETTARGETHISTORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Budgettargethistory as(String alias) {
        return new Budgettargethistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Budgettargethistory as(Name alias) {
        return new Budgettargethistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Budgettargethistory rename(String name) {
        return new Budgettargethistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Budgettargethistory rename(Name name) {
        return new Budgettargethistory(name, null);
    }
}
