
package com.linkedin.notebook;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.ChangeAuditStamps;
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
 * Common attributes for a cell in a Notebook
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/notebook/CommonCellAttributes.pdl.")
public class CommonCellAttributes
    extends RecordTemplate
{

    private final static CommonCellAttributes.Fields _fields = new CommonCellAttributes.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.notebook/**Common attributes for a cell in a Notebook*/record CommonCellAttributes{/**Title of the cell*/cellTitle:optional string/**Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'*/cellId:string/**Captures information about who created/last modified/deleted this Notebook cell and when*/changeAuditStamps:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}}", SchemaFormatType.PDL));
    private String _cellTitleField = null;
    private String _cellIdField = null;
    private ChangeAuditStamps _changeAuditStampsField = null;
    private CommonCellAttributes.ChangeListener __changeListener = new CommonCellAttributes.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CellTitle = SCHEMA.getField("cellTitle");
    private final static RecordDataSchema.Field FIELD_CellId = SCHEMA.getField("cellId");
    private final static RecordDataSchema.Field FIELD_ChangeAuditStamps = SCHEMA.getField("changeAuditStamps");

    public CommonCellAttributes() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public CommonCellAttributes(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CommonCellAttributes.Fields fields() {
        return _fields;
    }

    public static CommonCellAttributes.ProjectionMask createMask() {
        return new CommonCellAttributes.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for cellTitle
     * 
     * @see CommonCellAttributes.Fields#cellTitle
     */
    public boolean hasCellTitle() {
        if (_cellTitleField!= null) {
            return true;
        }
        return super._map.containsKey("cellTitle");
    }

    /**
     * Remover for cellTitle
     * 
     * @see CommonCellAttributes.Fields#cellTitle
     */
    public void removeCellTitle() {
        super._map.remove("cellTitle");
    }

    /**
     * Getter for cellTitle
     * 
     * @see CommonCellAttributes.Fields#cellTitle
     */
    @Nullable
    public String getCellTitle(GetMode mode) {
        return getCellTitle();
    }

    /**
     * Getter for cellTitle
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CommonCellAttributes.Fields#cellTitle
     */
    @Nullable
    public String getCellTitle() {
        if (_cellTitleField!= null) {
            return _cellTitleField;
        } else {
            Object __rawValue = super._map.get("cellTitle");
            _cellTitleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _cellTitleField;
        }
    }

    /**
     * Setter for cellTitle
     * 
     * @see CommonCellAttributes.Fields#cellTitle
     */
    public CommonCellAttributes setCellTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCellTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCellTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cellTitle", value);
                    _cellTitleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cellTitle", value);
                    _cellTitleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cellTitle
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CommonCellAttributes.Fields#cellTitle
     */
    public CommonCellAttributes setCellTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cellTitle of com.linkedin.notebook.CommonCellAttributes to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cellTitle", value);
            _cellTitleField = value;
        }
        return this;
    }

    /**
     * Existence checker for cellId
     * 
     * @see CommonCellAttributes.Fields#cellId
     */
    public boolean hasCellId() {
        if (_cellIdField!= null) {
            return true;
        }
        return super._map.containsKey("cellId");
    }

    /**
     * Remover for cellId
     * 
     * @see CommonCellAttributes.Fields#cellId
     */
    public void removeCellId() {
        super._map.remove("cellId");
    }

    /**
     * Getter for cellId
     * 
     * @see CommonCellAttributes.Fields#cellId
     */
    @Nullable
    public String getCellId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCellId();
            case DEFAULT:
            case NULL:
                if (_cellIdField!= null) {
                    return _cellIdField;
                } else {
                    Object __rawValue = super._map.get("cellId");
                    _cellIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _cellIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cellId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CommonCellAttributes.Fields#cellId
     */
    @Nonnull
    public String getCellId() {
        if (_cellIdField!= null) {
            return _cellIdField;
        } else {
            Object __rawValue = super._map.get("cellId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("cellId");
            }
            _cellIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _cellIdField;
        }
    }

    /**
     * Setter for cellId
     * 
     * @see CommonCellAttributes.Fields#cellId
     */
    public CommonCellAttributes setCellId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCellId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field cellId of com.linkedin.notebook.CommonCellAttributes");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cellId", value);
                    _cellIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCellId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cellId", value);
                    _cellIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cellId", value);
                    _cellIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cellId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CommonCellAttributes.Fields#cellId
     */
    public CommonCellAttributes setCellId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cellId of com.linkedin.notebook.CommonCellAttributes to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cellId", value);
            _cellIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for changeAuditStamps
     * 
     * @see CommonCellAttributes.Fields#changeAuditStamps
     */
    public boolean hasChangeAuditStamps() {
        if (_changeAuditStampsField!= null) {
            return true;
        }
        return super._map.containsKey("changeAuditStamps");
    }

    /**
     * Remover for changeAuditStamps
     * 
     * @see CommonCellAttributes.Fields#changeAuditStamps
     */
    public void removeChangeAuditStamps() {
        super._map.remove("changeAuditStamps");
    }

    /**
     * Getter for changeAuditStamps
     * 
     * @see CommonCellAttributes.Fields#changeAuditStamps
     */
    @Nullable
    public ChangeAuditStamps getChangeAuditStamps(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getChangeAuditStamps();
            case DEFAULT:
            case NULL:
                if (_changeAuditStampsField!= null) {
                    return _changeAuditStampsField;
                } else {
                    Object __rawValue = super._map.get("changeAuditStamps");
                    _changeAuditStampsField = ((__rawValue == null)?null:new ChangeAuditStamps(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _changeAuditStampsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for changeAuditStamps
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CommonCellAttributes.Fields#changeAuditStamps
     */
    @Nonnull
    public ChangeAuditStamps getChangeAuditStamps() {
        if (_changeAuditStampsField!= null) {
            return _changeAuditStampsField;
        } else {
            Object __rawValue = super._map.get("changeAuditStamps");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("changeAuditStamps");
            }
            _changeAuditStampsField = ((__rawValue == null)?null:new ChangeAuditStamps(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _changeAuditStampsField;
        }
    }

    /**
     * Setter for changeAuditStamps
     * 
     * @see CommonCellAttributes.Fields#changeAuditStamps
     */
    public CommonCellAttributes setChangeAuditStamps(
        @Nullable
        ChangeAuditStamps value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChangeAuditStamps(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field changeAuditStamps of com.linkedin.notebook.CommonCellAttributes");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
                    _changeAuditStampsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChangeAuditStamps();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
                    _changeAuditStampsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
                    _changeAuditStampsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for changeAuditStamps
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CommonCellAttributes.Fields#changeAuditStamps
     */
    public CommonCellAttributes setChangeAuditStamps(
        @Nonnull
        ChangeAuditStamps value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field changeAuditStamps of com.linkedin.notebook.CommonCellAttributes to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "changeAuditStamps", value.data());
            _changeAuditStampsField = value;
        }
        return this;
    }

    @Override
    public CommonCellAttributes clone()
        throws CloneNotSupportedException
    {
        CommonCellAttributes __clone = ((CommonCellAttributes) super.clone());
        __clone.__changeListener = new CommonCellAttributes.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CommonCellAttributes copy()
        throws CloneNotSupportedException
    {
        CommonCellAttributes __copy = ((CommonCellAttributes) super.copy());
        __copy._changeAuditStampsField = null;
        __copy._cellIdField = null;
        __copy._cellTitleField = null;
        __copy.__changeListener = new CommonCellAttributes.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CommonCellAttributes __objectRef;

        private ChangeListener(CommonCellAttributes reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "changeAuditStamps":
                    __objectRef._changeAuditStampsField = null;
                    break;
                case "cellId":
                    __objectRef._cellIdField = null;
                    break;
                case "cellTitle":
                    __objectRef._cellTitleField = null;
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
         * Title of the cell
         * 
         */
        public PathSpec cellTitle() {
            return new PathSpec(getPathComponents(), "cellTitle");
        }

        /**
         * Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'
         * 
         */
        public PathSpec cellId() {
            return new PathSpec(getPathComponents(), "cellId");
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public com.linkedin.common.ChangeAuditStamps.Fields changeAuditStamps() {
            return new com.linkedin.common.ChangeAuditStamps.Fields(getPathComponents(), "changeAuditStamps");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.ChangeAuditStamps.ProjectionMask _changeAuditStampsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Title of the cell
         * 
         */
        public CommonCellAttributes.ProjectionMask withCellTitle() {
            getDataMap().put("cellTitle", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique id for the cell. This id should be globally unique for a Notebook tool even when there are multiple deployments of it. As an example, Notebook URL could be used here for QueryBook such as 'querybook.com/notebook/773/?cellId=1234'
         * 
         */
        public CommonCellAttributes.ProjectionMask withCellId() {
            getDataMap().put("cellId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public CommonCellAttributes.ProjectionMask withChangeAuditStamps(Function<com.linkedin.common.ChangeAuditStamps.ProjectionMask, com.linkedin.common.ChangeAuditStamps.ProjectionMask> nestedMask) {
            _changeAuditStampsMask = nestedMask.apply(((_changeAuditStampsMask == null)?ChangeAuditStamps.createMask():_changeAuditStampsMask));
            getDataMap().put("changeAuditStamps", _changeAuditStampsMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public CommonCellAttributes.ProjectionMask withChangeAuditStamps(MaskMap nestedMask) {
            getDataMap().put("changeAuditStamps", nestedMask.getDataMap());
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this Notebook cell and when
         * 
         */
        public CommonCellAttributes.ProjectionMask withChangeAuditStamps() {
            _changeAuditStampsMask = null;
            getDataMap().put("changeAuditStamps", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
