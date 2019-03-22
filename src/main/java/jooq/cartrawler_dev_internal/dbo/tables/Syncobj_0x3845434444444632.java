/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Syncobj_0x3845434444444632Record;

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
public class Syncobj_0x3845434444444632 extends TableImpl<Syncobj_0x3845434444444632Record> {

    private static final long serialVersionUID = 1469112895;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632</code>
     */
    public static final Syncobj_0x3845434444444632 SYNCOBJ_0X3845434444444632 = new Syncobj_0x3845434444444632();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Syncobj_0x3845434444444632Record> getRecordType() {
        return Syncobj_0x3845434444444632Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_ID</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> USER_ID = createField("User_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_Name</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> USER_NAME = createField("User_Name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Password</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, byte[]> PASSWORD = createField("Password", org.jooq.impl.SQLDataType.VARBINARY(8000).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.PIN</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> PIN = createField("PIN", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Confirm_Enabled</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> CONFIRM_ENABLED = createField("Confirm_Enabled", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Name</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.EMail</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> EMAIL = createField("EMail", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Address</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> ADDRESS = createField("Address", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Phone_No</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> PHONE_NO = createField("Phone_No", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Fax_No</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> FAX_NO = createField("Fax_No", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Location_ID</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> LOCATION_ID = createField("Location_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Agency_ID</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> AGENCY_ID = createField("Agency_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Agency_Master</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> AGENCY_MASTER = createField("Agency_Master", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.System_Master</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> SYSTEM_MASTER = createField("System_Master", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Reports_User</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> REPORTS_USER = createField("Reports_User", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Marketing_User</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> MARKETING_USER = createField("Marketing_User", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Disabled</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> DISABLED = createField("Disabled", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_Type</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> USER_TYPE = createField("User_Type", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Financial_access</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> FINANCIAL_ACCESS = createField("Financial_access", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isdeleted</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> ISDELETED = createField("isdeleted", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.rights</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> RIGHTS = createField("rights", org.jooq.impl.SQLDataType.VARCHAR(5000), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.mobile</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsDemoMode</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> PREFSDEMOMODE = createField("prefsDemoMode", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsDataMode</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> PREFSDATAMODE = createField("prefsDataMode", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsHighPrecisionMode</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> PREFSHIGHPRECISIONMODE = createField("prefsHighPrecisionMode", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pricingMaxFrom</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> PRICINGMAXFROM = createField("pricingMaxFrom", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pricingMaxTo</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> PRICINGMAXTO = createField("pricingMaxTo", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.fk_pricingApprover</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> FK_PRICINGAPPROVER = createField("fk_pricingApprover", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.org_id</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> ORG_ID = createField("org_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pref_db_host</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, String> PREF_DB_HOST = createField("pref_db_host", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.amendedBy</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isGroup</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> ISGROUP = createField("isGroup", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isClientUser</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> ISCLIENTUSER = createField("isClientUser", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.originatingClient</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> ORIGINATINGCLIENT = createField("originatingClient", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.userClientID</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> USERCLIENTID = createField("userClientID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.nontrustedclient</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> NONTRUSTEDCLIENT = createField("nontrustedclient", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.lastChangePass</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Timestamp> LASTCHANGEPASS = createField("lastChangePass", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.defaultDashboardChannelType</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, UByte> DEFAULTDASHBOARDCHANNELTYPE = createField("defaultDashboardChannelType", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isKoiosUser</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> ISKOIOSUSER = createField("isKoiosUser", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.UserFlags</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> USERFLAGS = createField("UserFlags", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.car_agent_id</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.GenesysExtension</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Short> GENESYSEXTENSION = createField("GenesysExtension", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.lastlogindate</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Timestamp> LASTLOGINDATE = createField("lastlogindate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.redshift</code>.
     */
    public final TableField<Syncobj_0x3845434444444632Record, Boolean> REDSHIFT = createField("redshift", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632</code> table reference
     */
    public Syncobj_0x3845434444444632() {
        this(DSL.name("syncobj_0x3845434444444632"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632</code> table reference
     */
    public Syncobj_0x3845434444444632(String alias) {
        this(DSL.name(alias), SYNCOBJ_0X3845434444444632);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632</code> table reference
     */
    public Syncobj_0x3845434444444632(Name alias) {
        this(alias, SYNCOBJ_0X3845434444444632);
    }

    private Syncobj_0x3845434444444632(Name alias, Table<Syncobj_0x3845434444444632Record> aliased) {
        this(alias, aliased, null);
    }

    private Syncobj_0x3845434444444632(Name alias, Table<Syncobj_0x3845434444444632Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syncobj_0x3845434444444632(Table<O> child, ForeignKey<O, Syncobj_0x3845434444444632Record> key) {
        super(child, key, SYNCOBJ_0X3845434444444632);
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
    public Identity<Syncobj_0x3845434444444632Record, Integer> getIdentity() {
        return Keys.IDENTITY_SYNCOBJ_0X3845434444444632;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3845434444444632 as(String alias) {
        return new Syncobj_0x3845434444444632(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3845434444444632 as(Name alias) {
        return new Syncobj_0x3845434444444632(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3845434444444632 rename(String name) {
        return new Syncobj_0x3845434444444632(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x3845434444444632 rename(Name name) {
        return new Syncobj_0x3845434444444632(name, null);
    }
}