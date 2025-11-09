
package com.linkedin.metadata.query;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * The additional metadata for a list result
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/ListResultMetadata.pdl.")
public class ListResultMetadata
    extends RecordTemplate
{

    private final static ListResultMetadata.Fields _fields = new ListResultMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**The additional metadata for a list result*/record ListResultMetadata{/**A list of extra information that positionally corresponds to the aspects returned from the list query*/extraInfos:array[/**Extra information associated to a metadata aspect.*/record ExtraInfo{/**The urn for the entity that owns the metadata aspect*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The version number of the metadata aspect.*/version:long/**The audit trail associated with the version*/audit:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}]}", SchemaFormatType.PDL));
    private ExtraInfoArray _extraInfosField = null;
    private ListResultMetadata.ChangeListener __changeListener = new ListResultMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ExtraInfos = SCHEMA.getField("extraInfos");

    public ListResultMetadata() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ListResultMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ListResultMetadata.Fields fields() {
        return _fields;
    }

    public static ListResultMetadata.ProjectionMask createMask() {
        return new ListResultMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for extraInfos
     * 
     * @see ListResultMetadata.Fields#extraInfos
     */
    public boolean hasExtraInfos() {
        if (_extraInfosField!= null) {
            return true;
        }
        return super._map.containsKey("extraInfos");
    }

    /**
     * Remover for extraInfos
     * 
     * @see ListResultMetadata.Fields#extraInfos
     */
    public void removeExtraInfos() {
        super._map.remove("extraInfos");
    }

    /**
     * Getter for extraInfos
     * 
     * @see ListResultMetadata.Fields#extraInfos
     */
    @Nullable
    public ExtraInfoArray getExtraInfos(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getExtraInfos();
            case DEFAULT:
            case NULL:
                if (_extraInfosField!= null) {
                    return _extraInfosField;
                } else {
                    Object __rawValue = super._map.get("extraInfos");
                    _extraInfosField = ((__rawValue == null)?null:new ExtraInfoArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _extraInfosField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for extraInfos
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ListResultMetadata.Fields#extraInfos
     */
    @Nonnull
    public ExtraInfoArray getExtraInfos() {
        if (_extraInfosField!= null) {
            return _extraInfosField;
        } else {
            Object __rawValue = super._map.get("extraInfos");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("extraInfos");
            }
            _extraInfosField = ((__rawValue == null)?null:new ExtraInfoArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _extraInfosField;
        }
    }

    /**
     * Setter for extraInfos
     * 
     * @see ListResultMetadata.Fields#extraInfos
     */
    public ListResultMetadata setExtraInfos(
        @Nullable
        ExtraInfoArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExtraInfos(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field extraInfos of com.linkedin.metadata.query.ListResultMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "extraInfos", value.data());
                    _extraInfosField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExtraInfos();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "extraInfos", value.data());
                    _extraInfosField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "extraInfos", value.data());
                    _extraInfosField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for extraInfos
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ListResultMetadata.Fields#extraInfos
     */
    public ListResultMetadata setExtraInfos(
        @Nonnull
        ExtraInfoArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field extraInfos of com.linkedin.metadata.query.ListResultMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "extraInfos", value.data());
            _extraInfosField = value;
        }
        return this;
    }

    @Override
    public ListResultMetadata clone()
        throws CloneNotSupportedException
    {
        ListResultMetadata __clone = ((ListResultMetadata) super.clone());
        __clone.__changeListener = new ListResultMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ListResultMetadata copy()
        throws CloneNotSupportedException
    {
        ListResultMetadata __copy = ((ListResultMetadata) super.copy());
        __copy._extraInfosField = null;
        __copy.__changeListener = new ListResultMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ListResultMetadata __objectRef;

        private ChangeListener(ListResultMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "extraInfos":
                    __objectRef._extraInfosField = null;
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
         * A list of extra information that positionally corresponds to the aspects returned from the list query
         * 
         */
        public com.linkedin.metadata.query.ExtraInfoArray.Fields extraInfos() {
            return new com.linkedin.metadata.query.ExtraInfoArray.Fields(getPathComponents(), "extraInfos");
        }

        /**
         * A list of extra information that positionally corresponds to the aspects returned from the list query
         * 
         */
        public PathSpec extraInfos(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "extraInfos");
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

        private com.linkedin.metadata.query.ExtraInfoArray.ProjectionMask _extraInfosMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * A list of extra information that positionally corresponds to the aspects returned from the list query
         * 
         */
        public ListResultMetadata.ProjectionMask withExtraInfos(Function<com.linkedin.metadata.query.ExtraInfoArray.ProjectionMask, com.linkedin.metadata.query.ExtraInfoArray.ProjectionMask> nestedMask) {
            _extraInfosMask = nestedMask.apply(((_extraInfosMask == null)?ExtraInfoArray.createMask():_extraInfosMask));
            getDataMap().put("extraInfos", _extraInfosMask.getDataMap());
            return this;
        }

        /**
         * A list of extra information that positionally corresponds to the aspects returned from the list query
         * 
         */
        public ListResultMetadata.ProjectionMask withExtraInfos() {
            _extraInfosMask = null;
            getDataMap().put("extraInfos", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of extra information that positionally corresponds to the aspects returned from the list query
         * 
         */
        public ListResultMetadata.ProjectionMask withExtraInfos(Function<com.linkedin.metadata.query.ExtraInfoArray.ProjectionMask, com.linkedin.metadata.query.ExtraInfoArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _extraInfosMask = nestedMask.apply(((_extraInfosMask == null)?ExtraInfoArray.createMask():_extraInfosMask));
            getDataMap().put("extraInfos", _extraInfosMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("extraInfos").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("extraInfos").put("$count", count);
            }
            return this;
        }

        /**
         * A list of extra information that positionally corresponds to the aspects returned from the list query
         * 
         */
        public ListResultMetadata.ProjectionMask withExtraInfos(Integer start, Integer count) {
            _extraInfosMask = null;
            getDataMap().put("extraInfos", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("extraInfos").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("extraInfos").put("$count", count);
            }
            return this;
        }

    }

}
