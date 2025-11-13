
package com.linkedin.common;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/InstitutionalMemory.pdl.")
public class InstitutionalMemory
    extends RecordTemplate
{

    private final static InstitutionalMemory.Fields _fields = new InstitutionalMemory.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}", SchemaFormatType.PDL));
    private InstitutionalMemoryMetadataArray _elementsField = null;
    private InstitutionalMemory.ChangeListener __changeListener = new InstitutionalMemory.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Elements = SCHEMA.getField("elements");

    public InstitutionalMemory() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public InstitutionalMemory(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static InstitutionalMemory.Fields fields() {
        return _fields;
    }

    public static InstitutionalMemory.ProjectionMask createMask() {
        return new InstitutionalMemory.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    public boolean hasElements() {
        if (_elementsField!= null) {
            return true;
        }
        return super._map.containsKey("elements");
    }

    /**
     * Remover for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    public void removeElements() {
        super._map.remove("elements");
    }

    /**
     * Getter for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    @Nullable
    public InstitutionalMemoryMetadataArray getElements(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getElements();
            case DEFAULT:
            case NULL:
                if (_elementsField!= null) {
                    return _elementsField;
                } else {
                    Object __rawValue = super._map.get("elements");
                    _elementsField = ((__rawValue == null)?null:new InstitutionalMemoryMetadataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _elementsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for elements
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemory.Fields#elements
     */
    @Nonnull
    public InstitutionalMemoryMetadataArray getElements() {
        if (_elementsField!= null) {
            return _elementsField;
        } else {
            Object __rawValue = super._map.get("elements");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("elements");
            }
            _elementsField = ((__rawValue == null)?null:new InstitutionalMemoryMetadataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _elementsField;
        }
    }

    /**
     * Setter for elements
     * 
     * @see InstitutionalMemory.Fields#elements
     */
    public InstitutionalMemory setElements(
        @Nullable
        InstitutionalMemoryMetadataArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setElements(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field elements of com.linkedin.common.InstitutionalMemory");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "elements", value.data());
                    _elementsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeElements();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "elements", value.data());
                    _elementsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "elements", value.data());
                    _elementsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for elements
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemory.Fields#elements
     */
    public InstitutionalMemory setElements(
        @Nonnull
        InstitutionalMemoryMetadataArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field elements of com.linkedin.common.InstitutionalMemory to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "elements", value.data());
            _elementsField = value;
        }
        return this;
    }

    @Override
    public InstitutionalMemory clone()
        throws CloneNotSupportedException
    {
        InstitutionalMemory __clone = ((InstitutionalMemory) super.clone());
        __clone.__changeListener = new InstitutionalMemory.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public InstitutionalMemory copy()
        throws CloneNotSupportedException
    {
        InstitutionalMemory __copy = ((InstitutionalMemory) super.copy());
        __copy._elementsField = null;
        __copy.__changeListener = new InstitutionalMemory.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final InstitutionalMemory __objectRef;

        private ChangeListener(InstitutionalMemory reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "elements":
                    __objectRef._elementsField = null;
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
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public com.linkedin.common.InstitutionalMemoryMetadataArray.Fields elements() {
            return new com.linkedin.common.InstitutionalMemoryMetadataArray.Fields(getPathComponents(), "elements");
        }

        /**
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public PathSpec elements(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "elements");
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

        private com.linkedin.common.InstitutionalMemoryMetadataArray.ProjectionMask _elementsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public InstitutionalMemory.ProjectionMask withElements(Function<com.linkedin.common.InstitutionalMemoryMetadataArray.ProjectionMask, com.linkedin.common.InstitutionalMemoryMetadataArray.ProjectionMask> nestedMask) {
            _elementsMask = nestedMask.apply(((_elementsMask == null)?InstitutionalMemoryMetadataArray.createMask():_elementsMask));
            getDataMap().put("elements", _elementsMask.getDataMap());
            return this;
        }

        /**
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public InstitutionalMemory.ProjectionMask withElements() {
            _elementsMask = null;
            getDataMap().put("elements", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public InstitutionalMemory.ProjectionMask withElements(Function<com.linkedin.common.InstitutionalMemoryMetadataArray.ProjectionMask, com.linkedin.common.InstitutionalMemoryMetadataArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _elementsMask = nestedMask.apply(((_elementsMask == null)?InstitutionalMemoryMetadataArray.createMask():_elementsMask));
            getDataMap().put("elements", _elementsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("elements").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("elements").put("$count", count);
            }
            return this;
        }

        /**
         * List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.
         * 
         */
        public InstitutionalMemory.ProjectionMask withElements(Integer start, Integer count) {
            _elementsMask = null;
            getDataMap().put("elements", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("elements").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("elements").put("$count", count);
            }
            return this;
        }

    }

}
