
package com.linkedin.dataplatforminstance;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.FabricType;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * An Iceberg warehouse location and credentails whose read/writes are governed by datahub catalog.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataplatforminstance/IcebergWarehouseInfo.pdl.")
public class IcebergWarehouseInfo
    extends RecordTemplate
{

    private final static IcebergWarehouseInfo.Fields _fields = new IcebergWarehouseInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataplatforminstance/**An Iceberg warehouse location and credentails whose read/writes are governed by datahub catalog.*/@Aspect.name=\"icebergWarehouseInfo\"record IcebergWarehouseInfo{/**Path of the root for the backing store of the tables in the warehouse.*/dataRoot:string/**clientId to be used to authenticate with storage hosting this warehouse*/clientId:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**client secret to authenticate with storage hosting this warehouse*/clientSecret:com.linkedin.common.Urn/**region where the warehouse is located.*/region:string,role:optional string,tempCredentialExpirationSeconds:optional int,env:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}", SchemaFormatType.PDL));
    private String _dataRootField = null;
    private com.linkedin.common.urn.Urn _clientIdField = null;
    private com.linkedin.common.urn.Urn _clientSecretField = null;
    private String _regionField = null;
    private String _roleField = null;
    private Integer _tempCredentialExpirationSecondsField = null;
    private FabricType _envField = null;
    private IcebergWarehouseInfo.ChangeListener __changeListener = new IcebergWarehouseInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DataRoot = SCHEMA.getField("dataRoot");
    private final static RecordDataSchema.Field FIELD_ClientId = SCHEMA.getField("clientId");
    private final static RecordDataSchema.Field FIELD_ClientSecret = SCHEMA.getField("clientSecret");
    private final static RecordDataSchema.Field FIELD_Region = SCHEMA.getField("region");
    private final static RecordDataSchema.Field FIELD_Role = SCHEMA.getField("role");
    private final static RecordDataSchema.Field FIELD_TempCredentialExpirationSeconds = SCHEMA.getField("tempCredentialExpirationSeconds");
    private final static RecordDataSchema.Field FIELD_Env = SCHEMA.getField("env");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public IcebergWarehouseInfo() {
        super(new DataMap(10, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IcebergWarehouseInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IcebergWarehouseInfo.Fields fields() {
        return _fields;
    }

    public static IcebergWarehouseInfo.ProjectionMask createMask() {
        return new IcebergWarehouseInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for dataRoot
     * 
     * @see IcebergWarehouseInfo.Fields#dataRoot
     */
    public boolean hasDataRoot() {
        if (_dataRootField!= null) {
            return true;
        }
        return super._map.containsKey("dataRoot");
    }

    /**
     * Remover for dataRoot
     * 
     * @see IcebergWarehouseInfo.Fields#dataRoot
     */
    public void removeDataRoot() {
        super._map.remove("dataRoot");
    }

    /**
     * Getter for dataRoot
     * 
     * @see IcebergWarehouseInfo.Fields#dataRoot
     */
    @Nullable
    public String getDataRoot(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDataRoot();
            case DEFAULT:
            case NULL:
                if (_dataRootField!= null) {
                    return _dataRootField;
                } else {
                    Object __rawValue = super._map.get("dataRoot");
                    _dataRootField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _dataRootField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for dataRoot
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IcebergWarehouseInfo.Fields#dataRoot
     */
    @Nonnull
    public String getDataRoot() {
        if (_dataRootField!= null) {
            return _dataRootField;
        } else {
            Object __rawValue = super._map.get("dataRoot");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("dataRoot");
            }
            _dataRootField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _dataRootField;
        }
    }

    /**
     * Setter for dataRoot
     * 
     * @see IcebergWarehouseInfo.Fields#dataRoot
     */
    public IcebergWarehouseInfo setDataRoot(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDataRoot(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dataRoot of com.linkedin.dataplatforminstance.IcebergWarehouseInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataRoot", value);
                    _dataRootField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDataRoot();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataRoot", value);
                    _dataRootField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dataRoot", value);
                    _dataRootField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dataRoot
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergWarehouseInfo.Fields#dataRoot
     */
    public IcebergWarehouseInfo setDataRoot(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dataRoot of com.linkedin.dataplatforminstance.IcebergWarehouseInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dataRoot", value);
            _dataRootField = value;
        }
        return this;
    }

    /**
     * Existence checker for clientId
     * 
     * @see IcebergWarehouseInfo.Fields#clientId
     */
    public boolean hasClientId() {
        if (_clientIdField!= null) {
            return true;
        }
        return super._map.containsKey("clientId");
    }

    /**
     * Remover for clientId
     * 
     * @see IcebergWarehouseInfo.Fields#clientId
     */
    public void removeClientId() {
        super._map.remove("clientId");
    }

    /**
     * Getter for clientId
     * 
     * @see IcebergWarehouseInfo.Fields#clientId
     */
    @Nullable
    public com.linkedin.common.urn.Urn getClientId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getClientId();
            case DEFAULT:
            case NULL:
                if (_clientIdField!= null) {
                    return _clientIdField;
                } else {
                    Object __rawValue = super._map.get("clientId");
                    _clientIdField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _clientIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for clientId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IcebergWarehouseInfo.Fields#clientId
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getClientId() {
        if (_clientIdField!= null) {
            return _clientIdField;
        } else {
            Object __rawValue = super._map.get("clientId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("clientId");
            }
            _clientIdField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _clientIdField;
        }
    }

    /**
     * Setter for clientId
     * 
     * @see IcebergWarehouseInfo.Fields#clientId
     */
    public IcebergWarehouseInfo setClientId(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setClientId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field clientId of com.linkedin.dataplatforminstance.IcebergWarehouseInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _clientIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeClientId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _clientIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _clientIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for clientId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergWarehouseInfo.Fields#clientId
     */
    public IcebergWarehouseInfo setClientId(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field clientId of com.linkedin.dataplatforminstance.IcebergWarehouseInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "clientId", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _clientIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for clientSecret
     * 
     * @see IcebergWarehouseInfo.Fields#clientSecret
     */
    public boolean hasClientSecret() {
        if (_clientSecretField!= null) {
            return true;
        }
        return super._map.containsKey("clientSecret");
    }

    /**
     * Remover for clientSecret
     * 
     * @see IcebergWarehouseInfo.Fields#clientSecret
     */
    public void removeClientSecret() {
        super._map.remove("clientSecret");
    }

    /**
     * Getter for clientSecret
     * 
     * @see IcebergWarehouseInfo.Fields#clientSecret
     */
    @Nullable
    public com.linkedin.common.urn.Urn getClientSecret(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getClientSecret();
            case DEFAULT:
            case NULL:
                if (_clientSecretField!= null) {
                    return _clientSecretField;
                } else {
                    Object __rawValue = super._map.get("clientSecret");
                    _clientSecretField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _clientSecretField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for clientSecret
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IcebergWarehouseInfo.Fields#clientSecret
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getClientSecret() {
        if (_clientSecretField!= null) {
            return _clientSecretField;
        } else {
            Object __rawValue = super._map.get("clientSecret");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("clientSecret");
            }
            _clientSecretField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _clientSecretField;
        }
    }

    /**
     * Setter for clientSecret
     * 
     * @see IcebergWarehouseInfo.Fields#clientSecret
     */
    public IcebergWarehouseInfo setClientSecret(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setClientSecret(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field clientSecret of com.linkedin.dataplatforminstance.IcebergWarehouseInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientSecret", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _clientSecretField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeClientSecret();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientSecret", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _clientSecretField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "clientSecret", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _clientSecretField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for clientSecret
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergWarehouseInfo.Fields#clientSecret
     */
    public IcebergWarehouseInfo setClientSecret(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field clientSecret of com.linkedin.dataplatforminstance.IcebergWarehouseInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "clientSecret", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _clientSecretField = value;
        }
        return this;
    }

    /**
     * Existence checker for region
     * 
     * @see IcebergWarehouseInfo.Fields#region
     */
    public boolean hasRegion() {
        if (_regionField!= null) {
            return true;
        }
        return super._map.containsKey("region");
    }

    /**
     * Remover for region
     * 
     * @see IcebergWarehouseInfo.Fields#region
     */
    public void removeRegion() {
        super._map.remove("region");
    }

    /**
     * Getter for region
     * 
     * @see IcebergWarehouseInfo.Fields#region
     */
    @Nullable
    public String getRegion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRegion();
            case DEFAULT:
            case NULL:
                if (_regionField!= null) {
                    return _regionField;
                } else {
                    Object __rawValue = super._map.get("region");
                    _regionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _regionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for region
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IcebergWarehouseInfo.Fields#region
     */
    @Nonnull
    public String getRegion() {
        if (_regionField!= null) {
            return _regionField;
        } else {
            Object __rawValue = super._map.get("region");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("region");
            }
            _regionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _regionField;
        }
    }

    /**
     * Setter for region
     * 
     * @see IcebergWarehouseInfo.Fields#region
     */
    public IcebergWarehouseInfo setRegion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRegion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field region of com.linkedin.dataplatforminstance.IcebergWarehouseInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "region", value);
                    _regionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRegion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "region", value);
                    _regionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "region", value);
                    _regionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for region
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergWarehouseInfo.Fields#region
     */
    public IcebergWarehouseInfo setRegion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field region of com.linkedin.dataplatforminstance.IcebergWarehouseInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "region", value);
            _regionField = value;
        }
        return this;
    }

    /**
     * Existence checker for role
     * 
     * @see IcebergWarehouseInfo.Fields#role
     */
    public boolean hasRole() {
        if (_roleField!= null) {
            return true;
        }
        return super._map.containsKey("role");
    }

    /**
     * Remover for role
     * 
     * @see IcebergWarehouseInfo.Fields#role
     */
    public void removeRole() {
        super._map.remove("role");
    }

    /**
     * Getter for role
     * 
     * @see IcebergWarehouseInfo.Fields#role
     */
    @Nullable
    public String getRole(GetMode mode) {
        return getRole();
    }

    /**
     * Getter for role
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IcebergWarehouseInfo.Fields#role
     */
    @Nullable
    public String getRole() {
        if (_roleField!= null) {
            return _roleField;
        } else {
            Object __rawValue = super._map.get("role");
            _roleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _roleField;
        }
    }

    /**
     * Setter for role
     * 
     * @see IcebergWarehouseInfo.Fields#role
     */
    public IcebergWarehouseInfo setRole(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRole(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRole();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "role", value);
                    _roleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "role", value);
                    _roleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for role
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergWarehouseInfo.Fields#role
     */
    public IcebergWarehouseInfo setRole(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field role of com.linkedin.dataplatforminstance.IcebergWarehouseInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "role", value);
            _roleField = value;
        }
        return this;
    }

    /**
     * Existence checker for tempCredentialExpirationSeconds
     * 
     * @see IcebergWarehouseInfo.Fields#tempCredentialExpirationSeconds
     */
    public boolean hasTempCredentialExpirationSeconds() {
        if (_tempCredentialExpirationSecondsField!= null) {
            return true;
        }
        return super._map.containsKey("tempCredentialExpirationSeconds");
    }

    /**
     * Remover for tempCredentialExpirationSeconds
     * 
     * @see IcebergWarehouseInfo.Fields#tempCredentialExpirationSeconds
     */
    public void removeTempCredentialExpirationSeconds() {
        super._map.remove("tempCredentialExpirationSeconds");
    }

    /**
     * Getter for tempCredentialExpirationSeconds
     * 
     * @see IcebergWarehouseInfo.Fields#tempCredentialExpirationSeconds
     */
    @Nullable
    public Integer getTempCredentialExpirationSeconds(GetMode mode) {
        return getTempCredentialExpirationSeconds();
    }

    /**
     * Getter for tempCredentialExpirationSeconds
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IcebergWarehouseInfo.Fields#tempCredentialExpirationSeconds
     */
    @Nullable
    public Integer getTempCredentialExpirationSeconds() {
        if (_tempCredentialExpirationSecondsField!= null) {
            return _tempCredentialExpirationSecondsField;
        } else {
            Object __rawValue = super._map.get("tempCredentialExpirationSeconds");
            _tempCredentialExpirationSecondsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _tempCredentialExpirationSecondsField;
        }
    }

    /**
     * Setter for tempCredentialExpirationSeconds
     * 
     * @see IcebergWarehouseInfo.Fields#tempCredentialExpirationSeconds
     */
    public IcebergWarehouseInfo setTempCredentialExpirationSeconds(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTempCredentialExpirationSeconds(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTempCredentialExpirationSeconds();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tempCredentialExpirationSeconds", DataTemplateUtil.coerceIntInput(value));
                    _tempCredentialExpirationSecondsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "tempCredentialExpirationSeconds", DataTemplateUtil.coerceIntInput(value));
                    _tempCredentialExpirationSecondsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for tempCredentialExpirationSeconds
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergWarehouseInfo.Fields#tempCredentialExpirationSeconds
     */
    public IcebergWarehouseInfo setTempCredentialExpirationSeconds(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tempCredentialExpirationSeconds of com.linkedin.dataplatforminstance.IcebergWarehouseInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tempCredentialExpirationSeconds", DataTemplateUtil.coerceIntInput(value));
            _tempCredentialExpirationSecondsField = value;
        }
        return this;
    }

    /**
     * Setter for tempCredentialExpirationSeconds
     * 
     * @see IcebergWarehouseInfo.Fields#tempCredentialExpirationSeconds
     */
    public IcebergWarehouseInfo setTempCredentialExpirationSeconds(int value) {
        CheckedUtil.putWithoutChecking(super._map, "tempCredentialExpirationSeconds", DataTemplateUtil.coerceIntInput(value));
        _tempCredentialExpirationSecondsField = value;
        return this;
    }

    /**
     * Existence checker for env
     * 
     * @see IcebergWarehouseInfo.Fields#env
     */
    public boolean hasEnv() {
        if (_envField!= null) {
            return true;
        }
        return super._map.containsKey("env");
    }

    /**
     * Remover for env
     * 
     * @see IcebergWarehouseInfo.Fields#env
     */
    public void removeEnv() {
        super._map.remove("env");
    }

    /**
     * Getter for env
     * 
     * @see IcebergWarehouseInfo.Fields#env
     */
    @Nullable
    public FabricType getEnv(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEnv();
            case DEFAULT:
            case NULL:
                if (_envField!= null) {
                    return _envField;
                } else {
                    Object __rawValue = super._map.get("env");
                    _envField = DataTemplateUtil.coerceEnumOutput(__rawValue, FabricType.class, FabricType.$UNKNOWN);
                    return _envField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for env
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IcebergWarehouseInfo.Fields#env
     */
    @Nonnull
    public FabricType getEnv() {
        if (_envField!= null) {
            return _envField;
        } else {
            Object __rawValue = super._map.get("env");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("env");
            }
            _envField = DataTemplateUtil.coerceEnumOutput(__rawValue, FabricType.class, FabricType.$UNKNOWN);
            return _envField;
        }
    }

    /**
     * Setter for env
     * 
     * @see IcebergWarehouseInfo.Fields#env
     */
    public IcebergWarehouseInfo setEnv(
        @Nullable
        FabricType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnv(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field env of com.linkedin.dataplatforminstance.IcebergWarehouseInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "env", value.name());
                    _envField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEnv();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "env", value.name());
                    _envField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "env", value.name());
                    _envField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for env
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergWarehouseInfo.Fields#env
     */
    public IcebergWarehouseInfo setEnv(
        @Nonnull
        FabricType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field env of com.linkedin.dataplatforminstance.IcebergWarehouseInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "env", value.name());
            _envField = value;
        }
        return this;
    }

    @Override
    public IcebergWarehouseInfo clone()
        throws CloneNotSupportedException
    {
        IcebergWarehouseInfo __clone = ((IcebergWarehouseInfo) super.clone());
        __clone.__changeListener = new IcebergWarehouseInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IcebergWarehouseInfo copy()
        throws CloneNotSupportedException
    {
        IcebergWarehouseInfo __copy = ((IcebergWarehouseInfo) super.copy());
        __copy._clientIdField = null;
        __copy._roleField = null;
        __copy._clientSecretField = null;
        __copy._regionField = null;
        __copy._envField = null;
        __copy._dataRootField = null;
        __copy._tempCredentialExpirationSecondsField = null;
        __copy.__changeListener = new IcebergWarehouseInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IcebergWarehouseInfo __objectRef;

        private ChangeListener(IcebergWarehouseInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "clientId":
                    __objectRef._clientIdField = null;
                    break;
                case "role":
                    __objectRef._roleField = null;
                    break;
                case "clientSecret":
                    __objectRef._clientSecretField = null;
                    break;
                case "region":
                    __objectRef._regionField = null;
                    break;
                case "env":
                    __objectRef._envField = null;
                    break;
                case "dataRoot":
                    __objectRef._dataRootField = null;
                    break;
                case "tempCredentialExpirationSeconds":
                    __objectRef._tempCredentialExpirationSecondsField = null;
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
         * Path of the root for the backing store of the tables in the warehouse.
         * 
         */
        public PathSpec dataRoot() {
            return new PathSpec(getPathComponents(), "dataRoot");
        }

        /**
         * clientId to be used to authenticate with storage hosting this warehouse
         * 
         */
        public PathSpec clientId() {
            return new PathSpec(getPathComponents(), "clientId");
        }

        /**
         * client secret to authenticate with storage hosting this warehouse
         * 
         */
        public PathSpec clientSecret() {
            return new PathSpec(getPathComponents(), "clientSecret");
        }

        /**
         * region where the warehouse is located.
         * 
         */
        public PathSpec region() {
            return new PathSpec(getPathComponents(), "region");
        }

        public PathSpec role() {
            return new PathSpec(getPathComponents(), "role");
        }

        public PathSpec tempCredentialExpirationSeconds() {
            return new PathSpec(getPathComponents(), "tempCredentialExpirationSeconds");
        }

        public PathSpec env() {
            return new PathSpec(getPathComponents(), "env");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(10);
        }

        /**
         * Path of the root for the backing store of the tables in the warehouse.
         * 
         */
        public IcebergWarehouseInfo.ProjectionMask withDataRoot() {
            getDataMap().put("dataRoot", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * clientId to be used to authenticate with storage hosting this warehouse
         * 
         */
        public IcebergWarehouseInfo.ProjectionMask withClientId() {
            getDataMap().put("clientId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * client secret to authenticate with storage hosting this warehouse
         * 
         */
        public IcebergWarehouseInfo.ProjectionMask withClientSecret() {
            getDataMap().put("clientSecret", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * region where the warehouse is located.
         * 
         */
        public IcebergWarehouseInfo.ProjectionMask withRegion() {
            getDataMap().put("region", MaskMap.POSITIVE_MASK);
            return this;
        }

        public IcebergWarehouseInfo.ProjectionMask withRole() {
            getDataMap().put("role", MaskMap.POSITIVE_MASK);
            return this;
        }

        public IcebergWarehouseInfo.ProjectionMask withTempCredentialExpirationSeconds() {
            getDataMap().put("tempCredentialExpirationSeconds", MaskMap.POSITIVE_MASK);
            return this;
        }

        public IcebergWarehouseInfo.ProjectionMask withEnv() {
            getDataMap().put("env", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
