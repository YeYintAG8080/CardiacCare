/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2020-05-01 09:37:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.NurseSubsystem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TreatementNotProvidedErrorPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/NurseSubsystem/../inc/common.jsp", Long.valueOf(1587913198119L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_html_005fhtml_005f0(_jspx_page_context))
        return;
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005fhtml_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
    boolean _jspx_th_html_005fhtml_005f0_reused = false;
    try {
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<head>\r\n");
          out.write("<title>Nurse Home</title>\r\n");
          out.write("<meta charset=\"utf-8\">\r\n");
          out.write("<meta name=\"viewport\"\r\n");
          out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
          out.write("\r\n");
          out.write("<link rel=\"stylesheet\"\r\n");
          out.write("\thref=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
          out.write("\r\n");
          out.write("<link rel=\"stylesheet\"\r\n");
          out.write("\thref=\"./resource/css/bootstrap-css/bootstrap.min.css\">\r\n");
          out.write("<link rel=\"stylesheet\"\r\n");
          out.write("\thref=\"./resource/css/panel-css/style.css\">\r\n");
          out.write("\r\n");
          out.write("<link rel=\"stylesheet\"\r\n");
          out.write("\thref=\"./resource/css/panel-css/panel.css\">\r\n");
          out.write("<link rel=\"stylesheet\"\r\n");
          out.write("\thref=\"./resource/css/nurse-css/nurse-style.css\">\r\n");
          out.write("</head>\r\n");
          out.write("<body onload=\"showDate()\">\r\n");
          out.write("\t<div class=\"wrapper d-flex align-items-stretch\">\r\n");
          out.write("\r\n");
          out.write("\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/nursesidebar.jsp", out, false);
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t<!-- Page Content  -->\r\n");
          out.write("\t\t<div id=\"content\" class=\"p-4 p-md-5\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/navbar.jsp", out, false);
          out.write("\r\n");
          out.write("\t\t\t<!--content nav bar -->\r\n");
          out.write("\r\n");
          out.write("\t\t\t<!-- CUSTOMIZE START HERE -->\r\n");
          out.write("\r\n");
          out.write("\t\t\t<div class=\"container\">\r\n");
          out.write("\t\t\t\t \r\n");
          out.write("\t\t\t\t \t\t\r\n");
          out.write("\t\t\t\t\t<div class=\"alert alert-primary alert-dismissible fade show\">\r\n");
          out.write("\t\t\t\t\t\t\t<strong>Treatment is not provided.</strong>\r\n");
          out.write("\t\t\t\t\t\t\t<!-- <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button> -->\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t \r\n");
          out.write("\t\t\t\t \r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<!-- CUSTOMIZE END HERE -->\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\r\n");
          out.write("\r\n");
          out.write("\t<script\r\n");
          out.write("\t\tsrc=\"./resource/js/bootstrap-js/jquery/jquery-3.4.1.min.js\"></script>\r\n");
          out.write("\t<script\r\n");
          out.write("\t\tsrc=\"./resource/js/bootstrap-js/jquery/popper.min.js\"></script>\r\n");
          out.write("\t<script\r\n");
          out.write("\t\tsrc=\"./resource/js/bootstrap-js/bootstrap.min.js\"></script>\r\n");
          out.write("\t<script src=\"./resource/js/panel-js/main.js\"></script>\r\n");
          out.write("\t<!-- other additional function for health care project (start)-->\r\n");
          out.write("\t<script src=\"./resource/js/panel-js/other-function.js\"></script>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t<!-- other additional function for health care project (end)-->\r\n");
          out.write("</body>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      _jspx_th_html_005fhtml_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fhtml_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fhtml_005f0_reused);
    }
    return false;
  }
}
