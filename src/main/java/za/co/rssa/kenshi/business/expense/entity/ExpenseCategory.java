package za.co.rssa.kenshi.business.expense.entity;

/**
 *
 * @author rida
 */
public class ExpenseCategory {
    
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ExpenseCategory{" + "category=" + category + '}';
    }
    
}
