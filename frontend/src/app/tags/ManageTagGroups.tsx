import { Button, PageTitle, Pagination, SearchBar } from '@components';
import React, { useEffect, useMemo, useState } from 'react';
import { useHistory } from 'react-router-dom';
import styled from 'styled-components';

import { useUserContext } from '@app/context/useUserContext';
import { PageContainer } from '@app/govern/structuredProperties/styledComponents';
import CreateTagGroupModal from '@app/tags/CreateTagGroupModal/CreateTagGroupModal';
import EmptyTagGroups from '@app/tags/EmptyTagGroups';
import TagGroupsTable from '@app/tags/TagGroupsTable';
import { Message } from '@src/app/shared/Message';
import { useShowNavBarRedesign } from '@src/app/useShowNavBarRedesign';
import { useListTagGroupsQuery } from '@src/graphql/tagGroup.generated';
import { EntityType } from '@src/types.generated';
import { PageRoutes } from '@src/conf/Global';

const HeaderContainer = styled.div`
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 16px;
`;

const TabContainer = styled.div`
    display: flex;
    gap: 8px;
    margin-bottom: 16px;
    border-bottom: 1px solid #e8e8e8;
    padding-bottom: 8px;
`;

const TabButton = styled(Button)<{ $active: boolean }>`
    border: none;
    background: ${(props) => (props.$active ? '#f0f0f0' : 'transparent')};
    border-bottom: ${(props) => (props.$active ? '2px solid #1890ff' : '2px solid transparent')};
    border-radius: 0;
    padding: 8px 16px;

    &:hover {
        background: #f5f5f5;
    }
`;

const SearchContainer = styled.div`
    display: flex;
    align-items: center;
    margin-bottom: 16px;
`;

const LoadingBar = styled.div`
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 4px;
    background-color: #1890ff;
    z-index: 1000;
    animation: loading 2s infinite ease-in-out;

    @keyframes loading {
        0% {
            opacity: 0.6;
        }
        50% {
            opacity: 1;
        }
        100% {
            opacity: 0.6;
        }
    }
`;

const PAGE_SIZE = 10;

const ManageTagGroups = () => {
    const isShowNavBarRedesign = useShowNavBarRedesign();
    const history = useHistory();
    const [searchQuery, setSearchQuery] = useState('');
    const [currentPage, setCurrentPage] = useState(1);
    const [pageSize, setPageSize] = useState(PAGE_SIZE);
    const [debouncedSearchQuery, setDebouncedSearchQuery] = useState('*');
    const [showCreateModal, setShowCreateModal] = useState(false);

    // Check permissions using UserContext
    const userContext = useUserContext();
    const canManageTags = userContext?.platformPrivileges?.manageTags;

    // Debounce search query input to reduce unnecessary renders
    useEffect(() => {
        const timer = setTimeout(() => {
            setDebouncedSearchQuery(searchQuery || '*');
        }, 300);

        return () => clearTimeout(timer);
    }, [searchQuery]);

    // Search query configuration
    const searchInputs = useMemo(
        () => ({
            type: EntityType.TagGroup,
            query: debouncedSearchQuery,
            start: (currentPage - 1) * pageSize,
            count: pageSize,
        }),
        [currentPage, debouncedSearchQuery, pageSize],
    );

    const {
        data: searchData,
        loading: searchLoading,
        error: searchError,
        refetch,
    } = useListTagGroupsQuery({
        variables: { input: searchInputs },
        fetchPolicy: 'cache-first',
        notifyOnNetworkStatusChange: false,
    });

    const totalTagGroups = searchData?.search?.total || 0;

    // Check if we have results to display
    const hasSearchResults = useMemo(() => {
        const results = searchData?.search?.searchResults || [];
        return results.length > 0;
    }, [searchData]);

    if (searchError) {
        return <Message type="error" content={`Failed to load tag groups: ${searchError.message}`} />;
    }

    return (
        <PageContainer $isShowNavBarRedesign={isShowNavBarRedesign}>
            {searchLoading && <LoadingBar />}

            <HeaderContainer>
                <PageTitle title="Manage Tag Groups" subTitle="Create and organize tag groups" />
                <Button
                    onClick={() => setShowCreateModal(true)}
                    size="md"
                    color="violet"
                    icon={{ icon: 'Plus', source: 'phosphor' }}
                    data-testid="add-tag-group-button"
                    disabled={!canManageTags}
                >
                    Create Tag Group
                </Button>
            </HeaderContainer>

            <TabContainer>
                <TabButton
                    $active={false}
                    onClick={() => history.push(PageRoutes.MANAGE_TAGS)}
                    variant="text"
                    size="md"
                >
                    Tags
                </TabButton>
                <TabButton $active variant="text" size="md">
                    Tag Groups
                </TabButton>
            </TabContainer>

            <SearchContainer>
                <SearchBar
                    placeholder="Search tag groups..."
                    value={searchQuery}
                    onChange={(e) => setSearchQuery(e)}
                    data-testid="tag-group-search-input"
                    width="280px"
                />
            </SearchContainer>

            {!searchLoading && !hasSearchResults ? (
                <EmptyTagGroups isEmptySearch={debouncedSearchQuery.length > 0 && debouncedSearchQuery !== '*'} />
            ) : (
                <>
                    <TagGroupsTable
                        searchQuery={debouncedSearchQuery}
                        searchData={searchData}
                        loading={searchLoading}
                        refetch={refetch}
                    />
                    <Pagination
                        currentPage={currentPage}
                        itemsPerPage={pageSize}
                        total={totalTagGroups}
                        loading={searchLoading}
                        onPageChange={(newPage, newPageSize) => {
                            if (newPageSize !== pageSize) {
                                setCurrentPage(1);
                                setPageSize(newPageSize);
                            } else {
                                setCurrentPage(newPage);
                            }
                        }}
                    />
                </>
            )}

            <CreateTagGroupModal
                open={showCreateModal}
                onClose={() => {
                    setShowCreateModal(false);
                    setTimeout(() => refetch(), 1000);
                }}
            />
        </PageContainer>
    );
};

export { ManageTagGroups };
