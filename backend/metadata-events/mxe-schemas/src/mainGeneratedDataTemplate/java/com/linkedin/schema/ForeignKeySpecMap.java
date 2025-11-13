
package com.linkedin.schema;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.MapDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingMapTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
public class ForeignKeySpecMap
    extends WrappingMapTemplate<ForeignKeySpec>
{

    private final static MapDataSchema SCHEMA = ((MapDataSchema) DataTemplateUtil.parseSchema("map[string{namespace com.linkedin.schema/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}}]", SchemaFormatType.PDL));

    public ForeignKeySpecMap() {
        this(new DataMap());
    }

    public ForeignKeySpecMap(int initialCapacity) {
        this(new DataMap(initialCapacity));
    }

    public ForeignKeySpecMap(int initialCapacity, float loadFactor) {
        this(new DataMap(initialCapacity, loadFactor));
    }

    public ForeignKeySpecMap(Map<String, ForeignKeySpec> m) {
        this(newDataMapOfSize(m.size()));
        putAll(m);
    }

    public ForeignKeySpecMap(DataMap data) {
        super(data, SCHEMA, ForeignKeySpec.class);
    }

    public static MapDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ForeignKeySpecMap.ProjectionMask createMask() {
        return new ForeignKeySpecMap.ProjectionMask();
    }

    @Override
    public ForeignKeySpecMap clone()
        throws CloneNotSupportedException
    {
        ForeignKeySpecMap __clone = ((ForeignKeySpecMap) super.clone());
        return __clone;
    }

    @Override
    public ForeignKeySpecMap copy()
        throws CloneNotSupportedException
    {
        ForeignKeySpecMap __copy = ((ForeignKeySpecMap) super.copy());
        return __copy;
    }

    @Override
    protected ForeignKeySpec coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        if (object == null) {
            return null;
        }
        return ((object == null)?null:new ForeignKeySpec(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.schema.ForeignKeySpec.Fields values() {
            return new com.linkedin.schema.ForeignKeySpec.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.ForeignKeySpec.ProjectionMask _valuesMask;

        ProjectionMask() {
            super(4);
        }

        public ForeignKeySpecMap.ProjectionMask withValues(Function<com.linkedin.schema.ForeignKeySpec.ProjectionMask, com.linkedin.schema.ForeignKeySpec.ProjectionMask> nestedMask) {
            _valuesMask = nestedMask.apply(((_valuesMask == null)?ForeignKeySpec.createMask():_valuesMask));
            getDataMap().put("$*", _valuesMask.getDataMap());
            return this;
        }

    }

}
