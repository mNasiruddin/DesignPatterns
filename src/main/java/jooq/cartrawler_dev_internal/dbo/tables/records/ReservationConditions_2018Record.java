/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationConditions_2018;

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
public class ReservationConditions_2018Record extends UpdatableRecordImpl<ReservationConditions_2018Record> implements Record8<Integer, Integer, Integer, Boolean, String, String, String, Integer> {

    private static final long serialVersionUID = -452532948;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.order</code>.
     */
    public void setOrder(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.order</code>.
     */
    public Integer getOrder() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.summary</code>.
     */
    public void setSummary(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.summary</code>.
     */
    public Boolean getSummary() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.lang</code>.
     */
    public void setLang(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.lang</code>.
     */
    public String getLang() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.titleHash</code>.
     */
    public void setTitlehash(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.titleHash</code>.
     */
    public String getTitlehash() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.textHash</code>.
     */
    public void setTexthash(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.textHash</code>.
     */
    public String getTexthash() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.titleNameId</code>.
     */
    public void setTitlenameid(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_conditions_2018.titleNameId</code>.
     */
    public Integer getTitlenameid() {
        return (Integer) get(7);
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
    public Row8<Integer, Integer, Integer, Boolean, String, String, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Boolean, String, String, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.SUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.TITLEHASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.TEXTHASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ReservationConditions_2018.RESERVATION_CONDITIONS_2018.TITLENAMEID;
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
    public Integer component3() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTitlehash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTexthash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getTitlenameid();
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
    public Integer value3() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTitlehash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTexthash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getTitlenameid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value3(Integer value) {
        setOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value4(Boolean value) {
        setSummary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value5(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value6(String value) {
        setTitlehash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value7(String value) {
        setTexthash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record value8(Integer value) {
        setTitlenameid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions_2018Record values(Integer value1, Integer value2, Integer value3, Boolean value4, String value5, String value6, String value7, Integer value8) {
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
     * Create a detached ReservationConditions_2018Record
     */
    public ReservationConditions_2018Record() {
        super(ReservationConditions_2018.RESERVATION_CONDITIONS_2018);
    }

    /**
     * Create a detached, initialised ReservationConditions_2018Record
     */
    public ReservationConditions_2018Record(Integer id, Integer fkReservation, Integer order, Boolean summary, String lang, String titlehash, String texthash, Integer titlenameid) {
        super(ReservationConditions_2018.RESERVATION_CONDITIONS_2018);

        set(0, id);
        set(1, fkReservation);
        set(2, order);
        set(3, summary);
        set(4, lang);
        set(5, titlehash);
        set(6, texthash);
        set(7, titlenameid);
    }
}
