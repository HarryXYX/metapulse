
package com.linkedin.metadata.run;

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
 * The model for the result of a relationship query.
 * Used to get the relationships of a given entity run.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/run/DeleteReferencesResponse.pdl.")
public class DeleteReferencesResponse
    extends RecordTemplate
{

    private final static DeleteReferencesResponse.Fields _fields = new DeleteReferencesResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run/**The model for the result of a relationship query.\nUsed to get the relationships of a given entity run.*/record DeleteReferencesResponse{relatedAspects:array[/**Metadata about how an aspect is related to some urn*/record RelatedAspect{/** Urn of the entity that is referenced by the aspect.*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}aspect:string,relationship:string}]/**Total number of relationships that an entity urn has.*/total:int}", SchemaFormatType.PDL));
    private RelatedAspectArray _relatedAspectsField = null;
    private Integer _totalField = null;
    private DeleteReferencesResponse.ChangeListener __changeListener = new DeleteReferencesResponse.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RelatedAspects = SCHEMA.getField("relatedAspects");
    private final static RecordDataSchema.Field FIELD_Total = SCHEMA.getField("total");

    public DeleteReferencesResponse() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DeleteReferencesResponse(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DeleteReferencesResponse.Fields fields() {
        return _fields;
    }

    public static DeleteReferencesResponse.ProjectionMask createMask() {
        return new DeleteReferencesResponse.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for relatedAspects
     * 
     * @see DeleteReferencesResponse.Fields#relatedAspects
     */
    public boolean hasRelatedAspects() {
        if (_relatedAspectsField!= null) {
            return true;
        }
        return super._map.containsKey("relatedAspects");
    }

    /**
     * Remover for relatedAspects
     * 
     * @see DeleteReferencesResponse.Fields#relatedAspects
     */
    public void removeRelatedAspects() {
        super._map.remove("relatedAspects");
    }

    /**
     * Getter for relatedAspects
     * 
     * @see DeleteReferencesResponse.Fields#relatedAspects
     */
    @Nullable
    public RelatedAspectArray getRelatedAspects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRelatedAspects();
            case DEFAULT:
            case NULL:
                if (_relatedAspectsField!= null) {
                    return _relatedAspectsField;
                } else {
                    Object __rawValue = super._map.get("relatedAspects");
                    _relatedAspectsField = ((__rawValue == null)?null:new RelatedAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _relatedAspectsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for relatedAspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DeleteReferencesResponse.Fields#relatedAspects
     */
    @Nonnull
    public RelatedAspectArray getRelatedAspects() {
        if (_relatedAspectsField!= null) {
            return _relatedAspectsField;
        } else {
            Object __rawValue = super._map.get("relatedAspects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("relatedAspects");
            }
            _relatedAspectsField = ((__rawValue == null)?null:new RelatedAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _relatedAspectsField;
        }
    }

    /**
     * Setter for relatedAspects
     * 
     * @see DeleteReferencesResponse.Fields#relatedAspects
     */
    public DeleteReferencesResponse setRelatedAspects(
        @Nullable
        RelatedAspectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelatedAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field relatedAspects of com.linkedin.metadata.run.DeleteReferencesResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relatedAspects", value.data());
                    _relatedAspectsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelatedAspects();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relatedAspects", value.data());
                    _relatedAspectsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relatedAspects", value.data());
                    _relatedAspectsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relatedAspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DeleteReferencesResponse.Fields#relatedAspects
     */
    public DeleteReferencesResponse setRelatedAspects(
        @Nonnull
        RelatedAspectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relatedAspects of com.linkedin.metadata.run.DeleteReferencesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relatedAspects", value.data());
            _relatedAspectsField = value;
        }
        return this;
    }

    /**
     * Existence checker for total
     * 
     * @see DeleteReferencesResponse.Fields#total
     */
    public boolean hasTotal() {
        if (_totalField!= null) {
            return true;
        }
        return super._map.containsKey("total");
    }

    /**
     * Remover for total
     * 
     * @see DeleteReferencesResponse.Fields#total
     */
    public void removeTotal() {
        super._map.remove("total");
    }

    /**
     * Getter for total
     * 
     * @see DeleteReferencesResponse.Fields#total
     */
    @Nullable
    public Integer getTotal(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTotal();
            case DEFAULT:
            case NULL:
                if (_totalField!= null) {
                    return _totalField;
                } else {
                    Object __rawValue = super._map.get("total");
                    _totalField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _totalField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for total
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DeleteReferencesResponse.Fields#total
     */
    @Nonnull
    public Integer getTotal() {
        if (_totalField!= null) {
            return _totalField;
        } else {
            Object __rawValue = super._map.get("total");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("total");
            }
            _totalField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalField;
        }
    }

    /**
     * Setter for total
     * 
     * @see DeleteReferencesResponse.Fields#total
     */
    public DeleteReferencesResponse setTotal(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotal(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field total of com.linkedin.metadata.run.DeleteReferencesResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
                    _totalField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotal();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
                    _totalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
                    _totalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for total
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DeleteReferencesResponse.Fields#total
     */
    public DeleteReferencesResponse setTotal(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field total of com.linkedin.metadata.run.DeleteReferencesResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
            _totalField = value;
        }
        return this;
    }

    /**
     * Setter for total
     * 
     * @see DeleteReferencesResponse.Fields#total
     */
    public DeleteReferencesResponse setTotal(int value) {
        CheckedUtil.putWithoutChecking(super._map, "total", DataTemplateUtil.coerceIntInput(value));
        _totalField = value;
        return this;
    }

    @Override
    public DeleteReferencesResponse clone()
        throws CloneNotSupportedException
    {
        DeleteReferencesResponse __clone = ((DeleteReferencesResponse) super.clone());
        __clone.__changeListener = new DeleteReferencesResponse.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DeleteReferencesResponse copy()
        throws CloneNotSupportedException
    {
        DeleteReferencesResponse __copy = ((DeleteReferencesResponse) super.copy());
        __copy._totalField = null;
        __copy._relatedAspectsField = null;
        __copy.__changeListener = new DeleteReferencesResponse.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DeleteReferencesResponse __objectRef;

        private ChangeListener(DeleteReferencesResponse reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "total":
                    __objectRef._totalField = null;
                    break;
                case "relatedAspects":
                    __objectRef._relatedAspectsField = null;
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

        public com.linkedin.metadata.run.RelatedAspectArray.Fields relatedAspects() {
            return new com.linkedin.metadata.run.RelatedAspectArray.Fields(getPathComponents(), "relatedAspects");
        }

        public PathSpec relatedAspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "relatedAspects");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Total number of relationships that an entity urn has.
         * 
         */
        public PathSpec total() {
            return new PathSpec(getPathComponents(), "total");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.run.RelatedAspectArray.ProjectionMask _relatedAspectsMask;

        ProjectionMask() {
            super(3);
        }

        public DeleteReferencesResponse.ProjectionMask withRelatedAspects(Function<com.linkedin.metadata.run.RelatedAspectArray.ProjectionMask, com.linkedin.metadata.run.RelatedAspectArray.ProjectionMask> nestedMask) {
            _relatedAspectsMask = nestedMask.apply(((_relatedAspectsMask == null)?RelatedAspectArray.createMask():_relatedAspectsMask));
            getDataMap().put("relatedAspects", _relatedAspectsMask.getDataMap());
            return this;
        }

        public DeleteReferencesResponse.ProjectionMask withRelatedAspects() {
            _relatedAspectsMask = null;
            getDataMap().put("relatedAspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DeleteReferencesResponse.ProjectionMask withRelatedAspects(Function<com.linkedin.metadata.run.RelatedAspectArray.ProjectionMask, com.linkedin.metadata.run.RelatedAspectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _relatedAspectsMask = nestedMask.apply(((_relatedAspectsMask == null)?RelatedAspectArray.createMask():_relatedAspectsMask));
            getDataMap().put("relatedAspects", _relatedAspectsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("relatedAspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relatedAspects").put("$count", count);
            }
            return this;
        }

        public DeleteReferencesResponse.ProjectionMask withRelatedAspects(Integer start, Integer count) {
            _relatedAspectsMask = null;
            getDataMap().put("relatedAspects", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("relatedAspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relatedAspects").put("$count", count);
            }
            return this;
        }

        /**
         * Total number of relationships that an entity urn has.
         * 
         */
        public DeleteReferencesResponse.ProjectionMask withTotal() {
            getDataMap().put("total", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
