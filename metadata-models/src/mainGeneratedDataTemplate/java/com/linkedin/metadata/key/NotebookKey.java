
package com.linkedin.metadata.key;

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
 * Key for a Notebook
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/NotebookKey.pdl.")
public class NotebookKey
    extends RecordTemplate
{

    private final static NotebookKey.Fields _fields = new NotebookKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Notebook*/@Aspect.name=\"notebookKey\"record NotebookKey{/**The name of the Notebook tool such as QueryBook, etc.*/notebookTool:string/**Unique id for the Notebook. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773'*/notebookId:string}", SchemaFormatType.PDL));
    private String _notebookToolField = null;
    private String _notebookIdField = null;
    private NotebookKey.ChangeListener __changeListener = new NotebookKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_NotebookTool = SCHEMA.getField("notebookTool");
    private final static RecordDataSchema.Field FIELD_NotebookId = SCHEMA.getField("notebookId");

    public NotebookKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public NotebookKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static NotebookKey.Fields fields() {
        return _fields;
    }

    public static NotebookKey.ProjectionMask createMask() {
        return new NotebookKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for notebookTool
     * 
     * @see NotebookKey.Fields#notebookTool
     */
    public boolean hasNotebookTool() {
        if (_notebookToolField!= null) {
            return true;
        }
        return super._map.containsKey("notebookTool");
    }

    /**
     * Remover for notebookTool
     * 
     * @see NotebookKey.Fields#notebookTool
     */
    public void removeNotebookTool() {
        super._map.remove("notebookTool");
    }

    /**
     * Getter for notebookTool
     * 
     * @see NotebookKey.Fields#notebookTool
     */
    @Nullable
    public String getNotebookTool(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNotebookTool();
            case DEFAULT:
            case NULL:
                if (_notebookToolField!= null) {
                    return _notebookToolField;
                } else {
                    Object __rawValue = super._map.get("notebookTool");
                    _notebookToolField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _notebookToolField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for notebookTool
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see NotebookKey.Fields#notebookTool
     */
    @Nonnull
    public String getNotebookTool() {
        if (_notebookToolField!= null) {
            return _notebookToolField;
        } else {
            Object __rawValue = super._map.get("notebookTool");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("notebookTool");
            }
            _notebookToolField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _notebookToolField;
        }
    }

    /**
     * Setter for notebookTool
     * 
     * @see NotebookKey.Fields#notebookTool
     */
    public NotebookKey setNotebookTool(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNotebookTool(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field notebookTool of com.linkedin.metadata.key.NotebookKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "notebookTool", value);
                    _notebookToolField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNotebookTool();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "notebookTool", value);
                    _notebookToolField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "notebookTool", value);
                    _notebookToolField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for notebookTool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotebookKey.Fields#notebookTool
     */
    public NotebookKey setNotebookTool(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field notebookTool of com.linkedin.metadata.key.NotebookKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "notebookTool", value);
            _notebookToolField = value;
        }
        return this;
    }

    /**
     * Existence checker for notebookId
     * 
     * @see NotebookKey.Fields#notebookId
     */
    public boolean hasNotebookId() {
        if (_notebookIdField!= null) {
            return true;
        }
        return super._map.containsKey("notebookId");
    }

    /**
     * Remover for notebookId
     * 
     * @see NotebookKey.Fields#notebookId
     */
    public void removeNotebookId() {
        super._map.remove("notebookId");
    }

    /**
     * Getter for notebookId
     * 
     * @see NotebookKey.Fields#notebookId
     */
    @Nullable
    public String getNotebookId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNotebookId();
            case DEFAULT:
            case NULL:
                if (_notebookIdField!= null) {
                    return _notebookIdField;
                } else {
                    Object __rawValue = super._map.get("notebookId");
                    _notebookIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _notebookIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for notebookId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see NotebookKey.Fields#notebookId
     */
    @Nonnull
    public String getNotebookId() {
        if (_notebookIdField!= null) {
            return _notebookIdField;
        } else {
            Object __rawValue = super._map.get("notebookId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("notebookId");
            }
            _notebookIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _notebookIdField;
        }
    }

    /**
     * Setter for notebookId
     * 
     * @see NotebookKey.Fields#notebookId
     */
    public NotebookKey setNotebookId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNotebookId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field notebookId of com.linkedin.metadata.key.NotebookKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "notebookId", value);
                    _notebookIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNotebookId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "notebookId", value);
                    _notebookIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "notebookId", value);
                    _notebookIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for notebookId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotebookKey.Fields#notebookId
     */
    public NotebookKey setNotebookId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field notebookId of com.linkedin.metadata.key.NotebookKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "notebookId", value);
            _notebookIdField = value;
        }
        return this;
    }

    @Override
    public NotebookKey clone()
        throws CloneNotSupportedException
    {
        NotebookKey __clone = ((NotebookKey) super.clone());
        __clone.__changeListener = new NotebookKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public NotebookKey copy()
        throws CloneNotSupportedException
    {
        NotebookKey __copy = ((NotebookKey) super.copy());
        __copy._notebookToolField = null;
        __copy._notebookIdField = null;
        __copy.__changeListener = new NotebookKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final NotebookKey __objectRef;

        private ChangeListener(NotebookKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "notebookTool":
                    __objectRef._notebookToolField = null;
                    break;
                case "notebookId":
                    __objectRef._notebookIdField = null;
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
         * The name of the Notebook tool such as QueryBook, etc.
         * 
         */
        public PathSpec notebookTool() {
            return new PathSpec(getPathComponents(), "notebookTool");
        }

        /**
         * Unique id for the Notebook. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773'
         * 
         */
        public PathSpec notebookId() {
            return new PathSpec(getPathComponents(), "notebookId");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The name of the Notebook tool such as QueryBook, etc.
         * 
         */
        public NotebookKey.ProjectionMask withNotebookTool() {
            getDataMap().put("notebookTool", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique id for the Notebook. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773'
         * 
         */
        public NotebookKey.ProjectionMask withNotebookId() {
            getDataMap().put("notebookId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
