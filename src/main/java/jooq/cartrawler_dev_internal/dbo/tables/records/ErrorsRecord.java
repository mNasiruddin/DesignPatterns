/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Errors;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ErrorsRecord extends UpdatableRecordImpl<ErrorsRecord> implements Record11<Integer, Integer, String, String, String, Timestamp, String, Integer, Integer, Short, String> {

    private static final long serialVersionUID = 1979250498;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.code</code>.
     */
    public void setCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.code</code>.
     */
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.message</code>.
     */
    public void setMessage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.message</code>.
     */
    public String getMessage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.action</code>.
     */
    public void setAction(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.action</code>.
     */
    public String getAction() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.ipaddress</code>.
     */
    public void setIpaddress(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.ipaddress</code>.
     */
    public Integer getIpaddress() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.fk_clientTouchpoint</code>.
     */
    public void setFkClienttouchpoint(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.fk_clientTouchpoint</code>.
     */
    public Short getFkClienttouchpoint() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.errors.system_id</code>.
     */
    public void setSystemId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.errors.system_id</code>.
     */
    public String getSystemId() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, String, String, Timestamp, String, Integer, Integer, Short, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, String, String, Timestamp, String, Integer, Integer, Short, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Errors.ERRORS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Errors.ERRORS.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Errors.ERRORS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Errors.ERRORS.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Errors.ERRORS.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Errors.ERRORS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Errors.ERRORS.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Errors.ERRORS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Errors.ERRORS.IPADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return Errors.ERRORS.FK_CLIENTTOUCHPOINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Errors.ERRORS.SYSTEM_ID;
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
    public Integer component2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getIpaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getFkClienttouchpoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSystemId();
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
    public Integer value2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getIpaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getFkClienttouchpoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSystemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value4(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value5(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value6(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value7(String value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value8(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value9(Integer value) {
        setIpaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value10(Short value) {
        setFkClienttouchpoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord value11(String value) {
        setSystemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6, String value7, Integer value8, Integer value9, Short value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ErrorsRecord
     */
    public ErrorsRecord() {
        super(Errors.ERRORS);
    }

    /**
     * Create a detached, initialised ErrorsRecord
     */
    public ErrorsRecord(Integer id, Integer fkReservation, String type, String code, String message, Timestamp timestamp, String action, Integer clientId, Integer ipaddress, Short fkClienttouchpoint, String systemId) {
        super(Errors.ERRORS);

        set(0, id);
        set(1, fkReservation);
        set(2, type);
        set(3, code);
        set(4, message);
        set(5, timestamp);
        set(6, action);
        set(7, clientId);
        set(8, ipaddress);
        set(9, fkClienttouchpoint);
        set(10, systemId);
    }
}