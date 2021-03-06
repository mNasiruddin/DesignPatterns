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
import jooq.cartrawler_dev_internal.dbo.tables.records.EmailComptRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class EmailCompt extends TableImpl<EmailComptRecord> {

    private static final long serialVersionUID = 80777215;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Email_Compt</code>
     */
    public static final EmailCompt EMAIL_COMPT = new EmailCompt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailComptRecord> getRecordType() {
        return EmailComptRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_Compt.Email_Add</code>.
     */
    public final TableField<EmailComptRecord, String> EMAIL_ADD = createField("Email_Add", org.jooq.impl.SQLDataType.NVARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_Compt.Name</code>.
     */
    public final TableField<EmailComptRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.CHAR(60), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_Compt.Country</code>.
     */
    public final TableField<EmailComptRecord, String> COUNTRY = createField("Country", org.jooq.impl.SQLDataType.CHAR(60), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_Compt.Ans_Website</code>.
     */
    public final TableField<EmailComptRecord, String> ANS_WEBSITE = createField("Ans_Website", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_Compt.Ans_No_of_locations</code>.
     */
    public final TableField<EmailComptRecord, String> ANS_NO_OF_LOCATIONS = createField("Ans_No_of_locations", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_Compt.Ans_top_destination</code>.
     */
    public final TableField<EmailComptRecord, String> ANS_TOP_DESTINATION = createField("Ans_top_destination", org.jooq.impl.SQLDataType.CHAR(20), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Email_Compt</code> table reference
     */
    public EmailCompt() {
        this(DSL.name("Email_Compt"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Email_Compt</code> table reference
     */
    public EmailCompt(String alias) {
        this(DSL.name(alias), EMAIL_COMPT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Email_Compt</code> table reference
     */
    public EmailCompt(Name alias) {
        this(alias, EMAIL_COMPT);
    }

    private EmailCompt(Name alias, Table<EmailComptRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmailCompt(Name alias, Table<EmailComptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EmailCompt(Table<O> child, ForeignKey<O, EmailComptRecord> key) {
        super(child, key, EMAIL_COMPT);
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
        return Arrays.<Index>asList(Indexes.EMAIL_COMPT_PK_EMAIL_COMPT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmailComptRecord> getPrimaryKey() {
        return Keys.PK_EMAIL_COMPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailComptRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailComptRecord>>asList(Keys.PK_EMAIL_COMPT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailCompt as(String alias) {
        return new EmailCompt(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailCompt as(Name alias) {
        return new EmailCompt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailCompt rename(String name) {
        return new EmailCompt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailCompt rename(Name name) {
        return new EmailCompt(name, null);
    }
}
