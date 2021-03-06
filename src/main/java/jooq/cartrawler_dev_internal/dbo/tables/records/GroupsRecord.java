/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Groups;

import org.jooq.Record2;
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
public class GroupsRecord extends UpdatableRecordImpl<GroupsRecord> {

    private static final long serialVersionUID = 412439697;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Group_ID</code>.
     */
    public void setGroupId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Group_ID</code>.
     */
    public String getGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Country_id</code>.
     */
    public void setCountryId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Country_id</code>.
     */
    public String getCountryId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Group_Name</code>.
     */
    public void setGroupName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Group_Name</code>.
     */
    public String getGroupName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Group_type</code>.
     */
    public void setGroupType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Group_type</code>.
     */
    public String getGroupType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Van_Group</code>.
     */
    public void setVanGroup(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Van_Group</code>.
     */
    public Boolean getVanGroup() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.MinAge_30</code>.
     */
    public void setMinage_30(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.MinAge_30</code>.
     */
    public Boolean getMinage_30() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Group_Description</code>.
     */
    public void setGroupDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Group_Description</code>.
     */
    public String getGroupDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.list_order</code>.
     */
    public void setListOrder(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.list_order</code>.
     */
    public Integer getListOrder() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Status</code>.
     */
    public void setStatus(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.KCode</code>.
     */
    public void setKcode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.KCode</code>.
     */
    public String getKcode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.Agency_Name</code>.
     */
    public void setAgencyName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.Agency_Name</code>.
     */
    public String getAgencyName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.advance_time</code>.
     */
    public void setAdvanceTime(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.advance_time</code>.
     */
    public Integer getAdvanceTime() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.car_agent</code>.
     */
    public void setCarAgent(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.car_agent</code>.
     */
    public Integer getCarAgent() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.res_group</code>.
     */
    public void setResGroup(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.res_group</code>.
     */
    public Integer getResGroup() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.freesale</code>.
     */
    public void setFreesale(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.freesale</code>.
     */
    public Boolean getFreesale() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.OTA_VehClass</code>.
     */
    public void setOtaVehclass(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.OTA_VehClass</code>.
     */
    public Integer getOtaVehclass() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.OTA_VehCategory</code>.
     */
    public void setOtaVehcategory(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.OTA_VehCategory</code>.
     */
    public Integer getOtaVehcategory() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.car_id</code>.
     */
    public void setCarId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.car_id</code>.
     */
    public Integer getCarId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.temp_res_count</code>.
     */
    public void setTempResCount(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.temp_res_count</code>.
     */
    public Integer getTempResCount() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.onrequest</code>.
     */
    public void setOnrequest(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.onrequest</code>.
     */
    public Boolean getOnrequest() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.blocked</code>.
     */
    public void setBlocked(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.blocked</code>.
     */
    public Boolean getBlocked() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.guaranteed_car</code>.
     */
    public void setGuaranteedCar(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.guaranteed_car</code>.
     */
    public Boolean getGuaranteedCar() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.createDate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.createDate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.gFlags</code>.
     */
    public void setGflags(Short value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.gFlags</code>.
     */
    public Short getGflags() {
        return (Short) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.winter_Tyre</code>.
     */
    public void setWinterTyre(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.winter_Tyre</code>.
     */
    public Boolean getWinterTyre() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.parking_Sensor</code>.
     */
    public void setParkingSensor(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.parking_Sensor</code>.
     */
    public Boolean getParkingSensor() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.guarenteed_German_Model</code>.
     */
    public void setGuarenteedGermanModel(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.guarenteed_German_Model</code>.
     */
    public Boolean getGuarenteedGermanModel() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.luggage_Rack</code>.
     */
    public void setLuggageRack(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.luggage_Rack</code>.
     */
    public Boolean getLuggageRack() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.exceptional_Fuel_Economy</code>.
     */
    public void setExceptionalFuelEconomy(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.exceptional_Fuel_Economy</code>.
     */
    public Boolean getExceptionalFuelEconomy() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.blue_Tooth_Enabled</code>.
     */
    public void setBlueToothEnabled(Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.blue_Tooth_Enabled</code>.
     */
    public Boolean getBlueToothEnabled() {
        return (Boolean) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.front_Screen_Demister</code>.
     */
    public void setFrontScreenDemister(Boolean value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.front_Screen_Demister</code>.
     */
    public Boolean getFrontScreenDemister() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.parking_Assist_Technology</code>.
     */
    public void setParkingAssistTechnology(Boolean value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.parking_Assist_Technology</code>.
     */
    public Boolean getParkingAssistTechnology() {
        return (Boolean) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.usb_Connection</code>.
     */
    public void setUsbConnection(Boolean value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.usb_Connection</code>.
     */
    public Boolean getUsbConnection() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.gpsIncluded</code>.
     */
    public void setGpsincluded(Boolean value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.gpsIncluded</code>.
     */
    public Boolean getGpsincluded() {
        return (Boolean) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.openhours_advancetime</code>.
     */
    public void setOpenhoursAdvancetime(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.openhours_advancetime</code>.
     */
    public Integer getOpenhoursAdvancetime() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Groups.featureFlags</code>.
     */
    public void setFeatureflags(Integer value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Groups.featureFlags</code>.
     */
    public Integer getFeatureflags() {
        return (Integer) get(35);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupsRecord
     */
    public GroupsRecord() {
        super(Groups.GROUPS);
    }

    /**
     * Create a detached, initialised GroupsRecord
     */
    public GroupsRecord(String groupId, String countryId, String groupName, String groupType, Boolean vanGroup, Boolean minage_30, String groupDescription, Integer listOrder, Boolean status, String kcode, String agencyName, Integer advanceTime, Integer carAgent, Integer resGroup, Boolean freesale, Integer otaVehclass, Integer otaVehcategory, Integer carId, Integer tempResCount, Boolean onrequest, Boolean blocked, Boolean guaranteedCar, Timestamp createdate, Short gflags, Boolean winterTyre, Boolean parkingSensor, Boolean guarenteedGermanModel, Boolean luggageRack, Boolean exceptionalFuelEconomy, Boolean blueToothEnabled, Boolean frontScreenDemister, Boolean parkingAssistTechnology, Boolean usbConnection, Boolean gpsincluded, Integer openhoursAdvancetime, Integer featureflags) {
        super(Groups.GROUPS);

        set(0, groupId);
        set(1, countryId);
        set(2, groupName);
        set(3, groupType);
        set(4, vanGroup);
        set(5, minage_30);
        set(6, groupDescription);
        set(7, listOrder);
        set(8, status);
        set(9, kcode);
        set(10, agencyName);
        set(11, advanceTime);
        set(12, carAgent);
        set(13, resGroup);
        set(14, freesale);
        set(15, otaVehclass);
        set(16, otaVehcategory);
        set(17, carId);
        set(18, tempResCount);
        set(19, onrequest);
        set(20, blocked);
        set(21, guaranteedCar);
        set(22, createdate);
        set(23, gflags);
        set(24, winterTyre);
        set(25, parkingSensor);
        set(26, guarenteedGermanModel);
        set(27, luggageRack);
        set(28, exceptionalFuelEconomy);
        set(29, blueToothEnabled);
        set(30, frontScreenDemister);
        set(31, parkingAssistTechnology);
        set(32, usbConnection);
        set(33, gpsincluded);
        set(34, openhoursAdvancetime);
        set(35, featureflags);
    }
}
