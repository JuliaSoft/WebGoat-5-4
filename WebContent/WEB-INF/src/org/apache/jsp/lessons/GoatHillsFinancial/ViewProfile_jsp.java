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
import org.owasp.webgoat.session.*;
import org.owasp.webgoat.lessons.GoatHillsFinancial.GoatHillsFinancial;

public final class ViewProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	Employee employee = (Employee) session.getAttribute("GoatHillsFinancial." + GoatHillsFinancial.EMPLOYEE_ATTRIBUTE_KEY);
	WebSession webSession = ((WebSession)session.getAttribute("websession"));
//	int myUserId = getIntSessionAttribute(webSession, "GoatHillsFinancial." + GoatHillsFinancial.USER_ID);

      out.write("\r\n\t\t<div class=\"lesson_title_box\"><strong>Welcome Back </strong><span class=\"lesson_text_db\">");
      out.print(webSession.getUserNameInLesson());
      out.write("</span> - View Profile Page</div>\r\n\t\t<div class=\"lesson_text\">\r\n\t\t\t\t<Table>\r\n\t\t\t\t<TR><TD>\r\n\t\t\t\t\t\tFirst Name:\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getFirstName());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\t\t\t\t\r\n\t\t\t\t\t\tLast Name:\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t \t<span class=\"lesson_text_db\">");
      out.print(employee.getLastName());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t</TR>\r\n\t\t\t\t<TR><TD>\t\t\t\t\r\n\t\t\t\t\t\tStreet: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getAddress1());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\t\t\t\t\r\n\t\t\t\t\t\tCity/State: \r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getAddress2());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t</TR>\r\n\t\t\t\t<TR><TD>\r\n\t\t\t\t\t\tPhone: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getPhoneNumber());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\t\t\t\t\r\n\t\t\t\t\t\tStart Date: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getStartDate());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t</TR>\r\n\t\t\t\t<TR><TD>\r\n\t\t\t    \t\tSSN: \r\n\t\t\t    \t</TD>\r\n\t\t\t    \t<TD>\r\n\t\t\t    \t\t<span class=\"lesson_text_db\">");
      out.print(employee.getSsn());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\t\t\t\t\r\n\t\t\t\t\t\tSalary: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getSalary());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t</TR>\r\n\t\t\t\t<TR><TD>\r\n\t\t\t\t\t\tCredit Card: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getCcn());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\t\t\t\t\r\n\t\t\t\t\t\tCredit Card Limit: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getCcnLimit());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t</TR>\r\n\t\t\t\t<TR><TD>\r\n\t\t\t\t\t\tComments: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD colspan=\"3\">\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getPersonalDescription());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t</TR>\t\t\t\t\r\n\t\t\t\t<TR>\r\n\t\t\t\t\t<TD colspan=\"2\">\t\r\n\t\t\t\t\t\tDisciplinary Explanation: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\t\t\t\t\r\n\t\t\t\t\t\tDisc. Dates: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getDisciplinaryActionDate());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t<TR>\r\n\t\t\t\t\t<TD colspan=\"4\">\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getDisciplinaryActionNotes());
      out.write("</span>\r\n\t\t\t\t\t</TD>\r\n\t\t\t\t</TR>\r\n\t\t\t\t<TR>\r\n\t\t\t\t<TD>\t\t\t\t\r\n\t\t\t\t\t\tManager: \r\n\t\t\t\t\t</TD>\r\n\t\t\t\t\t<TD>\r\n\t\t\t\t\t\t<span class=\"lesson_text_db\">");
      out.print(employee.getManager());
      out.write("</span>\r\n\t\t\t\t\t</TD>\t\r\n\t\t\t\t</TR>\r\n\t\t\t\t</Table>\r\n\t\t</div>\r\n\t\t<div class=\"lesson_buttons_bottom\">\r\n\t\t    <table width=\"460\" height=\"20\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                 <tr>\r\n                 \t<td width=\"50\">\r\n\t\t\t\t\t ");
					
					 if (webSession.isAuthorizedInLesson(webSession.getUserIdInLesson(), GoatHillsFinancial.LISTSTAFF_ACTION))
					 {
					 
      out.write("\r\n\t\t\t\t\t\t<form method=\"POST\" action=\"");
      out.print(webSession.getCurrentLesson().getFormAction());
      out.write("\">\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(GoatHillsFinancial.EMPLOYEE_ID);
      out.write("\" value=\"");
      out.print(employee.getId());
      out.write("\">\r\n\t\t\t\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.LISTSTAFF_ACTION);
      out.write("\"/>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t ");

					 }
      out.write("\r\n\t\t\t\t\t </td>\r\n\t\t             <td width=\"50\">\r\n\t\t\t\t\t ");
					
					 if (webSession.isAuthorizedInLesson(webSession.getUserIdInLesson(), GoatHillsFinancial.EDITPROFILE_ACTION))
					 {
					 
      out.write("\r\n\t\t\t\t\t\t<form method=\"POST\" action=\"");
      out.print(webSession.getCurrentLesson().getFormAction());
      out.write("\">\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(GoatHillsFinancial.EMPLOYEE_ID);
      out.write("\" value=\"");
      out.print(employee.getId());
      out.write("\">\r\n\t\t\t\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.EDITPROFILE_ACTION);
      out.write("\"/>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t");

					}
					
      out.write("\r\n\t\t\t\t\t</td>\t\t\t\t\t\r\n                    <td width=\"60\">\r\n\t\t\t\t\t");
					
					if (webSession.isAuthorizedInLesson(webSession.getUserIdInLesson(), GoatHillsFinancial.DELETEPROFILE_ACTION))
					{
					
      out.write("\r\n\t\t\t\t\t\t<form method=\"POST\" action=\"");
      out.print(webSession.getCurrentLesson().getFormAction());
      out.write("\">\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(GoatHillsFinancial.EMPLOYEE_ID);
      out.write("\" value=\"");
      out.print(employee.getId());
      out.write("\">\r\n\t\t\t\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.DELETEPROFILE_ACTION);
      out.write("\"/>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t");

					}
					
      out.write("\r\n\t\t\t\t\t</td>\r\n                      <td width=\"190\">&nbsp;</td>\r\n                      <td width=\"76\">\r\n\t\t\t\t\t\t<form method=\"POST\">\r\n\t\t\t\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(GoatHillsFinancial.LOGOUT_ACTION);
      out.write("\"/>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n         \t</table>\r\n\t\t</div>");
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
