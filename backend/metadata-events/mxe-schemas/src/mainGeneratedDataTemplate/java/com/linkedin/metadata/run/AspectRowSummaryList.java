
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/AspectRowSummaryList.pdl.")
public class AspectRowSummaryList
    extends RecordTemplate
{

    private final static AspectRowSummaryList.Fields _fields = new AspectRowSummaryList.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record AspectRowSummaryList{aspectRowSummaries:array[record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean,aspect:optional{namespace com.linkedin.entity/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}}telemetryTraceId:optional string}]}", SchemaFormatType.PDL));
    private AspectRowSummaryArray _aspectRowSummariesField = null;
    private AspectRowSummaryList.ChangeListener __changeListener = new AspectRowSummaryList.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AspectRowSummaries = SCHEMA.getField("aspectRowSummaries");

    public AspectRowSummaryList() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AspectRowSummaryList(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AspectRowSummaryList.Fields fields() {
        return _fields;
    }

    public static AspectRowSummaryList.ProjectionMask createMask() {
        return new AspectRowSummaryList.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public boolean hasAspectRowSummaries() {
        if (_aspectRowSummariesField!= null) {
            return true;
        }
        return super._map.containsKey("aspectRowSummaries");
    }

    /**
     * Remover for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public void removeAspectRowSummaries() {
        super._map.remove("aspectRowSummaries");
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    @Nullable
    public AspectRowSummaryArray getAspectRowSummaries(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectRowSummaries();
            case DEFAULT:
            case NULL:
                if (_aspectRowSummariesField!= null) {
                    return _aspectRowSummariesField;
                } else {
                    Object __rawValue = super._map.get("aspectRowSummaries");
                    _aspectRowSummariesField = ((__rawValue == null)?null:new AspectRowSummaryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _aspectRowSummariesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    @Nonnull
    public AspectRowSummaryArray getAspectRowSummaries() {
        if (_aspectRowSummariesField!= null) {
            return _aspectRowSummariesField;
        } else {
            Object __rawValue = super._map.get("aspectRowSummaries");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectRowSummaries");
            }
            _aspectRowSummariesField = ((__rawValue == null)?null:new AspectRowSummaryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aspectRowSummariesField;
        }
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public AspectRowSummaryList setAspectRowSummaries(
        @Nullable
        AspectRowSummaryArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectRowSummaries(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectRowSummaries of com.linkedin.metadata.run.AspectRowSummaryList");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
                    _aspectRowSummariesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectRowSummaries();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
                    _aspectRowSummariesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
                    _aspectRowSummariesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummaryList.Fields#aspectRowSummaries
     */
    public AspectRowSummaryList setAspectRowSummaries(
        @Nonnull
        AspectRowSummaryArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectRowSummaries of com.linkedin.metadata.run.AspectRowSummaryList to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
            _aspectRowSummariesField = value;
        }
        return this;
    }

    @Override
    public AspectRowSummaryList clone()
        throws CloneNotSupportedException
    {
        AspectRowSummaryList __clone = ((AspectRowSummaryList) super.clone());
        __clone.__changeListener = new AspectRowSummaryList.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AspectRowSummaryList copy()
        throws CloneNotSupportedException
    {
        AspectRowSummaryList __copy = ((AspectRowSummaryList) super.copy());
        __copy._aspectRowSummariesField = null;
        __copy.__changeListener = new AspectRowSummaryList.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AspectRowSummaryList __objectRef;

        private ChangeListener(AspectRowSummaryList reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aspectRowSummaries":
                    __objectRef._aspectRowSummariesField = null;
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

        public com.linkedin.metadata.run.AspectRowSummaryArray.Fields aspectRowSummaries() {
            return new com.linkedin.metadata.run.AspectRowSummaryArray.Fields(getPathComponents(), "aspectRowSummaries");
        }

        public PathSpec aspectRowSummaries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspectRowSummaries");
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

        private com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask _aspectRowSummariesMask;

        ProjectionMask() {
            super(2);
        }

        public AspectRowSummaryList.ProjectionMask withAspectRowSummaries(Function<com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask, com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask> nestedMask) {
            _aspectRowSummariesMask = nestedMask.apply(((_aspectRowSummariesMask == null)?AspectRowSummaryArray.createMask():_aspectRowSummariesMask));
            getDataMap().put("aspectRowSummaries", _aspectRowSummariesMask.getDataMap());
            return this;
        }

        public AspectRowSummaryList.ProjectionMask withAspectRowSummaries() {
            _aspectRowSummariesMask = null;
            getDataMap().put("aspectRowSummaries", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummaryList.ProjectionMask withAspectRowSummaries(Function<com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask, com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aspectRowSummariesMask = nestedMask.apply(((_aspectRowSummariesMask == null)?AspectRowSummaryArray.createMask():_aspectRowSummariesMask));
            getDataMap().put("aspectRowSummaries", _aspectRowSummariesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$count", count);
            }
            return this;
        }

        public AspectRowSummaryList.ProjectionMask withAspectRowSummaries(Integer start, Integer count) {
            _aspectRowSummariesMask = null;
            getDataMap().put("aspectRowSummaries", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$count", count);
            }
            return this;
        }

    }

}
