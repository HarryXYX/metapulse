
package com.linkedin.dataset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DownstreamLineageDelta.pdl.")
public class DownstreamArray
    extends WrappingArrayTemplate<Downstream>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**Downstream lineage information about a dataset including the source reporting the lineage*/record Downstream{/**Audit stamp containing who reported the lineage and when*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The downstream dataset the lineage points to*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}}]", SchemaFormatType.PDL));

    public DownstreamArray() {
        this(new DataList());
    }

    public DownstreamArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DownstreamArray(Collection<Downstream> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DownstreamArray(DataList data) {
        super(data, SCHEMA, Downstream.class);
    }

    public DownstreamArray(Downstream first, Downstream... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DownstreamArray.ProjectionMask createMask() {
        return new DownstreamArray.ProjectionMask();
    }

    @Override
    public DownstreamArray clone()
        throws CloneNotSupportedException
    {
        DownstreamArray __clone = ((DownstreamArray) super.clone());
        return __clone;
    }

    @Override
    public DownstreamArray copy()
        throws CloneNotSupportedException
    {
        DownstreamArray __copy = ((DownstreamArray) super.copy());
        return __copy;
    }

    @Override
    protected Downstream coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new Downstream(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.dataset.Downstream.Fields items() {
            return new com.linkedin.dataset.Downstream.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dataset.Downstream.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DownstreamArray.ProjectionMask withItems(Function<com.linkedin.dataset.Downstream.ProjectionMask, com.linkedin.dataset.Downstream.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?Downstream.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
