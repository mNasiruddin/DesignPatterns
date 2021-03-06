/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReviewBackup;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class ReviewBackupRecord extends UpdatableRecordImpl<ReviewBackupRecord> implements Record13<UUID, Integer, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, String, String, String, String, Integer> {

    private static final long serialVersionUID = -402338511;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.fk_review_stats</code>.
     */
    public void setFkReviewStats(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.fk_review_stats</code>.
     */
    public Integer getFkReviewStats() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.ref</code>.
     */
    public void setRef(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.manual_score</code>.
     */
    public void setManualScore(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.manual_score</code>.
     */
    public Integer getManualScore() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.auto_score</code>.
     */
    public void setAutoScore(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.auto_score</code>.
     */
    public Integer getAutoScore() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.trip_type</code>.
     */
    public void setTripType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.trip_type</code>.
     */
    public Integer getTripType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.rate_overall</code>.
     */
    public void setRateOverall(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.rate_overall</code>.
     */
    public BigDecimal getRateOverall() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.review_date</code>.
     */
    public void setReviewDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.review_date</code>.
     */
    public Timestamp getReviewDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.citizen_country_code</code>.
     */
    public void setCitizenCountryCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.citizen_country_code</code>.
     */
    public String getCitizenCountryCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.reviewer_name</code>.
     */
    public void setReviewerName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.reviewer_name</code>.
     */
    public String getReviewerName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.answer_free_text</code>.
     */
    public void setAnswerFreeText(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.answer_free_text</code>.
     */
    public String getAnswerFreeText() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.language_id</code>.
     */
    public void setLanguageId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.language_id</code>.
     */
    public String getLanguageId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.review_backup.fk_survey</code>.
     */
    public void setFkSurvey(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.review_backup.fk_survey</code>.
     */
    public Integer getFkSurvey() {
        return (Integer) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<UUID, Integer, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, String, String, String, String, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<UUID, Integer, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, String, String, String, String, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ReviewBackup.REVIEW_BACKUP.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReviewBackup.REVIEW_BACKUP.FK_REVIEW_STATS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReviewBackup.REVIEW_BACKUP.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReviewBackup.REVIEW_BACKUP.MANUAL_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ReviewBackup.REVIEW_BACKUP.AUTO_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ReviewBackup.REVIEW_BACKUP.TRIP_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return ReviewBackup.REVIEW_BACKUP.RATE_OVERALL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ReviewBackup.REVIEW_BACKUP.REVIEW_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReviewBackup.REVIEW_BACKUP.CITIZEN_COUNTRY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ReviewBackup.REVIEW_BACKUP.REVIEWER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ReviewBackup.REVIEW_BACKUP.ANSWER_FREE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ReviewBackup.REVIEW_BACKUP.LANGUAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ReviewBackup.REVIEW_BACKUP.FK_SURVEY;
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
        return getFkReviewStats();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getManualScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getAutoScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getTripType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getRateOverall();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getReviewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCitizenCountryCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getReviewerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getAnswerFreeText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getFkSurvey();
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
        return getFkReviewStats();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getManualScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAutoScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getTripType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getRateOverall();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getReviewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCitizenCountryCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getReviewerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAnswerFreeText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getFkSurvey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value2(Integer value) {
        setFkReviewStats(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value3(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value4(Integer value) {
        setManualScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value5(Integer value) {
        setAutoScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value6(Integer value) {
        setTripType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value7(BigDecimal value) {
        setRateOverall(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value8(Timestamp value) {
        setReviewDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value9(String value) {
        setCitizenCountryCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value10(String value) {
        setReviewerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value11(String value) {
        setAnswerFreeText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value12(String value) {
        setLanguageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord value13(Integer value) {
        setFkSurvey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewBackupRecord values(UUID value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, BigDecimal value7, Timestamp value8, String value9, String value10, String value11, String value12, Integer value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReviewBackupRecord
     */
    public ReviewBackupRecord() {
        super(ReviewBackup.REVIEW_BACKUP);
    }

    /**
     * Create a detached, initialised ReviewBackupRecord
     */
    public ReviewBackupRecord(UUID guid, Integer fkReviewStats, Integer ref, Integer manualScore, Integer autoScore, Integer tripType, BigDecimal rateOverall, Timestamp reviewDate, String citizenCountryCode, String reviewerName, String answerFreeText, String languageId, Integer fkSurvey) {
        super(ReviewBackup.REVIEW_BACKUP);

        set(0, guid);
        set(1, fkReviewStats);
        set(2, ref);
        set(3, manualScore);
        set(4, autoScore);
        set(5, tripType);
        set(6, rateOverall);
        set(7, reviewDate);
        set(8, citizenCountryCode);
        set(9, reviewerName);
        set(10, answerFreeText);
        set(11, languageId);
        set(12, fkSurvey);
    }
}
