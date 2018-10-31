/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {
    /**
     * employee name.
     */
    private String name;
    /**
     * manager name.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param n name of person
     * @param m name of manager
     */
    public Employee(final String n, final String m) {
        this.name = n;
        this.manager = m;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param n name of employee
     */
    public void setName(final String n) {
        this.name = n;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param m name of manager
     */
    public void setManager(final String m) {
        this.manager = m;
    }
}
