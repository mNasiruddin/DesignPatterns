/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.PartnerAccessRequestsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class PartnerAccessRequests extends TableImpl<PartnerAccessRequestsRecord> {

    private static final long serialVersionUID = -1180917625;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.partner_access_requests</code>
     */
    public static final PartnerAccessRequests PARTNER_ACCESS_REQUESTS = new PartnerAccessRequests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PartnerAccessRequestsRecord> getRecordType() {
        return PartnerAccessRequestsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.partner_access_requests.Id</code>.
     */
    public final TableField<PartnerAccessRequestsRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.partner_access_requests.ClientId</code>.
     */
    public final TableField<PartnerAccessRequestsRecord, Integer> CLIENTID = createField("ClientId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.partner_access_requests.EmailAddress</code>.
     */
    public final TableField<PartnerAccessRequestsRecord, String> EMAILADDRESS = createField("EmailAddress", org.jooq.impl.SQLDataType.NVARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.partner_access_requests.Status</code>.
     */
    public final TableField<PartnerAccessRequestsRecord, Integer> STATUS = createField("Status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.partner_access_requests.DateReceived</code>.
     */
    public final TableField<PartnerAccessRequestsRecord, Timestamp> DATERECEIVED = createField("DateReceived", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.partner_access_requests.StatusDate</code>.
     */
    public final TableField<PartnerAccessRequestsRecord, Timestamp> STATUSDATE = createField("StatusDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.partner_access_requests</code> table reference
     */
    public PartnerAccessRequests() {
        this(DSL.name("partner_access_requests"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.partner_access_requests</code> table reference
     */
    public PartnerAccessRequests(String alias) {
        this(DSL.name(alias), PARTNER_ACCESS_REQUESTS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.partner_access_requests</code> table reference
     */
    public PartnerAccessRequests(Name alias) {
        this(alias, PARTNER_ACCESS_REQUESTS);
    }

    private PartnerAccessRequests(Name alias, Table<PartnerAccessRequestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PartnerAccessRequests(Name alias, Table<PartnerAccessRequestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PartnerAccessRequests(Table<O> child, ForeignKey<O, PartnerAccessRequestsRecord> key) {
        super(child, key, PARTNER_ACCESS_REQUESTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PARTNER_ACCESS_REQUESTS_PK__PARTNER___3214EC073AF08B85);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PartnerAccessRequestsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PARTNER_ACCESS_REQUESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PartnerAccessRequestsRecord> getPrimaryKey() {
        return Keys.PK__PARTNER___3214EC073AF08B85;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PartnerAccessRequestsRecord>> getKeys() {
        return Arrays.<UniqueKey<PartnerAccessRequestsRecord>>asList(Keys.PK__PARTNER___3214EC073AF08B85);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnerAccessRequests as(String alias) {
        return new PartnerAccessRequests(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartnerAccessRequests as(Name alias) {
        return new PartnerAccessRequests(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PartnerAccessRequests rename(String name) {
        return new PartnerAccessRequests(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PartnerAccessRequests rename(Name name) {
        return new PartnerAccessRequests(name, null);
    }
}
