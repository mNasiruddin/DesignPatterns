/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Timetable;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TimetableRecord extends UpdatableRecordImpl<TimetableRecord> implements Record6<UUID, Integer, String, Boolean, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1924149013;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.timetable.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.timetable.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.timetable.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.timetable.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.timetable.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.timetable.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.timetable.negativeFilter</code>.
     */
    public void setNegativefilter(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.timetable.negativeFilter</code>.
     */
    public Boolean getNegativefilter() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.timetable.from</code>.
     */
    public void setFrom(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.timetable.from</code>.
     */
    public Timestamp getFrom() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.timetable.to</code>.
     */
    public void setTo(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.timetable.to</code>.
     */
    public Timestamp getTo() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, String, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, String, Boolean, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Timetable.TIMETABLE.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Timetable.TIMETABLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Timetable.TIMETABLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Timetable.TIMETABLE.NEGATIVEFILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Timetable.TIMETABLE.FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Timetable.TIMETABLE.TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getNegativefilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getNegativefilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimetableRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimetableRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimetableRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimetableRecord value4(Boolean value) {
        setNegativefilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimetableRecord value5(Timestamp value) {
        setFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimetableRecord value6(Timestamp value) {
        setTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimetableRecord values(UUID value1, Integer value2, String value3, Boolean value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimetableRecord
     */
    public TimetableRecord() {
        super(Timetable.TIMETABLE);
    }

    /**
     * Create a detached, initialised TimetableRecord
     */
    public TimetableRecord(UUID guid, Integer id, String name, Boolean negativefilter, Timestamp from, Timestamp to) {
        super(Timetable.TIMETABLE);

        set(0, guid);
        set(1, id);
        set(2, name);
        set(3, negativefilter);
        set(4, from);
        set(5, to);
    }
}
