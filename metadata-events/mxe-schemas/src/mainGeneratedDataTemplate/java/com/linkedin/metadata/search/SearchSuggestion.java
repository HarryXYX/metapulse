
package com.linkedin.metadata.search;

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
 * The model for the search result
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchSuggestion.pdl.")
public class SearchSuggestion
    extends RecordTemplate
{

    private final static SearchSuggestion.Fields _fields = new SearchSuggestion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for the search result*/record SearchSuggestion{/**The suggestion text for this search query*/text:string/**The score for how close this suggestion is to the original search query.\nThe closer to 1 means it is closer to the original query and 0 is further away.*/score:float/**How many matches there are with the suggested text for the given field*/frequency:long}", SchemaFormatType.PDL));
    private String _textField = null;
    private Float _scoreField = null;
    private Long _frequencyField = null;
    private SearchSuggestion.ChangeListener __changeListener = new SearchSuggestion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Text = SCHEMA.getField("text");
    private final static RecordDataSchema.Field FIELD_Score = SCHEMA.getField("score");
    private final static RecordDataSchema.Field FIELD_Frequency = SCHEMA.getField("frequency");

    public SearchSuggestion() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SearchSuggestion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SearchSuggestion.Fields fields() {
        return _fields;
    }

    public static SearchSuggestion.ProjectionMask createMask() {
        return new SearchSuggestion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for text
     * 
     * @see SearchSuggestion.Fields#text
     */
    public boolean hasText() {
        if (_textField!= null) {
            return true;
        }
        return super._map.containsKey("text");
    }

    /**
     * Remover for text
     * 
     * @see SearchSuggestion.Fields#text
     */
    public void removeText() {
        super._map.remove("text");
    }

    /**
     * Getter for text
     * 
     * @see SearchSuggestion.Fields#text
     */
    @Nullable
    public String getText(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getText();
            case DEFAULT:
            case NULL:
                if (_textField!= null) {
                    return _textField;
                } else {
                    Object __rawValue = super._map.get("text");
                    _textField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _textField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for text
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchSuggestion.Fields#text
     */
    @Nonnull
    public String getText() {
        if (_textField!= null) {
            return _textField;
        } else {
            Object __rawValue = super._map.get("text");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("text");
            }
            _textField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _textField;
        }
    }

    /**
     * Setter for text
     * 
     * @see SearchSuggestion.Fields#text
     */
    public SearchSuggestion setText(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setText(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field text of com.linkedin.metadata.search.SearchSuggestion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "text", value);
                    _textField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeText();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "text", value);
                    _textField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "text", value);
                    _textField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for text
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchSuggestion.Fields#text
     */
    public SearchSuggestion setText(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field text of com.linkedin.metadata.search.SearchSuggestion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "text", value);
            _textField = value;
        }
        return this;
    }

    /**
     * Existence checker for score
     * 
     * @see SearchSuggestion.Fields#score
     */
    public boolean hasScore() {
        if (_scoreField!= null) {
            return true;
        }
        return super._map.containsKey("score");
    }

    /**
     * Remover for score
     * 
     * @see SearchSuggestion.Fields#score
     */
    public void removeScore() {
        super._map.remove("score");
    }

    /**
     * Getter for score
     * 
     * @see SearchSuggestion.Fields#score
     */
    @Nullable
    public Float getScore(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getScore();
            case DEFAULT:
            case NULL:
                if (_scoreField!= null) {
                    return _scoreField;
                } else {
                    Object __rawValue = super._map.get("score");
                    _scoreField = DataTemplateUtil.coerceFloatOutput(__rawValue);
                    return _scoreField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for score
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchSuggestion.Fields#score
     */
    @Nonnull
    public Float getScore() {
        if (_scoreField!= null) {
            return _scoreField;
        } else {
            Object __rawValue = super._map.get("score");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("score");
            }
            _scoreField = DataTemplateUtil.coerceFloatOutput(__rawValue);
            return _scoreField;
        }
    }

    /**
     * Setter for score
     * 
     * @see SearchSuggestion.Fields#score
     */
    public SearchSuggestion setScore(
        @Nullable
        Float value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScore(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field score of com.linkedin.metadata.search.SearchSuggestion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceFloatInput(value));
                    _scoreField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScore();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceFloatInput(value));
                    _scoreField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceFloatInput(value));
                    _scoreField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for score
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchSuggestion.Fields#score
     */
    public SearchSuggestion setScore(
        @Nonnull
        Float value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field score of com.linkedin.metadata.search.SearchSuggestion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceFloatInput(value));
            _scoreField = value;
        }
        return this;
    }

    /**
     * Setter for score
     * 
     * @see SearchSuggestion.Fields#score
     */
    public SearchSuggestion setScore(float value) {
        CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceFloatInput(value));
        _scoreField = value;
        return this;
    }

    /**
     * Existence checker for frequency
     * 
     * @see SearchSuggestion.Fields#frequency
     */
    public boolean hasFrequency() {
        if (_frequencyField!= null) {
            return true;
        }
        return super._map.containsKey("frequency");
    }

    /**
     * Remover for frequency
     * 
     * @see SearchSuggestion.Fields#frequency
     */
    public void removeFrequency() {
        super._map.remove("frequency");
    }

    /**
     * Getter for frequency
     * 
     * @see SearchSuggestion.Fields#frequency
     */
    @Nullable
    public Long getFrequency(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFrequency();
            case DEFAULT:
            case NULL:
                if (_frequencyField!= null) {
                    return _frequencyField;
                } else {
                    Object __rawValue = super._map.get("frequency");
                    _frequencyField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _frequencyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for frequency
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchSuggestion.Fields#frequency
     */
    @Nonnull
    public Long getFrequency() {
        if (_frequencyField!= null) {
            return _frequencyField;
        } else {
            Object __rawValue = super._map.get("frequency");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("frequency");
            }
            _frequencyField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _frequencyField;
        }
    }

    /**
     * Setter for frequency
     * 
     * @see SearchSuggestion.Fields#frequency
     */
    public SearchSuggestion setFrequency(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFrequency(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field frequency of com.linkedin.metadata.search.SearchSuggestion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
                    _frequencyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFrequency();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
                    _frequencyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
                    _frequencyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for frequency
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchSuggestion.Fields#frequency
     */
    public SearchSuggestion setFrequency(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field frequency of com.linkedin.metadata.search.SearchSuggestion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
            _frequencyField = value;
        }
        return this;
    }

    /**
     * Setter for frequency
     * 
     * @see SearchSuggestion.Fields#frequency
     */
    public SearchSuggestion setFrequency(long value) {
        CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
        _frequencyField = value;
        return this;
    }

    @Override
    public SearchSuggestion clone()
        throws CloneNotSupportedException
    {
        SearchSuggestion __clone = ((SearchSuggestion) super.clone());
        __clone.__changeListener = new SearchSuggestion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SearchSuggestion copy()
        throws CloneNotSupportedException
    {
        SearchSuggestion __copy = ((SearchSuggestion) super.copy());
        __copy._scoreField = null;
        __copy._textField = null;
        __copy._frequencyField = null;
        __copy.__changeListener = new SearchSuggestion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SearchSuggestion __objectRef;

        private ChangeListener(SearchSuggestion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "score":
                    __objectRef._scoreField = null;
                    break;
                case "text":
                    __objectRef._textField = null;
                    break;
                case "frequency":
                    __objectRef._frequencyField = null;
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
         * The suggestion text for this search query
         * 
         */
        public PathSpec text() {
            return new PathSpec(getPathComponents(), "text");
        }

        /**
         * The score for how close this suggestion is to the original search query.
         * The closer to 1 means it is closer to the original query and 0 is further away.
         * 
         */
        public PathSpec score() {
            return new PathSpec(getPathComponents(), "score");
        }

        /**
         * How many matches there are with the suggested text for the given field
         * 
         */
        public PathSpec frequency() {
            return new PathSpec(getPathComponents(), "frequency");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * The suggestion text for this search query
         * 
         */
        public SearchSuggestion.ProjectionMask withText() {
            getDataMap().put("text", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The score for how close this suggestion is to the original search query.
         * The closer to 1 means it is closer to the original query and 0 is further away.
         * 
         */
        public SearchSuggestion.ProjectionMask withScore() {
            getDataMap().put("score", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * How many matches there are with the suggested text for the given field
         * 
         */
        public SearchSuggestion.ProjectionMask withFrequency() {
            getDataMap().put("frequency", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
