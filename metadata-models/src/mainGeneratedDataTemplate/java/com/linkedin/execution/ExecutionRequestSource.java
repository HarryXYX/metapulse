
package com.linkedin.execution;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/execution/ExecutionRequestSource.pdl.")
public class ExecutionRequestSource
    extends RecordTemplate
{

    private final static ExecutionRequestSource.Fields _fields = new ExecutionRequestSource.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.execution,record ExecutionRequestSource{/**The type of the execution request source, e.g. INGESTION_SOURCE*/type:string/**The urn of the ingestion source associated with the ingestion request. Present if type is INGESTION_SOURCE*/@Relationship={\"entityTypes\":[\"dataHubIngestionSource\"],\"name\":\"ingestionSource\"}@Searchable={\"fieldName\":\"ingestionSource\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}ingestionSource:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private String _typeField = null;
    private com.linkedin.common.urn.Urn _ingestionSourceField = null;
    private ExecutionRequestSource.ChangeListener __changeListener = new ExecutionRequestSource.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_IngestionSource = SCHEMA.getField("ingestionSource");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public ExecutionRequestSource() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ExecutionRequestSource(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ExecutionRequestSource.Fields fields() {
        return _fields;
    }

    public static ExecutionRequestSource.ProjectionMask createMask() {
        return new ExecutionRequestSource.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see ExecutionRequestSource.Fields#type
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
     * @see ExecutionRequestSource.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see ExecutionRequestSource.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see ExecutionRequestSource.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see ExecutionRequestSource.Fields#type
     */
    public ExecutionRequestSource setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.execution.ExecutionRequestSource");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
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
     * @see ExecutionRequestSource.Fields#type
     */
    public ExecutionRequestSource setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.execution.ExecutionRequestSource to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for ingestionSource
     * 
     * @see ExecutionRequestSource.Fields#ingestionSource
     */
    public boolean hasIngestionSource() {
        if (_ingestionSourceField!= null) {
            return true;
        }
        return super._map.containsKey("ingestionSource");
    }

    /**
     * Remover for ingestionSource
     * 
     * @see ExecutionRequestSource.Fields#ingestionSource
     */
    public void removeIngestionSource() {
        super._map.remove("ingestionSource");
    }

    /**
     * Getter for ingestionSource
     * 
     * @see ExecutionRequestSource.Fields#ingestionSource
     */
    @Nullable
    public com.linkedin.common.urn.Urn getIngestionSource(GetMode mode) {
        return getIngestionSource();
    }

    /**
     * Getter for ingestionSource
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ExecutionRequestSource.Fields#ingestionSource
     */
    @Nullable
    public com.linkedin.common.urn.Urn getIngestionSource() {
        if (_ingestionSourceField!= null) {
            return _ingestionSourceField;
        } else {
            Object __rawValue = super._map.get("ingestionSource");
            _ingestionSourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _ingestionSourceField;
        }
    }

    /**
     * Setter for ingestionSource
     * 
     * @see ExecutionRequestSource.Fields#ingestionSource
     */
    public ExecutionRequestSource setIngestionSource(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIngestionSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIngestionSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ingestionSource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ingestionSourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "ingestionSource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ingestionSourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for ingestionSource
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestSource.Fields#ingestionSource
     */
    public ExecutionRequestSource setIngestionSource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field ingestionSource of com.linkedin.execution.ExecutionRequestSource to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "ingestionSource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _ingestionSourceField = value;
        }
        return this;
    }

    @Override
    public ExecutionRequestSource clone()
        throws CloneNotSupportedException
    {
        ExecutionRequestSource __clone = ((ExecutionRequestSource) super.clone());
        __clone.__changeListener = new ExecutionRequestSource.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ExecutionRequestSource copy()
        throws CloneNotSupportedException
    {
        ExecutionRequestSource __copy = ((ExecutionRequestSource) super.copy());
        __copy._typeField = null;
        __copy._ingestionSourceField = null;
        __copy.__changeListener = new ExecutionRequestSource.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ExecutionRequestSource __objectRef;

        private ChangeListener(ExecutionRequestSource reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "ingestionSource":
                    __objectRef._ingestionSourceField = null;
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
         * The type of the execution request source, e.g. INGESTION_SOURCE
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The urn of the ingestion source associated with the ingestion request. Present if type is INGESTION_SOURCE
         * 
         */
        public PathSpec ingestionSource() {
            return new PathSpec(getPathComponents(), "ingestionSource");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The type of the execution request source, e.g. INGESTION_SOURCE
         * 
         */
        public ExecutionRequestSource.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The urn of the ingestion source associated with the ingestion request. Present if type is INGESTION_SOURCE
         * 
         */
        public ExecutionRequestSource.ProjectionMask withIngestionSource() {
            getDataMap().put("ingestionSource", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
