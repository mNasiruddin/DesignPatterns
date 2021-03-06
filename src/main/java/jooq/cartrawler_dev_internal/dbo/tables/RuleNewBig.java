/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.RuleNewBigRecord;

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
public class RuleNewBig extends TableImpl<RuleNewBigRecord> {

    private static final long serialVersionUID = -648768147;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.rule_new_big</code>
     */
    public static final RuleNewBig RULE_NEW_BIG = new RuleNewBig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleNewBigRecord> getRecordType() {
        return RuleNewBigRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.guid</code>.
     */
    public final TableField<RuleNewBigRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.rule_id</code>.
     */
    public final TableField<RuleNewBigRecord, Integer> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.parent_rule_id</code>.
     */
    public final TableField<RuleNewBigRecord, Integer> PARENT_RULE_ID = createField("parent_rule_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.type</code>.
     */
    public final TableField<RuleNewBigRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.rule_values</code>.
     */
    public final TableField<RuleNewBigRecord, String> RULE_VALUES = createField("rule_values", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.rule_values_big</code>.
     */
    public final TableField<RuleNewBigRecord, String> RULE_VALUES_BIG = createField("rule_values_big", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.rule_charge_id</code>.
     */
    public final TableField<RuleNewBigRecord, Integer> RULE_CHARGE_ID = createField("rule_charge_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.rule_message_id</code>.
     */
    public final TableField<RuleNewBigRecord, Integer> RULE_MESSAGE_ID = createField("rule_message_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.user_id</code>.
     */
    public final TableField<RuleNewBigRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new_big.amenddate</code>.
     */
    public final TableField<RuleNewBigRecord, Timestamp> AMENDDATE = createField("amenddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.rule_new_big</code> table reference
     */
    public RuleNewBig() {
        this(DSL.name("rule_new_big"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_new_big</code> table reference
     */
    public RuleNewBig(String alias) {
        this(DSL.name(alias), RULE_NEW_BIG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_new_big</code> table reference
     */
    public RuleNewBig(Name alias) {
        this(alias, RULE_NEW_BIG);
    }

    private RuleNewBig(Name alias, Table<RuleNewBigRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleNewBig(Name alias, Table<RuleNewBigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RuleNewBig(Table<O> child, ForeignKey<O, RuleNewBigRecord> key) {
        super(child, key, RULE_NEW_BIG);
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
    public Identity<RuleNewBigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RULE_NEW_BIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleNewBig as(String alias) {
        return new RuleNewBig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleNewBig as(Name alias) {
        return new RuleNewBig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleNewBig rename(String name) {
        return new RuleNewBig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleNewBig rename(Name name) {
        return new RuleNewBig(name, null);
    }
}
