/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ClientbackupRecord;

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
public class Clientbackup extends TableImpl<ClientbackupRecord> {

    private static final long serialVersionUID = 1131763565;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Clientbackup</code>
     */
    public static final Clientbackup CLIENTBACKUP = new Clientbackup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientbackupRecord> getRecordType() {
        return ClientbackupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_ID</code>.
     */
    public final TableField<ClientbackupRecord, Integer> CLIENT_ID = createField("Client_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Agency_ID</code>.
     */
    public final TableField<ClientbackupRecord, Integer> AGENCY_ID = createField("Agency_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.User_id</code>.
     */
    public final TableField<ClientbackupRecord, String> USER_ID = createField("User_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Pin_No</code>.
     */
    public final TableField<ClientbackupRecord, String> PIN_NO = createField("Pin_No", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_Ref</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_REF = createField("Client_Ref", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_Name</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_NAME = createField("Client_Name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_Address</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_ADDRESS = createField("Client_Address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_Phone</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_PHONE = createField("Client_Phone", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_Fax</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_FAX = createField("Client_Fax", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_email</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_EMAIL = createField("Client_email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Client_Type</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_TYPE = createField("Client_Type", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.disabled</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> DISABLED = createField("disabled", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.AddressLine1</code>.
     */
    public final TableField<ClientbackupRecord, String> ADDRESSLINE1 = createField("AddressLine1", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.AddressLine2</code>.
     */
    public final TableField<ClientbackupRecord, String> ADDRESSLINE2 = createField("AddressLine2", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.City</code>.
     */
    public final TableField<ClientbackupRecord, String> CITY = createField("City", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.CountryOrigin</code>.
     */
    public final TableField<ClientbackupRecord, String> COUNTRYORIGIN = createField("CountryOrigin", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Zip</code>.
     */
    public final TableField<ClientbackupRecord, String> ZIP = createField("Zip", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Country_ID</code>.
     */
    public final TableField<ClientbackupRecord, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Contact</code>.
     */
    public final TableField<ClientbackupRecord, String> CONTACT = createField("Contact", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.CustEmail</code>.
     */
    public final TableField<ClientbackupRecord, String> CUSTEMAIL = createField("CustEmail", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.ac_name</code>.
     */
    public final TableField<ClientbackupRecord, String> AC_NAME = createField("ac_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.plan_code</code>.
     */
    public final TableField<ClientbackupRecord, String> PLAN_CODE = createField("plan_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.argus_user_id</code>.
     */
    public final TableField<ClientbackupRecord, Integer> ARGUS_USER_ID = createField("argus_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.client_markup</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> CLIENT_MARKUP = createField("client_markup", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.display_currency</code>.
     */
    public final TableField<ClientbackupRecord, String> DISPLAY_CURRENCY = createField("display_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.parent_id</code>.
     */
    public final TableField<ClientbackupRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.parent</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> PARENT = createField("parent", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.PaymentType</code>.
     */
    public final TableField<ClientbackupRecord, String> PAYMENTTYPE = createField("PaymentType", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.date_added</code>.
     */
    public final TableField<ClientbackupRecord, Timestamp> DATE_ADDED = createField("date_added", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.CommRate</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> COMMRATE = createField("CommRate", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.CommDateChange</code>.
     */
    public final TableField<ClientbackupRecord, Timestamp> COMMDATECHANGE = createField("CommDateChange", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.CommChangedBy</code>.
     */
    public final TableField<ClientbackupRecord, Integer> COMMCHANGEDBY = createField("CommChangedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.welcomeEmailSent</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> WELCOMEEMAILSENT = createField("welcomeEmailSent", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.displayClient</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> DISPLAYCLIENT = createField("displayClient", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.HasXMLFeed</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> HASXMLFEED = createField("HasXMLFeed", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otadontprocesscreditcard</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTADONTPROCESSCREDITCARD = createField("otadontprocesscreditcard", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otashowvendorname</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTASHOWVENDORNAME = createField("otashowvendorname", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.referencename</code>.
     */
    public final TableField<ClientbackupRecord, String> REFERENCENAME = createField("referencename", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otaPayPerClick</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTAPAYPERCLICK = createField("otaPayPerClick", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.parent_override</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> PARENT_OVERRIDE = createField("parent_override", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.parent_bcc</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> PARENT_BCC = createField("parent_bcc", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.filterOnRequest</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> FILTERONREQUEST = createField("filterOnRequest", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otaairportonly</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTAAIRPORTONLY = createField("otaairportonly", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otafreesaleonly</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTAFREESALEONLY = createField("otafreesaleonly", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.showplaincarpicture</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> SHOWPLAINCARPICTURE = createField("showplaincarpicture", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.fk_reportingChannel</code>.
     */
    public final TableField<ClientbackupRecord, Integer> FK_REPORTINGCHANNEL = createField("fk_reportingChannel", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.adminServiceCharge</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> ADMINSERVICECHARGE = createField("adminServiceCharge", org.jooq.impl.SQLDataType.NUMERIC(9, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otashowallrates</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTASHOWALLRATES = createField("otashowallrates", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Plan_ID</code>.
     */
    public final TableField<ClientbackupRecord, Integer> PLAN_ID = createField("Plan_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otaIncludeAdminFee</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTAINCLUDEADMINFEE = createField("otaIncludeAdminFee", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.cancelCharge</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> CANCELCHARGE = createField("cancelCharge", org.jooq.impl.SQLDataType.NUMERIC(9, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.cancelCurrency</code>.
     */
    public final TableField<ClientbackupRecord, String> CANCELCURRENCY = createField("cancelCurrency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.allowIFrame</code>.
     */
    public final TableField<ClientbackupRecord, UByte> ALLOWIFRAME = createField("allowIFrame", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otaSendInvoice</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTASENDINVOICE = createField("otaSendInvoice", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otaSendConfirmation</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTASENDCONFIRMATION = createField("otaSendConfirmation", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.synchronous</code>.
     */
    public final TableField<ClientbackupRecord, UByte> SYNCHRONOUS = createField("synchronous", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.cost_per_click_euro</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> COST_PER_CLICK_EURO = createField("cost_per_click_euro", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.fk_user</code>.
     */
    public final TableField<ClientbackupRecord, Integer> FK_USER = createField("fk_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.fk_org</code>.
     */
    public final TableField<ClientbackupRecord, Integer> FK_ORG = createField("fk_org", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otaPriceBreakdown</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> OTAPRICEBREAKDOWN = createField("otaPriceBreakdown", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.commission_sharing_amount</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> COMMISSION_SHARING_AMOUNT = createField("commission_sharing_amount", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.showonlyprepaid</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> SHOWONLYPREPAID = createField("showonlyprepaid", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.OnlyGuaranteedAvailable</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> ONLYGUARANTEEDAVAILABLE = createField("OnlyGuaranteedAvailable", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.email_reports_type</code>.
     */
    public final TableField<ClientbackupRecord, UByte> EMAIL_REPORTS_TYPE = createField("email_reports_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Email_Reports_High_Water</code>.
     */
    public final TableField<ClientbackupRecord, Timestamp> EMAIL_REPORTS_HIGH_WATER = createField("Email_Reports_High_Water", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Email_Reports_Start</code>.
     */
    public final TableField<ClientbackupRecord, Timestamp> EMAIL_REPORTS_START = createField("Email_Reports_Start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Email_Reports_Finish</code>.
     */
    public final TableField<ClientbackupRecord, Timestamp> EMAIL_REPORTS_FINISH = createField("Email_Reports_Finish", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.percentage_bias</code>.
     */
    public final TableField<ClientbackupRecord, Integer> PERCENTAGE_BIAS = createField("percentage_bias", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.email_reports_titles</code>.
     */
    public final TableField<ClientbackupRecord, String> EMAIL_REPORTS_TITLES = createField("email_reports_titles", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.removeProcessingFeesFromCommission</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> REMOVEPROCESSINGFEESFROMCOMMISSION = createField("removeProcessingFeesFromCommission", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.emailDisplayName</code>.
     */
    public final TableField<ClientbackupRecord, String> EMAILDISPLAYNAME = createField("emailDisplayName", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.processsingFeePercentage</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> PROCESSSINGFEEPERCENTAGE = createField("processsingFeePercentage", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.airlineBookingCounter</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> AIRLINEBOOKINGCOUNTER = createField("airlineBookingCounter", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.airlineVisitorCounter</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> AIRLINEVISITORCOUNTER = createField("airlineVisitorCounter", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.insuranceFee</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> INSURANCEFEE = createField("insuranceFee", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.randomisePrices</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> RANDOMISEPRICES = createField("randomisePrices", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.randomisePricesForAnonUsers</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> RANDOMISEPRICESFORANONUSERS = createField("randomisePricesForAnonUsers", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.insurance_cartrawler_amount_euro</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> INSURANCE_CARTRAWLER_AMOUNT_EURO = createField("insurance_cartrawler_amount_euro", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.amendedBy</code>.
     */
    public final TableField<ClientbackupRecord, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.allowDefaultAge</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> ALLOWDEFAULTAGE = createField("allowDefaultAge", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.clientTransactionFee</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> CLIENTTRANSACTIONFEE = createField("clientTransactionFee", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.marketingEmail</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> MARKETINGEMAIL = createField("marketingEmail", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.dateFormat</code>.
     */
    public final TableField<ClientbackupRecord, String> DATEFORMAT = createField("dateFormat", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.magicLocation</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> MAGICLOCATION = createField("magicLocation", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.filterAndSortingType</code>.
     */
    public final TableField<ClientbackupRecord, UByte> FILTERANDSORTINGTYPE = createField("filterAndSortingType", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.fk_abclient</code>.
     */
    public final TableField<ClientbackupRecord, Integer> FK_ABCLIENT = createField("fk_abclient", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.abWeight</code>.
     */
    public final TableField<ClientbackupRecord, Integer> ABWEIGHT = createField("abWeight", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.transactionFeeCurrency</code>.
     */
    public final TableField<ClientbackupRecord, String> TRANSACTIONFEECURRENCY = createField("transactionFeeCurrency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.transactionFeeAmount</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> TRANSACTIONFEEAMOUNT = createField("transactionFeeAmount", org.jooq.impl.SQLDataType.NUMERIC(18, 2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.otaFlags</code>.
     */
    public final TableField<ClientbackupRecord, Integer> OTAFLAGS = createField("otaFlags", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.emailQuoteURL</code>.
     */
    public final TableField<ClientbackupRecord, String> EMAILQUOTEURL = createField("emailQuoteURL", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.narrative</code>.
     */
    public final TableField<ClientbackupRecord, String> NARRATIVE = createField("narrative", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.settlementCurrency</code>.
     */
    public final TableField<ClientbackupRecord, String> SETTLEMENTCURRENCY = createField("settlementCurrency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.chargeCurrency</code>.
     */
    public final TableField<ClientbackupRecord, String> CHARGECURRENCY = createField("chargeCurrency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.spoofThreshold</code>.
     */
    public final TableField<ClientbackupRecord, Short> SPOOFTHRESHOLD = createField("spoofThreshold", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.locationScope</code>.
     */
    public final TableField<ClientbackupRecord, Integer> LOCATIONSCOPE = createField("locationScope", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.addTransactionFee</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> ADDTRANSACTIONFEE = createField("addTransactionFee", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.ipCountries</code>.
     */
    public final TableField<ClientbackupRecord, String> IPCOUNTRIES = createField("ipCountries", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Ins_amt_pd</code>.
     */
    public final TableField<ClientbackupRecord, BigDecimal> INS_AMT_PD = createField("Ins_amt_pd", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.Ins_amt_pd_curr</code>.
     */
    public final TableField<ClientbackupRecord, String> INS_AMT_PD_CURR = createField("Ins_amt_pd_curr", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.ins_share_type</code>.
     */
    public final TableField<ClientbackupRecord, Short> INS_SHARE_TYPE = createField("ins_share_type", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.nonTrustedClient</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> NONTRUSTEDCLIENT = createField("nonTrustedClient", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.cloned</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> CLONED = createField("cloned", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.unsolicited</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> UNSOLICITED = createField("unsolicited", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.exclusive</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> EXCLUSIVE = createField("exclusive", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("((1))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.business_type</code>.
     */
    public final TableField<ClientbackupRecord, String> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.visitors_count</code>.
     */
    public final TableField<ClientbackupRecord, String> VISITORS_COUNT = createField("visitors_count", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.exist_carhire</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> EXIST_CARHIRE = createField("exist_carhire", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.bookings_count</code>.
     */
    public final TableField<ClientbackupRecord, String> BOOKINGS_COUNT = createField("bookings_count", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.target_audience</code>.
     */
    public final TableField<ClientbackupRecord, String> TARGET_AUDIENCE = createField("target_audience", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.countries_active</code>.
     */
    public final TableField<ClientbackupRecord, String> COUNTRIES_ACTIVE = createField("countries_active", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.aff_token</code>.
     */
    public final TableField<ClientbackupRecord, String> AFF_TOKEN = createField("aff_token", org.jooq.impl.SQLDataType.CHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.partner_only_markup_eu</code>.
     */
    public final TableField<ClientbackupRecord, Integer> PARTNER_ONLY_MARKUP_EU = createField("partner_only_markup_eu", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.partner_only_markup_row</code>.
     */
    public final TableField<ClientbackupRecord, Integer> PARTNER_ONLY_MARKUP_ROW = createField("partner_only_markup_row", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.fk_reportingChannel1</code>.
     */
    public final TableField<ClientbackupRecord, Integer> FK_REPORTINGCHANNEL1 = createField("fk_reportingChannel1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.fk_reportingChannel2</code>.
     */
    public final TableField<ClientbackupRecord, Integer> FK_REPORTINGCHANNEL2 = createField("fk_reportingChannel2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.includeInsuranceInCommission</code>.
     */
    public final TableField<ClientbackupRecord, Boolean> INCLUDEINSURANCEINCOMMISSION = createField("includeInsuranceInCommission", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Clientbackup.client_reference</code>.
     */
    public final TableField<ClientbackupRecord, String> CLIENT_REFERENCE = createField("client_reference", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Clientbackup</code> table reference
     */
    public Clientbackup() {
        this(DSL.name("Clientbackup"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Clientbackup</code> table reference
     */
    public Clientbackup(String alias) {
        this(DSL.name(alias), CLIENTBACKUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Clientbackup</code> table reference
     */
    public Clientbackup(Name alias) {
        this(alias, CLIENTBACKUP);
    }

    private Clientbackup(Name alias, Table<ClientbackupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Clientbackup(Name alias, Table<ClientbackupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Clientbackup(Table<O> child, ForeignKey<O, ClientbackupRecord> key) {
        super(child, key, CLIENTBACKUP);
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
        return Arrays.<Index>asList(Indexes.CLIENTBACKUP_PK_CLIENT_1BACKUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClientbackupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLIENTBACKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClientbackupRecord> getPrimaryKey() {
        return Keys.PK_CLIENT_1BACKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClientbackupRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientbackupRecord>>asList(Keys.PK_CLIENT_1BACKUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientbackup as(String alias) {
        return new Clientbackup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientbackup as(Name alias) {
        return new Clientbackup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientbackup rename(String name) {
        return new Clientbackup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientbackup rename(Name name) {
        return new Clientbackup(name, null);
    }
}
