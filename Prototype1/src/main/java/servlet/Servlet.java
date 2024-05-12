package servlet;

import com.prototype.Button;
import com.prototype.PrototypeRegistry;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ButtonServlet")
public class servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create a new PrototypeRegistry
        PrototypeRegistry registry = new PrototypeRegistry();

        // Create a Button prototype
        Button redButtonPrototype = new Button(10, 40, "red");

        // Add the Button prototype to the registry
        registry.addItem("LandingButton", redButtonPrototype);
        
        // Retrieve a clone of the red Button prototype from the registry
        Button clonedButton = (Button) registry.getByColor("red").clone();

        // Display the properties of the cloned Button
        String result = "Cloned Button: x=" + clonedButton.getX() + ", y=" + clonedButton.getY() + ", color=" + clonedButton.getColor();
        response.getWriter().write(result);
    }
}
