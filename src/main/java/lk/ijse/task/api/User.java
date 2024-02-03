package lk.ijse.task.api;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "user", urlPatterns = "/user", loadOnStartup = 5)
public class User extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getHeader("name");
        String email = req.getHeader("email");
        String contact = req.getHeader("contact");

        System.out.println("Customer Name : "+name);
        System.out.println("Customer Email : "+email);
        System.out.println("Customer Contact : "+contact);

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        writer.println("Data Received");

    }

}
