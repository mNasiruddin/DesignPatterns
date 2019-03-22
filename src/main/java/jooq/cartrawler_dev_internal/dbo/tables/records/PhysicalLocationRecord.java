/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.PhysicalLocation;

import org.jooq.Record1;
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
public class PhysicalLocationRecord extends UpdatableRecordImpl<PhysicalLocationRecord> {

    private static final long serialVersionUID = -769159174;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.physical_location_id</code>.
     */
    public void setPhysicalLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.physical_location_id</code>.
     */
    public Integer getPhysicalLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.country_id</code>.
     */
    public void setCountryId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.addressline1</code>.
     */
    public void setAddressline1(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.addressline1</code>.
     */
    public String getAddressline1() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.addressline2</code>.
     */
    public void setAddressline2(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.addressline2</code>.
     */
    public String getAddressline2() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.cityname</code>.
     */
    public void setCityname(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.cityname</code>.
     */
    public String getCityname() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.postalcode</code>.
     */
    public void setPostalcode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.postalcode</code>.
     */
    public String getPostalcode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.county</code>.
     */
    public void setCounty(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.county</code>.
     */
    public String getCounty() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.stateprov</code>.
     */
    public void setStateprov(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.stateprov</code>.
     */
    public String getStateprov() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.statecode</code>.
     */
    public void setStatecode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.statecode</code>.
     */
    public String getStatecode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.telephone</code>.
     */
    public void setTelephone(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.telephone</code>.
     */
    public String getTelephone() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.airport</code>.
     */
    public void setAirport(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.airport</code>.
     */
    public Boolean getAirport() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.railway</code>.
     */
    public void setRailway(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.railway</code>.
     */
    public Boolean getRailway() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.ferryport</code>.
     */
    public void setFerryport(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.ferryport</code>.
     */
    public Boolean getFerryport() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.iata_airport_code</code>.
     */
    public void setIataAirportCode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.iata_airport_code</code>.
     */
    public String getIataAirportCode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.iata_city_code</code>.
     */
    public void setIataCityCode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.iata_city_code</code>.
     */
    public String getIataCityCode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.pickup_type_id</code>.
     */
    public void setPickupTypeId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.pickup_type_id</code>.
     */
    public Integer getPickupTypeId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.timezone</code>.
     */
    public void setTimezone(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.timezone</code>.
     */
    public String getTimezone() {
        return (String) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.pickup_only</code>.
     */
    public void setPickupOnly(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.pickup_only</code>.
     */
    public Boolean getPickupOnly() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.return_only</code>.
     */
    public void setReturnOnly(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.return_only</code>.
     */
    public Boolean getReturnOnly() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.outofhours_return</code>.
     */
    public void setOutofhoursReturn(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.outofhours_return</code>.
     */
    public Boolean getOutofhoursReturn() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.directions</code>.
     */
    public void setDirections(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.directions</code>.
     */
    public String getDirections() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.temp_cityname</code>.
     */
    public void setTempCityname(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.temp_cityname</code>.
     */
    public String getTempCityname() {
        return (String) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.temp_last_user</code>.
     */
    public void setTempLastUser(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.temp_last_user</code>.
     */
    public Integer getTempLastUser() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.dropbox</code>.
     */
    public void setDropbox(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.dropbox</code>.
     */
    public Boolean getDropbox() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.autoCalculatedTimezone</code>.
     */
    public void setAutocalculatedtimezone(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.autoCalculatedTimezone</code>.
     */
    public Boolean getAutocalculatedtimezone() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.delivery_collection</code>.
     */
    public void setDeliveryCollection(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.delivery_collection</code>.
     */
    public Boolean getDeliveryCollection() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.pl_email</code>.
     */
    public void setPlEmail(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.pl_email</code>.
     */
    public String getPlEmail() {
        return (String) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.physical_location.debitCardAccepted</code>.
     */
    public void setDebitcardaccepted(Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.physical_location.debitCardAccepted</code>.
     */
    public Boolean getDebitcardaccepted() {
        return (Boolean) get(29);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhysicalLocationRecord
     */
    public PhysicalLocationRecord() {
        super(PhysicalLocation.PHYSICAL_LOCATION);
    }

    /**
     * Create a detached, initialised PhysicalLocationRecord
     */
    public PhysicalLocationRecord(Integer physicalLocationId, String countryId, BigDecimal latitude, BigDecimal longitude, String addressline1, String addressline2, String cityname, String postalcode, String county, String stateprov, String statecode, String telephone, Boolean airport, Boolean railway, Boolean ferryport, String iataAirportCode, String iataCityCode, Integer pickupTypeId, String timezone, Boolean pickupOnly, Boolean returnOnly, Boolean outofhoursReturn, String directions, String tempCityname, Integer tempLastUser, Boolean dropbox, Boolean autocalculatedtimezone, Boolean deliveryCollection, String plEmail, Boolean debitcardaccepted) {
        super(PhysicalLocation.PHYSICAL_LOCATION);

        set(0, physicalLocationId);
        set(1, countryId);
        set(2, latitude);
        set(3, longitude);
        set(4, addressline1);
        set(5, addressline2);
        set(6, cityname);
        set(7, postalcode);
        set(8, county);
        set(9, stateprov);
        set(10, statecode);
        set(11, telephone);
        set(12, airport);
        set(13, railway);
        set(14, ferryport);
        set(15, iataAirportCode);
        set(16, iataCityCode);
        set(17, pickupTypeId);
        set(18, timezone);
        set(19, pickupOnly);
        set(20, returnOnly);
        set(21, outofhoursReturn);
        set(22, directions);
        set(23, tempCityname);
        set(24, tempLastUser);
        set(25, dropbox);
        set(26, autocalculatedtimezone);
        set(27, deliveryCollection);
        set(28, plEmail);
        set(29, debitcardaccepted);
    }
}