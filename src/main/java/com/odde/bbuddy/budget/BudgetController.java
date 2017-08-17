package com.odde.bbuddy.budget;

import com.odde.bbuddy.budget.domain.Budget;
import com.odde.bbuddy.budget.domain.Budgets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BudgetController {

    private final Budgets budgets;

    @Autowired
    public BudgetController(Budgets budgets) {
        this.budgets = budgets;
    }

    @GetMapping("/budgets/add")
    public String addBudget() {
        return "/budgets/add";
    }

    @PostMapping("/budgets/add")
    public String submitAddBudget(Budget budget) {
        budgets.add(budget);
        return "/budgets/add";
    }

    @GetMapping("/budgets/list")
    public String listBudgets() {
        return "/budgets/list";
    }
}
