package main.java.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//folosind urlPatterns, introducand in browser /hello, iti va afisa textul din metoda de doGet
@WebServlet(name ="HelloServlet", urlPatterns="/hello")
public class HelloWorldServlet extends HttpServlet{
private String name;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = new PrintWriter(response.getWriter());
        //punem html nostru intr-un string si arata si ora prin new Date()
        out.println("<html><head><title>Hello world title</title></head");
        out.println("<body> Hello world at "+new Date());
        out.println("</body></html>");
        out.close();

    }
    //putem citi ce s-a trimis din browser
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        //name din getParameter practic resprezinta numele care se refera din name.jsp
        String name = request.getParameter("name");
     /*  PrintWriter out = new PrintWriter(response.getWriter());
        //punem html nostru intr-un string si arata si ora prin new Date()
        out.println("<html><head><title>Hello world title</title></head>");
        out.println("<body> Hello "+name);
        out.println("</body></html>");
        out.close();*/
        this.name = name;
        //Stringul name e tot una cu name-ul din results.jsp
        request.setAttribute("name",name);
        //face o redirectare practic la result.jsp unde e atributul $name
        //getRequestDispatcher practic te trimite la result.jsp
        request.getRequestDispatcher("/results.jsp").forward(request,response);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
