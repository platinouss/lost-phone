package ktphone.domain;

import ktphone.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "usimBlockHistories",
    path = "usimBlockHistories"
)
public interface UsimBlockHistoryRepository
    extends PagingAndSortingRepository<UsimBlockHistory, Long> {}
