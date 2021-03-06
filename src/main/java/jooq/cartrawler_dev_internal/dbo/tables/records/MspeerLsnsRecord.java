/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MspeerLsns;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class MspeerLsnsRecord extends UpdatableRecordImpl<MspeerLsnsRecord> implements Record10<Integer, Timestamp, String, String, String, Integer, Integer, byte[], Integer, Integer> {

    private static final long serialVersionUID = -1645436976;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.last_updated</code>.
     */
    public void setLastUpdated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.last_updated</code>.
     */
    public Timestamp getLastUpdated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator</code>.
     */
    public void setOriginator(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator</code>.
     */
    public String getOriginator() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_db</code>.
     */
    public void setOriginatorDb(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_db</code>.
     */
    public String getOriginatorDb() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_publication</code>.
     */
    public void setOriginatorPublication(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_publication</code>.
     */
    public String getOriginatorPublication() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_publication_id</code>.
     */
    public void setOriginatorPublicationId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_publication_id</code>.
     */
    public Integer getOriginatorPublicationId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_db_version</code>.
     */
    public void setOriginatorDbVersion(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_db_version</code>.
     */
    public Integer getOriginatorDbVersion() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_lsn</code>.
     */
    public void setOriginatorLsn(byte... value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_lsn</code>.
     */
    public byte[] getOriginatorLsn() {
        return (byte[]) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_version</code>.
     */
    public void setOriginatorVersion(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_version</code>.
     */
    public Integer getOriginatorVersion() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_id</code>.
     */
    public void setOriginatorId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSpeer_lsns.originator_id</code>.
     */
    public Integer getOriginatorId() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, String, String, String, Integer, Integer, byte[], Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, String, String, String, Integer, Integer, byte[], Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MspeerLsns.MSPEER_LSNS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return MspeerLsns.MSPEER_LSNS.LAST_UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR_PUBLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR_PUBLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR_DB_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field8() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR_LSN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return MspeerLsns.MSPEER_LSNS.ORIGINATOR_ID;
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
    public Timestamp component2() {
        return getLastUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOriginator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOriginatorDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOriginatorPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getOriginatorPublicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getOriginatorDbVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component8() {
        return getOriginatorLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getOriginatorVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getOriginatorId();
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
    public Timestamp value2() {
        return getLastUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOriginator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOriginatorDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOriginatorPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getOriginatorPublicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getOriginatorDbVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value8() {
        return getOriginatorLsn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getOriginatorVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getOriginatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value2(Timestamp value) {
        setLastUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value3(String value) {
        setOriginator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value4(String value) {
        setOriginatorDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value5(String value) {
        setOriginatorPublication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value6(Integer value) {
        setOriginatorPublicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value7(Integer value) {
        setOriginatorDbVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value8(byte... value) {
        setOriginatorLsn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value9(Integer value) {
        setOriginatorVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord value10(Integer value) {
        setOriginatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerLsnsRecord values(Integer value1, Timestamp value2, String value3, String value4, String value5, Integer value6, Integer value7, byte[] value8, Integer value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MspeerLsnsRecord
     */
    public MspeerLsnsRecord() {
        super(MspeerLsns.MSPEER_LSNS);
    }

    /**
     * Create a detached, initialised MspeerLsnsRecord
     */
    public MspeerLsnsRecord(Integer id, Timestamp lastUpdated, String originator, String originatorDb, String originatorPublication, Integer originatorPublicationId, Integer originatorDbVersion, byte[] originatorLsn, Integer originatorVersion, Integer originatorId) {
        super(MspeerLsns.MSPEER_LSNS);

        set(0, id);
        set(1, lastUpdated);
        set(2, originator);
        set(3, originatorDb);
        set(4, originatorPublication);
        set(5, originatorPublicationId);
        set(6, originatorDbVersion);
        set(7, originatorLsn);
        set(8, originatorVersion);
        set(9, originatorId);
    }
}
