package ktphone.domain;

import ktphone.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "usims", path = "usims")
public interface UsimRepository
    extends PagingAndSortingRepository<Usim, Long> {}
