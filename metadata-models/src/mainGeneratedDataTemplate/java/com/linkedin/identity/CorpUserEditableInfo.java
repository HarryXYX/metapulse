
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Linkedin corp user information that can be edited from UI
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/identity/CorpUserEditableInfo.pdl.")
public class CorpUserEditableInfo
    extends RecordTemplate
{

    private final static CorpUserEditableInfo.Fields _fields = new CorpUserEditableInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserEditableInfo\"}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}=\"assets/platforms/default_avatar.png\"/**DataHub-native display name*/@Searchable={\"boostScore\":10.0,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}displayName:optional string/**DataHub-native Title, e.g. 'Software Engineer'*/title:optional string/**The platforms that the user commonly works with*/@Relationship.`/*`={\"entityTypes\":[\"dataPlatform\"],\"name\":\"IsUserOf\"}platforms:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**The user's persona type, based on their role*/@Relationship={\"entityTypes\":[\"dataHubPersona\"],\"name\":\"IsPersona\"}persona:optional com.linkedin.common.Urn/**Slack handle for the user*/slack:optional string/**Phone number to contact the user*/phone:optional string/**Email address to contact the user*/email:optional string/**Information sources that have been used to populate this CorpUserEditableInfo.\nThese include platform resources, such as Slack members or Looker users.\nThey can also refer to other semantic urns in the future.*/informationSources:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private String _aboutMeField = null;
    private StringArray _teamsField = null;
    private StringArray _skillsField = null;
    private com.linkedin.common.url.Url _pictureLinkField = null;
    private String _displayNameField = null;
    private String _titleField = null;
    private UrnArray _platformsField = null;
    private com.linkedin.common.urn.Urn _personaField = null;
    private String _slackField = null;
    private String _phoneField = null;
    private String _emailField = null;
    private UrnArray _informationSourcesField = null;
    private CorpUserEditableInfo.ChangeListener __changeListener = new CorpUserEditableInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AboutMe = SCHEMA.getField("aboutMe");
    private final static RecordDataSchema.Field FIELD_Teams = SCHEMA.getField("teams");
    private final static StringArray DEFAULT_Teams;
    private final static RecordDataSchema.Field FIELD_Skills = SCHEMA.getField("skills");
    private final static StringArray DEFAULT_Skills;
    private final static RecordDataSchema.Field FIELD_PictureLink = SCHEMA.getField("pictureLink");
    private final static com.linkedin.common.url.Url DEFAULT_PictureLink;
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Platforms = SCHEMA.getField("platforms");
    private final static RecordDataSchema.Field FIELD_Persona = SCHEMA.getField("persona");
    private final static RecordDataSchema.Field FIELD_Slack = SCHEMA.getField("slack");
    private final static RecordDataSchema.Field FIELD_Phone = SCHEMA.getField("phone");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");
    private final static RecordDataSchema.Field FIELD_InformationSources = SCHEMA.getField("informationSources");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_Teams = ((FIELD_Teams.getDefault() == null)?null:new StringArray(DataTemplateUtil.castOrThrow(FIELD_Teams.getDefault(), DataList.class)));
        DEFAULT_Skills = ((FIELD_Skills.getDefault() == null)?null:new StringArray(DataTemplateUtil.castOrThrow(FIELD_Skills.getDefault(), DataList.class)));
        DEFAULT_PictureLink = DataTemplateUtil.coerceCustomOutput(FIELD_PictureLink.getDefault(), com.linkedin.common.url.Url.class);
    }

    public CorpUserEditableInfo() {
        super(new DataMap(), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public CorpUserEditableInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserEditableInfo.Fields fields() {
        return _fields;
    }

    public static CorpUserEditableInfo.ProjectionMask createMask() {
        return new CorpUserEditableInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public boolean hasAboutMe() {
        if (_aboutMeField!= null) {
            return true;
        }
        return super._map.containsKey("aboutMe");
    }

    /**
     * Remover for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public void removeAboutMe() {
        super._map.remove("aboutMe");
    }

    /**
     * Getter for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    @Nullable
    public String getAboutMe(GetMode mode) {
        return getAboutMe();
    }

    /**
     * Getter for aboutMe
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    @Nullable
    public String getAboutMe() {
        if (_aboutMeField!= null) {
            return _aboutMeField;
        } else {
            Object __rawValue = super._map.get("aboutMe");
            _aboutMeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aboutMeField;
        }
    }

    /**
     * Setter for aboutMe
     * 
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public CorpUserEditableInfo setAboutMe(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAboutMe(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAboutMe();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aboutMe", value);
                    _aboutMeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aboutMe", value);
                    _aboutMeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aboutMe
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#aboutMe
     */
    public CorpUserEditableInfo setAboutMe(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aboutMe of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aboutMe", value);
            _aboutMeField = value;
        }
        return this;
    }

    /**
     * Existence checker for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    public boolean hasTeams() {
        if (_teamsField!= null) {
            return true;
        }
        return super._map.containsKey("teams");
    }

    /**
     * Remover for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    public void removeTeams() {
        super._map.remove("teams");
    }

    /**
     * Getter for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    @Nullable
    public StringArray getTeams(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getTeams();
            case NULL:
                if (_teamsField!= null) {
                    return _teamsField;
                } else {
                    Object __rawValue = super._map.get("teams");
                    _teamsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _teamsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for teams
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserEditableInfo.Fields#teams
     */
    @Nonnull
    public StringArray getTeams() {
        if (_teamsField!= null) {
            return _teamsField;
        } else {
            Object __rawValue = super._map.get("teams");
            if (__rawValue == null) {
                return DEFAULT_Teams;
            }
            _teamsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _teamsField;
        }
    }

    /**
     * Setter for teams
     * 
     * @see CorpUserEditableInfo.Fields#teams
     */
    public CorpUserEditableInfo setTeams(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTeams(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field teams of com.linkedin.identity.CorpUserEditableInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "teams", value.data());
                    _teamsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTeams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "teams", value.data());
                    _teamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "teams", value.data());
                    _teamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for teams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#teams
     */
    public CorpUserEditableInfo setTeams(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field teams of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "teams", value.data());
            _teamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    public boolean hasSkills() {
        if (_skillsField!= null) {
            return true;
        }
        return super._map.containsKey("skills");
    }

    /**
     * Remover for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    public void removeSkills() {
        super._map.remove("skills");
    }

    /**
     * Getter for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    @Nullable
    public StringArray getSkills(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getSkills();
            case NULL:
                if (_skillsField!= null) {
                    return _skillsField;
                } else {
                    Object __rawValue = super._map.get("skills");
                    _skillsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _skillsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for skills
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserEditableInfo.Fields#skills
     */
    @Nonnull
    public StringArray getSkills() {
        if (_skillsField!= null) {
            return _skillsField;
        } else {
            Object __rawValue = super._map.get("skills");
            if (__rawValue == null) {
                return DEFAULT_Skills;
            }
            _skillsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _skillsField;
        }
    }

    /**
     * Setter for skills
     * 
     * @see CorpUserEditableInfo.Fields#skills
     */
    public CorpUserEditableInfo setSkills(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSkills(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field skills of com.linkedin.identity.CorpUserEditableInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "skills", value.data());
                    _skillsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSkills();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "skills", value.data());
                    _skillsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "skills", value.data());
                    _skillsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for skills
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#skills
     */
    public CorpUserEditableInfo setSkills(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field skills of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "skills", value.data());
            _skillsField = value;
        }
        return this;
    }

    /**
     * Existence checker for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public boolean hasPictureLink() {
        if (_pictureLinkField!= null) {
            return true;
        }
        return super._map.containsKey("pictureLink");
    }

    /**
     * Remover for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public void removePictureLink() {
        super._map.remove("pictureLink");
    }

    /**
     * Getter for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    @Nullable
    public com.linkedin.common.url.Url getPictureLink(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPictureLink();
            case NULL:
                if (_pictureLinkField!= null) {
                    return _pictureLinkField;
                } else {
                    Object __rawValue = super._map.get("pictureLink");
                    _pictureLinkField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
                    return _pictureLinkField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for pictureLink
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    @Nonnull
    public com.linkedin.common.url.Url getPictureLink() {
        if (_pictureLinkField!= null) {
            return _pictureLinkField;
        } else {
            Object __rawValue = super._map.get("pictureLink");
            if (__rawValue == null) {
                return DEFAULT_PictureLink;
            }
            _pictureLinkField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _pictureLinkField;
        }
    }

    /**
     * Setter for pictureLink
     * 
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public CorpUserEditableInfo setPictureLink(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPictureLink(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field pictureLink of com.linkedin.identity.CorpUserEditableInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _pictureLinkField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePictureLink();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _pictureLinkField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _pictureLinkField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for pictureLink
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#pictureLink
     */
    public CorpUserEditableInfo setPictureLink(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pictureLink of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _pictureLinkField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see CorpUserEditableInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        if (_displayNameField!= null) {
            return true;
        }
        return super._map.containsKey("displayName");
    }

    /**
     * Remover for displayName
     * 
     * @see CorpUserEditableInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see CorpUserEditableInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        return getDisplayName();
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see CorpUserEditableInfo.Fields#displayName
     */
    public CorpUserEditableInfo setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDisplayName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#displayName
     */
    public CorpUserEditableInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see CorpUserEditableInfo.Fields#title
     */
    public boolean hasTitle() {
        if (_titleField!= null) {
            return true;
        }
        return super._map.containsKey("title");
    }

    /**
     * Remover for title
     * 
     * @see CorpUserEditableInfo.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see CorpUserEditableInfo.Fields#title
     */
    @Nullable
    public String getTitle(GetMode mode) {
        return getTitle();
    }

    /**
     * Getter for title
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#title
     */
    @Nullable
    public String getTitle() {
        if (_titleField!= null) {
            return _titleField;
        } else {
            Object __rawValue = super._map.get("title");
            _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _titleField;
        }
    }

    /**
     * Setter for title
     * 
     * @see CorpUserEditableInfo.Fields#title
     */
    public CorpUserEditableInfo setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#title
     */
    public CorpUserEditableInfo setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for platforms
     * 
     * @see CorpUserEditableInfo.Fields#platforms
     */
    public boolean hasPlatforms() {
        if (_platformsField!= null) {
            return true;
        }
        return super._map.containsKey("platforms");
    }

    /**
     * Remover for platforms
     * 
     * @see CorpUserEditableInfo.Fields#platforms
     */
    public void removePlatforms() {
        super._map.remove("platforms");
    }

    /**
     * Getter for platforms
     * 
     * @see CorpUserEditableInfo.Fields#platforms
     */
    @Nullable
    public UrnArray getPlatforms(GetMode mode) {
        return getPlatforms();
    }

    /**
     * Getter for platforms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#platforms
     */
    @Nullable
    public UrnArray getPlatforms() {
        if (_platformsField!= null) {
            return _platformsField;
        } else {
            Object __rawValue = super._map.get("platforms");
            _platformsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _platformsField;
        }
    }

    /**
     * Setter for platforms
     * 
     * @see CorpUserEditableInfo.Fields#platforms
     */
    public CorpUserEditableInfo setPlatforms(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatforms(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatforms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platforms", value.data());
                    _platformsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platforms", value.data());
                    _platformsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platforms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#platforms
     */
    public CorpUserEditableInfo setPlatforms(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platforms of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platforms", value.data());
            _platformsField = value;
        }
        return this;
    }

    /**
     * Existence checker for persona
     * 
     * @see CorpUserEditableInfo.Fields#persona
     */
    public boolean hasPersona() {
        if (_personaField!= null) {
            return true;
        }
        return super._map.containsKey("persona");
    }

    /**
     * Remover for persona
     * 
     * @see CorpUserEditableInfo.Fields#persona
     */
    public void removePersona() {
        super._map.remove("persona");
    }

    /**
     * Getter for persona
     * 
     * @see CorpUserEditableInfo.Fields#persona
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPersona(GetMode mode) {
        return getPersona();
    }

    /**
     * Getter for persona
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#persona
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPersona() {
        if (_personaField!= null) {
            return _personaField;
        } else {
            Object __rawValue = super._map.get("persona");
            _personaField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _personaField;
        }
    }

    /**
     * Setter for persona
     * 
     * @see CorpUserEditableInfo.Fields#persona
     */
    public CorpUserEditableInfo setPersona(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPersona(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePersona();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "persona", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _personaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "persona", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _personaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for persona
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#persona
     */
    public CorpUserEditableInfo setPersona(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field persona of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "persona", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _personaField = value;
        }
        return this;
    }

    /**
     * Existence checker for slack
     * 
     * @see CorpUserEditableInfo.Fields#slack
     */
    public boolean hasSlack() {
        if (_slackField!= null) {
            return true;
        }
        return super._map.containsKey("slack");
    }

    /**
     * Remover for slack
     * 
     * @see CorpUserEditableInfo.Fields#slack
     */
    public void removeSlack() {
        super._map.remove("slack");
    }

    /**
     * Getter for slack
     * 
     * @see CorpUserEditableInfo.Fields#slack
     */
    @Nullable
    public String getSlack(GetMode mode) {
        return getSlack();
    }

    /**
     * Getter for slack
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#slack
     */
    @Nullable
    public String getSlack() {
        if (_slackField!= null) {
            return _slackField;
        } else {
            Object __rawValue = super._map.get("slack");
            _slackField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _slackField;
        }
    }

    /**
     * Setter for slack
     * 
     * @see CorpUserEditableInfo.Fields#slack
     */
    public CorpUserEditableInfo setSlack(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSlack(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSlack();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "slack", value);
                    _slackField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "slack", value);
                    _slackField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for slack
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#slack
     */
    public CorpUserEditableInfo setSlack(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field slack of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "slack", value);
            _slackField = value;
        }
        return this;
    }

    /**
     * Existence checker for phone
     * 
     * @see CorpUserEditableInfo.Fields#phone
     */
    public boolean hasPhone() {
        if (_phoneField!= null) {
            return true;
        }
        return super._map.containsKey("phone");
    }

    /**
     * Remover for phone
     * 
     * @see CorpUserEditableInfo.Fields#phone
     */
    public void removePhone() {
        super._map.remove("phone");
    }

    /**
     * Getter for phone
     * 
     * @see CorpUserEditableInfo.Fields#phone
     */
    @Nullable
    public String getPhone(GetMode mode) {
        return getPhone();
    }

    /**
     * Getter for phone
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#phone
     */
    @Nullable
    public String getPhone() {
        if (_phoneField!= null) {
            return _phoneField;
        } else {
            Object __rawValue = super._map.get("phone");
            _phoneField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _phoneField;
        }
    }

    /**
     * Setter for phone
     * 
     * @see CorpUserEditableInfo.Fields#phone
     */
    public CorpUserEditableInfo setPhone(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPhone(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePhone();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "phone", value);
                    _phoneField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "phone", value);
                    _phoneField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for phone
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#phone
     */
    public CorpUserEditableInfo setPhone(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field phone of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "phone", value);
            _phoneField = value;
        }
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see CorpUserEditableInfo.Fields#email
     */
    public boolean hasEmail() {
        if (_emailField!= null) {
            return true;
        }
        return super._map.containsKey("email");
    }

    /**
     * Remover for email
     * 
     * @see CorpUserEditableInfo.Fields#email
     */
    public void removeEmail() {
        super._map.remove("email");
    }

    /**
     * Getter for email
     * 
     * @see CorpUserEditableInfo.Fields#email
     */
    @Nullable
    public String getEmail(GetMode mode) {
        return getEmail();
    }

    /**
     * Getter for email
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#email
     */
    @Nullable
    public String getEmail() {
        if (_emailField!= null) {
            return _emailField;
        } else {
            Object __rawValue = super._map.get("email");
            _emailField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _emailField;
        }
    }

    /**
     * Setter for email
     * 
     * @see CorpUserEditableInfo.Fields#email
     */
    public CorpUserEditableInfo setEmail(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEmail(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEmail();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "email", value);
                    _emailField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "email", value);
                    _emailField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for email
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#email
     */
    public CorpUserEditableInfo setEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field email of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "email", value);
            _emailField = value;
        }
        return this;
    }

    /**
     * Existence checker for informationSources
     * 
     * @see CorpUserEditableInfo.Fields#informationSources
     */
    public boolean hasInformationSources() {
        if (_informationSourcesField!= null) {
            return true;
        }
        return super._map.containsKey("informationSources");
    }

    /**
     * Remover for informationSources
     * 
     * @see CorpUserEditableInfo.Fields#informationSources
     */
    public void removeInformationSources() {
        super._map.remove("informationSources");
    }

    /**
     * Getter for informationSources
     * 
     * @see CorpUserEditableInfo.Fields#informationSources
     */
    @Nullable
    public UrnArray getInformationSources(GetMode mode) {
        return getInformationSources();
    }

    /**
     * Getter for informationSources
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserEditableInfo.Fields#informationSources
     */
    @Nullable
    public UrnArray getInformationSources() {
        if (_informationSourcesField!= null) {
            return _informationSourcesField;
        } else {
            Object __rawValue = super._map.get("informationSources");
            _informationSourcesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _informationSourcesField;
        }
    }

    /**
     * Setter for informationSources
     * 
     * @see CorpUserEditableInfo.Fields#informationSources
     */
    public CorpUserEditableInfo setInformationSources(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInformationSources(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInformationSources();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "informationSources", value.data());
                    _informationSourcesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "informationSources", value.data());
                    _informationSourcesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for informationSources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserEditableInfo.Fields#informationSources
     */
    public CorpUserEditableInfo setInformationSources(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field informationSources of com.linkedin.identity.CorpUserEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "informationSources", value.data());
            _informationSourcesField = value;
        }
        return this;
    }

    @Override
    public CorpUserEditableInfo clone()
        throws CloneNotSupportedException
    {
        CorpUserEditableInfo __clone = ((CorpUserEditableInfo) super.clone());
        __clone.__changeListener = new CorpUserEditableInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserEditableInfo copy()
        throws CloneNotSupportedException
    {
        CorpUserEditableInfo __copy = ((CorpUserEditableInfo) super.copy());
        __copy._skillsField = null;
        __copy._personaField = null;
        __copy._teamsField = null;
        __copy._phoneField = null;
        __copy._displayNameField = null;
        __copy._slackField = null;
        __copy._informationSourcesField = null;
        __copy._pictureLinkField = null;
        __copy._titleField = null;
        __copy._emailField = null;
        __copy._aboutMeField = null;
        __copy._platformsField = null;
        __copy.__changeListener = new CorpUserEditableInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserEditableInfo __objectRef;

        private ChangeListener(CorpUserEditableInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "skills":
                    __objectRef._skillsField = null;
                    break;
                case "persona":
                    __objectRef._personaField = null;
                    break;
                case "teams":
                    __objectRef._teamsField = null;
                    break;
                case "phone":
                    __objectRef._phoneField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "slack":
                    __objectRef._slackField = null;
                    break;
                case "informationSources":
                    __objectRef._informationSourcesField = null;
                    break;
                case "pictureLink":
                    __objectRef._pictureLinkField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "email":
                    __objectRef._emailField = null;
                    break;
                case "aboutMe":
                    __objectRef._aboutMeField = null;
                    break;
                case "platforms":
                    __objectRef._platformsField = null;
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
         * About me section of the user
         * 
         */
        public PathSpec aboutMe() {
            return new PathSpec(getPathComponents(), "aboutMe");
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public PathSpec teams() {
            return new PathSpec(getPathComponents(), "teams");
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public PathSpec teams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "teams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public PathSpec skills() {
            return new PathSpec(getPathComponents(), "skills");
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public PathSpec skills(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "skills");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A URL which points to a picture which user wants to set as a profile photo
         * 
         */
        public PathSpec pictureLink() {
            return new PathSpec(getPathComponents(), "pictureLink");
        }

        /**
         * DataHub-native display name
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * DataHub-native Title, e.g. 'Software Engineer'
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * The platforms that the user commonly works with
         * 
         */
        public PathSpec platforms() {
            return new PathSpec(getPathComponents(), "platforms");
        }

        /**
         * The platforms that the user commonly works with
         * 
         */
        public PathSpec platforms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "platforms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The user's persona type, based on their role
         * 
         */
        public PathSpec persona() {
            return new PathSpec(getPathComponents(), "persona");
        }

        /**
         * Slack handle for the user
         * 
         */
        public PathSpec slack() {
            return new PathSpec(getPathComponents(), "slack");
        }

        /**
         * Phone number to contact the user
         * 
         */
        public PathSpec phone() {
            return new PathSpec(getPathComponents(), "phone");
        }

        /**
         * Email address to contact the user
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

        /**
         * Information sources that have been used to populate this CorpUserEditableInfo.
         * These include platform resources, such as Slack members or Looker users.
         * They can also refer to other semantic urns in the future.
         * 
         */
        public PathSpec informationSources() {
            return new PathSpec(getPathComponents(), "informationSources");
        }

        /**
         * Information sources that have been used to populate this CorpUserEditableInfo.
         * These include platform resources, such as Slack members or Looker users.
         * They can also refer to other semantic urns in the future.
         * 
         */
        public PathSpec informationSources(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "informationSources");
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
        }

        /**
         * About me section of the user
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withAboutMe() {
            getDataMap().put("aboutMe", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withTeams() {
            getDataMap().put("teams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withTeams(Integer start, Integer count) {
            getDataMap().put("teams", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("teams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("teams").put("$count", count);
            }
            return this;
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withSkills() {
            getDataMap().put("skills", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withSkills(Integer start, Integer count) {
            getDataMap().put("skills", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("skills").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("skills").put("$count", count);
            }
            return this;
        }

        /**
         * A URL which points to a picture which user wants to set as a profile photo
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withPictureLink() {
            getDataMap().put("pictureLink", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * DataHub-native display name
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * DataHub-native Title, e.g. 'Software Engineer'
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The platforms that the user commonly works with
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withPlatforms() {
            getDataMap().put("platforms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The platforms that the user commonly works with
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withPlatforms(Integer start, Integer count) {
            getDataMap().put("platforms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("platforms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("platforms").put("$count", count);
            }
            return this;
        }

        /**
         * The user's persona type, based on their role
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withPersona() {
            getDataMap().put("persona", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Slack handle for the user
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withSlack() {
            getDataMap().put("slack", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Phone number to contact the user
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withPhone() {
            getDataMap().put("phone", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Email address to contact the user
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withEmail() {
            getDataMap().put("email", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information sources that have been used to populate this CorpUserEditableInfo.
         * These include platform resources, such as Slack members or Looker users.
         * They can also refer to other semantic urns in the future.
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withInformationSources() {
            getDataMap().put("informationSources", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information sources that have been used to populate this CorpUserEditableInfo.
         * These include platform resources, such as Slack members or Looker users.
         * They can also refer to other semantic urns in the future.
         * 
         */
        public CorpUserEditableInfo.ProjectionMask withInformationSources(Integer start, Integer count) {
            getDataMap().put("informationSources", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("informationSources").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("informationSources").put("$count", count);
            }
            return this;
        }

    }

}
