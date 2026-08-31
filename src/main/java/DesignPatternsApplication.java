import behavioral.chain.ChainDemo;
import behavioral.command.CommandDemo;
import behavioral.interpreter.InterpreterDemo;
import behavioral.iterator.IteratorDemo;
import behavioral.mediator.MediatorDemo;
import behavioral.memento.MementoDemo;
import behavioral.observer.ObserverDemo;
import behavioral.state.StateDemo;
import behavioral.strategy.StrategyDemo;
import behavioral.template.TemplateDemo;
import behavioral.visitor.VisitorDemo;
import creational.abstractfactory.AbstractFactoryDemo;
import creational.builder.BuilderDemo;
import creational.factory.FactoryDemo;
import creational.prototype.PrototypeDemo;
import creational.singleton.SingletonDemo;
import structural.adapter.AdapterDemo;
import structural.bridge.BridgeDemo;
import structural.composite.CompositeDemo;
import structural.decorator.DecoratorDemo;
import structural.facade.FacadeDemo;
import structural.flyweight.FlyweightDemo;
import structural.proxy.ProxyDemo;

public class DesignPatternsApplication {

    public static void main(String[] args) {

        printHeader();

        runCreationalPatterns(args);
        runStructuralPatterns(args);
        runBehavioralPatterns(args);

        printFooter();
    }

    private static void runCreationalPatterns(String[] args) {

        printSection("CREATIONAL DESIGN PATTERNS");

        run(
                "Singleton",
                () -> SingletonDemo.main(args)
        );

        run(
                "Factory",
                () -> FactoryDemo.main(args)
        );

        run(
                "Abstract Factory",
                () -> AbstractFactoryDemo.main(args)
        );

        run(
                "Builder",
                () -> BuilderDemo.main(args)
        );

        run(
                "Prototype",
                () -> PrototypeDemo.main(args)
        );
    }

    private static void runStructuralPatterns(String[] args) {

        printSection("STRUCTURAL DESIGN PATTERNS");

        run(
                "Adapter",
                () -> AdapterDemo.main(args)
        );

        run(
                "Bridge",
                () -> BridgeDemo.main(args)
        );

        run(
                "Composite",
                () -> CompositeDemo.main(args)
        );

        run(
                "Decorator",
                () -> DecoratorDemo.main(args)
        );

        run(
                "Facade",
                () -> FacadeDemo.main(args)
        );

        run(
                "Flyweight",
                () -> FlyweightDemo.main(args)
        );

        run(
                "Proxy",
                () -> ProxyDemo.main(args)
        );
    }

    private static void runBehavioralPatterns(String[] args) {

        printSection("BEHAVIORAL DESIGN PATTERNS");

        run(
                "Chain of Responsibility",
                () -> ChainDemo.main(args)
        );

        run(
                "Command",
                () -> CommandDemo.main(args)
        );

        run(
                "Interpreter",
                () -> InterpreterDemo.main(args)
        );

        run(
                "Iterator",
                () -> IteratorDemo.main(args)
        );

        run(
                "Mediator",
                () -> MediatorDemo.main(args)
        );

        run(
                "Memento",
                () -> MementoDemo.main(args)
        );

        run(
                "Observer",
                () -> ObserverDemo.main(args)
        );

        run(
                "State",
                () -> StateDemo.main(args)
        );

        run(
                "Strategy",
                () -> StrategyDemo.main(args)
        );

        run(
                "Template Method",
                () -> TemplateDemo.main(args)
        );

        run(
                "Visitor",
                () -> VisitorDemo.main(args)
        );
    }

    private static void run(
            String patternName,
            Runnable demo) {

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Pattern: " + patternName);
        System.out.println("----------------------------------------");

        try {

            demo.run();

            System.out.println(
                    "Status: SUCCESS"
            );

        } catch (Exception exception) {

            System.err.println(
                    "Status: FAILED"
            );

            System.err.println(
                    "Error: " + exception.getMessage()
            );
        }
    }

    private static void printHeader() {

        System.out.println();
        System.out.println(
                "============================================"
        );

        System.out.println(
                "        JAVA DESIGN PATTERNS DEMO"
        );

        System.out.println(
                "============================================"
        );

        System.out.println(
                "Gang of Four Design Patterns"
        );

        System.out.println(
                "Java | OOP | SOLID | Clean Code"
        );

        System.out.println(
                "============================================"
        );
    }

    private static void printSection(String title) {

        System.out.println();
        System.out.println();
        System.out.println(
                "============================================"
        );

        System.out.println(
                "  " + title
        );

        System.out.println(
                "============================================"
        );
    }

    private static void printFooter() {

        System.out.println();
        System.out.println();
        System.out.println(
                "============================================"
        );

        System.out.println(
                "       ALL PATTERN DEMOS COMPLETED"
        );

        System.out.println(
                "============================================"
        );

        System.out.println(
                "Total Patterns: 23"
        );

        System.out.println(
                "Creational : 5"
        );

        System.out.println(
                "Structural : 7"
        );

        System.out.println(
                "Behavioral : 11"
        );

        System.out.println(
                "============================================"
        );
    }
}
