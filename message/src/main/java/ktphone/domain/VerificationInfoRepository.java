package ktphone.domain;

import ktphone.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "verificationInfos",
    path = "verificationInfos"
)
public interface VerificationInfoRepository
    extends PagingAndSortingRepository<VerificationInfo, Long> {}
