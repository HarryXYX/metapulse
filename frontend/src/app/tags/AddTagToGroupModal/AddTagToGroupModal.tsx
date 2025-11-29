import { Modal, SearchBar } from '@components';
import { Checkbox, message } from 'antd';
import React, { useEffect, useMemo, useState } from 'react';
import styled from 'styled-components';

import { ModalButton } from '@components/components/Modal/Modal';

import { useEntityRegistry } from '@src/app/useEntityRegistry';
import { useGetSearchResultsForMultipleQuery } from '@src/graphql/search.generated';
import { useBatchAddTagsToGroupMutation, useGetTagGroupQuery } from '@src/graphql/tagGroup.generated';
import { EntityType } from '@src/types.generated';

type AddTagToGroupModalProps = {
    open: boolean;
    tagGroupUrn: string;
    onClose: () => void;
};

const SectionContainer = styled.div`
    margin-bottom: 16px;
`;

const SearchContainer = styled.div`
    margin-bottom: 16px;
`;

const TagListContainer = styled.div`
    max-height: 400px;
    overflow-y: auto;
    border: 1px solid #e8e8e8;
    border-radius: 4px;
    padding: 8px;
`;

const TagItem = styled.div<{ $disabled: boolean }>`
    padding: 12px;
    border-bottom: 1px solid #f0f0f0;
    display: flex;
    align-items: center;
    gap: 12px;
    cursor: ${(props) => (props.$disabled ? 'not-allowed' : 'pointer')};
    opacity: ${(props) => (props.$disabled ? 0.5 : 1)};

    &:last-child {
        border-bottom: none;
    }

    &:hover {
        background-color: ${(props) => (props.$disabled ? 'transparent' : '#f5f5f5')};
    }
`;

const TagInfo = styled.div`
    flex: 1;
`;

const TagName = styled.div`
    font-weight: 500;
    color: #262626;
`;

const TagDescription = styled.div`
    font-size: 12px;
    color: #8c8c8c;
    margin-top: 4px;
`;

const ColorDot = styled.span<{ $color: string }>`
    display: inline-block;
    width: 12px;
    height: 12px;
    border-radius: 50%;
    background-color: ${(props) => props.$color};
    margin-right: 8px;
`;

const EmptyMessage = styled.div`
    padding: 40px;
    text-align: center;
    color: #8c8c8c;
`;

const LoadingMessage = styled.div`
    padding: 40px;
    text-align: center;
    color: #8c8c8c;
`;

/**
 * Modal for adding tags to a tag group
 */
const AddTagToGroupModal: React.FC<AddTagToGroupModalProps> = ({ onClose, open, tagGroupUrn }) => {
    const [searchQuery, setSearchQuery] = useState('*');
    const [selectedTagUrns, setSelectedTagUrns] = useState<string[]>([]);
    const [isLoading, setIsLoading] = useState(false);

    const entityRegistry = useEntityRegistry();

    // Get existing tags in the group
    const { data: tagGroupData } = useGetTagGroupQuery({
        variables: { urn: tagGroupUrn },
        skip: !tagGroupUrn,
    });

    // Get all available tags
    const { data: searchData, loading: searchLoading } = useGetSearchResultsForMultipleQuery({
        variables: {
            input: {
                types: [EntityType.Tag],
                query: searchQuery,
                start: 0,
                count: 100,
                filters: [],
            },
        },
    });

    const [batchAddTagsToGroupMutation] = useBatchAddTagsToGroupMutation();

    // Get list of existing tag URNs in the group
    const existingTagUrns = useMemo(() => {
        const relationships = tagGroupData?.tagGroup?.tags?.relationships || [];
        return new Set(
            relationships
                .map((rel) => rel.entity)
                .filter((entity): entity is { __typename: 'Tag'; urn: string } => entity?.__typename === 'Tag')
                .map((entity) => entity.urn),
        );
    }, [tagGroupData]);

    // Filter out tags that are already in the group
    const availableTags = useMemo(() => {
        const results = searchData?.searchAcrossEntities?.searchResults || [];
        return results.filter((result) => {
            const entity = result.entity;
            if (entity.__typename !== 'Tag') return false;
            return !existingTagUrns.has(entity.urn);
        });
    }, [searchData, existingTagUrns]);

    const handleToggleTag = (tagUrn: string) => {
        setSelectedTagUrns((prev) => {
            if (prev.includes(tagUrn)) {
                return prev.filter((urn) => urn !== tagUrn);
            }
            return [...prev, tagUrn];
        });
    };

    const onOk = async () => {
        if (selectedTagUrns.length === 0) {
            message.warning('Please select at least one tag');
            return;
        }

        setIsLoading(true);

        try {
            await batchAddTagsToGroupMutation({
                variables: {
                    tagUrns: selectedTagUrns,
                    tagGroupUrn,
                },
            });

            message.success(`Successfully added ${selectedTagUrns.length} tag(s) to the group`);
            onClose();
            setSelectedTagUrns([]);
        } catch (e: any) {
            message.destroy();
            message.error(`Failed to add tags. ${e.message}`);
        } finally {
            setIsLoading(false);
        }
    };

    const buttons: ModalButton[] = [
        {
            text: 'Cancel',
            color: 'violet',
            variant: 'text',
            onClick: onClose,
            buttonDataTestId: 'add-tags-modal-cancel-button',
        },
        {
            text: `Add ${selectedTagUrns.length > 0 ? `(${selectedTagUrns.length})` : ''}`,
            color: 'violet',
            variant: 'filled',
            onClick: onOk,
            disabled: selectedTagUrns.length === 0 || isLoading,
            isLoading,
            buttonDataTestId: 'add-tags-modal-add-button',
        },
    ];

    return (
        <Modal
            title="Add Tags to Group"
            onCancel={onClose}
            buttons={buttons}
            open={open}
            centered
            width={600}
            dataTestId="add-tags-to-group-modal"
        >
            <SectionContainer>
                <SearchContainer>
                    <SearchBar
                        placeholder="Search tags..."
                        value={searchQuery === '*' ? '' : searchQuery}
                        onChange={(value) => setSearchQuery(value || '*')}
                        width="100%"
                    />
                </SearchContainer>

                <TagListContainer>
                    {searchLoading ? (
                        <LoadingMessage>Loading tags...</LoadingMessage>
                    ) : availableTags.length === 0 ? (
                        <EmptyMessage>
                            {existingTagUrns.size > 0
                                ? 'All available tags are already in this group'
                                : 'No tags found'}
                        </EmptyMessage>
                    ) : (
                        availableTags.map((result) => {
                            const tag = result.entity;
                            if (tag.__typename !== 'Tag') return null;
                            const tagName = entityRegistry.getDisplayName(EntityType.Tag, tag);
                            const tagProps = tag.properties as any;
                            const tagDescription = tagProps?.description;
                            const tagColor = tag.properties?.colorHex ?? '#1890ff';
                            const isSelected = selectedTagUrns.includes(tag.urn);

                            return (
                                <TagItem
                                    key={tag.urn}
                                    $disabled={false}
                                    onClick={() => handleToggleTag(tag.urn)}
                                >
                                    <Checkbox checked={isSelected} onChange={() => handleToggleTag(tag.urn)} />
                                    <ColorDot $color={tagColor} />
                                    <TagInfo>
                                        <TagName>{tagName}</TagName>
                                        {tagDescription && <TagDescription>{tagDescription}</TagDescription>}
                                    </TagInfo>
                                </TagItem>
                            );
                        })
                    )}
                </TagListContainer>
            </SectionContainer>
        </Modal>
    );
};

export default AddTagToGroupModal;
