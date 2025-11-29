import { Button, Modal, Table } from '@components';
import { message, Tag } from 'antd';
import React, { useCallback, useMemo, useState } from 'react';
import { useHistory } from 'react-router-dom';
import styled from 'styled-components';

import { useUserContext } from '@app/context/useUserContext';
import AddTagToGroupModal from '@app/tags/AddTagToGroupModal/AddTagToGroupModal';
import EditTagGroupModal from '@app/tags/EditTagGroupModal/EditTagGroupModal';
import { AlignmentOptions } from '@src/alchemy-components/theme/config';
import { useEntityRegistry } from '@src/app/useEntityRegistry';
import {
    ListTagGroupsQuery,
    useDeleteTagGroupMutation,
    useRemoveTagFromGroupMutation,
} from '@src/graphql/tagGroup.generated';
import { EntityType } from '@src/types.generated';

type Props = {
    searchQuery: string;
    searchData: ListTagGroupsQuery | undefined;
    loading: boolean;
    refetch: () => Promise<any>;
};

const ColorDot = styled.span<{ $color: string }>`
    display: inline-block;
    width: 12px;
    height: 12px;
    border-radius: 50%;
    background-color: ${(props) => props.$color};
    margin-right: 8px;
`;

const NameContainer = styled.div`
    display: flex;
    align-items: center;
`;

const TagsContainer = styled.div`
    display: flex;
    flex-wrap: wrap;
    gap: 8px;
    max-width: 600px;
`;

const StyledTag = styled.span`
    cursor: pointer;
    margin: 0;
    padding: 2px 8px;
    border: 1px solid;
    border-radius: 4px;
    font-size: 12px;

    &:hover {
        opacity: 0.8;
    }
`;

const ExpandedRowContainer = styled.div`
    padding: 16px;
    background-color: #fafafa;
`;

const ExpandedTitle = styled.div`
    font-weight: 600;
    margin-bottom: 12px;
    color: #262626;
`;

const TagItemContainer = styled.div`
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 8px 12px;
    background-color: #ffffff;
    border-radius: 4px;
    margin-bottom: 8px;
    border: 1px solid #e8e8e8;

    &:hover {
        background-color: #f5f5f5;
    }
`;

const TagItemInfo = styled.div`
    display: flex;
    align-items: center;
    gap: 8px;
`;

const ActionButtons = styled.div`
    display: flex;
    gap: 8px;
`;

const TagGroupsTable = ({ searchQuery, searchData, loading, refetch }: Props) => {
    const entityRegistry = useEntityRegistry();
    const history = useHistory();
    const userContext = useUserContext();
    const canManageTags = Boolean(userContext?.platformPrivileges?.manageTags);

    const [deleteTagGroupMutation] = useDeleteTagGroupMutation();
    const [removeTagFromGroupMutation] = useRemoveTagFromGroupMutation();

    const [showEditModal, setShowEditModal] = useState(false);
    const [editingTagGroupUrn, setEditingTagGroupUrn] = useState('');

    const [showAddTagsModal, setShowAddTagsModal] = useState(false);
    const [addTagsToGroupUrn, setAddTagsToGroupUrn] = useState('');

    const tagGroupsData = useMemo(() => {
        return searchData?.search?.searchResults || [];
    }, [searchData]);

    const handleDelete = useCallback(
        (urn: string, name: string) => {
            deleteTagGroupMutation({
                variables: { urn },
            })
                .then(() => {
                    message.success(`Tag group "${name}" has been deleted`);
                    refetch();
                })
                .catch((e: any) => {
                    message.error(`Failed to delete tag group: ${e.message}`);
                });
        },
        [deleteTagGroupMutation, refetch],
    );

    const handleRemoveTag = useCallback(
        (tagUrn: string, tagGroupUrn: string, tagName: string) => {
            removeTagFromGroupMutation({
                variables: { tagUrn, tagGroupUrn },
            })
                .then(() => {
                    message.success(`Tag "${tagName}" removed from group`);
                    refetch();
                })
                .catch((e: any) => {
                    message.error(`Failed to remove tag: ${e.message}`);
                });
        },
        [removeTagFromGroupMutation, refetch],
    );

    const handleTagClick = useCallback(
        (tagUrn: string) => {
            const tagUrl = entityRegistry.getEntityUrl(EntityType.Tag, tagUrn);
            history.push(tagUrl);
        },
        [entityRegistry, history],
    );

    const expandedRowRender = useCallback(
        (record: any) => {
            const tagGroup = record.entity;
            if (tagGroup.__typename !== 'TagGroup') return null;
            const tags = tagGroup?.tags?.relationships || [];

            if (tags.length === 0) {
                return (
                    <ExpandedRowContainer>
                        <ExpandedTitle>Associated Tags</ExpandedTitle>
                        <div>No tags associated with this group</div>
                    </ExpandedRowContainer>
                );
            }

            return (
                <ExpandedRowContainer>
                    <ExpandedTitle>Associated Tags ({tags.length})</ExpandedTitle>
                    {tags.map((relationship: any) => {
                        const tag = relationship.entity;
                        if (!tag || tag.__typename !== 'Tag') return null;

                        const tagName = tag.properties?.name || tag.urn;
                        const tagColor = tag.properties?.colorHex || '#1890ff';

                        return (
                            <TagItemContainer key={tag.urn}>
                                <TagItemInfo>
                                    <ColorDot $color={tagColor} />
                                    <StyledTag onClick={() => handleTagClick(tag.urn)}>{tagName}</StyledTag>
                                    {tag.properties?.description && (
                                        <span style={{ color: '#8c8c8c', fontSize: '12px' }}>
                                            {tag.properties.description}
                                        </span>
                                    )}
                                </TagItemInfo>
                                {canManageTags && (
                                    <ActionButtons>
                                        <Button
                                            size="sm"
                                            variant="text"
                                            color="red"
                                            onClick={() => {
                                                if (window.confirm('Remove tag from this group?')) {
                                                    handleRemoveTag(tag.urn, tagGroup.urn, tagName);
                                                }
                                            }}
                                        >
                                            Remove
                                        </Button>
                                    </ActionButtons>
                                )}
                            </TagItemContainer>
                        );
                    })}
                </ExpandedRowContainer>
            );
        },
        [canManageTags, handleRemoveTag, handleTagClick],
    );

    const columns = useMemo(
        () => [
            {
                title: 'Name',
                key: 'name',
                render: (record: any) => {
                    const tagGroup = record.entity;
                    const name = tagGroup.properties?.name || tagGroup.urn;
                    const color = tagGroup.properties?.colorHex || '#1890ff';

                    return (
                        <NameContainer>
                            <ColorDot $color={color} />
                            <span>{name}</span>
                        </NameContainer>
                    );
                },
            },
            {
                title: 'Description',
                key: 'description',
                render: (record: any) => {
                    const description = record.entity.properties?.description;
                    return description ? <span>{description}</span> : <span style={{ color: '#8c8c8c' }}>-</span>;
                },
            },
            {
                title: 'Tags',
                key: 'tags',
                render: (record: any) => {
                    const tagGroup = record.entity;
                    if (tagGroup.__typename !== 'TagGroup') return null;
                    const tagsCount = tagGroup.tags?.total || 0;
                    const tags = tagGroup.tags?.relationships || [];

                    if (tagsCount === 0) {
                        return <span style={{ color: '#8c8c8c' }}>No tags</span>;
                    }

                    return (
                        <TagsContainer>
                            {tags.slice(0, 3).map((relationship: any) => {
                                const tag = relationship.entity;
                                if (!tag || tag.__typename !== 'Tag') return null;

                                const tagName = tag.properties?.name || tag.urn;
                                const tagColor = tag.properties?.colorHex || '#1890ff';

                                return (
                                    <StyledTag
                                        key={tag.urn}
                                        onClick={() => handleTagClick(tag.urn)}
                                        style={{ borderColor: tagColor, color: tagColor }}
                                    >
                                        {tagName}
                                    </StyledTag>
                                );
                            })}
                            {tagsCount > 3 && <span style={{ color: '#8c8c8c' }}>+{tagsCount - 3} more</span>}
                        </TagsContainer>
                    );
                },
            },
            {
                title: '',
                key: 'actions',
                alignment: 'right' as AlignmentOptions,
                render: (record: any) => {
                    const tagGroup = record.entity;
                    const name = tagGroup.properties?.name || tagGroup.urn;

                    return (
                        <ActionButtons>
                            <Button
                                size="sm"
                                variant="text"
                                color="violet"
                                onClick={() => {
                                    setAddTagsToGroupUrn(tagGroup.urn);
                                    setShowAddTagsModal(true);
                                }}
                                disabled={!canManageTags}
                            >
                                Add Tags
                            </Button>
                            <Button
                                size="sm"
                                variant="text"
                                color="violet"
                                onClick={() => {
                                    setEditingTagGroupUrn(tagGroup.urn);
                                    setShowEditModal(true);
                                }}
                                disabled={!canManageTags}
                            >
                                Edit
                            </Button>
                            <Button
                                size="sm"
                                variant="text"
                                color="red"
                                disabled={!canManageTags}
                                onClick={() => {
                                    if (
                                        window.confirm(
                                            `Delete tag group "${name}"?\n\nThis action cannot be undone.`,
                                        )
                                    ) {
                                        handleDelete(tagGroup.urn, name);
                                    }
                                }}
                            >
                                Delete
                            </Button>
                        </ActionButtons>
                    );
                },
            },
        ],
        [canManageTags, handleDelete, handleTagClick],
    );

    const tableData = useMemo(() => {
        return tagGroupsData.map((result) => ({
            ...result,
            key: result.entity.urn,
        }));
    }, [tagGroupsData]);

    return (
        <>
            <Table
                columns={columns}
                data={tableData}
                isLoading={loading}
                isScrollable
                rowKey="key"
                expandable={{
                    expandedRowRender,
                    rowExpandable: (record) => {
                        const tagGroup = record.entity;
                        if (tagGroup.__typename !== 'TagGroup') return false;
                        const tags = tagGroup.tags?.relationships || [];
                        return tags.length > 0;
                    },
                }}
            />

            {showEditModal && (
                <EditTagGroupModal
                    open={showEditModal}
                    tagGroupUrn={editingTagGroupUrn}
                    onClose={() => {
                        setShowEditModal(false);
                        refetch();
                    }}
                />
            )}

            {showAddTagsModal && (
                <AddTagToGroupModal
                    open={showAddTagsModal}
                    tagGroupUrn={addTagsToGroupUrn}
                    onClose={() => {
                        setShowAddTagsModal(false);
                        refetch();
                    }}
                />
            )}
        </>
    );
};

export default TagGroupsTable;
