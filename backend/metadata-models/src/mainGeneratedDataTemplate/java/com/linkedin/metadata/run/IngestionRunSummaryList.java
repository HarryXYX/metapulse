
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/run/IngestionRunSummaryList.pdl.")
public class IngestionRunSummaryList
    extends RecordTemplate
{

    private final static IngestionRunSummaryList.Fields _fields = new IngestionRunSummaryList.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record IngestionRunSummaryList{ingestionRunSummaries:array[record IngestionRunSummary{runId:string,timestamp:long,rows:long}]}", SchemaFormatType.PDL));
    private IngestionRunSummaryArray _ingestionRunSummariesField = null;
    private IngestionRunSummaryList.ChangeListener __changeListener = new IngestionRunSummaryList.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_IngestionRunSummaries = SCHEMA.getField("ingestionRunSummaries");

    public IngestionRunSummaryList() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public IngestionRunSummaryList(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IngestionRunSummaryList.Fields fields() {
        return _fields;
    }

    public static IngestionRunSummaryList.ProjectionMask createMask() {
        return new IngestionRunSummaryList.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public boolean hasIngestionRunSummaries() {
        if (_ingestionRunSummariesField!= null) {
            return true;
        }
        return super._map.containsKey("ingestionRunSummaries");
    }

    /**
     * Remover for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public void removeIngestionRunSummaries() {
        super._map.remove("ingestionRunSummaries");
    }

    /**
     * Getter for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    @Nullable
    public IngestionRunSummaryArray getIngestionRunSummaries(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getIngestionRunSummaries();
            case DEFAULT:
            case NULL:
                if (_ingestionRunSummariesField!= null) {
                    return _ingestionRunSummariesField;
                } else {
                    Object __rawValue = super._map.get("ingestionRunSummaries");
                    _ingestionRunSummariesField = ((__rawValue == null)?null:new IngestionRunSummaryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _ingestionRunSummariesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for ingestionRunSummaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    @Nonnull
    public IngestionRunSummaryArray getIngestionRunSummaries() {
        if (_ingestionRunSummariesField!= null) {
            return _ingestionRunSummariesField;
        } else {
            Object __rawValue = super._map.get("ingestionRunSummaries");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("ingestionRunSummaries");
            }
            _ingestionRunSummariesField = ((__rawValue == null)?null:new IngestionRunSummaryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _ingestionRunSummariesField;
        }
    }

    /**
     * Setter for ingestionRunSummaries
     * 
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public IngestionRunSummaryList setIngestionRunSummaries(
        @Nullable
        IngestionRunSummaryArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIngestionRunSummaries(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field ingestionRunSummaries of com.linkedin.metadata.run.IngestionRunSummaryList");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ingestionRunSummaries", value.data());
                    _ingestionRunSummariesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIngestionRunSummaries();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ingestionRunSummaries", value.data());
                    _ingestionRunSummariesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "ingestionRunSummaries", value.data());
                    _ingestionRunSummariesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for ingestionRunSummaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummaryList.Fields#ingestionRunSummaries
     */
    public IngestionRunSummaryList setIngestionRunSummaries(
        @Nonnull
        IngestionRunSummaryArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field ingestionRunSummaries of com.linkedin.metadata.run.IngestionRunSummaryList to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "ingestionRunSummaries", value.data());
            _ingestionRunSummariesField = value;
        }
        return this;
    }

    @Override
    public IngestionRunSummaryList clone()
        throws CloneNotSupportedException
    {
        IngestionRunSummaryList __clone = ((IngestionRunSummaryList) super.clone());
        __clone.__changeListener = new IngestionRunSummaryList.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IngestionRunSummaryList copy()
        throws CloneNotSupportedException
    {
        IngestionRunSummaryList __copy = ((IngestionRunSummaryList) super.copy());
        __copy._ingestionRunSummariesField = null;
        __copy.__changeListener = new IngestionRunSummaryList.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IngestionRunSummaryList __objectRef;

        private ChangeListener(IngestionRunSummaryList reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "ingestionRunSummaries":
                    __objectRef._ingestionRunSummariesField = null;
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

        public com.linkedin.metadata.run.IngestionRunSummaryArray.Fields ingestionRunSummaries() {
            return new com.linkedin.metadata.run.IngestionRunSummaryArray.Fields(getPathComponents(), "ingestionRunSummaries");
        }

        public PathSpec ingestionRunSummaries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "ingestionRunSummaries");
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

        private com.linkedin.metadata.run.IngestionRunSummaryArray.ProjectionMask _ingestionRunSummariesMask;

        ProjectionMask() {
            super(2);
        }

        public IngestionRunSummaryList.ProjectionMask withIngestionRunSummaries(Function<com.linkedin.metadata.run.IngestionRunSummaryArray.ProjectionMask, com.linkedin.metadata.run.IngestionRunSummaryArray.ProjectionMask> nestedMask) {
            _ingestionRunSummariesMask = nestedMask.apply(((_ingestionRunSummariesMask == null)?IngestionRunSummaryArray.createMask():_ingestionRunSummariesMask));
            getDataMap().put("ingestionRunSummaries", _ingestionRunSummariesMask.getDataMap());
            return this;
        }

        public IngestionRunSummaryList.ProjectionMask withIngestionRunSummaries() {
            _ingestionRunSummariesMask = null;
            getDataMap().put("ingestionRunSummaries", MaskMap.POSITIVE_MASK);
            return this;
        }

        public IngestionRunSummaryList.ProjectionMask withIngestionRunSummaries(Function<com.linkedin.metadata.run.IngestionRunSummaryArray.ProjectionMask, com.linkedin.metadata.run.IngestionRunSummaryArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _ingestionRunSummariesMask = nestedMask.apply(((_ingestionRunSummariesMask == null)?IngestionRunSummaryArray.createMask():_ingestionRunSummariesMask));
            getDataMap().put("ingestionRunSummaries", _ingestionRunSummariesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("ingestionRunSummaries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("ingestionRunSummaries").put("$count", count);
            }
            return this;
        }

        public IngestionRunSummaryList.ProjectionMask withIngestionRunSummaries(Integer start, Integer count) {
            _ingestionRunSummariesMask = null;
            getDataMap().put("ingestionRunSummaries", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("ingestionRunSummaries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("ingestionRunSummaries").put("$count", count);
            }
            return this;
        }

    }

}
