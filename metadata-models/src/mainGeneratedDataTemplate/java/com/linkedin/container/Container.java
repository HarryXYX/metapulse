
package com.linkedin.container;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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


/**
 * Link from an asset to its parent container
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/container/Container.pdl.")
public class Container
    extends RecordTemplate
{

    private final static Container.Fields _fields = new Container.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.container/**Link from an asset to its parent container*/@Aspect.name=\"container\"record Container{/**The parent container of an asset*/@Relationship={\"entityTypes\":[\"container\"],\"name\":\"IsPartOf\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"container\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Container\",\"hasValuesFieldName\":\"hasContainer\"}container:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _containerField = null;
    private Container.ChangeListener __changeListener = new Container.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Container = SCHEMA.getField("container");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public Container() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Container(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Container.Fields fields() {
        return _fields;
    }

    public static Container.ProjectionMask createMask() {
        return new Container.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for container
     * 
     * @see Container.Fields#container
     */
    public boolean hasContainer() {
        if (_containerField!= null) {
            return true;
        }
        return super._map.containsKey("container");
    }

    /**
     * Remover for container
     * 
     * @see Container.Fields#container
     */
    public void removeContainer() {
        super._map.remove("container");
    }

    /**
     * Getter for container
     * 
     * @see Container.Fields#container
     */
    @Nullable
    public com.linkedin.common.urn.Urn getContainer(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getContainer();
            case DEFAULT:
            case NULL:
                if (_containerField!= null) {
                    return _containerField;
                } else {
                    Object __rawValue = super._map.get("container");
                    _containerField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _containerField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for container
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Container.Fields#container
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getContainer() {
        if (_containerField!= null) {
            return _containerField;
        } else {
            Object __rawValue = super._map.get("container");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("container");
            }
            _containerField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _containerField;
        }
    }

    /**
     * Setter for container
     * 
     * @see Container.Fields#container
     */
    public Container setContainer(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContainer(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field container of com.linkedin.container.Container");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "container", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _containerField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContainer();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "container", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _containerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "container", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _containerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for container
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Container.Fields#container
     */
    public Container setContainer(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field container of com.linkedin.container.Container to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "container", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _containerField = value;
        }
        return this;
    }

    @Override
    public Container clone()
        throws CloneNotSupportedException
    {
        Container __clone = ((Container) super.clone());
        __clone.__changeListener = new Container.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Container copy()
        throws CloneNotSupportedException
    {
        Container __copy = ((Container) super.copy());
        __copy._containerField = null;
        __copy.__changeListener = new Container.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Container __objectRef;

        private ChangeListener(Container reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "container":
                    __objectRef._containerField = null;
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
         * The parent container of an asset
         * 
         */
        public PathSpec container() {
            return new PathSpec(getPathComponents(), "container");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The parent container of an asset
         * 
         */
        public Container.ProjectionMask withContainer() {
            getDataMap().put("container", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
