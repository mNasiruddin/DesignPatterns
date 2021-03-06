/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Returningcustomers;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ReturningcustomersRecord extends UpdatableRecordImpl<ReturningcustomersRecord> implements Record8<Integer, String, String, Integer, Integer, String, Integer, Timestamp> {

    private static final long serialVersionUID = -1677101838;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.Surname</code>.
     */
    public void setSurname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.Surname</code>.
     */
    public String getSurname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.bookings</code>.
     */
    public void setBookings(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.bookings</code>.
     */
    public Integer getBookings() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.qualified</code>.
     */
    public void setQualified(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.qualified</code>.
     */
    public Integer getQualified() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.first_name</code>.
     */
    public void setFirstName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.fraud</code>.
     */
    public void setFraud(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.fraud</code>.
     */
    public Integer getFraud() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ReturningCustomers.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Integer, Integer, String, Integer, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Integer, Integer, String, Integer, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Returningcustomers.RETURNINGCUSTOMERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Returningcustomers.RETURNINGCUSTOMERS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Returningcustomers.RETURNINGCUSTOMERS.SURNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Returningcustomers.RETURNINGCUSTOMERS.BOOKINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Returningcustomers.RETURNINGCUSTOMERS.QUALIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Returningcustomers.RETURNINGCUSTOMERS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Returningcustomers.RETURNINGCUSTOMERS.FRAUD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Returningcustomers.RETURNINGCUSTOMERS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getQualified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getFraud();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getQualified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFraud();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value3(String value) {
        setSurname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value4(Integer value) {
        setBookings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value5(Integer value) {
        setQualified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value6(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value7(Integer value) {
        setFraud(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord value8(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturningcustomersRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, String value6, Integer value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReturningcustomersRecord
     */
    public ReturningcustomersRecord() {
        super(Returningcustomers.RETURNINGCUSTOMERS);
    }

    /**
     * Create a detached, initialised ReturningcustomersRecord
     */
    public ReturningcustomersRecord(Integer id, String email, String surname, Integer bookings, Integer qualified, String firstName, Integer fraud, Timestamp timestamp) {
        super(Returningcustomers.RETURNINGCUSTOMERS);

        set(0, id);
        set(1, email);
        set(2, surname);
        set(3, bookings);
        set(4, qualified);
        set(5, firstName);
        set(6, fraud);
        set(7, timestamp);
    }
}
