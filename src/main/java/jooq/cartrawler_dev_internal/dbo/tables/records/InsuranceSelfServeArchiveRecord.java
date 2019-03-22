/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.InsuranceSelfServeArchive;

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
public class InsuranceSelfServeArchiveRecord extends UpdatableRecordImpl<InsuranceSelfServeArchiveRecord> {

    private static final long serialVersionUID = -1004188176;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.pk_id</code>.
     */
    public void setPkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.pk_id</code>.
     */
    public Integer getPkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.live</code>.
     */
    public void setLive(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.live</code>.
     */
    public Boolean getLive() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.src_group</code>.
     */
    public void setSrcGroup(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.src_group</code>.
     */
    public Integer getSrcGroup() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.dest_group</code>.
     */
    public void setDestGroup(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.dest_group</code>.
     */
    public Integer getDestGroup() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.client_group</code>.
     */
    public void setClientGroup(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.client_group</code>.
     */
    public Integer getClientGroup() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.channel_group</code>.
     */
    public void setChannelGroup(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.channel_group</code>.
     */
    public Integer getChannelGroup() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.car_price_start</code>.
     */
    public void setCarPriceStart(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.car_price_start</code>.
     */
    public Double getCarPriceStart() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.car_price_end</code>.
     */
    public void setCarPriceEnd(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.car_price_end</code>.
     */
    public Double getCarPriceEnd() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.duration_start</code>.
     */
    public void setDurationStart(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.duration_start</code>.
     */
    public Integer getDurationStart() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.duration_end</code>.
     */
    public void setDurationEnd(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.duration_end</code>.
     */
    public Integer getDurationEnd() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ratio</code>.
     */
    public void setRatio(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ratio</code>.
     */
    public Double getRatio() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.day_floor</code>.
     */
    public void setDayFloor(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.day_floor</code>.
     */
    public Double getDayFloor() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.day_ceiling</code>.
     */
    public void setDayCeiling(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.day_ceiling</code>.
     */
    public Double getDayCeiling() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.insurance_ceiling</code>.
     */
    public void setInsuranceCeiling(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.insurance_ceiling</code>.
     */
    public Double getInsuranceCeiling() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_ratio</code>.
     */
    public void setAbRatio(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_ratio</code>.
     */
    public Double getAbRatio() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_day_floor</code>.
     */
    public void setAbDayFloor(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_day_floor</code>.
     */
    public Double getAbDayFloor() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_day_ceiling</code>.
     */
    public void setAbDayCeiling(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_day_ceiling</code>.
     */
    public Double getAbDayCeiling() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_insurance_ceiling</code>.
     */
    public void setAbInsuranceCeiling(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_insurance_ceiling</code>.
     */
    public Double getAbInsuranceCeiling() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.insurance_floor</code>.
     */
    public void setInsuranceFloor(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.insurance_floor</code>.
     */
    public Double getInsuranceFloor() {
        return (Double) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_insurance_floor</code>.
     */
    public void setAbInsuranceFloor(Double value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.ab_insurance_floor</code>.
     */
    public Double getAbInsuranceFloor() {
        return (Double) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.version</code>.
     */
    public void setVersion(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.archived_date</code>.
     */
    public void setArchivedDate(Timestamp value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.archived_date</code>.
     */
    public Timestamp getArchivedDate() {
        return (Timestamp) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.fk_issBandit</code>.
     */
    public void setFkIssbandit(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_self_serve_archive.fk_issBandit</code>.
     */
    public Integer getFkIssbandit() {
        return (Integer) get(24);
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
     * Create a detached InsuranceSelfServeArchiveRecord
     */
    public InsuranceSelfServeArchiveRecord() {
        super(InsuranceSelfServeArchive.INSURANCE_SELF_SERVE_ARCHIVE);
    }

    /**
     * Create a detached, initialised InsuranceSelfServeArchiveRecord
     */
    public InsuranceSelfServeArchiveRecord(Integer pkId, Integer id, Timestamp created, Boolean live, Integer srcGroup, Integer destGroup, Integer clientGroup, Integer channelGroup, Double carPriceStart, Double carPriceEnd, Integer durationStart, Integer durationEnd, Double ratio, Double dayFloor, Double dayCeiling, Double insuranceCeiling, Double abRatio, Double abDayFloor, Double abDayCeiling, Double abInsuranceCeiling, Double insuranceFloor, Double abInsuranceFloor, Integer version, Timestamp archivedDate, Integer fkIssbandit) {
        super(InsuranceSelfServeArchive.INSURANCE_SELF_SERVE_ARCHIVE);

        set(0, pkId);
        set(1, id);
        set(2, created);
        set(3, live);
        set(4, srcGroup);
        set(5, destGroup);
        set(6, clientGroup);
        set(7, channelGroup);
        set(8, carPriceStart);
        set(9, carPriceEnd);
        set(10, durationStart);
        set(11, durationEnd);
        set(12, ratio);
        set(13, dayFloor);
        set(14, dayCeiling);
        set(15, insuranceCeiling);
        set(16, abRatio);
        set(17, abDayFloor);
        set(18, abDayCeiling);
        set(19, abInsuranceCeiling);
        set(20, insuranceFloor);
        set(21, abInsuranceFloor);
        set(22, version);
        set(23, archivedDate);
        set(24, fkIssbandit);
    }
}