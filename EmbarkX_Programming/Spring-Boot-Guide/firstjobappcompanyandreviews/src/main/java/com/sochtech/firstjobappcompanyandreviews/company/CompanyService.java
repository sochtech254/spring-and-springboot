package com.sochtech.firstjobappcompanyandreviews.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    void updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);
}
