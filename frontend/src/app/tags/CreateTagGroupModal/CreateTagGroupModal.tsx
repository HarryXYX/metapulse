import { ColorPicker, Input, Modal } from '@components';
import { message } from 'antd';
import React, { useState } from 'react';
import styled from 'styled-components';

import { ModalButton } from '@components/components/Modal/Modal';

import { useEnterKeyListener } from '@app/shared/useEnterKeyListener';
import { useCreateTagGroupMutation } from '@src/graphql/tagGroup.generated';

type CreateTagGroupModalProps = {
    open: boolean;
    onClose: () => void;
};

const SectionContainer = styled.div`
    margin-bottom: 24px;
`;

const FormSection = styled.div`
    margin-bottom: 16px;
`;

/**
 * Modal for creating a new tag group
 */
const CreateTagGroupModal: React.FC<CreateTagGroupModalProps> = ({ onClose, open }) => {
    const [name, setName] = useState('');
    const [description, setDescription] = useState('');
    const [color, setColor] = useState('#1890ff');
    const [isLoading, setIsLoading] = useState(false);

    const [createTagGroupMutation] = useCreateTagGroupMutation();

    const onOk = async () => {
        if (!name) {
            message.error('Tag group name is required');
            return;
        }

        setIsLoading(true);

        try {
            await createTagGroupMutation({
                variables: {
                    input: {
                        name: name.trim(),
                        description: description || undefined,
                        colorHex: color,
                    },
                },
            });

            message.success(`Tag group "${name}" successfully created`);
            onClose();
            setName('');
            setDescription('');
            setColor('#1890ff');
        } catch (e: any) {
            message.destroy();
            message.error(`Failed to create tag group. ${e.message}`);
        } finally {
            setIsLoading(false);
        }
    };

    useEnterKeyListener({
        querySelectorToExecuteClick: '#createTagGroupButton',
    });

    const buttons: ModalButton[] = [
        {
            text: 'Cancel',
            color: 'violet',
            variant: 'text',
            onClick: onClose,
            buttonDataTestId: 'create-tag-group-modal-cancel-button',
        },
        {
            text: 'Create',
            id: 'createTagGroupButton',
            color: 'violet',
            variant: 'filled',
            onClick: onOk,
            disabled: !name || isLoading,
            isLoading,
            buttonDataTestId: 'create-tag-group-modal-create-button',
        },
    ];

    return (
        <Modal
            title="Create New Tag Group"
            onCancel={onClose}
            buttons={buttons}
            open={open}
            centered
            width={500}
            dataTestId="create-tag-group-modal"
        >
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
        </Modal>
    );
};

export default CreateTagGroupModal;
