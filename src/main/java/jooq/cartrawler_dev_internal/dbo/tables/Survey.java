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
import jooq.cartrawler_dev_internal.dbo.tables.records.SurveyRecord;

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
public class Survey extends TableImpl<SurveyRecord> {

    private static final long serialVersionUID = 110215737;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Survey</code>
     */
    public static final Survey SURVEY = new Survey();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SurveyRecord> getRecordType() {
        return SurveyRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Survey.id</code>.
     */
    public final TableField<SurveyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Survey.title</code>.
     */
    public final TableField<SurveyRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Survey.language</code>.
     */
    public final TableField<SurveyRecord, String> LANGUAGE = createField("language", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Survey.created</code>.
     */
    public final TableField<SurveyRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Survey</code> table reference
     */
    public Survey() {
        this(DSL.name("Survey"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Survey</code> table reference
     */
    public Survey(String alias) {
        this(DSL.name(alias), SURVEY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Survey</code> table reference
     */
    public Survey(Name alias) {
        this(alias, SURVEY);
    }

    private Survey(Name alias, Table<SurveyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Survey(Name alias, Table<SurveyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Survey(Table<O> child, ForeignKey<O, SurveyRecord> key) {
        super(child, key, SURVEY);
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
        return Arrays.<Index>asList(Indexes.SURVEY_PK__SURVEY__3213E83F60D63D4B, Indexes.SURVEY_PK_SURVEY_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SurveyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SURVEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SurveyRecord> getPrimaryKey() {
        return Keys.PK_SURVEY_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SurveyRecord>> getKeys() {
        return Arrays.<UniqueKey<SurveyRecord>>asList(Keys.PK_SURVEY_1, Keys.PK__SURVEY__3213E83F60D63D4B);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Survey as(String alias) {
        return new Survey(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Survey as(Name alias) {
        return new Survey(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Survey rename(String name) {
        return new Survey(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Survey rename(Name name) {
        return new Survey(name, null);
    }
}