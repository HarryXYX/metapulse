
package com.linkedin.template;

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
import com.linkedin.data.template.SetMode;


/**
 * The page template info for asset summaries
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/template/DataHubPageTemplateAssetSummary.pdl.")
public class DataHubPageTemplateAssetSummary
    extends RecordTemplate
{

    private final static DataHubPageTemplateAssetSummary.Fields _fields = new DataHubPageTemplateAssetSummary.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template/**The page template info for asset summaries*/record DataHubPageTemplateAssetSummary{/**The optional list of properties shown on an asset summary page header.*/summaryElements:optional array[/**Info for a given asset summary element*/record SummaryElement{/**The type of element/property*/elementType:enum SummaryElementType{CREATED,TAGS,GLOSSARY_TERMS,OWNERS,DOMAIN,STRUCTURED_PROPERTY}/**The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY*/@Relationship={\"entityTypes\":[\"structuredProperty\"],\"name\":\"ContainsStructuredProperty\"}structuredPropertyUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]}", SchemaFormatType.PDL));
    private SummaryElementArray _summaryElementsField = null;
    private DataHubPageTemplateAssetSummary.ChangeListener __changeListener = new DataHubPageTemplateAssetSummary.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SummaryElements = SCHEMA.getField("summaryElements");

    public DataHubPageTemplateAssetSummary() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubPageTemplateAssetSummary(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageTemplateAssetSummary.Fields fields() {
        return _fields;
    }

    public static DataHubPageTemplateAssetSummary.ProjectionMask createMask() {
        return new DataHubPageTemplateAssetSummary.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for summaryElements
     * 
     * @see DataHubPageTemplateAssetSummary.Fields#summaryElements
     */
    public boolean hasSummaryElements() {
        if (_summaryElementsField!= null) {
            return true;
        }
        return super._map.containsKey("summaryElements");
    }

    /**
     * Remover for summaryElements
     * 
     * @see DataHubPageTemplateAssetSummary.Fields#summaryElements
     */
    public void removeSummaryElements() {
        super._map.remove("summaryElements");
    }

    /**
     * Getter for summaryElements
     * 
     * @see DataHubPageTemplateAssetSummary.Fields#summaryElements
     */
    @Nullable
    public SummaryElementArray getSummaryElements(GetMode mode) {
        return getSummaryElements();
    }

    /**
     * Getter for summaryElements
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPageTemplateAssetSummary.Fields#summaryElements
     */
    @Nullable
    public SummaryElementArray getSummaryElements() {
        if (_summaryElementsField!= null) {
            return _summaryElementsField;
        } else {
            Object __rawValue = super._map.get("summaryElements");
            _summaryElementsField = ((__rawValue == null)?null:new SummaryElementArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _summaryElementsField;
        }
    }

    /**
     * Setter for summaryElements
     * 
     * @see DataHubPageTemplateAssetSummary.Fields#summaryElements
     */
    public DataHubPageTemplateAssetSummary setSummaryElements(
        @Nullable
        SummaryElementArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSummaryElements(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSummaryElements();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "summaryElements", value.data());
                    _summaryElementsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "summaryElements", value.data());
                    _summaryElementsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for summaryElements
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageTemplateAssetSummary.Fields#summaryElements
     */
    public DataHubPageTemplateAssetSummary setSummaryElements(
        @Nonnull
        SummaryElementArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field summaryElements of com.linkedin.template.DataHubPageTemplateAssetSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "summaryElements", value.data());
            _summaryElementsField = value;
        }
        return this;
    }

    @Override
    public DataHubPageTemplateAssetSummary clone()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateAssetSummary __clone = ((DataHubPageTemplateAssetSummary) super.clone());
        __clone.__changeListener = new DataHubPageTemplateAssetSummary.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageTemplateAssetSummary copy()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateAssetSummary __copy = ((DataHubPageTemplateAssetSummary) super.copy());
        __copy._summaryElementsField = null;
        __copy.__changeListener = new DataHubPageTemplateAssetSummary.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageTemplateAssetSummary __objectRef;

        private ChangeListener(DataHubPageTemplateAssetSummary reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "summaryElements":
                    __objectRef._summaryElementsField = null;
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
         * The optional list of properties shown on an asset summary page header.
         * 
         */
        public com.linkedin.template.SummaryElementArray.Fields summaryElements() {
            return new com.linkedin.template.SummaryElementArray.Fields(getPathComponents(), "summaryElements");
        }

        /**
         * The optional list of properties shown on an asset summary page header.
         * 
         */
        public PathSpec summaryElements(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "summaryElements");
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

        private com.linkedin.template.SummaryElementArray.ProjectionMask _summaryElementsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * The optional list of properties shown on an asset summary page header.
         * 
         */
        public DataHubPageTemplateAssetSummary.ProjectionMask withSummaryElements(Function<com.linkedin.template.SummaryElementArray.ProjectionMask, com.linkedin.template.SummaryElementArray.ProjectionMask> nestedMask) {
            _summaryElementsMask = nestedMask.apply(((_summaryElementsMask == null)?SummaryElementArray.createMask():_summaryElementsMask));
            getDataMap().put("summaryElements", _summaryElementsMask.getDataMap());
            return this;
        }

        /**
         * The optional list of properties shown on an asset summary page header.
         * 
         */
        public DataHubPageTemplateAssetSummary.ProjectionMask withSummaryElements() {
            _summaryElementsMask = null;
            getDataMap().put("summaryElements", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The optional list of properties shown on an asset summary page header.
         * 
         */
        public DataHubPageTemplateAssetSummary.ProjectionMask withSummaryElements(Function<com.linkedin.template.SummaryElementArray.ProjectionMask, com.linkedin.template.SummaryElementArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _summaryElementsMask = nestedMask.apply(((_summaryElementsMask == null)?SummaryElementArray.createMask():_summaryElementsMask));
            getDataMap().put("summaryElements", _summaryElementsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("summaryElements").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("summaryElements").put("$count", count);
            }
            return this;
        }

        /**
         * The optional list of properties shown on an asset summary page header.
         * 
         */
        public DataHubPageTemplateAssetSummary.ProjectionMask withSummaryElements(Integer start, Integer count) {
            _summaryElementsMask = null;
            getDataMap().put("summaryElements", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("summaryElements").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("summaryElements").put("$count", count);
            }
            return this;
        }

    }

}
