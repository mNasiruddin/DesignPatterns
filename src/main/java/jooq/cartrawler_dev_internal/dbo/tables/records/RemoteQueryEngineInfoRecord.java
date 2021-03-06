/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.RemoteQueryEngineInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class RemoteQueryEngineInfoRecord extends UpdatableRecordImpl<RemoteQueryEngineInfoRecord> implements Record15<Long, Integer, Integer, Integer, Long, Long, Long, Long, Long, UByte, String, Integer, Long, Timestamp, UByte> {

    private static final long serialVersionUID = -1201409961;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.fk_remote_queries</code>.
     */
    public void setFkRemoteQueries(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.fk_remote_queries</code>.
     */
    public Long getFkRemoteQueries() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.fk_engineTitles</code>.
     */
    public void setFkEnginetitles(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.fk_engineTitles</code>.
     */
    public Integer getFkEnginetitles() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.svn_version</code>.
     */
    public void setSvnVersion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.svn_version</code>.
     */
    public Integer getSvnVersion() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.engine_name_id</code>.
     */
    public void setEngineNameId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.engine_name_id</code>.
     */
    public Integer getEngineNameId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.cID</code>.
     */
    public void setCid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.cID</code>.
     */
    public Long getCid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.kID</code>.
     */
    public void setKid(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.kID</code>.
     */
    public Long getKid() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.agID</code>.
     */
    public void setAgid(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.agID</code>.
     */
    public Long getAgid() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.aID</code>.
     */
    public void setAid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.aID</code>.
     */
    public Long getAid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.customer_id</code>.
     */
    public void setCustomerId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.source</code>.
     */
    public void setSource(UByte value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.source</code>.
     */
    public UByte getSource() {
        return (UByte) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.sourceDomain</code>.
     */
    public void setSourcedomain(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.sourceDomain</code>.
     */
    public String getSourcedomain() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.fk_engineLoads</code>.
     */
    public void setFkEngineloads(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.fk_engineLoads</code>.
     */
    public Integer getFkEngineloads() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.engineLoadID</code>.
     */
    public void setEngineloadid(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.engineLoadID</code>.
     */
    public Long getEngineloadid() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.querydate</code>.
     */
    public void setQuerydate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.querydate</code>.
     */
    public Timestamp getQuerydate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.proxyversion</code>.
     */
    public void setProxyversion(UByte value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.remote_query_engine_info.proxyversion</code>.
     */
    public UByte getProxyversion() {
        return (UByte) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Integer, Integer, Integer, Long, Long, Long, Long, Long, UByte, String, Integer, Long, Timestamp, UByte> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Integer, Integer, Integer, Long, Long, Long, Long, Long, UByte, String, Integer, Long, Timestamp, UByte> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.FK_REMOTE_QUERIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.FK_ENGINETITLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.SVN_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.ENGINE_NAME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.KID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.AGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.AID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field10() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.SOURCEDOMAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.FK_ENGINELOADS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.ENGINELOADID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.QUERYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field15() {
        return RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO.PROXYVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getFkRemoteQueries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkEnginetitles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSvnVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getEngineNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getKid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getAgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getAid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component10() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSourcedomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getFkEngineloads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component15() {
        return getProxyversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getFkRemoteQueries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkEnginetitles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSvnVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEngineNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getKid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getAgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getAid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value10() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSourcedomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getFkEngineloads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value15() {
        return getProxyversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value1(Long value) {
        setFkRemoteQueries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value2(Integer value) {
        setFkEnginetitles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value3(Integer value) {
        setSvnVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value4(Integer value) {
        setEngineNameId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value5(Long value) {
        setCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value6(Long value) {
        setKid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value7(Long value) {
        setAgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value8(Long value) {
        setAid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value9(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value10(UByte value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value11(String value) {
        setSourcedomain(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value12(Integer value) {
        setFkEngineloads(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value13(Long value) {
        setEngineloadid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value14(Timestamp value) {
        setQuerydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord value15(UByte value) {
        setProxyversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueryEngineInfoRecord values(Long value1, Integer value2, Integer value3, Integer value4, Long value5, Long value6, Long value7, Long value8, Long value9, UByte value10, String value11, Integer value12, Long value13, Timestamp value14, UByte value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RemoteQueryEngineInfoRecord
     */
    public RemoteQueryEngineInfoRecord() {
        super(RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO);
    }

    /**
     * Create a detached, initialised RemoteQueryEngineInfoRecord
     */
    public RemoteQueryEngineInfoRecord(Long fkRemoteQueries, Integer fkEnginetitles, Integer svnVersion, Integer engineNameId, Long cid, Long kid, Long agid, Long aid, Long customerId, UByte source, String sourcedomain, Integer fkEngineloads, Long engineloadid, Timestamp querydate, UByte proxyversion) {
        super(RemoteQueryEngineInfo.REMOTE_QUERY_ENGINE_INFO);

        set(0, fkRemoteQueries);
        set(1, fkEnginetitles);
        set(2, svnVersion);
        set(3, engineNameId);
        set(4, cid);
        set(5, kid);
        set(6, agid);
        set(7, aid);
        set(8, customerId);
        set(9, source);
        set(10, sourcedomain);
        set(11, fkEngineloads);
        set(12, engineloadid);
        set(13, querydate);
        set(14, proxyversion);
    }
}
