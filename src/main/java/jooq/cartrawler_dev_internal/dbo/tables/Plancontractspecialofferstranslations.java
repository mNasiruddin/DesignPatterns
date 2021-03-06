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
import jooq.cartrawler_dev_internal.dbo.tables.records.PlancontractspecialofferstranslationsRecord;

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
public class Plancontractspecialofferstranslations extends TableImpl<PlancontractspecialofferstranslationsRecord> {

    private static final long serialVersionUID = 1120789758;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations</code>
     */
    public static final Plancontractspecialofferstranslations PLANCONTRACTSPECIALOFFERSTRANSLATIONS = new Plancontractspecialofferstranslations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlancontractspecialofferstranslationsRecord> getRecordType() {
        return PlancontractspecialofferstranslationsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations.id</code>.
     */
    public final TableField<PlancontractspecialofferstranslationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations.lang</code>.
     */
    public final TableField<PlancontractspecialofferstranslationsRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations.fk_offer</code>.
     */
    public final TableField<PlancontractspecialofferstranslationsRecord, Integer> FK_OFFER = createField("fk_offer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations.shortDesc</code>.
     */
    public final TableField<PlancontractspecialofferstranslationsRecord, String> SHORTDESC = createField("shortDesc", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations.longDesc</code>.
     */
    public final TableField<PlancontractspecialofferstranslationsRecord, String> LONGDESC = createField("longDesc", org.jooq.impl.SQLDataType.VARCHAR(1064), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations.htmlDesc</code>.
     */
    public final TableField<PlancontractspecialofferstranslationsRecord, String> HTMLDESC = createField("htmlDesc", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations</code> table reference
     */
    public Plancontractspecialofferstranslations() {
        this(DSL.name("PlanContractSpecialOffersTranslations"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations</code> table reference
     */
    public Plancontractspecialofferstranslations(String alias) {
        this(DSL.name(alias), PLANCONTRACTSPECIALOFFERSTRANSLATIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffersTranslations</code> table reference
     */
    public Plancontractspecialofferstranslations(Name alias) {
        this(alias, PLANCONTRACTSPECIALOFFERSTRANSLATIONS);
    }

    private Plancontractspecialofferstranslations(Name alias, Table<PlancontractspecialofferstranslationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plancontractspecialofferstranslations(Name alias, Table<PlancontractspecialofferstranslationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Plancontractspecialofferstranslations(Table<O> child, ForeignKey<O, PlancontractspecialofferstranslationsRecord> key) {
        super(child, key, PLANCONTRACTSPECIALOFFERSTRANSLATIONS);
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
        return Arrays.<Index>asList(Indexes.PLANCONTRACTSPECIALOFFERSTRANSLATIONS_PK_PLANCONTRACTSPECIALOFFERSTRANSLATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PlancontractspecialofferstranslationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PLANCONTRACTSPECIALOFFERSTRANSLATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlancontractspecialofferstranslationsRecord> getPrimaryKey() {
        return Keys.PK_PLANCONTRACTSPECIALOFFERSTRANSLATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlancontractspecialofferstranslationsRecord>> getKeys() {
        return Arrays.<UniqueKey<PlancontractspecialofferstranslationsRecord>>asList(Keys.PK_PLANCONTRACTSPECIALOFFERSTRANSLATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plancontractspecialofferstranslations as(String alias) {
        return new Plancontractspecialofferstranslations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plancontractspecialofferstranslations as(Name alias) {
        return new Plancontractspecialofferstranslations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plancontractspecialofferstranslations rename(String name) {
        return new Plancontractspecialofferstranslations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plancontractspecialofferstranslations rename(Name name) {
        return new Plancontractspecialofferstranslations(name, null);
    }
}
