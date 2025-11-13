
package com.linkedin.metadata.key;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Key for a CorpUser
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/CorpUserKey.pdl.")
public class CorpUserKey
    extends RecordTemplate
{

    private final static CorpUserKey.Fields _fields = new CorpUserKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"boostScore\":2.0,\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"fieldType\":\"WORD_GRAM\"}username:string}", SchemaFormatType.PDL));
    private String _usernameField = null;
    private CorpUserKey.ChangeListener __changeListener = new CorpUserKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Username = SCHEMA.getField("username");

    public CorpUserKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CorpUserKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserKey.Fields fields() {
        return _fields;
    }

    public static CorpUserKey.ProjectionMask createMask() {
        return new CorpUserKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for username
     * 
     * @see CorpUserKey.Fields#username
     */
    public boolean hasUsername() {
        if (_usernameField!= null) {
            return true;
        }
        return super._map.containsKey("username");
    }

    /**
     * Remover for username
     * 
     * @see CorpUserKey.Fields#username
     */
    public void removeUsername() {
        super._map.remove("username");
    }

    /**
     * Getter for username
     * 
     * @see CorpUserKey.Fields#username
     */
    @Nullable
    public String getUsername(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUsername();
            case DEFAULT:
            case NULL:
                if (_usernameField!= null) {
                    return _usernameField;
                } else {
                    Object __rawValue = super._map.get("username");
                    _usernameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _usernameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for username
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserKey.Fields#username
     */
    @Nonnull
    public String getUsername() {
        if (_usernameField!= null) {
            return _usernameField;
        } else {
            Object __rawValue = super._map.get("username");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("username");
            }
            _usernameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _usernameField;
        }
    }

    /**
     * Setter for username
     * 
     * @see CorpUserKey.Fields#username
     */
    public CorpUserKey setUsername(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUsername(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field username of com.linkedin.metadata.key.CorpUserKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "username", value);
                    _usernameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUsername();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "username", value);
                    _usernameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "username", value);
                    _usernameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for username
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserKey.Fields#username
     */
    public CorpUserKey setUsername(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field username of com.linkedin.metadata.key.CorpUserKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "username", value);
            _usernameField = value;
        }
        return this;
    }

    @Override
    public CorpUserKey clone()
        throws CloneNotSupportedException
    {
        CorpUserKey __clone = ((CorpUserKey) super.clone());
        __clone.__changeListener = new CorpUserKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserKey copy()
        throws CloneNotSupportedException
    {
        CorpUserKey __copy = ((CorpUserKey) super.copy());
        __copy._usernameField = null;
        __copy.__changeListener = new CorpUserKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserKey __objectRef;

        private ChangeListener(CorpUserKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "username":
                    __objectRef._usernameField = null;
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
         * The name of the AD/LDAP user.
         * 
         */
        public PathSpec username() {
            return new PathSpec(getPathComponents(), "username");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The name of the AD/LDAP user.
         * 
         */
        public CorpUserKey.ProjectionMask withUsername() {
            getDataMap().put("username", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
