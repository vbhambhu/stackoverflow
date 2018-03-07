package com.example.stackoverflow.repositories;

import com.example.stackoverflow.entities.Company;
import org.springframework.data.repository.PagingAndSortingRepository;

//@RepositoryRestResource(collectionResourceRel = "company", path = "companies", excerptProjection = CompanyProjection.class)
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long> {}
