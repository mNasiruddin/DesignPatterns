/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.ViewGroupResGroupRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class ViewGroupResGroup extends TableImpl<ViewGroupResGroupRecord> {

    private static final long serialVersionUID = 504376358;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.view_group_res_group</code>
     */
    public static final ViewGroupResGroup VIEW_GROUP_RES_GROUP = new ViewGroupResGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewGroupResGroupRecord> getRecordType() {
        return ViewGroupResGroupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.Group_ID</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> GROUP_ID = createField("Group_ID", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.Group_Name</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> GROUP_NAME = createField("Group_Name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.Group_type</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> GROUP_TYPE = createField("Group_type", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.KCode</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> KCODE = createField("KCode", org.jooq.impl.SQLDataType.CHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.freesale</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> FREESALE = createField("freesale", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.Van_Group</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> VAN_GROUP = createField("Van_Group", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.MinAge_30</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> MINAGE_30 = createField("MinAge_30", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.advance_time</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Integer> ADVANCE_TIME = createField("advance_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.OTA_VehClass</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Integer> OTA_VEHCLASS = createField("OTA_VehClass", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.OTA_VehCategory</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Integer> OTA_VEHCATEGORY = createField("OTA_VehCategory", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.winter_Tyre</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> WINTER_TYRE = createField("winter_Tyre", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.parking_Sensor</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> PARKING_SENSOR = createField("parking_Sensor", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.guarenteed_German_Model</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> GUARENTEED_GERMAN_MODEL = createField("guarenteed_German_Model", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.luggage_Rack</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> LUGGAGE_RACK = createField("luggage_Rack", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.exceptional_Fuel_Economy</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> EXCEPTIONAL_FUEL_ECONOMY = createField("exceptional_Fuel_Economy", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.blue_Tooth_Enabled</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> BLUE_TOOTH_ENABLED = createField("blue_Tooth_Enabled", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.gpsIncluded</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> GPSINCLUDED = createField("gpsIncluded", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.group_status</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> GROUP_STATUS = createField("group_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.car_agent_id</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.selected_car_id</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Integer> SELECTED_CAR_ID = createField("selected_car_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.res_group_code</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> RES_GROUP_CODE = createField("res_group_code", org.jooq.impl.SQLDataType.CHAR(4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.region_id</code>.
     */
    public final TableField<ViewGroupResGroupRecord, UByte> REGION_ID = createField("region_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.sample_car_id</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Integer> SAMPLE_CAR_ID = createField("sample_car_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.automatic</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> AUTOMATIC = createField("automatic", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.aircon</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> AIRCON = createField("aircon", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.gps</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> GPS = createField("gps", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.bags</code>.
     */
    public final TableField<ViewGroupResGroupRecord, UByte> BAGS = createField("bags", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.paslarge</code>.
     */
    public final TableField<ViewGroupResGroupRecord, UByte> PASLARGE = createField("paslarge", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.passmall</code>.
     */
    public final TableField<ViewGroupResGroupRecord, UByte> PASSMALL = createField("passmall", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.doors</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> DOORS = createField("doors", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.seats</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> SEATS = createField("seats", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.drive</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> DRIVE = createField("drive", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.fuel</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> FUEL = createField("fuel", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.ota_vehicle_category</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> OTA_VEHICLE_CATEGORY = createField("ota_vehicle_category", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.ota_vehicle_class_size</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> OTA_VEHICLE_CLASS_SIZE = createField("ota_vehicle_class_size", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.enginesize</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Double> ENGINESIZE = createField("enginesize", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.fuelconsumption</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Double> FUELCONSUMPTION = createField("fuelconsumption", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.fuelconsumption_unit</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> FUELCONSUMPTION_UNIT = createField("fuelconsumption_unit", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.picture</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.picture_plain</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> PICTURE_PLAIN = createField("picture_plain", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.ranking</code>.
     */
    public final TableField<ViewGroupResGroupRecord, UByte> RANKING = createField("ranking", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.cartrawler_category</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Short> CARTRAWLER_CATEGORY = createField("cartrawler_category", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.Country_ID</code>.
     */
    public final TableField<ViewGroupResGroupRecord, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.blocked</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> BLOCKED = createField("blocked", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.onrequest</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> ONREQUEST = createField("onrequest", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.guaranteed_car</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> GUARANTEED_CAR = createField("guaranteed_car", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.gFlags</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Short> GFLAGS = createField("gFlags", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.front_Screen_Demister</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> FRONT_SCREEN_DEMISTER = createField("front_Screen_Demister", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.parking_Assist_Technology</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> PARKING_ASSIST_TECHNOLOGY = createField("parking_Assist_Technology", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.usb_Connection</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Boolean> USB_CONNECTION = createField("usb_Connection", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.vehicle_Length</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Double> VEHICLE_LENGTH = createField("vehicle_Length", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.vehicle_Width</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Double> VEHICLE_WIDTH = createField("vehicle_Width", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.vehicle_Height</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Double> VEHICLE_HEIGHT = createField("vehicle_Height", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.vehicle_Load</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Double> VEHICLE_LOAD = createField("vehicle_Load", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.view_group_res_group.openhours_advancetime</code>.
     */
    public final TableField<ViewGroupResGroupRecord, Integer> OPENHOURS_ADVANCETIME = createField("openhours_advancetime", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.view_group_res_group</code> table reference
     */
    public ViewGroupResGroup() {
        this(DSL.name("view_group_res_group"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.view_group_res_group</code> table reference
     */
    public ViewGroupResGroup(String alias) {
        this(DSL.name(alias), VIEW_GROUP_RES_GROUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.view_group_res_group</code> table reference
     */
    public ViewGroupResGroup(Name alias) {
        this(alias, VIEW_GROUP_RES_GROUP);
    }

    private ViewGroupResGroup(Name alias, Table<ViewGroupResGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewGroupResGroup(Name alias, Table<ViewGroupResGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewGroupResGroup(Table<O> child, ForeignKey<O, ViewGroupResGroupRecord> key) {
        super(child, key, VIEW_GROUP_RES_GROUP);
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
    public ViewGroupResGroup as(String alias) {
        return new ViewGroupResGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewGroupResGroup as(Name alias) {
        return new ViewGroupResGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewGroupResGroup rename(String name) {
        return new ViewGroupResGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewGroupResGroup rename(Name name) {
        return new ViewGroupResGroup(name, null);
    }
}
