/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Syncobj_0x4137423836314443Record;

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
public class Syncobj_0x4137423836314443 extends TableImpl<Syncobj_0x4137423836314443Record> {

    private static final long serialVersionUID = 1980117732;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443</code>
     */
    public static final Syncobj_0x4137423836314443 SYNCOBJ_0X4137423836314443 = new Syncobj_0x4137423836314443();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Syncobj_0x4137423836314443Record> getRecordType() {
        return Syncobj_0x4137423836314443Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_id</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_name</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> CAR_AGENT_NAME = createField("car_agent_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.contact_phone</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> CONTACT_PHONE = createField("contact_phone", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.contact_fax</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> CONTACT_FAX = createField("contact_fax", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.country_id</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.booking_email</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> BOOKING_EMAIL = createField("booking_email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.airport_tax</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, BigDecimal> AIRPORT_TAX = createField("airport_tax", org.jooq.impl.SQLDataType.NUMERIC(5, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.plan_code</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> PLAN_CODE = createField("plan_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.account_no</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> ACCOUNT_NO = createField("account_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.rental_conditions</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> RENTAL_CONDITIONS = createField("rental_conditions", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.rates_email</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> RATES_EMAIL = createField("rates_email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.password</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.Airport_Tax_Amt</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, BigDecimal> AIRPORT_TAX_AMT = createField("Airport_Tax_Amt", org.jooq.impl.SQLDataType.NUMERIC(9, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.europe_rates</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Boolean> EUROPE_RATES = createField("europe_rates", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.freesale_code</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> FREESALE_CODE = createField("freesale_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_percent</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, BigDecimal> MARKUP_PERCENT = createField("markup_percent", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fully_paid</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Boolean> FULLY_PAID = createField("fully_paid", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_change_date</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Timestamp> MARKUP_CHANGE_DATE = createField("markup_change_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.markup_change_user</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> MARKUP_CHANGE_USER = createField("markup_change_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_desc</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> CAR_AGENT_DESC = createField("car_agent_desc", org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.car_agent_status</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Boolean> CAR_AGENT_STATUS = createField("car_agent_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, byte[]> IMAGE = createField("image", org.jooq.impl.SQLDataType.BINARY(2147483647), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image_width</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> IMAGE_WIDTH = createField("image_width", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.image_height</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> IMAGE_HEIGHT = createField("image_height", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.xml_agent_id</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> XML_AGENT_ID = createField("xml_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.xml_agent_type</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> XML_AGENT_TYPE = createField("xml_agent_type", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.year_loaded</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> YEAR_LOADED = createField("year_loaded", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.oneway_charge</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, BigDecimal> ONEWAY_CHARGE = createField("oneway_charge", org.jooq.impl.SQLDataType.NUMERIC(9, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.iscommercial</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Boolean> ISCOMMERCIAL = createField("iscommercial", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.priceless</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> PRICELESS = createField("priceless", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.picture</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.company_name</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.percentage_bias</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> PERCENTAGE_BIAS = createField("percentage_bias", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.technical_contact_email</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> TECHNICAL_CONTACT_EMAIL = createField("technical_contact_email", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.amendedBy</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.ui_token</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> UI_TOKEN = createField("ui_token", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.reporting_email</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> REPORTING_EMAIL = createField("reporting_email", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.preferred_supplier</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Boolean> PREFERRED_SUPPLIER = createField("preferred_supplier", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.cxl_fee</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, BigDecimal> CXL_FEE = createField("cxl_fee", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.cxl_currency</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> CXL_CURRENCY = createField("cxl_currency", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.pruning_category</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> PRUNING_CATEGORY = createField("pruning_category", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.ca_flags</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> CA_FLAGS = createField("ca_flags", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_legalagreement</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> FK_LEGALAGREEMENT = createField("fk_legalagreement", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_supplierbrand</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> FK_SUPPLIERBRAND = createField("fk_supplierbrand", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.fk_suppliers</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> FK_SUPPLIERS = createField("fk_suppliers", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.last_updated_date</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Timestamp> LAST_UPDATED_DATE = createField("last_updated_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.external_agent_id</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> EXTERNAL_AGENT_ID = createField("external_agent_id", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.aggregator_id</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> AGGREGATOR_ID = createField("aggregator_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.SP_OnewayRule</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Boolean> SP_ONEWAYRULE = createField("SP_OnewayRule", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.provider_type</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, UByte> PROVIDER_TYPE = createField("provider_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.caragent_rate_currency</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> CARAGENT_RATE_CURRENCY = createField("caragent_rate_currency", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, BigDecimal> SUPPLIER_CANCEL_FEE = createField("supplier_cancel_fee", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee_currency</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> SUPPLIER_CANCEL_FEE_CURRENCY = createField("supplier_cancel_fee_currency", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_free_days</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> SUPPLIER_CANCEL_FREE_DAYS = createField("supplier_cancel_free_days", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_days_before_pickup</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, Integer> SUPPLIER_CANCEL_DAYS_BEFORE_PICKUP = createField("supplier_cancel_days_before_pickup", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.supplier_cancel_fee_percent</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, BigDecimal> SUPPLIER_CANCEL_FEE_PERCENT = createField("supplier_cancel_fee_percent", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443.test_xml_agent_type</code>.
     */
    public final TableField<Syncobj_0x4137423836314443Record, String> TEST_XML_AGENT_TYPE = createField("test_xml_agent_type", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443</code> table reference
     */
    public Syncobj_0x4137423836314443() {
        this(DSL.name("syncobj_0x4137423836314443"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443</code> table reference
     */
    public Syncobj_0x4137423836314443(String alias) {
        this(DSL.name(alias), SYNCOBJ_0X4137423836314443);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x4137423836314443</code> table reference
     */
    public Syncobj_0x4137423836314443(Name alias) {
        this(alias, SYNCOBJ_0X4137423836314443);
    }

    private Syncobj_0x4137423836314443(Name alias, Table<Syncobj_0x4137423836314443Record> aliased) {
        this(alias, aliased, null);
    }

    private Syncobj_0x4137423836314443(Name alias, Table<Syncobj_0x4137423836314443Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syncobj_0x4137423836314443(Table<O> child, ForeignKey<O, Syncobj_0x4137423836314443Record> key) {
        super(child, key, SYNCOBJ_0X4137423836314443);
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
    public Identity<Syncobj_0x4137423836314443Record, Integer> getIdentity() {
        return Keys.IDENTITY_SYNCOBJ_0X4137423836314443;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4137423836314443 as(String alias) {
        return new Syncobj_0x4137423836314443(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4137423836314443 as(Name alias) {
        return new Syncobj_0x4137423836314443(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x4137423836314443 rename(String name) {
        return new Syncobj_0x4137423836314443(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x4137423836314443 rename(Name name) {
        return new Syncobj_0x4137423836314443(name, null);
    }
}
