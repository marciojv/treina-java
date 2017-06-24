package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

/** Simple servlet that reads three parameters from the form data.
 *  Part of tutorial on servlets and JSP that appears at
 *  http://www.apl.jhu.edu/~hall/java/Servlet-Tutorial/
 *  1999 Marty Hall; may be freely used or adapted.
 */

public class ThreeParams extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Reading Three Request Parameters";
    out.println(ServletUtilities.headWithTitle(title) +
                "<BODY>\n" +
                "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
                "<UL>\n" +
                "  <LI>param1: "
                + request.getParameter("param1") + "\n" +
                "  <LI>param2: "
                + request.getParameter("param2") + "\n" +
                "  <LI>param3: "
                + request.getParameter("param3") + "\n" +
                "</UL>\n" +
                "</BODY></HTML>");
  }

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
