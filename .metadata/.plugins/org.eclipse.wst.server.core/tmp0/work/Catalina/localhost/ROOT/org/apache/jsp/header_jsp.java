/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2024-02-26 08:52:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1702828562000L));
    _jspx_dependants.put("jar:file:/C:/petshop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/semiproject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/C:/petshop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/semiproject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/css/header.css\">\n");
      out.write("<header>\n");
      out.write("	<div id=container>\n");
      out.write("		<div id=\"top\">\n");
      out.write("			<div class=\"top-top\">\n");
      out.write("				<div class=\"tt-box\">\n");
      out.write("					<div class=\"mini-shortcut\">\n");
      out.write("						<!-- 상단 좌측 링크 아이콘 -->\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<div class=\"top-top-menu\">\n");
      out.write("						<!-- 상단 미니메뉴 -->\n");
      out.write("						");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"top-mid\">\n");
      out.write("				<!-- 메인 로고, 사진 -->\n");
      out.write("				<a href=\"/main.jsp\"> <img class=\"logo-pic\"\n");
      out.write("					src=\"../resources/img/logo/01_logo2.2.jpg\" alt=\"\">\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div id=\"top-btm\">\n");
      out.write("				<!-- 사이트 내 각종 메뉴 모음 -->\n");
      out.write("				<nav class=\"top-btm-menu\">\n");
      out.write("					<ul class=\"tbm-list\">\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/productlist.do\"><i\n");
      out.write("								class=\"fa-solid fa-bars\"></i>전체 메뉴</a>\n");
      out.write("							<ul class=\"sub_all_menu\">\n");
      out.write("								<ul>\n");
      out.write("									<a href=\"/categorylist.do?category=강아지 먹거리\">강아지 먹거리</a>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 사료\">사료</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 간식\">간식</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 영양제\">영양제</a></li>\n");
      out.write("								</ul>\n");
      out.write("								<ul>\n");
      out.write("									<a href=\"/categorylist.do?category=강아지 용품\">강아지 용품</a>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 집\">강아지 집</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 옷\">강아지 옷</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 장난감\">강아지 장난감</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 밥그릇\">강아지 밥그릇</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=강아지 산책용품\">강아지 산책용품</a></li>\n");
      out.write("								</ul>\n");
      out.write("								<ul>\n");
      out.write("									<a href=\"/categorylist.do?category=고양이 먹거리\">고양이 먹거리</a>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 사료\">사료</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 간식\">간식</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 영양제\">영양제</a></li>\n");
      out.write("								</ul>\n");
      out.write("								<ul>\n");
      out.write("									<a href=\"/categorylist.do?category=고양이 용품\">고양이 용품</a>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 집\">고양이 집</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 옷\">고양이 옷</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 장난감\">고양이 장난감</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 밥그릇\">고양이 밥그릇</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=고양이 방콕용품\">고양이 방콕용품</a></li>\n");
      out.write("								</ul>\n");
      out.write("								<ul>\n");
      out.write("									<a href=\"/categorylist.do?category=햄스터 먹거리\">햄스터 먹거리</a>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 사료\">사료</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 간식\">간식</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 영양제\">영양제</a></li>\n");
      out.write("								</ul>\n");
      out.write("								<ul>\n");
      out.write("									<a href=\"/categorylist.do?category=햄스터 용품\">햄스터 용품</a>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 집\">햄스터 집</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 장난감\">햄스터 장난감</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 밥그릇\">햄스터 밥그릇</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 챗바퀴\">햄스터 챗바퀴</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=햄스터 이갈이\">햄스터 이갈이</a></li>\n");
      out.write("								</ul>\n");
      out.write("								<ul>\n");
      out.write("									<a href=\"/categorylist.do?category=이벤트 상품\">이벤트 상품</a>\n");
      out.write("									<li><a href=\"/categorylist.do?category=기간 할인 상품\">기간 할인 상품</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=신상품 할인 이벤트\">신상품 할인 이벤트</a></li>\n");
      out.write("									<li><a href=\"/categorylist.do?category=시즌 한정 상품\">시즌 한정 상품</a></li>\n");
      out.write("								</ul>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/categorylist.do?category=강아지 먹거리\">강아지 먹거리</a>\n");
      out.write("							<ul class=\"sub_menu\">\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 사료\">사료</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 간식\">간식</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 영양제\">영양제</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/categorylist.do?category=강아지 용품\">강아지 용품</a>\n");
      out.write("							<ul class=\"sub_menu\">\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 집\">강아지 집</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 옷\">강아지 옷</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 장난감\">강아지 장난감</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 밥그릇\">강아지 밥그릇</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=강아지 산책용품\">강아지 산책용품</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/categorylist.do?category=고양이 먹거리\">고양이 먹거리</a>\n");
      out.write("							<ul class=\"sub_menu\">\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 사료\">사료</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 간식\">간식</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 영양제\">영양제</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/categorylist.do?category=고양이 용품\">고양이 용품</a>\n");
      out.write("							<ul class=\"sub_menu\">\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 집\">고양이 집</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 옷\">고양이 옷</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 장난감\">고양이 장난감</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 밥그릇\">고양이 밥그릇</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=고양이 방콕용품\">고양이 방콕용품</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/categorylist.do?category=햄스터 먹거리\">햄스터 먹거리</a>\n");
      out.write("							<ul class=\"sub_menu\">\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 사료\">사료</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 간식\">간식</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 영양제\">영양제</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/categorylist.do?category=햄스터 용품\">햄스터 용품</a>\n");
      out.write("							<ul class=\"sub_menu\">\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 집\">햄스터 집</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 장난감\">햄스터 장난감</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 밥그릇\">햄스터 밥그릇</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 챗바퀴\">햄스터 챗바퀴</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=햄스터 이갈이\">햄스터 이갈이</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"tbm-list-li\"><a href=\"/categorylist.do?category=이벤트 상품\">이벤트 상품</a>\n");
      out.write("							<ul class=\"sub_menu\">\n");
      out.write("								<li><a href=\"/categorylist.do?category=기간 할인 상품\">기간 할인 상품</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=신상품 할인 이벤트\">신상품 할인 이벤트</a></li>\n");
      out.write("								<li><a href=\"/categorylist.do?category=시즌 한정 상품\">시즌 한정 상품</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("					</ul>\n");
      out.write("				</nav>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</header>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("							");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("							");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /header.jsp(19,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionId }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("								<ul class=\"ttm-list\">\n");
          out.write("									<li><a href=\"/joinform.do\">JOIN</a></li>\n");
          out.write("									<li><a href=\"/loginform.do\">LOG-IN</a></li>\n");
          out.write("									<li><a href=\"/memberview.do\">MY-PAGE</a></li>\n");
          out.write("									<li><a href=\"/basket.do\">BASKET</a></li>\n");
          out.write("									<li><a href=\"/purchasehistory.do\">ORDER-INQUIRY</a></li>\n");
          out.write("									<li><a href=\"/boardlist.do\">BOARD</a></li>\n");
          out.write("									<li><input type=\"text\" id=\"search\"> 🔍</li>\n");
          out.write("									<!-- 상단 검색창 -->\n");
          out.write("								</ul>\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("								<ul class=\"ttm-list\">\n");
          out.write("									<li><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("									<li><a href=\"/logout.do\">LOG-OUT</a></li>\n");
          out.write("									<li><a href=\"/memberview.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">MY-PAGE</a></li>\n");
          out.write("									<li><a href=\"/basket.do\">BASKET</a></li>\n");
          out.write("									<li><a href=\"/purchasehistory.do\">ORDER-INQUIRY</a></li>\n");
          out.write("									<li><a href=\"/boardlist.do\">BOARD</a></li>\n");
          out.write("									<li><input type=\"text\" id=\"search\"> 🔍</li>\n");
          out.write("									<!-- 상단 검색창 -->\n");
          out.write("								</ul>\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
