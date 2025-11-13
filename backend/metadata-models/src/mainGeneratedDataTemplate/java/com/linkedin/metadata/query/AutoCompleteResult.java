
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
import com.linkedin.data.template.StringArray;


/**
 * The model for the auto complete result
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/AutoCompleteResult.pdl.")
public class AutoCompleteResult
    extends RecordTemplate
{

    private final static AutoCompleteResult.Fields _fields = new AutoCompleteResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**The model for the auto complete result*/record AutoCompleteResult{/**The original chars typed by user*/query:string/**A list of typeahead suggestions -- Just the text*/suggestions:array[string]/**Specific entities to recommend*/entities:array[/**Data model for an entity returned as an autocomplete suggestion*/record AutoCompleteEntity{/**Urn of the entity*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]}", SchemaFormatType.PDL));
    private String _queryField = null;
    private StringArray _suggestionsField = null;
    private AutoCompleteEntityArray _entitiesField = null;
    private AutoCompleteResult.ChangeListener __changeListener = new AutoCompleteResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Query = SCHEMA.getField("query");
    private final static RecordDataSchema.Field FIELD_Suggestions = SCHEMA.getField("suggestions");
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");

    public AutoCompleteResult() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public AutoCompleteResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AutoCompleteResult.Fields fields() {
        return _fields;
    }

    public static AutoCompleteResult.ProjectionMask createMask() {
        return new AutoCompleteResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for query
     * 
     * @see AutoCompleteResult.Fields#query
     */
    public boolean hasQuery() {
        if (_queryField!= null) {
            return true;
        }
        return super._map.containsKey("query");
    }

    /**
     * Remover for query
     * 
     * @see AutoCompleteResult.Fields#query
     */
    public void removeQuery() {
        super._map.remove("query");
    }

    /**
     * Getter for query
     * 
     * @see AutoCompleteResult.Fields#query
     */
    @Nullable
    public String getQuery(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getQuery();
            case DEFAULT:
            case NULL:
                if (_queryField!= null) {
                    return _queryField;
                } else {
                    Object __rawValue = super._map.get("query");
                    _queryField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _queryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for query
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AutoCompleteResult.Fields#query
     */
    @Nonnull
    public String getQuery() {
        if (_queryField!= null) {
            return _queryField;
        } else {
            Object __rawValue = super._map.get("query");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("query");
            }
            _queryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _queryField;
        }
    }

    /**
     * Setter for query
     * 
     * @see AutoCompleteResult.Fields#query
     */
    public AutoCompleteResult setQuery(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQuery(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field query of com.linkedin.metadata.query.AutoCompleteResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQuery();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for query
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AutoCompleteResult.Fields#query
     */
    public AutoCompleteResult setQuery(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field query of com.linkedin.metadata.query.AutoCompleteResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "query", value);
            _queryField = value;
        }
        return this;
    }

    /**
     * Existence checker for suggestions
     * 
     * @see AutoCompleteResult.Fields#suggestions
     */
    public boolean hasSuggestions() {
        if (_suggestionsField!= null) {
            return true;
        }
        return super._map.containsKey("suggestions");
    }

    /**
     * Remover for suggestions
     * 
     * @see AutoCompleteResult.Fields#suggestions
     */
    public void removeSuggestions() {
        super._map.remove("suggestions");
    }

    /**
     * Getter for suggestions
     * 
     * @see AutoCompleteResult.Fields#suggestions
     */
    @Nullable
    public StringArray getSuggestions(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSuggestions();
            case DEFAULT:
            case NULL:
                if (_suggestionsField!= null) {
                    return _suggestionsField;
                } else {
                    Object __rawValue = super._map.get("suggestions");
                    _suggestionsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _suggestionsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for suggestions
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AutoCompleteResult.Fields#suggestions
     */
    @Nonnull
    public StringArray getSuggestions() {
        if (_suggestionsField!= null) {
            return _suggestionsField;
        } else {
            Object __rawValue = super._map.get("suggestions");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("suggestions");
            }
            _suggestionsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _suggestionsField;
        }
    }

    /**
     * Setter for suggestions
     * 
     * @see AutoCompleteResult.Fields#suggestions
     */
    public AutoCompleteResult setSuggestions(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSuggestions(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field suggestions of com.linkedin.metadata.query.AutoCompleteResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
                    _suggestionsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSuggestions();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
                    _suggestionsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
                    _suggestionsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for suggestions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AutoCompleteResult.Fields#suggestions
     */
    public AutoCompleteResult setSuggestions(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field suggestions of com.linkedin.metadata.query.AutoCompleteResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
            _suggestionsField = value;
        }
        return this;
    }

    /**
     * Existence checker for entities
     * 
     * @see AutoCompleteResult.Fields#entities
     */
    public boolean hasEntities() {
        if (_entitiesField!= null) {
            return true;
        }
        return super._map.containsKey("entities");
    }

    /**
     * Remover for entities
     * 
     * @see AutoCompleteResult.Fields#entities
     */
    public void removeEntities() {
        super._map.remove("entities");
    }

    /**
     * Getter for entities
     * 
     * @see AutoCompleteResult.Fields#entities
     */
    @Nullable
    public AutoCompleteEntityArray getEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntities();
            case DEFAULT:
            case NULL:
                if (_entitiesField!= null) {
                    return _entitiesField;
                } else {
                    Object __rawValue = super._map.get("entities");
                    _entitiesField = ((__rawValue == null)?null:new AutoCompleteEntityArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _entitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AutoCompleteResult.Fields#entities
     */
    @Nonnull
    public AutoCompleteEntityArray getEntities() {
        if (_entitiesField!= null) {
            return _entitiesField;
        } else {
            Object __rawValue = super._map.get("entities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entities");
            }
            _entitiesField = ((__rawValue == null)?null:new AutoCompleteEntityArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _entitiesField;
        }
    }

    /**
     * Setter for entities
     * 
     * @see AutoCompleteResult.Fields#entities
     */
    public AutoCompleteResult setEntities(
        @Nullable
        AutoCompleteEntityArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entities of com.linkedin.metadata.query.AutoCompleteResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AutoCompleteResult.Fields#entities
     */
    public AutoCompleteResult setEntities(
        @Nonnull
        AutoCompleteEntityArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entities of com.linkedin.metadata.query.AutoCompleteResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
            _entitiesField = value;
        }
        return this;
    }

    @Override
    public AutoCompleteResult clone()
        throws CloneNotSupportedException
    {
        AutoCompleteResult __clone = ((AutoCompleteResult) super.clone());
        __clone.__changeListener = new AutoCompleteResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AutoCompleteResult copy()
        throws CloneNotSupportedException
    {
        AutoCompleteResult __copy = ((AutoCompleteResult) super.copy());
        __copy._entitiesField = null;
        __copy._queryField = null;
        __copy._suggestionsField = null;
        __copy.__changeListener = new AutoCompleteResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AutoCompleteResult __objectRef;

        private ChangeListener(AutoCompleteResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "entities":
                    __objectRef._entitiesField = null;
                    break;
                case "query":
                    __objectRef._queryField = null;
                    break;
                case "suggestions":
                    __objectRef._suggestionsField = null;
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
         * The original chars typed by user
         * 
         */
        public PathSpec query() {
            return new PathSpec(getPathComponents(), "query");
        }

        /**
         * A list of typeahead suggestions -- Just the text
         * 
         */
        public PathSpec suggestions() {
            return new PathSpec(getPathComponents(), "suggestions");
        }

        /**
         * A list of typeahead suggestions -- Just the text
         * 
         */
        public PathSpec suggestions(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "suggestions");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Specific entities to recommend
         * 
         */
        public com.linkedin.metadata.query.AutoCompleteEntityArray.Fields entities() {
            return new com.linkedin.metadata.query.AutoCompleteEntityArray.Fields(getPathComponents(), "entities");
        }

        /**
         * Specific entities to recommend
         * 
         */
        public PathSpec entities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entities");
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

        private com.linkedin.metadata.query.AutoCompleteEntityArray.ProjectionMask _entitiesMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The original chars typed by user
         * 
         */
        public AutoCompleteResult.ProjectionMask withQuery() {
            getDataMap().put("query", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of typeahead suggestions -- Just the text
         * 
         */
        public AutoCompleteResult.ProjectionMask withSuggestions() {
            getDataMap().put("suggestions", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of typeahead suggestions -- Just the text
         * 
         */
        public AutoCompleteResult.ProjectionMask withSuggestions(Integer start, Integer count) {
            getDataMap().put("suggestions", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("suggestions").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("suggestions").put("$count", count);
            }
            return this;
        }

        /**
         * Specific entities to recommend
         * 
         */
        public AutoCompleteResult.ProjectionMask withEntities(Function<com.linkedin.metadata.query.AutoCompleteEntityArray.ProjectionMask, com.linkedin.metadata.query.AutoCompleteEntityArray.ProjectionMask> nestedMask) {
            _entitiesMask = nestedMask.apply(((_entitiesMask == null)?AutoCompleteEntityArray.createMask():_entitiesMask));
            getDataMap().put("entities", _entitiesMask.getDataMap());
            return this;
        }

        /**
         * Specific entities to recommend
         * 
         */
        public AutoCompleteResult.ProjectionMask withEntities() {
            _entitiesMask = null;
            getDataMap().put("entities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Specific entities to recommend
         * 
         */
        public AutoCompleteResult.ProjectionMask withEntities(Function<com.linkedin.metadata.query.AutoCompleteEntityArray.ProjectionMask, com.linkedin.metadata.query.AutoCompleteEntityArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _entitiesMask = nestedMask.apply(((_entitiesMask == null)?AutoCompleteEntityArray.createMask():_entitiesMask));
            getDataMap().put("entities", _entitiesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("entities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entities").put("$count", count);
            }
            return this;
        }

        /**
         * Specific entities to recommend
         * 
         */
        public AutoCompleteResult.ProjectionMask withEntities(Integer start, Integer count) {
            _entitiesMask = null;
            getDataMap().put("entities", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("entities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entities").put("$count", count);
            }
            return this;
        }

    }

}
