/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ChannelpricingcontrolsRecord;

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
public class Channelpricingcontrols extends TableImpl<ChannelpricingcontrolsRecord> {

    private static final long serialVersionUID = -517965996;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ChannelPricingControls</code>
     */
    public static final Channelpricingcontrols CHANNELPRICINGCONTROLS = new Channelpricingcontrols();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChannelpricingcontrolsRecord> getRecordType() {
        return ChannelpricingcontrolsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.guid</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.id</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fk_channel</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> FK_CHANNEL = createField("fk_channel", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.name</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fromDate</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Timestamp> FROMDATE = createField("fromDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.toDate</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Timestamp> TODATE = createField("toDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fixedMarkup</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> FIXEDMARKUP = createField("fixedMarkup", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fixedMarkupCurrency</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> FIXEDMARKUPCURRENCY = createField("fixedMarkupCurrency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.perDay</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> PERDAY = createField("perDay", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.percentMarkup</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> PERCENTMARKUP = createField("percentMarkup", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.amendedBy</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.amendDate</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Timestamp> AMENDDATE = createField("amendDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.baseRate</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> BASERATE = createField("baseRate", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fk_approvedBy</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> FK_APPROVEDBY = createField("fk_approvedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.rejectReason</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> REJECTREASON = createField("rejectReason", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.SIPP</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> SIPP = createField("SIPP", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.minDays</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> MINDAYS = createField("minDays", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.maxDays</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> MAXDAYS = createField("maxDays", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fk_approver</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> FK_APPROVER = createField("fk_approver", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.absolutePrice</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> ABSOLUTEPRICE = createField("absolutePrice", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.safetyNet</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> SAFETYNET = createField("safetyNet", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.onewayOnly</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> ONEWAYONLY = createField("onewayOnly", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fk_location</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> FK_LOCATION = createField("fk_location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.residencies</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> RESIDENCIES = createField("residencies", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.pickupFrom</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Timestamp> PICKUPFROM = createField("pickupFrom", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.pickupTo</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Timestamp> PICKUPTO = createField("pickupTo", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.effectiveProducts</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> EFFECTIVEPRODUCTS = createField("effectiveProducts", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.notTheseSIPPs</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> NOTTHESESIPPS = createField("notTheseSIPPs", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.createDate</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.applyToAllDowntownLocations</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> APPLYTOALLDOWNTOWNLOCATIONS = createField("applyToAllDowntownLocations", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.fk_virtualLocation</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> FK_VIRTUALLOCATION = createField("fk_virtualLocation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.secondaryAmount</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> SECONDARYAMOUNT = createField("secondaryAmount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.endPriceMarkup</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> ENDPRICEMARKUP = createField("endPriceMarkup", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.secondaryPricing</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> SECONDARYPRICING = createField("secondaryPricing", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.retailMinimum</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> RETAILMINIMUM = createField("retailMinimum", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.cpcMargin</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> CPCMARGIN = createField("cpcMargin", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.dow_start</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> DOW_START = createField("dow_start", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.start_time</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.dow_end</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> DOW_END = createField("dow_end", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.end_time</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.madMode</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> MADMODE = createField("madMode", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.dynamicEPM</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> DYNAMICEPM = createField("dynamicEPM", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.cpcFlags</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> CPCFLAGS = createField("cpcFlags", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.insurance_product</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> INSURANCE_PRODUCT = createField("insurance_product", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.insurance_scheme</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> INSURANCE_SCHEME = createField("insurance_scheme", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.car_group</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> CAR_GROUP = createField("car_group", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.optimized_end_price_markup_day</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> OPTIMIZED_END_PRICE_MARKUP_DAY = createField("optimized_end_price_markup_day", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.optimizedPricingMarkupPercent</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> OPTIMIZEDPRICINGMARKUPPERCENT = createField("optimizedPricingMarkupPercent", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.cpc_spline_group</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Integer> CPC_SPLINE_GROUP = createField("cpc_spline_group", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.cpc_spline_minimax</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> CPC_SPLINE_MINIMAX = createField("cpc_spline_minimax", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.cpc_spline_attenuate</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> CPC_SPLINE_ATTENUATE = createField("cpc_spline_attenuate", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.advancetime_min</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> ADVANCETIME_MIN = createField("advancetime_min", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.advancetime_max</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> ADVANCETIME_MAX = createField("advancetime_max", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.payment_model</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Short> PAYMENT_MODEL = createField("payment_model", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.keyValuePairs</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, String> KEYVALUEPAIRS = createField("keyValuePairs", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.advance_price_control</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, Boolean> ADVANCE_PRICE_CONTROL = createField("advance_price_control", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.advance_price_min</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> ADVANCE_PRICE_MIN = createField("advance_price_min", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.advance_price_max</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> ADVANCE_PRICE_MAX = createField("advance_price_max", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ChannelPricingControls.minimum_base_rate_per_day</code>.
     */
    public final TableField<ChannelpricingcontrolsRecord, BigDecimal> MINIMUM_BASE_RATE_PER_DAY = createField("minimum_base_rate_per_day", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ChannelPricingControls</code> table reference
     */
    public Channelpricingcontrols() {
        this(DSL.name("ChannelPricingControls"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelPricingControls</code> table reference
     */
    public Channelpricingcontrols(String alias) {
        this(DSL.name(alias), CHANNELPRICINGCONTROLS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ChannelPricingControls</code> table reference
     */
    public Channelpricingcontrols(Name alias) {
        this(alias, CHANNELPRICINGCONTROLS);
    }

    private Channelpricingcontrols(Name alias, Table<ChannelpricingcontrolsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Channelpricingcontrols(Name alias, Table<ChannelpricingcontrolsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Channelpricingcontrols(Table<O> child, ForeignKey<O, ChannelpricingcontrolsRecord> key) {
        super(child, key, CHANNELPRICINGCONTROLS);
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
        return Arrays.<Index>asList(Indexes.CHANNELPRICINGCONTROLS_DWD, Indexes.CHANNELPRICINGCONTROLS_PK_CHANNELPRICECONTROLS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ChannelpricingcontrolsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CHANNELPRICINGCONTROLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ChannelpricingcontrolsRecord> getPrimaryKey() {
        return Keys.PK_CHANNELPRICECONTROLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChannelpricingcontrolsRecord>> getKeys() {
        return Arrays.<UniqueKey<ChannelpricingcontrolsRecord>>asList(Keys.PK_CHANNELPRICECONTROLS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelpricingcontrols as(String alias) {
        return new Channelpricingcontrols(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelpricingcontrols as(Name alias) {
        return new Channelpricingcontrols(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpricingcontrols rename(String name) {
        return new Channelpricingcontrols(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpricingcontrols rename(Name name) {
        return new Channelpricingcontrols(name, null);
    }
}
