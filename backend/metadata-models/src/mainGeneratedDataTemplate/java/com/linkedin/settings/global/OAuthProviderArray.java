
package com.linkedin.settings.global;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/global/OAuthSettings.pdl.")
public class OAuthProviderArray
    extends WrappingArrayTemplate<OAuthProvider>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.settings.global/**An OAuth Provider. This provides information required to validate inbound\nrequests with OAuth 2.0 bearer tokens.*/record OAuthProvider{/**Whether this OAuth provider is enabled.*/enabled:boolean/**The name of this OAuth provider. This is used for display purposes only.*/name:string/**The URI of the JSON Web Key Set (JWKS) endpoint for this OAuth provider.*/jwksUri:optional string/**The expected issuer (iss) claim in the JWTs issued by this OAuth provider.*/issuer:string/**The expected audience (aud) claim in the JWTs issued by this OAuth provider.*/audience:string/**The JWT signing algorithm required for this provider.\nPrevents algorithm confusion attacks. Common values: RS256, RS384, RS512, PS256, ES256*/algorithm:string=\"RS256\"/**The JWT claim to use as the user identifier for this provider.\nDifferent providers use different claims (sub, email, preferred_username, etc.)*/userIdClaim:string=\"sub\"}}]", SchemaFormatType.PDL));

    public OAuthProviderArray() {
        this(new DataList());
    }

    public OAuthProviderArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public OAuthProviderArray(Collection<OAuthProvider> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public OAuthProviderArray(DataList data) {
        super(data, SCHEMA, OAuthProvider.class);
    }

    public OAuthProviderArray(OAuthProvider first, OAuthProvider... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static OAuthProviderArray.ProjectionMask createMask() {
        return new OAuthProviderArray.ProjectionMask();
    }

    @Override
    public OAuthProviderArray clone()
        throws CloneNotSupportedException
    {
        OAuthProviderArray __clone = ((OAuthProviderArray) super.clone());
        return __clone;
    }

    @Override
    public OAuthProviderArray copy()
        throws CloneNotSupportedException
    {
        OAuthProviderArray __copy = ((OAuthProviderArray) super.copy());
        return __copy;
    }

    @Override
    protected OAuthProvider coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new OAuthProvider(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.settings.global.OAuthProvider.Fields items() {
            return new com.linkedin.settings.global.OAuthProvider.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.settings.global.OAuthProvider.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public OAuthProviderArray.ProjectionMask withItems(Function<com.linkedin.settings.global.OAuthProvider.ProjectionMask, com.linkedin.settings.global.OAuthProvider.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?OAuthProvider.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
