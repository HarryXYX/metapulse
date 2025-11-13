
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldUpstream.pdl.")
public class DatasetFieldUpstream
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string}]", SchemaFormatType.PDL));
    private com.linkedin.common.urn.DatasetFieldUrn _datasetFieldUrnMember = null;
    private DatasetFieldUpstream.ChangeListener __changeListener = new DatasetFieldUpstream.ChangeListener(this);
    private final static DataSchema MEMBER_DatasetFieldUrn = SCHEMA.getTypeByMemberKey("string");
    public final static String MEMBERKEY_DatasetFieldUrn = "string";
    private final static TyperefInfo TYPEREFINFO = new DatasetFieldUpstream.UnionTyperefInfo();

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetFieldUrn.class);
    }

    public DatasetFieldUpstream() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DatasetFieldUpstream(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DatasetFieldUpstream create(com.linkedin.common.urn.DatasetFieldUrn value) {
        DatasetFieldUpstream newUnion = new DatasetFieldUpstream();
        newUnion.setDatasetFieldUrn(value);
        return newUnion;
    }

    public boolean isDatasetFieldUrn() {
        return memberIs("string");
    }

    public com.linkedin.common.urn.DatasetFieldUrn getDatasetFieldUrn() {
        checkNotNull();
        if (_datasetFieldUrnMember!= null) {
            return _datasetFieldUrnMember;
        }
        Object __rawValue = super._map.get("string");
        _datasetFieldUrnMember = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetFieldUrn.class);
        return _datasetFieldUrnMember;
    }

    public void setDatasetFieldUrn(com.linkedin.common.urn.DatasetFieldUrn value) {
        checkNotNull();
        super._map.clear();
        _datasetFieldUrnMember = value;
        CheckedUtil.putWithoutChecking(super._map, "string", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetFieldUrn.class));
    }

    public static DatasetFieldUpstream.ProjectionMask createMask() {
        return new DatasetFieldUpstream.ProjectionMask();
    }

    @Override
    public DatasetFieldUpstream clone()
        throws CloneNotSupportedException
    {
        DatasetFieldUpstream __clone = ((DatasetFieldUpstream) super.clone());
        __clone.__changeListener = new DatasetFieldUpstream.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetFieldUpstream copy()
        throws CloneNotSupportedException
    {
        DatasetFieldUpstream __copy = ((DatasetFieldUpstream) super.copy());
        __copy._datasetFieldUrnMember = null;
        __copy.__changeListener = new DatasetFieldUpstream.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetFieldUpstream __objectRef;

        private ChangeListener(DatasetFieldUpstream reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "string":
                    __objectRef._datasetFieldUrnMember = null;
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

        public PathSpec DatasetFieldUrn() {
            return new PathSpec(getPathComponents(), "string");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public DatasetFieldUpstream.ProjectionMask withDatasetFieldUrn() {
            getDataMap().put("string", MaskMap.POSITIVE_MASK);
            return this;
        }

    }


    /**
     * Upstreams of a dataset field.
     * 
     * @deprecated
     *     refer FineGrainedLineage for alternative representation
     */
    @Deprecated
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Upstreams of a dataset field.*/@deprecated=\"refer FineGrainedLineage for alternative representation\"typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
