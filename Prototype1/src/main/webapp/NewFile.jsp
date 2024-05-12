<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Prototype Demo</title>
</head>
<body>
    <h1>Prototype Demo</h1>
    <% 
        // Create a new PrototypeRegistry
        def registry = new prototypeDemo.PrototypeRegistry()

        // Create a Button prototype
        def redButtonPrototype = new prototypeDemo.Button(10, 40, "red")

        // Add the Button prototype to the registry
        registry.addItem("LandingButton", redButtonPrototype)

        // Retrieve a clone of the red Button prototype from the registry
        def clonedButton = registry.getByColor("red")

        // Display the properties of the cloned Button
        if (clonedButton != null) {
            out.println("Cloned Button: x=" + clonedButton.getX() + ", y=" + clonedButton.getY() + ", color=" + clonedButton.getColor())
        } else {
            out.println("No Button prototype with color 'red' was found in the registry.")
        }
    %>
</body>
</html>
