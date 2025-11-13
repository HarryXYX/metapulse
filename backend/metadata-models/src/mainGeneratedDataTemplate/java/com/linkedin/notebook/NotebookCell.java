
package com.linkedin.notebook;

import java.util.List;
import java.util.function.Function;
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
 * A record of all supported cells for a Notebook. Only one type of cell will be non-null.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/notebook/NotebookCell.pdl.")
public class NotebookCell
    extends RecordTemplate
{

    private final static NotebookCell.Fields _fields = new NotebookCell.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.notebook/**A record of all supported cells for a Notebook. Only one type of cell will be non-null.*/record NotebookCell{/**The text cell content. The will be non-null only when all other cell field is null.*/textCell:optional/**Text cell in a Notebook, which will present content in text format*/record TextCell includes/**Common attributes for a cell in a Notebook*/record CommonCellAttributes{/**Title of the cell*/cellTitle:optional string/**Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'*/cellId:string/**Captures information about who created/last modified/deleted this Notebook cell and when*/changeAuditStamps:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}}{/**The actual text in a TextCell in a Notebook*/text:string}/**The query cell content. The will be non-null only when all other cell field is null.*/queryCell:optional/**Query cell in a Notebook, which will present content in query format*/record QueryCell includes CommonCellAttributes{/**Raw query to explain some specific logic in a Notebook*/rawQuery:string/**Captures information about who last executed this query cell and when*/lastExecuted:optional com.linkedin.common.AuditStamp}/**The chart cell content. The will be non-null only when all other cell field is null.*/chartCell:optional/**Chart cell in a notebook, which will present content in chart format*/record ChartCell includes CommonCellAttributes{}/**The type of this Notebook cell*/type:/**Type of Notebook Cell*/enum NotebookCellType{/**TEXT Notebook cell type. The cell context is text only.*/TEXT_CELL/**QUERY Notebook cell type. The cell context is query only.*/QUERY_CELL/**CHART Notebook cell type. The cell content is chart only.*/CHART_CELL}}", SchemaFormatType.PDL));
    private TextCell _textCellField = null;
    private QueryCell _queryCellField = null;
    private ChartCell _chartCellField = null;
    private NotebookCellType _typeField = null;
    private NotebookCell.ChangeListener __changeListener = new NotebookCell.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TextCell = SCHEMA.getField("textCell");
    private final static RecordDataSchema.Field FIELD_QueryCell = SCHEMA.getField("queryCell");
    private final static RecordDataSchema.Field FIELD_ChartCell = SCHEMA.getField("chartCell");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    public NotebookCell() {
        super(new DataMap(6, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public NotebookCell(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static NotebookCell.Fields fields() {
        return _fields;
    }

    public static NotebookCell.ProjectionMask createMask() {
        return new NotebookCell.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for textCell
     * 
     * @see NotebookCell.Fields#textCell
     */
    public boolean hasTextCell() {
        if (_textCellField!= null) {
            return true;
        }
        return super._map.containsKey("textCell");
    }

    /**
     * Remover for textCell
     * 
     * @see NotebookCell.Fields#textCell
     */
    public void removeTextCell() {
        super._map.remove("textCell");
    }

    /**
     * Getter for textCell
     * 
     * @see NotebookCell.Fields#textCell
     */
    @Nullable
    public TextCell getTextCell(GetMode mode) {
        return getTextCell();
    }

    /**
     * Getter for textCell
     * 
     * @return
     *     Optional field. Always check for null.
     * @see NotebookCell.Fields#textCell
     */
    @Nullable
    public TextCell getTextCell() {
        if (_textCellField!= null) {
            return _textCellField;
        } else {
            Object __rawValue = super._map.get("textCell");
            _textCellField = ((__rawValue == null)?null:new TextCell(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _textCellField;
        }
    }

    /**
     * Setter for textCell
     * 
     * @see NotebookCell.Fields#textCell
     */
    public NotebookCell setTextCell(
        @Nullable
        TextCell value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTextCell(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTextCell();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "textCell", value.data());
                    _textCellField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "textCell", value.data());
                    _textCellField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for textCell
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotebookCell.Fields#textCell
     */
    public NotebookCell setTextCell(
        @Nonnull
        TextCell value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field textCell of com.linkedin.notebook.NotebookCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "textCell", value.data());
            _textCellField = value;
        }
        return this;
    }

    /**
     * Existence checker for queryCell
     * 
     * @see NotebookCell.Fields#queryCell
     */
    public boolean hasQueryCell() {
        if (_queryCellField!= null) {
            return true;
        }
        return super._map.containsKey("queryCell");
    }

    /**
     * Remover for queryCell
     * 
     * @see NotebookCell.Fields#queryCell
     */
    public void removeQueryCell() {
        super._map.remove("queryCell");
    }

    /**
     * Getter for queryCell
     * 
     * @see NotebookCell.Fields#queryCell
     */
    @Nullable
    public QueryCell getQueryCell(GetMode mode) {
        return getQueryCell();
    }

    /**
     * Getter for queryCell
     * 
     * @return
     *     Optional field. Always check for null.
     * @see NotebookCell.Fields#queryCell
     */
    @Nullable
    public QueryCell getQueryCell() {
        if (_queryCellField!= null) {
            return _queryCellField;
        } else {
            Object __rawValue = super._map.get("queryCell");
            _queryCellField = ((__rawValue == null)?null:new QueryCell(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _queryCellField;
        }
    }

    /**
     * Setter for queryCell
     * 
     * @see NotebookCell.Fields#queryCell
     */
    public NotebookCell setQueryCell(
        @Nullable
        QueryCell value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQueryCell(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQueryCell();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "queryCell", value.data());
                    _queryCellField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "queryCell", value.data());
                    _queryCellField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for queryCell
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotebookCell.Fields#queryCell
     */
    public NotebookCell setQueryCell(
        @Nonnull
        QueryCell value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field queryCell of com.linkedin.notebook.NotebookCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "queryCell", value.data());
            _queryCellField = value;
        }
        return this;
    }

    /**
     * Existence checker for chartCell
     * 
     * @see NotebookCell.Fields#chartCell
     */
    public boolean hasChartCell() {
        if (_chartCellField!= null) {
            return true;
        }
        return super._map.containsKey("chartCell");
    }

    /**
     * Remover for chartCell
     * 
     * @see NotebookCell.Fields#chartCell
     */
    public void removeChartCell() {
        super._map.remove("chartCell");
    }

    /**
     * Getter for chartCell
     * 
     * @see NotebookCell.Fields#chartCell
     */
    @Nullable
    public ChartCell getChartCell(GetMode mode) {
        return getChartCell();
    }

    /**
     * Getter for chartCell
     * 
     * @return
     *     Optional field. Always check for null.
     * @see NotebookCell.Fields#chartCell
     */
    @Nullable
    public ChartCell getChartCell() {
        if (_chartCellField!= null) {
            return _chartCellField;
        } else {
            Object __rawValue = super._map.get("chartCell");
            _chartCellField = ((__rawValue == null)?null:new ChartCell(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _chartCellField;
        }
    }

    /**
     * Setter for chartCell
     * 
     * @see NotebookCell.Fields#chartCell
     */
    public NotebookCell setChartCell(
        @Nullable
        ChartCell value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChartCell(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChartCell();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "chartCell", value.data());
                    _chartCellField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "chartCell", value.data());
                    _chartCellField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for chartCell
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotebookCell.Fields#chartCell
     */
    public NotebookCell setChartCell(
        @Nonnull
        ChartCell value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field chartCell of com.linkedin.notebook.NotebookCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "chartCell", value.data());
            _chartCellField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see NotebookCell.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see NotebookCell.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see NotebookCell.Fields#type
     */
    @Nullable
    public NotebookCellType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, NotebookCellType.class, NotebookCellType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see NotebookCell.Fields#type
     */
    @Nonnull
    public NotebookCellType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, NotebookCellType.class, NotebookCellType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see NotebookCell.Fields#type
     */
    public NotebookCell setType(
        @Nullable
        NotebookCellType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.notebook.NotebookCell");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotebookCell.Fields#type
     */
    public NotebookCell setType(
        @Nonnull
        NotebookCellType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.notebook.NotebookCell to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    @Override
    public NotebookCell clone()
        throws CloneNotSupportedException
    {
        NotebookCell __clone = ((NotebookCell) super.clone());
        __clone.__changeListener = new NotebookCell.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public NotebookCell copy()
        throws CloneNotSupportedException
    {
        NotebookCell __copy = ((NotebookCell) super.copy());
        __copy._chartCellField = null;
        __copy._textCellField = null;
        __copy._typeField = null;
        __copy._queryCellField = null;
        __copy.__changeListener = new NotebookCell.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final NotebookCell __objectRef;

        private ChangeListener(NotebookCell reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "chartCell":
                    __objectRef._chartCellField = null;
                    break;
                case "textCell":
                    __objectRef._textCellField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "queryCell":
                    __objectRef._queryCellField = null;
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
         * The text cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public com.linkedin.notebook.TextCell.Fields textCell() {
            return new com.linkedin.notebook.TextCell.Fields(getPathComponents(), "textCell");
        }

        /**
         * The query cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public com.linkedin.notebook.QueryCell.Fields queryCell() {
            return new com.linkedin.notebook.QueryCell.Fields(getPathComponents(), "queryCell");
        }

        /**
         * The chart cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public com.linkedin.notebook.ChartCell.Fields chartCell() {
            return new com.linkedin.notebook.ChartCell.Fields(getPathComponents(), "chartCell");
        }

        /**
         * The type of this Notebook cell
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.notebook.TextCell.ProjectionMask _textCellMask;
        private com.linkedin.notebook.QueryCell.ProjectionMask _queryCellMask;
        private com.linkedin.notebook.ChartCell.ProjectionMask _chartCellMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The text cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public NotebookCell.ProjectionMask withTextCell(Function<com.linkedin.notebook.TextCell.ProjectionMask, com.linkedin.notebook.TextCell.ProjectionMask> nestedMask) {
            _textCellMask = nestedMask.apply(((_textCellMask == null)?TextCell.createMask():_textCellMask));
            getDataMap().put("textCell", _textCellMask.getDataMap());
            return this;
        }

        /**
         * The text cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public NotebookCell.ProjectionMask withTextCell() {
            _textCellMask = null;
            getDataMap().put("textCell", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The query cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public NotebookCell.ProjectionMask withQueryCell(Function<com.linkedin.notebook.QueryCell.ProjectionMask, com.linkedin.notebook.QueryCell.ProjectionMask> nestedMask) {
            _queryCellMask = nestedMask.apply(((_queryCellMask == null)?QueryCell.createMask():_queryCellMask));
            getDataMap().put("queryCell", _queryCellMask.getDataMap());
            return this;
        }

        /**
         * The query cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public NotebookCell.ProjectionMask withQueryCell() {
            _queryCellMask = null;
            getDataMap().put("queryCell", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The chart cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public NotebookCell.ProjectionMask withChartCell(Function<com.linkedin.notebook.ChartCell.ProjectionMask, com.linkedin.notebook.ChartCell.ProjectionMask> nestedMask) {
            _chartCellMask = nestedMask.apply(((_chartCellMask == null)?ChartCell.createMask():_chartCellMask));
            getDataMap().put("chartCell", _chartCellMask.getDataMap());
            return this;
        }

        /**
         * The chart cell content. The will be non-null only when all other cell field is null.
         * 
         */
        public NotebookCell.ProjectionMask withChartCell() {
            _chartCellMask = null;
            getDataMap().put("chartCell", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of this Notebook cell
         * 
         */
        public NotebookCell.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
