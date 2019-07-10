package com.copeika.monex.services;

import com.copeika.monex.models.Budget;
import com.copeika.monex.repositories.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    @Autowired
    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public Budget createBudget(Integer money) {
        return budgetRepository.createBudget(money);
    }

    public void deleteBudget() {
        budgetRepository.deleteBudget();
    }

    public Budget provideBudget(){
        return budgetRepository.fetchBudget();
    }

    public Budget updateBudget(Integer money) {
        return budgetRepository.updateBudget(money);
    }
}
