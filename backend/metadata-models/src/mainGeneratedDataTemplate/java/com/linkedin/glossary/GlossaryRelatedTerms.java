
package com.linkedin.glossary;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.GlossaryTermUrnArray;
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
 * Has A / Is A lineage information about a glossary Term reporting the lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/glossary/GlossaryRelatedTerms.pdl.")
public class GlossaryRelatedTerms
    extends RecordTemplate
{

    private final static GlossaryRelatedTerms.Fields _fields = new GlossaryRelatedTerms.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.glossary/**Has A / Is A lineage information about a glossary Term reporting the lineage*/@Aspect.name=\"glossaryRelatedTerms\"record GlossaryRelatedTerms{/**The relationship Is A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsA\"}@Searchable.`/*`={\"fieldName\":\"isRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}isRelatedTerms:optional array[{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string}]/**The relationship Has A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasA\"}@Searchable.`/*`={\"fieldName\":\"hasRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}hasRelatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship Has Value with glossary term.\nThese are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasValue\"}@Searchable.`/*`={\"fieldName\":\"values\",\"fieldType\":\"URN\"}values:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship isRelatedTo with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsRelatedTo\"}@Searchable.`/*`={\"fieldName\":\"relatedTerms\",\"fieldType\":\"URN\"}relatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]}", SchemaFormatType.PDL));
    private GlossaryTermUrnArray _isRelatedTermsField = null;
    private GlossaryTermUrnArray _hasRelatedTermsField = null;
    private GlossaryTermUrnArray _valuesField = null;
    private GlossaryTermUrnArray _relatedTermsField = null;
    private GlossaryRelatedTerms.ChangeListener __changeListener = new GlossaryRelatedTerms.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_IsRelatedTerms = SCHEMA.getField("isRelatedTerms");
    private final static RecordDataSchema.Field FIELD_HasRelatedTerms = SCHEMA.getField("hasRelatedTerms");
    private final static RecordDataSchema.Field FIELD_Values = SCHEMA.getField("values");
    private final static RecordDataSchema.Field FIELD_RelatedTerms = SCHEMA.getField("relatedTerms");

    public GlossaryRelatedTerms() {
        super(new DataMap(6, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public GlossaryRelatedTerms(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlossaryRelatedTerms.Fields fields() {
        return _fields;
    }

    public static GlossaryRelatedTerms.ProjectionMask createMask() {
        return new GlossaryRelatedTerms.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public boolean hasIsRelatedTerms() {
        if (_isRelatedTermsField!= null) {
            return true;
        }
        return super._map.containsKey("isRelatedTerms");
    }

    /**
     * Remover for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public void removeIsRelatedTerms() {
        super._map.remove("isRelatedTerms");
    }

    /**
     * Getter for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getIsRelatedTerms(GetMode mode) {
        return getIsRelatedTerms();
    }

    /**
     * Getter for isRelatedTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getIsRelatedTerms() {
        if (_isRelatedTermsField!= null) {
            return _isRelatedTermsField;
        } else {
            Object __rawValue = super._map.get("isRelatedTerms");
            _isRelatedTermsField = ((__rawValue == null)?null:new GlossaryTermUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _isRelatedTermsField;
        }
    }

    /**
     * Setter for isRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public GlossaryRelatedTerms setIsRelatedTerms(
        @Nullable
        GlossaryTermUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsRelatedTerms(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsRelatedTerms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isRelatedTerms", value.data());
                    _isRelatedTermsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isRelatedTerms", value.data());
                    _isRelatedTermsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isRelatedTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryRelatedTerms.Fields#isRelatedTerms
     */
    public GlossaryRelatedTerms setIsRelatedTerms(
        @Nonnull
        GlossaryTermUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isRelatedTerms of com.linkedin.glossary.GlossaryRelatedTerms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isRelatedTerms", value.data());
            _isRelatedTermsField = value;
        }
        return this;
    }

    /**
     * Existence checker for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public boolean hasHasRelatedTerms() {
        if (_hasRelatedTermsField!= null) {
            return true;
        }
        return super._map.containsKey("hasRelatedTerms");
    }

    /**
     * Remover for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public void removeHasRelatedTerms() {
        super._map.remove("hasRelatedTerms");
    }

    /**
     * Getter for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getHasRelatedTerms(GetMode mode) {
        return getHasRelatedTerms();
    }

    /**
     * Getter for hasRelatedTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getHasRelatedTerms() {
        if (_hasRelatedTermsField!= null) {
            return _hasRelatedTermsField;
        } else {
            Object __rawValue = super._map.get("hasRelatedTerms");
            _hasRelatedTermsField = ((__rawValue == null)?null:new GlossaryTermUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _hasRelatedTermsField;
        }
    }

    /**
     * Setter for hasRelatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public GlossaryRelatedTerms setHasRelatedTerms(
        @Nullable
        GlossaryTermUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHasRelatedTerms(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHasRelatedTerms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hasRelatedTerms", value.data());
                    _hasRelatedTermsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hasRelatedTerms", value.data());
                    _hasRelatedTermsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hasRelatedTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryRelatedTerms.Fields#hasRelatedTerms
     */
    public GlossaryRelatedTerms setHasRelatedTerms(
        @Nonnull
        GlossaryTermUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hasRelatedTerms of com.linkedin.glossary.GlossaryRelatedTerms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hasRelatedTerms", value.data());
            _hasRelatedTermsField = value;
        }
        return this;
    }

    /**
     * Existence checker for values
     * 
     * @see GlossaryRelatedTerms.Fields#values
     */
    public boolean hasValues() {
        if (_valuesField!= null) {
            return true;
        }
        return super._map.containsKey("values");
    }

    /**
     * Remover for values
     * 
     * @see GlossaryRelatedTerms.Fields#values
     */
    public void removeValues() {
        super._map.remove("values");
    }

    /**
     * Getter for values
     * 
     * @see GlossaryRelatedTerms.Fields#values
     */
    @Nullable
    public GlossaryTermUrnArray getValues(GetMode mode) {
        return getValues();
    }

    /**
     * Getter for values
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryRelatedTerms.Fields#values
     */
    @Nullable
    public GlossaryTermUrnArray getValues() {
        if (_valuesField!= null) {
            return _valuesField;
        } else {
            Object __rawValue = super._map.get("values");
            _valuesField = ((__rawValue == null)?null:new GlossaryTermUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _valuesField;
        }
    }

    /**
     * Setter for values
     * 
     * @see GlossaryRelatedTerms.Fields#values
     */
    public GlossaryRelatedTerms setValues(
        @Nullable
        GlossaryTermUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for values
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryRelatedTerms.Fields#values
     */
    public GlossaryRelatedTerms setValues(
        @Nonnull
        GlossaryTermUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field values of com.linkedin.glossary.GlossaryRelatedTerms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "values", value.data());
            _valuesField = value;
        }
        return this;
    }

    /**
     * Existence checker for relatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#relatedTerms
     */
    public boolean hasRelatedTerms() {
        if (_relatedTermsField!= null) {
            return true;
        }
        return super._map.containsKey("relatedTerms");
    }

    /**
     * Remover for relatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#relatedTerms
     */
    public void removeRelatedTerms() {
        super._map.remove("relatedTerms");
    }

    /**
     * Getter for relatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#relatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getRelatedTerms(GetMode mode) {
        return getRelatedTerms();
    }

    /**
     * Getter for relatedTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryRelatedTerms.Fields#relatedTerms
     */
    @Nullable
    public GlossaryTermUrnArray getRelatedTerms() {
        if (_relatedTermsField!= null) {
            return _relatedTermsField;
        } else {
            Object __rawValue = super._map.get("relatedTerms");
            _relatedTermsField = ((__rawValue == null)?null:new GlossaryTermUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _relatedTermsField;
        }
    }

    /**
     * Setter for relatedTerms
     * 
     * @see GlossaryRelatedTerms.Fields#relatedTerms
     */
    public GlossaryRelatedTerms setRelatedTerms(
        @Nullable
        GlossaryTermUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelatedTerms(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelatedTerms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relatedTerms", value.data());
                    _relatedTermsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relatedTerms", value.data());
                    _relatedTermsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relatedTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryRelatedTerms.Fields#relatedTerms
     */
    public GlossaryRelatedTerms setRelatedTerms(
        @Nonnull
        GlossaryTermUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relatedTerms of com.linkedin.glossary.GlossaryRelatedTerms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relatedTerms", value.data());
            _relatedTermsField = value;
        }
        return this;
    }

    @Override
    public GlossaryRelatedTerms clone()
        throws CloneNotSupportedException
    {
        GlossaryRelatedTerms __clone = ((GlossaryRelatedTerms) super.clone());
        __clone.__changeListener = new GlossaryRelatedTerms.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryRelatedTerms copy()
        throws CloneNotSupportedException
    {
        GlossaryRelatedTerms __copy = ((GlossaryRelatedTerms) super.copy());
        __copy._hasRelatedTermsField = null;
        __copy._isRelatedTermsField = null;
        __copy._valuesField = null;
        __copy._relatedTermsField = null;
        __copy.__changeListener = new GlossaryRelatedTerms.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryRelatedTerms __objectRef;

        private ChangeListener(GlossaryRelatedTerms reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "hasRelatedTerms":
                    __objectRef._hasRelatedTermsField = null;
                    break;
                case "isRelatedTerms":
                    __objectRef._isRelatedTermsField = null;
                    break;
                case "values":
                    __objectRef._valuesField = null;
                    break;
                case "relatedTerms":
                    __objectRef._relatedTermsField = null;
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
         * The relationship Is A with glossary term
         * 
         */
        public PathSpec isRelatedTerms() {
            return new PathSpec(getPathComponents(), "isRelatedTerms");
        }

        /**
         * The relationship Is A with glossary term
         * 
         */
        public PathSpec isRelatedTerms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "isRelatedTerms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The relationship Has A with glossary term
         * 
         */
        public PathSpec hasRelatedTerms() {
            return new PathSpec(getPathComponents(), "hasRelatedTerms");
        }

        /**
         * The relationship Has A with glossary term
         * 
         */
        public PathSpec hasRelatedTerms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "hasRelatedTerms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The relationship Has Value with glossary term.
         * These are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.
         * 
         */
        public PathSpec values() {
            return new PathSpec(getPathComponents(), "values");
        }

        /**
         * The relationship Has Value with glossary term.
         * These are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.
         * 
         */
        public PathSpec values(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "values");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The relationship isRelatedTo with glossary term
         * 
         */
        public PathSpec relatedTerms() {
            return new PathSpec(getPathComponents(), "relatedTerms");
        }

        /**
         * The relationship isRelatedTo with glossary term
         * 
         */
        public PathSpec relatedTerms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "relatedTerms");
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
            super(6);
        }

        /**
         * The relationship Is A with glossary term
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withIsRelatedTerms() {
            getDataMap().put("isRelatedTerms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The relationship Is A with glossary term
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withIsRelatedTerms(Integer start, Integer count) {
            getDataMap().put("isRelatedTerms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("isRelatedTerms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("isRelatedTerms").put("$count", count);
            }
            return this;
        }

        /**
         * The relationship Has A with glossary term
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withHasRelatedTerms() {
            getDataMap().put("hasRelatedTerms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The relationship Has A with glossary term
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withHasRelatedTerms(Integer start, Integer count) {
            getDataMap().put("hasRelatedTerms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("hasRelatedTerms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("hasRelatedTerms").put("$count", count);
            }
            return this;
        }

        /**
         * The relationship Has Value with glossary term.
         * These are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withValues() {
            getDataMap().put("values", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The relationship Has Value with glossary term.
         * These are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withValues(Integer start, Integer count) {
            getDataMap().put("values", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("values").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("values").put("$count", count);
            }
            return this;
        }

        /**
         * The relationship isRelatedTo with glossary term
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withRelatedTerms() {
            getDataMap().put("relatedTerms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The relationship isRelatedTo with glossary term
         * 
         */
        public GlossaryRelatedTerms.ProjectionMask withRelatedTerms(Integer start, Integer count) {
            getDataMap().put("relatedTerms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("relatedTerms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relatedTerms").put("$count", count);
            }
            return this;
        }

    }

}
