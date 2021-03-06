/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Ajaxerrors;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class AjaxerrorsRecord extends UpdatableRecordImpl<AjaxerrorsRecord> implements Record4<UUID, Timestamp, String, String> {

    private static final long serialVersionUID = -328925717;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.requestDateTime</code>.
     */
    public void setRequestdatetime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.requestDateTime</code>.
     */
    public Timestamp getRequestdatetime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.desc</code>.
     */
    public void setDesc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.desc</code>.
     */
    public String getDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.ip</code>.
     */
    public void setIp(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AjaxErrors.ip</code>.
     */
    public String getIp() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Timestamp, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Timestamp, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Ajaxerrors.AJAXERRORS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Ajaxerrors.AJAXERRORS.REQUESTDATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Ajaxerrors.AJAXERRORS.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Ajaxerrors.AJAXERRORS.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getRequestdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getRequestdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AjaxerrorsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AjaxerrorsRecord value2(Timestamp value) {
        setRequestdatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AjaxerrorsRecord value3(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AjaxerrorsRecord value4(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AjaxerrorsRecord values(UUID value1, Timestamp value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AjaxerrorsRecord
     */
    public AjaxerrorsRecord() {
        super(Ajaxerrors.AJAXERRORS);
    }

    /**
     * Create a detached, initialised AjaxerrorsRecord
     */
    public AjaxerrorsRecord(UUID id, Timestamp requestdatetime, String desc, String ip) {
        super(Ajaxerrors.AJAXERRORS);

        set(0, id);
        set(1, requestdatetime);
        set(2, desc);
        set(3, ip);
    }
}
