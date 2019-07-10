package com.copeika.monex.repositories;

import com.copeika.monex.exception.AlreadyExistException;
import com.copeika.monex.models.Budget;
import org.springframework.stereotype.Repository;
import com.copeika.monex.exception.NotFoundException;

@Repository
public class InMemoryBudgetRepository implements BudgetRepository {
    private Budget budgetCache = new Budget();

    public InMemoryBudgetRepository(){
    }

    @Override
    public Budget fetchBudget() {
        if (budgetCache.getCheck()) {
            throw new NotFoundException();
        }
        return budgetCache;
    }

    @Override
    public Budget createBudget(Integer cash) {
        if (!budgetCache.getCheck()) {
            throw new AlreadyExistException();
        }
        budgetCache.setCheck(false);
        budgetCache.setMoney(cash);
        Budget budget = budgetCache;
        return budget;
    }

    @Override
    public Budget updateBudget(Integer cash) {
        if (budgetCache.getCheck()) {
            throw new NotFoundException();
        }
        budgetCache.setMoney(cash);
        Budget budget = budgetCache;
        return budget;
    }

    @Override
    public void deleteBudget() {
        if (budgetCache.getCheck()) {
            throw new NotFoundException();
        }
        budgetCache.setCheck(true);
    }
}
