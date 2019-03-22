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
import jooq.cartrawler_dev_internal.dbo.tables.records.ScrapingJobsRecord;

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
import org.jooq.types.UByte;


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
public class ScrapingJobs extends TableImpl<ScrapingJobsRecord> {

    private static final long serialVersionUID = 324340099;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.scraping_jobs</code>
     */
    public static final ScrapingJobs SCRAPING_JOBS = new ScrapingJobs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScrapingJobsRecord> getRecordType() {
        return ScrapingJobsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.id</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.scraper</code>.
     */
    public final TableField<ScrapingJobsRecord, String> SCRAPER = createField("scraper", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.scrapePricing</code>.
     */
    public final TableField<ScrapingJobsRecord, String> SCRAPEPRICING = createField("scrapePricing", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.sourceCountry</code>.
     */
    public final TableField<ScrapingJobsRecord, String> SOURCECOUNTRY = createField("sourceCountry", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.rentalDuration</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> RENTALDURATION = createField("rentalDuration", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.pickupDay</code>.
     */
    public final TableField<ScrapingJobsRecord, String> PICKUPDAY = createField("pickupDay", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.advance</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> ADVANCE = createField("advance", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.locationId</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> LOCATIONID = createField("locationId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.clientIds</code>.
     */
    public final TableField<ScrapingJobsRecord, String> CLIENTIDS = createField("clientIds", org.jooq.impl.SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.schedule</code>.
     */
    public final TableField<ScrapingJobsRecord, String> SCHEDULE = createField("schedule", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.hourlyinterval</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> HOURLYINTERVAL = createField("hourlyinterval", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.intervalFrom</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> INTERVALFROM = createField("intervalFrom", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.intervalTo</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> INTERVALTO = createField("intervalTo", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.safetyNetChannel</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> SAFETYNETCHANNEL = createField("safetyNetChannel", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.pricingChannel</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> PRICINGCHANNEL = createField("pricingChannel", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.minRank</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> MINRANK = createField("minRank", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.topRank</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> TOPRANK = createField("topRank", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.absoluteReduction</code>.
     */
    public final TableField<ScrapingJobsRecord, Double> ABSOLUTEREDUCTION = createField("absoluteReduction", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.pcReduction</code>.
     */
    public final TableField<ScrapingJobsRecord, Double> PCREDUCTION = createField("pcReduction", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.dowStart</code>.
     */
    public final TableField<ScrapingJobsRecord, String> DOWSTART = createField("dowStart", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.startTime</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> STARTTIME = createField("startTime", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.dowEnd</code>.
     */
    public final TableField<ScrapingJobsRecord, String> DOWEND = createField("dowEnd", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.endTime</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> ENDTIME = createField("endTime", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.currency</code>.
     */
    public final TableField<ScrapingJobsRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.userId</code>.
     */
    public final TableField<ScrapingJobsRecord, Integer> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.updatedDate</code>.
     */
    public final TableField<ScrapingJobsRecord, Timestamp> UPDATEDDATE = createField("updatedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.lastRunDate</code>.
     */
    public final TableField<ScrapingJobsRecord, Timestamp> LASTRUNDATE = createField("lastRunDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.active</code>.
     */
    public final TableField<ScrapingJobsRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.scrapes_ran</code>.
     */
    public final TableField<ScrapingJobsRecord, UByte> SCRAPES_RAN = createField("scrapes_ran", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.awaiting_post_process</code>.
     */
    public final TableField<ScrapingJobsRecord, Boolean> AWAITING_POST_PROCESS = createField("awaiting_post_process", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.email_recipients</code>.
     */
    public final TableField<ScrapingJobsRecord, String> EMAIL_RECIPIENTS = createField("email_recipients", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.pickupTimes</code>.
     */
    public final TableField<ScrapingJobsRecord, String> PICKUPTIMES = createField("pickupTimes", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.dropoffTimes</code>.
     */
    public final TableField<ScrapingJobsRecord, String> DROPOFFTIMES = createField("dropoffTimes", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.setId</code>.
     */
    public final TableField<ScrapingJobsRecord, String> SETID = createField("setId", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.successiveError</code>.
     */
    public final TableField<ScrapingJobsRecord, UByte> SUCCESSIVEERROR = createField("successiveError", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.gt_pickup_id</code>.
     */
    public final TableField<ScrapingJobsRecord, String> GT_PICKUP_ID = createField("gt_pickup_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.gt_return_id</code>.
     */
    public final TableField<ScrapingJobsRecord, String> GT_RETURN_ID = createField("gt_return_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.adults</code>.
     */
    public final TableField<ScrapingJobsRecord, UByte> ADULTS = createField("adults", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.children</code>.
     */
    public final TableField<ScrapingJobsRecord, UByte> CHILDREN = createField("children", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.return</code>.
     */
    public final TableField<ScrapingJobsRecord, Boolean> RETURN = createField("return", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.group_by_set_id</code>.
     */
    public final TableField<ScrapingJobsRecord, Boolean> GROUP_BY_SET_ID = createField("group_by_set_id", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.specificPickup</code>.
     */
    public final TableField<ScrapingJobsRecord, Timestamp> SPECIFICPICKUP = createField("specificPickup", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.specificDropoff</code>.
     */
    public final TableField<ScrapingJobsRecord, Timestamp> SPECIFICDROPOFF = createField("specificDropoff", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.debitCardOnly</code>.
     */
    public final TableField<ScrapingJobsRecord, Boolean> DEBITCARDONLY = createField("debitCardOnly", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_jobs.creditCardOnly</code>.
     */
    public final TableField<ScrapingJobsRecord, Boolean> CREDITCARDONLY = createField("creditCardOnly", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.scraping_jobs</code> table reference
     */
    public ScrapingJobs() {
        this(DSL.name("scraping_jobs"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.scraping_jobs</code> table reference
     */
    public ScrapingJobs(String alias) {
        this(DSL.name(alias), SCRAPING_JOBS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.scraping_jobs</code> table reference
     */
    public ScrapingJobs(Name alias) {
        this(alias, SCRAPING_JOBS);
    }

    private ScrapingJobs(Name alias, Table<ScrapingJobsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScrapingJobs(Name alias, Table<ScrapingJobsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ScrapingJobs(Table<O> child, ForeignKey<O, ScrapingJobsRecord> key) {
        super(child, key, SCRAPING_JOBS);
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
        return Arrays.<Index>asList(Indexes.SCRAPING_JOBS_PK__SCRAPING__3213E83F31C57D50);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ScrapingJobsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCRAPING_JOBS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ScrapingJobsRecord> getPrimaryKey() {
        return Keys.PK__SCRAPING__3213E83F31C57D50;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScrapingJobsRecord>> getKeys() {
        return Arrays.<UniqueKey<ScrapingJobsRecord>>asList(Keys.PK__SCRAPING__3213E83F31C57D50);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapingJobs as(String alias) {
        return new ScrapingJobs(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapingJobs as(Name alias) {
        return new ScrapingJobs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScrapingJobs rename(String name) {
        return new ScrapingJobs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScrapingJobs rename(Name name) {
        return new ScrapingJobs(name, null);
    }
}