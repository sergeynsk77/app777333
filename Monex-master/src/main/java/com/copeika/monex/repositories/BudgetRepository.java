package com.copeika.monex.repositories;

import com .copeika.monex.models.Budget;

public interface BudgetRepository {

    Budget fetchBudget();

    Budget createBudget(Integer cash);

    Budget updateBudget(Integer cash);

    void deleteBudget();


}
