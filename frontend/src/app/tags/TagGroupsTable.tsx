import { Button, Modal, Table } from '@components';
import { CloseOutlined } from '@ant-design/icons';
import { message, Spin, Tooltip } from 'antd';
import { CaretDown, CaretRight } from 'phosphor-react';
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
    refetch: () => Promise<void>;
    updateTagGroupTagsLocally: (tagGroupUrn: string, tagUrn: string, action: 'add' | 'remove', tagData?: any) => void;
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

const TagWithRemove = styled.span<{ $color: string }>`
    display: inline-flex;
    align-items: center;
    gap: 4px;
    padding: 2px 6px 2px 8px;
    border: 1px solid ${(props) => props.$color};
    border-radius: 4px;
    font-size: 12px;
    color: ${(props) => props.$color};
    cursor: pointer;
    transition: all 0.2s;

    &:hover {
        background-color: ${(props) => props.$color}10;
    }
`;

const TagName = styled.span`
    max-width: 100px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
`;

const RemoveIcon = styled(CloseOutlined)`
    font-size: 10px;
    padding: 2px;
    border-radius: 50%;
    transition: all 0.2s;

    &:hover {
        background-color: #ff4d4f;
        color: white;
    }
`;

const ExpandedRowContainer = styled.div`
    padding: 24px;
    background: linear-gradient(135deg, #fafbfc 0%, #f5f7fa 100%);
    border-top: 1px solid #e8ebed;
`;

const ExpandedTitle = styled.div`
    font-size: 14px;
    font-weight: 600;
    margin-bottom: 20px;
    color: #1f2937;
    display: flex;
    align-items: center;
    gap: 8px;

    &::before {
        content: '';
        display: inline-block;
        width: 4px;
        height: 16px;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        border-radius: 2px;
    }
`;

const TagsGrid = styled.div`
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(280px, 1fr));
    gap: 12px;

    @media (max-width: 768px) {
        grid-template-columns: 1fr;
    }
`;

const TagItemContainer = styled.div<{ $color: string }>`
    position: relative;
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 14px 16px;
    background-color: #ffffff;
    border-radius: 8px;
    border-left: 3px solid ${(props) => props.$color};
    box-shadow: 0 1px 3px rgba(0, 0, 0, 0.06), 0 1px 2px rgba(0, 0, 0, 0.04);
    transition: all 0.25s cubic-bezier(0.4, 0, 0.2, 1);
    overflow: hidden;

    &::before {
        content: '';
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        background: ${(props) => props.$color};
        opacity: 0;
        transition: opacity 0.25s cubic-bezier(0.4, 0, 0.2, 1);
        pointer-events: none;
    }

    &:hover {
        transform: translateY(-2px);
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1), 0 2px 4px rgba(0, 0, 0, 0.06);
        border-left-width: 4px;

        &::before {
            opacity: 0.04;
        }
    }
`;

const TagItemInfo = styled.div`
    display: flex;
    align-items: flex-start;
    gap: 12px;
    cursor: pointer;
    flex: 1;
    min-width: 0;
    transition: opacity 0.2s ease;

    &:hover {
        opacity: 0.8;
    }
`;

const TagIconWrapper = styled.div<{ $color: string }>`
    display: flex;
    align-items: center;
    justify-content: center;
    width: 32px;
    height: 32px;
    border-radius: 6px;
    background: ${(props) => props.$color}15;
    flex-shrink: 0;
    transition: all 0.2s ease;

    ${TagItemContainer}:hover & {
        background: ${(props) => props.$color}25;
        transform: scale(1.05);
    }
`;

const TagContentWrapper = styled.div`
    display: flex;
    flex-direction: column;
    gap: 4px;
    flex: 1;
    min-width: 0;
`;

const ExpandedEmptyState = styled.div`
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    padding: 48px 24px;
    text-align: center;
    color: #6b7280;
    background: #ffffff;
    border-radius: 8px;
    border: 2px dashed #e5e7eb;
`;

const EmptyStateIcon = styled.div`
    font-size: 48px;
    margin-bottom: 12px;
    opacity: 0.5;
`;

const EmptyStateText = styled.div`
    font-size: 14px;
    font-weight: 500;
    color: #4b5563;
`;

const ExpandedTagName = styled.span`
    font-weight: 600;
    font-size: 14px;
    color: #1f2937;
    line-height: 1.4;
    word-break: break-word;
    transition: color 0.2s ease;

    &:hover {
        color: #4f46e5;
    }
`;

const TagDescription = styled.span`
    font-size: 12px;
    color: #6b7280;
    line-height: 1.4;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    overflow: hidden;
    text-overflow: ellipsis;
`;

const ExpandIcon = styled.div`
    display: flex;
    align-items: center;
    justify-content: center;
    cursor: pointer;
    padding: 4px;
    border-radius: 4px;
    color: #8c8c8c;

    &:hover {
        background-color: #f0f0f0;
        color: #1890ff;
    }
`;

const ActionButtons = styled.div`
    display: flex;
    gap: 8px;
`;

const RemovingModalContent = styled.div`
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    padding: 24px;
    gap: 16px;
`;

const RemovingText = styled.div`
    font-size: 14px;
    color: #262626;
`;

const TagGroupsTable = ({ searchQuery, searchData, loading, refetch, updateTagGroupTagsLocally }: Props) => {
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

    // Track expanded rows
    const [expandedRowKeys, setExpandedRowKeys] = useState<Set<string>>(new Set());

    const toggleExpand = useCallback((urn: string) => {
        setExpandedRowKeys((prev) => {
            const next = new Set(prev);
            if (next.has(urn)) {
                next.delete(urn);
            } else {
                next.add(urn);
            }
            return next;
        });
    }, []);

    // Track removing tag info for modal display
    const [removingTag, setRemovingTag] = useState<{ tagName: string; isRemoving: boolean } | null>(null);

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
        async (tagUrn: string, tagGroupUrn: string, tagName: string) => {
            // Show removing modal
            setRemovingTag({ tagName, isRemoving: true });

            try {
                await removeTagFromGroupMutation({
                    variables: { tagUrn, tagGroupUrn },
                });
                message.success(`Tag "${tagName}" removed from group`);

                // Optimistic update: immediately update local state
                updateTagGroupTagsLocally(tagGroupUrn, tagUrn, 'remove');
                setRemovingTag(null);
            } catch (e: any) {
                message.error(`Failed to remove tag: ${e.message}`);
                setRemovingTag(null);
            }
        },
        [removeTagFromGroupMutation, updateTagGroupTagsLocally],
    );

    const handleTagClick = useCallback(
        (tagUrn: string) => {
            const tagUrl = entityRegistry.getEntityUrl(EntityType.Tag, tagUrn);
            history.push(tagUrl);
        },
        [entityRegistry, history],
    );


    const handleQuickRemoveTag = useCallback(
        async (e: React.MouseEvent, tagUrn: string, tagGroupUrn: string, tagName: string) => {
            e.stopPropagation();
            if (!window.confirm(`Remove tag "${tagName}" from this group?`)) {
                return;
            }

            // Show removing modal
            setRemovingTag({ tagName, isRemoving: true });

            try {
                await removeTagFromGroupMutation({
                    variables: { tagUrn, tagGroupUrn },
                });
                message.success(`Tag "${tagName}" removed from group`);

                // Optimistic update: immediately update local state
                updateTagGroupTagsLocally(tagGroupUrn, tagUrn, 'remove');
                setRemovingTag(null);
            } catch (err: any) {
                message.error(`Failed to remove tag: ${err.message}`);
                setRemovingTag(null);
            }
        },
        [removeTagFromGroupMutation, updateTagGroupTagsLocally],
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
                        <ExpandedEmptyState>
                            <EmptyStateIcon>🏷️</EmptyStateIcon>
                            <EmptyStateText>No tags associated with this group</EmptyStateText>
                        </ExpandedEmptyState>
                    </ExpandedRowContainer>
                );
            }

            return (
                <ExpandedRowContainer>
                    <ExpandedTitle>Associated Tags ({tags.length})</ExpandedTitle>
                    <TagsGrid>
                        {tags.map((relationship: any) => {
                            const tag = relationship.entity;
                            if (!tag || tag.__typename !== 'Tag') return null;

                            const tagName = tag.properties?.name || tag.urn;
                            const tagColor = tag.properties?.colorHex || '#1890ff';

                            return (
                                <TagItemContainer key={tag.urn} $color={tagColor}>
                                    <TagItemInfo onClick={() => handleTagClick(tag.urn)}>
                                        <TagIconWrapper $color={tagColor}>
                                            <ColorDot $color={tagColor} />
                                        </TagIconWrapper>
                                        <TagContentWrapper>
                                            <ExpandedTagName>{tagName}</ExpandedTagName>
                                            {tag.properties?.description && (
                                                <TagDescription>{tag.properties.description}</TagDescription>
                                            )}
                                        </TagContentWrapper>
                                    </TagItemInfo>
                                    {canManageTags && (
                                        <ActionButtons>
                                            <Button
                                                size="sm"
                                                variant="text"
                                                color="red"
                                                onClick={(e: React.MouseEvent) => {
                                                    e.stopPropagation();
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
                    </TagsGrid>
                </ExpandedRowContainer>
            );
        },
        [canManageTags, handleRemoveTag, handleTagClick],
    );

    const columns = useMemo(
        () => [
            {
                title: '',
                key: 'expand',
                width: '40px',
                render: (record: any) => {
                    const urn = record.entity.urn;
                    const isExpanded = expandedRowKeys.has(urn);
                    return (
                        <ExpandIcon
                            onClick={(e: React.MouseEvent) => {
                                e.stopPropagation();
                                toggleExpand(urn);
                            }}
                        >
                            {isExpanded ? <CaretDown size={16} weight="bold" /> : <CaretRight size={16} weight="bold" />}
                        </ExpandIcon>
                    );
                },
            },
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
                    const tags = tagGroup.tags?.relationships || [];
                    const tagsCount = tags.length;

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
                                    <Tooltip key={tag.urn} title={tagName}>
                                        <TagWithRemove $color={tagColor}>
                                            <TagName
                                                onClick={(e: React.MouseEvent) => {
                                                    e.stopPropagation();
                                                    handleTagClick(tag.urn);
                                                }}
                                            >
                                                {tagName}
                                            </TagName>
                                            {canManageTags && (
                                                <RemoveIcon
                                                    onClick={(e: React.MouseEvent) =>
                                                        handleQuickRemoveTag(
                                                            e,
                                                            tag.urn,
                                                            tagGroup.urn,
                                                            tagName,
                                                        )
                                                    }
                                                />
                                            )}
                                        </TagWithRemove>
                                    </Tooltip>
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
                                onClick={(e: React.MouseEvent) => {
                                    e.stopPropagation();
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
                                onClick={(e: React.MouseEvent) => {
                                    e.stopPropagation();
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
                                onClick={(e: React.MouseEvent) => {
                                    e.stopPropagation();
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
        [canManageTags, handleDelete, handleTagClick, handleQuickRemoveTag, expandedRowKeys, toggleExpand],
    );

    const tableData = useMemo(() => {
        return tagGroupsData.map((result) => ({
            ...result,
            key: result.entity.urn,
            // Table component uses row.name for expandedGroupIds matching
            name: result.entity.urn,
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
                    // Set rowExpandable to false to disable Table's built-in expand icon
                    // We use our own expand icon column on the left
                    rowExpandable: () => false,
                    expandedGroupIds: Array.from(expandedRowKeys),
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
                    onClose={() => setShowAddTagsModal(false)}
                    onSuccess={(addedTags) => {
                        // Optimistic update: add each tag to local state
                        addedTags.forEach((tag) => {
                            updateTagGroupTagsLocally(addTagsToGroupUrn, tag.urn, 'add', {
                                __typename: 'Tag',
                                urn: tag.urn,
                                properties: {
                                    name: tag.name,
                                    colorHex: tag.colorHex,
                                    description: tag.description,
                                },
                            });
                        });
                    }}
                />
            )}

            {/* Removing tag modal */}
            <Modal
                title="Removing Tag"
                open={removingTag?.isRemoving ?? false}
                onCancel={() => {}}
                closable={false}
                width={300}
            >
                <RemovingModalContent>
                    <Spin size="large" />
                    <RemovingText>
                        Removing tag &quot;{removingTag?.tagName}&quot;...
                    </RemovingText>
                </RemovingModalContent>
            </Modal>
        </>
    );
};

export default TagGroupsTable;
