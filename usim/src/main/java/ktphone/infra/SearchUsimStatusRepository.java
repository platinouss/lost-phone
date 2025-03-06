package ktphone.infra;

import java.util.List;
import ktphone.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "searchUsimStatuses",
    path = "searchUsimStatuses"
)
public interface SearchUsimStatusRepository
    extends PagingAndSortingRepository<SearchUsimStatus, Long> {}
