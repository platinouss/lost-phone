package ktphone.infra;

import java.util.List;
import ktphone.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "searchReports",
    path = "searchReports"
)
public interface SearchReportRepository
    extends PagingAndSortingRepository<SearchReport, Long> {
    List<SearchReport> findByStatus(String status);
}
