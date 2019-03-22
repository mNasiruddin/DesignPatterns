/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.InterfaceVersionKeyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class InterfaceVersionKey extends TableImpl<InterfaceVersionKeyRecord> {

    private static final long serialVersionUID = 791871520;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.interface_version_key</code>
     */
    public static final InterfaceVersionKey INTERFACE_VERSION_KEY = new InterfaceVersionKey();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InterfaceVersionKeyRecord> getRecordType() {
        return InterfaceVersionKeyRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.interface_version_key.guid</code>.
     */
    public final TableField<InterfaceVersionKeyRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.interface_version_key.createdatetime</code>.
     */
    public final TableField<InterfaceVersionKeyRecord, Timestamp> CREATEDATETIME = createField("createdatetime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.interface_version_key.updatedatetime</code>.
     */
    public final TableField<InterfaceVersionKeyRecord, Timestamp> UPDATEDATETIME = createField("updatedatetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.interface_version_key.expiredatetime</code>.
     */
    public final TableField<InterfaceVersionKeyRecord, Timestamp> EXPIREDATETIME = createField("expiredatetime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.interface_version_key.githash</code>.
     */
    public final TableField<InterfaceVersionKeyRecord, String> GITHASH = createField("githash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.interface_version_key.version</code>.
     */
    public final TableField<InterfaceVersionKeyRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.interface_version_key.key</code>.
     */
    public final TableField<InterfaceVersionKeyRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.interface_version_key</code> table reference
     */
    public InterfaceVersionKey() {
        this(DSL.name("interface_version_key"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.interface_version_key</code> table reference
     */
    public InterfaceVersionKey(String alias) {
        this(DSL.name(alias), INTERFACE_VERSION_KEY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.interface_version_key</code> table reference
     */
    public InterfaceVersionKey(Name alias) {
        this(alias, INTERFACE_VERSION_KEY);
    }

    private InterfaceVersionKey(Name alias, Table<InterfaceVersionKeyRecord> aliased) {
        this(alias, aliased, null);
    }

    private InterfaceVersionKey(Name alias, Table<InterfaceVersionKeyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InterfaceVersionKey(Table<O> child, ForeignKey<O, InterfaceVersionKeyRecord> key) {
        super(child, key, INTERFACE_VERSION_KEY);
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
        return Arrays.<Index>asList(Indexes.INTERFACE_VERSION_KEY_INDEX_INTERFACE_VERSION_KEY, Indexes.INTERFACE_VERSION_KEY_PK__INTERFAC__497F6CB421EFD391);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InterfaceVersionKeyRecord> getPrimaryKey() {
        return Keys.PK__INTERFAC__497F6CB421EFD391;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InterfaceVersionKeyRecord>> getKeys() {
        return Arrays.<UniqueKey<InterfaceVersionKeyRecord>>asList(Keys.PK__INTERFAC__497F6CB421EFD391, Keys.INDEX_INTERFACE_VERSION_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InterfaceVersionKey as(String alias) {
        return new InterfaceVersionKey(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InterfaceVersionKey as(Name alias) {
        return new InterfaceVersionKey(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InterfaceVersionKey rename(String name) {
        return new InterfaceVersionKey(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InterfaceVersionKey rename(Name name) {
        return new InterfaceVersionKey(name, null);
    }
}