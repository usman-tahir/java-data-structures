
/**
 * An interface to construct a library of testing and debugging procedures.
 * <p>
 * This interface of methods provides basic assertion testing facilities,
 * to be implemented by an Assertion class. An assertion is a condition
 * that is expected to be true at a certain point in the code. Each of the
 * assertion-based routines in this interface should perform a verification
 * of a condition, and do nothing (aside from testing side-effects) if the
 * condition holds. If the condition fails, however, the assertion should
 * throw an exception and prints the associated message that describes the
 * condition that failed. Basic support should be provided for testing
 * general conditions, preconditions, and postconditions. There should also
 * be a facility for throwing a failed condition for code that should not be
 * executed.
 * <p>
 * @author usman.tahir
 */
public interface Assert {
    public void pre(boolean test, String message);
    public void post(boolean test, String message);
    public void condition(boolean test, String message);
    public void invariant(boolean test, String message);
    public void fail(String message);
}