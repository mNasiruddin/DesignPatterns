/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.EmailMarketingRecord;

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
public class EmailMarketing extends TableImpl<EmailMarketingRecord> {

    private static final long serialVersionUID = -673792465;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Email_marketing</code>
     */
    public static final EmailMarketing EMAIL_MARKETING = new EmailMarketing();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailMarketingRecord> getRecordType() {
        return EmailMarketingRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.guid</code>.
     */
    public final TableField<EmailMarketingRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Email_Add</code>.
     */
    public final TableField<EmailMarketingRecord, String> EMAIL_ADD = createField("Email_Add", org.jooq.impl.SQLDataType.VARCHAR(55).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.First_name</code>.
     */
    public final TableField<EmailMarketingRecord, String> FIRST_NAME = createField("First_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Last_Name</code>.
     */
    public final TableField<EmailMarketingRecord, String> LAST_NAME = createField("Last_Name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Unsubscribe</code>.
     */
    public final TableField<EmailMarketingRecord, Boolean> UNSUBSCRIBE = createField("Unsubscribe", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Competition</code>.
     */
    public final TableField<EmailMarketingRecord, String> COMPETITION = createField("Competition", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Affiliate_Id</code>.
     */
    public final TableField<EmailMarketingRecord, String> AFFILIATE_ID = createField("Affiliate_Id", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Coupon_Id</code>.
     */
    public final TableField<EmailMarketingRecord, String> COUPON_ID = createField("Coupon_Id", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Country_From</code>.
     */
    public final TableField<EmailMarketingRecord, String> COUNTRY_FROM = createField("Country_From", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Booked_for</code>.
     */
    public final TableField<EmailMarketingRecord, String> BOOKED_FOR = createField("Booked_for", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Pickup_Location</code>.
     */
    public final TableField<EmailMarketingRecord, String> PICKUP_LOCATION = createField("Pickup_Location", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.ClubArgus</code>.
     */
    public final TableField<EmailMarketingRecord, Boolean> CLUBARGUS = createField("ClubArgus", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.EntryDate</code>.
     */
    public final TableField<EmailMarketingRecord, Timestamp> ENTRYDATE = createField("EntryDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.password</code>.
     */
    public final TableField<EmailMarketingRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.phone_number</code>.
     */
    public final TableField<EmailMarketingRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.NVARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Email_Type</code>.
     */
    public final TableField<EmailMarketingRecord, Short> EMAIL_TYPE = createField("Email_Type", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.Customer_Id</code>.
     */
    public final TableField<EmailMarketingRecord, Long> CUSTOMER_ID = createField("Customer_Id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Email_marketing.language</code>.
     */
    public final TableField<EmailMarketingRecord, String> LANGUAGE = createField("language", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Email_marketing</code> table reference
     */
    public EmailMarketing() {
        this(DSL.name("Email_marketing"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Email_marketing</code> table reference
     */
    public EmailMarketing(String alias) {
        this(DSL.name(alias), EMAIL_MARKETING);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Email_marketing</code> table reference
     */
    public EmailMarketing(Name alias) {
        this(alias, EMAIL_MARKETING);
    }

    private EmailMarketing(Name alias, Table<EmailMarketingRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmailMarketing(Name alias, Table<EmailMarketingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EmailMarketing(Table<O> child, ForeignKey<O, EmailMarketingRecord> key) {
        super(child, key, EMAIL_MARKETING);
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
        return Arrays.<Index>asList(Indexes.EMAIL_MARKETING_EMAIL, Indexes.EMAIL_MARKETING_NODUPS, Indexes.EMAIL_MARKETING_PK_EMAIL_MARKETING_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailMarketingRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailMarketingRecord>>asList(Keys.PK_EMAIL_MARKETING_1, Keys.NODUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketing as(String alias) {
        return new EmailMarketing(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailMarketing as(Name alias) {
        return new EmailMarketing(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailMarketing rename(String name) {
        return new EmailMarketing(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailMarketing rename(Name name) {
        return new EmailMarketing(name, null);
    }
}
