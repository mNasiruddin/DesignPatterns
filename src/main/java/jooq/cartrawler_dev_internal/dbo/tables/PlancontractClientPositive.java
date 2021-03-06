/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.PlancontractClientPositiveRecord;

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
public class PlancontractClientPositive extends TableImpl<PlancontractClientPositiveRecord> {

    private static final long serialVersionUID = 985863259;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.plancontract_client_positive</code>
     */
    public static final PlancontractClientPositive PLANCONTRACT_CLIENT_POSITIVE = new PlancontractClientPositive();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlancontractClientPositiveRecord> getRecordType() {
        return PlancontractClientPositiveRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_positive.fk_plancontract</code>.
     */
    public final TableField<PlancontractClientPositiveRecord, Integer> FK_PLANCONTRACT = createField("fk_plancontract", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_positive.fk_client</code>.
     */
    public final TableField<PlancontractClientPositiveRecord, Integer> FK_CLIENT = createField("fk_client", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_positive.negativeFilter</code>.
     */
    public final TableField<PlancontractClientPositiveRecord, Boolean> NEGATIVEFILTER = createField("negativeFilter", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plancontract_client_positive.fk_plan</code>.
     */
    public final TableField<PlancontractClientPositiveRecord, Integer> FK_PLAN = createField("fk_plan", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.plancontract_client_positive</code> table reference
     */
    public PlancontractClientPositive() {
        this(DSL.name("plancontract_client_positive"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plancontract_client_positive</code> table reference
     */
    public PlancontractClientPositive(String alias) {
        this(DSL.name(alias), PLANCONTRACT_CLIENT_POSITIVE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plancontract_client_positive</code> table reference
     */
    public PlancontractClientPositive(Name alias) {
        this(alias, PLANCONTRACT_CLIENT_POSITIVE);
    }

    private PlancontractClientPositive(Name alias, Table<PlancontractClientPositiveRecord> aliased) {
        this(alias, aliased, null);
    }

    private PlancontractClientPositive(Name alias, Table<PlancontractClientPositiveRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PlancontractClientPositive(Table<O> child, ForeignKey<O, PlancontractClientPositiveRecord> key) {
        super(child, key, PLANCONTRACT_CLIENT_POSITIVE);
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
    public PlancontractClientPositive as(String alias) {
        return new PlancontractClientPositive(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlancontractClientPositive as(Name alias) {
        return new PlancontractClientPositive(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PlancontractClientPositive rename(String name) {
        return new PlancontractClientPositive(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlancontractClientPositive rename(Name name) {
        return new PlancontractClientPositive(name, null);
    }
}
