
package com.linkedin.dataproduct;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
import com.linkedin.data.template.StringMap;


/**
 * Represents an association of assets to a Data Product.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataproduct/DataProductAssociation.pdl.")
public class DataProductAssociation
    extends RecordTemplate
{

    private final static DataProductAssociation.Fields _fields = new DataProductAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataproduct/**Represents an association of assets to a Data Product.\n*/record DataProductAssociation includes{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}{/**If set to true, this asset is an output port of the Data Product.*/outputPort:boolean=false}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _sourceUrnField = null;
    private com.linkedin.common.urn.Urn _destinationUrnField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private StringMap _propertiesField = null;
    private Boolean _outputPortField = null;
    private DataProductAssociation.ChangeListener __changeListener = new DataProductAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SourceUrn = SCHEMA.getField("sourceUrn");
    private final static RecordDataSchema.Field FIELD_DestinationUrn = SCHEMA.getField("destinationUrn");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Properties = SCHEMA.getField("properties");
    private final static RecordDataSchema.Field FIELD_OutputPort = SCHEMA.getField("outputPort");
    private final static Boolean DEFAULT_OutputPort;

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_OutputPort = DataTemplateUtil.coerceBooleanOutput(FIELD_OutputPort.getDefault());
    }

    public DataProductAssociation() {
        super(new DataMap(8, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public DataProductAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataProductAssociation.Fields fields() {
        return _fields;
    }

    public static DataProductAssociation.ProjectionMask createMask() {
        return new DataProductAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for sourceUrn
     * 
     * @see DataProductAssociation.Fields#sourceUrn
     */
    public boolean hasSourceUrn() {
        if (_sourceUrnField!= null) {
            return true;
        }
        return super._map.containsKey("sourceUrn");
    }

    /**
     * Remover for sourceUrn
     * 
     * @see DataProductAssociation.Fields#sourceUrn
     */
    public void removeSourceUrn() {
        super._map.remove("sourceUrn");
    }

    /**
     * Getter for sourceUrn
     * 
     * @see DataProductAssociation.Fields#sourceUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSourceUrn(GetMode mode) {
        return getSourceUrn();
    }

    /**
     * Getter for sourceUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProductAssociation.Fields#sourceUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSourceUrn() {
        if (_sourceUrnField!= null) {
            return _sourceUrnField;
        } else {
            Object __rawValue = super._map.get("sourceUrn");
            _sourceUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _sourceUrnField;
        }
    }

    /**
     * Setter for sourceUrn
     * 
     * @see DataProductAssociation.Fields#sourceUrn
     */
    public DataProductAssociation setSourceUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProductAssociation.Fields#sourceUrn
     */
    public DataProductAssociation setSourceUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceUrn of com.linkedin.dataproduct.DataProductAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _sourceUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for destinationUrn
     * 
     * @see DataProductAssociation.Fields#destinationUrn
     */
    public boolean hasDestinationUrn() {
        if (_destinationUrnField!= null) {
            return true;
        }
        return super._map.containsKey("destinationUrn");
    }

    /**
     * Remover for destinationUrn
     * 
     * @see DataProductAssociation.Fields#destinationUrn
     */
    public void removeDestinationUrn() {
        super._map.remove("destinationUrn");
    }

    /**
     * Getter for destinationUrn
     * 
     * @see DataProductAssociation.Fields#destinationUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getDestinationUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDestinationUrn();
            case DEFAULT:
            case NULL:
                if (_destinationUrnField!= null) {
                    return _destinationUrnField;
                } else {
                    Object __rawValue = super._map.get("destinationUrn");
                    _destinationUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _destinationUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for destinationUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProductAssociation.Fields#destinationUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDestinationUrn() {
        if (_destinationUrnField!= null) {
            return _destinationUrnField;
        } else {
            Object __rawValue = super._map.get("destinationUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("destinationUrn");
            }
            _destinationUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _destinationUrnField;
        }
    }

    /**
     * Setter for destinationUrn
     * 
     * @see DataProductAssociation.Fields#destinationUrn
     */
    public DataProductAssociation setDestinationUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDestinationUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field destinationUrn of com.linkedin.dataproduct.DataProductAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDestinationUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for destinationUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProductAssociation.Fields#destinationUrn
     */
    public DataProductAssociation setDestinationUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field destinationUrn of com.linkedin.dataproduct.DataProductAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _destinationUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see DataProductAssociation.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see DataProductAssociation.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see DataProductAssociation.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        return getCreated();
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProductAssociation.Fields#created
     */
    @Nullable
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see DataProductAssociation.Fields#created
     */
    public DataProductAssociation setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProductAssociation.Fields#created
     */
    public DataProductAssociation setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.dataproduct.DataProductAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see DataProductAssociation.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see DataProductAssociation.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see DataProductAssociation.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        return getLastModified();
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProductAssociation.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see DataProductAssociation.Fields#lastModified
     */
    public DataProductAssociation setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProductAssociation.Fields#lastModified
     */
    public DataProductAssociation setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.dataproduct.DataProductAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for properties
     * 
     * @see DataProductAssociation.Fields#properties
     */
    public boolean hasProperties() {
        if (_propertiesField!= null) {
            return true;
        }
        return super._map.containsKey("properties");
    }

    /**
     * Remover for properties
     * 
     * @see DataProductAssociation.Fields#properties
     */
    public void removeProperties() {
        super._map.remove("properties");
    }

    /**
     * Getter for properties
     * 
     * @see DataProductAssociation.Fields#properties
     */
    @Nullable
    public StringMap getProperties(GetMode mode) {
        return getProperties();
    }

    /**
     * Getter for properties
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProductAssociation.Fields#properties
     */
    @Nullable
    public StringMap getProperties() {
        if (_propertiesField!= null) {
            return _propertiesField;
        } else {
            Object __rawValue = super._map.get("properties");
            _propertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _propertiesField;
        }
    }

    /**
     * Setter for properties
     * 
     * @see DataProductAssociation.Fields#properties
     */
    public DataProductAssociation setProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for properties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProductAssociation.Fields#properties
     */
    public DataProductAssociation setProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field properties of com.linkedin.dataproduct.DataProductAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
            _propertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for outputPort
     * 
     * @see DataProductAssociation.Fields#outputPort
     */
    public boolean hasOutputPort() {
        if (_outputPortField!= null) {
            return true;
        }
        return super._map.containsKey("outputPort");
    }

    /**
     * Remover for outputPort
     * 
     * @see DataProductAssociation.Fields#outputPort
     */
    public void removeOutputPort() {
        super._map.remove("outputPort");
    }

    /**
     * Getter for outputPort
     * 
     * @see DataProductAssociation.Fields#outputPort
     */
    @Nullable
    public Boolean isOutputPort(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isOutputPort();
            case NULL:
                if (_outputPortField!= null) {
                    return _outputPortField;
                } else {
                    Object __rawValue = super._map.get("outputPort");
                    _outputPortField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _outputPortField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for outputPort
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProductAssociation.Fields#outputPort
     */
    @Nonnull
    public Boolean isOutputPort() {
        if (_outputPortField!= null) {
            return _outputPortField;
        } else {
            Object __rawValue = super._map.get("outputPort");
            if (__rawValue == null) {
                return DEFAULT_OutputPort;
            }
            _outputPortField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _outputPortField;
        }
    }

    /**
     * Setter for outputPort
     * 
     * @see DataProductAssociation.Fields#outputPort
     */
    public DataProductAssociation setOutputPort(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputPort(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field outputPort of com.linkedin.dataproduct.DataProductAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputPort", value);
                    _outputPortField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputPort();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputPort", value);
                    _outputPortField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputPort", value);
                    _outputPortField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputPort
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProductAssociation.Fields#outputPort
     */
    public DataProductAssociation setOutputPort(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputPort of com.linkedin.dataproduct.DataProductAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputPort", value);
            _outputPortField = value;
        }
        return this;
    }

    /**
     * Setter for outputPort
     * 
     * @see DataProductAssociation.Fields#outputPort
     */
    public DataProductAssociation setOutputPort(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "outputPort", value);
        _outputPortField = value;
        return this;
    }

    @Override
    public DataProductAssociation clone()
        throws CloneNotSupportedException
    {
        DataProductAssociation __clone = ((DataProductAssociation) super.clone());
        __clone.__changeListener = new DataProductAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProductAssociation copy()
        throws CloneNotSupportedException
    {
        DataProductAssociation __copy = ((DataProductAssociation) super.copy());
        __copy._sourceUrnField = null;
        __copy._outputPortField = null;
        __copy._createdField = null;
        __copy._destinationUrnField = null;
        __copy._lastModifiedField = null;
        __copy._propertiesField = null;
        __copy.__changeListener = new DataProductAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProductAssociation __objectRef;

        private ChangeListener(DataProductAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceUrn":
                    __objectRef._sourceUrnField = null;
                    break;
                case "outputPort":
                    __objectRef._outputPortField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "destinationUrn":
                    __objectRef._destinationUrnField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "properties":
                    __objectRef._propertiesField = null;
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
         * Urn of the source of this relationship edge.
         * If not specified, assumed to be the entity that this aspect belongs to.
         * 
         */
        public PathSpec sourceUrn() {
            return new PathSpec(getPathComponents(), "sourceUrn");
        }

        /**
         * Urn of the destination of this relationship edge.
         * 
         */
        public PathSpec destinationUrn() {
            return new PathSpec(getPathComponents(), "destinationUrn");
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * A generic properties bag that allows us to store specific information on this graph edge.
         * 
         */
        public PathSpec properties() {
            return new PathSpec(getPathComponents(), "properties");
        }

        /**
         * If set to true, this asset is an output port of the Data Product.
         * 
         */
        public PathSpec outputPort() {
            return new PathSpec(getPathComponents(), "outputPort");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * Urn of the source of this relationship edge.
         * If not specified, assumed to be the entity that this aspect belongs to.
         * 
         */
        public DataProductAssociation.ProjectionMask withSourceUrn() {
            getDataMap().put("sourceUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the destination of this relationship edge.
         * 
         */
        public DataProductAssociation.ProjectionMask withDestinationUrn() {
            getDataMap().put("destinationUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public DataProductAssociation.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public DataProductAssociation.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who created this relationship edge and when
         * 
         */
        public DataProductAssociation.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public DataProductAssociation.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public DataProductAssociation.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified this relationship edge and when
         * 
         */
        public DataProductAssociation.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A generic properties bag that allows us to store specific information on this graph edge.
         * 
         */
        public DataProductAssociation.ProjectionMask withProperties() {
            getDataMap().put("properties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If set to true, this asset is an output port of the Data Product.
         * 
         */
        public DataProductAssociation.ProjectionMask withOutputPort() {
            getDataMap().put("outputPort", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
