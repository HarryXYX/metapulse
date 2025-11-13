
package com.linkedin.assertion;

import java.util.List;
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
import com.linkedin.data.template.StringArray;


/**
 * Information about the Audit Log operation to use in evaluating an assertion.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/AuditLogSpec.pdl.")
public class AuditLogSpec
    extends RecordTemplate
{

    private final static AuditLogSpec.Fields _fields = new AuditLogSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Information about the Audit Log operation to use in evaluating an assertion.\n*/record AuditLogSpec{/**The list of operation types that should be monitored. If not provided, a default set will be used.*/operationTypes:optional array[string]/**Optional: The user name associated with the operation.*/userName:optional string}", SchemaFormatType.PDL));
    private StringArray _operationTypesField = null;
    private String _userNameField = null;
    private AuditLogSpec.ChangeListener __changeListener = new AuditLogSpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_OperationTypes = SCHEMA.getField("operationTypes");
    private final static RecordDataSchema.Field FIELD_UserName = SCHEMA.getField("userName");

    public AuditLogSpec() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AuditLogSpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AuditLogSpec.Fields fields() {
        return _fields;
    }

    public static AuditLogSpec.ProjectionMask createMask() {
        return new AuditLogSpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for operationTypes
     * 
     * @see AuditLogSpec.Fields#operationTypes
     */
    public boolean hasOperationTypes() {
        if (_operationTypesField!= null) {
            return true;
        }
        return super._map.containsKey("operationTypes");
    }

    /**
     * Remover for operationTypes
     * 
     * @see AuditLogSpec.Fields#operationTypes
     */
    public void removeOperationTypes() {
        super._map.remove("operationTypes");
    }

    /**
     * Getter for operationTypes
     * 
     * @see AuditLogSpec.Fields#operationTypes
     */
    @Nullable
    public StringArray getOperationTypes(GetMode mode) {
        return getOperationTypes();
    }

    /**
     * Getter for operationTypes
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AuditLogSpec.Fields#operationTypes
     */
    @Nullable
    public StringArray getOperationTypes() {
        if (_operationTypesField!= null) {
            return _operationTypesField;
        } else {
            Object __rawValue = super._map.get("operationTypes");
            _operationTypesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _operationTypesField;
        }
    }

    /**
     * Setter for operationTypes
     * 
     * @see AuditLogSpec.Fields#operationTypes
     */
    public AuditLogSpec setOperationTypes(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperationTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOperationTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "operationTypes", value.data());
                    _operationTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "operationTypes", value.data());
                    _operationTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for operationTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AuditLogSpec.Fields#operationTypes
     */
    public AuditLogSpec setOperationTypes(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operationTypes of com.linkedin.assertion.AuditLogSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operationTypes", value.data());
            _operationTypesField = value;
        }
        return this;
    }

    /**
     * Existence checker for userName
     * 
     * @see AuditLogSpec.Fields#userName
     */
    public boolean hasUserName() {
        if (_userNameField!= null) {
            return true;
        }
        return super._map.containsKey("userName");
    }

    /**
     * Remover for userName
     * 
     * @see AuditLogSpec.Fields#userName
     */
    public void removeUserName() {
        super._map.remove("userName");
    }

    /**
     * Getter for userName
     * 
     * @see AuditLogSpec.Fields#userName
     */
    @Nullable
    public String getUserName(GetMode mode) {
        return getUserName();
    }

    /**
     * Getter for userName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AuditLogSpec.Fields#userName
     */
    @Nullable
    public String getUserName() {
        if (_userNameField!= null) {
            return _userNameField;
        } else {
            Object __rawValue = super._map.get("userName");
            _userNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _userNameField;
        }
    }

    /**
     * Setter for userName
     * 
     * @see AuditLogSpec.Fields#userName
     */
    public AuditLogSpec setUserName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUserName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUserName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userName", value);
                    _userNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "userName", value);
                    _userNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for userName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AuditLogSpec.Fields#userName
     */
    public AuditLogSpec setUserName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userName of com.linkedin.assertion.AuditLogSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userName", value);
            _userNameField = value;
        }
        return this;
    }

    @Override
    public AuditLogSpec clone()
        throws CloneNotSupportedException
    {
        AuditLogSpec __clone = ((AuditLogSpec) super.clone());
        __clone.__changeListener = new AuditLogSpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AuditLogSpec copy()
        throws CloneNotSupportedException
    {
        AuditLogSpec __copy = ((AuditLogSpec) super.copy());
        __copy._userNameField = null;
        __copy._operationTypesField = null;
        __copy.__changeListener = new AuditLogSpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AuditLogSpec __objectRef;

        private ChangeListener(AuditLogSpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "userName":
                    __objectRef._userNameField = null;
                    break;
                case "operationTypes":
                    __objectRef._operationTypesField = null;
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
         * The list of operation types that should be monitored. If not provided, a default set will be used.
         * 
         */
        public PathSpec operationTypes() {
            return new PathSpec(getPathComponents(), "operationTypes");
        }

        /**
         * The list of operation types that should be monitored. If not provided, a default set will be used.
         * 
         */
        public PathSpec operationTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "operationTypes");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Optional: The user name associated with the operation.
         * 
         */
        public PathSpec userName() {
            return new PathSpec(getPathComponents(), "userName");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The list of operation types that should be monitored. If not provided, a default set will be used.
         * 
         */
        public AuditLogSpec.ProjectionMask withOperationTypes() {
            getDataMap().put("operationTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of operation types that should be monitored. If not provided, a default set will be used.
         * 
         */
        public AuditLogSpec.ProjectionMask withOperationTypes(Integer start, Integer count) {
            getDataMap().put("operationTypes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("operationTypes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("operationTypes").put("$count", count);
            }
            return this;
        }

        /**
         * Optional: The user name associated with the operation.
         * 
         */
        public AuditLogSpec.ProjectionMask withUserName() {
            getDataMap().put("userName", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
