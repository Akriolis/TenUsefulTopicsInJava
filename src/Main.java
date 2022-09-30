public class Main {

    /**
     * JShell (Java REPL)
     * REPL - Read Eval Print Loop
     * type jshell in terminal
     * no need for a class, main method, semicolon on the end of the line
     * /vars to see all variables you have declared
     * /exit
     * /help
     */

    /**
     * Packages
     * Reverse domain package names:
     * com.headfirstjava.projects.Chart
     */

    /**
     * Immutability in Strings and Wrappers
     */

    /**
     * Access levels and access modifiers
     * Access levels:
     * public - any code anywhere can access the public thing;
     * protected - same as default, but it also allows subclasses outside the package to inherit the protected thing;
     * default - means that only code within the same package as the class with the default thing can access the default thing;
     * private - means that only code within the same class can access the private thing;
     * Access modifiers:
     * public
     * protected
     * private
     *
     */

    /**
     * Varargs
     */

    /**
     * Annotations
     */

    /**
     * Lambdas and maps
     */

    /**
     * Parallel streams
     * parallelStream();
     * or add parallel() in a stream pipeline
     */

    /**
     * Enumerations (enums)
     */

    public enum Member {KEVIN, BOB, STUART};

    /**
     * Local variable type inference (var)
     */

    /**
     * Records
     *
     * records are immutable
     */

    public record Customer (int id, String name){}

    public record Customer2 (int id, String name){
        public Customer2 (int id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Member band = Member.BOB;

        Customer customer = new Customer(7,"me");
        System.out.println(customer);
        System.out.println(customer.name);




    }






}
