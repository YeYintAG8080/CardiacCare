/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2020-05-01 11:48:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.DoctorSubsystem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MedicalRecordListPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/DoctorSubsystem/../inc/common.jsp", Long.valueOf(1587913198119L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody;

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
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.release();
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
            out.write("<title>Medical Record List</title>\r\n");
            out.write("<meta charset=\"utf-8\">\r\n");
            out.write("<meta name=\"viewport\"\r\n");
            out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("<link rel=\"stylesheet\"\r\n");
            out.write("\thref=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
            out.write("\r\n");
            out.write("<link rel=\"stylesheet\"\r\n");
            out.write("\thref=\"./resource/css/bootstrap-css/bootstrap.min.css\">\r\n");
            out.write("<link rel=\"stylesheet\" href=\"./resource/css/panel-css/style.css\">\r\n");
            out.write("<link rel=\"stylesheet\" href=\"./resource/css/panel-css/panel.css\">\r\n");
            out.write("<link rel=\"stylesheet\" href=\"./resource/css/doctor-css/doctor-style.css\">\r\n");
            out.write("\r\n");
            out.write("<style>\r\n");
            out.write(".record-block {\r\n");
            out.write("\tbackground-color: #17a2b8;\r\n");
            out.write("\topacity: 0.9;\r\n");
            out.write("\tmin-height: 93px;\r\n");
            out.write("\tmax-height: 93px;\r\n");
            out.write("\tmin-width: 93px;\r\n");
            out.write("\tmax-width: 98px;\r\n");
            out.write("\tmargin-left: 1px;\r\n");
            out.write("\tmargin-right: 1px;\r\n");
            out.write("\tmargin-top: 1px;\r\n");
            out.write("\tpadding-top: 35px;\r\n");
            out.write("\ttext-align: center;\r\n");
            out.write("}\r\n");
            out.write("</style>\r\n");
            out.write("\r\n");
            out.write("</head>\r\n");
            out.write("<body onload=\"showDate()\">\r\n");
            out.write("\r\n");
            out.write("\t<div class=\"wrapper d-flex align-items-stretch\">\r\n");
            out.write("\r\n");
            out.write("\t\t");
            org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/doctorsidebar.jsp", out, false);
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t<!-- Page Content  -->\r\n");
            out.write("\t\t<div id=\"content\" class=\"p-4 p-md-5\">\r\n");
            out.write("\t\t\t");
            org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/navbar.jsp", out, false);
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t\t<!-- CUSTOMIZE START HERE -->\r\n");
            out.write("\r\n");
            out.write("\t\t\t<div class=\"container\">\r\n");
            out.write("\t\t\t");
            if (_jspx_meth_logic_005fempty_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t<div class=\"row\">\r\n");
            out.write("\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t\t<!-- if record is not empty -->\r\n");
            out.write("\t\t\t\t\t");
            //  logic:notEmpty
            org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
            boolean _jspx_th_logic_005fnotEmpty_005f0_reused = false;
            try {
              _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
              // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(60,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f0.setProperty("frmDailyRecordList");
              // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(60,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fnotEmpty_005f0.setName("DoctorFormBean");
              int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
              if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t");
                  //  logic:iterate
                  org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                  boolean _jspx_th_logic_005fiterate_005f0_reused = false;
                  try {
                    _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                    _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
                    // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(61,6) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_logic_005fiterate_005f0.setId("dailyRecord");
                    // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(61,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_logic_005fiterate_005f0.setName("DoctorFormBean");
                    // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(61,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_logic_005fiterate_005f0.setProperty("frmDailyRecordList");
                    int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                    if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      java.lang.Object dailyRecord = null;
                      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_logic_005fiterate_005f0);
                      }
                      dailyRecord = (java.lang.Object) _jspx_page_context.findAttribute("dailyRecord");
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t<a\r\n");
                        out.write("\t\t\t\t\t\t\t\thref=\"DoctorMedicalRecordDetailLoadLink.do?frmLinkControl=1&frmDailyRecordId=");
                        if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                          return;
                        out.write("\">\r\n");
                        out.write("\t\t\t\t\t\t\t\t<div class=\"record-block\">\r\n");
                        out.write("\t\t\t\t\t\t\t\t\t");
                        if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                          return;
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
                        out.write("\t\t\t\t\t\t\t</a>\r\n");
                        out.write("\t\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                        dailyRecord = (java.lang.Object) _jspx_page_context.findAttribute("dailyRecord");
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                        out = _jspx_page_context.popBody();
                      }
                    }
                    if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                    _jspx_th_logic_005fiterate_005f0_reused = true;
                  } finally {
                    org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_logic_005fiterate_005f0, _jsp_getInstanceManager(), _jspx_th_logic_005fiterate_005f0_reused);
                  }
                  out.write("\r\n");
                  out.write("\r\n");
                  out.write("\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
              _jspx_th_logic_005fnotEmpty_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_logic_005fnotEmpty_005f0, _jsp_getInstanceManager(), _jspx_th_logic_005fnotEmpty_005f0_reused);
            }
            out.write("\r\n");
            out.write("\t\t\t\t\t\r\n");
            out.write("\t\t\t\t</div>\r\n");
            out.write("\t\t\t</div>\r\n");
            out.write("\t\t\t<!-- CUSTOMIZE END HERE -->\r\n");
            out.write("\t\t</div>\r\n");
            out.write("\t</div>\r\n");
            out.write("\r\n");
            out.write("\t<script src=\"./resource/js/bootstrap-js/jquery/jquery-3.4.1.min.js\"></script>\r\n");
            out.write("\t<script src=\"./resource/js/bootstrap-js/jquery/popper.min.js\"></script>\r\n");
            out.write("\t<script src=\"./resource/js/bootstrap-js/bootstrap.min.js\"></script>\r\n");
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
          return;
        }
        _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
        _jspx_th_html_005fhtml_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fhtml_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fhtml_005f0_reused);
      }
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_logic_005fempty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f0 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
    boolean _jspx_th_logic_005fempty_005f0_reused = false;
    try {
      _jspx_th_logic_005fempty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fempty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(50,3) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fempty_005f0.setProperty("frmDailyRecordList");
      // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(50,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fempty_005f0.setName("DoctorFormBean");
      int _jspx_eval_logic_005fempty_005f0 = _jspx_th_logic_005fempty_005f0.doStartTag();
      if (_jspx_eval_logic_005fempty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class=\"alert alert-primary alert-dismissible fade show\">\r\n");
          out.write("\t\t\t\t\t\t\t<strong>No medical record yet.</strong>\r\n");
          out.write("\t\t\t\t\t\t\t<!-- <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button> -->\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fempty_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fempty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005flogic_005fempty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
      _jspx_th_logic_005fempty_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_logic_005fempty_005f0, _jsp_getInstanceManager(), _jspx_th_logic_005fempty_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    boolean _jspx_th_bean_005fwrite_005f0_reused = false;
    try {
      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(64,85) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fwrite_005f0.setName("dailyRecord");
      // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(64,85) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fwrite_005f0.setProperty("id");
      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      _jspx_th_bean_005fwrite_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_bean_005fwrite_005f0, _jsp_getInstanceManager(), _jspx_th_bean_005fwrite_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    boolean _jspx_th_bean_005fwrite_005f1_reused = false;
    try {
      _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
      // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(66,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fwrite_005f1.setName("dailyRecord");
      // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(66,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fwrite_005f1.setProperty("attemptDate");
      // /WEB-INF/jsp/DoctorSubsystem/MedicalRecordListPage.jsp(66,9) name = format type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_bean_005fwrite_005f1.setFormat("MM-dd-YYYY");
      int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
      if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      _jspx_th_bean_005fwrite_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_bean_005fwrite_005f1, _jsp_getInstanceManager(), _jspx_th_bean_005fwrite_005f1_reused);
    }
    return false;
  }
}
