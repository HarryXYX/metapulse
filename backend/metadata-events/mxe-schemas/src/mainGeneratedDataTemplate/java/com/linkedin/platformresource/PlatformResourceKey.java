
package com.linkedin.platformresource;

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
 * Key for a Platform Resource.
 * Platform Resources are assets that are not part of the core data model.
 * They are stored in DataHub primarily to help with application-specific
 * use-cases that are not sufficiently generalized to move into the core data model.
 * For instance, if we want to persist & retrieve additional user profile data 
 * from auxiliary integrations such as Slack or Microsoft Teams for resolving details later.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/platformresource/PlatformResourceKey.pdl.")
public class PlatformResourceKey
    extends RecordTemplate
{

    private final static PlatformResourceKey.Fields _fields = new PlatformResourceKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.platformresource/**Key for a Platform Resource.\nPlatform Resources are assets that are not part of the core data model.\nThey are stored in DataHub primarily to help with application-specific\nuse-cases that are not sufficiently generalized to move into the core data model.\nFor instance, if we want to persist & retrieve additional user profile data \nfrom auxiliary integrations such as Slack or Microsoft Teams for resolving details later.*/@Aspect.name=\"platformResourceKey\"record PlatformResourceKey{/**A unique id for this entity.\nThere are no constraints on the format of this id, but most implementations\nwill choose to use a UUID.\nThis id should be globally unique for the entire DataHub instance and\n     uniquely identify the resource that is being stored, so most\n     implementations\nwill combine logical attributes like platform name, platform instance,\nplatform-specific-id and the resource type to create the unique id.\ne.g. slack:slack-instance:slack-user-id:user-info \nor guid(slack, slack-instance, slack-user-id, user-info) etc.*/id:string}", SchemaFormatType.PDL));
    private String _idField = null;
    private PlatformResourceKey.ChangeListener __changeListener = new PlatformResourceKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");

    public PlatformResourceKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public PlatformResourceKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PlatformResourceKey.Fields fields() {
        return _fields;
    }

    public static PlatformResourceKey.ProjectionMask createMask() {
        return new PlatformResourceKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see PlatformResourceKey.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see PlatformResourceKey.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see PlatformResourceKey.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getId();
            case DEFAULT:
            case NULL:
                if (_idField!= null) {
                    return _idField;
                } else {
                    Object __rawValue = super._map.get("id");
                    _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _idField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PlatformResourceKey.Fields#id
     */
    @Nonnull
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("id");
            }
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see PlatformResourceKey.Fields#id
     */
    public PlatformResourceKey setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.platformresource.PlatformResourceKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PlatformResourceKey.Fields#id
     */
    public PlatformResourceKey setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.platformresource.PlatformResourceKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    @Override
    public PlatformResourceKey clone()
        throws CloneNotSupportedException
    {
        PlatformResourceKey __clone = ((PlatformResourceKey) super.clone());
        __clone.__changeListener = new PlatformResourceKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PlatformResourceKey copy()
        throws CloneNotSupportedException
    {
        PlatformResourceKey __copy = ((PlatformResourceKey) super.copy());
        __copy._idField = null;
        __copy.__changeListener = new PlatformResourceKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PlatformResourceKey __objectRef;

        private ChangeListener(PlatformResourceKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "id":
                    __objectRef._idField = null;
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
         * A unique id for this entity.
         * There are no constraints on the format of this id, but most implementations
         * will choose to use a UUID.
         * This id should be globally unique for the entire DataHub instance and
         *      uniquely identify the resource that is being stored, so most
         *      implementations
         * will combine logical attributes like platform name, platform instance,
         * platform-specific-id and the resource type to create the unique id.
         * e.g. slack:slack-instance:slack-user-id:user-info 
         * or guid(slack, slack-instance, slack-user-id, user-info) etc.
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * A unique id for this entity.
         * There are no constraints on the format of this id, but most implementations
         * will choose to use a UUID.
         * This id should be globally unique for the entire DataHub instance and
         *      uniquely identify the resource that is being stored, so most
         *      implementations
         * will combine logical attributes like platform name, platform instance,
         * platform-specific-id and the resource type to create the unique id.
         * e.g. slack:slack-instance:slack-user-id:user-info 
         * or guid(slack, slack-instance, slack-user-id, user-info) etc.
         * 
         */
        public PlatformResourceKey.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
