package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Servlet template from tutorial on servlets and JSP that
 *  appears at http://www.apl.jhu.edu/~hall/java/Servlet-Tutorial/
 *  1999 Marty Hall; may be freely used or adapted.
 */

public class SomeServlet extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
      
    // Use "request" to read incoming HTTP headers (e.g. cookies)
    // and HTML form data (e.g. data the user entered and submitted)
    
    // Use "response" to specify the HTTP response line and headers
    // (e.g. specifying the content type, setting cookies).
    
    PrintWriter out = response.getWriter();
    out.println("Essa � a cara padr�o de um Servlet!");
    // Use "out" to send content to browser
  }
}
