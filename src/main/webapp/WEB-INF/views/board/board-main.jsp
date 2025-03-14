<%--
  Created by IntelliJ IDEA.
  User: bitcamp
  Date: 2024-07-24
  Time: 오전 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="javatime" uri="http://sargue.net/jsptags/time" %>

<html>
<head>
    <c:choose>
        <c:when test="${tab eq 1}">
            <title>플랜트랩: 정보게시판</title>
        </c:when>
        <c:when test="${tab eq 2}">
            <title>플랜트랩: 잡담게시판</title>
        </c:when>
        <c:when test="${tab eq 3}">
            <title>플랜트랩: 질문게시판</title>
        </c:when>
    </c:choose>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/board-main.css">
</head>
<body>
    <jsp:include page="${pageContext.request.contextPath}/nav.jsp"/>
    <header id="header">
        <c:choose>
            <c:when test="${tab eq 1}">
                <img src="${pageContext.request.contextPath}/static/images/header_정보.png" alt="정보게시판 헤더">
            </c:when>
            <c:when test="${tab eq 2}">
                <img src="${pageContext.request.contextPath}/static/images/header_잡담.png" alt="잡담게시판 헤더">
            </c:when>
            <c:when test="${tab eq 3}">
                <img src="${pageContext.request.contextPath}/static/images/header_질문.png" alt="질문게시판 헤더">
            </c:when>
        </c:choose>
    </header>
    <main>
        <!--게시판 이동 탭-->
        <div class="board_button_area">
            <ul>
                <li class="label_underline activeBlock">
                    <label for="info">
                        <input type="checkbox" id="info">
                        <span>정보공유</span>
                    </label>
                </li>
                <li class="label_underline">
                    <label for="free">
                        <input type="checkbox" id="free">
                        <span>잡담</span>
                    </label>
                </li>
                <li class="label_underline">
                    <label for="QnA">
                        <input type="checkbox" id="QnA">
                        <span>Q&A</span>
                    </label>
                </li>
                <li class="label_underline">
                    <label for="greenTalk">
                        <input type="checkbox" id="greenTalk">
                        <span>그린톡</span>
                    </label>
                </li>
            </ul>
        </div>
        <jsp:include page="/WEB-INF/views/board/board-list.jsp"/>
    </main>
    <jsp:include page="${pageContext.request.contextPath}/chatbot.jsp"/>
    <jsp:include page="${pageContext.request.contextPath}/footer.jsp"/>
    <script>

        const changeTab = (tab) => {
            // 탭 눌렀을 때 색상 변경
            for(let i = 0; i < 3; i++){
                if(i === tab - 1){
                    underline[i].classList.add("activeBlock");
                } else {
                    underline[i].classList.remove("activeBlock");
                }
            }
        }

        const header = document.getElementById("header");
        const underline = document.getElementsByClassName("label_underline");
        const tabContent = document.getElementsByClassName("tabContent");

        const info_button = document.querySelector("#info");
        const free_button = document.querySelector("#free");
        const QnA_button = document.querySelector("#QnA");
        const greenTalk_button = document.querySelector("#greenTalk");

        changeTab(${tab});

        info_button.addEventListener("click", () => {
            underline[0].classList.add("activeBlock");
            window.location.href = "/board/board-main.do?tab=1";
        });

        free_button.addEventListener("click", () => {
            underline[1].classList.add("activeBlock");
            window.location.href = "/board/board-main.do?tab=2";
        });

        QnA_button.addEventListener("click", () => {
            underline[2].classList.add("activeBlock");
            window.location.href = "/board/board-main.do?tab=3";
        });

        greenTalk_button.addEventListener("click", () => {
            underline[3].classList.add("activeBlock");
            window.location.href = "/board/greentalk.do";
        });

    </script>
</body>
</html>
