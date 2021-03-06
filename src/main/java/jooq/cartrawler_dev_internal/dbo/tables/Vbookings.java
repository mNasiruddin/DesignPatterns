/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.VbookingsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Vbookings extends TableImpl<VbookingsRecord> {

    private static final long serialVersionUID = -1958806797;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.vBookings</code>
     */
    public static final Vbookings VBOOKINGS = new Vbookings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VbookingsRecord> getRecordType() {
        return VbookingsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.BookingStatus</code>.
     */
    public final TableField<VbookingsRecord, String> BOOKINGSTATUS = createField("BookingStatus", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Ref</code>.
     */
    public final TableField<VbookingsRecord, Integer> REF = createField("Ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Reservation_ID</code>.
     */
    public final TableField<VbookingsRecord, String> RESERVATION_ID = createField("Reservation_ID", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Internal_Ref</code>.
     */
    public final TableField<VbookingsRecord, String> INTERNAL_REF = createField("Internal_Ref", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Res_Date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> RES_DATE = createField("Res_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.PickUp_Location</code>.
     */
    public final TableField<VbookingsRecord, Integer> PICKUP_LOCATION = createField("PickUp_Location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.DropOff_Location</code>.
     */
    public final TableField<VbookingsRecord, Integer> DROPOFF_LOCATION = createField("DropOff_Location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.citizen_country_code</code>.
     */
    public final TableField<VbookingsRecord, String> CITIZEN_COUNTRY_CODE = createField("citizen_country_code", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.PickUp_Date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> PICKUP_DATE = createField("PickUp_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.PickUp_Time</code>.
     */
    public final TableField<VbookingsRecord, String> PICKUP_TIME = createField("PickUp_Time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.DropOff_Date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> DROPOFF_DATE = createField("DropOff_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.DropOff_Time</code>.
     */
    public final TableField<VbookingsRecord, String> DROPOFF_TIME = createField("DropOff_Time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Estimated_Days</code>.
     */
    public final TableField<VbookingsRecord, Long> ESTIMATED_DAYS = createField("Estimated_Days", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Country_ID</code>.
     */
    public final TableField<VbookingsRecord, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.FirstName</code>.
     */
    public final TableField<VbookingsRecord, String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Surname</code>.
     */
    public final TableField<VbookingsRecord, String> SURNAME = createField("Surname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Address</code>.
     */
    public final TableField<VbookingsRecord, String> ADDRESS = createField("Address", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.EMail</code>.
     */
    public final TableField<VbookingsRecord, String> EMAIL = createField("EMail", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Phone</code>.
     */
    public final TableField<VbookingsRecord, String> PHONE = createField("Phone", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Client_ID</code>.
     */
    public final TableField<VbookingsRecord, Integer> CLIENT_ID = createField("Client_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Airline_ID</code>.
     */
    public final TableField<VbookingsRecord, String> AIRLINE_ID = createField("Airline_ID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Flight_No</code>.
     */
    public final TableField<VbookingsRecord, String> FLIGHT_NO = createField("Flight_No", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Billing_Status</code>.
     */
    public final TableField<VbookingsRecord, String> BILLING_STATUS = createField("Billing_Status", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Reservation_Status</code>.
     */
    public final TableField<VbookingsRecord, String> RESERVATION_STATUS = createField("Reservation_Status", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Complete</code>.
     */
    public final TableField<VbookingsRecord, Boolean> COMPLETE = createField("Complete", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.ConfirmedBy</code>.
     */
    public final TableField<VbookingsRecord, String> CONFIRMEDBY = createField("ConfirmedBy", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Date_Confirmed</code>.
     */
    public final TableField<VbookingsRecord, String> DATE_CONFIRMED = createField("Date_Confirmed", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Confirmation_Date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> CONFIRMATION_DATE = createField("Confirmation_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Confirmation_PIN</code>.
     */
    public final TableField<VbookingsRecord, Long> CONFIRMATION_PIN = createField("Confirmation_PIN", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Currency_ID</code>.
     */
    public final TableField<VbookingsRecord, String> CURRENCY_ID = createField("Currency_ID", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.VAT_Rate</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> VAT_RATE = createField("VAT_Rate", org.jooq.impl.SQLDataType.NUMERIC(5, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Third_Party</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> THIRD_PARTY = createField("Third_Party", org.jooq.impl.SQLDataType.NUMERIC(10, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.CDW</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> CDW = createField("CDW", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Airport_Tax</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> AIRPORT_TAX = createField("Airport_Tax", org.jooq.impl.SQLDataType.NUMERIC(5, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.after_hours_charge</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> AFTER_HOURS_CHARGE = createField("after_hours_charge", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.dropoff_surcharge</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> DROPOFF_SURCHARGE = createField("dropoff_surcharge", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.age_surcharge</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> AGE_SURCHARGE = createField("age_surcharge", org.jooq.impl.SQLDataType.NUMERIC(6, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Booking_Agent</code>.
     */
    public final TableField<VbookingsRecord, Integer> BOOKING_AGENT = createField("Booking_Agent", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Argus_Amount_Taken</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> ARGUS_AMOUNT_TAKEN = createField("Argus_Amount_Taken", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.email_sent</code>.
     */
    public final TableField<VbookingsRecord, Boolean> EMAIL_SENT = createField("email_sent", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.printed</code>.
     */
    public final TableField<VbookingsRecord, Boolean> PRINTED = createField("printed", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Send_Info_Email</code>.
     */
    public final TableField<VbookingsRecord, Boolean> SEND_INFO_EMAIL = createField("Send_Info_Email", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Info_Email_Sent</code>.
     */
    public final TableField<VbookingsRecord, Boolean> INFO_EMAIL_SENT = createField("Info_Email_Sent", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.payandshop_auth_code</code>.
     */
    public final TableField<VbookingsRecord, String> PAYANDSHOP_AUTH_CODE = createField("payandshop_auth_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.payandshop_pasref</code>.
     */
    public final TableField<VbookingsRecord, String> PAYANDSHOP_PASREF = createField("payandshop_pasref", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.payandshop_amount_charged</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> PAYANDSHOP_AMOUNT_CHARGED = createField("payandshop_amount_charged", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.payandshop_id</code>.
     */
    public final TableField<VbookingsRecord, String> PAYANDSHOP_ID = createField("payandshop_id", org.jooq.impl.SQLDataType.VARCHAR(24), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.user_id</code>.
     */
    public final TableField<VbookingsRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.booking_fee</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> BOOKING_FEE = createField("booking_fee", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.problem</code>.
     */
    public final TableField<VbookingsRecord, Boolean> PROBLEM = createField("problem", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.resolved</code>.
     */
    public final TableField<VbookingsRecord, Boolean> RESOLVED = createField("resolved", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.problem_lastviewed</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> PROBLEM_LASTVIEWED = createField("problem_lastviewed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.problem_rep</code>.
     */
    public final TableField<VbookingsRecord, String> PROBLEM_REP = createField("problem_rep", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.amended_reservation</code>.
     */
    public final TableField<VbookingsRecord, Boolean> AMENDED_RESERVATION = createField("amended_reservation", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.notebook_entry</code>.
     */
    public final TableField<VbookingsRecord, Boolean> NOTEBOOK_ENTRY = createField("notebook_entry", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.discount</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> DISCOUNT = createField("discount", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.cancelled_by</code>.
     */
    public final TableField<VbookingsRecord, String> CANCELLED_BY = createField("cancelled_by", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.cancelled_date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> CANCELLED_DATE = createField("cancelled_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.voucher_discount</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> VOUCHER_DISCOUNT = createField("voucher_discount", org.jooq.impl.SQLDataType.NUMERIC(18, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.hide_cancel</code>.
     */
    public final TableField<VbookingsRecord, Boolean> HIDE_CANCEL = createField("hide_cancel", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.telephone_booking</code>.
     */
    public final TableField<VbookingsRecord, Boolean> TELEPHONE_BOOKING = createField("telephone_booking", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.car_agent_markup</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> CAR_AGENT_MARKUP = createField("car_agent_markup", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.telephone_markup</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> TELEPHONE_MARKUP = createField("telephone_markup", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.affiliate_markup</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> AFFILIATE_MARKUP = createField("affiliate_markup", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.total_rental_cost</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> TOTAL_RENTAL_COST = createField("total_rental_cost", org.jooq.impl.SQLDataType.NUMERIC(12, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.base_daily_rate</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> BASE_DAILY_RATE = createField("base_daily_rate", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.rental_days</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> RENTAL_DAYS = createField("rental_days", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.european_rates</code>.
     */
    public final TableField<VbookingsRecord, Boolean> EUROPEAN_RATES = createField("european_rates", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.freesale</code>.
     */
    public final TableField<VbookingsRecord, Boolean> FREESALE = createField("freesale", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.rental_agent_id</code>.
     */
    public final TableField<VbookingsRecord, Integer> RENTAL_AGENT_ID = createField("rental_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.drop_agent_id</code>.
     */
    public final TableField<VbookingsRecord, Integer> DROP_AGENT_ID = createField("drop_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.rate_currency</code>.
     */
    public final TableField<VbookingsRecord, String> RATE_CURRENCY = createField("rate_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.charge_currency</code>.
     */
    public final TableField<VbookingsRecord, String> CHARGE_CURRENCY = createField("charge_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.exchange_rate</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> EXCHANGE_RATE = createField("exchange_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.prepaid_rental</code>.
     */
    public final TableField<VbookingsRecord, Boolean> PREPAID_RENTAL = createField("prepaid_rental", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.prepaid_amount</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> PREPAID_AMOUNT = createField("prepaid_amount", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.optional_extras</code>.
     */
    public final TableField<VbookingsRecord, Boolean> OPTIONAL_EXTRAS = createField("optional_extras", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.new_rates</code>.
     */
    public final TableField<VbookingsRecord, Boolean> NEW_RATES = createField("new_rates", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.age_group</code>.
     */
    public final TableField<VbookingsRecord, Integer> AGE_GROUP = createField("age_group", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.car_name</code>.
     */
    public final TableField<VbookingsRecord, String> CAR_NAME = createField("car_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.affiliate_engine</code>.
     */
    public final TableField<VbookingsRecord, Boolean> AFFILIATE_ENGINE = createField("affiliate_engine", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.euro_charge_total</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> EURO_CHARGE_TOTAL = createField("euro_charge_total", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.local_charge_total</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> LOCAL_CHARGE_TOTAL = createField("local_charge_total", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.charge_prepaid</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> CHARGE_PREPAID = createField("charge_prepaid", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.amended_date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> AMENDED_DATE = createField("amended_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Group_ID</code>.
     */
    public final TableField<VbookingsRecord, String> GROUP_ID = createField("Group_ID", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.customer_amend_date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> CUSTOMER_AMEND_DATE = createField("customer_amend_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.rate_charge_exchange</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> RATE_CHARGE_EXCHANGE = createField("rate_charge_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.euro_base_rate</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> EURO_BASE_RATE = createField("euro_base_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.rate_euro_exchange</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> RATE_EURO_EXCHANGE = createField("rate_euro_exchange", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.customer_denied</code>.
     */
    public final TableField<VbookingsRecord, Boolean> CUSTOMER_DENIED = createField("customer_denied", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.rate_base_rate</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> RATE_BASE_RATE = createField("rate_base_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.invoice_number</code>.
     */
    public final TableField<VbookingsRecord, String> INVOICE_NUMBER = createField("invoice_number", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.agent_paid</code>.
     */
    public final TableField<VbookingsRecord, Boolean> AGENT_PAID = createField("agent_paid", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.invoice_date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> INVOICE_DATE = createField("invoice_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.rate_display_exchange</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> RATE_DISPLAY_EXCHANGE = createField("rate_display_exchange", org.jooq.impl.SQLDataType.NUMERIC(18, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.denied_reason</code>.
     */
    public final TableField<VbookingsRecord, Integer> DENIED_REASON = createField("denied_reason", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.new_rates_rpt</code>.
     */
    public final TableField<VbookingsRecord, Short> NEW_RATES_RPT = createField("new_rates_rpt", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.CommRate</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> COMMRATE = createField("CommRate", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Initial_XML_Date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> INITIAL_XML_DATE = createField("Initial_XML_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Last_XML_Date</code>.
     */
    public final TableField<VbookingsRecord, Timestamp> LAST_XML_DATE = createField("Last_XML_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Manual_Request</code>.
     */
    public final TableField<VbookingsRecord, Boolean> MANUAL_REQUEST = createField("Manual_Request", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Auto_Email_Request</code>.
     */
    public final TableField<VbookingsRecord, Boolean> AUTO_EMAIL_REQUEST = createField("Auto_Email_Request", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Expr1</code>.
     */
    public final TableField<VbookingsRecord, String> EXPR1 = createField("Expr1", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.parent_id</code>.
     */
    public final TableField<VbookingsRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.commission_sharing_amount</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> COMMISSION_SHARING_AMOUNT = createField("commission_sharing_amount", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.original_resref</code>.
     */
    public final TableField<VbookingsRecord, Integer> ORIGINAL_RESREF = createField("original_resref", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.carType</code>.
     */
    public final TableField<VbookingsRecord, String> CARTYPE = createField("carType", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.cookie_client_id</code>.
     */
    public final TableField<VbookingsRecord, Integer> COOKIE_CLIENT_ID = createField("cookie_client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.processingFeePercantage</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> PROCESSINGFEEPERCANTAGE = createField("processingFeePercantage", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.fk_CancelledReason</code>.
     */
    public final TableField<VbookingsRecord, Integer> FK_CANCELLEDREASON = createField("fk_CancelledReason", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.fk_reservation_invoice</code>.
     */
    public final TableField<VbookingsRecord, Integer> FK_RESERVATION_INVOICE = createField("fk_reservation_invoice", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.retail_commissionable_amount</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> RETAIL_COMMISSIONABLE_AMOUNT = createField("retail_commissionable_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Retail_commission_percentage</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> RETAIL_COMMISSION_PERCENTAGE = createField("Retail_commission_percentage", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.clientTransactionFee</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> CLIENTTRANSACTIONFEE = createField("clientTransactionFee", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.AirlineCode</code>.
     */
    public final TableField<VbookingsRecord, String> AIRLINECODE = createField("AirlineCode", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Location_Id</code>.
     */
    public final TableField<VbookingsRecord, Integer> LOCATION_ID = createField("Location_Id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Location_Name</code>.
     */
    public final TableField<VbookingsRecord, String> LOCATION_NAME = createField("Location_Name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.RRef</code>.
     */
    public final TableField<VbookingsRecord, Integer> RREF = createField("RRef", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.car_agent_name</code>.
     */
    public final TableField<VbookingsRecord, String> CAR_AGENT_NAME = createField("car_agent_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.current_ammount</code>.
     */
    public final TableField<VbookingsRecord, BigDecimal> CURRENT_AMMOUNT = createField("current_ammount", org.jooq.impl.SQLDataType.NUMERIC(19, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.Client_Name</code>.
     */
    public final TableField<VbookingsRecord, String> CLIENT_NAME = createField("Client_Name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.parent_name</code>.
     */
    public final TableField<VbookingsRecord, String> PARENT_NAME = createField("parent_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.vBookings.payment_model</code>.
     */
    public final TableField<VbookingsRecord, UByte> PAYMENT_MODEL = createField("payment_model", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.vBookings</code> table reference
     */
    public Vbookings() {
        this(DSL.name("vBookings"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.vBookings</code> table reference
     */
    public Vbookings(String alias) {
        this(DSL.name(alias), VBOOKINGS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.vBookings</code> table reference
     */
    public Vbookings(Name alias) {
        this(alias, VBOOKINGS);
    }

    private Vbookings(Name alias, Table<VbookingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Vbookings(Name alias, Table<VbookingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Vbookings(Table<O> child, ForeignKey<O, VbookingsRecord> key) {
        super(child, key, VBOOKINGS);
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
    public Vbookings as(String alias) {
        return new Vbookings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vbookings as(Name alias) {
        return new Vbookings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Vbookings rename(String name) {
        return new Vbookings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Vbookings rename(Name name) {
        return new Vbookings(name, null);
    }
}
