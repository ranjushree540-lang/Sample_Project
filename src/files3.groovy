// This script intentionally has issues to trigger SonarQube errors.

// Example of unused variable (code smell)
def unusedVariable = 100

// Example of unnecessary return (code smell)
def addNumbers(a, b) {
    return a + b
}

// Example of method with too many parameters (code smell)
def badMethod(a, b, c, d, e, f) {
    return a + b + c + d + e + f
}

// Example of nested loops with high complexity (code smell)
def complexMethod() {
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            println i * j
        }
    }
}

// Example of empty catch block (code smell)
try {
    def x = 10 / 0
} catch (Exception e) {
    // Empty catch block (this will be flagged as a code smell)
}

// Example of using a deprecated API (security vulnerability / code smell)
@Deprecated
def deprecatedMethod() {
    println "This is a deprecated method."
}
