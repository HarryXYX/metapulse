
package com.linkedin.notebook;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/notebook/NotebookContent.pdl.")
public class NotebookCellArray
    extends WrappingArrayTemplate<NotebookCell>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.notebook/**A record of all supported cells for a Notebook. Only one type of cell will be non-null.*/record NotebookCell{/**The text cell content. The will be non-null only when all other cell field is null.*/textCell:optional/**Text cell in a Notebook, which will present content in text format*/record TextCell includes/**Common attributes for a cell in a Notebook*/record CommonCellAttributes{/**Title of the cell*/cellTitle:optional string/**Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'*/cellId:string/**Captures information about who created/last modified/deleted this Notebook cell and when*/changeAuditStamps:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}}{/**The actual text in a TextCell in a Notebook*/text:string}/**The query cell content. The will be non-null only when all other cell field is null.*/queryCell:optional/**Query cell in a Notebook, which will present content in query format*/record QueryCell includes CommonCellAttributes{/**Raw query to explain some specific logic in a Notebook*/rawQuery:string/**Captures information about who last executed this query cell and when*/lastExecuted:optional com.linkedin.common.AuditStamp}/**The chart cell content. The will be non-null only when all other cell field is null.*/chartCell:optional/**Chart cell in a notebook, which will present content in chart format*/record ChartCell includes CommonCellAttributes{}/**The type of this Notebook cell*/type:/**Type of Notebook Cell*/enum NotebookCellType{/**TEXT Notebook cell type. The cell context is text only.*/TEXT_CELL/**QUERY Notebook cell type. The cell context is query only.*/QUERY_CELL/**CHART Notebook cell type. The cell content is chart only.*/CHART_CELL}}}]", SchemaFormatType.PDL));

    public NotebookCellArray() {
        this(new DataList());
    }

    public NotebookCellArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public NotebookCellArray(Collection<NotebookCell> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public NotebookCellArray(DataList data) {
        super(data, SCHEMA, NotebookCell.class);
    }

    public NotebookCellArray(NotebookCell first, NotebookCell... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static NotebookCellArray.ProjectionMask createMask() {
        return new NotebookCellArray.ProjectionMask();
    }

    @Override
    public NotebookCellArray clone()
        throws CloneNotSupportedException
    {
        NotebookCellArray __clone = ((NotebookCellArray) super.clone());
        return __clone;
    }

    @Override
    public NotebookCellArray copy()
        throws CloneNotSupportedException
    {
        NotebookCellArray __copy = ((NotebookCellArray) super.copy());
        return __copy;
    }

    @Override
    protected NotebookCell coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new NotebookCell(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.notebook.NotebookCell.Fields items() {
            return new com.linkedin.notebook.NotebookCell.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.notebook.NotebookCell.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public NotebookCellArray.ProjectionMask withItems(Function<com.linkedin.notebook.NotebookCell.ProjectionMask, com.linkedin.notebook.NotebookCell.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?NotebookCell.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
