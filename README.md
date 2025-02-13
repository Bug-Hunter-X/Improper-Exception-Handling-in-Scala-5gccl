# Improper Exception Handling in Scala

This repository demonstrates a common error in Scala: improper exception handling. The provided `MyClass` attempts to handle a negative value assignment, but the handling might not be comprehensive enough in all scenarios.

The `bug.scala` file shows the original code with the flawed exception handling.  The `bugSolution.scala` file offers a refined approach.  The core issue is the potential for uncaught exceptions if the `value_=` method is called from various parts of the application, some of which may not include explicit exception handling blocks.