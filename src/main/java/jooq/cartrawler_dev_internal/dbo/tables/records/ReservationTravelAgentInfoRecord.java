/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationTravelAgentInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class ReservationTravelAgentInfoRecord extends UpdatableRecordImpl<ReservationTravelAgentInfoRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1518628701;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_travel_agent_info.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_travel_agent_info.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_travel_agent_info.agent_id</code>.
     */
    public void setAgentId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_travel_agent_info.agent_id</code>.
     */
    public String getAgentId() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationTravelAgentInfo.RESERVATION_TRAVEL_AGENT_INFO.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReservationTravelAgentInfo.RESERVATION_TRAVEL_AGENT_INFO.AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTravelAgentInfoRecord value1(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTravelAgentInfoRecord value2(String value) {
        setAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTravelAgentInfoRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationTravelAgentInfoRecord
     */
    public ReservationTravelAgentInfoRecord() {
        super(ReservationTravelAgentInfo.RESERVATION_TRAVEL_AGENT_INFO);
    }

    /**
     * Create a detached, initialised ReservationTravelAgentInfoRecord
     */
    public ReservationTravelAgentInfoRecord(Integer fkReservation, String agentId) {
        super(ReservationTravelAgentInfo.RESERVATION_TRAVEL_AGENT_INFO);

        set(0, fkReservation);
        set(1, agentId);
    }
}