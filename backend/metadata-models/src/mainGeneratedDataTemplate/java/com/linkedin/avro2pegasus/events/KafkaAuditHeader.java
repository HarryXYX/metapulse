
package com.linkedin.avro2pegasus.events;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/avro2pegasus/events/KafkaAuditHeader.pdl.")
public class KafkaAuditHeader
    extends RecordTemplate
{

    private final static KafkaAuditHeader.Fields _fields = new KafkaAuditHeader.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}", SchemaFormatType.PDL));
    private Long _timeField = null;
    private String _serverField = null;
    private String _instanceField = null;
    private String _appNameField = null;
    private UUID _messageIdField = null;
    private Integer _auditVersionField = null;
    private String _fabricUrnField = null;
    private String _clusterConnectionStringField = null;
    private KafkaAuditHeader.ChangeListener __changeListener = new KafkaAuditHeader.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Time = SCHEMA.getField("time");
    private final static RecordDataSchema.Field FIELD_Server = SCHEMA.getField("server");
    private final static RecordDataSchema.Field FIELD_Instance = SCHEMA.getField("instance");
    private final static RecordDataSchema.Field FIELD_AppName = SCHEMA.getField("appName");
    private final static RecordDataSchema.Field FIELD_MessageId = SCHEMA.getField("messageId");
    private final static RecordDataSchema.Field FIELD_AuditVersion = SCHEMA.getField("auditVersion");
    private final static RecordDataSchema.Field FIELD_FabricUrn = SCHEMA.getField("fabricUrn");
    private final static RecordDataSchema.Field FIELD_ClusterConnectionString = SCHEMA.getField("clusterConnectionString");

    public KafkaAuditHeader() {
        super(new DataMap(11, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public KafkaAuditHeader(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static KafkaAuditHeader.Fields fields() {
        return _fields;
    }

    public static KafkaAuditHeader.ProjectionMask createMask() {
        return new KafkaAuditHeader.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for time
     * 
     * @see KafkaAuditHeader.Fields#time
     */
    public boolean hasTime() {
        if (_timeField!= null) {
            return true;
        }
        return super._map.containsKey("time");
    }

    /**
     * Remover for time
     * 
     * @see KafkaAuditHeader.Fields#time
     */
    public void removeTime() {
        super._map.remove("time");
    }

    /**
     * Getter for time
     * 
     * @see KafkaAuditHeader.Fields#time
     */
    @Nullable
    public Long getTime(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTime();
            case DEFAULT:
            case NULL:
                if (_timeField!= null) {
                    return _timeField;
                } else {
                    Object __rawValue = super._map.get("time");
                    _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for time
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KafkaAuditHeader.Fields#time
     */
    @Nonnull
    public Long getTime() {
        if (_timeField!= null) {
            return _timeField;
        } else {
            Object __rawValue = super._map.get("time");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("time");
            }
            _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timeField;
        }
    }

    /**
     * Setter for time
     * 
     * @see KafkaAuditHeader.Fields#time
     */
    public KafkaAuditHeader setTime(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTime(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field time of com.linkedin.avro2pegasus.events.KafkaAuditHeader");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTime();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#time
     */
    public KafkaAuditHeader setTime(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field time of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
            _timeField = value;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @see KafkaAuditHeader.Fields#time
     */
    public KafkaAuditHeader setTime(long value) {
        CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
        _timeField = value;
        return this;
    }

    /**
     * Existence checker for server
     * 
     * @see KafkaAuditHeader.Fields#server
     */
    public boolean hasServer() {
        if (_serverField!= null) {
            return true;
        }
        return super._map.containsKey("server");
    }

    /**
     * Remover for server
     * 
     * @see KafkaAuditHeader.Fields#server
     */
    public void removeServer() {
        super._map.remove("server");
    }

    /**
     * Getter for server
     * 
     * @see KafkaAuditHeader.Fields#server
     */
    @Nullable
    public String getServer(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getServer();
            case DEFAULT:
            case NULL:
                if (_serverField!= null) {
                    return _serverField;
                } else {
                    Object __rawValue = super._map.get("server");
                    _serverField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _serverField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for server
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KafkaAuditHeader.Fields#server
     */
    @Nonnull
    public String getServer() {
        if (_serverField!= null) {
            return _serverField;
        } else {
            Object __rawValue = super._map.get("server");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("server");
            }
            _serverField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _serverField;
        }
    }

    /**
     * Setter for server
     * 
     * @see KafkaAuditHeader.Fields#server
     */
    public KafkaAuditHeader setServer(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setServer(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field server of com.linkedin.avro2pegasus.events.KafkaAuditHeader");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "server", value);
                    _serverField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeServer();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "server", value);
                    _serverField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "server", value);
                    _serverField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for server
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#server
     */
    public KafkaAuditHeader setServer(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field server of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "server", value);
            _serverField = value;
        }
        return this;
    }

    /**
     * Existence checker for instance
     * 
     * @see KafkaAuditHeader.Fields#instance
     */
    public boolean hasInstance() {
        if (_instanceField!= null) {
            return true;
        }
        return super._map.containsKey("instance");
    }

    /**
     * Remover for instance
     * 
     * @see KafkaAuditHeader.Fields#instance
     */
    public void removeInstance() {
        super._map.remove("instance");
    }

    /**
     * Getter for instance
     * 
     * @see KafkaAuditHeader.Fields#instance
     */
    @Nullable
    public String getInstance(GetMode mode) {
        return getInstance();
    }

    /**
     * Getter for instance
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaAuditHeader.Fields#instance
     */
    @Nullable
    public String getInstance() {
        if (_instanceField!= null) {
            return _instanceField;
        } else {
            Object __rawValue = super._map.get("instance");
            _instanceField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _instanceField;
        }
    }

    /**
     * Setter for instance
     * 
     * @see KafkaAuditHeader.Fields#instance
     */
    public KafkaAuditHeader setInstance(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInstance(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInstance();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "instance", value);
                    _instanceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "instance", value);
                    _instanceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for instance
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#instance
     */
    public KafkaAuditHeader setInstance(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field instance of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "instance", value);
            _instanceField = value;
        }
        return this;
    }

    /**
     * Existence checker for appName
     * 
     * @see KafkaAuditHeader.Fields#appName
     */
    public boolean hasAppName() {
        if (_appNameField!= null) {
            return true;
        }
        return super._map.containsKey("appName");
    }

    /**
     * Remover for appName
     * 
     * @see KafkaAuditHeader.Fields#appName
     */
    public void removeAppName() {
        super._map.remove("appName");
    }

    /**
     * Getter for appName
     * 
     * @see KafkaAuditHeader.Fields#appName
     */
    @Nullable
    public String getAppName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAppName();
            case DEFAULT:
            case NULL:
                if (_appNameField!= null) {
                    return _appNameField;
                } else {
                    Object __rawValue = super._map.get("appName");
                    _appNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _appNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for appName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KafkaAuditHeader.Fields#appName
     */
    @Nonnull
    public String getAppName() {
        if (_appNameField!= null) {
            return _appNameField;
        } else {
            Object __rawValue = super._map.get("appName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("appName");
            }
            _appNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _appNameField;
        }
    }

    /**
     * Setter for appName
     * 
     * @see KafkaAuditHeader.Fields#appName
     */
    public KafkaAuditHeader setAppName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAppName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field appName of com.linkedin.avro2pegasus.events.KafkaAuditHeader");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "appName", value);
                    _appNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAppName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "appName", value);
                    _appNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "appName", value);
                    _appNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for appName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#appName
     */
    public KafkaAuditHeader setAppName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field appName of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "appName", value);
            _appNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for messageId
     * 
     * @see KafkaAuditHeader.Fields#messageId
     */
    public boolean hasMessageId() {
        if (_messageIdField!= null) {
            return true;
        }
        return super._map.containsKey("messageId");
    }

    /**
     * Remover for messageId
     * 
     * @see KafkaAuditHeader.Fields#messageId
     */
    public void removeMessageId() {
        super._map.remove("messageId");
    }

    /**
     * Getter for messageId
     * 
     * @see KafkaAuditHeader.Fields#messageId
     */
    @Nullable
    public UUID getMessageId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMessageId();
            case DEFAULT:
            case NULL:
                if (_messageIdField!= null) {
                    return _messageIdField;
                } else {
                    Object __rawValue = super._map.get("messageId");
                    _messageIdField = ((__rawValue == null)?null:new UUID(__rawValue));
                    return _messageIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for messageId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KafkaAuditHeader.Fields#messageId
     */
    @Nonnull
    public UUID getMessageId() {
        if (_messageIdField!= null) {
            return _messageIdField;
        } else {
            Object __rawValue = super._map.get("messageId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("messageId");
            }
            _messageIdField = ((__rawValue == null)?null:new UUID(__rawValue));
            return _messageIdField;
        }
    }

    /**
     * Setter for messageId
     * 
     * @see KafkaAuditHeader.Fields#messageId
     */
    public KafkaAuditHeader setMessageId(
        @Nullable
        UUID value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMessageId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field messageId of com.linkedin.avro2pegasus.events.KafkaAuditHeader");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "messageId", value.data());
                    _messageIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMessageId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "messageId", value.data());
                    _messageIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "messageId", value.data());
                    _messageIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for messageId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#messageId
     */
    public KafkaAuditHeader setMessageId(
        @Nonnull
        UUID value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field messageId of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "messageId", value.data());
            _messageIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for auditVersion
     * 
     * @see KafkaAuditHeader.Fields#auditVersion
     */
    public boolean hasAuditVersion() {
        if (_auditVersionField!= null) {
            return true;
        }
        return super._map.containsKey("auditVersion");
    }

    /**
     * Remover for auditVersion
     * 
     * @see KafkaAuditHeader.Fields#auditVersion
     */
    public void removeAuditVersion() {
        super._map.remove("auditVersion");
    }

    /**
     * Getter for auditVersion
     * 
     * @see KafkaAuditHeader.Fields#auditVersion
     */
    @Nullable
    public Integer getAuditVersion(GetMode mode) {
        return getAuditVersion();
    }

    /**
     * Getter for auditVersion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaAuditHeader.Fields#auditVersion
     */
    @Nullable
    public Integer getAuditVersion() {
        if (_auditVersionField!= null) {
            return _auditVersionField;
        } else {
            Object __rawValue = super._map.get("auditVersion");
            _auditVersionField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _auditVersionField;
        }
    }

    /**
     * Setter for auditVersion
     * 
     * @see KafkaAuditHeader.Fields#auditVersion
     */
    public KafkaAuditHeader setAuditVersion(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAuditVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAuditVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "auditVersion", DataTemplateUtil.coerceIntInput(value));
                    _auditVersionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "auditVersion", DataTemplateUtil.coerceIntInput(value));
                    _auditVersionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for auditVersion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#auditVersion
     */
    public KafkaAuditHeader setAuditVersion(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditVersion of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditVersion", DataTemplateUtil.coerceIntInput(value));
            _auditVersionField = value;
        }
        return this;
    }

    /**
     * Setter for auditVersion
     * 
     * @see KafkaAuditHeader.Fields#auditVersion
     */
    public KafkaAuditHeader setAuditVersion(int value) {
        CheckedUtil.putWithoutChecking(super._map, "auditVersion", DataTemplateUtil.coerceIntInput(value));
        _auditVersionField = value;
        return this;
    }

    /**
     * Existence checker for fabricUrn
     * 
     * @see KafkaAuditHeader.Fields#fabricUrn
     */
    public boolean hasFabricUrn() {
        if (_fabricUrnField!= null) {
            return true;
        }
        return super._map.containsKey("fabricUrn");
    }

    /**
     * Remover for fabricUrn
     * 
     * @see KafkaAuditHeader.Fields#fabricUrn
     */
    public void removeFabricUrn() {
        super._map.remove("fabricUrn");
    }

    /**
     * Getter for fabricUrn
     * 
     * @see KafkaAuditHeader.Fields#fabricUrn
     */
    @Nullable
    public String getFabricUrn(GetMode mode) {
        return getFabricUrn();
    }

    /**
     * Getter for fabricUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaAuditHeader.Fields#fabricUrn
     */
    @Nullable
    public String getFabricUrn() {
        if (_fabricUrnField!= null) {
            return _fabricUrnField;
        } else {
            Object __rawValue = super._map.get("fabricUrn");
            _fabricUrnField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fabricUrnField;
        }
    }

    /**
     * Setter for fabricUrn
     * 
     * @see KafkaAuditHeader.Fields#fabricUrn
     */
    public KafkaAuditHeader setFabricUrn(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFabricUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFabricUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fabricUrn", value);
                    _fabricUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fabricUrn", value);
                    _fabricUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fabricUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#fabricUrn
     */
    public KafkaAuditHeader setFabricUrn(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fabricUrn of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fabricUrn", value);
            _fabricUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for clusterConnectionString
     * 
     * @see KafkaAuditHeader.Fields#clusterConnectionString
     */
    public boolean hasClusterConnectionString() {
        if (_clusterConnectionStringField!= null) {
            return true;
        }
        return super._map.containsKey("clusterConnectionString");
    }

    /**
     * Remover for clusterConnectionString
     * 
     * @see KafkaAuditHeader.Fields#clusterConnectionString
     */
    public void removeClusterConnectionString() {
        super._map.remove("clusterConnectionString");
    }

    /**
     * Getter for clusterConnectionString
     * 
     * @see KafkaAuditHeader.Fields#clusterConnectionString
     */
    @Nullable
    public String getClusterConnectionString(GetMode mode) {
        return getClusterConnectionString();
    }

    /**
     * Getter for clusterConnectionString
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaAuditHeader.Fields#clusterConnectionString
     */
    @Nullable
    public String getClusterConnectionString() {
        if (_clusterConnectionStringField!= null) {
            return _clusterConnectionStringField;
        } else {
            Object __rawValue = super._map.get("clusterConnectionString");
            _clusterConnectionStringField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _clusterConnectionStringField;
        }
    }

    /**
     * Setter for clusterConnectionString
     * 
     * @see KafkaAuditHeader.Fields#clusterConnectionString
     */
    public KafkaAuditHeader setClusterConnectionString(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setClusterConnectionString(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeClusterConnectionString();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clusterConnectionString", value);
                    _clusterConnectionStringField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "clusterConnectionString", value);
                    _clusterConnectionStringField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for clusterConnectionString
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaAuditHeader.Fields#clusterConnectionString
     */
    public KafkaAuditHeader setClusterConnectionString(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field clusterConnectionString of com.linkedin.avro2pegasus.events.KafkaAuditHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "clusterConnectionString", value);
            _clusterConnectionStringField = value;
        }
        return this;
    }

    @Override
    public KafkaAuditHeader clone()
        throws CloneNotSupportedException
    {
        KafkaAuditHeader __clone = ((KafkaAuditHeader) super.clone());
        __clone.__changeListener = new KafkaAuditHeader.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public KafkaAuditHeader copy()
        throws CloneNotSupportedException
    {
        KafkaAuditHeader __copy = ((KafkaAuditHeader) super.copy());
        __copy._auditVersionField = null;
        __copy._serverField = null;
        __copy._instanceField = null;
        __copy._appNameField = null;
        __copy._clusterConnectionStringField = null;
        __copy._messageIdField = null;
        __copy._timeField = null;
        __copy._fabricUrnField = null;
        __copy.__changeListener = new KafkaAuditHeader.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final KafkaAuditHeader __objectRef;

        private ChangeListener(KafkaAuditHeader reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "auditVersion":
                    __objectRef._auditVersionField = null;
                    break;
                case "server":
                    __objectRef._serverField = null;
                    break;
                case "instance":
                    __objectRef._instanceField = null;
                    break;
                case "appName":
                    __objectRef._appNameField = null;
                    break;
                case "clusterConnectionString":
                    __objectRef._clusterConnectionStringField = null;
                    break;
                case "messageId":
                    __objectRef._messageIdField = null;
                    break;
                case "time":
                    __objectRef._timeField = null;
                    break;
                case "fabricUrn":
                    __objectRef._fabricUrnField = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * The time at which the event was emitted into kafka.
         * 
         */
        public PathSpec time() {
            return new PathSpec(getPathComponents(), "time");
        }

        /**
         * The fully qualified name of the host from which the event is being emitted.
         * 
         */
        public PathSpec server() {
            return new PathSpec(getPathComponents(), "server");
        }

        /**
         * The instance on the server from which the event is being emitted. e.g. i001
         * 
         */
        public PathSpec instance() {
            return new PathSpec(getPathComponents(), "instance");
        }

        /**
         * The name of the application from which the event is being emitted. see go/appname
         * 
         */
        public PathSpec appName() {
            return new PathSpec(getPathComponents(), "appName");
        }

        /**
         * A unique identifier for the message
         * 
         */
        public PathSpec messageId() {
            return new PathSpec(getPathComponents(), "messageId");
        }

        /**
         * The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing
         * 
         */
        public PathSpec auditVersion() {
            return new PathSpec(getPathComponents(), "auditVersion");
        }

        /**
         * The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.
         * 
         */
        public PathSpec fabricUrn() {
            return new PathSpec(getPathComponents(), "fabricUrn");
        }

        /**
         * This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.
         * 
         */
        public PathSpec clusterConnectionString() {
            return new PathSpec(getPathComponents(), "clusterConnectionString");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(11);
        }

        /**
         * The time at which the event was emitted into kafka.
         * 
         */
        public KafkaAuditHeader.ProjectionMask withTime() {
            getDataMap().put("time", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The fully qualified name of the host from which the event is being emitted.
         * 
         */
        public KafkaAuditHeader.ProjectionMask withServer() {
            getDataMap().put("server", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The instance on the server from which the event is being emitted. e.g. i001
         * 
         */
        public KafkaAuditHeader.ProjectionMask withInstance() {
            getDataMap().put("instance", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The name of the application from which the event is being emitted. see go/appname
         * 
         */
        public KafkaAuditHeader.ProjectionMask withAppName() {
            getDataMap().put("appName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A unique identifier for the message
         * 
         */
        public KafkaAuditHeader.ProjectionMask withMessageId() {
            getDataMap().put("messageId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing
         * 
         */
        public KafkaAuditHeader.ProjectionMask withAuditVersion() {
            getDataMap().put("auditVersion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.
         * 
         */
        public KafkaAuditHeader.ProjectionMask withFabricUrn() {
            getDataMap().put("fabricUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.
         * 
         */
        public KafkaAuditHeader.ProjectionMask withClusterConnectionString() {
            getDataMap().put("clusterConnectionString", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
