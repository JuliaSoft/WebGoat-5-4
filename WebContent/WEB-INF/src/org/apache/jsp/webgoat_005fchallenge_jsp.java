/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspCServletContext/1.0
 * Generated at: 2015-07-24 08:46:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.webgoat.session.WebSession;

public final class webgoat_005fchallenge_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n\r\n");

WebSession webSession = ((WebSession) session.getAttribute("websession"));

      out.write("\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\r\n<title>WebGoat V5.4</title>\r\n<link rel=\"stylesheet\" href=\"css/webgoat.css\" type=\"text/css\" />\r\n<link rel=\"stylesheet\" href=\"css/webgoat_challenge.css\" type=\"text/css\" />\r\n</head>\r\n\r\n<body>\r\n\r\n<div id=\"wrap_ch\">\r\n<div id=\"top_ch\"></div>\r\n<div id=\"start_ch\">\r\n<p>Thank you for using WebGoat! This program is a demonstration of common web application flaws.\r\nThe exercises are intended to provide hands on experience with\r\napplication penetration testing techniques. </p>\r\n<p>The WebGoat project is led\r\nby Bruce Mayhew. Please send all comments to Bruce at ");
      out.print(webSession.getWebgoatContext().getFeedbackAddress());
      out.write(".</p>\r\n\r\n<div id=\"team_ch\">\r\n<table border=\"0\" align=\"center\" class=\"lessonText\">\r\n\t<tr>\r\n\t\t<td width=\"50%\">\r\n\t\t<div align=\"center\"><a href=\"http://www.owasp.org\"><img\r\n\t\t\tborder=\"0\" src=\"images/logos/owasp.jpg\" alt=\"OWASP Foundation\"\r\n\t\t\tlongdesc=\"http://www.owasp.org\" /></a></div>\r\n\t\t</td>\r\n\t\t<td width=\"50%\">\r\n\t\t<div align=\"center\"><a href=\"http://www.aspectsecurity.com\"><img\r\n\t\t\tborder=\"0\" src=\"images/logos/aspect.jpg\" alt=\"Aspect Security\"\r\n\t\t\tlongdesc=\"http://www.aspectsecurity.com\" /></a></div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td colspan=\"2\">\r\n\t\t<div align=\"center\"><span class=\"style1\">\r\n\t\tWebGoat Authors </span></div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td colspan=\"2\">\r\n\t\t<div align=\"center\"><span class=\"style2\">\r\n\t\tBruce Mayhew </span></div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td colspan=\"2\">\r\n\t\t<div align=\"center\"><span class=\"style2\">\r\n\t\tJeff Williams </span></div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td width=\"50%\">\r\n\t\t<div align=\"center\"><span class=\"style1\"><br />\r\n\t\tWebGoat Design Team </span></div>\r\n\t\t</td>\r\n\t\t<td width=\"50%\">\r\n");
      out.write("\t\t<div align=\"center\"><span class=\"style1\"><br />\r\n\t\tV5.4 Lesson Contributers </span></div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td valign=\"top\">\r\n\t\t<div align=\"center\" class=\"style2\">David Anderson</div>\r\n\t\t<div align=\"center\" class=\"style2\">Laurence Casey (Graphics)</div>\r\n\t\t<div align=\"center\" class=\"style2\">Rogan Dawes</div>\r\n\t\t<div align=\"center\" class=\"style2\">Bruce Mayhew</div>\r\n\t\t</td>\r\n\t\t<td valign=\"top\">\r\n\t\t<div align=\"center\" class=\"style2\">Sherif Koussa</div>\r\n\t\t<div align=\"center\" class=\"style2\">Yiannis Pavlosoglou</div>\r\n\t\t<div align=\"center\" class=\"style2\"></div>\r\n\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"25\" valign=\"bottom\">\r\n\t\t<div align=\"center\"><span class=\"style1\">Special Thanks\r\n\t\tfor V5.4</span></div>\r\n\t\t</td>\r\n\t\t<td height=\"25\" valign=\"bottom\">\r\n\t\t<div align=\"center\"><span class=\"style1\">Documentation\r\n\t\tContributers</span></div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t<div align=\"center\" class=\"style2\">Brian Ciomei (Multitude of bug fixes)</div>\r\n\t\t<div align=\"center\" class=\"style2\">To all who have sent comments</div>\r\n");
      out.write("\t\t\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t<div align=\"center\" class=\"style2\">\r\n\t\t<a href=\"http://www.zionsecurity.com/\" target=\"_blank\">Erwin Geirnaert</a></div>\r\n\t\t<div align=\"center\" class=\"style2\">\r\n\t\t<a href=\"http://yehg.org/\" target=\"_blank\">Aung Khant</a></div>\r\n\t\t<div align=\"center\" class=\"style2\">\r\n\t\t\t<a href=\"http://www.softwaresecured.com\" target=\"blank\">Sherif Koussa</a>\r\n\t\t</div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td colspan=\"2\">\r\n\t\t<div align=\"center\" class=\"style2\">\r\n\t\t<form id=\"form\" name=\"form\" method=\"post\" action=\"attack\"><input\r\n\t\t\ttype=\"submit\" name=\"start\" value=\"Start WebGoat\" /></form>\r\n\t\t</div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t<div align=\"center\" class=\"style2\">&nbsp;</div>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</div>\r\n</div>\r\n<div align=\"center\" class=\"style2\">&nbsp;</div>\r\n<div align=\"center\" class=\"style2\">&nbsp;</div>\r\n<div align=\"center\" class=\"style2\">&nbsp;</div>\r\n<div id=\"warning_ch\">WARNING<br />\r\nWhile running this program, your machine is extremely vulnerable to\r\nattack if you are not running on localhost. If you are NOT running on localhost (default configuration), You should disconnect from the network while using this program.\r\n");
      out.write("<br />\r\n<br />\r\nThis program is for educational purposes only. Use of these techniques\r\nwithout permission could lead to job termination, financial liability,\r\nand/or criminal penalties.</div>\r\n</div>\r\n</body>\r\n</html>\r\n");
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
