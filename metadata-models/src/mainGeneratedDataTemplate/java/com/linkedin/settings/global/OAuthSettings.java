
package com.linkedin.settings.global;

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
 * Trust oauth providers to use for authentication.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/global/OAuthSettings.pdl.")
public class OAuthSettings
    extends RecordTemplate
{

    private final static OAuthSettings.Fields _fields = new OAuthSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**Trust oauth providers to use for authentication.*/record OAuthSettings{/**Trusted OAuth Providers*/providers:array[/**An OAuth Provider. This provides information required to validate inbound\nrequests with OAuth 2.0 bearer tokens.*/record OAuthProvider{/**Whether this OAuth provider is enabled.*/enabled:boolean/**The name of this OAuth provider. This is used for display purposes only.*/name:string/**The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.*/jwksUri:optional string/**The expected issuer (iss) claim in the JWTs issued by this OAuth provider.*/issuer:string/**The expected audience (aud) claim in the JWTs issued by this OAuth provider.*/audience:string/**The JWT signing algorithm required for this provider.\nPrevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256*/algorithm:string=\"RS256\"/**The JWT claim to use as the user identifier for this provider.\nDifferent providers use different claims (sub, email, preferred_username, etc.)*/userIdClaim:string=\"sub\"}]}", SchemaFormatType.PDL));
    private OAuthProviderArray _providersField = null;
    private OAuthSettings.ChangeListener __changeListener = new OAuthSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Providers = SCHEMA.getField("providers");

    public OAuthSettings() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public OAuthSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OAuthSettings.Fields fields() {
        return _fields;
    }

    public static OAuthSettings.ProjectionMask createMask() {
        return new OAuthSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for providers
     * 
     * @see OAuthSettings.Fields#providers
     */
    public boolean hasProviders() {
        if (_providersField!= null) {
            return true;
        }
        return super._map.containsKey("providers");
    }

    /**
     * Remover for providers
     * 
     * @see OAuthSettings.Fields#providers
     */
    public void removeProviders() {
        super._map.remove("providers");
    }

    /**
     * Getter for providers
     * 
     * @see OAuthSettings.Fields#providers
     */
    @Nullable
    public OAuthProviderArray getProviders(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getProviders();
            case DEFAULT:
            case NULL:
                if (_providersField!= null) {
                    return _providersField;
                } else {
                    Object __rawValue = super._map.get("providers");
                    _providersField = ((__rawValue == null)?null:new OAuthProviderArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _providersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for providers
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OAuthSettings.Fields#providers
     */
    @Nonnull
    public OAuthProviderArray getProviders() {
        if (_providersField!= null) {
            return _providersField;
        } else {
            Object __rawValue = super._map.get("providers");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("providers");
            }
            _providersField = ((__rawValue == null)?null:new OAuthProviderArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _providersField;
        }
    }

    /**
     * Setter for providers
     * 
     * @see OAuthSettings.Fields#providers
     */
    public OAuthSettings setProviders(
        @Nullable
        OAuthProviderArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProviders(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field providers of com.linkedin.settings.global.OAuthSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "providers", value.data());
                    _providersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeProviders();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "providers", value.data());
                    _providersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "providers", value.data());
                    _providersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for providers
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OAuthSettings.Fields#providers
     */
    public OAuthSettings setProviders(
        @Nonnull
        OAuthProviderArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field providers of com.linkedin.settings.global.OAuthSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "providers", value.data());
            _providersField = value;
        }
        return this;
    }

    @Override
    public OAuthSettings clone()
        throws CloneNotSupportedException
    {
        OAuthSettings __clone = ((OAuthSettings) super.clone());
        __clone.__changeListener = new OAuthSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OAuthSettings copy()
        throws CloneNotSupportedException
    {
        OAuthSettings __copy = ((OAuthSettings) super.copy());
        __copy._providersField = null;
        __copy.__changeListener = new OAuthSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OAuthSettings __objectRef;

        private ChangeListener(OAuthSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "providers":
                    __objectRef._providersField = null;
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
         * Trusted OAuth Providers
         * 
         */
        public com.linkedin.settings.global.OAuthProviderArray.Fields providers() {
            return new com.linkedin.settings.global.OAuthProviderArray.Fields(getPathComponents(), "providers");
        }

        /**
         * Trusted OAuth Providers
         * 
         */
        public PathSpec providers(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "providers");
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

        private com.linkedin.settings.global.OAuthProviderArray.ProjectionMask _providersMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Trusted OAuth Providers
         * 
         */
        public OAuthSettings.ProjectionMask withProviders(Function<com.linkedin.settings.global.OAuthProviderArray.ProjectionMask, com.linkedin.settings.global.OAuthProviderArray.ProjectionMask> nestedMask) {
            _providersMask = nestedMask.apply(((_providersMask == null)?OAuthProviderArray.createMask():_providersMask));
            getDataMap().put("providers", _providersMask.getDataMap());
            return this;
        }

        /**
         * Trusted OAuth Providers
         * 
         */
        public OAuthSettings.ProjectionMask withProviders() {
            _providersMask = null;
            getDataMap().put("providers", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Trusted OAuth Providers
         * 
         */
        public OAuthSettings.ProjectionMask withProviders(Function<com.linkedin.settings.global.OAuthProviderArray.ProjectionMask, com.linkedin.settings.global.OAuthProviderArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _providersMask = nestedMask.apply(((_providersMask == null)?OAuthProviderArray.createMask():_providersMask));
            getDataMap().put("providers", _providersMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("providers").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("providers").put("$count", count);
            }
            return this;
        }

        /**
         * Trusted OAuth Providers
         * 
         */
        public OAuthSettings.ProjectionMask withProviders(Integer start, Integer count) {
            _providersMask = null;
            getDataMap().put("providers", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("providers").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("providers").put("$count", count);
            }
            return this;
        }

    }

}
