
package com.linkedin.query;

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
 * Information about the subjects of a particular Query, i.e. the assets
 * being queried.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/query/QuerySubjects.pdl.")
public class QuerySubjects
    extends RecordTemplate
{

    private final static QuerySubjects.Fields _fields = new QuerySubjects.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.query/**Information about the subjects of a particular Query, i.e. the assets\nbeing queried.*/@Aspect.name=\"querySubjects\"record QuerySubjects{/**One or more subjects of the query.\n\nIn single-asset queries (e.g. table select), this will contain the Table reference\nand optionally schema field references.\n\nIn multi-asset queries (e.g. table joins), this may contain multiple Table references\nand optionally schema field references.*/subjects:array[/**A single subject of a particular query.\nIn the future, we may evolve this model to include richer details\nabout the Query Subject in relation to the query.*/record QuerySubject{/**An entity which is the subject of a query.*/@Searchable={\"fieldName\":\"entities\",\"fieldType\":\"URN\"}entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]}", SchemaFormatType.PDL));
    private QuerySubjectArray _subjectsField = null;
    private QuerySubjects.ChangeListener __changeListener = new QuerySubjects.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Subjects = SCHEMA.getField("subjects");

    public QuerySubjects() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public QuerySubjects(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static QuerySubjects.Fields fields() {
        return _fields;
    }

    public static QuerySubjects.ProjectionMask createMask() {
        return new QuerySubjects.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for subjects
     * 
     * @see QuerySubjects.Fields#subjects
     */
    public boolean hasSubjects() {
        if (_subjectsField!= null) {
            return true;
        }
        return super._map.containsKey("subjects");
    }

    /**
     * Remover for subjects
     * 
     * @see QuerySubjects.Fields#subjects
     */
    public void removeSubjects() {
        super._map.remove("subjects");
    }

    /**
     * Getter for subjects
     * 
     * @see QuerySubjects.Fields#subjects
     */
    @Nullable
    public QuerySubjectArray getSubjects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSubjects();
            case DEFAULT:
            case NULL:
                if (_subjectsField!= null) {
                    return _subjectsField;
                } else {
                    Object __rawValue = super._map.get("subjects");
                    _subjectsField = ((__rawValue == null)?null:new QuerySubjectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _subjectsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for subjects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see QuerySubjects.Fields#subjects
     */
    @Nonnull
    public QuerySubjectArray getSubjects() {
        if (_subjectsField!= null) {
            return _subjectsField;
        } else {
            Object __rawValue = super._map.get("subjects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("subjects");
            }
            _subjectsField = ((__rawValue == null)?null:new QuerySubjectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _subjectsField;
        }
    }

    /**
     * Setter for subjects
     * 
     * @see QuerySubjects.Fields#subjects
     */
    public QuerySubjects setSubjects(
        @Nullable
        QuerySubjectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSubjects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field subjects of com.linkedin.query.QuerySubjects");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "subjects", value.data());
                    _subjectsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSubjects();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "subjects", value.data());
                    _subjectsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "subjects", value.data());
                    _subjectsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for subjects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QuerySubjects.Fields#subjects
     */
    public QuerySubjects setSubjects(
        @Nonnull
        QuerySubjectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field subjects of com.linkedin.query.QuerySubjects to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "subjects", value.data());
            _subjectsField = value;
        }
        return this;
    }

    @Override
    public QuerySubjects clone()
        throws CloneNotSupportedException
    {
        QuerySubjects __clone = ((QuerySubjects) super.clone());
        __clone.__changeListener = new QuerySubjects.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public QuerySubjects copy()
        throws CloneNotSupportedException
    {
        QuerySubjects __copy = ((QuerySubjects) super.copy());
        __copy._subjectsField = null;
        __copy.__changeListener = new QuerySubjects.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final QuerySubjects __objectRef;

        private ChangeListener(QuerySubjects reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "subjects":
                    __objectRef._subjectsField = null;
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
         * One or more subjects of the query.
         * 
         * In single-asset queries (e.g. table select), this will contain the Table reference
         * and optionally schema field references.
         * 
         * In multi-asset queries (e.g. table joins), this may contain multiple Table references
         * and optionally schema field references.
         * 
         */
        public com.linkedin.query.QuerySubjectArray.Fields subjects() {
            return new com.linkedin.query.QuerySubjectArray.Fields(getPathComponents(), "subjects");
        }

        /**
         * One or more subjects of the query.
         * 
         * In single-asset queries (e.g. table select), this will contain the Table reference
         * and optionally schema field references.
         * 
         * In multi-asset queries (e.g. table joins), this may contain multiple Table references
         * and optionally schema field references.
         * 
         */
        public PathSpec subjects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "subjects");
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

        private com.linkedin.query.QuerySubjectArray.ProjectionMask _subjectsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * One or more subjects of the query.
         * 
         * In single-asset queries (e.g. table select), this will contain the Table reference
         * and optionally schema field references.
         * 
         * In multi-asset queries (e.g. table joins), this may contain multiple Table references
         * and optionally schema field references.
         * 
         */
        public QuerySubjects.ProjectionMask withSubjects(Function<com.linkedin.query.QuerySubjectArray.ProjectionMask, com.linkedin.query.QuerySubjectArray.ProjectionMask> nestedMask) {
            _subjectsMask = nestedMask.apply(((_subjectsMask == null)?QuerySubjectArray.createMask():_subjectsMask));
            getDataMap().put("subjects", _subjectsMask.getDataMap());
            return this;
        }

        /**
         * One or more subjects of the query.
         * 
         * In single-asset queries (e.g. table select), this will contain the Table reference
         * and optionally schema field references.
         * 
         * In multi-asset queries (e.g. table joins), this may contain multiple Table references
         * and optionally schema field references.
         * 
         */
        public QuerySubjects.ProjectionMask withSubjects() {
            _subjectsMask = null;
            getDataMap().put("subjects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * One or more subjects of the query.
         * 
         * In single-asset queries (e.g. table select), this will contain the Table reference
         * and optionally schema field references.
         * 
         * In multi-asset queries (e.g. table joins), this may contain multiple Table references
         * and optionally schema field references.
         * 
         */
        public QuerySubjects.ProjectionMask withSubjects(Function<com.linkedin.query.QuerySubjectArray.ProjectionMask, com.linkedin.query.QuerySubjectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _subjectsMask = nestedMask.apply(((_subjectsMask == null)?QuerySubjectArray.createMask():_subjectsMask));
            getDataMap().put("subjects", _subjectsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("subjects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("subjects").put("$count", count);
            }
            return this;
        }

        /**
         * One or more subjects of the query.
         * 
         * In single-asset queries (e.g. table select), this will contain the Table reference
         * and optionally schema field references.
         * 
         * In multi-asset queries (e.g. table joins), this may contain multiple Table references
         * and optionally schema field references.
         * 
         */
        public QuerySubjects.ProjectionMask withSubjects(Integer start, Integer count) {
            _subjectsMask = null;
            getDataMap().put("subjects", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("subjects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("subjects").put("$count", count);
            }
            return this;
        }

    }

}
