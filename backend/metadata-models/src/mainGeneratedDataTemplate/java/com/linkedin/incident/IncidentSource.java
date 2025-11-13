
package com.linkedin.incident;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Information about the source of an incident raised on an asset.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/incident/IncidentSource.pdl.")
public class IncidentSource
    extends RecordTemplate
{

    private final static IncidentSource.Fields _fields = new IncidentSource.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident/**Information about the source of an incident raised on an asset.*/@Aspect.name=\"incidentSource\"record IncidentSource{/**Message associated with the incident*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Source\"}type:enum IncidentSourceType{/**Manually created incident, via UI or API.*/MANUAL/**An assertion has failed, triggering the incident.*/ASSERTION_FAILURE}/**Reference to an URN related to the source of an incident.*/@Searchable.fieldType=\"URN\"sourceUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private IncidentSourceType _typeField = null;
    private com.linkedin.common.urn.Urn _sourceUrnField = null;
    private IncidentSource.ChangeListener __changeListener = new IncidentSource.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_SourceUrn = SCHEMA.getField("sourceUrn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public IncidentSource() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IncidentSource(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncidentSource.Fields fields() {
        return _fields;
    }

    public static IncidentSource.ProjectionMask createMask() {
        return new IncidentSource.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see IncidentSource.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see IncidentSource.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see IncidentSource.Fields#type
     */
    @Nullable
    public IncidentSourceType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncidentSourceType.class, IncidentSourceType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentSource.Fields#type
     */
    @Nonnull
    public IncidentSourceType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncidentSourceType.class, IncidentSourceType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see IncidentSource.Fields#type
     */
    public IncidentSource setType(
        @Nullable
        IncidentSourceType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.incident.IncidentSource");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentSource.Fields#type
     */
    public IncidentSource setType(
        @Nonnull
        IncidentSourceType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.incident.IncidentSource to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceUrn
     * 
     * @see IncidentSource.Fields#sourceUrn
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
     * @see IncidentSource.Fields#sourceUrn
     */
    public void removeSourceUrn() {
        super._map.remove("sourceUrn");
    }

    /**
     * Getter for sourceUrn
     * 
     * @see IncidentSource.Fields#sourceUrn
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
     * @see IncidentSource.Fields#sourceUrn
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
     * @see IncidentSource.Fields#sourceUrn
     */
    public IncidentSource setSourceUrn(
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
     * @see IncidentSource.Fields#sourceUrn
     */
    public IncidentSource setSourceUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceUrn of com.linkedin.incident.IncidentSource to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _sourceUrnField = value;
        }
        return this;
    }

    @Override
    public IncidentSource clone()
        throws CloneNotSupportedException
    {
        IncidentSource __clone = ((IncidentSource) super.clone());
        __clone.__changeListener = new IncidentSource.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncidentSource copy()
        throws CloneNotSupportedException
    {
        IncidentSource __copy = ((IncidentSource) super.copy());
        __copy._sourceUrnField = null;
        __copy._typeField = null;
        __copy.__changeListener = new IncidentSource.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncidentSource __objectRef;

        private ChangeListener(IncidentSource reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "sourceUrn":
                    __objectRef._sourceUrnField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * Message associated with the incident
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Reference to an URN related to the source of an incident.
         * 
         */
        public PathSpec sourceUrn() {
            return new PathSpec(getPathComponents(), "sourceUrn");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Message associated with the incident
         * 
         */
        public IncidentSource.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Reference to an URN related to the source of an incident.
         * 
         */
        public IncidentSource.ProjectionMask withSourceUrn() {
            getDataMap().put("sourceUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
