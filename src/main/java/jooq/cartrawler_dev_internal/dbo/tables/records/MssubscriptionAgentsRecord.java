/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MssubscriptionAgents;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;
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
public class MssubscriptionAgentsRecord extends TableRecordImpl<MssubscriptionAgentsRecord> implements Record17<Integer, String, String, String, Integer, String, UByte, Boolean, Integer, Timestamp, Boolean, Integer, byte[], Integer, String, Timestamp, String> {

    private static final long serialVersionUID = 863732224;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.publisher</code>.
     */
    public void setPublisher(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.publisher</code>.
     */
    public String getPublisher() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.publisher_db</code>.
     */
    public void setPublisherDb(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.publisher_db</code>.
     */
    public String getPublisherDb() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.publication</code>.
     */
    public void setPublication(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.publication</code>.
     */
    public String getPublication() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.subscription_type</code>.
     */
    public void setSubscriptionType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.subscription_type</code>.
     */
    public Integer getSubscriptionType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.queue_id</code>.
     */
    public void setQueueId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.queue_id</code>.
     */
    public String getQueueId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.update_mode</code>.
     */
    public void setUpdateMode(UByte value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.update_mode</code>.
     */
    public UByte getUpdateMode() {
        return (UByte) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.failover_mode</code>.
     */
    public void setFailoverMode(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.failover_mode</code>.
     */
    public Boolean getFailoverMode() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.spid</code>.
     */
    public void setSpid(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.spid</code>.
     */
    public Integer getSpid() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.login_time</code>.
     */
    public void setLoginTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.login_time</code>.
     */
    public Timestamp getLoginTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.allow_subscription_copy</code>.
     */
    public void setAllowSubscriptionCopy(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.allow_subscription_copy</code>.
     */
    public Boolean getAllowSubscriptionCopy() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.attach_state</code>.
     */
    public void setAttachState(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.attach_state</code>.
     */
    public Integer getAttachState() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.attach_version</code>.
     */
    public void setAttachVersion(byte... value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.attach_version</code>.
     */
    public byte[] getAttachVersion() {
        return (byte[]) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.last_sync_status</code>.
     */
    public void setLastSyncStatus(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.last_sync_status</code>.
     */
    public Integer getLastSyncStatus() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.last_sync_summary</code>.
     */
    public void setLastSyncSummary(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.last_sync_summary</code>.
     */
    public String getLastSyncSummary() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.last_sync_time</code>.
     */
    public void setLastSyncTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.last_sync_time</code>.
     */
    public Timestamp getLastSyncTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.queue_server</code>.
     */
    public void setQueueServer(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSsubscription_agents.queue_server</code>.
     */
    public String getQueueServer() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, Integer, String, UByte, Boolean, Integer, Timestamp, Boolean, Integer, byte[], Integer, String, Timestamp, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, String, String, Integer, String, UByte, Boolean, Integer, Timestamp, Boolean, Integer, byte[], Integer, String, Timestamp, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.PUBLISHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.PUBLISHER_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.PUBLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.SUBSCRIPTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.QUEUE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field7() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.UPDATE_MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.FAILOVER_MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.SPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.LOGIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.ALLOW_SUBSCRIPTION_COPY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.ATTACH_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field13() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.ATTACH_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.LAST_SYNC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.LAST_SYNC_SUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.LAST_SYNC_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return MssubscriptionAgents.MSSUBSCRIPTION_AGENTS.QUEUE_SERVER;
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
    public String component2() {
        return getPublisher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPublisherDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSubscriptionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getQueueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component7() {
        return getUpdateMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getFailoverMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getSpid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getAllowSubscriptionCopy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getAttachState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component13() {
        return getAttachVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getLastSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getLastSyncSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getLastSyncTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getQueueServer();
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
    public String value2() {
        return getPublisher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPublisherDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSubscriptionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getQueueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value7() {
        return getUpdateMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getFailoverMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getSpid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getAllowSubscriptionCopy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getAttachState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value13() {
        return getAttachVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getLastSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getLastSyncSummary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getLastSyncTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getQueueServer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value2(String value) {
        setPublisher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value3(String value) {
        setPublisherDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value4(String value) {
        setPublication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value5(Integer value) {
        setSubscriptionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value6(String value) {
        setQueueId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value7(UByte value) {
        setUpdateMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value8(Boolean value) {
        setFailoverMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value9(Integer value) {
        setSpid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value10(Timestamp value) {
        setLoginTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value11(Boolean value) {
        setAllowSubscriptionCopy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value12(Integer value) {
        setAttachState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value13(byte... value) {
        setAttachVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value14(Integer value) {
        setLastSyncStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value15(String value) {
        setLastSyncSummary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value16(Timestamp value) {
        setLastSyncTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord value17(String value) {
        setQueueServer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MssubscriptionAgentsRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, UByte value7, Boolean value8, Integer value9, Timestamp value10, Boolean value11, Integer value12, byte[] value13, Integer value14, String value15, Timestamp value16, String value17) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MssubscriptionAgentsRecord
     */
    public MssubscriptionAgentsRecord() {
        super(MssubscriptionAgents.MSSUBSCRIPTION_AGENTS);
    }

    /**
     * Create a detached, initialised MssubscriptionAgentsRecord
     */
    public MssubscriptionAgentsRecord(Integer id, String publisher, String publisherDb, String publication, Integer subscriptionType, String queueId, UByte updateMode, Boolean failoverMode, Integer spid, Timestamp loginTime, Boolean allowSubscriptionCopy, Integer attachState, byte[] attachVersion, Integer lastSyncStatus, String lastSyncSummary, Timestamp lastSyncTime, String queueServer) {
        super(MssubscriptionAgents.MSSUBSCRIPTION_AGENTS);

        set(0, id);
        set(1, publisher);
        set(2, publisherDb);
        set(3, publication);
        set(4, subscriptionType);
        set(5, queueId);
        set(6, updateMode);
        set(7, failoverMode);
        set(8, spid);
        set(9, loginTime);
        set(10, allowSubscriptionCopy);
        set(11, attachState);
        set(12, attachVersion);
        set(13, lastSyncStatus);
        set(14, lastSyncSummary);
        set(15, lastSyncTime);
        set(16, queueServer);
    }
}
