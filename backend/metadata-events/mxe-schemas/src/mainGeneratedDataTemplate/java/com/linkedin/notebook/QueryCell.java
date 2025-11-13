
package com.linkedin.notebook;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.common.ChangeAuditStamps;
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
 * Query cell in a Notebook, which will present content in query format
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/notebook/QueryCell.pdl.")
public class QueryCell
    extends RecordTemplate
{

    private final static QueryCell.Fields _fields = new QueryCell.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.notebook/**Query cell in a Notebook, which will present content in query format*/record QueryCell includes/**Common attributes for a cell in a Notebook*/record CommonCellAttributes{/**Title of the cell*/cellTitle:optional string/**Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'*/cellId:string/**Captures information about who created/last modified/deleted this Notebook cell and when*/changeAuditStamps:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}}{/**Raw query to explain some specific logic in a Notebook*/rawQuery:string/**Captures information about who last executed this query cell and when*/lastExecuted:optional com.linkedin.common.AuditStamp}", SchemaFormatType.PDL));
    private String _cellTitleField = null;
    private String _cellIdField = null;
    private ChangeAuditStamps _changeAuditStampsField = null;
    private String _rawQueryField = null;
    private AuditStamp _lastExecutedField = null;
    private QueryCell.ChangeListener __changeListener = new QueryCell.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CellTitle = SCHEMA.getField("cellTitle");
    private final static RecordDataSchema.Field FIELD_CellId = SCHEMA.getField("cellId");
    private final static RecordDataSchema.Field FIELD_ChangeAuditStamps = SCHEMA.getField("changeAuditStamps");
    private final static RecordDataSchema.Field FIELD_RawQuery = SCHEMA.getField("rawQuery");
    private final static RecordDataSchema.Field FIELD_LastExecuted = SCHEMA.getField("lastExecuted");

    public QueryCell() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public QueryCell(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static QueryCell.Fields fields() {
        return _fields;
    }

    public static QueryCell.ProjectionMask createMask() {
        return new QueryCell.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for cellTitle
     * 
     * @see QueryCell.Fields#cellTitle
     */
    public boolean hasCellTitle() {
        if (_cellTitleField!= null) {
            return true;
        }
        return super._map.containsKey("cellTitle");
    }

    /**
     * Remover for cellTitle
     * 
     * @see QueryCell.Fields#cellTitle
     */
    public void removeCellTitle() {
        super._map.remove("cellTitle");
    }

    /**
     * Getter for cellTitle
     * 
     * @see QueryCell.Fields#cellTitle
     */
    @Nullable
    public String getCellTitle(GetMode mode) {
        return getCellTitle();
    }

    /**
     * Getter for cellTitle
     * 
     * @return
     *     Optional field. Always check for null.
     * @see QueryCell.Fields#cellTitle
     */
    @Nullable
    public String getCellTitle() {
        if (_cellTitleField!= null) {
            return _cellTitleField;
        } else {
            Object __rawValue = super._map.get("cellTitle");
            _cellTitleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _cellTitleField;
        }
    }

    /**
     * Setter for cellTitle
     * 
     * @see QueryCell.Fields#cellTitle
     */
    public QueryCell setCellTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCellTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCellTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cellTitle", value);
                    _cellTitleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cellTitle", value);
                    _cellTitleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cellTitle
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryCell.Fields#cellTitle
     */
    public QueryCell setCellTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cellTitle of com.linkedin.notebook.QueryCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cellTitle", value);
            _cellTitleField = value;
        }
        return this;
    }

    /**
     * Existence checker for cellId
     * 
     * @see QueryCell.Fields#cellId
     */
    public boolean hasCellId() {
        if (_cellIdField!= null) {
            return true;
        }
        return super._map.containsKey("cellId");
    }

    /**
     * Remover for cellId
     * 
     * @see QueryCell.Fields#cellId
     */
    public void removeCellId() {
        super._map.remove("cellId");
    }

    /**
     * Getter for cellId
     * 
     * @see QueryCell.Fields#cellId
     */
    @Nullable
    public String getCellId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCellId();
            case DEFAULT:
            case NULL:
                if (_cellIdField!= null) {
                    return _cellIdField;
                } else {
                    Object __rawValue = super._map.get("cellId");
                    _cellIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _cellIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cellId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QueryCell.Fields#cellId
     */
    @Nonnull
    public String getCellId() {
        if (_cellIdField!= null) {
            return _cellIdField;
        } else {
            Object __rawValue = super._map.get("cellId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("cellId");
            }
            _cellIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _cellIdField;
        }
    }

    /**
     * Setter for cellId
     * 
     * @see QueryCell.Fields#cellId
     */
    public QueryCell setCellId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCellId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field cellId of com.linkedin.notebook.QueryCell");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cellId", value);
                    _cellIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCellId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cellId", value);
                    _cellIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cellId", value);
                    _cellIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cellId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryCell.Fields#cellId
     */
    public QueryCell setCellId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cellId of com.linkedin.notebook.QueryCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cellId", value);
            _cellIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for changeAuditStamps
     * 
     * @see QueryCell.Fields#changeAuditStamps
     */
    public boolean hasChangeAuditStamps() {
        if (_changeAuditStampsField!= null) {
            return true;
        }
        return super._map.containsKey("changeAuditStamps");
    }

    /**
     * Remover for changeAuditStamps
     * 
     * @see QueryCell.Fields#changeAuditStamps
     */
    public void removeChangeAuditStamps() {
        super._map.remove("changeAuditStamps");
    }

    /**
     * Getter for changeAuditStamps
     * 
     * @see QueryCell.Fields#changeAuditStamps
     */
    @Nullable
    public ChangeAuditStamps getChangeAuditStamps(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getChangeAuditStamps();
            case DEFAULT:
            case NULL:
                if (_changeAuditStampsField!= null) {
                    return _changeAuditStampsField;
                } else {
                    Object __rawValue = super._map.get("changeAuditStamps");
                    _changeAuditStampsField = ((__rawValue == null)?null:new ChangeAuditStamps(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _changeAuditStampsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for changeAuditStamps
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QueryCell.Fields#changeAuditStamps
     */
    @Nonnull
    public ChangeAuditStamps getChangeAuditStamps() {
        if (_changeAuditStampsField!= null) {
            return _changeAuditStampsField;
        } else {
            Object __rawValue = super._map.get("changeAuditStamps");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("changeAuditStamps");
            }
            _changeAuditStampsField = ((__rawValue == null)?null:new ChangeAuditStamps(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _changeAuditStampsField;
        }
    }

    /**
     * Setter for changeAuditStamps
     * 
     * @see QueryCell.Fields#changeAuditStamps
     */
    public QueryCell setChangeAuditStamps(
        @Nullable
        ChangeAuditStamps value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChangeAuditStamps(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field changeAuditStamps of com.linkedin.notebook.QueryCell");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
                    _changeAuditStampsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChangeAuditStamps();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
                    _changeAuditStampsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
                    _changeAuditStampsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for changeAuditStamps
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryCell.Fields#changeAuditStamps
     */
    public QueryCell setChangeAuditStamps(
        @Nonnull
        ChangeAuditStamps value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field changeAuditStamps of com.linkedin.notebook.QueryCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
            _changeAuditStampsField = value;
        }
        return this;
    }

    /**
     * Existence checker for rawQuery
     * 
     * @see QueryCell.Fields#rawQuery
     */
    public boolean hasRawQuery() {
        if (_rawQueryField!= null) {
            return true;
        }
        return super._map.containsKey("rawQuery");
    }

    /**
     * Remover for rawQuery
     * 
     * @see QueryCell.Fields#rawQuery
     */
    public void removeRawQuery() {
        super._map.remove("rawQuery");
    }

    /**
     * Getter for rawQuery
     * 
     * @see QueryCell.Fields#rawQuery
     */
    @Nullable
    public String getRawQuery(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRawQuery();
            case DEFAULT:
            case NULL:
                if (_rawQueryField!= null) {
                    return _rawQueryField;
                } else {
                    Object __rawValue = super._map.get("rawQuery");
                    _rawQueryField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _rawQueryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rawQuery
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QueryCell.Fields#rawQuery
     */
    @Nonnull
    public String getRawQuery() {
        if (_rawQueryField!= null) {
            return _rawQueryField;
        } else {
            Object __rawValue = super._map.get("rawQuery");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("rawQuery");
            }
            _rawQueryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _rawQueryField;
        }
    }

    /**
     * Setter for rawQuery
     * 
     * @see QueryCell.Fields#rawQuery
     */
    public QueryCell setRawQuery(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRawQuery(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rawQuery of com.linkedin.notebook.QueryCell");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
                    _rawQueryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRawQuery();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
                    _rawQueryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
                    _rawQueryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rawQuery
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryCell.Fields#rawQuery
     */
    public QueryCell setRawQuery(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rawQuery of com.linkedin.notebook.QueryCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
            _rawQueryField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastExecuted
     * 
     * @see QueryCell.Fields#lastExecuted
     */
    public boolean hasLastExecuted() {
        if (_lastExecutedField!= null) {
            return true;
        }
        return super._map.containsKey("lastExecuted");
    }

    /**
     * Remover for lastExecuted
     * 
     * @see QueryCell.Fields#lastExecuted
     */
    public void removeLastExecuted() {
        super._map.remove("lastExecuted");
    }

    /**
     * Getter for lastExecuted
     * 
     * @see QueryCell.Fields#lastExecuted
     */
    @Nullable
    public AuditStamp getLastExecuted(GetMode mode) {
        return getLastExecuted();
    }

    /**
     * Getter for lastExecuted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see QueryCell.Fields#lastExecuted
     */
    @Nullable
    public AuditStamp getLastExecuted() {
        if (_lastExecutedField!= null) {
            return _lastExecutedField;
        } else {
            Object __rawValue = super._map.get("lastExecuted");
            _lastExecutedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastExecutedField;
        }
    }

    /**
     * Setter for lastExecuted
     * 
     * @see QueryCell.Fields#lastExecuted
     */
    public QueryCell setLastExecuted(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastExecuted(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastExecuted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastExecuted", value.data());
                    _lastExecutedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastExecuted", value.data());
                    _lastExecutedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastExecuted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QueryCell.Fields#lastExecuted
     */
    public QueryCell setLastExecuted(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastExecuted of com.linkedin.notebook.QueryCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastExecuted", value.data());
            _lastExecutedField = value;
        }
        return this;
    }

    @Override
    public QueryCell clone()
        throws CloneNotSupportedException
    {
        QueryCell __clone = ((QueryCell) super.clone());
        __clone.__changeListener = new QueryCell.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public QueryCell copy()
        throws CloneNotSupportedException
    {
        QueryCell __copy = ((QueryCell) super.copy());
        __copy._changeAuditStampsField = null;
        __copy._cellIdField = null;
        __copy._lastExecutedField = null;
        __copy._cellTitleField = null;
        __copy._rawQueryField = null;
        __copy.__changeListener = new QueryCell.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final QueryCell __objectRef;

        private ChangeListener(QueryCell reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "changeAuditStamps":
                    __objectRef._changeAuditStampsField = null;
                    break;
                case "cellId":
                    __objectRef._cellIdField = null;
                    break;
                case "lastExecuted":
                    __objectRef._lastExecutedField = null;
                    break;
                case "cellTitle":
                    __objectRef._cellTitleField = null;
                    break;
                case "rawQuery":
                    __objectRef._rawQueryField = null;
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
         * Title of the cell
         * 
         */
        public PathSpec cellTitle() {
            return new PathSpec(getPathComponents(), "cellTitle");
        }

        /**
         * Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'
         * 
         */
        public PathSpec cellId() {
            return new PathSpec(getPathComponents(), "cellId");
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public com.linkedin.common.ChangeAuditStamps.Fields changeAuditStamps() {
            return new com.linkedin.common.ChangeAuditStamps.Fields(getPathComponents(), "changeAuditStamps");
        }

        /**
         * Raw query to explain some specific logic in a Notebook
         * 
         */
        public PathSpec rawQuery() {
            return new PathSpec(getPathComponents(), "rawQuery");
        }

        /**
         * Captures information about who last executed this query cell and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastExecuted() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastExecuted");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.ChangeAuditStamps.ProjectionMask _changeAuditStampsMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastExecutedMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Title of the cell
         * 
         */
        public QueryCell.ProjectionMask withCellTitle() {
            getDataMap().put("cellTitle", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'
         * 
         */
        public QueryCell.ProjectionMask withCellId() {
            getDataMap().put("cellId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public QueryCell.ProjectionMask withChangeAuditStamps(Function<com.linkedin.common.ChangeAuditStamps.ProjectionMask, com.linkedin.common.ChangeAuditStamps.ProjectionMask> nestedMask) {
            _changeAuditStampsMask = nestedMask.apply(((_changeAuditStampsMask == null)?ChangeAuditStamps.createMask():_changeAuditStampsMask));
            getDataMap().put("changeAuditStamps", _changeAuditStampsMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public QueryCell.ProjectionMask withChangeAuditStamps(MaskMap nestedMask) {
            getDataMap().put("changeAuditStamps", nestedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public QueryCell.ProjectionMask withChangeAuditStamps() {
            _changeAuditStampsMask = null;
            getDataMap().put("changeAuditStamps", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Raw query to explain some specific logic in a Notebook
         * 
         */
        public QueryCell.ProjectionMask withRawQuery() {
            getDataMap().put("rawQuery", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Captures information about who last executed this query cell and when
         * 
         */
        public QueryCell.ProjectionMask withLastExecuted(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastExecutedMask = nestedMask.apply(((_lastExecutedMask == null)?AuditStamp.createMask():_lastExecutedMask));
            getDataMap().put("lastExecuted", _lastExecutedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who last executed this query cell and when
         * 
         */
        public QueryCell.ProjectionMask withLastExecuted(MaskMap nestedMask) {
            getDataMap().put("lastExecuted", nestedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who last executed this query cell and when
         * 
         */
        public QueryCell.ProjectionMask withLastExecuted() {
            _lastExecutedMask = null;
            getDataMap().put("lastExecuted", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
