
// Define the string to reverse
def originalString = "Groovy"

// Initialize an empty string to store the reversed string
def reversedString = ""

// Loop through each character in the original string, starting from the end
for (int i = originalString.length() - 1; i >= 0; i--) {
    reversedString += originalString[i]
}

// Print the reversed string
println "Original String: $originalString"
println "Reversed String: $reversedString"
