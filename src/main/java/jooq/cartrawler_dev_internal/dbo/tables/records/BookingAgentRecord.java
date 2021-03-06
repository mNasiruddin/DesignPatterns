/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.BookingAgent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BookingAgentRecord extends UpdatableRecordImpl<BookingAgentRecord> implements Record7<Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 761906979;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.key</code>.
     */
    public void setKey(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.key</code>.
     */
    public Integer getKey() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_ID</code>.
     */
    public void setBagentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_ID</code>.
     */
    public Integer getBagentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Company</code>.
     */
    public void setBagentCompany(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Company</code>.
     */
    public String getBagentCompany() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Email</code>.
     */
    public void setBagentEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Email</code>.
     */
    public String getBagentEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Phone</code>.
     */
    public void setBagentPhone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Phone</code>.
     */
    public String getBagentPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Contact</code>.
     */
    public void setBagentContact(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Contact</code>.
     */
    public String getBagentContact() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Country</code>.
     */
    public void setBagentCountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Booking_Agent.BAgent_Country</code>.
     */
    public String getBagentCountry() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BookingAgent.BOOKING_AGENT.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return BookingAgent.BOOKING_AGENT.BAGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BookingAgent.BOOKING_AGENT.BAGENT_COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BookingAgent.BOOKING_AGENT.BAGENT_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BookingAgent.BOOKING_AGENT.BAGENT_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BookingAgent.BOOKING_AGENT.BAGENT_CONTACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BookingAgent.BOOKING_AGENT.BAGENT_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getBagentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBagentCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBagentEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBagentPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBagentContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBagentCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBagentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBagentCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBagentEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBagentPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBagentContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBagentCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord value1(Integer value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord value2(Integer value) {
        setBagentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord value3(String value) {
        setBagentCompany(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord value4(String value) {
        setBagentEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord value5(String value) {
        setBagentPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord value6(String value) {
        setBagentContact(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord value7(String value) {
        setBagentCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingAgentRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookingAgentRecord
     */
    public BookingAgentRecord() {
        super(BookingAgent.BOOKING_AGENT);
    }

    /**
     * Create a detached, initialised BookingAgentRecord
     */
    public BookingAgentRecord(Integer key, Integer bagentId, String bagentCompany, String bagentEmail, String bagentPhone, String bagentContact, String bagentCountry) {
        super(BookingAgent.BOOKING_AGENT);

        set(0, key);
        set(1, bagentId);
        set(2, bagentCompany);
        set(3, bagentEmail);
        set(4, bagentPhone);
        set(5, bagentContact);
        set(6, bagentCountry);
    }
}
