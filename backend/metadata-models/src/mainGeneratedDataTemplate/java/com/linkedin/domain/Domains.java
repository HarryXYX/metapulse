
package com.linkedin.domain;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
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
 * Links from an Asset to its Domains
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/domain/Domains.pdl.")
public class Domains
    extends RecordTemplate
{

    private final static Domains.Fields _fields = new Domains.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.domain/**Links from an Asset to its Domains*/@Aspect.name=\"domains\"record Domains{/**The Domains attached to an Asset*/@Relationship.`/*`={\"entityTypes\":[\"domain\"],\"name\":\"AssociatedWith\"}@Searchable.`/*`={\"addToFilters\":true,\"fieldName\":\"domains\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Domain\",\"hasValuesFieldName\":\"hasDomain\"}domains:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private UrnArray _domainsField = null;
    private Domains.ChangeListener __changeListener = new Domains.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Domains = SCHEMA.getField("domains");

    public Domains() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Domains(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Domains.Fields fields() {
        return _fields;
    }

    public static Domains.ProjectionMask createMask() {
        return new Domains.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for domains
     * 
     * @see Domains.Fields#domains
     */
    public boolean hasDomains() {
        if (_domainsField!= null) {
            return true;
        }
        return super._map.containsKey("domains");
    }

    /**
     * Remover for domains
     * 
     * @see Domains.Fields#domains
     */
    public void removeDomains() {
        super._map.remove("domains");
    }

    /**
     * Getter for domains
     * 
     * @see Domains.Fields#domains
     */
    @Nullable
    public UrnArray getDomains(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDomains();
            case DEFAULT:
            case NULL:
                if (_domainsField!= null) {
                    return _domainsField;
                } else {
                    Object __rawValue = super._map.get("domains");
                    _domainsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _domainsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for domains
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Domains.Fields#domains
     */
    @Nonnull
    public UrnArray getDomains() {
        if (_domainsField!= null) {
            return _domainsField;
        } else {
            Object __rawValue = super._map.get("domains");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("domains");
            }
            _domainsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _domainsField;
        }
    }

    /**
     * Setter for domains
     * 
     * @see Domains.Fields#domains
     */
    public Domains setDomains(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDomains(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field domains of com.linkedin.domain.Domains");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "domains", value.data());
                    _domainsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDomains();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "domains", value.data());
                    _domainsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "domains", value.data());
                    _domainsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for domains
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Domains.Fields#domains
     */
    public Domains setDomains(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field domains of com.linkedin.domain.Domains to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "domains", value.data());
            _domainsField = value;
        }
        return this;
    }

    @Override
    public Domains clone()
        throws CloneNotSupportedException
    {
        Domains __clone = ((Domains) super.clone());
        __clone.__changeListener = new Domains.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Domains copy()
        throws CloneNotSupportedException
    {
        Domains __copy = ((Domains) super.copy());
        __copy._domainsField = null;
        __copy.__changeListener = new Domains.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Domains __objectRef;

        private ChangeListener(Domains reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "domains":
                    __objectRef._domainsField = null;
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
         * The Domains attached to an Asset
         * 
         */
        public PathSpec domains() {
            return new PathSpec(getPathComponents(), "domains");
        }

        /**
         * The Domains attached to an Asset
         * 
         */
        public PathSpec domains(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "domains");
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


        ProjectionMask() {
            super(2);
        }

        /**
         * The Domains attached to an Asset
         * 
         */
        public Domains.ProjectionMask withDomains() {
            getDataMap().put("domains", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The Domains attached to an Asset
         * 
         */
        public Domains.ProjectionMask withDomains(Integer start, Integer count) {
            getDataMap().put("domains", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("domains").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("domains").put("$count", count);
            }
            return this;
        }

    }

}
