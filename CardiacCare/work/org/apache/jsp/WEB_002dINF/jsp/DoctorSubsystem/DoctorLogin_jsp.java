/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2020-04-29 11:27:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.DoctorSubsystem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DoctorLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/DoctorSubsystem/../inc/common.jsp", Long.valueOf(1587913198119L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleClass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fstyleClass_005fproperty;

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
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleClass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fstyleClass_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleClass_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fstyleClass_005fproperty.release();
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
          out.write("\t<title>Doctor Login</title>\r\n");
          out.write("\t\r\n");
          out.write("\t <!-- Favicon  -->\r\n");
          out.write("    <link rel=\"icon\" href=\"./resource/img/core-img/favicon.ico\">\r\n");
          out.write("\t\r\n");
          out.write("\t<meta charset=\"UTF-8\">\r\n");
          out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
          out.write("<!--===============================================================================================-->\t\r\n");
          out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"./resource/images/icons/favicon.ico\"/>\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write(" \t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\r\n");
          out.write(" <!--===============================================================================================-->\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/vendor/animate/animate.css\">\r\n");
          out.write("<!--===============================================================================================-->\t\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/vendor/css-hamburgers/hamburgers.min.css\">\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/vendor/animsition/css/animsition.min.css\">\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("<!-- \t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\"> -->\r\n");
          out.write("<!--===============================================================================================-->\t\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/vendor/daterangepicker/daterangepicker.css\">\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/css/login-page-css/login-util.css\">\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./resource/css/login-page-css/login-main.css\">\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("</head>\r\n");
          out.write("<body>\r\n");
          out.write("\t\r\n");
          out.write("\t<div class=\"limiter\">\r\n");
          out.write("\t\t<div class=\"container-login100\">\r\n");
          out.write("\t\t\t<div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-50\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_html_005fform_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t</div>\r\n");
          out.write("\t\r\n");
          out.write("\r\n");
          out.write("\t\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<script src=\"./resource/vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<script src=\"./resource/vendor/animsition/js/animsition.min.js\"></script>\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<script src=\"./resource/vendor/bootstrap/js/popper.js\"></script>\r\n");
          out.write("\t<script src=\"./resource/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<script src=\"./resource/vendor/select2/select2.min.js\"></script>\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<script src=\"./resource/vendor/daterangepicker/moment.min.js\"></script>\r\n");
          out.write("\t<script src=\"./resource/vendor/daterangepicker/daterangepicker.js\"></script>\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<script src=\"./resource/vendor/countdowntime/countdowntime.js\"></script>\r\n");
          out.write("<!--===============================================================================================-->\r\n");
          out.write("\t<script src=\"./resource/js/login-page-main.js\"></script>\r\n");
          out.write("\t<script src=\"./resource/js/placeholder.js\"></script>\r\n");
          out.write("\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleClass_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    boolean _jspx_th_html_005fform_005f0_reused = false;
    try {
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(39,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/DoctorLoginPath");
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(39,4) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setStyleClass("login100-form validate-form");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<span class=\"login100-form-title p-b-33\">\r\n");
          out.write("\t\t\t\t\t\tDoctor Account Login\r\n");
          out.write("\t\t\t\t\t</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\">\r\n");
          out.write("\t\t\t\t\t\t&nbsp;<h3>Email</h3>\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t \r\n");
          out.write("\t\t\t\t\t\t<span class=\"focus-input100-1\"></span>\r\n");
          out.write("\t\t\t\t\t\t<span class=\"focus-input100-2\"></span>\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_005ferrors_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"wrap-input100 rs1 validate-input\">\r\n");
          out.write("\t\t\t\t\t\t&nbsp;<h3>Password</h3>\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_005fpassword_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t<span class=\"focus-input100-1\"></span>\r\n");
          out.write("\t\t\t\t\t\t<span class=\"focus-input100-2\"></span>\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_005ferrors_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div align=\"center\">\r\n");
          out.write("\t\t\t\t \r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_005ferrors_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t \r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div class=\"container-login100-form-btn m-t-20\">\r\n");
          out.write("\t\t\t\t\t\t<!-- <button class=\"login100-form-btn\" onclick=\"window.location.href = './NurseSubsystem/NurseHomePage.html';\">\r\n");
          out.write("\t\t\t\t\t\t\tSign in\r\n");
          out.write("\t\t\t\t\t\t</button> -->\r\n");
          out.write("\t\t\t\t\t\t ");
          if (_jspx_meth_html_005fsubmit_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"text-center p-t-45 p-b-4\">\r\n");
          out.write("\t\t\t\t\t\t<span class=\"txt1\">\r\n");
          out.write("\t\t\t\t\t\t\tForgot\r\n");
          out.write("\t\t\t\t\t\t</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<a href=\"#\" class=\"txt2 hov1\">\r\n");
          out.write("\t\t\t\t\t\t\tUsername / Password?\r\n");
          out.write("\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"text-center\">\r\n");
          out.write("\t\t\t\t\t\t<span class=\"txt1\">\r\n");
          out.write("\t\t\t\t\t\t\tCreate an account?\r\n");
          out.write("\t\t\t\t\t\t</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<a href=\"#\" class=\"txt2 hov1\">\r\n");
          out.write("\t\t\t\t\t\t\tSign up\r\n");
          out.write("\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleClass_005faction.reuse(_jspx_th_html_005fform_005f0);
      _jspx_th_html_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    boolean _jspx_th_html_005ftext_005f0_reused = false;
    try {
      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(46,6) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f0.setStyleId("Email");
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(46,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f0.setStyleClass("input100");
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(46,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f0.setProperty("frmLoginEmail");
      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      _jspx_th_html_005ftext_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ftext_005f0, _jsp_getInstanceManager(), _jspx_th_html_005ftext_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    boolean _jspx_th_html_005ferrors_005f0_reused = false;
    try {
      _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(50,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ferrors_005f0.setProperty("frmLoginEmail");
      int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
      if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      _jspx_th_html_005ferrors_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ferrors_005f0, _jsp_getInstanceManager(), _jspx_th_html_005ferrors_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_005fpassword_005f0 = (org.apache.struts.taglib.html.PasswordTag) _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    boolean _jspx_th_html_005fpassword_005f0_reused = false;
    try {
      _jspx_th_html_005fpassword_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(55,6) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f0.setStyleId("Password");
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(55,6) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f0.setStyleClass("input100");
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(55,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f0.setProperty("frmLoginPassword");
      int _jspx_eval_html_005fpassword_005f0 = _jspx_th_html_005fpassword_005f0.doStartTag();
      if (_jspx_th_html_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f0);
      _jspx_th_html_005fpassword_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fpassword_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fpassword_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ferrors_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f1 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    boolean _jspx_th_html_005ferrors_005f1_reused = false;
    try {
      _jspx_th_html_005ferrors_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(59,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ferrors_005f1.setProperty("frmLoginPassword");
      int _jspx_eval_html_005ferrors_005f1 = _jspx_th_html_005ferrors_005f1.doStartTag();
      if (_jspx_th_html_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ferrors_005f1);
      _jspx_th_html_005ferrors_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ferrors_005f1, _jsp_getInstanceManager(), _jspx_th_html_005ferrors_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ferrors_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f2 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    boolean _jspx_th_html_005ferrors_005f2_reused = false;
    try {
      _jspx_th_html_005ferrors_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(64,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ferrors_005f2.setProperty("frmInvalidUserError");
      int _jspx_eval_html_005ferrors_005f2 = _jspx_th_html_005ferrors_005f2.doStartTag();
      if (_jspx_th_html_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ferrors_005f2);
      _jspx_th_html_005ferrors_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ferrors_005f2, _jsp_getInstanceManager(), _jspx_th_html_005ferrors_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fstyleClass_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
    boolean _jspx_th_html_005fsubmit_005f0_reused = false;
    try {
      _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(71,7) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fsubmit_005f0.setStyleClass("btn login100-form-btn btn-info");
      // /WEB-INF/jsp/DoctorSubsystem/DoctorLogin.jsp(71,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fsubmit_005f0.setProperty("btnLogin");
      int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
      if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_html_005fsubmit_005f0);
        }
        do {
          out.write("Sign In");
          int evalDoAfterBody = _jspx_th_html_005fsubmit_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fstyleClass_005fproperty.reuse(_jspx_th_html_005fsubmit_005f0);
      _jspx_th_html_005fsubmit_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fsubmit_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fsubmit_005f0_reused);
    }
    return false;
  }
}
