
package com.linkedin.common;

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
 * Source/provider of the ownership information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/OwnershipSource.pdl.")
public class OwnershipSource
    extends RecordTemplate
{

    private final static OwnershipSource.Fields _fields = new OwnershipSource.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}", SchemaFormatType.PDL));
    private OwnershipSourceType _typeField = null;
    private String _urlField = null;
    private OwnershipSource.ChangeListener __changeListener = new OwnershipSource.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Url = SCHEMA.getField("url");

    public OwnershipSource() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public OwnershipSource(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OwnershipSource.Fields fields() {
        return _fields;
    }

    public static OwnershipSource.ProjectionMask createMask() {
        return new OwnershipSource.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see OwnershipSource.Fields#type
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
     * @see OwnershipSource.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see OwnershipSource.Fields#type
     */
    @Nullable
    public OwnershipSourceType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, OwnershipSourceType.class, OwnershipSourceType.$UNKNOWN);
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
     * @see OwnershipSource.Fields#type
     */
    @Nonnull
    public OwnershipSourceType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, OwnershipSourceType.class, OwnershipSourceType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see OwnershipSource.Fields#type
     */
    public OwnershipSource setType(
        @Nullable
        OwnershipSourceType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.common.OwnershipSource");
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
     * @see OwnershipSource.Fields#type
     */
    public OwnershipSource setType(
        @Nonnull
        OwnershipSourceType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.common.OwnershipSource to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for url
     * 
     * @see OwnershipSource.Fields#url
     */
    public boolean hasUrl() {
        if (_urlField!= null) {
            return true;
        }
        return super._map.containsKey("url");
    }

    /**
     * Remover for url
     * 
     * @see OwnershipSource.Fields#url
     */
    public void removeUrl() {
        super._map.remove("url");
    }

    /**
     * Getter for url
     * 
     * @see OwnershipSource.Fields#url
     */
    @Nullable
    public String getUrl(GetMode mode) {
        return getUrl();
    }

    /**
     * Getter for url
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OwnershipSource.Fields#url
     */
    @Nullable
    public String getUrl() {
        if (_urlField!= null) {
            return _urlField;
        } else {
            Object __rawValue = super._map.get("url");
            _urlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _urlField;
        }
    }

    /**
     * Setter for url
     * 
     * @see OwnershipSource.Fields#url
     */
    public OwnershipSource setUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "url", value);
                    _urlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "url", value);
                    _urlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for url
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnershipSource.Fields#url
     */
    public OwnershipSource setUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field url of com.linkedin.common.OwnershipSource to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "url", value);
            _urlField = value;
        }
        return this;
    }

    @Override
    public OwnershipSource clone()
        throws CloneNotSupportedException
    {
        OwnershipSource __clone = ((OwnershipSource) super.clone());
        __clone.__changeListener = new OwnershipSource.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OwnershipSource copy()
        throws CloneNotSupportedException
    {
        OwnershipSource __copy = ((OwnershipSource) super.copy());
        __copy._typeField = null;
        __copy._urlField = null;
        __copy.__changeListener = new OwnershipSource.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OwnershipSource __objectRef;

        private ChangeListener(OwnershipSource reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "url":
                    __objectRef._urlField = null;
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
         * The type of the source
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * A reference URL for the source
         * 
         */
        public PathSpec url() {
            return new PathSpec(getPathComponents(), "url");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The type of the source
         * 
         */
        public OwnershipSource.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A reference URL for the source
         * 
         */
        public OwnershipSource.ProjectionMask withUrl() {
            getDataMap().put("url", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
