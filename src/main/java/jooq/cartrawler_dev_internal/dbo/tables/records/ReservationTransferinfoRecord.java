/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationTransferinfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
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
public class ReservationTransferinfoRecord extends UpdatableRecordImpl<ReservationTransferinfoRecord> implements Record12<Integer, Integer, String, Short, Short, Short, UByte, UByte, String, String, String, Short> {

    private static final long serialVersionUID = -1049451988;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.fk_reservationRef</code>.
     */
    public void setFkReservationref(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.fk_reservationRef</code>.
     */
    public Integer getFkReservationref() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.extTfPlaceRef</code>.
     */
    public void setExttfplaceref(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.extTfPlaceRef</code>.
     */
    public String getExttfplaceref() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.adultsInParty</code>.
     */
    public void setAdultsinparty(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.adultsInParty</code>.
     */
    public Short getAdultsinparty() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.childrenInParty</code>.
     */
    public void setChildreninparty(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.childrenInParty</code>.
     */
    public Short getChildreninparty() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.infantsInParty</code>.
     */
    public void setInfantsinparty(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.infantsInParty</code>.
     */
    public Short getInfantsinparty() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.tripKind</code>.
     */
    public void setTripkind(UByte value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.tripKind</code>.
     */
    public UByte getTripkind() {
        return (UByte) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.vehicleCount</code>.
     */
    public void setVehiclecount(UByte value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.vehicleCount</code>.
     */
    public UByte getVehiclecount() {
        return (UByte) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.inboundFlightNo</code>.
     */
    public void setInboundflightno(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.inboundFlightNo</code>.
     */
    public String getInboundflightno() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.inboundAirlineID</code>.
     */
    public void setInboundairlineid(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.inboundAirlineID</code>.
     */
    public String getInboundairlineid() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.extProductRef</code>.
     */
    public void setExtproductref(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.extProductRef</code>.
     */
    public String getExtproductref() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.collectionOffsetMins</code>.
     */
    public void setCollectionoffsetmins(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_transferInfo.collectionOffsetMins</code>.
     */
    public Short getCollectionoffsetmins() {
        return (Short) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Short, Short, Short, UByte, UByte, String, String, String, Short> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Short, Short, Short, UByte, UByte, String, String, String, Short> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.FK_RESERVATIONREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.EXTTFPLACEREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.ADULTSINPARTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.CHILDRENINPARTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.INFANTSINPARTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field7() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.TRIPKIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field8() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.VEHICLECOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.INBOUNDFLIGHTNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.INBOUNDAIRLINEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.EXTPRODUCTREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return ReservationTransferinfo.RESERVATION_TRANSFERINFO.COLLECTIONOFFSETMINS;
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
        return getFkReservationref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getExttfplaceref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getAdultsinparty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getChildreninparty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getInfantsinparty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component7() {
        return getTripkind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component8() {
        return getVehiclecount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getInboundflightno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getInboundairlineid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getExtproductref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getCollectionoffsetmins();
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
        return getFkReservationref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExttfplaceref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getAdultsinparty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getChildreninparty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getInfantsinparty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value7() {
        return getTripkind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value8() {
        return getVehiclecount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getInboundflightno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getInboundairlineid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getExtproductref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getCollectionoffsetmins();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value2(Integer value) {
        setFkReservationref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value3(String value) {
        setExttfplaceref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value4(Short value) {
        setAdultsinparty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value5(Short value) {
        setChildreninparty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value6(Short value) {
        setInfantsinparty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value7(UByte value) {
        setTripkind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value8(UByte value) {
        setVehiclecount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value9(String value) {
        setInboundflightno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value10(String value) {
        setInboundairlineid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value11(String value) {
        setExtproductref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord value12(Short value) {
        setCollectionoffsetmins(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationTransferinfoRecord values(Integer value1, Integer value2, String value3, Short value4, Short value5, Short value6, UByte value7, UByte value8, String value9, String value10, String value11, Short value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationTransferinfoRecord
     */
    public ReservationTransferinfoRecord() {
        super(ReservationTransferinfo.RESERVATION_TRANSFERINFO);
    }

    /**
     * Create a detached, initialised ReservationTransferinfoRecord
     */
    public ReservationTransferinfoRecord(Integer id, Integer fkReservationref, String exttfplaceref, Short adultsinparty, Short childreninparty, Short infantsinparty, UByte tripkind, UByte vehiclecount, String inboundflightno, String inboundairlineid, String extproductref, Short collectionoffsetmins) {
        super(ReservationTransferinfo.RESERVATION_TRANSFERINFO);

        set(0, id);
        set(1, fkReservationref);
        set(2, exttfplaceref);
        set(3, adultsinparty);
        set(4, childreninparty);
        set(5, infantsinparty);
        set(6, tripkind);
        set(7, vehiclecount);
        set(8, inboundflightno);
        set(9, inboundairlineid);
        set(10, extproductref);
        set(11, collectionoffsetmins);
    }
}
