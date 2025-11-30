import { Modal } from '@components';
import { message, Spin } from 'antd';
import React, { useCallback, useState } from 'react';
import { useHistory } from 'react-router-dom';
import styled from 'styled-components';

import { useUserContext } from '@app/context/useUserContext';
import { useEntityRegistry } from '@src/app/useEntityRegistry';
import { useGetTagGroupQuery, useRemoveTagFromGroupMutation } from '@src/graphql/tagGroup.generated';
import { EntityType } from '@src/types.generated';

type Props = {
    open: boolean;
    tagGroupUrn: string;
    onClose: () => void;
    onTagRemoved?: (tagUrn: string) => void;
};

const ModalContent = styled.div`
    padding: 0;
`;

const Header = styled.div`
    display: flex;
    align-items: center;
    gap: 12px;
    margin-bottom: 24px;
`;

const ColorDot = styled.span<{ $color: string }>`
    display: inline-block;
    width: 24px;
    height: 24px;
    border-radius: 50%;
    background-color: ${(props) => props.$color};
    flex-shrink: 0;
`;

const HeaderInfo = styled.div`
    flex: 1;
`;

const GroupName = styled.h2`
    margin: 0 0 4px 0;
    font-size: 20px;
    font-weight: 600;
    color: #262626;
`;

const GroupDescription = styled.p`
    margin: 0;
    font-size: 14px;
    color: #8c8c8c;
`;

const Section = styled.div`
    margin-bottom: 20px;
`;

const SectionTitle = styled.h3`
    font-size: 14px;
    font-weight: 600;
    color: #262626;
    margin: 0 0 12px 0;
    display: flex;
    align-items: center;
    gap: 8px;
`;

const TagCount = styled.span`
    font-size: 12px;
    font-weight: 400;
    color: #8c8c8c;
    background: #f5f5f5;
    padding: 2px 8px;
    border-radius: 10px;
`;

const TagsList = styled.div`
    display: flex;
    flex-direction: column;
    gap: 8px;
    max-height: 300px;
    overflow-y: auto;
`;

const TagItem = styled.div`
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 10px 12px;
    background-color: #fafafa;
    border-radius: 6px;
    border: 1px solid #f0f0f0;
    transition: all 0.2s;

    &:hover {
        background-color: #f5f5f5;
        border-color: #e8e8e8;
    }
`;

const TagInfo = styled.div`
    display: flex;
    align-items: center;
    gap: 10px;
    flex: 1;
    cursor: pointer;
`;

const TagColorDot = styled.span<{ $color: string }>`
    display: inline-block;
    width: 12px;
    height: 12px;
    border-radius: 50%;
    background-color: ${(props) => props.$color};
    flex-shrink: 0;
`;

const TagName = styled.span`
    font-size: 14px;
    font-weight: 500;
    color: #262626;
`;

const TagDescription = styled.span`
    font-size: 12px;
    color: #8c8c8c;
    margin-left: 8px;
`;

const RemoveButton = styled.button`
    background: none;
    border: none;
    color: #ff4d4f;
    cursor: pointer;
    font-size: 12px;
    padding: 4px 8px;
    border-radius: 4px;
    transition: all 0.2s;

    &:hover {
        background-color: #fff1f0;
    }

    &:disabled {
        color: #d9d9d9;
        cursor: not-allowed;
    }
`;

const EmptyState = styled.div`
    text-align: center;
    padding: 32px;
    color: #8c8c8c;
`;

const LoadingContainer = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 48px;
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

const TagGroupDetailModal = ({ open, tagGroupUrn, onClose, onTagRemoved }: Props) => {
    const entityRegistry = useEntityRegistry();
    const history = useHistory();
    const userContext = useUserContext();
    const canManageTags = Boolean(userContext?.platformPrivileges?.manageTags);

    const { data, loading, refetch } = useGetTagGroupQuery({
        variables: { urn: tagGroupUrn },
        skip: !tagGroupUrn,
        fetchPolicy: 'network-only',
    });

    const [removeTagFromGroupMutation] = useRemoveTagFromGroupMutation();

    // Track removing tag info for modal display
    const [removingTag, setRemovingTag] = useState<{ tagName: string; isRemoving: boolean } | null>(null);

    const tagGroup = data?.tagGroup;
    const tags = tagGroup?.tags?.relationships || [];

    const handleTagClick = useCallback(
        (tagUrn: string) => {
            const tagUrl = entityRegistry.getEntityUrl(EntityType.Tag, tagUrn);
            history.push(tagUrl);
            onClose();
        },
        [entityRegistry, history, onClose],
    );

    const handleRemoveTag = useCallback(
        async (tagUrn: string, tagName: string) => {
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

                // Optimistic update callback
                if (onTagRemoved) {
                    onTagRemoved(tagUrn);
                }

                setRemovingTag(null);
                // Auto close modal after successful removal
                onClose();
            } catch (e: any) {
                message.error(`Failed to remove tag: ${e.message}`);
                setRemovingTag(null);
            }
        },
        [removeTagFromGroupMutation, tagGroupUrn, onTagRemoved, onClose],
    );

    const name = tagGroup?.properties?.name || tagGroupUrn;
    const description = tagGroup?.properties?.description;
    const color = tagGroup?.properties?.colorHex || '#1890ff';

    if (!open) return null;

    return (
        <Modal title="Tag Group Details" onCancel={onClose} width={560}>
            <ModalContent>
                {loading ? (
                    <LoadingContainer>
                        <Spin size="large" />
                    </LoadingContainer>
                ) : (
                    <>
                        <Header>
                            <ColorDot $color={color} />
                            <HeaderInfo>
                                <GroupName>{name}</GroupName>
                                {description && <GroupDescription>{description}</GroupDescription>}
                            </HeaderInfo>
                        </Header>

                        <Section>
                            <SectionTitle>
                                Associated Tags
                                <TagCount>{tags.length}</TagCount>
                            </SectionTitle>

                            {tags.length === 0 ? (
                                <EmptyState>No tags associated with this group</EmptyState>
                            ) : (
                                <TagsList>
                                    {tags.map((relationship: any) => {
                                        const tag = relationship.entity;
                                        if (!tag || tag.__typename !== 'Tag') return null;

                                        const tagName = tag.properties?.name || tag.urn;
                                        const tagColor = tag.properties?.colorHex || '#1890ff';
                                        const tagDescription = tag.properties?.description;

                                        return (
                                            <TagItem key={tag.urn}>
                                                <TagInfo onClick={() => handleTagClick(tag.urn)}>
                                                    <TagColorDot $color={tagColor} />
                                                    <TagName>{tagName}</TagName>
                                                    {tagDescription && (
                                                        <TagDescription>{tagDescription}</TagDescription>
                                                    )}
                                                </TagInfo>
                                                {canManageTags && (
                                                    <RemoveButton
                                                        onClick={() => handleRemoveTag(tag.urn, tagName)}
                                                    >
                                                        Remove
                                                    </RemoveButton>
                                                )}
                                            </TagItem>
                                        );
                                    })}
                                </TagsList>
                            )}
                        </Section>
                    </>
                )}
            </ModalContent>

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
        </Modal>
    );
};

export default TagGroupDetailModal;
