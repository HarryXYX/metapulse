
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataList;
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
 * Carries information about the native CorpGroups a user is in.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/identity/NativeGroupMembership.pdl.")
public class NativeGroupMembership
    extends RecordTemplate
{

    private final static NativeGroupMembership.Fields _fields = new NativeGroupMembership.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Carries information about the native CorpGroups a user is in.*/@Aspect.name=\"nativeGroupMembership\"record NativeGroupMembership{@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsMemberOfNativeGroup\"}nativeGroups:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private UrnArray _nativeGroupsField = null;
    private NativeGroupMembership.ChangeListener __changeListener = new NativeGroupMembership.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_NativeGroups = SCHEMA.getField("nativeGroups");

    public NativeGroupMembership() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public NativeGroupMembership(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static NativeGroupMembership.Fields fields() {
        return _fields;
    }

    public static NativeGroupMembership.ProjectionMask createMask() {
        return new NativeGroupMembership.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for nativeGroups
     * 
     * @see NativeGroupMembership.Fields#nativeGroups
     */
    public boolean hasNativeGroups() {
        if (_nativeGroupsField!= null) {
            return true;
        }
        return super._map.containsKey("nativeGroups");
    }

    /**
     * Remover for nativeGroups
     * 
     * @see NativeGroupMembership.Fields#nativeGroups
     */
    public void removeNativeGroups() {
        super._map.remove("nativeGroups");
    }

    /**
     * Getter for nativeGroups
     * 
     * @see NativeGroupMembership.Fields#nativeGroups
     */
    @Nullable
    public UrnArray getNativeGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNativeGroups();
            case DEFAULT:
            case NULL:
                if (_nativeGroupsField!= null) {
                    return _nativeGroupsField;
                } else {
                    Object __rawValue = super._map.get("nativeGroups");
                    _nativeGroupsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _nativeGroupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for nativeGroups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see NativeGroupMembership.Fields#nativeGroups
     */
    @Nonnull
    public UrnArray getNativeGroups() {
        if (_nativeGroupsField!= null) {
            return _nativeGroupsField;
        } else {
            Object __rawValue = super._map.get("nativeGroups");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("nativeGroups");
            }
            _nativeGroupsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _nativeGroupsField;
        }
    }

    /**
     * Setter for nativeGroups
     * 
     * @see NativeGroupMembership.Fields#nativeGroups
     */
    public NativeGroupMembership setNativeGroups(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field nativeGroups of com.linkedin.identity.NativeGroupMembership");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeGroups", value.data());
                    _nativeGroupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeGroups", value.data());
                    _nativeGroupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeGroups", value.data());
                    _nativeGroupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeGroups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NativeGroupMembership.Fields#nativeGroups
     */
    public NativeGroupMembership setNativeGroups(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeGroups of com.linkedin.identity.NativeGroupMembership to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeGroups", value.data());
            _nativeGroupsField = value;
        }
        return this;
    }

    @Override
    public NativeGroupMembership clone()
        throws CloneNotSupportedException
    {
        NativeGroupMembership __clone = ((NativeGroupMembership) super.clone());
        __clone.__changeListener = new NativeGroupMembership.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public NativeGroupMembership copy()
        throws CloneNotSupportedException
    {
        NativeGroupMembership __copy = ((NativeGroupMembership) super.copy());
        __copy._nativeGroupsField = null;
        __copy.__changeListener = new NativeGroupMembership.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final NativeGroupMembership __objectRef;

        private ChangeListener(NativeGroupMembership reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "nativeGroups":
                    __objectRef._nativeGroupsField = null;
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

        public PathSpec nativeGroups() {
            return new PathSpec(getPathComponents(), "nativeGroups");
        }

        public PathSpec nativeGroups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "nativeGroups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public NativeGroupMembership.ProjectionMask withNativeGroups() {
            getDataMap().put("nativeGroups", MaskMap.POSITIVE_MASK);
            return this;
        }

        public NativeGroupMembership.ProjectionMask withNativeGroups(Integer start, Integer count) {
            getDataMap().put("nativeGroups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("nativeGroups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("nativeGroups").put("$count", count);
            }
            return this;
        }

    }

}
