
package com.linkedin.notebook;

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
 * Content in a Notebook
 * Note: This is IN BETA version
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/notebook/NotebookContent.pdl.")
public class NotebookContent
    extends RecordTemplate
{

    private final static NotebookContent.Fields _fields = new NotebookContent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.notebook/**Content in a Notebook\nNote: This is IN BETA version*/@Aspect.name=\"notebookContent\"record NotebookContent{/**The content of a Notebook which is composed by a list of NotebookCell*/cells:array[/**A record of all supported cells for a Notebook. Only one type of cell will be non-null.*/record NotebookCell{/**The text cell content. The will be non-null only when all other cell field is null.*/textCell:optional/**Text cell in a Notebook, which will present content in text format*/record TextCell includes/**Common attributes for a cell in a Notebook*/record CommonCellAttributes{/**Title of the cell*/cellTitle:optional string/**Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'*/cellId:string/**Captures information about who created/last modified/deleted this Notebook cell and when*/changeAuditStamps:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}}{/**The actual text in a TextCell in a Notebook*/text:string}/**The query cell content. The will be non-null only when all other cell field is null.*/queryCell:optional/**Query cell in a Notebook, which will present content in query format*/record QueryCell includes CommonCellAttributes{/**Raw query to explain some specific logic in a Notebook*/rawQuery:string/**Captures information about who last executed this query cell and when*/lastExecuted:optional com.linkedin.common.AuditStamp}/**The chart cell content. The will be non-null only when all other cell field is null.*/chartCell:optional/**Chart cell in a notebook, which will present content in chart format*/record ChartCell includes CommonCellAttributes{}/**The type of this Notebook cell*/type:/**Type of Notebook Cell*/enum NotebookCellType{/**TEXT Notebook cell type. The cell context is text only.*/TEXT_CELL/**QUERY Notebook cell type. The cell context is query only.*/QUERY_CELL/**CHART Notebook cell type. The cell content is chart only.*/CHART_CELL}}]=[]}", SchemaFormatType.PDL));
    private NotebookCellArray _cellsField = null;
    private NotebookContent.ChangeListener __changeListener = new NotebookContent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Cells = SCHEMA.getField("cells");
    private final static NotebookCellArray DEFAULT_Cells;

    static {
        DEFAULT_Cells = ((FIELD_Cells.getDefault() == null)?null:new NotebookCellArray(DataTemplateUtil.castOrThrow(FIELD_Cells.getDefault(), DataList.class)));
    }

    public NotebookContent() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public NotebookContent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static NotebookContent.Fields fields() {
        return _fields;
    }

    public static NotebookContent.ProjectionMask createMask() {
        return new NotebookContent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for cells
     * 
     * @see NotebookContent.Fields#cells
     */
    public boolean hasCells() {
        if (_cellsField!= null) {
            return true;
        }
        return super._map.containsKey("cells");
    }

    /**
     * Remover for cells
     * 
     * @see NotebookContent.Fields#cells
     */
    public void removeCells() {
        super._map.remove("cells");
    }

    /**
     * Getter for cells
     * 
     * @see NotebookContent.Fields#cells
     */
    @Nullable
    public NotebookCellArray getCells(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCells();
            case NULL:
                if (_cellsField!= null) {
                    return _cellsField;
                } else {
                    Object __rawValue = super._map.get("cells");
                    _cellsField = ((__rawValue == null)?null:new NotebookCellArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _cellsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cells
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see NotebookContent.Fields#cells
     */
    @Nonnull
    public NotebookCellArray getCells() {
        if (_cellsField!= null) {
            return _cellsField;
        } else {
            Object __rawValue = super._map.get("cells");
            if (__rawValue == null) {
                return DEFAULT_Cells;
            }
            _cellsField = ((__rawValue == null)?null:new NotebookCellArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _cellsField;
        }
    }

    /**
     * Setter for cells
     * 
     * @see NotebookContent.Fields#cells
     */
    public NotebookContent setCells(
        @Nullable
        NotebookCellArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCells(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field cells of com.linkedin.notebook.NotebookContent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cells", value.data());
                    _cellsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCells();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cells", value.data());
                    _cellsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cells", value.data());
                    _cellsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cells
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotebookContent.Fields#cells
     */
    public NotebookContent setCells(
        @Nonnull
        NotebookCellArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cells of com.linkedin.notebook.NotebookContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cells", value.data());
            _cellsField = value;
        }
        return this;
    }

    @Override
    public NotebookContent clone()
        throws CloneNotSupportedException
    {
        NotebookContent __clone = ((NotebookContent) super.clone());
        __clone.__changeListener = new NotebookContent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public NotebookContent copy()
        throws CloneNotSupportedException
    {
        NotebookContent __copy = ((NotebookContent) super.copy());
        __copy._cellsField = null;
        __copy.__changeListener = new NotebookContent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final NotebookContent __objectRef;

        private ChangeListener(NotebookContent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "cells":
                    __objectRef._cellsField = null;
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
         * The content of a Notebook which is composed by a list of NotebookCell
         * 
         */
        public com.linkedin.notebook.NotebookCellArray.Fields cells() {
            return new com.linkedin.notebook.NotebookCellArray.Fields(getPathComponents(), "cells");
        }

        /**
         * The content of a Notebook which is composed by a list of NotebookCell
         * 
         */
        public PathSpec cells(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "cells");
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

        private com.linkedin.notebook.NotebookCellArray.ProjectionMask _cellsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * The content of a Notebook which is composed by a list of NotebookCell
         * 
         */
        public NotebookContent.ProjectionMask withCells(Function<com.linkedin.notebook.NotebookCellArray.ProjectionMask, com.linkedin.notebook.NotebookCellArray.ProjectionMask> nestedMask) {
            _cellsMask = nestedMask.apply(((_cellsMask == null)?NotebookCellArray.createMask():_cellsMask));
            getDataMap().put("cells", _cellsMask.getDataMap());
            return this;
        }

        /**
         * The content of a Notebook which is composed by a list of NotebookCell
         * 
         */
        public NotebookContent.ProjectionMask withCells() {
            _cellsMask = null;
            getDataMap().put("cells", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The content of a Notebook which is composed by a list of NotebookCell
         * 
         */
        public NotebookContent.ProjectionMask withCells(Function<com.linkedin.notebook.NotebookCellArray.ProjectionMask, com.linkedin.notebook.NotebookCellArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _cellsMask = nestedMask.apply(((_cellsMask == null)?NotebookCellArray.createMask():_cellsMask));
            getDataMap().put("cells", _cellsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("cells").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("cells").put("$count", count);
            }
            return this;
        }

        /**
         * The content of a Notebook which is composed by a list of NotebookCell
         * 
         */
        public NotebookContent.ProjectionMask withCells(Integer start, Integer count) {
            _cellsMask = null;
            getDataMap().put("cells", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("cells").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("cells").put("$count", count);
            }
            return this;
        }

    }

}
