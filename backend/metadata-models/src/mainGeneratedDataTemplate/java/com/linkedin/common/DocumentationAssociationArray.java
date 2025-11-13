
package com.linkedin.common;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/Documentation.pdl.")
public class DocumentationAssociationArray
    extends WrappingArrayTemplate<DocumentationAssociation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Properties of applied documentation including the attribution of the doc*/record DocumentationAssociation{/**Description of this asset*/documentation:string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"documentationAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"documentationAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"documentationAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}]", SchemaFormatType.PDL));

    public DocumentationAssociationArray() {
        this(new DataList());
    }

    public DocumentationAssociationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DocumentationAssociationArray(Collection<DocumentationAssociation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DocumentationAssociationArray(DataList data) {
        super(data, SCHEMA, DocumentationAssociation.class);
    }

    public DocumentationAssociationArray(DocumentationAssociation first, DocumentationAssociation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DocumentationAssociationArray.ProjectionMask createMask() {
        return new DocumentationAssociationArray.ProjectionMask();
    }

    @Override
    public DocumentationAssociationArray clone()
        throws CloneNotSupportedException
    {
        DocumentationAssociationArray __clone = ((DocumentationAssociationArray) super.clone());
        return __clone;
    }

    @Override
    public DocumentationAssociationArray copy()
        throws CloneNotSupportedException
    {
        DocumentationAssociationArray __copy = ((DocumentationAssociationArray) super.copy());
        return __copy;
    }

    @Override
    protected DocumentationAssociation coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DocumentationAssociation(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.DocumentationAssociation.Fields items() {
            return new com.linkedin.common.DocumentationAssociation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.DocumentationAssociation.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DocumentationAssociationArray.ProjectionMask withItems(Function<com.linkedin.common.DocumentationAssociation.ProjectionMask, com.linkedin.common.DocumentationAssociation.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DocumentationAssociation.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
