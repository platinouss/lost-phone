package ktphone.domain;

import java.util.Date;
import java.util.List;
import ktphone.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "usims", path = "usims")
public interface UsimRepository
    extends PagingAndSortingRepository<Usim, Long> {}
