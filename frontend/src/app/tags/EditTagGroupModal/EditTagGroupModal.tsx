import { ColorPicker, Input, Modal } from '@components';
import { message } from 'antd';
import React, { useEffect, useState } from 'react';
import styled from 'styled-components';

import { ModalButton } from '@components/components/Modal/Modal';

import { useEnterKeyListener } from '@app/shared/useEnterKeyListener';
import { useGetTagGroupQuery, useUpdateTagGroupMutation } from '@src/graphql/tagGroup.generated';

type EditTagGroupModalProps = {
    open: boolean;
    tagGroupUrn: string;
    onClose: () => void;
};

const SectionContainer = styled.div`
    margin-bottom: 24px;
`;

const FormSection = styled.div`
    margin-bottom: 16px;
`;

const LoadingContainer = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 40px;
`;

/**
 * Modal for editing an existing tag group
 */
const EditTagGroupModal: React.FC<EditTagGroupModalProps> = ({ onClose, open, tagGroupUrn }) => {
    const [name, setName] = useState('');
    const [description, setDescription] = useState('');
    const [color, setColor] = useState('#1890ff');
    const [isLoading, setIsLoading] = useState(false);

    const { data, loading: queryLoading } = useGetTagGroupQuery({
        variables: { urn: tagGroupUrn },
        skip: !tagGroupUrn,
    });

    const [updateTagGroupMutation] = useUpdateTagGroupMutation();

    // Populate form with existing data
    useEffect(() => {
        if (data?.tagGroup) {
            setName(data.tagGroup.properties?.name || '');
            setDescription(data.tagGroup.properties?.description || '');
            setColor(data.tagGroup.properties?.colorHex || '#1890ff');
        }
    }, [data]);

    const onOk = async () => {
        if (!name) {
            message.error('Tag group name is required');
            return;
        }

        setIsLoading(true);

        try {
            await updateTagGroupMutation({
                variables: {
                    urn: tagGroupUrn,
                    input: {
                        name: name.trim(),
                        description: description || undefined,
                        colorHex: color,
                    },
                },
            });

            message.success(`Tag group "${name}" successfully updated`);
            onClose();
        } catch (e: any) {
            message.destroy();
            message.error(`Failed to update tag group. ${e.message}`);
        } finally {
            setIsLoading(false);
        }
    };

    useEnterKeyListener({
        querySelectorToExecuteClick: '#updateTagGroupButton',
    });

    const buttons: ModalButton[] = [
        {
            text: 'Cancel',
            color: 'violet',
            variant: 'text',
            onClick: onClose,
            buttonDataTestId: 'edit-tag-group-modal-cancel-button',
        },
        {
            text: 'Update',
            id: 'updateTagGroupButton',
            color: 'violet',
            variant: 'filled',
            onClick: onOk,
            disabled: !name || isLoading || queryLoading,
            isLoading: isLoading || queryLoading,
            buttonDataTestId: 'edit-tag-group-modal-update-button',
        },
    ];

    return (
        <Modal
            title="Edit Tag Group"
            onCancel={onClose}
            buttons={buttons}
            open={open}
            centered
            width={500}
            dataTestId="edit-tag-group-modal"
        >
            {queryLoading ? (
                <LoadingContainer>Loading...</LoadingContainer>
            ) : (
                <SectionContainer>
                    <FormSection>
                        <Input
                            label="Name"
                            value={name}
                            setValue={setName}
                            placeholder="Enter tag group name"
                            data-testid="tag-group-name-field"
                            required
                        />
                    </FormSection>

                    <FormSection>
                        <Input
                            label="Description"
                            value={description}
                            setValue={setDescription}
                            placeholder="Add a description for your tag group"
                            data-testid="tag-group-description-field"
                            type="textarea"
                        />
                    </FormSection>

                    <FormSection>
                        <ColorPicker initialColor={color} onChange={setColor} label="Color" />
                    </FormSection>
                </SectionContainer>
            )}
        </Modal>
    );
};

export default EditTagGroupModal;
