
package com.linkedin.metadata.snapshot;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.metadata.aspect.DataPlatformAspectArray;


/**
 * A metadata snapshot for a specific dataplatform entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataPlatformSnapshot.pdl.")
public class DataPlatformSnapshot
    extends RecordTemplate
{

    private final static DataPlatformSnapshot.Fields _fields = new DataPlatformSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific dataplatform entity.*/@Entity={\"keyAspect\":\"dataPlatformKey\",\"name\":\"dataPlatform\"}record DataPlatformSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Data Platform*/typeref DataPlatformAspect=union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":false,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}}]}]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.DataPlatformUrn _urnField = null;
    private DataPlatformAspectArray _aspectsField = null;
    private DataPlatformSnapshot.ChangeListener __changeListener = new DataPlatformSnapshot.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
    }

    public DataPlatformSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataPlatformSnapshot(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataPlatformSnapshot.Fields fields() {
        return _fields;
    }

    public static DataPlatformSnapshot.ProjectionMask createMask() {
        return new DataPlatformSnapshot.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.DataPlatformUrn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DataPlatformUrn.class);
                    return _urnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataPlatformUrn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DataPlatformUrn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    public DataPlatformSnapshot setUrn(
        @Nullable
        com.linkedin.common.urn.DataPlatformUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.metadata.snapshot.DataPlatformSnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformSnapshot.Fields#urn
     */
    public DataPlatformSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.DataPlatformUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.snapshot.DataPlatformSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        if (_aspectsField!= null) {
            return true;
        }
        return super._map.containsKey("aspects");
    }

    /**
     * Remover for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public void removeAspects() {
        super._map.remove("aspects");
    }

    /**
     * Getter for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    @Nullable
    public DataPlatformAspectArray getAspects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspects();
            case DEFAULT:
            case NULL:
                if (_aspectsField!= null) {
                    return _aspectsField;
                } else {
                    Object __rawValue = super._map.get("aspects");
                    _aspectsField = ((__rawValue == null)?null:new DataPlatformAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _aspectsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformSnapshot.Fields#aspects
     */
    @Nonnull
    public DataPlatformAspectArray getAspects() {
        if (_aspectsField!= null) {
            return _aspectsField;
        } else {
            Object __rawValue = super._map.get("aspects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspects");
            }
            _aspectsField = ((__rawValue == null)?null:new DataPlatformAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aspectsField;
        }
    }

    /**
     * Setter for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public DataPlatformSnapshot setAspects(
        @Nullable
        DataPlatformAspectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspects of com.linkedin.metadata.snapshot.DataPlatformSnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspects();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public DataPlatformSnapshot setAspects(
        @Nonnull
        DataPlatformAspectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspects of com.linkedin.metadata.snapshot.DataPlatformSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
            _aspectsField = value;
        }
        return this;
    }

    @Override
    public DataPlatformSnapshot clone()
        throws CloneNotSupportedException
    {
        DataPlatformSnapshot __clone = ((DataPlatformSnapshot) super.clone());
        __clone.__changeListener = new DataPlatformSnapshot.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataPlatformSnapshot copy()
        throws CloneNotSupportedException
    {
        DataPlatformSnapshot __copy = ((DataPlatformSnapshot) super.copy());
        __copy._urnField = null;
        __copy._aspectsField = null;
        __copy.__changeListener = new DataPlatformSnapshot.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataPlatformSnapshot __objectRef;

        private ChangeListener(DataPlatformSnapshot reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "aspects":
                    __objectRef._aspectsField = null;
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
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.DataPlatformAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.DataPlatformAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public PathSpec aspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspects");
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

        private com.linkedin.metadata.aspect.DataPlatformAspectArray.ProjectionMask _aspectsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public DataPlatformSnapshot.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public DataPlatformSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.DataPlatformAspectArray.ProjectionMask, com.linkedin.metadata.aspect.DataPlatformAspectArray.ProjectionMask> nestedMask) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?DataPlatformAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            return this;
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public DataPlatformSnapshot.ProjectionMask withAspects() {
            _aspectsMask = null;
            getDataMap().put("aspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public DataPlatformSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.DataPlatformAspectArray.ProjectionMask, com.linkedin.metadata.aspect.DataPlatformAspectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?DataPlatformAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("aspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspects").put("$count", count);
            }
            return this;
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public DataPlatformSnapshot.ProjectionMask withAspects(Integer start, Integer count) {
            _aspectsMask = null;
            getDataMap().put("aspects", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspects").put("$count", count);
            }
            return this;
        }

    }

}
