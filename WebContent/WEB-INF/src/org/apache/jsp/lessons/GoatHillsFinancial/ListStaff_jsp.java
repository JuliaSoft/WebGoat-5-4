/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspCServletContext/1.0
 * Generated at: 2015-07-24 08:46:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.lessons.GoatHillsFinancial;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.owasp.webgoat.session.*;
import org.owasp.webgoat.lessons.GoatHillsFinancial.GoatHillsFinancial;

public final class ListStaff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	WebSession webSession = ((WebSession)session.getAttribute("websession"));
	int myUserId = webSession.getUserIdInLesson();

      out.write("\r\n\t<div class=\"lesson_title_box\"><strong>Welcome Back </strong><span class=\"lesson_text_db\">");
      out.print(webSession.getUserNameInLesson());
      out.write("</span> - Staff Listing Page</div>\r\n\t\t<br>\r\n\t\t<br>\r\n\t\t<br>\r\n\t\t<p>Select from the list below\t</p>\r\n\r\n\t\t<form id=\"form1\" name=\"form1\" method=\"post\" action=\"");
      out.print(webSession.getCurrentLesson().getFormAction());
      out.write("\">\r\n  <table width=\"60%\" border=\"0\" cellpadding=\"3\">\r\n    <tr>\r\n      <td>  <label>\r\n  <select name=\"");
      out.print(GoatHillsFinancial.EMPLOYEE_ID);
      out.write("\" size=\"11\">\r\n\t\t\t      \t");

			      	List employees = (List) session.getAttribute("GoatHillsFinancial." + GoatHillsFinancial.STAFF_ATTRIBUTE_KEY);
			      	Iterator i = employees.iterator();
			      	EmployeeStub stub = (EmployeeStub) i.next();
      out.write("\r\n\t\t\t      \t<option selected value=\"");
      out.print(Integer.toString(stub.getId()));
      out.write('"');
      out.write('>');
      out.print(stub.getFirstName() + " " + stub.getLastName()+ " (" + stub.getRole() + ")");
      out.write("</option>");

					while (i.hasNext())
					{
						stub = (EmployeeStub) i.next();
      out.write("\r\n\t\t\t\t\t\t<option value=\"");
      out.print(Integer.toString(stub.getId()));
      out.write('"');
      out.write('>');
      out.print(stub.getFirstName() + " " + stub.getLastName()+ " (" + stub.getRole() + ")");
      out.write("</option>");

					}
      out.write("\r\n  </select>\r\n  </label></td>\r\n      <td>\r\n\t        \t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.SEARCHSTAFF_ACTION);
      out.write("\"/><br>\r\n\t        \t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.VIEWPROFILE_ACTION);
      out.write("\"/><br>\r\n            \t\t");
 
				if (webSession.isAuthorizedInLesson(myUserId, GoatHillsFinancial.CREATEPROFILE_ACTION))
				{
				
      out.write("\r\n\t\t\t\t\t<input type=\"submit\" name=\"action\" disabled value=\"");
      out.print(GoatHillsFinancial.CREATEPROFILE_ACTION);
      out.write("\"/><br>\r\n\t\t\t\t");
 
				}
				
      out.write("\r\n            \t\t");
 
				if (webSession.isAuthorizedInLesson(myUserId, GoatHillsFinancial.DELETEPROFILE_ACTION))
				{
				
      out.write("\r\n\t\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.DELETEPROFILE_ACTION);
      out.write("\"/><br>\r\n\t\t\t\t");
 
				}
				
      out.write("\r\n\t\t\t<br>\r\n\t\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.LOGOUT_ACTION);
      out.write("\"/>\r\n\t  </td>\r\n    </tr>\r\n  </table>\r\n\r\n\t\t</form>\r\n\t\t");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
