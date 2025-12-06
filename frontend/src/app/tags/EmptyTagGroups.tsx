import { Empty, Typography } from 'antd';
import React from 'react';
import styled from 'styled-components';

type Props = {
    isEmptySearch: boolean;
};

const EmptyContainer = styled.div`
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    padding: 40px;
`;

const StyledEmpty = styled(Empty)`
    .ant-empty-description {
        margin-bottom: 12px;
    }
`;

const EmptyTagGroups = ({ isEmptySearch }: Props) => {
    return (
        <EmptyContainer>
            <StyledEmpty
                description={
                    <>
                        <Typography.Text data-testid="tag-groups-not-found">
                            {isEmptySearch ? 'No tag groups found for your search query' : 'No tag groups found'}
                        </Typography.Text>
                        <div>
                            {!isEmptySearch && (
                                <Typography.Paragraph>
                                    Tag groups can be used to organize and categorize tags in DataHub.
                                </Typography.Paragraph>
                            )}
                        </div>
                    </>
                }
                image={Empty.PRESENTED_IMAGE_SIMPLE}
            />
        </EmptyContainer>
    );
};

export default EmptyTagGroups;
