/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-07-26 06:24:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class join_005f01_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>플랜트랩: 회원가입</title>\r\n");
      out.write("    <link rel=\"icon\" type=\"img/png\" href=\"/static/images/round_logo_whiteBack.svg\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/join_01.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"join-container\">\r\n");
      out.write("            <h2 id=\"join-explain\">회원가입을 위해<br>정보를 입력해주세요.</h2>\r\n");
      out.write("            <form id=\"join-form\" action=\"/member/join.do\" method=\"post\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"custom-input\">\r\n");
      out.write("                        <input type=\"text\" id=\"veri_btn\" name=\"loginId\" placeholder=\"아이디\" required>\r\n");
      out.write("                        <button type=\"button\" onclick=\"checkDuplicate()\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <small id=\"check-message\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"nickname\"></label>\r\n");
      out.write("                    <input type=\"text\" id=\"nickname\" name=\"memNickname\" placeholder=\"닉네임\" required>\r\n");
      out.write("                    <small id=\"check-message1\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"password\"></label>\r\n");
      out.write("                    <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"비밀번호\"required>\r\n");
      out.write("                    <small id=\"check-message2\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"confirmPassword\"></label>\r\n");
      out.write("                    <input type=\"password\" id=\"confirmPassword\" name=\"confirmPassword\" placeholder=\"비밀번호 확인\" required>\r\n");
      out.write("                    <small id=\"check-message3\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"userName\"></label>\r\n");
      out.write("                    <input type=\"text\" id=\"userName\" name=\"memName\" placeholder=\"이름\" required>\r\n");
      out.write("                    <small id=\"check-message4\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"custom-input2\">\r\n");
      out.write("                        <input type=\"email\" id=\"veri_btn\" name=\"email\" placeholder=\"이메일\" required>\r\n");
      out.write("                        <button type=\"button\" onclick=\"checkDuplicate()\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <small id=\"check-message5\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"custom-input3\">\r\n");
      out.write("                        <input type=\"text\" id=\"veri_btn\" name=\"memTel\" placeholder=\"인증번호\" required>\r\n");
      out.write("                        <button type=\"button\" onclick=\"checkDuplicate()\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <small id=\"check-message6\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"custom-input4\">\r\n");
      out.write("                        <input type=\"text\" id=\"veri_btn2\" name=\"postNum\" placeholder=\"우편번호\" required>\r\n");
      out.write("                        <button type=\"button\" onclick=\"checkDuplicate()\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <small id=\"check-message7\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"addr\"></label>\r\n");
      out.write("                    <input type=\"text\" id=\"addr\" name=\"address\" placeholder=\"주소\" required>\r\n");
      out.write("                    <small id=\"check-message8\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"addr_detail\"></label>\r\n");
      out.write("                    <input type=\"text\" id=\"addr_detail\" name=\"addr_detail\" placeholder=\"상세 주소\" required>\r\n");
      out.write("                    <small id=\"check-message9\"></small>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" class=\"submit-btn\" onclick=\"joinComplete()\">가입하기</button> <!--백연결시 type=\"submit\"으로 변경 필요-->\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("    const userId = document.querySelector(\"input[name='userId']\");\r\n");
      out.write("    const userNickname = document.querySelector(\"input[name='nickname']\");\r\n");
      out.write("    const checkMessage = document.querySelector(\"#check-message\");\r\n");
      out.write("    const checkMessage1 = document.querySelector(\"#check-message1\");\r\n");
      out.write("    const checkMessage2 = document.querySelector(\"#check-message2\");\r\n");
      out.write("    const checkMessage3 = document.querySelector(\"#check-message3\");\r\n");
      out.write("    const checkMessage4 = document.querySelector(\"#check-message4\");\r\n");
      out.write("    const checkMessage5 = document.querySelector(\"#check-message5\");\r\n");
      out.write("    const checkMessage6 = document.querySelector(\"#check-message6\");\r\n");
      out.write("    const checkMessage7 = document.querySelector(\"#check-message7\");\r\n");
      out.write("    const checkMessage8 = document.querySelector(\"#check-message8\");\r\n");
      out.write("    const checkMessage9 = document.querySelector(\"#check-message9\");\r\n");
      out.write("    const userPassword = document.querySelector(\"input[name='password']\");\r\n");
      out.write("    const confirmPassword = document.querySelector(\"input[name='confirmPassword']\");\r\n");
      out.write("    const addr = document.querySelector(\"input[name='addr']\");\r\n");
      out.write("    const addr_detail = document.querySelector(\"input[name='addr_detail']\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 회원정보\r\n");
      out.write("    let id = '0';\r\n");
      out.write("    let nickname, password;\r\n");
      out.write("\r\n");
      out.write("    //아이디 입력받을 조건\r\n");
      out.write("    userId.addEventListener(\"change\", (e) => {\r\n");
      out.write("        if (e.target.value.length < 8 || e.target.value.length > 21) {\r\n");
      out.write("            checkMessage.textContent = \"아이디는 8자리이상 20자이하로 지정해주세요.\";\r\n");
      out.write("            checkMessage.style.color = \"red\"; // 텍스트 색상을 빨간색으로 설정\r\n");
      out.write("            userId.focus();\r\n");
      out.write("        } else {\r\n");
      out.write("            //바로 없어지게 가능한지??\r\n");
      out.write("            checkMessage.textContent = \"\";\r\n");
      out.write("            id = e.target.value;\r\n");
      out.write("            // checkMessage.textContent =\"사용 가능한 아이디입니다.\";\r\n");
      out.write("            // checkMessage.style.color = \"#23C961\"; // 텍스트 색상을 초록색으로 설정\r\n");
      out.write("            // userIdValidation = true;\r\n");
      out.write("            // userId.focus();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 아이디 중복체크\r\n");
      out.write("    let userIdCheck = false;\r\n");
      out.write("    function checkDuplicate(){\r\n");
      out.write("\r\n");
      out.write("        if(id === '0'){\r\n");
      out.write("            checkMessage.textContent = \"아이디를 입력하세요.\";\r\n");
      out.write("            checkMessage.style.color = \"red\";\r\n");
      out.write("            userId.focus();\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        // 로컬스토리지가 비어있는 경우\r\n");
      out.write("        if(localStorage.length === 0) {\r\n");
      out.write("            checkMessage.textContent =\"사용 가능한 아이디입니다.\";\r\n");
      out.write("            checkMessage.style.color = \"#23C961\";\r\n");
      out.write("            userIdCheck = true;\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 안비어있는 경우(값 중복 체크가 필요함.)\r\n");
      out.write("        for(let i = 1; i <= localStorage.length; i++){\r\n");
      out.write("            if(JSON.parse(localStorage.getItem(i)).id == id){\r\n");
      out.write("                checkMessage.textContent = \"중복된 아이디입니다.\";\r\n");
      out.write("                checkMessage.style.color = \"red\";\r\n");
      out.write("                userId.focus();\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        checkMessage.textContent =\"사용 가능한 아이디입니다.\";\r\n");
      out.write("        checkMessage.style.color = \"#23C961\";\r\n");
      out.write("        userIdCheck = true;\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 닉네임 중복체크\r\n");
      out.write("    let userNicknameCheck = false;\r\n");
      out.write("    function checkNickname(){\r\n");
      out.write("        // 로컬스토리지가 비어있는 경우\r\n");
      out.write("        if(localStorage.length === 0) {\r\n");
      out.write("            checkMessage1.textContent =\"사용 가능한 닉네임입니다.\";\r\n");
      out.write("            checkMessage1.style.color = \"#23C961\";\r\n");
      out.write("            userNicknameCheck = true;\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 안비어있는 경우(값 중복 체크가 필요함.)\r\n");
      out.write("        for(let i = 1; i <= localStorage.length; i++){\r\n");
      out.write("            if(JSON.parse(localStorage.getItem(i)).nickname == nickname){\r\n");
      out.write("                checkMessage1.textContent = \"중복된 닉네임입니다.\";\r\n");
      out.write("                checkMessage1.style.color = \"red\";\r\n");
      out.write("                userNickname.focus();\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        checkMessage1.textContent =\"사용 가능한 닉네임입니다.\";\r\n");
      out.write("        checkMessage1.style.color = \"#23C961\";\r\n");
      out.write("        userNicknameCheck = true;\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //닉네임 입력받을 조건\r\n");
      out.write("    userNickname.addEventListener(\"change\", (e) => {\r\n");
      out.write("        if (e.target.value.length > 8) {\r\n");
      out.write("            checkMessage1.textContent = \"닉네임은 8자이하로 지정해주세요.\";\r\n");
      out.write("            checkMessage1.style.color = \"red\"; // 텍스트 색상을 빨간색으로 설정\r\n");
      out.write("            userNickname.focus();\r\n");
      out.write("        } else {\r\n");
      out.write("            nickname = e.target.value;\r\n");
      out.write("            checkNickname();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 패스워드 입력\r\n");
      out.write("    let passwordValidation = false;\r\n");
      out.write("    userPassword.addEventListener(\"change\", (e) => {\r\n");
      out.write("        // e.target.style.background = \"#fff\";\r\n");
      out.write("        let reg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^&*+=-])(?=.*[0-9]).{8,15}$/;\r\n");
      out.write("\r\n");
      out.write("        if(!reg.test(e.target.value)) {\r\n");
      out.write("            checkMessage2.textContent = \"비밀번호는 영문 숫자 특수기호 포함 8자리 이상으로지정해주세요.\";\r\n");
      out.write("            checkMessage2.style.color = \"red\"; // 텍스트 색상을 빨간색으로 설정\r\n");
      out.write("            userPassword.focus();//다시 입력 칸에 포커스\r\n");
      out.write("        } else{\r\n");
      out.write("            checkMessage2.textContent = \"\";\r\n");
      out.write("            password = e.target.value;\r\n");
      out.write("            passwordValidation = true;\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 패스워드 입력확인\r\n");
      out.write("    let passwordConfirmValidation = false;\r\n");
      out.write("    confirmPassword.addEventListener(\"change\", (e) => {\r\n");
      out.write("        if (e.target.value !== password) {\r\n");
      out.write("            checkMessage3.textContent = \"입력한 비밀번호와 다릅니다.\";\r\n");
      out.write("            checkMessage3.style.color = \"red\"; // 텍스트 색상을 빨간색으로 설정\r\n");
      out.write("            password.focus();//다시 입력 칸에 포커스\r\n");
      out.write("        } else{\r\n");
      out.write("            checkMessage3.textContent=\"\";\r\n");
      out.write("            passwordConfirmValidation = true;\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    //이름 입력 확인\r\n");
      out.write("    let userNameInput = '';\r\n");
      out.write("    userName.addEventListener(\"change\", (e) => {\r\n");
      out.write("        if (e.target.value.length === 0) {\r\n");
      out.write("            checkMessage4.textContent = \"이름을 입력하세요.\";\r\n");
      out.write("            checkMessage4.style.color = \"red\";\r\n");
      out.write("            userName.focus();\r\n");
      out.write("        } else {\r\n");
      out.write("            checkMessage4.textContent = \"\";\r\n");
      out.write("            userNameInput = e.target.value;\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    //휴대폰번호 입력 확인\r\n");
      out.write("\r\n");
      out.write("    //인증번호\r\n");
      out.write("\r\n");
      out.write("    //우편번호\r\n");
      out.write("\r\n");
      out.write("    //주소입력확인\r\n");
      out.write("    let addrInput = '';\r\n");
      out.write("    addr.addEventListener(\"change\", (e) => {\r\n");
      out.write("        if (e.target.value.length === 0) {\r\n");
      out.write("            checkMessage8.textContent = \"주소를 입력하세요.\";\r\n");
      out.write("            checkMessage8.style.color = \"red\";\r\n");
      out.write("            userName.focus();\r\n");
      out.write("        } else {\r\n");
      out.write("            checkMessage8.textContent = \"\";\r\n");
      out.write("            userNameInput = e.target.value;\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //상세주소 입력확인\r\n");
      out.write("    let addr_detailInput = '';\r\n");
      out.write("    addr_detail.addEventListener(\"change\", (e) => {\r\n");
      out.write("        if (e.target.value.length === 0) {\r\n");
      out.write("            checkMessage9.textContent = \"상세주소를 입력하세요.\";\r\n");
      out.write("            checkMessage9.style.color = \"red\";\r\n");
      out.write("            userName.focus();\r\n");
      out.write("        } else {\r\n");
      out.write("            checkMessage9.textContent = \"\";\r\n");
      out.write("            userNameInput = e.target.value;\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // 가입하기 버튼 클릭\r\n");
      out.write("    function joinComplete(){\r\n");
      out.write("        if(!userIdCheck) {\r\n");
      out.write("            alert(\"아이디를 입력해주세요.\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(!userNicknameCheck) {\r\n");
      out.write("            alert(\"닉네임을 입력해주세요.\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(!(passwordValidation && passwordConfirmValidation)) {\r\n");
      out.write("            alert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(userNameInput === '') {\r\n");
      out.write("            alert(\"이름을 입력해주세요.\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(addrInput === '') {\r\n");
      out.write("            alert(\"주소를 입력해주세요.\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if(addr_detailInput === '') {\r\n");
      out.write("            alert(\"상세주소를 입력해주세요.\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        if(userIdCheck && userNicknameCheck && passwordValidation && passwordConfirmValidation) {\r\n");
      out.write("            localStorage.setItem(localStorage.length + 1, JSON.stringify({id, nickname, password}));\r\n");
      out.write("            window.location.href = \"_02_join02.html\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
}
